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

// Logger menerima baris log tunnel; diimplementasikan di sisi Java/Kotlin
// agar log muncul di tab LOG aplikasi.
type Logger interface {
	Log(msg string)
}

type tunnel struct {
	mu      sync.Mutex
	ln      *net.TCPListener
	udp     *net.UDPConn
	kcp     *kcp.UDPSession
	sess    *smux.Session
	pconn   *DNSPacketConn
	port    int
	ready   chan struct{}
	done    chan struct{}
	errOnce sync.Once
	errMsg  atomic.Value // string
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

// parseQType menerjemahkan nama tipe dari sisi Java: AUTO/NULL/TXT/CNAME/
// MX/NS/SRV. Mengembalikan 0 untuk AUTO (kalibrasi).
func parseQType(s string) (uint16, bool) {
	switch strings.ToUpper(strings.TrimSpace(s)) {
	case "AUTO":
		return 0, true
	case "", "NULL":
		return rrTypeNULL, true
	case "TXT":
		return dns.RRTypeTXT, true
	case "CNAME":
		return rrTypeCNAME, true
	case "MX":
		return rrTypeMX, true
	case "NS":
		return rrTypeNS, true
	case "SRV":
		return rrTypeSRV, true
	}
	return 0, false
}

// normalizeResolver melengkapi port DNS bila belum ada dan membuang skema.
func normalizeResolver(resolver string) string {
	r := strings.TrimSpace(resolver)
	r = strings.TrimPrefix(r, "udp://")
	if r == "" {
		return "8.8.8.8:53"
	}
	if _, _, err := net.SplitHostPort(r); err != nil {
		return r + ":53"
	}
	return r
}

// Start menjalankan tunnel SlowDNS dan membuka listener TCP lokal di
// 127.0.0.1:listenPort (listenPort 0 = port acak; lihat ListenPort).
//
// resolver : alamat DNS upstream, mis. "8.8.8.8" atau "1.1.1.1:53".
// domain   : domain tunnel, mis. "t.example.com" (harus di-host dnstt-server).
// pubkeyHex: public key server (64 karakter hex) untuk Noise_NK.
// qtype    : AUTO | NULL | TXT | CNAME | MX | NS | SRV.
// listenPort: port TCP lokal; 0 = pilih otomatis.
// kcpWindow: jendela KCP; 0 = default (64).
// logger   : penerima log (boleh nil).
//
// Fungsi ini sinkron sampai listener lokal siap. Gunakan WaitReady untuk
// menunggu sesi smux ke server benar-benar terbentuk.
func Start(resolver, domain, pubkeyHex, qtype string, listenPort, kcpWindow int, logger Logger) error {
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
	qt, isAuto := parseQType(qtype)
	if !isAuto {
		return fmt.Errorf("tipe record tidak dikenal: %q", qtype)
	}
	if kcpWindow <= 0 || kcpWindow > turbotunnel.QueueSize {
		kcpWindow = turbotunnel.QueueSize / 2
	}
	raddr, err := net.ResolveUDPAddr("udp", normalizeResolver(resolver))
	if err != nil {
		return fmt.Errorf("resolver tidak valid: %v", err)
	}
	udp, err := net.ListenUDP("udp", nil)
	if err != nil {
		return fmt.Errorf("membuka socket UDP: %v", err)
	}
	ln, err := net.ListenTCP("tcp", &net.TCPAddr{IP: net.ParseIP("127.0.0.1"), Port: listenPort})
	if err != nil {
		udp.Close()
		return fmt.Errorf("membuka listener lokal: %v", err)
	}

	t := &tunnel{
		ln:    ln,
		udp:   udp,
		port:  ln.Addr().(*net.TCPAddr).Port,
		ready: make(chan struct{}),
		done:  make(chan struct{}),
	}
	active = t
	setLogger(logger)
	logf("SlowDNS: mulai • resolver %s • domain %s • tipe %s • 127.0.0.1:%d",
		normalizeResolver(resolver), domain, strings.ToUpper(strings.TrimSpace(qtype)), t.port)
	go t.run(pubkey, d, qt, isAuto, raddr, kcpWindow)
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
		return fmt.Errorf("menunggu sesi SlowDNS lebih dari %s", timeout)
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
	pconn := t.pconn
	t.mu.Unlock()
	if pconn != nil {
		pconn.Close()
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
	defer t.mu.Unlock()
	if t.ln != nil {
		t.ln.Close()
	}
	if t.sess != nil {
		t.sess.Close()
	}
	if t.kcp != nil {
		t.kcp.Close()
	}
	if t.udp != nil {
		t.udp.Close()
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
func (t *tunnel) run(pubkey []byte, domain dns.Name, qtype uint16, isAuto bool, raddr *net.UDPAddr, kcpWindow int) (retErr error) {
	defer func() {
		// Saat run berakhir — gagal awal maupun di-Stop — hentikan loop DNS
		// lebih dulu lalu tutup socket supaya tidak ada goroutine yang
		// tertinggal terus menulis ke socket tertutup.
		t.mu.Lock()
		pconn := t.pconn
		t.mu.Unlock()
		if pconn != nil {
			pconn.Close()
		}
		t.closeAll()
		t.fail(retErr)
	}()

	// Mode AUTO: kalibrasi tipe record yang lolos resolver/server.
	if isAuto {
		qtype = calibrateQType(raddr, domain, 2*time.Second, logf)
		logf("SlowDNS: kalibrasi selesai • tipe %s", typeName(qtype))
	}

	pconn := NewDNSPacketConn(t.udp, raddr, domain, qtype, logf)
	t.mu.Lock()
	t.pconn = pconn
	t.mu.Unlock()

	mtu := dnsNameCapacity(domain) - 8 - 1 - numPadding - 1 // clientid + prefiks padding + padding + prefiks data
	if mtu < 80 {
		return fmt.Errorf("domain %s hanya menyisakan %d byte untuk payload", domain, mtu)
	}
	logf("SlowDNS native: effective MTU %d", mtu)

	conn, err := kcp.NewConn2(raddr, nil, 0, 0, pconn)
	if err != nil {
		return fmt.Errorf("membuka KCP: %v", err)
	}
	t.mu.Lock()
	t.kcp = conn
	t.mu.Unlock()
	logf("SlowDNS native: begin session %08x", conn.GetConv())

	// Izinkan penggabungan payload beberapa pengiriman berturut-turut.
	conn.SetStreamMode(true)
	// Matikan congestion window dinamis (batas hanya dari jendela statis).
	conn.SetNoDelay(0, 0, 0, 1)
	conn.SetWindowSize(kcpWindow, kcpWindow)
	if rc := conn.SetMtu(mtu); !rc {
		return errors.New("SetMtu gagal")
	}

	// Kanal Noise di atas KCP: Noise_NK_25519_ChaChaPoly_BLAKE2s,
	// prologue "dnstt 2020-04-13".
	rw, err := noise.NewClient(conn, pubkey)
	if err != nil {
		return err
	}

	// Sesi smux v2 di atas Noise.
	cfg := smux.DefaultConfig()
	cfg.Version = 2
	cfg.KeepAliveTimeout = idleTimeout
	cfg.MaxStreamBuffer = 1 * 1024 * 1024
	sess, err := smux.Client(rw, cfg)
	if err != nil {
		return fmt.Errorf("membuka sesi smux: %v", err)
	}
	t.mu.Lock()
	t.sess = sess
	t.mu.Unlock()

	close(t.ready)
	logf("SlowDNS siap • 127.0.0.1:%d • tipe %s", t.port, typeName(qtype))

	for {
		local, err := t.ln.Accept()
		if err != nil {
			if ne, ok := err.(net.Error); ok && ne.Temporary() {
				continue
			}
			return nil
		}
		go func() {
			defer local.Close()
			if err := handleStream(local.(*net.TCPConn), sess, conn.GetConv()); err != nil {
				logf("SlowDNS handle: %v", err)
			}
		}()
	}
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
func dnsNameCapacity(domain dns.Name) int {
	// Nama maksimal 255 oktet. https://tools.ietf.org/html/rfc1035#section-2.3.4
	capacity := 255
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
