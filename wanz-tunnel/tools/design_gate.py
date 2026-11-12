#!/usr/bin/env python3
"""Gerbang desain Wanz Tunnel — pemeriksa deterministik untuk kode UI Android.

Aturannya dipindahkan dari alat yang diunduh ke `_design_tools/`:

* `ui-craft` (educlopez) — "Anti-Slop Test", `skills/ui-craft/SKILL.md`
* `anti-ai-slop-ui` (rwcod) — `scripts/ui_lint.py`, `rubrics/ai_slop_score.md`
* `web-interface-guidelines` (vercel-labs) — `command.md`
* `anti-ai-slop` (muris11) — `antislop.md`

Alat itu menarget CSS/JSX; aplikasi ini Kotlin + View, jadi tiap aturan
diterjemahkan ke padanan Android. Yang bisa diperiksa mesin diperiksa di sini;
sisanya (hirarki, rasa) dinilai manusia dari screenshot.

Pakai:  python3 tools/design_gate.py [--strict] [--summary]
Keluar: 0 bersih / hanya peringatan, 1 ada galat (atau peringatan saat --strict).
"""
from __future__ import annotations

import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
SRC = ROOT / "app" / "src" / "main"
KOTLIN = sorted((SRC / "java").rglob("*.kt"))
XML = sorted((SRC / "res").rglob("*.xml"))

findings: list[tuple[str, str, int, str]] = []


def add(level: str, path: Path, line: int, msg: str) -> None:
    findings.append((level, str(path.relative_to(ROOT)), line, msg))


def text_of(path: Path) -> str:
    return path.read_text(encoding="utf-8")


def luminance(rgb: tuple[int, int, int]) -> float:
    def ch(v: int) -> float:
        s = v / 255.0
        return s / 12.92 if s <= 0.03928 else ((s + 0.055) / 1.055) ** 2.4

    r, g, b = (ch(v) for v in rgb)
    return 0.2126 * r + 0.7152 * g + 0.0722 * b


def ratio(a, b) -> float:
    la, lb = luminance(a), luminance(b)
    hi, lo = max(la, lb), min(la, lb)
    return (hi + 0.05) / (lo + 0.05)


def hexrgb(h: str) -> tuple[int, int, int]:
    n = int(h, 16)
    return (n >> 16) & 255, (n >> 8) & 255, n & 255


# ------------------------------------------------------- 1. Dekorasi tanpa fungsi
GRADIENT = re.compile(r"LinearGradient|RadialGradient|SweepGradient|"
                      r"GradientDrawable\.Orientation")
GLOW = re.compile(r"setShadowLayer|BlurMaskFilter|setElevation\s*\(|^\s*elevation\s*=")
EMOJI = re.compile("[\U0001F300-\U0001FAFF\U00002600-\U000027BF\U0001F000-\U0001F0FF]")
for f in KOTLIN:
    for i, line in enumerate(text_of(f).splitlines(), 1):
        code = line.split("//")[0]
        if "grad-ok" in line or "glow-ok" in line:
            continue
        if GRADIENT.search(code):
            add("ERROR", f, i, "gradien — tanda paling umum UI hasil generator")
        if GLOW.search(code):
            add("ERROR", f, i, "glow/elevasi dekoratif")
        m = EMOJI.search(code)
        if m and m.group(0) not in "←→↑↓•·×":
            add("ERROR", f, i, f"emoji sebagai ikon/teks: {m.group(0)!r}")

# ---------------------------------------------------------------- 2. Sudut UI
radii: set[float] = set()
for f in KOTLIN:
    t = text_of(f)
    for m in re.finditer(r"box\([^)]*?,\s*(\d+)\s*[,)]", t):
        radii.add(float(m.group(1)))
    for m in re.finditer(r"cornerRadius\s*=\s*dp\((\d+(?:\.\d+)?)\)", t):
        radii.add(float(m.group(1)))
    for m in re.finditer(r"R_(FIELD|PANEL|HAIR)\b", t):
        radii.add({"FIELD": 1.0, "PANEL": 2.0, "HAIR": 0.0}[m.group(1)])
for f in XML:
    for m in re.finditer(r'cornerRadius="(\d+)dp"', text_of(f)):
        radii.add(float(m.group(1)))
if len(radii) < 2:
    add("ERROR", SRC / "java/id/wanz/tunnel/Theme.kt", 1,
        f"sudut seragam ({sorted(radii) or 'tidak ada'}) — variasikan per peran elemen")

# ------------------------------------------ 3. Deret waktu: jangan bilah vertikal
for f in KOTLIN:
    t = text_of(f)
    if "drawRect" in t and re.search(r"bottom\s*-\s*h", t) and "values" in t:
        add("ERROR", f, 1,
            "bilah vertikal untuk deret waktu — pakai garis/area atau bilah horizontal")

# ------------------------------------------------------------------- 4. Kontras AA
theme = text_of(SRC / "java/id/wanz/tunnel/Theme.kt")
# Kedua palet dibaca terpisah: mode gelap bukan tambahan, dia diukur juga.
palettes: dict[str, dict[str, str]] = {}
for variant in ("LIGHT", "DARK"):
    pairs_ = dict(re.findall(
        rf"private const val {variant}_"
        r"(\w+) = 0x[0-9A-Fa-f]{2}([0-9A-Fa-f]{6})\.toInt", theme))
    if pairs_:
        palettes[variant.lower()] = pairs_
if len(palettes) < 2:
    add("ERROR", SRC / "java/id/wanz/tunnel/Theme.kt", 1,
        f"palet warna tidak terbaca ({sorted(palettes)})")
for name, tokens in palettes.items():
    for fg, bg, minc in [
        ("INK", "BG", 4.5), ("MUTED", "BG", 4.5), ("FAINT", "BG", 4.5),
        ("FAINT", "PANEL", 4.5), ("INK", "PANEL", 4.5), ("INK", "FIELD", 4.5),
        ("OK", "BG", 4.5), ("WARN", "BG", 4.5), ("ERR", "BG", 4.5),
        ("ON_INK", "INK", 4.5), ("ACCENT", "BG", 4.5), ("ON_ACCENT", "ACCENT", 4.5),
    ]:
        if fg in tokens and bg in tokens:
            r = ratio(hexrgb(tokens[fg]), hexrgb(tokens[bg]))
            if r < minc:
                add("ERROR", SRC / "java/id/wanz/tunnel/Theme.kt", 1,
                    f"palet {name}: kontras {fg}/{bg} = {r:.2f}:1 (< {minc}:1)")

# Resource jendela harus sama dengan token palet, kalau tidak akan ada tepi
# putih sesaat saat aplikasi dibuka di mode gelap.
xml_night = SRC / "res/values-night/colors.xml"
if xml_night.exists() and "dark" in palettes:
    hexes = set(re.findall(r'#[0-9A-Fa-f]{6}', text_of(xml_night)))
    want = "#" + palettes["dark"].get("BG", "").upper()
    if want != "#" and want not in hexes:
        add("ERROR", xml_night, 1,
            f"latar resource {sorted(hexes)} tidak memuat warna palet gelap {want}")

# ------------------------------------------------------------ 5. Sentuh dan label
CLICKY = re.compile(r"(\w+)\s*=\s*\w*(?:TextView|FrameLayout|LinearLayout|InkToggle|"
                    r"InkSelect)\s*\(this\)\s*\.apply\s*\{(.*?)\n\s{0,8}\}", re.S)
for f in KOTLIN:
    t = text_of(f)
    for m in CLICKY.finditer(t):
        name, body = m.group(1), m.group(2)
        if "isClickable" not in body and "onSelect" not in body and "onToggle" not in body:
            continue
        i = t[:m.start()].count("\n") + 1
        labelled = ("contentDescription" in body or 'text = "' in body
                    or "label =" in body or "options =" in body
                    or "caption =" in body)
        if not labelled:
            add("WARN", f, i, f"kontrol {name} tanpa label aksesibilitas")
        placed = re.search(
            rf"addView\({m.group(1)},\s*\w*\.LayoutParams\((?:-?\d+|dp\(\d+\)),\s*"
            rf"(?:dp\((\d+)\)[^)]*|-2)\)", t)
        # Komponen sendiri sudah menjamin tinggi sentuh 48dp di dalam init/onMeasure,
        # jadi tidak perlu ditulis ulang di tempat pemakaiannya.
        self_sized = any(
            n + "(this)" in m.group(0) for n in ("InkSelect", "InkToggle", "InkField")
        )
        big = (self_sized
               or "minimumHeight" in body or "minHeight" in body
               or "setPadding" in body or "R_PANEL" in body or "onMeasure" in body
               or (placed and placed.group(1) is not None
                   and int(placed.group(1)) >= 48))
        if not big:
            add("WARN", f, i, f"kontrol {name} tanpa tinggi/-padding minimal 48dp")
    for i, line in enumerate(t.splitlines(), 1):
        m = re.search(r"addView\((\w+),\s*\w*\.LayoutParams\(-?\d+,\s*dp\((\d{2})\)\)", line)
        if m and int(m.group(2)) < 48 and re.search(rf"\b{m.group(1)}\b.*isClickable", t):
            add("WARN", f, i, f"tinggi {m.group(2)}dp < 48dp untuk kontrol sentuh")

# ---------------------------------------------------------------------- 6. Teks UI
for f in KOTLIN:
    for i, line in enumerate(text_of(f).splitlines(), 1):
        code = line.split("//")[0]
        for lit in re.findall(r'"(?:[^"\\]|\\.)*"', code):
            if " \u2014 " in lit:
                add("WARN", f, i, "em-dash di kalimat UI — pakai titik atau titik koma")
                break
        m = re.search(r'text = "([A-Z][A-Z .&/0-9]{4,})"', code)
        action_labels = {"WANZ TUNNEL", "HUBUNGKAN", "PUTUSKAN", "COBA LAGI"}
        if m and m.group(1) not in action_labels:
            add("WARN", f, i, f"HURUF KAPITAL SEMUA: {m.group(1)!r}")
        if re.search(r'"[^"]*\.\.\."', code):
            add("WARN", f, i, 'tanda lanjut pakai "…", bukan tiga titik')

# ----------------------------------------------------------------- 7. Gerak sistem
for f in KOTLIN:
    t = text_of(f)
    if "ValueAnimator" not in t and "ObjectAnimator" not in t:
        continue
    if "ANIMATOR_DURATION_SCALE" not in t and "reducedMotion" not in t:
        add("ERROR", f, 1, "animasi berjalan tanpa menghormati skala animasi sistem")
    if "OvershootInterpolator" in t or "BounceInterpolator" in t:
        add("ERROR", f, 1, "easing memantul — tanda UI generator")

# ------------------------------------------------------------------ 8. Angka dan font
for fname, names in [("MainActivity.kt", ("pingValue", "uptimeValue"))]:
    src = SRC / f"java/id/wanz/tunnel/{fname}"
    if not src.exists():
        continue
    main = text_of(src)
    helper = re.search(r"private fun value\([^)]*\)[^=]*=\s*TextView\(this\)\.apply"
                       r"\s*\{(.*?)\n\s{4}\}", main, re.S)
    mono_helper = bool(helper and "Face.mono" in helper.group(1))
    for name in names:
        m = re.search(rf"{name} = value\(([^)]*)\)", main)
        if m and "mono = false" in m.group(1):
            add("WARN", src, 1, f"{name} memakai angka non-tabular")
        if m and not mono_helper:
            add("WARN", src, 1,
                f"{name} dibuat dari helper yang tidak mono/tabular")
if "R.font." not in "".join(text_of(f) for f in KOTLIN):
    add("WARN", SRC / "java/id/wanz/tunnel/Theme.kt", 1,
        "tidak ada font yang dibundel — tipografi jadi default sistem")

# Ukuran huruf yang menghasilkan piksel pecahan membuat huruf kecil kelihatan
# bergetar di layar HP (9,5sp x densitas 2,75 = 26,125px). Semua ukuran harus
# lewat Face.px()/inkSize(), dan tidak ada lagi sp mentah di view mana pun.
FACE_SRC = SRC / "java/id/wanz/tunnel/Face.kt"
if FACE_SRC.exists() and "fun px(" not in text_of(FACE_SRC):
    add("ERROR", FACE_SRC, 1, "Face.px() hilang — ukuran huruf berisiko pecahan piksel")
for f in KOTLIN:
    if f.name == "Face.kt":
        continue
    for i, line in enumerate(text_of(f).splitlines(), 1):
        s = line.strip()
        if s.startswith("//") or "COMPLEX_UNIT_PX" in s:
            continue
        if "COMPLEX_UNIT_SP" in s:
            add("ERROR", f, i,
                "ukuran huruf sp bisa jatuh di setengah piksel — pakai inkSize()")
        elif re.search(r"\btextSize = dp\(", s) or re.search(r"\btextSize = [^;]*density", s):
            add("ERROR", f, i,
                "ukuran teks Paint tidak dibulatkan ke piksel utuh — pakai Face.px()")
        elif re.search(r"\btextSize = [0-9.]+f$", s):
            add("ERROR", f, i, "textSize sp mentah — pakai inkSize()")

# Ukuran huruf yang menghasilkan piksel pecahan membuat huruf kecil kelihatan
# bergetar di layar HP (9,5sp x densitas 2,75 = 26,125px). Semua ukuran harus
# lewat Face.px()/inkSize(), dan tidak ada lagi sp mentah di view mana pun.
FACE_SRC = SRC / "java/id/wanz/tunnel/Face.kt"
if FACE_SRC.exists() and "fun px(" not in text_of(FACE_SRC):
    add("ERROR", FACE_SRC, 1, "Face.px() hilang — ukuran huruf berisiko pecahan piksel")
for f in KOTLIN:
    if f.name == "Face.kt":
        continue
    for i, line in enumerate(text_of(f).splitlines(), 1):
        s = line.strip()
        if s.startswith("//") or "COMPLEX_UNIT_PX" in s:
            continue
        if "COMPLEX_UNIT_SP" in s:
            add("ERROR", f, i,
                "ukuran huruf sp bisa jatuh di setengah piksel — pakai inkSize()")
        elif re.search(r"\btextSize = dp\(", s) or re.search(r"\btextSize = [^;]*density", s):
            add("ERROR", f, i,
                "ukuran teks Paint tidak dibulatkan ke piksel utuh — pakai Face.px()")
        elif re.search(r"\btextSize = [0-9.]+f$", s):
            add("ERROR", f, i, "textSize sp mentah — pakai inkSize()")

# -------------------------------------------------------------------------- laporan
order = {"ERROR": 0, "WARN": 1}
findings.sort(key=lambda x: (order[x[0]], x[1], x[2]))
for level, path, line, msg in findings:
    print(f"{path}:{line}: {level.lower()}: {msg}")
errs = sum(1 for x in findings if x[0] == "ERROR")
warns = sum(1 for x in findings if x[0] == "WARN")
if "--summary" not in sys.argv:
    print(f"\n{errs} galat, {warns} peringatan · sudut: {sorted(radii)} · "
          f"palet: {sorted(palettes)}")
sys.exit(1 if errs or ("--strict" in sys.argv and warns) else 0)
