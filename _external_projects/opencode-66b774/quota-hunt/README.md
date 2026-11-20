# quota-hunt — pemburu host/prefix *unmetered*

Alat buat Langkah 2: **cari host/prefix yang tidak dihitung kuota**, lalu ubah jadi
endpoint inject. Prinsipnya operator meng-allowlist **prefix IP (CIDR)**, bukan hostname —
jadi hasil akhirnya daftar prefix, bukan daftar host.

## Requirements

| Tool | Fungsi | Debian/Ubuntu | Termux (Android) |
|---|---|---|---|
| `bash`, `curl`, `xargs` | wajib | bawaan | bawaan |
| `dig` | resolve + ASN lookup | `dnsutils` | `pkg install bind-tools` |
| `ncat` / `nc` | tes POST-inject port 80 | `netcat-openbsd` | `pkg install netcat-openbsd` |
| `openssl` | tes CONNECT:443 | bawaan | `pkg install openssl` |
| `iperf3` | payload terukur (opsional) | `iperf3` | `pkg install iperf3` |
| `jq` | parsing (opsional, ada fallback) | `jq` | `pkg install jq` |

**Jalankan dari perangkat yang duduk di jaringan operator yang mau diburu**
(hp via Termux, atau router). Bukan dari VPS.

## Urutan jalan

```bash
bash probe.sh init          # seed daftar host + deteksi DNS operator
bash probe.sh dns           # cek port 53 dibajak / split-horizon
bash probe.sh resolve       # resolve massal: DNS operator vs DoH, lalu di-diff
bash probe.sh map           # IP -> ASN + CIDR pemilik (butuh internet)
bash probe.sh aggregate     # clustering: prefix mana yang menampung banyak host
bash probe.sh candidates 25 # susun 25 kandidat IP
bash probe.sh validate      # port + CONNECT:443 + POST-inject:80
bash probe.sh payload 100   # payload 100MB terukur (alias: test)
bash probe.sh measure www.google.com <ip>   # wizard delta kuota -> kurva_quota.log
bash probe.sh report        # snapshot ke laporan.md
```

Skip `map`/`aggregate` offline dengan `SKIP_NET=1 bash probe.sh map`.
`payload` selalu mengunduh ukuran tetap dari Cloudflare — itu yang penting buat pengukuran.
Untuk menaruh payload di IP kandidat, jalankan server iperf3/HTTP sendiri di IP itu lalu
bandingkan delta-nya.

## Cara baca hasilnya

`resolve`:
- **Host tidak dijawab DNS operator** → blokir di level DNS. Sering berarti host itu ada di
  rule khusus, bisa dicoba lewat DoH.
- **Split-horizon** (IP operator ≠ IP DoH) → IP versi operator adalah IP yang dihitung
  charging. IP internal (`10.x`, `100.64.x`, `17x.x`) = jalur bypass klasik.

`aggregate`:
- Prefix yang menampung **banyak host gratis** → kemungkinan allowlist per-prefix.
- Prefix yang host gratis & berbayarnya **bercampur** → rule per-IP, lebih rapuh, lebih
  banyak celah.
- Prefix **cloud** (Cloudflare/Oracle/AWS) → incaran utama: kamu bisa sewa IP sendiri di
  dalam prefix itu, bukan numpang host orang.

`validate` — kolom `POST-inject:80`:
- `BUG-POST-CONNECT` (`HTTP/1.0 200 Connection established`) → **gateway tidak membaca SNI**.
  Ini bug yang paling dicari: data mentah bisa ngalir, klasifikasi SNI tidak terjadi.
- `proxy-jawab` → cuma proxy biasa, tidak ada bug.

`payload` / `measure` — ambang keputusan:

| Delta kuota reguler | Kesimpulan |
|---|---|
| 0 MB | **Unmetered** — bug ketemu |
| < payload (mis. 10 MB utk 100 MB) | Sampling/flow-based charging — tetap boros, jangan daily |
| = payload | Ter-meter penuh, tidak ada bypass |

**Wajib**: jalankan `measure` dengan canary dulu (host yang kamu tahu berbayar). Tanpa canary
yang habis, kamu tidak tahu apakah counter yang kamu baca benar.

## Jebakan

1. **IPv6-only free** — prefix v6 sering tidak masuk rule. Kalau IPv4 habis, cek v6.
2. **Sampling charging** — kelihatan gratis, padahal kuota jalan pelan.
3. **IP rotasi CDN** — hari ini lolos, besok IP berubah langsung kena meter. Pin IP-nya
   (`--resolve` / hosts file).
4. **Counter salah** — yang dibaca harus **reguler**, bukan kuota app.
5. **Salah bucket ≠ gratis** — traffic masuk kuota Ns/edu. Tetap dihitung, cuma bukan dari
   kuota WhatsApp.
6. **Ulangi 3× di jam berbeda.** Banyak rule berubah saat beban tinggi.

## Jaga temuan

`report` menghasilkan baris berformat:

```
ip | prefix | owner | 80 | 443 | POST-inject | CONNECT | tanggal | status
```

Isi kolom `status` dengan `LIVE` / `DEAD`. Kalau bulan depan kuota mulai jalan, re-run tes
yang sama → kamu tahu persis kapan rule operator berubah. Simpan **satu host canary** buat
cek rutin. Jangan share temuan luas-luas: makin ramai, makin cepat di-patch.
