// Package slowdns membungkus klien DNS-tunnel dnstt (CC0,
// https://www.bamsoftware.com/git/dnstt.git) menjadi pustaka Android via
// gomobile, meniru perilaku SlowDNS HTTP Custom termasuk varian "tipe NULL".
//
// Alur: TCP listener lokal → KCP (atas DNS PacketConn) → Noise_NK → smux v2
// → setiap stream diteruskan ke server lewat terowongan DNS. Aplikasi
// (mis. SSH) tinggal menyambung ke 127.0.0.1:<port>.
package slowdns

import (
	"errors"
	"fmt"
	"io"
	"net"
	"strings"
	"sync"
	"sync/atomic"
	"time"

	"github.com/xtaci/kcp-go/v5"
	"github.com/xtaci/smux"
	"wanz/slowdns/internal/dns"
	"wanz/slowdns/internal/noise"
	"wanz/slowdns/internal/turbotunnel"
)

// idleTimeout menutup sesi smux yang tidak aktif — sama dengan dnstt-client.
const idleTimeout = 2 * time.Minute

const (
	// queryOverhead adalah ruang QNAME yang dipakai header paket query:
	// clientID(8) + prefiks padding(1) + padding(3) + prefiks data(1).
	queryOverhead = 13
	// minPayloadBytes adalah payload efektif minimum agar KCP tetap layak.
	minPayloadBytes = 32
)

// Logger menerima baris log tunnel; diimplementasikan di sisi Java/Kotlin
// agar log muncul di tab LOG aplikasi.
type Logger interface {
	Log(msg string)
}

// sessionConn adalah satu "login" SlowDNS: transport resolver sendiri,
// DNSPacketConn (ClientID sendiri), KCP, Noise, dan sesi smux.
type sessionConn struct {
	transport net.PacketConn
	addr      net.Addr
	kcp       *kcp.UDPSession
	sess      *smux.Session
	pconn     *DNSPacketConn
	conv      uint32
}

type tunnel struct {
	mu       sync.Mutex
	ln       *net.TCPListener
	sessions []*sessionConn
	next     atomic.Uint32 // pemilihan sesi bergiliran (bonding)
	port     int
	ready    chan struct{}
	done     chan struct{}
	errOnce  sync.Once
	errMsg   atomic.Value // string
}

var (
	mu     sync.Mutex
	active *tunnel
	logger atomic.Value
)

func setLogger(l Logger) {
	if l != nil {
		logger.Store(l)
	}
}

func logf(format string, args ...interface{}) {
	if l, ok := logger.Load().(Logger); ok && l != nil {
		l.Log(fmt.Sprintf(format, args...))
	}
}

// parseTypeMode menerjemahkan nama tipe dari sisi Java ke tipe record DNS
// dan varian pengodeannya. Nama mengikuti HTTP Custom 8.1.5: AUTO, NULL,
// TXT, FT (Full TXT), ST (Short TXT), RX (HTTPS), VX (SVCB). Tipe lama
// CNAME/MX/NS/SRV tetap diterima agar profil lama tetap jalan. Mengembalikan
// qtype 0 untuk AUTO (kalibrasi).
func parseTypeMode(s string) (uint16, Mode, bool) {
	switch strings.ToUpper(strings.TrimSpace(s)) {
	case "AUTO":
		return 0, Mode{}, true
	case "", "NULL":
		return rrTypeNULL, Mode{}, true
	case "TXT":
		return dns.RRTypeTXT, Mode{}, true
	case "FT":
		return dns.RRTypeTXT, Mode{}, true
	case "ST":
		return dns.RRTypeTXT, Mode{ShortTXT: true}, true
	case "RX":
		return rrTypeHTTPS, Mode{}, true
	case "VX":
		return rrTypeSVCB, Mode{}, true
	case "CNAME":
		return rrTypeCNAME, Mode{}, true
	case "MX":
		return rrTypeMX, Mode{}, true
	case "NS":
		return rrTypeNS, Mode{}, true
	case "SRV":
		return rrTypeSRV, Mode{}, true
	}
	return 0, Mode{}, false
}

// displayType menampilkan pasangan tipe+mode seperti label HTTP Custom
// (mis. "FT Compact", "ST", "RX").
func displayType(qt uint16, m Mode) string {
	if m.ShortTXT {
		return "ST"
	}
	if m.Compact && qt == dns.RRTypeTXT {
		return "FT Compact"
	}
	return typeName(qt)
}

// AllowPrivateResolver membolehkan resolver dengan alamat privat/loopback.
// Hanya dipakai pengujian; pada aplikasi produksi resolver loopback tetap
// ditolak dan resolver privat diberi peringatan.
var AllowPrivateResolver = false

// checkPublicResolver menegakkan aturan resolver publik ala HTTP Custom
// 8.1.5 ("Use a public DNS resolver."). Loopback/link-local ditolak keras;
// rentang privat (CGNAT/ISP) hanya diberi peringatan karena sebagian
// jaringan seluler masih meloloskannya.
func checkPublicResolver(spec resolverSpec) error {
	if spec.kind != "udp" {
		return nil // DoH/DoT memakai nama domain — tidak relevan.
	}
	host := spec.addr
	if i := strings.LastIndex(host, ":"); i >= 0 {
		host = host[:i]
	}
	host = strings.Trim(host, "[]")
	ip := net.ParseIP(host)
	if ip == nil {
		return nil // Nama domain — biarkan resolver sistem menentukan.
	}
	if ip.IsLoopback() || ip.IsLinkLocalUnicast() || ip.IsLinkLocalMulticast() ||
		ip.IsUnspecified() || ip.IsMulticast() {
		return errors.New("Use a public DNS resolver.")
	}
	if ip.IsPrivate() {
		logf("SlowDNS: Use a public DNS resolver.")
	}
	return nil
}

// normalizeResolver menampilkan alamat resolver dalam bentuk host:port/URL.
func normalizeResolver(resolver string) string {
	spec, err := parseResolver(resolver)
	if err != nil {
		return strings.TrimSpace(resolver)
	}
	return spec.addr
}

// Start menjalankan tunnel SlowDNS dan membuka listener TCP lokal di
// 127.0.0.1:listenPort (listenPort 0 = port acak; lihat ListenPort).
//
// resolver : alamat DNS upstream — "8.8.8.8", "udp://1.1.1.1:53",
// "https://dns.google/dns-query" (DoH), atau "tls://1.1.1.1" (DoT).
// domain   : domain tunnel, mis. "t.example.com" (harus di-host dnstt-server).
// pubkeyHex: public key server (64 karakter hex) untuk Noise_NK.
// qtype    : AUTO | NULL | TXT | FT | ST | RX | VX (tipe lama CNAME/MX/NS/SRV
// masih diterima). ST menuntut server yang mendukung Short TXT.
// mode     : "" / "STANDARD" / "COMPACT" — COMPACT hanya untuk FT
// ("FT Compact": padding diperkecil, payload per query lebih besar).
// listenPort: port TCP lokal; 0 = pilih otomatis.
// kcpWindow: jendela KCP; 0 = default (64).
// qnameLimit: panjang maksimum nama DNS (0/default = 255).
// ednsLimit : ukuran payload UDP di OPT record (0/default = 4096).
// sessions  : jumlah sesi SlowDNS paralel (1–8); >1 hanya dipakai bila
// multiLogin aktif.
// multiLogin: true = tiap sesi memakai login/ClientID DNS sendiri
// (sesuai "Multi login" HTTP Custom). Saat false, hanya satu sesi
// dijalankan karena login dibagi bersama.
// autoCalibrate: uji QNAME/EDNS0 sebelum menyambung dan pilih batas
// terbesar yang lolos jaringan (nilai manual tetap tersimpan).
// logger    : penerima log (boleh nil).
//
// Fungsi ini sinkron sampai listener lokal siap. Gunakan WaitReady untuk
// menunggu sesi smux ke server benar-benar terbentuk.
func Start(resolver, domain, pubkeyHex, qtype, mode string, listenPort, kcpWindow, qnameLimit, ednsLimit, sessions int, multiLogin, autoCalibrate bool, logger Logger) error {
	mu.Lock()
	defer mu.Unlock()
	if active != nil {
		return errors.New("SlowDNS sudah berjalan")
	}

	pubkey, err := noise.DecodeKey(strings.TrimSpace(pubkeyHex))
	if err != nil {
		return fmt.Errorf("pubkey tidak valid: %v", err)
	}
	d, err := dns.ParseName(strings.TrimSpace(domain))
	if err != nil {
		return fmt.Errorf("domain tidak valid: %v", err)
	}
	typeNameUC := strings.ToUpper(strings.TrimSpace(qtype))
	qt, m, ok := parseTypeMode(typeNameUC)
	if !ok {
		return fmt.Errorf("tipe record tidak dikenal: %q", qtype)
	}
	isAuto := typeNameUC == "AUTO"
	switch strings.ToUpper(strings.TrimSpace(mode)) {
	case "", "STANDARD":
	case "COMPACT":
		if typeNameUC != "FT" {
			return errors.New("mode Compact hanya berlaku untuk tipe FT")
		}
		m.Compact = true
	default:
		return fmt.Errorf("mode tidak dikenal: %q", mode)
	}
	if kcpWindow <= 0 || kcpWindow > turbotunnel.QueueSize {
		kcpWindow = turbotunnel.QueueSize / 2
	}
	if qnameLimit > 0 && (qnameLimit < 64 || qnameLimit > 255) {
		return fmt.Errorf("batas QNAME harus 0 atau 64–255 byte")
	}
	if ednsLimit > 0 && (ednsLimit < 512 || ednsLimit > 4096) {
		return fmt.Errorf("batas EDNS0 harus 0 atau 512–4096 byte")
	}
	if sessions < 1 {
		sessions = 1
	}
	if sessions > 8 {
		sessions = 8
	}
	if !multiLogin {
		// Tanpa login terpisah, beberapa sesi DNS tidak bisa berbagi satu
		// ClientID: server dnstt memetakan ClientID ke satu jalur.
		sessions = 1
	}
	spec, err := parseResolver(resolver)
	if err != nil {
		return fmt.Errorf("resolver tidak valid: %v", err)
	}
	if !AllowPrivateResolver {
		if err := checkPublicResolver(spec); err != nil {
			return err
		}
	}
	// Validasi batas QNAME ala HTTP Custom 8.1.5: nama server + tipe
	// memakan ruang; bila sisa payload terlalu kecil, tolak sejak awal
	// dengan pesan yang jelas.
	if qnameLimit > 0 && dnsNameCapacity(d, qnameLimit)-queryOverhead < minPayloadBytes {
		return errors.New("The QNAME limit is too small for this server name and type. Increase it in SlowDNS settings.")
	}
	ln, err := net.ListenTCP("tcp", &net.TCPAddr{IP: net.ParseIP("127.0.0.1"), Port: listenPort})
	if err != nil {
		return fmt.Errorf("membuka listener lokal: %v", err)
	}

	t := &tunnel{
		ln:    ln,
		port:  ln.Addr().(*net.TCPAddr).Port,
		ready: make(chan struct{}),
		done:  make(chan struct{}),
	}
	active = t
	setLogger(logger)
	modeTxt := "1 sesi"
	if sessions > 1 {
		modeTxt = fmt.Sprintf("%d sesi • login terpisah", sessions)
	}
	logf("SlowDNS: mulai • resolver %s (%s) • domain %s • tipe %s • %s • 127.0.0.1:%d",
		normalizeResolver(resolver), spec.kind, domain, displayType(qt, m), modeTxt, t.port)
	go t.run(pubkey, d, qt, m, isAuto, spec, kcpWindow, qnameLimit, ednsLimit, sessions, autoCalibrate)
	return nil
}

// WaitReady menunggu sampai sesi smux ke server terbentuk (atau gagal).
func WaitReady(timeoutMs int) error {
	mu.Lock()
	t := active
	mu.Unlock()
	if t == nil {
		return errors.New("SlowDNS tidak berjalan")
	}
	timeout := time.Duration(timeoutMs) * time.Millisecond
	if timeout <= 0 {
		timeout = 30 * time.Second
	}
	select {
	case <-t.ready:
		return nil
	case <-t.done:
		if msg, ok := t.errMsg.Load().(string); ok && msg != "" {
			return errors.New(msg)
		}
		return errors.New("SlowDNS berhenti sebelum siap")
	case <-time.After(timeout):
		// Pesan ala HTTP Custom 8.1.5: start-up melewati batas waktu.
		logf("SlowDNS: Timed out while opening a session")
		return errors.New("Timed out while opening a session")
	}
}

// ListenPort mengembalikan port TCP lokal yang terpasang (0 bila tidak aktif).
func ListenPort() int {
	mu.Lock()
	defer mu.Unlock()
	if active == nil {
		return 0
	}
	return active.port
}

// IsRunning melaporkan apakah tunnel sedang berjalan.
func IsRunning() bool {
	mu.Lock()
	defer mu.Unlock()
	return active != nil
}

// Stop menghentikan tunnel dan menutup semua socket.
func Stop() {
	mu.Lock()
	t := active
	active = nil
	mu.Unlock()
	if t == nil {
		return
	}
	// Hentikan loop kirim/terima DNS lebih dulu supaya tidak ada paket baru
	// yang dicoba setelah socket ditutup (mencegah banjir log ErrClosed).
	t.mu.Lock()
	sessions := append([]*sessionConn(nil), t.sessions...)
	t.mu.Unlock()
	for _, sc := range sessions {
		sc.pconn.Close()
	}
	t.closeAll()
	select {
	case <-t.done:
	case <-time.After(2 * time.Second):
	}
	logf("SlowDNS dihentikan")
}

func (t *tunnel) closeAll() {
	t.mu.Lock()
	sessions := append([]*sessionConn(nil), t.sessions...)
	t.sessions = nil
	ln := t.ln
	t.mu.Unlock()
	if ln != nil {
		ln.Close()
	}
	for _, sc := range sessions {
		if sc.sess != nil {
			sc.sess.Close()
		}
		if sc.kcp != nil {
			sc.kcp.Close()
		}
		if sc.transport != nil {
			sc.transport.Close()
		}
	}
}

// fail mencatat kesalahan fatal dan menutup channel done.
func (t *tunnel) fail(err error) {
	if err != nil {
		t.errOnce.Do(func() { t.errMsg.Store(err.Error()) })
	}
	select {
	case <-t.done:
	default:
		close(t.done)
	}
}

// run menjalankan seluruh rangkaian tunnel (meniru run() dnstt-client).
func (t *tunnel) run(pubkey []byte, domain dns.Name, qtype uint16, m Mode, isAuto bool, spec resolverSpec, kcpWindow, qnameLimit, ednsLimit, sessions int, autoCalibrate bool) (retErr error) {
	defer func() {
		// Saat run berakhir — gagal awal maupun di-Stop — hentikan loop DNS
		// lebih dulu lalu tutup socket supaya tidak ada goroutine yang
		// tertinggal terus menulis ke socket tertutup.
		t.mu.Lock()
		all := append([]*sessionConn(nil), t.sessions...)
		t.mu.Unlock()
		for _, sc := range all {
			sc.pconn.Close()
		}
		t.closeAll()
		t.fail(retErr)
	}()

	// Mode AUTO: kalibrasi tipe record yang lolos resolver/server.
	if isAuto {
		qtype = calibrateQType(spec, domain, 1200*time.Millisecond, logf)
		logf("SlowDNS: kalibrasi selesai • tipe %s", typeName(qtype))
		// Log gaya HTTP Custom 8.1.5: mode otomatis melaporkan tipe aktif.
		logf("SlowDNS: Automatic - %s active", typeName(qtype))
	}

	// Kalibrasi batas QNAME/EDNS0 (gaya HTTP Custom): uji dari nilai
	// terbesar, pakai yang benar-benar lolos. Nilai profil tidak diubah.
	if autoCalibrate {
		qnameLimit, ednsLimit = calibrateLimits(spec, domain, qtype, qnameLimit, ednsLimit, logf)
	}

	// Buka semua sesi paralel. Masing-masing punya transport, ClientID,
	// KCP, dan Noise sendiri ("login terpisah").
	type opened struct {
		sc  *sessionConn
		err error
	}
	ch := make(chan opened, sessions)
	for i := 0; i < sessions; i++ {
		go func(idx int) {
			sc, err := t.openSession(pubkey, domain, qtype, m, spec, kcpWindow, qnameLimit, ednsLimit)
			if err != nil && idx > 0 {
				err = fmt.Errorf("sesi %d: %v", idx+1, err)
			}
			ch <- opened{sc: sc, err: err}
		}(i)
	}
	var firstErr error
	for i := 0; i < sessions; i++ {
		res := <-ch
		if res.err != nil {
			if firstErr == nil {
				firstErr = res.err
			}
			continue
		}
		t.mu.Lock()
		t.sessions = append(t.sessions, res.sc)
		t.mu.Unlock()
	}
	if firstErr != nil {
		return firstErr
	}

	close(t.ready)
	logf("SlowDNS siap • 127.0.0.1:%d • tipe %s • %d sesi", t.port, displayType(qtype, m), len(t.sessions))
	logf("SlowDNS: %s active", displayType(qtype, m))

	for {
		local, err := t.ln.Accept()
		if err != nil {
			if ne, ok := err.(net.Error); ok && ne.Temporary() {
				continue
			}
			return nil
		}
		// Pilih sesi bergiliran: stream/kanal SSH disebar ke semua sesi.
		t.mu.Lock()
		n := len(t.sessions)
		var sc *sessionConn
		if n > 0 {
			sc = t.sessions[int(t.next.Add(1)-1)%n]
		}
		t.mu.Unlock()
		if sc == nil {
			local.Close()
			continue
		}
		go func(local *net.TCPConn, sc *sessionConn) {
			defer local.Close()
			if err := handleStream(local, sc.sess, sc.conv); err != nil {
				logf("SlowDNS handle: %v", err)
			}
		}(local.(*net.TCPConn), sc)
	}
}

// openSession membangun satu sesi SlowDNS lengkap: transport resolver →
// DNSPacketConn → KCP → Noise → smux.
func (t *tunnel) openSession(
	pubkey []byte,
	domain dns.Name,
	qtype uint16,
	m Mode,
	spec resolverSpec,
	kcpWindow, qnameLimit, ednsLimit int,
) (*sessionConn, error) {
	tr, err := openTransport(spec)
	if err != nil {
		return nil, fmt.Errorf("membuka resolver: %v", err)
	}
	sc := &sessionConn{transport: tr.PacketConn, addr: tr.addr}
	ok := false
	defer func() {
		if !ok {
			tr.Close()
		}
	}()

	padData := numPadding
	if m.Compact {
		padData = 0
	}
	mtu := dnsNameCapacity(domain, qnameLimit) - 8 - 1 - padData - 1 // clientid + prefiks padding + padding + prefiks data
	if mtu < 80 {
		return nil, fmt.Errorf("domain %s hanya menyisakan %d byte untuk payload", domain, mtu)
	}
	logf("SlowDNS native: effective MTU %d", mtu)

	sc.pconn = NewDNSPacketConn(sc.transport, sc.addr, domain, qtype, ednsLimit, m, logf)
	conn, err := kcp.NewConn2(sc.addr, nil, 0, 0, sc.pconn)
	if err != nil {
		sc.pconn.Close()
		return nil, fmt.Errorf("membuka KCP: %v", err)
	}
	sc.kcp = conn
	sc.conv = conn.GetConv()
	logf("SlowDNS native: begin session %08x", sc.conv)

	// Izinkan penggabungan payload beberapa pengiriman berturut-turut.
	conn.SetStreamMode(true)
	// Matikan congestion window dinamis (batas hanya dari jendela statis).
	conn.SetNoDelay(0, 0, 0, 1)
	conn.SetWindowSize(kcpWindow, kcpWindow)
	if rc := conn.SetMtu(mtu); !rc {
		conn.Close()
		sc.pconn.Close()
		return nil, errors.New("SetMtu gagal")
	}

	// Kanal Noise di atas KCP: Noise_NK_25519_ChaChaPoly_BLAKE2s,
	// prologue "dnstt 2020-04-13". Kegagalan handshake berarti kunci publik
	// server tidak cocok — pesan ala HTTP Custom 8.1.5.
	rw, err := noise.NewClient(conn, pubkey)
	if err != nil {
		conn.Close()
		sc.pconn.Close()
		return nil, fmt.Errorf("Could not verify the server. Update the app and the server package. (%v)", err)
	}

	// Sesi smux v2 di atas Noise.
	cfg := smux.DefaultConfig()
	cfg.Version = 2
	cfg.KeepAliveTimeout = idleTimeout
	cfg.MaxStreamBuffer = 1 * 1024 * 1024
	sess, err := smux.Client(rw, cfg)
	if err != nil {
		conn.Close()
		sc.pconn.Close()
		return nil, fmt.Errorf("membuka sesi smux: %v", err)
	}
	sc.sess = sess
	ok = true
	return sc, nil
}

// handleStream meneruskan satu koneksi TCP lokal ke satu stream smux.
func handleStream(local *net.TCPConn, sess *smux.Session, conv uint32) error {
	stream, err := sess.OpenStream()
	if err != nil {
		return fmt.Errorf("sesi %08x membuka stream: %v", conv, err)
	}
	defer func() {
		logf("SlowDNS: end stream %08x:%d", conv, stream.ID())
		stream.Close()
	}()
	logf("SlowDNS: begin stream %08x:%d", conv, stream.ID())

	var wg sync.WaitGroup
	wg.Add(2)
	go func() {
		defer wg.Done()
		_, err := io.Copy(stream, local)
		if err == io.EOF {
			err = nil
		}
		if err != nil && !errors.Is(err, io.ErrClosedPipe) {
			logf("SlowDNS: stream %08x:%d copy stream←local: %v", conv, stream.ID(), err)
		}
		local.CloseRead()
		stream.Close()
	}()
	go func() {
		defer wg.Done()
		_, err := io.Copy(local, stream)
		if err == io.EOF {
			err = nil
		}
		if err != nil && !errors.Is(err, io.ErrClosedPipe) {
			logf("SlowDNS: stream %08x:%d copy local←stream: %v", conv, stream.ID(), err)
		}
		local.CloseWrite()
	}()
	wg.Wait()

	return err
}

// dnsNameCapacity menghitung sisa byte untuk data terenkode setelah domain
// dimasukkan ke nama DNS (sama dengan dnstt-client).
func dnsNameCapacity(domain dns.Name, limit int) int {
	// Nama maksimal 255 oktet. https://tools.ietf.org/html/rfc1035#section-2.3.4
	capacity := 255
	// Batas QNAME dari pengaturan (0 = default 255).
	if limit > 0 && limit < capacity {
		capacity = limit
	}
	// Null terminator.
	capacity -= 1
	for _, label := range domain {
		// Panjang label + oktet panjang.
		capacity -= len(label) + 1
	}
	// Label maksimal 63 byte, perlu 64 byte untuk dienkode.
	capacity = capacity * 63 / 64
	// Base32 memperluas 5 byte menjadi 8.
	capacity = capacity * 5 / 8
	return capacity
}
