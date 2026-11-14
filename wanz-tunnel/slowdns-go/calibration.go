// Kalibrasi batas QNAME/EDNS0 ala "Automatic calibration" HTTP Custom.
//
// HTTP Custom menguji batas QNAME dan EDNS0 sebelum menyambung: jaringan
// yang memotong DNS besar akan menolak/menjatuhkan query, sehingga batas
// terbesar yang benar-benar lolos harus dicari lebih dulu. Kalibrasi di sini
// melakukan hal yang sama dengan mengirim query uji berukuran penuh; nilai
// manual di profil tidak diubah (hanya dipakai untuk sesi ini).
package slowdns

import (
	"strings"
	"time"

	"wanz/slowdns/internal/dns"
	"wanz/slowdns/internal/turbotunnel"
)

const (
	// Batas waktu satu query uji. Kalibrasi hanya berjalan saat diminta.
	calibrateTimeout = 1200 * time.Millisecond
	// Anggaran total kalibrasi; sisanya memakai nilai default supaya
	// koneksi tidak tertunda terlalu lama di jaringan yang sangat ketat.
	calibrateBudget = 5 * time.Second
	// Jumlah percobaan per kandidat; satu jawaban valid sudah cukup.
	calibrateSamples = 2
)

// Kandidat batas, dari besar ke kecil.
var (
	qnameSteps = []int{255, 224, 192, 160, 128, 96, 64}
	ednsSteps  = []int{4096, 3072, 2048, 1536, 1232, 900, 512}
)

// calibrateLimits mencari batas QNAME lalu EDNS0 terbesar yang lolos
// resolver. Mengembalikan 0 untuk batas yang tidak lolos (0 = default).
func calibrateLimits(
	spec resolverSpec,
	domain dns.Name,
	qtype uint16,
	qnameLimit, ednsLimit int,
	logf func(string, ...interface{}),
) (int, int) {
	if spec.kind != "udp" {
		logf("SlowDNS: kalibrasi batas dilewati untuk resolver %s (berbasis TCP)", strings.ToUpper(spec.kind))
		return qnameLimit, ednsLimit
	}
	qc := candidates(qnameLimit, qnameSteps)
	ec := candidates(ednsLimit, ednsSteps)
	logf("SlowDNS: kalibrasi batas • QNAME %v • EDNS0 %v", qc, ec)
	deadline := time.Now().Add(calibrateBudget)

	chosenQ := 0
	for _, q := range qc {
		if time.Now().After(deadline) {
			break
		}
		if limitWorks(spec, domain, qtype, q, ednsLimit, deadline) {
			chosenQ = q
			logf("SlowDNS: kalibrasi QNAME lolos %d byte", q)
			break
		}
	}
	if chosenQ == 0 {
		logf("SlowDNS: kalibrasi QNAME gagal; memakai nilai default")
	}

	chosenE := 0
	for _, e := range ec {
		if time.Now().After(deadline) {
			break
		}
		if limitWorks(spec, domain, qtype, chosenQ, e, deadline) {
			chosenE = e
			logf("SlowDNS: kalibrasi EDNS0 lolos %d byte", e)
			break
		}
	}
	if chosenE == 0 {
		logf("SlowDNS: kalibrasi EDNS0 gagal; memakai nilai default")
	}
	return chosenQ, chosenE
}

// candidates menyusun daftar uji: nilai terpasang (atau maksimum) lebih dulu,
// lalu batas standar yang lebih kecil.
func candidates(configured int, steps []int) []int {
	start := configured
	if start <= 0 {
		start = steps[0]
	}
	out := []int{start}
	for _, v := range steps {
		if v < start {
			out = append(out, v)
		}
	}
	return out
}

// limitWorks mengirim query data berukuran penuh untuk batas tertentu dan
// menerima jawaban DNS valid dari resolver/server.
func limitWorks(spec resolverSpec, domain dns.Name, qtype uint16, qnameLimit, ednsLimit int, deadline time.Time) bool {
	capacity := dnsNameCapacity(domain, qnameLimit)
	// clientid(8) + prefiks padding(1) + padding(3) + prefiks data(1)
	dataLen := capacity - 8 - 1 - numPadding - 1
	if dataLen < 1 || capacity < 80 {
		return false
	}
	if dataLen > 200 {
		dataLen = 200 // buildQuery menolak paket ≥ 224
	}
	payload := make([]byte, dataLen)
	for attempt := 0; attempt < calibrateSamples; attempt++ {
		remaining := time.Until(deadline)
		if remaining <= 0 {
			return false
		}
		timeout := calibrateTimeout
		if remaining < timeout {
			timeout = remaining
		}
		if probeLimits(spec, domain, qtype, payload, ednsLimit, timeout) {
			return true
		}
	}
	return false
}

// probeLimits mengirim satu query uji dan menunggu jawaban NOERROR yang
// menyebut domain tunnel.
func probeLimits(spec resolverSpec, domain dns.Name, qtype uint16, payload []byte, ednsLimit int, timeout time.Duration) bool {
	tr, err := openTransport(spec)
	if err != nil {
		return false
	}
	defer tr.Close()

	buf, err := buildQuery(turbotunnel.NewClientID(), domain, qtype, payload, ednsLimit)
	if err != nil {
		return false
	}
	if err := tr.SetDeadline(time.Now().Add(timeout)); err != nil {
		return false
	}
	if _, err := tr.WriteTo(buf, tr.addr); err != nil {
		return false
	}
	var rsp [4096]byte
	for {
		n, _, err := tr.ReadFrom(rsp[:])
		if err != nil {
			return false
		}
		msg, err := dns.MessageFromWireFormat(rsp[:n])
		if err != nil {
			continue
		}
		if msg.Flags&0x8000 != 0x8000 || msg.Rcode() != dns.RcodeNoError {
			continue
		}
		for _, q := range msg.Question {
			if _, ok := q.Name.TrimSuffix(domain); ok {
				return true
			}
		}
	}
}
