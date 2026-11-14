// Transport resolver SlowDNS: UDP biasa, DNS over HTTPS (DoH), dan DNS over
// TLS (DoT) — sama seperti pilihan resolver HTTP Custom
// ("alamat polos/udp://", "https://", "tls://" atau "dot://").
package slowdns

import (
	"bufio"
	"bytes"
	"context"
	"crypto/tls"
	"encoding/binary"
	"fmt"
	"io"
	"net"
	"net/http"
	"strings"
	"sync"
	"time"

	"wanz/slowdns/internal/turbotunnel"
)

const dialTimeout = 30 * time.Second

// resolverSpec adalah hasil parsing alamat resolver dari UI.
type resolverSpec struct {
	kind string // "udp", "doh", "dot"
	addr string // UDP/DoT: host:port; DoH: URL
}

// parseResolver memahami bentuk yang diterima HTTP Custom:
//
//	8.8.8.8            → UDP :53
//	udp://1.1.1.1:53   → UDP
//	https://dns.google/dns-query → DoH
//	tls://1.1.1.1      → DoT :853
//	dot://1.1.1.1:853  → DoT
func parseResolver(resolver string) (resolverSpec, error) {
	r := strings.TrimSpace(resolver)
	if r == "" {
		r = "8.8.8.8"
	}
	lower := strings.ToLower(r)
	switch {
	case strings.HasPrefix(lower, "https://"):
		u := r
		if i := strings.Index(u, "://"); i >= 0 {
			hostPart := u[i+3:]
			if !strings.Contains(hostPart, "/") {
				u += "/dns-query"
			}
		}
		return resolverSpec{kind: "doh", addr: u}, nil
	case strings.HasPrefix(lower, "tls://"), strings.HasPrefix(lower, "dot://"):
		host := r[strings.Index(r, "://")+3:]
		host = strings.TrimSuffix(strings.TrimSpace(host), "/")
		if host == "" {
			return resolverSpec{}, fmt.Errorf("alamat DoT kosong")
		}
		if _, _, err := net.SplitHostPort(host); err != nil {
			host = net.JoinHostPort(host, "853")
		}
		return resolverSpec{kind: "dot", addr: host}, nil
	default:
		host := strings.TrimPrefix(r, "udp://")
		if _, _, err := net.SplitHostPort(host); err != nil {
			host = net.JoinHostPort(host, "53")
		}
		return resolverSpec{kind: "udp", addr: host}, nil
	}
}

// transportConn adalah PacketConn resolver plus alamat tujuan yang dipakai
// KCP/DNSPacketConn.
type transportConn struct {
	net.PacketConn
	addr net.Addr
}

// openTransport membuat transport sesuai resolverSpec. Socket TCP/UDP untuk
// resolver ikut diproteksi dari VPN lewat controlProtect.
func openTransport(spec resolverSpec) (*transportConn, error) {
	switch spec.kind {
	case "udp":
		raddr, err := net.ResolveUDPAddr("udp", spec.addr)
		if err != nil {
			return nil, fmt.Errorf("resolver UDP tidak valid: %v", err)
		}
		udp, err := listenUDP()
		if err != nil {
			return nil, fmt.Errorf("membuka socket UDP: %v", err)
		}
		return &transportConn{PacketConn: udp, addr: raddr}, nil

	case "doh":
		dialer := &net.Dialer{Timeout: dialTimeout, Control: controlProtect}
		rt := &http.Transport{
			Proxy:               nil,
			DialContext:         dialer.DialContext,
			TLSHandshakeTimeout: dialTimeout,
			ForceAttemptHTTP2:   true,
		}
		pc, err := newHTTPPacketConn(rt, spec.addr, 32, logf)
		if err != nil {
			return nil, err
		}
		return &transportConn{PacketConn: pc, addr: turbotunnel.DummyAddr{}}, nil

	case "dot":
		dialer := &tls.Dialer{
			NetDialer: &net.Dialer{Timeout: dialTimeout, Control: controlProtect},
			Config:    &tls.Config{MinVersion: tls.VersionTLS12},
		}
		pc, err := newTLSPacketConn(spec.addr, dialer.DialContext, logf)
		if err != nil {
			return nil, err
		}
		return &transportConn{PacketConn: pc, addr: turbotunnel.DummyAddr{}}, nil
	}
	return nil, fmt.Errorf("resolver tidak dikenal: %q", spec.addr)
}

// --------------------------------------------------------------------- DoH

// httpPacketConn mengirim satu pesan DNS per permintaan HTTP POST
// (RFC 8484) dan mengantrekan badan jawabannya untuk ReadFrom.
type httpPacketConn struct {
	client    *http.Client
	urlString string
	*turbotunnel.QueuePacketConn
	logf func(string, ...interface{})
	done chan struct{}
	once sync.Once
}

func newHTTPPacketConn(
	rt http.RoundTripper,
	urlString string,
	numSenders int,
	logf func(string, ...interface{}),
) (*httpPacketConn, error) {
	if numSenders <= 0 {
		numSenders = 8
	}
	c := &httpPacketConn{
		client:          &http.Client{Transport: rt, Timeout: 30 * time.Second},
		urlString:       urlString,
		QueuePacketConn: turbotunnel.NewQueuePacketConn(turbotunnel.DummyAddr{}, 0),
		logf:            logf,
		done:            make(chan struct{}),
	}
	for i := 0; i < numSenders; i++ {
		go c.sendLoop()
	}
	return c, nil
}

func (c *httpPacketConn) Close() error {
	c.once.Do(func() { close(c.done) })
	return c.QueuePacketConn.Close()
}

func (c *httpPacketConn) send(p []byte) error {
	ctx, cancel := context.WithTimeout(context.Background(), 30*time.Second)
	defer cancel()
	req, err := http.NewRequestWithContext(ctx, http.MethodPost, c.urlString, bytes.NewReader(p))
	if err != nil {
		return err
	}
	req.Header.Set("Accept", "application/dns-message")
	req.Header.Set("Content-Type", "application/dns-message")
	req.Header.Set("User-Agent", "")
	resp, err := c.client.Do(req)
	if err != nil {
		return err
	}
	defer resp.Body.Close()
	if resp.StatusCode != http.StatusOK {
		return fmt.Errorf("DoH HTTP %s", resp.Status)
	}
	if ct := resp.Header.Get("Content-Type"); ct != "" && ct != "application/dns-message" {
		return fmt.Errorf("DoH Content-Type %q", ct)
	}
	body, err := io.ReadAll(io.LimitReader(resp.Body, 64000))
	if err != nil {
		return err
	}
	c.QueuePacketConn.QueueIncoming(body, turbotunnel.DummyAddr{})
	return nil
}

func (c *httpPacketConn) sendLoop() {
	for {
		select {
		case <-c.done:
			return
		default:
		}
		select {
		case <-c.done:
			return
		case p := <-c.QueuePacketConn.OutgoingQueue(turbotunnel.DummyAddr{}):
			if err := c.send(p); err != nil {
				select {
				case <-c.done:
					return
				default:
				}
				c.logf("SlowDNS DoH: %v", err)
			}
		}
	}
}

// --------------------------------------------------------------------- DoT

// tlsPacketConn membawa pesan DNS berprefiks panjang 2 byte di atas satu
// koneksi TLS, menyambung ulang bila koneksi putus (RFC 7858).
type tlsPacketConn struct {
	*turbotunnel.QueuePacketConn
	dial func(ctx context.Context, network, addr string) (net.Conn, error)
	addr string
	logf func(string, ...interface{})
	done chan struct{}
	once sync.Once
}

func newTLSPacketConn(
	addr string,
	dialTLSContext func(ctx context.Context, network, addr string) (net.Conn, error),
	logf func(string, ...interface{}),
) (*tlsPacketConn, error) {
	c := &tlsPacketConn{
		QueuePacketConn: turbotunnel.NewQueuePacketConn(turbotunnel.DummyAddr{}, 0),
		dial:            dialTLSContext,
		addr:            addr,
		logf:            logf,
		done:            make(chan struct{}),
	}
	conn, err := c.dialOnce()
	if err != nil {
		return nil, err
	}
	go c.loop(conn)
	return c, nil
}

func (c *tlsPacketConn) Close() error {
	c.once.Do(func() { close(c.done) })
	return c.QueuePacketConn.Close()
}

func (c *tlsPacketConn) dialOnce() (net.Conn, error) {
	ctx, cancel := context.WithTimeout(context.Background(), dialTimeout)
	defer cancel()
	return c.dial(ctx, "tcp", c.addr)
}

func (c *tlsPacketConn) loop(conn net.Conn) {
	defer conn.Close()
	for {
		select {
		case <-c.done:
			return
		default:
		}
		var wg sync.WaitGroup
		wg.Add(2)
		go func() {
			defer wg.Done()
			if err := c.recvLoop(conn); err != nil {
				select {
				case <-c.done:
				default:
					c.logf("SlowDNS DoT recv: %v", err)
				}
			}
		}()
		go func() {
			defer wg.Done()
			if err := c.sendLoop(conn); err != nil {
				select {
				case <-c.done:
				default:
					c.logf("SlowDNS DoT send: %v", err)
				}
			}
		}()
		wg.Wait()
		conn.Close()
		select {
		case <-c.done:
			return
		default:
		}
		next, err := c.dialOnce()
		if err != nil {
			c.logf("SlowDNS DoT sambung ulang: %v", err)
			return
		}
		conn = next
	}
}

func (c *tlsPacketConn) recvLoop(conn net.Conn) error {
	br := bufio.NewReader(conn)
	for {
		var length uint16
		if err := binary.Read(br, binary.BigEndian, &length); err != nil {
			if err == io.EOF {
				return nil
			}
			return err
		}
		p := make([]byte, int(length))
		if _, err := io.ReadFull(br, p); err != nil {
			return err
		}
		c.QueuePacketConn.QueueIncoming(p, turbotunnel.DummyAddr{})
	}
}

func (c *tlsPacketConn) sendLoop(conn net.Conn) error {
	bw := bufio.NewWriter(conn)
	for {
		select {
		case <-c.done:
			return nil
		case p := <-c.QueuePacketConn.OutgoingQueue(turbotunnel.DummyAddr{}):
			length := uint16(len(p))
			if int(length) != len(p) {
				return fmt.Errorf("paket DoT terlalu panjang: %d", len(p))
			}
			if err := binary.Write(bw, binary.BigEndian, length); err != nil {
				return err
			}
			if _, err := bw.Write(p); err != nil {
				return err
			}
			if err := bw.Flush(); err != nil {
				return err
			}
		}
	}
}
