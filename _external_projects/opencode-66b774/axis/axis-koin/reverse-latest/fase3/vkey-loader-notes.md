# Fase 3 — V-Key native loader (libfgazvajhxc.so): analisis + dekripsi buffer tmp*

Tanggal: 2026-11-20. Kerja statis saja. Tidak login, tidak OTP, tidak menjalankan APK.
Target: AXISnet 11.1.0 (858), `com.axis.net`.

## 0. Hasil utama — BERHASIL

**Ketujuh file `assets/tmp*` berhasil didekripsi menjadi DEX yang valid.**
Algoritma: **AES-256-GCM** (mbedtls, statis di dalam .so), **tanpa AAD**,
IV = 12 byte pertama file, tag = 16 byte terakhir, ciphertext = sisanya;
hasil dekripsi = **gzip** → inflate → DEX.
Kunci 32 byte per file = XOR dua belahan 32 byte dari `.data` loader
(bukan dari device/app properties, bukan dari assets/signature/firmware).
Semua tag GCM terverifikasi dan semua checksum Adler32 DEX cocok.
Total 7.454 class_def (sebelumnya 0 di DEX stub).

Reproduksi: `python3 vkey_decrypt.py` (stdlib + pycryptodome).
DEX hasil ada di folder ini (`tmp*.dex`).

## 1. Inventaris loader

| Item | Nilai |
|---|---|
| Loader | `lib/arm64-v8a/libfgazvajhxc.so`, 273.216 byte, ELF64 AArch64, stripped, SONAME aneh: `libnativelib.so` |
| Versi V-Key | **DexObfuscator 0.2.4** (string log `VKEYObfuscation`, tag `********** V-Key DexObfuscator version: %s **********`) |
| NEEDED | libandroid, liblog, libz, libm, libdl, libc (BIND_NOW) |
| Crypto | mbedtls **statis di-link** ke dalam .so (simbol `mbedtls_gcm_*`, `mbedtls_aes_*`, `mbedtls_cipher_*` ter-export di dynsym). Yang dipakai loader: `mbedtls_gcm_init/setkey/auth_decrypt/free` + zlib `inflateInit2_/inflate/inflateEnd` |
| Anti-tamper | `libchecks.so` (24.832 byte, lihat §6) + `libvosWrapperEx.so` (V-OS Processor, lihat §5) |

### 1.1 Rantai panggil Java → native (dari DEX stub `classes.dex`)

Stub Application: `Lkyaks/snmzj; extends Landroid/app/Application;`
(class_def #7967 di `classes.dex`).

- `<clinit>`: `System.loadLibrary("fgazvajhxc")`
- `attachBaseContext`: `super.attachBaseContext()` lalu `hqore()` (native, `()V`)
- `onCreate`: `super.onCreate()` lalu `vkjhn()` (native, `()V`)

`JNI_OnLoad` (0x1a9c0): `GetEnv(vm, &env, JNI_VERSION_1_6)` → log versi 0.2.4 →
`0x1aa60`: `FindClass("kyaks/snmzj")` → `RegisterNatives(env, clazz, methods=0x42668, n=2)`:
- `{"hqore", "()V", 0x1aac0}` — loader dex
- `{"vkjhn", "()V", 0x1b90c}` — attach/swap Application

### 1.2 `hqore` = loader dex (0x1aac0, ±0xE00 byte)

1. `getuid()` + cek opaque `uid % 100000` vs konstanta `0x1005f8f` (16.801.679) —
   cabang tidak pernah terpanggil karena `uid%100000 < 100000` (dead check;
   cek yang sama, terbalik, ada di awal `vkjhn`). Kemungkinan anti-analisis/
   sisa template; tidak menghalangi apa pun.
2. `Context.getDir("Dev", MODE_PRIVATE)` → direktori privat (dipakai hanya di
   jalur SDK 21–25).
3. `context.getClassLoader()` → `ClassLoader.pathList` (field `DexPathList`).
4. `new ArrayList` (untuk suppressed exceptions) + `Build.VERSION.SDK_INT`:
   - **SDK > 25 (API 26+)**: `DexPathList.makeInMemoryDexElements(ByteBuffer[], List)`
     → `Element[]` (in-memory, tanpa file).
   - **SDK 21–25**: `DexPathList.makeDexElements(List, File, List)` /
     `makePathElements(List, File, List)` → file-based (lihat §1.3).
5. Loop `i = 0..6` atas tabel nama (`.data` 0x4a1b0, urutan persis):
   `tmp17680616876221785051`, `tmp3065699920606524921`, `tmp14169616706995394833`,
   `tmp13997699941173334308`, `tmp12794277964480025953`, `tmp7028462203480471573`,
   `tmp13784499609711825650`.
   Per file: `AAssetManager_open(name, mode 3)` → `AAsset_read` seluruh file →
   dekripsi GCM (§2) → `0x1c218` decompress (§3) → `ByteBuffer.wrap(byte[])` →
   simpan ke `ByteBuffer[7]`.
6. `makeInMemoryDexElements(buffers, list)` → gabung `Element[]` lama + baru,
   lalu `SetObjectField(pathList, "dexElements", merged)` (field `[Ldalvik/system/DexPathList$Element;`).
7. Jalur SDK ≤ 25: hapus file `vkey0<i>.dex` dari list lama (`ArrayList.get(i)` →
   `File.delete()`).

### 1.3 Jalur file (SDK 21–25, 0x1b0fc–0x1b64c)

Per tmp file: dekripsi + decompress sama, lalu tulis ke
`<getFilesDir()>/vkey0<i>.dex` (`fopen "wb"` + `fwrite` + `fclose`),
`File.setWritable(true, true)`, `File.setReadOnly()`, `list.add(file)`,
lalu `makePathElements(list, file, list)`.

### 1.4 `vkjhn` = attach/swap Application (0x1b90c)

Klasik V-Key "replace Application": `ContextImpl.getImpl(baseContext)` →
`new AxisNetApplication()` → `newApp.attach(contextImpl)` →
`ContextImpl.mOuterContext = newApp` → `ActivityThread.mInitialApplication = oldApp`
→ `mAllApplications.remove(old); add(newApp)` →
`LoadedApk.mApplication = newApp` →
`ApplicationInfo.className = "com.axis.net.helper.AxisNetApplication"` →
daftarkan ulang semua `ActivityLifecycleCallbacks` ke newApp →
`newApp.onCreate()` (tail call). Tidak menyentuh tabel kunci.

### 1.5 Helper kecil (semua di 0x1bfa8–0x1c400)

- `0x1bfa8` — wrapper `CallObjectMethod` (dipakai untuk `getDir`, `getAssets`,
  `getClassLoader`, `getFilesDir`, `toString`, `ArrayList.get`).
- `0x1c044` — wrapper `NewObject` (`ArrayList.<init>`, `File.<init>`).
- `0x1c0e0` — wrapper `CallStaticObjectMethod` (`ByteBuffer.wrap`,
  `makeInMemoryDexElements` / `makePathElements`).
- `0x1c17c` — wrapper `CallBooleanMethod` (`File.setWritable/setReadOnly`,
  `ArrayList.add/remove`).
- `0x1c218` — decompress (§3). `0x1c360` — wrapper `CallVoidMethod`
  (`Application.attach`, `onCreate`, `registerActivityLifecycleCallbacks`).
- `0x1c3fc` — helper kecil dipakai `vkjhn` (cek `List.size`-like, tidak kritis).

## 2. Fungsi dekripsi — AES-256-GCM, kunci dari `.data`

Dua call-site identik (jalur in-memory 0x1ae7c–0x1af14, jalur file 0x1b3c0–0x1b404):

```
key[i] = T2[i][0:32] XOR T3[i][0:32]        # T2/T3 = tabel pointer di .data
raw    = isi file tmp* (panjang L)
iv     = raw[0:12]
ct     = raw[12 : L-16]
tag    = raw[L-16 : L]
pt     = AES-256-GCM-decrypt(key[i], iv, ct, tag, AAD = <kosong>)
```

Detail yang diverifikasi dari disassembly:
- `mbedtls_gcm_setkey(ctx, MBEDTLS_CIPHER_ID_AES=2, key, 256)` → AES-256.
- `mbedtls_gcm_auth_decrypt(ctx, ilen=L-28, iv=raw, iv_len=12, add=sp+0xa0,
  add_len=0, tag=raw+L-16, tag_len=16, input=raw+12, output=buf)` — **`add_len`
  di-`mov x5, xzr` di kedua situs → AAD kosong**. Buffer stack `sp+0xa0`
  sempat diisi konstanta ASCII "vkey01" (0x79656b76 + 0x3130) tapi tidak pernah
  dipakai sebagai AAD (panjang 0); slot itu dipakai ulang sebagai out-param
  panjang hasil decompress. Jadi reimplementasi tidak butuh AAD apa pun.
- XOR kunci 32 byte dikerjakan in-place (jalur vektor NEON `eor v0.16b`,
  fallback loop byte bila buffer overlap) — kunci hasil XOR disimpan di
  `malloc(0x20)` lalu di-`free` setelah `setkey`.
- Tidak ada derivasi kunci dari device/app properties: satu-satunya input
  runtime ke kunci adalah isi `.data` (lihat bawah). `__system_property_get`
  memang di-import .so, tapi tidak dipanggil dari kode V-Key (hanya dipakai
  kode mbedtls/libc++ sekitarnya); `getuid()` hanya untuk dead check §1.2.
- Tidak ada verifikasi `assets/signature` sebelum dekripsi: string
  "signature"/"firmware" tidak ada di `libfgazvajhxc.so`, dan tidak ada
  `AAssetManager_open` lain selain untuk ketujuh nama tmp*. Satu-satunya
  integrity check atas buffer adalah **tag GCM** (auth decrypt gagal bila
  buffer diubah).

### Sumber kunci (deskripsi saja, tanpa nilai mentah)

- Tabel pointer T2 di `.data` 0x4a1e8 (7 entri, RELATIVE reloc) →
  slot 0x4a010, 0x4a050, 0x4a090, 0x4a0d0, 0x4a110, 0x4a150, 0x4a190.
- Tabel pointer T3 di `.data` 0x4a220 (7 entri) →
  slot 0x49ff0, 0x4a030, 0x4a070, 0x4a0b0, 0x4a0f0, 0x4a130, 0x4a170.
- Tiap slot 32 byte pertama dipakai (slot berjarak 0x40, selang-seling
  T3/T2). Tidak ada reloc yang menimpa slot-slot ini — byte di file =
  byte saat runtime. Kunci per file `i` = `T2[i] XOR T3[i]`.
- `.init_array[0]` (0x45930) di-reloc ke 0x39f3c (init statis runtime C++,
  bukan setup kunci — tidak ada bukti menyentuh tabel kunci).

## 3. Decompress — gzip (0x1c218)

`decompress(in, in_len, out_buf**, out_len*)`:
`inflateInit2_(strm, windowBits=31, "1.3.1", 0x70)` → **wbits 31 = format gzip**,
buffer awal `malloc(0x400)`, digandakan (`realloc`) tiap kali penuh, loop
`inflate(Z_NO_FLUSH)` sampai `Z_STREAM_END`; sukses → return 0 + `*out_len =
total_out`; gagal → return -1. Log: `__android_log_print(4, "ClassEncryption",
"[dex_buffer] decompress: %d", ret)`.

## 4. Hasil dekripsi per file (7/7 SUKSES)

| i | asset | ukuran file | plaintext GCM | DEX hasil | class_defs | Adler32 |
|---|---|---|---|---|---|---|
| 0 | tmp17680616876221785051 | 87.595 | 87.567 | 219.844 | 149 | cocok |
| 1 | tmp3065699920606524921 | 879.003 | 878.975 | 2.885.408 | 1.864 | cocok |
| 2 | tmp14169616706995394833 | 1.566.803 | 1.566.775 | 5.033.568 | 3.934 | cocok |
| 3 | tmp13997699941173334308 | 340.018 | 339.990 | 1.052.532 | 503 | cocok |
| 4 | tmp12794277964480025953 | 476.185 | 476.157 | 1.239.052 | 719 | cocok |
| 5 | tmp7028462203480471573 | 33.360 | 33.332 | 77.808 | 40 | cocok |
| 6 | tmp13784499609711825650 | 111.456 | 111.428 | 270.924 | 245 | cocok |

Semua: tag GCM OK, plaintext diawali magic gzip `1f 8b`, hasil inflate
diawali `dex\n`, `header_size=0x70`, `endian_tag=0x12345678`,
`file_size` header = ukuran aktual, checksum Adler32 header cocok.
Total class_defs 7.454 (Fase 2: 0 di DEX stub).

Verifikasi androguard 4.1.4 (per file, `AnalyzeDex`):
- `tmp1399…` (503 class): semuanya `Lcom/axis/net/` (503).
- `tmp1416…` (3.934 class): 3.631 `Lcom/axis/net/`, 26.068 method.
- `tmp3065…` (1.864 class): 1.838 `Lcom/axis/net/`, 15.844 method.
- Sisanya (149/245/719/40 class): 0 `com.axis.net` (library dex: V-OS, dsb).
- `Lcom/axis/net/config/Signature;` kini punya method nyata:
  `<clinit> <init> k keyTempest keyTempestCapital keyTempestGuardian
  keyTempestMarket keyTempestMarketCapital w a apiKey b`.
- `Lcom/axis/net/config/RequestInterceptor;` punya `intercept` + `a b c d` +
  4 getter hostname. `AxisnetApiServices`, `AlifetimeDashboardRepository`,
  `RewardClaimParam`, dan string `Tempest` + `x-signature` ditemukan di DEX
  hasil dekripsi (catatan: string `x-signature` muncul di tmp1416… dan
  tmp3065… — kandidat nama header Tempest untuk Fase 4).

Catatan koreksi terhadap Fase 2: ada **7** file tmp*, bukan 5
(yang terlewat: tmp17680616876221785051 87.595 byte dan
tmp7028462203480471573 33.360 byte; total tetap ±3,4 MB).

## 5. assets/signature & assets/firmware — bukan urusan loader dex

- Keduanya base64 di APK. Setelah decode: `signature` 194.833 byte
  (entropi 8,00, tanpa magic yang dikenal); `firmware` 585.091 byte
  (entropi 7,99, ada magic ASCII **`VK02`** di offset 0x24 + struktur
  record).
- `libfgazvajhxc.so` **tidak** membaca keduanya (tidak ada string/nama
  asset itu, tidak ada open lain).
- Konsumennya adalah lapisan **V-OS** (`libvosWrapperEx.so`):
  string `********** V-Key Release SDK: V-OS Processor %s (Feb  9 2026 10:44:55) **********`,
  JNI `VosWrapper.getFirmwareVersion`, JSON `{"firmware_version":"%s"}`,
  `logproc.tsa.v-key.com`; string `vkey.android.vos`,
  `vos_firmware_ver`, `vos_processor_ver` juga ada di DEX hasil dekripsi.
  Jadi `firmware` = blob firmware V-OS, `signature` = kemungkinan
  blob signature/license V-OS — keduanya di luar jalur dekripsi dex dan
  **tidak memblokir reimplementasi** (loader dex tidak memverifikasinya).

## 6. Anti-tamper / anti-debug (untuk jalur dinamis)

`libchecks.so` — JNI `com.vkey.android.internal.vguard…`:
`NativeThreatsChecker.checkForSuFilesNative`, `checkForVncSshTelnet`,
`findSuidSgidFiles`, `listPortUsing`, `dexOptFunction`,
`FuncPtrCheck.validateFunctionPointer`, `AppCompatUtil.drawingOverOtherAppsStatus`,
`Utility.getUID/getEffectiveUID`. String: `scan_root/scan_path` (+ thread),
`startDexOpt`, `start_scan_threads`, `/system/etc/resolv.conf`,
`pixel_beta`, `rooting tool`, `13004108`. Import: `fork/execve/execl`,
`flock`, `__system_property_get`, `getpwuid`, `popen`.
Artinya untuk kerja dinamis: ada pemindaian root (file su, suid/sgid),
port (VNC/SSH/telnet listening), validasi function pointer (anti-hook),
dan dexopt. Frida/mitmproxy kemungkinan terdeteksi; butuh bypass
(hide/sandbox) — di luar tugas statis ini.

Catatan: `libfgazvajhxc.so` sendiri tidak punya anti-debug eksplisit
selain stack-canary + dead check `getuid()` (§1.2); tidak ada `ptrace`
di import-nya.

## 7. Yang masih belum diketahui / langkah berikut

1. **Tidak ada yang menghalangi Fase 4 (analisis Tempest statis)** — DEX
   aplikasi kini tersedia lengkap dan bisa di-parse androguard. Prioritas:
   `Signature.<clinit>/k/w/a/b` (perakitan kunci + rumus signing),
   `RequestInterceptor.intercept/a/b/c/d` (header yang dikirim),
   `RewardClaimParam` (body redeem), `AxisnetApiServices` (anotasi Retrofit).
2. `assets/signature` belum diurai strukturnya (kemungkinan protobuf/container
   V-OS) — tidak dibutuhkan untuk Tempest, tapi mungkin relevan bila V-OS
   memverifikasi integritas sebelum dex dimuat. Bukti yang ada: loader dex
   tidak membacanya; V-OS-lah yang memakai `firmware`.
3. Nama method JNI acak (`hqore`/`vkjhn`, class `kyaks/snmzj`, nama lib
   `fgazvajhxc`) — random per build. myXL punya loader sejenis
   (`libwwuivgwnlm.so`, belum dianalisis — kemungkinan skema sama dengan
   kunci/nama berbeda; bisa dipakai ulang script ini dengan penyesuaian
   alamat tabel bila dibutuhkan).
4. Sisa "vkey01" (AAD mati, §2) dan dead check `getuid()` — dicatat sebagai
   artefak template V-Key, bukan bagian dari skema kripto.

## 8. File di folder ini

- `tmp*.dex` (7 file) — DEX hasil dekripsi (deliverable utama).
- `vkey_decrypt.py` — reimplementasi dekripsi (baca kunci dari .so saat jalan).
- `vkey_analyze.py` — disassembly + xref + resolusi PLT/reloc (capstone).
- `disasm-vkey-region.txt` — disassembly .text 0x1a970–0x1c498 dengan anotasi.
- `vkey_report.txt` — output lengkap `vkey_analyze.py`.
- `strings-fgaz.txt` — `strings -n 5` libfgazvajhxc.so.
- `vkey-loader-notes.md` — file ini.
