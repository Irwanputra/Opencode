# AXIS Coin -> Kuota via Python

Yang ditukar: **AXIS Coin di New Alifetime** (AXISnet v9.0.0+, pojok kanan bawah).
Bukan Parade Bonus / Sureprize (gratis, tanpa potong koin).

## Yang perlu lu tahu dulu

- **Dapet koin dari:** klaim bulanan di tanggal aktivasi kartu, isi pulsa, beli paket, redeem AIGO, misi.
- **Level (naik pakai koin, nggak bisa lompat):** Kenalan 0 → Temenan 105 → Deketan 120 → Jadian 200 → Soulmate 270 → True Love 330.
  Evaluasi 3 bulanan: Temenan 105, Deketan 165, Jadian 225, Soulmate 315, True Love 345. Kurang = turun 1 level.
- **Koin hangus 180 hari** sejak terakhir didapat.
- **Bisa ditukar:** kuota internet harian, telepon 5 menit semua operator (1 hari), perpanjang masa aktif, pulsa darurat, tiket Flash War, kuota WhatsApp (sampai 2GB di promo), voucher Flash Coffee / McD / Bakmi GM / dll.
- **Nggak bisa:** jadi pulsa utama, diuangkan, jadi DANA.
- **\*808# nggak bisa tukar koin** — wajib lewat AXISnet / API ini.
- Harga katalog berubah-ubah. Contoh promo Harpelnas 3-4 Sep 2026 (bukan harga tetap): Kenalan 40 koin = 1GB/3 jam, Temenan 40 koin = 2GB/4 jam, Deketan 45 koin = 2GB/5 jam, Jadian 50 koin = 3GB/6 jam, Soulmate 55 koin = 3GB/8 jam, True Love 70 koin = 5GB/12 jam.

## Cara jalanin

```bash
pip install requests cryptography
python3 axis_koin.py
```

1. Pilih `1`, masukin nomor AXIS (0831/0832/0833/0838), masukin OTP 6 digit dari SMS.
2. Pilih `2` buat cek saldo koin + level.
3. Pilih `4`, keyword `COIN` / `ALIFETIME` / `WhatsApp` buat cari katalog.
4. Pilih `5` buat tukar — masukin `package_option_code` dari no. 4, konfirmasi `y`.

Token login disimpan lokal di `.axis_session.json` di folder ini. Jangan dishare, jangan kasih OTP ke siapa pun.

## Jujur soal batasnya

- Cek koin (`api/v8/profile`, field `point`) dan cari katalog (`api/v9/xl-stores/options/search`) itu pakai API myXL yang sama kayak EnQuota — sudah diverifikasi rumusnya dari source EnQuota.
- **Tukar koin Alifetime belum 100% pasti lewat endpoint toko myXL.** EnQuota sendiri cuma expose `eq_get_profile` (loyalty points), `eq_get_packages`, dan `eq_buy_package` (potong pulsa / QRIS) — tidak ada tool khusus redeem coin. Kalau di langkah no. 5 detail paketnya tidak menyebut coin/point sebagai pembayaran, berarti reward itu pakai endpoint Alifetime khusus di AXISnet, dan script akan nunjukin raw response-nya supaya lu tahu — jangan lanjut ke settlement pulsa.
- Kalau XL ganti kunci statis / versi app, script bisa gagal 401 atau decrypt gagal. Itu tandanya kunci kadaluarsa, bukan nomor lu bermasalah.

Sumber: [Cara Tukar Point AXIS di Alifetime](https://www.sukmaconvert.co.id/cara-tukar-point-axis/), [EnQuota README](https://github.com/najihh/enquota/blob/HEAD/README.md), [EnQuota TECHSPEC](https://github.com/Najihh/EnQuota/blob/HEAD/docs/TECHSPEC.md)
