#!/usr/bin/env bash
#
# probe.sh — pemburu host/prefix *unmetered* (Langkah 2: "cari host yang tanpa kuota")
#
# Prinsip: operator tidak allowlist hostname, mereka allowlist PREFIX IP (CIDR).
# Jadi hasil akhir script ini bukan daftar host, tapi daftar PREFIX yang lolos charging
# plus IP kandidat yang siap dipakai buat inject.
#
# Jalan di: Linux desktop, router (OpenWrt/Debian), Android via Termux.
# Wajib : bash, dig, curl, xargs
# Optional(akan dideteksi otomatis): openssl, ncat/nc, iperf3, jq, python3, whois
#
# usage: probe.sh <command> [args]
#
#   init                 bikin working dir + seed daftar host
#   dns               		 cek apakah port 53 operator dibajak / split-horizon
#   resolve              resolve semua host pakai DNS operator DAN DoH (dijajarkan)
#   map                  petakan IP -> ASN + CIDR pemilik
#   aggregate            clustering: prefix mana yang paling banyak menampung IP
#   candidates [N]       susun N kandidat IP buat diuji (default 25)
#   validate [IP...]     cek port + CONNECT:443 + POST-inject:80 per kandidat
#   payload [target] [MB]      generate payload terukur (default 100MB) buat uji delta
#   measure [canary] [cand]  wizard pencatatan delta kuota (interactive)
#   report               ringkasan + snapshot temuan ke laporan.md
#   add <host>           tambah host ke daftar
#   list host|ips        tampilkan isi
#   clean                hapus cache resolve (hosts.txt & laporan aman)
#
# State disimpan di ./quota-hunt (override: PH_DIR=/path).
#

export LC_ALL=C

PH_DIR="${PH_DIR:-$(pwd)/quota-hunt}"
HOSTS="$PH_DIR/hosts.txt"
RESOLVER_CONF="$PH_DIR/resolver"
IPS_OP="$PH_DIR/ips_operator.tsv"
IPS_DOH="$PH_DIR/ips_doh.tsv"
IPS_BAK="$PH_DIR/ips_operator.tsv.bak"
ALLIPS="$PH_DIR/ips_all.txt"
ASN_TSV="$PH_DIR/asn.tsv"
CIDR_TSV="$PH_DIR/cidr.tsv"
CAND="$PH_DIR/candidates.txt"
REPORT="$PH_DIR/laporan.md"
QUOTA_LOG="$PH_DIR/kurva_quota.log"

have() { command -v "$1" >/dev/null 2>&1; }
note() { printf '   %s\n' "$*"; }
warn() { printf '   !! %s\n' "$*" >&2; }
die()  { printf '   XX %s\n' "$*" >&2; exit 1; }
today() { date +%F; }

need_dir() {
  [ -d "$PH_DIR" ] || die "working dir belum ada. Jalankan: $0 init"
}

# ---------------------------------------------------------------- JSON helper
# jq tidak wajib (Termux sering belum ada). Fallback grep/sed seadanya.
json_all() {
  if have jq; then
    jq -r "$2" 2>/dev/null <<<"$1"
  else
    printf '%s' "$1" | tr ',' '\n' | grep -o "\"$2\"[^\"]*\"[^\"]*\"" \
      | sed -n 's/.*"\([^"]*\)"$/\1/p'
  fi
}

# ------------------------------------------------------------------- helpers
operator_resolver() {
  if [ -s "$RESOLVER_CONF" ]; then
    cat "$RESOLVER_CONF"
  else
    awk '/^nameserver/{print $2; exit}' /etc/resolv.conf 2>/dev/null
  fi
}

# host -> IPv4, pakai resolver tertentu. Output: "host<TAB>ip"
resolve_host() {
  h="$1"; r="$2"
  dig +short +time=3 +tries=1 A "$h" @"$r" 2>/dev/null | awk -v h="$h" '/^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/{print h"\t"$0}'
}

doh_lookup() {
  h="$1"
  curl -s --max-time 6 -H 'accept: application/dns-json' \
    "https://cloudflare-dns.com/dns-query?name=${h}&type=A" 2>/dev/null \
    | { have jq && jq -r '.Answer[]?.data' || grep -o '"data":"[^"]*"'; } \
    | sed -n 's/.*"data":"\{0,1\}\([^"]*\)"\{0,1\}/\1/p' \
    | awk -v h="$h" '/^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/{print h"\t"$0}'
}

# ------------------------ bagian yang bikin script ini panjang: seed host
seed_hosts() {
  cat <<'SEED'
# ============================================================
# A. Probe konektivitas / captive portal
#    Biasanya dibypass gateway autentikasi -> jalur tercepat
#    buat ngetes "ada bypass apa tidak" di network ini.
# ============================================================
connectivitycheck.gstatic.com
connectivitycheck.android.com
clients3.google.com
clients1.google.com
detectportal.firefox.com
example.org
httpforever.com
www.google.com
captive.apple.com
www.apple.com
play.googleapis.com

# ============================================================
# B. Host partner zero-rating (paling sering jadi bucket gratis)
#    Comment/delikeman kalau paketmu tidak punya partner ini.
# ============================================================
free.facebook.com
web.facebook.com
graph.facebook.com
graph.whatsapp.com
g.whatsapp.net
web.whatsapp.net
web.whatsapp.com
z-p-WhatsApp-g.whatsapp.net
instagram.com
b-api.instagram.com
z-p-16-content.instagram.com
twitter.com
api.twitter.com
*.fbcdn.net
scontent-maa2-1.cdninstagram.com
static.xx.fbcdn.net

# ============================================================
# C. Host kuota khusus yang KAMU PUNYA (edu / Ns / games / cloud)
#    Cek halaman detail paket operatormu, tambahin yang relevan.
# ============================================================
www.telkomsel.com
my.telkomsel.com
www.indosatooredoo.com
my.indosatooredoo.com
www.xl.co.id
www.myxl.co.id
maxstream.tv
cloudmaxstream.tv
*.vidio.com
vidio.com
r.cn
discord.com
gateway.discord.gg
stackoverflow.com
github.com
raw.githubusercontent.com
gitlab.com
shopee.co.id
sfx-pic-sg.akamaized.net
tiktok.com
api16-normal-c-useast1a.tiktokv.com

# ============================================================
# D. Cloud / speedtest endpoints -> gerbang ke prefix cloud
#    Ini incaran utama inject: di dalam prefix cloud kamu bisa
#    sewa/pilih IP sendiri, bukan numpang host orang.
# ============================================================
checkip.cloudflare.com
one.one.one.one
speed.cloudflare.com
cf-ns.speedtest.net
speedtest.tele2.net
speedtest.googlefiber.net
speedtest-hkg.allotspeedtest.net
ipinfo.io
ifconfig.me
ipapi.co

# ============================================================
# E. Host yang sudah kamu TAHU dihitung kuota WA/gratis.
#    Tetangga IP-nya di prefix yang sama sering tidak terdaftar
#    di rule DPI -> lolos tanpa meter.
# ============================================================
whatsapp.com
lookaside.facebook.com
edge-mqtt.facebook.com
star.c10r.facebook.com
external-maa2-1.xx.fbcdn.net
SEED
}

# =========================================================================
init() {
  have dig   || die "butuh 'dig' (android: pkg install bind-tools, debian: dnsutils)"
  have curl  || die "butuh 'curl'"
  have xargs || die "butuh 'xargs' (findutils)"
  have openssl || warn "openssl tidak ada -> cek CONNECT:443 di 'validate' akan dilewati"
  have jq      || warn "jq tidak ada -> parsing JSON pakai fallback (kurang rapi)"

  mkdir -p "$PH_DIR" || die "tidak bisa bikin $PH_DIR"

  if [ ! -f "$HOSTS" ]; then
    seed_hosts > "$HOSTS"
    note "seed $HOSTS"
  else
    note "$HOSTS sudah ada, tidak ditimpa"
  fi

  r="$(operator_resolver)"
  if [ -n "${r:-}" ]; then
    printf '%s\n' "$r" > "$RESOLVER_CONF"
    note "DNS operator terdeteksi: $r"
  else
    warn "tidak nemu nameserver di /etc/resolv.conf -> set manual: echo 10.x.x.x > $RESOLVER_CONF"
  fi

  : > "$ASN_TSV"; : > "$CIDR_TSV"
  note "siap. Lanjut: $0 dns && $0 resolve"
  note "dir kerja: $PH_DIR"
}

# =========================================================================
# Cek pembajakan DNS. Kalau dig ke 8.8.8.8 jawab sama dengan DNS operator,
# berarti port 53 di-transparent-proxy -> semua tes DNS wajib lewat DoH.
dns() {
  need_dir
  r="$(operator_resolver)"
  [ -n "${r:-}" ] || die "DNS operator belum di-set. Lihat $RESOLVER_CONF"

  note "minta identitas resolver (CHAOS TXT version.bind)"
  via_pub=$(dig +short +time=4 +tries=1 +domain= CH TXT version.bind @8.8.8.8 2>/dev/null | head -1)
  via_ops=$(dig +short +time=4 +tries=1 +domain= CH TXT version.bind @"$r" 2>/dev/null | head -1)
  note "ke 8.8.8.8      : ${via_pub:-<tidak ada jawaban>}"
  note "ke DNS operator : ${via_ops:-<tidak ada jawaban>}"

  if [ -n "$via_pub" ] && [ "$via_pub" = "$via_ops" ]; then
    warn "port 53 KEMUNGKINAN DIBAJAK (jawaban identik). Pakai DoH untuk semua tes."
  elif [ -z "$via_pub" ]; then
    warn "port 53 ke IP publik TIDAK BISA DIPAKAI (diblok / di-hijack tanpa jawaban)."
    warn "Ini justru kabar baik: artinya kamu bisa lewatin dengan DoH/DoT."
  else
    note "port 53 tampaknya jujur ke publik."
  fi

  note ""
  note "cek split-horizon (bandingkan operator vs DoH):"
  for h in connectivitycheck.gstatic.com graph.facebook.com www.google.com one.one.one.one; do
    a=$(dig +short +time=3 +tries=1 A "$h" @"$r" 2>/dev/null | head -1)
    b=$(doh_lookup "$h" | awk '{print $2; exit}')
    if [ -n "${a:-}" ] && [ -n "${b:-}" ] && [ "$a" != "$b" ]; then
      note "BEDA  $h  operator=$a  doh=$b   <- kandidat rewrite/allowlist internal"
    else
      note "sama  $h  ${a:-?}"
    fi
  done
  note ""
  note "IP di rentang 10.x / 100.64.x / 17x.x = IP internal operator = jalur bypass klasik."
}

# =========================================================================
resolve() {
  need_dir
  r="$(operator_resolver)"
  [ -n "${r:-}" ] || die "DNS operator belum di-set"
  [ -s "$HOSTS" ] || die "$HOSTS kosong / belum ada host. $0 init"

  # bersihkan komentar & wildcard (dig tidak mengerti *.domain)
  grep -Ev '^\s*(#|$)' "$HOSTS" | sed 's/^\*\./www./' | sort -u > "$PH_DIR/.hosts.clean"
  total=$(wc -l < "$PH_DIR/.hosts.clean")
  note "resolve $total host via operator DNS ($r) ..."

  [ -f "$IPS_OP" ] && cp "$IPS_OP" "$IPS_BAK"

  # loop sekuensial: ~60 host, beberapa detik, dan bebas jebakan quoting
  : > "$IPS_OP"
  while read -r h; do
    dig +short +time=3 +tries=1 A "$h" @"$r" 2>/dev/null \
      | grep -E '^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$' \
      | sed "s/^/$h$(printf '\t')/" >> "$IPS_OP"
  done < "$PH_DIR/.hosts.clean"
  sort -u -o "$IPS_OP" "$IPS_OP"
  note "-> $(wc -l < "$IPS_OP") baris host:IP (host yang tidak dijawab = di-block DNS)"

  # host yang TIDAK dijawab operator = DNS-level blocking, sering berarti
  # host itu ada di rule khusus (bisa dibypass lewat DoH)
  cut -f1 "$IPS_OP" | sort -u > "$PH_DIR/.answered"
  comm -23 "$PH_DIR/.hosts.clean" "$PH_DIR/.answered" > "$PH_DIR/.blocked.txt"
  nb=$(wc -l < "$PH_DIR/.blocked.txt")
  [ "$nb" -gt 0 ] && note "-> $nb host TIDAK dijawab operator -> $PH_DIR/.blocked.txt"

  note "resolve via DoH (Cloudflare) sebagai pembanding ..."
  if have curl; then
    : > "$IPS_DOH"
    while read -r h; do
      curl -s --max-time 6 -H 'accept: application/dns-json' \
        "https://cloudflare-dns.com/dns-query?name=${h}&type=A" 2>/dev/null \
        | grep -o '"data":"[0-9.]*"' | sed 's/.*"data":"//; s/"$//' \
        | sed "s/^/${h}$(printf '\t')/" >> "$IPS_DOH"
    done < "$PH_DIR/.hosts.clean"
    grep -E '^[^[:space:]]+'"$(printf '\t')"'[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$' \
      "$IPS_DOH" > "$IPS_DOH.tmp" 2>/dev/null && mv "$IPS_DOH.tmp" "$IPS_DOH"
    sort -u -o "$IPS_DOH" "$IPS_DOH" 2>/dev/null
    note "-> $(wc -l < "$IPS_DOH") baris DoH"
  else
    warn "curl tidak ada, lewati DoH"
    : > "$IPS_DOH"
  fi

  # bedakan IP: host yang beda jawaban operator vs DoH = allowlist internal
  cut -f1,2 "$IPS_OP" | sort -u > "$PH_DIR/.op.ip"
  cut -f1,2 "$IPS_DOH" | sort -u > "$PH_DIR/.doh.ip"
  join -t "$(printf '\t')" "$PH_DIR/.op.ip" "$PH_DIR/.doh.ip" \
    | awk -F'\t' '$2!=$3{print $1"\t"$2"\t"$3}' > "$PH_DIR/.split_all.tsv"
  # bedakan 2 jenis selisih:
  #   /24 BEDA  = menarik (indikasi rewrite/allowlist internal operator)
  #   /24 sama  = cuma rotasi node CDN, abaikan
  awk -F'\t' '{split($2,a,".");split($3,b,".");
               if(a[1]"."a[2]"."a[3] != b[1]"."b[2]"."b[3]) print}' \
    "$PH_DIR/.split_all.tsv" | sort -u > "$PH_DIR/.split_horizon.tsv"
  awk -F'\t' '{split($2,a,".");split($3,b,".");
               if(a[1]"."a[2]"."a[3] == b[1]"."b[2]"."b[3]) print}' \
    "$PH_DIR/.split_all.tsv" | sort -u > "$PH_DIR/.split_cdn.tsv"
  ns=$(wc -l < "$PH_DIR/.split_horizon.tsv")
  nc=$(wc -l < "$PH_DIR/.split_cdn.tsv")
  note "selisih /24 (potensi rewrite): $ns host   |   rotasi CDN sederajat: $nc host"
  if [ "$ns" -gt 0 ]; then
    note ""
    note "SPLIT-HORIZON lintas /24 -> $PH_DIR/.split_horizon.tsv"
    awk -F'\t' '{print "      "$1"  ops="$2"  doh="$3}' "$PH_DIR/.split_horizon.tsv" | head -20
    note "  IP operator yang beda dari DoH = IP yang DIHITUNG charging."
    note "  IP versi DoH = IP yang dilihat DPI kalau kamu bypass DNS."
    note "  IP ops di 10.x / 100.64.x / 17x.x = allowlist internal operator."
  else
    note "tidak ada selisih lintas /24. Kalau kamu yakin ada rewrite, operator DNS-mu"
    note "mungkin di-bypass: bandingkan manual dengan $0 dns"
  fi

  # gabung semua IP (operator + DoH) buat dipetakan
  { cut -f2 "$IPS_OP"; [ -f "$IPS_DOH" ] && cut -f2 "$IPS_DOH"; } \
    | grep -E '^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$' | sort -u > "$ALLIPS"
  note "total IP unik yang akan dipetakan: $(wc -l < "$ALLIPS")"
  note "lanjut: $0 map"
}

# =========================================================================
map() {
  need_dir
  [ -s "$ALLIPS" ] || die "tidak ada IP untuk dipetakan. Jalankan $0 resolve dulu"
  n=$(wc -l < "$ALLIPS")
  note "ASN via Team Cymru (DNS) untuk $n IP ..."

  # output contoh: "157.240.3.50|AS32934|157.240.0.0/19|1999-12-24|AS"
  # field 2 = ASN, field 3 = prefix routing pemilik
  xargs -a "$ALLIPS" -P 20 -I IP \
    sh -c 'o=$(dig +short +time=3 +tries=1 TXT "IP.origin.asn.cymru.com" 2>/dev/null \
            | head -1 | tr -d "\""); [ -n "$o" ] && echo "IP|$o"' > "$ASN_TSV"
  sort -u -o "$ASN_TSV" "$ASN_TSV"
  note "-> $(wc -l < "$ASN_TSV") IP terpetakan (IP tanpa jawaban = non-RFC/CGNAT)"

  # CGNAT / IP internal -> ini justru yang paling menarik, tandai
  note ""
  note "IP internal / CGNAT (kemungkinan allowlist operator):"
  grep -E '^(10\.|100\.(6[4-9]|[7-9][0-9]|1[01][0-9]|12[0-7])\.|172\.(1[6-9]|2[0-9]|3[01])\.|192\.168\.|172\.1[6-9]\.)' \
    "$ALLIPS" | awk '{print "      "$0}' | head -20

  # prefix pemilik detail (descr / nama jaringan) -- RIPEstat kalau online
  if [ "${SKIP_NET:-0}" = "1" ]; then
    warn "SKIP_NET=1 -> lewati lookup RIPEstat"
    return 0
  fi
  note ""
  note "CIDR + nama jaringan via RIPEstat (butuh internet) ..."
  : > "$CIDR_TSV"
  xargs -a "$ALLIPS" -P 6 -I IP \
    sh -c 'j=$(curl -s --max-time 8 "https://stat.ripe.net/data/whis/index.data?resource=IP"); \
           p=$(printf "%s" "$j" | sed -n "s/.*\"prefix\":\"\([^\"]*\)\".*/\1/p" | head -1); \
           d=$(printf "%s" "$j" | sed -n "s/.*\"descr\":\"\([^\"]*\)\".*/\1/p" | head -1); \
           n=$(printf "%s" "$j" | sed -n "s/.*\"netname\":\"\([^\"]*\)\".*/\1/p" | head -1); \
           [ -n "$p" ] && echo "IP|$p|${d:-$n}"' >> "$CIDR_TSV" 2>/dev/null
  sort -u -o "$CIDR_TSV" "$CIDR_TSV" 2>/dev/null
  note "-> $(wc -l < "$CIDR_TSV") IP terpetakan ke CIDR pemilik"
  if [ ! -s "$CIDR_TSV" ]; then
    warn "RIPEstat tidak bisa diakses. Re-run nanti, atau pakai: whois <IP> | grep -iE 'inetnum|netname|descr'"
  fi
}

# =========================================================================
# Inti Langkah 2: prefix yang menampung BANYAK host = kandidat allowlist.
aggregate() {
  need_dir
  [ -s "$CIDR_TSV" ] || die "belum ada data CIDR. Jalankan $0 map"

  note "TOP PREFIX (kolom 1 = jumlah IP host yang jatuh di prefix itu)"
  awk -F'|' '{print $2"|"$3}' "$CIDR_TSV" | sort | uniq -c | sort -rn \
    | awk '{printf "      %4s  %s\n", $1, substr($0, index($0,$2))}' | head -25

  note ""
  note "Rasio IP-publik vs prefix. Kalau satu prefix /24 berisi host dari"
  note "layanan yang BERCAMPURAN (gratis & berbayar) -> rule-nya per-IP, lebih rapuh,"
  note "lebih banyak celah. Kalau satu prefix penuh layanan gratis -> allowlist per-prefix."
  awk -F'|' '$2 ~ /^([0-9]+\.){3}[0-9]+\/(1[6-9]|2[0-9]|3[0-2])$/ {print $2}' "$CIDR_TSV" \
    | sort | uniq -c | sort -rn | head -15 | awk '{print "      "$1" IP  "$2}'

  if have python3; then
    note ""
    note "agregasi rentang IP (CIDR terkecil yang menutupi IP yang lolos):"
    awk -F'|' '{print $1}' "$CIDR_TSV" | python3 -c '
import sys, ipaddress as i
ips=[]
for l in sys.stdin:
    l=l.strip()
    try:
        a=i.ip_address(l)
        if a.version==4: ips.append(a)
    except Exception: pass
for c in i.collapse_address_objects(ips):
    print("      %s/%d" % (c.network_address, c.prefixlen))
' | head -25
  else
    warn "python3 tidak ada -> lewati agregasi CIDR"
  fi
  note ""
  note "lanjut: $0 candidates"
}

# =========================================================================
candidates() {
  need_dir
  [ -s "$CIDR_TSV" ] || die "belum ada data CIDR. Jalankan $0 map"
  top="${1:-25}"

  note "mengambil $top kandidat IP ..."
  : > "$CAND"
  while IFS='|' read -r ip prefix owner; do
    printf '%s\t%s\t%s\n' "$ip" "$prefix" "${owner:-?}" >> "$CAND.tmp"
  done < <(sort -t'|' -k2,2 "$CIDR_TSV" | head -400)

  # urutkan: prefix paling padat dulu, lalu IP unik
  sort -t"$(printf '\t')" -k2,2 "$CAND.tmp" 2>/dev/null | awk -F'\t' '!seen[$1]++' | head -"$top" > "$CAND"
  rm -f "$CAND.tmp"
  # fallback kalau sort tab bermasalah di busybox
  [ -s "$CAND" ] || awk -F'|' '{print $1"\t"$2"\t"$3}' "$CIDR_TSV" | awk -F'\t' '!s[$1]++' | head -"$top" > "$CAND"

  note "kandidat siap -> $CAND"
  head -"$top" "$CAND" | awk -F'\t' '{printf "      %-16s %-20s %s\n", $1, $2, $3}'
  note ""
  note "lanjut: $0 validate        (atau: $0 validate <IP> <IP> ...)"
}

# =========================================================================
# Uji tiap kandidat: port hidup? CONNECT:443? POST-inject:80?
# "HTTP/1.0 200 Connection established" di port 80 = bug POST-CONNECT,
# artinya gateway TIDAK membaca SNI -> ini yang paling dicari.
validate() {
  need_dir
  if [ "$#" -gt 0 ]; then
    list="$*"
  else
    [ -s "$CAND" ] || die "belum ada kandidat. Jalankan $0 candidates"
    list=$(cut -f1 "$CAND" | tr '\n' ' ')
  fi

  ncbin=""
  for c in ncat nc; do have "$c" && { ncbin="$c"; break; }; done
  have "$ncbin" || warn "nc/ncat tidak ada -> cek POST-inject dilewati (pkg install netcat-openbsd)"

  printf '      %-16s %-6s %-6s %-22s %s\n' "IP" "80" "443" "POST-inject:80" "CONNECT:443"
  printf '      %s\n' "----------------------------------------------------------------------------------"
  for ip in $list; do
    p80=$(timeout 3 sh -c "</dev/tcp/$ip/80" 2>/dev/null && echo OK || echo -)
    p443=$(timeout 3 sh -c "</dev/tcp/$ip/443" 2>/dev/null && echo OK || echo -)

    post="-"
    if [ -n "$ncbin" ] && [ "$p80" = "OK" ]; then
      post=$(printf 'POST / HTTP/1.1\r\nHost: %s\r\n\r\n' "$ip" \
        | "$ncbin" -w 3 "$ip" 80 2>/dev/null | head -1 | tr -d '\r')
      case "$post" in *"200 Connection established"*) post="BUG-POST-CONNECT";; *"HTTP/"*) post="proxy-jawab";; esac
    fi

    conn="-"
    if have openssl && [ "$p443" = "OK" ]; then
      conn=$(printf 'CONNECT example.com:443 HTTP/1.1\r\nHost: example.com:443\r\n\r\n' \
        | timeout 6 openssl s_client -connect "$ip:443" -servername example.com -quiet 2>/dev/null \
        | head -1 | tr -d '\r')
      case "$conn" in *"200"*) conn="200 = bisa di-tunnel";; "") conn="-";; *) conn=$(printf '%.20s' "$conn");; esac
    fi

    printf '      %-16s %-6s %-6s %-22s %s\n' "$ip" "${p80:-.}" "${p443:-.}" "$post" "$conn"
  done
  note ""
  note "BUG-POST-CONNECT = gateway tidak baca SNI -> bug inject 0-day yang kamu cari."
  note "CONNECT 200     = siap buat SSH/VPN-over-HTTPS ke IP itu."
}

# =========================================================================
# Generate payload TERUKUR. Wajib pakai angka, bukan perasaan.
# (nama fungsi "payload", bukan "test", biar tidak tabrakan dengan builtin)
payload() {
  target="${1:-speed.cloudflare.com}"
  mb="${2:-100}"
  have iperf3 && note "tip: iperf3 -c <ip> -t 60 lebih akurat buat uji throughput"
  note "download ${mb}MB ..."
  note "catat counter REGULER sebelum & sesudah. Jangan counter kuota app."
  bytes=$((mb * 1048576))
  limit=$((mb * 3 + 60))
  if have curl; then
    curl -s -o /dev/null --max-time "$limit" \
      -w '      transferred=%{size_download} bytes  time=%{time_total}s  speed=%{speed_download}B/s\n' \
      "https://speed.cloudflare.com/__down?bytes=${bytes}"
  elif have wget; then
    wget -q -O /dev/null "https://speed.cloudflare.com/__down?bytes=${bytes}" && note "selesai"
  else
    die "butuh curl atau wget"
  fi
  note "delta harapan: 0 MB (unmetered) / < payload (sampling) / = payload (berbayar penuh)"
  note "target $target dicatat di laporan; ganti IP target lewat: $0 payload <ip> $mb"
}

# =========================================================================
# Wizard pencatatan delta kuota. Operator tidak punya API kuota,
# jadi counter dibaca manual dari app/USSD dan dicatat di sini.
measure() {
  need_dir
  canary="${1:-www.google.com}"
  cand="${2:-}"
  ask() {
    printf '   kuota reguler %s [MB sisa]? ' "$1"
    read -r v
    printf '%s\n' "$v"
  }
  printf '   %s\n' "=== canary: host yang KAMU TAHU berbayar ($canary) ==="
  b0=$(ask "sebelum"); payload "$canary" 100 >/dev/null 2>&1 || payload "$canary" 100
  b1=$(ask "sesudah ")
  d=$((b0 - b1))
  [ "$d" -gt 120 ] && note "canary jalan: $d MB habis utk 100MB payload -> gateway jujur" \
    || warn "canary TIDAK habis ($d MB) -> counter yang kamu baca mungkin salah / rule berubah"

  [ -n "$cand" ] || { note "tidak ada kandidat diuji, selesai."; return 0; }
  printf '   %s\n' "=== kandidat: $cand ==="
  c0=$(ask "sebelum"); payload "$cand" 100 >/dev/null 2>&1 || payload "$cand" 100
  c1=$(ask "sesudah ")
  d=$((c0 - c1))
  verdict="SAMAR (sampling/flow-based)"
  [ "$d" -le 0 ]   && verdict="UNMETERED <- bug ketemu"
  [ "$d" -ge 90 ]  && verdict="BERBAYAR PENUH (tidak ada bypass)"
  note "delta: ${d} MB  ->  $verdict"
  {
    printf '%s\t%s\t%s\t%s\t%s\t%s\n' "$(today)" "$canary" "$b0|$b1|$((b0-b1))" "$cand" "$c0|$c1|$d" "$verdict"
  } >> "$QUOTA_LOG"
  note "dicatat -> $QUOTA_LOG"
  note "ulangi 3x di jam berbeda (pagi/siang/malam) sebelum percaya."
}

# =========================================================================
report() {
  need_dir
  {
    printf '# Temuan kuota — %s\n\n' "$(today)"
    printf '## Ringkasan\n\n'
    printf -- '- host diuji: %s\n' "$(grep -Evc '^\s*(#|$)' "$HOSTS" 2>/dev/null || echo 0)"
    printf -- '- host yang dijawab DNS operator: %s\n' "$(wc -l < "$IPS_OP" 2>/dev/null || echo 0)"
    printf -- '- host yang di-BLOCK DNS: %s\n' "$(wc -l < "$PH_DIR/.blocked.txt" 2>/dev/null || echo 0)"
    printf -- '- split-horizon / rewrite: %s\n' "$(wc -l < "$PH_DIR/.split_horizon.tsv" 2>/dev/null || echo 0)"
    printf -- '- IP unik: %s\n' "$(wc -l < "$ALLIPS" 2>/dev/null || echo 0)"
    printf -- '- IP terpetakan ke prefix: %s\n' "$(wc -l < "$CIDR_TSV" 2>/dev/null || echo 0)"
    printf -- '- kandidat: %s\n\n' "$(wc -l < "$CAND" 2>/dev/null || echo 0)"
    printf '## Top prefix (kandidat allowlist)\n\n```\n'
    awk -F'|' '{print $2"|"$3}' "$CIDR_TSV" 2>/dev/null | sort | uniq -c | sort -rn | head -12
    printf '```\n\n## Kandidat teruji\n\n'
    printf '| IP | prefix | owner | 80 | 443 | POST-inject | CONNECT | tanggal | status |\n'
    printf '|---|---|---|---|---|---|---|---|---|\n'
    cut -f1 "$CAND" 2>/dev/null | while read -r ip; do
      owner=$(awk -F'\t' -v i="$ip" '$1==i{print $3}' "$CAND" | head -1)
      pre=$(awk -F'\t' -v i="$ip" '$1==i{print $2}' "$CAND" | head -1)
      printf '| %s | %s | %s | | | | | %s | |\n' "$ip" "${pre:-}" "${owner:-}" "$(today)"
    done
    printf '\n## Hasil delta kuota\n\n'
    printf '```\n'; cat "$QUOTA_LOG" 2>/dev/null; printf '```\n'
  } > "$REPORT"
  note "laporan -> $REPORT"
  note "format ini penting: kalau operator update rule, tinggal re-run tes yang sama"
  note "buat tahu persis kapan bug-nya mati."
}

add() {
  [ -n "${1:-}" ] || die "usage: $0 add <host>"
  need_dir
  grep -qxF "$1" "$HOSTS" 2>/dev/null || printf '%s\n' "$1" >> "$HOSTS"
  note "ok: $1 -> $HOSTS"
}

list() {
  need_dir
  case "${1:-host}" in
    host) sed -n '1,200p' "$HOSTS" ;;
    ips)  column -t "$IPS_OP" 2>/dev/null || cat "$IPS_OP" ;;
    *)    die "list host|ips" ;;
  esac
}

clean() {
  rm -rf "$PH_DIR/.hosts.clean" "$PH_DIR/.answered" "$PH_DIR/.op.ip" \
    "$PH_DIR/.doh.ip" "$PH_DIR/.blocked.txt" "$PH_DIR/.split_horizon.tsv" \
    "$PH_DIR/.split_all.tsv" "$PH_DIR/.split_cdn.tsv" 2>/dev/null
  note "cache dibersihkan (hosts.txt, cidr.tsv, laporan.md aman)"
}

usage() {
  sed -n '/^# usage:/,/^# State/p' "$0" | sed 's/^# \{0,1\}//'
}

cmd="${1:-help}"; shift 2>/dev/null || true
case "$cmd" in
  init)       init ;;
  dns)        dns ;;
  resolve)    resolve ;;
  map)        map "${1:-}" ;;
  aggregate)  aggregate ;;
  candidates) candidates "${1:-25}" ;;
  validate)   validate "$@" ;;
  payload|test) payload "${1:-}" "${2:-100}" ;;
  measure)    measure "${1:-www.google.com}" "${2:-}" ;;
  report)     report ;;
  add)        add "${1:-}" ;;
  list)       list "${1:-host}" ;;
  clean)      clean ;;
  help|-h|--help) usage ;;
  *) warn "command tidak dikenal: $cmd"; usage; exit 1 ;;
esac
