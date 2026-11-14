# Prompt & Proses Aset Merek Wanz Tunnel

Semua aset identitas Wanz Tunnel dibuat dengan AI (**Seedream 5.5** via
WaveSpeed) khusus untuk proyek ini, lalu diolah ulang secara deterministik
dengan Python/Pillow. Tidak ada aset yang disalin dari aplikasi lain
(termasuk HTTP Custom). Kunci API tidak disimpan di repositori; skrip
pembangkit membaca variabel lingkungan `WAVESPEED_API_KEY`.

## 1. Monogram W (`wanz-mark-1024.png`)

Dibangkitkan 5 kandidat logo (A–E) dengan prompt dasar:

> Minimalist flat vector logo for an Android VPN/SSH tunnel app named
> "Wanz Tunnel". The letter W formed by two rounded tunnel arches seen in
> perspective, bold thick rounded strokes, single solid green color
> (#4CAF50) on a fully transparent background, no text, no gradients, no
> shadows, no extra decorations, centered, clean geometric app-icon style.

Kandidat **B** dipilih karena bentuknya paling jelas terbaca sebagai W dan
paling tahan terhadap pengecilan. Kandidat B ternyata tergambar terbalik,
sehingga diolah dengan langkah berikut (semua deterministik, tanpa AI
tambahan):

1. **Rotasi 180°** agar lengkungan terbaca sebagai huruf W.
2. **Perataan warna**: seluruh piksel buram diratakan menjadi hijau
   palet `#4CAF50` (alpha asli dipertahankan).
3. **Penebalan**: alpha dimaksimalkan dengan `MaxFilter(31)` agar goresan
   lebih tebal dan tetap terbaca pada ukuran ikon kecil.
4. ** Pewarnaan ulang setelah dilatasi** untuk menghapus halo hitam tepi,
   lalu dipangkas ke bounding box alpha.
5. Hasil akhir disimpan sebagai `brand/wanz-mark-1024.png` (kanvas 1024px,
   mark transparan).

## 2. Ikon launcher adaptif

- Latar: charcoal solid `#15171A` (`wanz_icon_bg`, sama untuk mode terang
  dan gelap).
- Foreground: `ic_launcher_foreground.png` — monogram W hijau dipadatkan
  ke **40% kanvas 432px**. Ukuran 50–60% sudah terpotong pada mask bulat/
  squircle launcher, sehingga 40% dipakai sebagai kompromi aman.
- Layer monokrom: `ic_launcher_monochrome.png` — salinan putih dari
  foreground untuk ikon bertema (themed icons) Android 13+.

## 3. Ubin merek (`wanz_tile.png`, 512px)

Ubin rounded-square charcoal `#15171A` dengan monogram W hijau di tengah.
Dipakai di laci navigasi dan dialog Tentang agar identitas konsisten dengan
launcher. Sumber komposit: `brand/wanz-icon-512.png`.

## 4. Ilustrasi terowongan (`about-tunnel-1600.webp`)

Prompt:

> Flat minimal vector illustration of a modern road tunnel interior in
> one-point perspective, curved gray concrete walls, a green illuminated
> path running through the center, dark charcoal color scheme with green
> (#4CAF50) accents, no text, no people, no vehicles, clean geometric
> shapes, subtle depth, app banner composition, wide aspect ratio.

Banner dikompres ke WebP (`about_tunnel.webp`, ~35 KB) untuk dipakai di
bagian atas dialog Tentang.

## 5. Catatan lisensi & orisinalitas

- Monogram W dan ilustrasi terowongan dibangkitkan khusus untuk Wanz
  Tunnel dan tidak berasal dari aplikasi, situs, atau karya berhak cipta
  lain.
- Ikon Material yang dipakai di aplikasi tetap berasal dari set Material
  Symbols (Apache 2.0) dan tidak diubah.
- Berkas sumber akhir disimpan di folder `brand/`; kandidat mentah AI
  tidak disertakan di repositori.
