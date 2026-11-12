package id.wanz.tunnel

/**
 * Sistem visual "Panel" (v2.8).
 *
 * Arah: panel instrumen jaringan di atas kertas. Bukan gelap-neon, bukan kaca,
 * bukan gradien. Warna hanya dipakai untuk menyatakan status koneksi; sisanya
 * tinta di atas kertas. Semua permukaan datar, sudut 2dp, garis 1dp.
 */
internal val BG = 0xFFF1F1EC.toInt()
internal val PANEL = 0xFFE8E8E2.toInt()
internal val FIELD = 0xFFEAEAE4.toInt()
internal val INK = 0xFF15171A.toInt()
internal val MUTED = 0xFF5F645F.toInt()
internal val FAINT = 0xFF9B9F99.toInt()
internal val HAIR = 0xFFC7C9C2.toInt()

/** Status koneksi — satu-satunya warna semantik. */
internal val OK = 0xFF146B46.toInt()
internal val WARN = 0xFF8A5300.toInt()
internal val ERR = 0xFFA3261B.toInt()

/** Teks terang di atas bidang tinta. */
internal val PAPER = 0xFFF4F4EF.toInt()
