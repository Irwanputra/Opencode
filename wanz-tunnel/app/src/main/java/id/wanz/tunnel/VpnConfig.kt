package id.wanz.tunnel

/**
 * Membangun konfigurasi YAML untuk hev-socks5-tunnel.
 *
 * Konfigurasi disusun baris-per-baris supaya blok opsional `mapdns` selalu
 * mendapat indentasi yang benar (bug 2.6: interpolasi + trimIndent merusak
 * indentasi mapdns sehingga VPN tersambung tetapi DNS mati).
 *
 * Nilai MTU dan model alamat mengikuti HTTP Custom (hasil reverse
 * engineering `Tun2SocksService`/`C1944`): MTU 1500 dan hanya IPv4.
 * HTTP Custom memakai `setMtu(0x5dc)` = 1500, `addAddress(IPv4, 32)`,
 * tanpa alamat/route IPv6.
 */
internal object VpnConfig {
    /** MTU yang dipakai HTTP Custom: 0x5dc = 1500. */
    const val MTU = 1500

    /** Alamat virtual interface IPv4 (sama seperti HTTP Custom). */
    const val VPN_ADDRESS = "198.18.0.1"

    /** Alamat DNS virtual untuk mapped-DNS. */
    const val MAPPED_DNS = "198.18.0.2"

    fun hevConfig(socksPort: Int, mappedDns: Boolean, mtu: Int = MTU): String {
        val port = socksPort.coerceIn(1024, 65535)
        val safeMtu = mtu.coerceIn(576, 8500)
        val lines = mutableListOf(
            "tunnel:",
            "  mtu: $safeMtu",
            "  icmp: 'reply'",
            "socks5:",
            "  port: $port",
            "  address: '127.0.0.1'",
            // SSH hanya meneruskan TCP. UDP dimatikan; DNS ditangani mapdns.
            "  udp: 'off'"
        )
        if (mappedDns) {
            lines += listOf(
                "mapdns:",
                "  address: $MAPPED_DNS",
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
