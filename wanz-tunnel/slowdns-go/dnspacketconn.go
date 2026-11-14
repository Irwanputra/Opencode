// Paket slowdns — DNSPacketConn diadaptasi dari dnstt-client/dns.go
// (https://www.bamsoftware.com/git/dnstt.git, CC0) dengan penyesuaian ala
// SlowDNS HTTP Custom:
//
//   - QTYPE query bisa NULL(10), TXT(16), CNAME(5), MX(15), NS(2), SRV(33),
//     atau AUTO (kalibrasi: pilih tipe yang lolos resolver).
//   - Jawaban downstream diterima dari semua tipe record tersebut.
//   - Log diarahkan ke callback pemakai, bukan log standar.
package slowdns

import (
	"bytes"
	"crypto/rand"
	"encoding/base32"
	"encoding/binary"
	"errors"
	"fmt"
	"io"
	"net"
	"strings"
	"sync"
	"time"

	"wanz/slowdns/internal/dns"
	"wanz/slowdns/internal/turbotunnel"
)

const (
	// Jumlah byte padding acak dalam query data.
	numPadding = 3
	// Padding ekstra untuk query polling kosong. Tidak boleh lebih dari 31
	// karena kode prefiks padding dimulai dari 224.
	numPaddingForPoll = 8

	// Jadwal poll otomatis ketika tidak ada data yang dikirim.
	initPollDelay       = 500 * time.Millisecond
	maxPollDelay        = 10 * time.Second
	pollDelayMultiplier = 2.0

	// Batas burst query poll kosong akibat penerimaan data.
	pollLimit = 16

	// QTYPE tambahan di luar dns.RRTypeTXT (16) yang dipakai SlowDNS.
	rrTypeNS    uint16 = 2  // RFC 1035
	rrTypeCNAME uint16 = 5  // RFC 1035
	rrTypeNULL  uint16 = 10 // RFC 1035 (usang, tapi justru "licin" di resolver)
	rrTypeMX    uint16 = 15 // RFC 1035
	rrTypeSRV   uint16 = 33 // RFC 2782
)

// autoCandidates urutan tipe yang dicoba saat mode AUTO. NULL didahulukan
// karena paling tahan terhadap cache/rewrite resolver — sama seperti pilihan
// "tipe NULL" di HTTP Custom.
var autoCandidates = []uint16{rrTypeNULL, dns.RRTypeTXT, rrTypeCNAME, rrTypeMX, rrTypeNS, rrTypeSRV}

// typeName untuk log.
func typeName(qt uint16) string {
	switch qt {
	case rrTypeNULL:
		return "NULL"
	case dns.RRTypeTXT:
		return "TXT"
	case rrTypeCNAME:
		return "CNAME"
	case rrTypeMX:
		return "MX"
	case rrTypeNS:
		return "NS"
	case rrTypeSRV:
		return "SRV"
	}
	return fmt.Sprintf("TYPE%d", qt)
}

// base32Encoding tanpa padding, huruf kecil, sesuai dnstt.
var base32Encoding = base32.StdEncoding.WithPadding(base32.NoPadding)

// DNSPacketConn menyediakan antarmuka net.PacketConn di atas query DNS.
// Paket dikodekan sebagai QNAME base32 (ClientID + padding + data) dan
// diterima kembali melalui RDATA record TXT/NULL/CNAME/MX/NS/SRV.
type DNSPacketConn struct {
	clientID turbotunnel.ClientID
	domain   dns.Name
	// qtype: tipe record untuk query upstream.
	qtype uint16
	// ednsLimit: ukuran payload UDP maksimum di OPT record (0 = 4096).
	ednsLimit int
	logf      func(format string, args ...interface{})
	// pollChan mengizinkan sendLoop mengirim query polling kosong.
	pollChan chan struct{}
	// done ditutup oleh Close untuk menghentikan loop kirim/terima.
	done      chan struct{}
	closeOnce sync.Once
	// QueuePacketConn penerima langsung ReadFrom/WriteTo.
	*turbotunnel.QueuePacketConn
}

// Close menghentikan loop kirim/terima. Aman dipanggil berkali-kali.
func (c *DNSPacketConn) Close() error {
	c.closeOnce.Do(func() { close(c.done) })
	return nil
}

// NewDNSPacketConn membuat DNSPacketConn. transport mengirim/menerima pesan
// DNS mentah (mis. *net.UDPConn). qtype dipakai untuk semua query upstream.
func NewDNSPacketConn(
	transport net.PacketConn,
	addr net.Addr,
	domain dns.Name,
	qtype uint16,
	ednsLimit int,
	logf func(format string, args ...interface{}),
) *DNSPacketConn {
	if logf == nil {
		logf = func(string, ...interface{}) {}
	}
	clientID := turbotunnel.NewClientID()
	c := &DNSPacketConn{
		clientID:        clientID,
		domain:          domain,
		qtype:           qtype,
		ednsLimit:       ednsLimit,
		logf:            logf,
		pollChan:        make(chan struct{}, pollLimit),
		done:            make(chan struct{}),
		QueuePacketConn: turbotunnel.NewQueuePacketConn(clientID, 0),
	}
	go func() {
		err := c.recvLoop(transport)
		// Socket tertutup adalah akhir yang normal saat tunnel di-Stop.
		if err != nil && !errors.Is(err, net.ErrClosed) {
			c.logf("SlowDNS recvLoop berhenti: %v", err)
		}
	}()
	go func() {
		err := c.sendLoop(transport, addr)
		if err != nil && !errors.Is(err, net.ErrClosed) {
			c.logf("SlowDNS sendLoop berhenti: %v", err)
		}
	}()
	return c
}

// buildQuery menyusun pesan query DNS dari satu paket (p kosong = polling).
// Isi QNAME sebelum base32: ClientID(8) ‖ 0xE0+n ‖ n byte acak ‖ [len ‖ data].
func buildQuery(clientID turbotunnel.ClientID, domain dns.Name, qtype uint16, p []byte, ednsLimit int) ([]byte, error) {
	if len(p) >= 224 {
		return nil, fmt.Errorf("paket terlalu panjang")
	}
	if ednsLimit <= 0 {
		ednsLimit = 4096
	}
	if ednsLimit < 512 {
		ednsLimit = 512
	}
	if ednsLimit > 4096 {
		ednsLimit = 4096
	}
	var buf bytes.Buffer
	// ClientID
	buf.Write(clientID[:])
	n := numPadding
	if len(p) == 0 {
		n = numPaddingForPoll
	}
	// Padding / peredam cache
	buf.WriteByte(byte(224 + n))
	io.CopyN(&buf, rand.Reader, int64(n))
	// Isi paket
	if len(p) > 0 {
		buf.WriteByte(byte(len(p)))
		buf.Write(p)
	}
	decoded := buf.Bytes()

	encoded := make([]byte, base32Encoding.EncodedLen(len(decoded)))
	base32Encoding.Encode(encoded, decoded)
	encoded = bytes.ToLower(encoded)
	labels := chunks(encoded, 63)
	labels = append(labels, domain...)
	name, err := dns.NewName(labels)
	if err != nil {
		return nil, err
	}

	var id uint16
	binary.Read(rand.Reader, binary.BigEndian, &id)
	query := &dns.Message{
		ID:    id,
		Flags: 0x0100, // QR = 0, RD = 1
		Question: []dns.Question{
			{
				Name:  name,
				Type:  qtype,
				Class: dns.ClassIN,
			},
		},
		// EDNS(0)
		Additional: []dns.RR{
			{
				Name:  dns.Name{},
				Type:  dns.RRTypeOPT,
				Class: uint16(ednsLimit), // ukuran payload UDP peminta
				TTL:   0,
				Data:  []byte{},
			},
		},
	}
	return query.WireFormat()
}

// parsePackets memecah payload menjadi paket ber-prefiks panjang 2 byte
// (big-endian) — format downstream dnstt/SlowDNS.
func parsePackets(payload []byte) [][]byte {
	var out [][]byte
	r := bytes.NewReader(payload)
	for {
		var n uint16
		err := binary.Read(r, binary.BigEndian, &n)
		if err != nil {
			break
		}
		p := make([]byte, n)
		_, err = io.ReadFull(r, p)
		if err != nil {
			break
		}
		out = append(out, p)
	}
	return out
}

// nameLabels membaca nama DNS tak-terkompresi dari RDATA. Pointer kompresi
// tidak didukung (server dnstt/ePro menulis nama apa adanya).
func nameLabels(rdata []byte) ([][]byte, bool) {
	var labels [][]byte
	i := 0
	for i < len(rdata) {
		n := int(rdata[i])
		i++
		if n == 0 {
			return labels, true
		}
		if n&0xC0 != 0 {
			// Pointer kompresi (0xC0..) atau label reserved.
			return nil, false
		}
		if i+n > len(rdata) {
			return nil, false
		}
		labels = append(labels, rdata[i:i+n])
		i += n
	}
	return nil, false
}

// payloadFromName mengambil payload dari nama yang disisipkan di RDATA
// (mode CNAME/MX/NS/SRV): label base32 sebelum domain tunnel digabung,
// didekode base32, lalu dipecah menjadi paket.
func payloadFromName(rdata []byte, domain dns.Name) [][]byte {
	labels, ok := nameLabels(rdata)
	if !ok || len(labels) < len(domain) {
		return nil
	}
	tail := labels[len(labels)-len(domain):]
	for i := range tail {
		if !bytes.Equal(tail[i], domain[i]) {
			return nil
		}
	}
	var cat []byte
	for _, l := range labels[:len(labels)-len(domain)] {
		cat = append(cat, l...)
	}
	// Data label selalu ditulis huruf kecil di kawat (seperti QNAME dnstt);
	// dekoder base32 standar memakai huruf besar — sama seperti dnstt-server.
	decoded, err := base32Encoding.DecodeString(strings.ToUpper(string(cat)))
	if err != nil {
		return nil
	}
	return parsePackets(decoded)
}

// decodeAnswerPackets mengekstrak paket downstream dari satu record jawaban
// sesuai tipe RDATA-nya.
func decodeAnswerPackets(answer dns.RR, domain dns.Name, logf func(string, ...interface{})) [][]byte {
	switch answer.Type {
	case dns.RRTypeTXT:
		payload, err := dns.DecodeRDataTXT(answer.Data)
		if err != nil {
			logf("SlowDNS: RDATA TXT tidak valid: %v", err)
			return nil
		}
		return parsePackets(payload)
	case rrTypeNULL:
		// RDATA NULL adalah oktet mentah. Coba dulu sebagai rangkaian paket
		// ber-prefiks panjang; bila bentuknya tidak cocok, coba pengodean
		// TXT di dalam NULL (beberapa server tetap memakai character-string
		// walau tipenya NULL).
		ps := parsePackets(answer.Data)
		if len(ps) == 0 {
			if payload, err := dns.DecodeRDataTXT(answer.Data); err == nil {
				ps = parsePackets(payload)
			}
		}
		return ps
	case rrTypeCNAME, rrTypeNS:
		return payloadFromName(answer.Data, domain)
	case rrTypeMX:
		if len(answer.Data) > 2 {
			return payloadFromName(answer.Data[2:], domain)
		}
	case rrTypeSRV:
		if len(answer.Data) > 6 {
			return payloadFromName(answer.Data[6:], domain)
		}
	}
	return nil
}

// dnsResponsePackets memeriksa jawaban DNS lalu mengambil semua paket
// downstream dari setiap record yang cocok dengan domain tunnel.
func (c *DNSPacketConn) dnsResponsePackets(resp *dns.Message) [][]byte {
	if resp.Flags&0x8000 != 0x8000 {
		// QR != 1, bukan jawaban.
		return nil
	}
	if resp.Flags&0x000f != dns.RcodeNoError {
		// RCODE != NOERROR (mis. NXDOMAIN dari resolver yang salah).
		return nil
	}

	var packets [][]byte
	for _, answer := range resp.Answer {
		if _, ok := answer.Name.TrimSuffix(c.domain); !ok {
			// Bukan nama milik tunnel.
			continue
		}
		packets = append(packets, decodeAnswerPackets(answer, c.domain, c.logf)...)
	}
	return packets
}

// recvLoop menerima jawaban DNS, memecah paketnya, dan mengantrekannya untuk
// ReadFrom. Setiap jawaban berisi data mengizinkan satu poll segera.
func (c *DNSPacketConn) recvLoop(transport net.PacketConn) error {
	for {
		// Berhenti bersih saat tunnel ditutup.
		select {
		case <-c.done:
			return nil
		default:
		}
		var buf [4096]byte
		n, addr, err := transport.ReadFrom(buf[:])
		if err != nil {
			select {
			case <-c.done:
				return nil
			default:
			}
			return err
		}

		resp, err := dns.MessageFromWireFormat(buf[:n])
		if err != nil {
			c.logf("SlowDNS: MessageFromWireFormat: %v", err)
			continue
		}

		any := false
		for _, p := range c.dnsResponsePackets(&resp) {
			any = true
			c.QueuePacketConn.QueueIncoming(p, addr)
		}

		if any {
			select {
			case c.pollChan <- struct{}{}:
			default:
			}
		}
	}
}

// chunks memecah p menjadi subirisan <= n byte.
func chunks(p []byte, n int) [][]byte {
	var result [][]byte
	for len(p) > 0 {
		sz := len(p)
		if sz > n {
			sz = n
		}
		result = append(result, p[:sz])
		p = p[sz:]
	}
	return result
}

// send mengirim satu paket sebagai query DNS dengan QTYPE terpilih.
func (c *DNSPacketConn) send(transport net.PacketConn, p []byte, addr net.Addr) error {
	buf, err := buildQuery(c.clientID, c.domain, c.qtype, p, c.ednsLimit)
	if err != nil {
		return err
	}
	_, err = transport.WriteTo(buf, addr)
	return err
}

// sendLoop mengirim paket keluar dan melakukan polling berkala.
func (c *DNSPacketConn) sendLoop(transport net.PacketConn, addr net.Addr) error {
	pollDelay := initPollDelay
	pollTimer := time.NewTimer(pollDelay)
	for {
		var p []byte
		outgoing := c.QueuePacketConn.OutgoingQueue(addr)
		pollTimerExpired := false
		// Utamakan paket data; poll hanya bila tidak ada paket.
		select {
		case p = <-outgoing:
		case <-c.done:
			return nil
		default:
			select {
			case p = <-outgoing:
			case <-c.pollChan:
			case <-pollTimer.C:
				pollTimerExpired = true
			case <-c.done:
				return nil
			}
		}

		if len(p) > 0 {
			// Paket data menggantikan satu kesempatan poll.
			select {
			case <-c.pollChan:
			default:
			}
		}

		if pollTimerExpired {
			pollDelay = time.Duration(float64(pollDelay) * pollDelayMultiplier)
			if pollDelay > maxPollDelay {
				pollDelay = maxPollDelay
			}
		} else {
			if !pollTimer.Stop() {
				<-pollTimer.C
			}
			pollDelay = initPollDelay
		}
		pollTimer.Reset(pollDelay)

		// Satu paket per query — kapasitas query terbatas.
		err := c.send(transport, p, addr)
		if err != nil {
			// Setelah tunnel ditutup, jangan membanjiri log dengan
			// "use of closed network connection" berulang.
			select {
			case <-c.done:
				return nil
			default:
			}
			c.logf("SlowDNS send: %v", err)
			continue
		}
	}
}

// probeQType mengirim satu query polling kosong dengan tipe tertentu dan
// menunggu jawaban server tunnel. true = tipe ini lolos resolver + server.
func probeQType(resolver *net.UDPAddr, domain dns.Name, qtype uint16, timeout time.Duration) bool {
	sock, err := dialUDP(resolver)
	if err != nil {
		return false
	}
	defer sock.Close()
	clientID := turbotunnel.NewClientID()
	buf, err := buildQuery(clientID, domain, qtype, nil, 0)
	if err != nil {
		return false
	}
	if err := sock.SetDeadline(time.Now().Add(timeout)); err != nil {
		return false
	}
	if _, err := sock.Write(buf); err != nil {
		return false
	}
	var rsp [4096]byte
	for {
		n, err := sock.Read(rsp[:])
		if err != nil {
			return false
		}
		msg, err := dns.MessageFromWireFormat(rsp[:n])
		if err != nil {
			continue
		}
		if msg.Flags&0x8000 != 0x8000 {
			continue
		}
		if msg.Flags&0x000f != dns.RcodeNoError {
			// Resolver/server menolak tipe ini (FORMERR/REFUSED/SERVFAIL).
			return false
		}
		for _, a := range msg.Answer {
			if _, ok := a.Name.TrimSuffix(domain); ok && a.Type == qtype {
				return true
			}
		}
		// Jawaban belum cocok; baca lagi sampai deadline.
	}
}

// probeQTypeSpec menguji satu tipe lewat transport apa pun (UDP/DoH/DoT).
func probeQTypeSpec(spec resolverSpec, domain dns.Name, qtype uint16, timeout time.Duration) bool {
	if spec.kind == "udp" {
		raddr, err := net.ResolveUDPAddr("udp", spec.addr)
		if err != nil {
			return false
		}
		return probeQType(raddr, domain, qtype, timeout)
	}

	tr, err := openTransport(spec)
	if err != nil {
		return false
	}
	defer tr.Close()
	buf, err := buildQuery(turbotunnel.NewClientID(), domain, qtype, nil, 0)
	if err != nil {
		return false
	}
	if _, err := tr.WriteTo(buf, tr.addr); err != nil {
		return false
	}

	type result struct {
		rsp []byte
		ok  bool
	}
	ch := make(chan result, 1)
	go func() {
		var rsp [4096]byte
		n, _, err := tr.ReadFrom(rsp[:])
		if err != nil {
			ch <- result{}
			return
		}
		out := make([]byte, n)
		copy(out, rsp[:n])
		ch <- result{rsp: out, ok: true}
	}()
	select {
	case res := <-ch:
		if !res.ok {
			return false
		}
		msg, err := dns.MessageFromWireFormat(res.rsp)
		if err != nil || msg.Flags&0x8000 != 0x8000 || msg.Flags&0x000f != dns.RcodeNoError {
			return false
		}
		for _, a := range msg.Answer {
			if _, ok := a.Name.TrimSuffix(domain); ok && a.Type == qtype {
				return true
			}
		}
		return false
	case <-time.After(timeout):
		// Tutup transport supaya goroutine ReadFrom tidak menggantung.
		tr.Close()
		return false
	}
}

// calibrateQType mencoba tiap tipe record sampai ada yang lolos. Dipakai
// mode AUTO, meniru "Automatic calibration" SlowDNS HTTP Custom.
func calibrateQType(spec resolverSpec, domain dns.Name, timeout time.Duration, logf func(string, ...interface{})) uint16 {
	for _, qt := range autoCandidates {
		logf("SlowDNS: kalibrasi tipe %s…", typeName(qt))
		if probeQTypeSpec(spec, domain, qt, timeout) {
			return qt
		}
	}
	return rrTypeNULL
}
