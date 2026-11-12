# Catatan Desain — Wanz Tunnel 2.7 ("Aurora Bento")

Ringkasan riset dan penerapannya di aplikasi.

## Sumber & prinsip yang dipakai

1. **Material 3 Expressive (Google, 2025–2026)**
   - Target sentuh besar, warna vibrant, bentuk tegas, gerak berbasis fisika.
   - Riset Google: elemen utama 4× lebih cepat ditemukan pada layout ekspresif.
   - Penerapan: orb koneksi 190dp sebagai satu-satunya aksi utama, cincin
     gradien, respons pegas saat ditekan, angka metrik besar.

2. **Calm design (tren 2026)**
   - Sedikit pilihan per layar, ruang kosong cukup, warna menunjuk bukan berteriak.
   - Penerapan: aksi Salin/Bersihkan dipindah ke layar Log; beranda hanya
     menyisakan orb + metrik + cuplikan log.

3. **Bento grid**
   - Blok dengan ukuran berbeda sesuai bobot informasi.
   - Penerapan: kartu PING lebih besar (dengan sparkline), UPTIME kecil,
     MODE & TRANSPORT seimbang, SERVER sebagai baris lebar.

4. **Glassmorphism 2.0**
   - Panel kaca di atas dasar gelap, kontras teks tetap tinggi.
   - Penerapan: kartu putih transparan 4–9% dengan garis 12% di atas latar
     aurora hampir hitam.

## Sistem visual

| Token | Nilai |
|---|---|
| Latar | `#05040C → #0C0817` |
| Aksen utama | Violet `#A78BFA` |
| Sukses / ping | Mint `#5EEAD4` |
| Peringatan | Amber `#FFC96B` |
| Galat | Coral `#FF7589` |
| Teks | `#F6F2FF` |
| Teks sekunder | `#9C93BB` |
| Sudut kartu | 24–26dp |
| Sudut pil | 99dp (kapsul) |

Tipografi: sans-serif black untuk status/angka, medium untuk label,
monospace untuk timer dan log.

## Data yang ditampilkan (bukan kosmetik)

- **Ping** — hasil uji TCP nyata lewat kanal SSH, plus sparkline 22 hasil terakhir.
- **Uptime** — dihitung dari waktu koneksi berhasil, diperbarui tiap detik.
- **Mode / Transport** — dibaca dari profil aktif.
- **Server** — host:port profil aktif.
- **Status** — `Terlindungi` hanya jika uji DNS + TCP internal berhasil;
  jika tunnel hidup tapi internet gagal, tampil amber "Terhubung tanpa internet".

## Gerak

- Aurora: drift sangat lambat, di-throttle ~10 fps agar hemat daya.
- Orb: cincin berputar saat menyambung, glow bernapas saat terhubung.
- Sentuhan orb: mengecil 0,95× lalu memantul (OvershootInterpolator).
