// Proteksi socket dari VPN.
//
// Saat mode VPN aktif, semua trafik aplikasi (termasuk socket UDP milik
// pustaka ini) dialihkan ke TUN. Tanpa proteksi, query DNS SlowDNS akan
// masuk kembali ke VPN → tun2socks → SOCKS → SSH yang justru berjalan di
// atas SlowDNS: lingkaran yang membuat terowongan diam dan ping timeout.
//
// HTTP Custom menyelesaikan ini dengan SocketProtector (VpnService.protect)
// yang dipanggil untuk setiap socket resolver. API di file ini meniru
// perilaku tersebut: aplikasi mendaftarkan implementasi Protect, lalu setiap
// socket yang dibuat pustaka ini diproteksi lewat syscall.RawConn sebelum
// dipakai.
package slowdns

import (
	"context"
	"net"
	"sync"
	"syscall"
)

// SocketProtector melindungi sebuah file descriptor socket dari routing VPN.
// Implementasi di sisi Android biasanya memanggil VpnService.protect(fd).
type SocketProtector interface {
	// Protect mengembalikan true bila socket berhasil diproteksi.
	Protect(fd int) bool
}

// Pakai mutex, bukan atomic.Value: atomic.Value.Store(nil) panic
// ("store of nil value into Value"), dan sisi Android memang memanggil
// setSocketProtector(null) setiap kali tunnel dihentikan.
var (
	protectorMu sync.RWMutex
	protector   SocketProtector
)

// SetSocketProtector mendaftarkan pelindung socket. Panggil sebelum Start;
// nil berarti tidak ada proteksi (mis. saat VPN belum aktif).
func SetSocketProtector(p SocketProtector) {
	protectorMu.Lock()
	protector = p
	protectorMu.Unlock()
}

// protectFd memanggil pelindung yang terdaftar, bila ada.
func protectFd(fd uintptr) {
	protectorMu.RLock()
	p := protector
	protectorMu.RUnlock()
	if p == nil {
		return
	}
	if !p.Protect(int(fd)) {
		logf("SlowDNS: proteksi socket resolver gagal")
	}
}

// controlProtect adalah callback net.ListenConfig/net.Dialer.Control yang
// memproteksi fd tepat setelah socket dibuat dan sebelum dipakai.
func controlProtect(network, address string, c syscall.RawConn) error {
	var controlErr error
	if err := c.Control(func(fd uintptr) { protectFd(fd) }); err != nil {
		controlErr = err
	}
	return controlErr
}

// listenUDP membuka socket UDP yang sudah diproteksi dari VPN.
func listenUDP() (*net.UDPConn, error) {
	lc := net.ListenConfig{Control: controlProtect}
	pc, err := lc.ListenPacket(context.Background(), "udp", ":0")
	if err != nil {
		return nil, err
	}
	conn, ok := pc.(*net.UDPConn)
	if !ok {
		pc.Close()
		return nil, &net.OpError{Op: "listen", Net: "udp", Err: syscall.EINVAL}
	}
	return conn, nil
}

// dialUDP membuat koneksi UDP terproteksi ke alamat resolver.
func dialUDP(addr *net.UDPAddr) (*net.UDPConn, error) {
	d := net.Dialer{Control: controlProtect}
	conn, err := d.DialContext(context.Background(), "udp", addr.String())
	if err != nil {
		return nil, err
	}
	udp, ok := conn.(*net.UDPConn)
	if !ok {
		conn.Close()
		return nil, &net.OpError{Op: "dial", Net: "udp", Err: syscall.EINVAL}
	}
	return udp, nil
}
