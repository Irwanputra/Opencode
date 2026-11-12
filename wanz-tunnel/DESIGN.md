# Wanz Tunnel — Arah Desain "Panel"

Dokumen ini mengunci satu arah visual. Tujuannya bukan "terlihat modern",
tetapi **terlihat dibuat dengan sengaja** — sehingga tidak bisa langsung
ditebak sebagai UI hasil generator.

## Ide

Wanz Tunnel adalah alat jaringan. Tampilannya mengikuti **panel instrumen**:
kertas terang, tinta hitam, garis rambut, angka tabular, dan satu tombol aksi
lebar. Warna tidak dipakai sebagai hiasan; warna adalah status.

Uji cepat: kalau logo diganti logo lain, aplikasi ini masih jelas "alat
tunnel" karena susunannya mengikuti isi (status, ping, uptime, server, log),
bukan susunan kartu generik.

## Yang dilarang (filter anti-slop)

Mengacu pada `smoothui.dev/blog/ai-design-slop`,
`Vanszs/Anti-AI-UI` (SKILL.md), dan `funboy322/avoid-ai-design`:

- Tidak ada gradien ungu/indigo, aurora, glow, atau orb.
- Tidak ada glassmorphism, bayangan lembut, atau kartu kaca.
- Tidak ada emoji sebagai ikon.
- Tidak ada hero di tengah dengan satu tombol besar.
- Tidak ada deretan kartu berukuran sama (bento generik).
- Tidak ada sudut membulat seragam 20–28dp; sudut UI ini 2dp.
- Tidak ada teks hype ("super cepat", "aman total") atau label dekoratif
  `01 / 02 / 03`.
- Tidak ada terminal hijau-di-hitam, tidak ada aksen asam, tidak ada
  krem–terakota.
- Tidak ada animasi yang tidak membawa informasi.

## Token

| Peran | Nilai |
|---|---|
| Kertas (latar) | `#F1F1EC` |
| Panel (log) | `#E8E8E2` |
| Field | `#EAEAE4` |
| Tinta (teks/aksi) | `#15171A` |
| Teks sekunder | `#5F645F` |
| Teks samar | `#9B9F99` |
| Garis rambut | `#C7C9C2` |
| Terhubung | `#146B46` |
| Menyambung / peringatan | `#8A5300` |
| Gagal | `#A3261B` |
| Teks di atas tinta | `#F4F4EF` |

Bentuk: sudut 2dp. Garis 1dp. Tanpa elevasi. Tombol aksi 56dp.

## Tipografi

- Judul layar dan status: sans-serif medium, 27–34sp, tracking negatif tipis,
  rata kiri.
- Label bagian dan nilai teks: sans-serif 11–18sp.
- Angka (ping, uptime, host, log): monospace, tabular.
- Tidak ada huruf kapital semua sebagai gaya; hanya merek "WANZ TUNNEL".

## Susunan beranda

1. Rel status 4dp di tepi atas: abu saat diam, hijau saat terhubung, merah
   saat gagal, satu segmen berjalan saat menyambung.
2. Kop: tanda kotak tinta + "WANZ TUNNEL", tombol penggeser di kanan.
3. Status: satu kata besar (`Terputus`, `Menyambungkan`, `Terhubung`,
   `Tanpa internet`, `Gagal`) + satu kalimat penjelas.
4. Tabel bacaan 2×2 dengan garis rambut: Ping (+ riwayat bilah), Uptime,
   Mode, Transport.
5. Server aktif: nama, `host:port` monospace, panah.
6. Aktivitas: enam baris log terakhir, panel datar.
7. Bilah bawah menempel: tombol aksi lebar + versi.

Pengaturan dan Log memakai sistem yang sama: judul bagian bergaris, field
datar, segmen SOCKS5/VPN dengan bidang tinta penuh, daftar aksi tanpa kartu.

## Gerak

Hanya dua, keduanya membawa informasi:

- Segmen rel status berjalan selama proses menyambung.
- Garis kemajuan di tombol selama proses menyambung.

Tidak ada animasi masuk, parallax, atau denyut saat sudah terhubung.

## Status

- `Terhubung` hanya muncul jika tunnel aktif **dan** self-test DNS + TCP
  berhasil.
- Jika tunnel aktif tetapi internet gagal: `Tanpa internet`, warna amber,
  disertai penjelasan.
- Alamat proxy lokal tidak ditampilkan sebagai status saat terhubung.
