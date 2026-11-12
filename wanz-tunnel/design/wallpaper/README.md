# Latar foto — kandidat siap pasang (sementara ditunda)

Pemakai minta latar aplikasi memakai foto Freya JKT48 dari Pinterest, dengan
syarat foto tidak burik dan teks tetap terbaca. Sesi pencarian sudah selesai dan
hasinya disimpan di sini; pemasangannya sengaja **ditunda** atas permintaan
pemakai ("nanti lah, sekarang jangan pake foto dulu"). Jadi aplikasi v2.9 tetap
bercanvas grafit solid, dan APK tidak ikut membengkak 2,4 MB.

## Isi folder

Dua belas potret siap tempel, sudah dipotong ke rasio layar 1080x2340
(WebP quality 76, 32 KB sampai 418 KB) plus pratinjau kecil di `th/` untuk
dialog pemilih nanti. Master aslinya (1536x2048 sampai 3104x4096) ada di mesin
dev, di luar repo.

| berkas | label pilihan | master | topik Pinterest | ukuran |
|---|---|---|---|---|
| `freya_01.webp` | dekat, latar abu | 2160x3840 | `freya-jkt48-close-up` | 85 KB |
| `freya_02.webp` | beret warna, latar gelap | 1943x3372 | `freya-jkt48-pinterest` | 195 KB |
| `freya_03.webp` | gelap, rambut urai | 1536x2048 | `freya-jkt48-full-body` | 211 KB |
| `freya_04.webp` | rias mata, kostum merah | 1536x2048 | `freya-jkt48-cute-smile` | 219 KB |
| `freya_05.webp` | turtleneck, latar krem | 1536x2048 | `freya-jkt-48` | 195 KB |
| `freya_06.webp` | kacamata, kemeja cokelat | 1938x3101 | `freya-jkt48-wallpaper` | 418 KB |
| `freya_07.webp` | panggung, gaun ungu | 1920x3413 | `freya-jkt48-hd-quality` | 152 KB |
| `freya_08.webp` | panggung, hiasan bunga | 2160x3840 | `id_jkt48-freya` | 61 KB |
| `freya_09.webp` | tutu lilac, seluruh badan | 2306x4096 | `freya-jkt48-smiling-portrait` | 32 KB |
| `freya_10.webp` | kostum merah, melambai | 2731x4096 | `freya-jkt48-close-up` | 336 KB |
| `freya_11.webp` | kebaya tradisional | 3104x4096 | `freya-jayawardana-official-photo` | 226 KB |
| `freya_12.webp` | senja di pantai | 1537x2048 | `freya-jkt48-hd` | 112 KB |

Semua kandidat sudah lewat tiga saringan: sisi terpendek minimal 1000 px pada
berkas aslinya (dibaca dari metadata `orig` di halaman Pinterest, bukan
diperkirakan), rasio potret 1,15 sampai 2,15, dan dHash untuk membuang kembaran
yang cuma beda crop. Foto member lain (Sonya, Anindya) dan format kolase
dibuang.

## Cara memasangnya nanti

1. Salin folder ini ke `app/src/main/assets/wall/`, pratinjau ke
   `app/src/main/assets/wall/th/`.
2. Tambah seksi **Latar** di Pengaturan: pemilih `InkSelect` berlabel foto,
   slider "Kegelapan latar", dan toggler "Pakai foto dari galeri" kalau
   pemakai mau foto sendiri.
3. Isi panel dibuat semi-opaque, bukan transparan penuh: alpha `0xDB` untuk
   `PANEL` dan `FIELD`, dengan scrim warna `BG` di atas foto sebesar nilai
   slider (default 70). Angka itu tidak dikira-kira — lihat bawah.
4. `InkActivity` memasang lapisan foto sebelum konten, dan chrome jendela ikut
   mengikuti (sudah ada pola `applyWindowChrome`).
5. Cek ulang sebelum commit: `python3 tools/wall_contrast.py`.

## Kenapa angka panel dan scrim begitu

Skrip `tools/wall_contrast.py` menumpuk lapisan yang sebenarnya terjadi
(foto -> scrim `BG` -> panel `PANEL` semi-opaque), lalu mengukur kontras token
teks terhadap wilayah foto yang paling terang (persentil 96) dari kedua belas
foto, di kedua palet. Hasil pada alpha 0,86 dan scrim 0,70:

```
gelap/ink   13,38:1   gelap/muted  6,60:1   gelap/faint  4,57:1
terang/ink  14,28:1   terang/muted 4,80:1   terang/faint 4,51:1
```

Artinya label micro 9,5sp (`FAINT`) tetap di atas 4,5:1 pada foto paling
terang sekalipun, bukan hanya pada tangkapan layar yang kebetulan bagus.
Menurunkan slider di bawah 70 adalah pilihan pemakai, dan itu tercatat sebagai
konsekuensi, bukan kejutan.

## Catatan lisensi

Sumbernya Pinterest (repin), jadi fotografer aslinya belum diketahui dan tidak
ada lisensi eksplisit. Untuk APK pribadi tidak masalah, tapi kalau aplikasi
dipublikasikan luaskan: ganti ke foto berlisensi (Wikimedia Commons punya 20
potret Freya Jayawardana CC BY 4.0 / CC BY-SA 4.0 pada resolusi 1920x2880 dan
sudah ikut diunduh) atau cantumkan kredit ke pemegang hak.
