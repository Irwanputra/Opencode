package id.wanz.tunnel

/**
 * Membangun konfigurasi YAML untuk hev-socks5-tunnel.
 *
 * Konfigurasi disusun baris-per-baris supaya blok opsional `mapdns` selalu
 * mendapat indentasi yang benar. Bug 2.6: blok `mapdns` disisipkan lewat
 * string interpolation lalu di-`trimIndent()`, sehingga indentasinya rusak
 * dan tun2socks gagal memetakan DNS → VPN tersambung tetapi tidak bisa
 * internetan.
 */
internal object VpnConfig {
    fun hevConfig(socksPort: Int, mappedDns: Boolean): String {
        val port = socksPort.coerceIn(1024, 65535)
        val lines = mutableListOf(
            "tunnel:",
            "  mtu: 8500",
            "  icmp: 'reply'",
            "socks5:",
            "  port: $port",
            "  address: '127.0.0.1'",
            "  udp: 'off'"
        )
        if (mappedDns) {
            lines += listOf(
                "mapdns:",
                "  address: 198.18.0.2",
                "  port: 53",
                "  network: 240.0.0.0",
                "  netmask: 240.0.0.0",
                "  cache-size: 10000"
            )
        }
        lines += listOf(
            "misc:",
            "  task-stack-size: 86016",
            "  connect-timeout: 10000",
            "  log-level: warn"
        )
        return lines.joinToString("\n", postfix = "\n")
    }
}
