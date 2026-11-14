package slowdns

import (
	"bytes"
	"encoding/binary"
	"strings"
	"testing"

	"wanz/slowdns/internal/dns"
	"wanz/slowdns/internal/turbotunnel"
)

func testDomain(t *testing.T) dns.Name {
	t.Helper()
	d, err := dns.ParseName("t.example.com")
	if err != nil {
		t.Fatalf("ParseName: %v", err)
	}
	return d
}

// Query harus mengandung ClientID + padding + paket di dalam QNAME base32.
func TestBuildQueryCarriesPacketInQName(t *testing.T) {
	domain := testDomain(t)
	clientID := turbotunnel.ClientID{1, 2, 3, 4, 5, 6, 7, 8}
	packet := []byte("hello-tunnel")

	wire, err := buildQuery(clientID, domain, rrTypeNULL, packet, 0)
	if err != nil {
		t.Fatalf("buildQuery: %v", err)
	}
	msg, err := dns.MessageFromWireFormat(wire)
	if err != nil {
		t.Fatalf("MessageFromWireFormat: %v", err)
	}
	if len(msg.Question) != 1 {
		t.Fatalf("question = %d, want 1", len(msg.Question))
	}
	q := msg.Question[0]
	if q.Type != rrTypeNULL {
		t.Fatalf("qtype = %d, want NULL(10)", q.Type)
	}
	labels, _ := q.Name.TrimSuffix(domain)
	if len(labels) == 0 {
		t.Fatal("QNAME tidak membawa label data")
	}
	var encoded strings.Builder
	for _, l := range labels {
		encoded.Write(l)
	}
	decoded, err := base32Encoding.DecodeString(strings.ToUpper(encoded.String()))
	if err != nil {
		t.Fatalf("base32 decode: %v", err)
	}
	if !bytes.HasPrefix(decoded, clientID[:]) {
		t.Fatal("ClientID tidak di awal QNAME terenkode")
	}
	padLen := int(decoded[8]) - 224
	if padLen != numPadding {
		t.Fatalf("padding = %d, want %d", padLen, numPadding)
	}
	rest := decoded[9+padLen:]
	if int(rest[0]) != len(packet) || !bytes.Equal(rest[1:], packet) {
		t.Fatalf("paket tidak utuh di QNAME: %q", rest)
	}
}

func TestParsePacketsSplitsLengthPrefixed(t *testing.T) {
	var payload []byte
	for _, p := range [][]byte{[]byte("alpha"), []byte("beta"), bytes.Repeat([]byte{7}, 300)} {
		var l [2]byte
		binary.BigEndian.PutUint16(l[:], uint16(len(p)))
		payload = append(payload, l[:]...)
		payload = append(payload, p...)
	}
	got := parsePackets(payload)
	if len(got) != 3 {
		t.Fatalf("pakets = %d, want 3", len(got))
	}
	if string(got[0]) != "alpha" || string(got[1]) != "beta" || len(got[2]) != 300 {
		t.Fatal("isi paket tidak sesuai")
	}
}

func TestDecodeAnswerTXTAndNULL(t *testing.T) {
	domain := testDomain(t)
	logf := func(string, ...interface{}) {}

	var body []byte
	for _, p := range [][]byte{[]byte("abc"), []byte("defg")} {
		var l [2]byte
		binary.BigEndian.PutUint16(l[:], uint16(len(p)))
		body = append(body, l[:]...)
		body = append(body, p...)
	}

	name, err := dns.NewName(append([][]byte{[]byte("abcd1234")}, domain...))
	if err != nil {
		t.Fatalf("NewName: %v", err)
	}

	// TXT: RDATA character-string.
	txt := dns.RR{Name: name, Type: dns.RRTypeTXT, Data: dns.EncodeRDataTXT(body)}
	if got := decodeAnswerPackets(txt, domain, logf); len(got) != 2 || string(got[0]) != "abc" {
		t.Fatalf("TXT decode salah: %v", got)
	}

	// NULL: RDATA mentah.
	nullRR := dns.RR{Name: name, Type: rrTypeNULL, Data: body}
	if got := decodeAnswerPackets(nullRR, domain, logf); len(got) != 2 || string(got[1]) != "defg" {
		t.Fatalf("NULL decode salah: %v", got)
	}
}

func TestDecodeAnswerNameBearingTypes(t *testing.T) {
	domain := testDomain(t)
	logf := func(string, ...interface{}) {}

	var body []byte
	for _, p := range [][]byte{[]byte("xy"), []byte("zw")} {
		var l [2]byte
		binary.BigEndian.PutUint16(l[:], uint16(len(p)))
		body = append(body, l[:]...)
		body = append(body, p...)
	}
	encoded := strings.ToLower(base32Encoding.EncodeToString(body))
	labels := chunks([]byte(encoded), 63)
	labels = append(labels, domain...)
	name, err := dns.NewName(labels)
	if err != nil {
		t.Fatalf("NewName: %v", err)
	}

	// CNAME: RDATA adalah nama.
	cname := dns.RR{Name: name, Type: rrTypeCNAME, Data: nameRData(t, name)}
	if got := decodeAnswerPackets(cname, domain, logf); len(got) != 2 || string(got[0]) != "xy" {
		t.Fatalf("CNAME decode salah: %v", got)
	}

	// MX: 2 byte preference + nama.
	mx := append([]byte{0, 10}, nameRData(t, name)...)
	mxRR := dns.RR{Name: name, Type: rrTypeMX, Data: mx}
	if got := decodeAnswerPackets(mxRR, domain, logf); len(got) != 2 || string(got[1]) != "zw" {
		t.Fatalf("MX decode salah: %v", got)
	}

	// SRV: 6 byte (priority, weight, port) + nama.
	srv := append([]byte{0, 5, 0, 5, 1, 187}, nameRData(t, name)...)
	srvRR := dns.RR{Name: name, Type: rrTypeSRV, Data: srv}
	if got := decodeAnswerPackets(srvRR, domain, logf); len(got) != 2 {
		t.Fatalf("SRV decode salah: %v", got)
	}
}

// nameRData menyusun RDATA nama tanpa kompresi (label + 0 terminator).
func nameRData(t *testing.T, name dns.Name) []byte {
	t.Helper()
	var out []byte
	for _, label := range name {
		out = append(out, byte(len(label)))
		out = append(out, label...)
	}
	return append(out, 0)
}

func TestParseQType(t *testing.T) {
	if qt, _ := parseQType("null"); qt != rrTypeNULL {
		t.Fatal("null harus 10")
	}
	if qt, _ := parseQType("txt"); qt != dns.RRTypeTXT {
		t.Fatal("txt harus 16")
	}
	for _, s := range []string{"AUTO", "auto", "CNAME", "MX", "NS", "SRV"} {
		if _, ok := parseQType(s); !ok {
			t.Fatalf("%s harus dikenali", s)
		}
	}
	if _, ok := parseQType("AXFR"); ok {
		t.Fatal("AXFR tidak boleh dikenali")
	}
}

func TestNormalizeResolver(t *testing.T) {
	if got := normalizeResolver("1.1.1.1"); got != "1.1.1.1:53" {
		t.Fatalf("normalizeResolver(1.1.1.1) = %s", got)
	}
	if got := normalizeResolver("udp://8.8.8.8:53"); got != "8.8.8.8:53" {
		t.Fatalf("normalizeResolver(udp://8.8.8.8:53) = %s", got)
	}
	if got := normalizeResolver(""); got != "8.8.8.8:53" {
		t.Fatalf("normalizeResolver('') = %s", got)
	}
}

func TestParseResolverKinds(t *testing.T) {
	cases := []struct {
		in, kind, addr string
	}{
		{"8.8.8.8", "udp", "8.8.8.8:53"},
		{"udp://1.1.1.1:5353", "udp", "1.1.1.1:5353"},
		{"https://dns.google/dns-query", "doh", "https://dns.google/dns-query"},
		{"https://cloudflare-dns.com", "doh", "https://cloudflare-dns.com/dns-query"},
		{"tls://1.1.1.1", "dot", "1.1.1.1:853"},
		{"dot://dns.google:8853", "dot", "dns.google:8853"},
	}
	for _, c := range cases {
		spec, err := parseResolver(c.in)
		if err != nil {
			t.Fatalf("parseResolver(%q): %v", c.in, err)
		}
		if spec.kind != c.kind || spec.addr != c.addr {
			t.Fatalf("parseResolver(%q) = %s %s, want %s %s", c.in, spec.kind, spec.addr, c.kind, c.addr)
		}
	}
}

func TestBuildQueryEDNSLimit(t *testing.T) {
	domain := testDomain(t)
	wire, err := buildQuery(turbotunnel.ClientID{9}, domain, rrTypeNULL, []byte("x"), 1232)
	if err != nil {
		t.Fatalf("buildQuery: %v", err)
	}
	msg, err := dns.MessageFromWireFormat(wire)
	if err != nil {
		t.Fatalf("MessageFromWireFormat: %v", err)
	}
	if len(msg.Additional) != 1 || msg.Additional[0].Class != 1232 {
		t.Fatalf("EDNS0 class = %+v, want 1232", msg.Additional)
	}
}

func TestDnsNameCapacityHonoursLimit(t *testing.T) {
	domain := testDomain(t)
	full := dnsNameCapacity(domain, 0)
	small := dnsNameCapacity(domain, 96)
	if small >= full {
		t.Fatalf("batas 96 (%d) harus lebih kecil dari default (%d)", small, full)
	}
	if small < 0 || full < 80 {
		t.Fatalf("kapasitas tidak wajar: %d / %d", small, full)
	}
}

func TestCalibrationCandidates(t *testing.T) {
	got := candidates(0, qnameSteps)
	if len(got) != len(qnameSteps) || got[0] != 255 {
		t.Fatalf("kandidat default = %v", got)
	}
	got = candidates(200, qnameSteps)
	if got[0] != 200 {
		t.Fatalf("kandidat manual = %v", got)
	}
	for i := 1; i < len(got); i++ {
		if got[i] >= got[0] {
			t.Fatalf("kandidat harus menurun: %v", got)
		}
	}
}
