#!/usr/bin/env python3
"""Ukur kontras teks di atas latar foto (fitur "latar", sementara ditunda).

Panel "Konsol" tidak dibuat transparan lalu dipercaya begitu saja. Skrip ini
menyimulasikan lapisan yang benar-benar terjadi di layar:

    foto  ->  scrim warna BG (sebesar slider)  ->  panel PANEL (semi-opaque)

lalu membandingkan token teks dengan wilayah foto yang PALING TERANG (persentil
96) setelah semua lapisan ditumpuk. Kalau angka ini lolos, teks aman dipakai di
foto mana pun dari set yang dibundel, bukan hanya di screenshot yang kebetulan
bagus.

Pakai:  python3 tools/wall_contrast.py [alpha-panel 0..1] [scrim 0..1]
Default: 0.86 0.70  ->  alpha panel 0xDC, slider "Kegelapan latar" mulai 70.
Keluar: 0 lolos, 1 ada token yang turun di bawah 4,5:1.
"""
from __future__ import annotations

import sys
from pathlib import Path

try:
    from PIL import Image
except ImportError:                                   # pragma: no cover
    sys.exit("butuh Pillow: python3 -m pip install --user pillow")

WALL = Path(__file__).resolve().parent.parent / "design" / "wallpaper"

LUT = []
for v in range(256):
    s = v / 255.0
    LUT.append(s / 12.92 if s <= 0.03928 else ((s + 0.055) / 1.055) ** 2.4)


def lum(r: int, g: int, b: int) -> float:
    return 0.2126 * LUT[r] + 0.7152 * LUT[g] + 0.0722 * LUT[b]


def contrast(a: float, b: float) -> float:
    hi, lo = max(a, b), min(a, b)
    return (hi + 0.05) / (lo + 0.05)


def rgb(hexv: int) -> tuple[int, int, int]:
    return (hexv >> 16) & 255, (hexv >> 8) & 255, hexv & 255


# Token diambil dari Theme.kt; jaga tetap sinkron dengan kedua palet.
PALETTES = {
    "gelap": dict(bg=0x131410, panel=0x1E1F19, ink=0xF2F2EA,
                  muted=0xA9ADA4, faint=0x8B8F87),
    "terang": dict(bg=0xF1F1EC, panel=0xE8E8E2, ink=0x15171A,
                   muted=0x5F645F, faint=0x646862),
}
MIN_TOKOK = 4.5


def photos() -> dict[str, list[tuple[int, int, int]]]:
    out = {}
    for f in sorted(WALL.glob("freya_*.webp")):
        im = Image.open(f).convert("RGB").resize((150, 325))
        try:
            pixels = list(im.get_flattened_data())   # Pillow >= 10.4
        except AttributeError:
            pixels = list(im.getdata())              # Pillow lama
        if pixels and not isinstance(pixels[0], tuple):
            pixels = [tuple(pixels[i:i + 3]) for i in range(0, len(pixels), 3)]
        out[f.stem] = pixels
    return out


def brightest_composite(px, pal, panel_a: float, scrim: float) -> float:
    """Luminance wilayah paling terang setelah scrim + panel ditumpuk."""
    br, bgc, bb = rgb(pal["bg"])
    pr, pg, pb = rgb(pal["panel"])
    vals = []
    for r, g, b in px:
        cr = panel_a * pr + (1 - panel_a) * (scrim * br + (1 - scrim) * r)
        cg = panel_a * pg + (1 - panel_a) * (scrim * bgc + (1 - scrim) * g)
        cb = panel_a * pb + (1 - panel_a) * (scrim * bb + (1 - scrim) * b)
        vals.append(lum(int(cr), int(cg), int(cb)))
    vals.sort()
    return vals[int(len(vals) * 0.96)]


def main() -> int:
    panel_a = float(sys.argv[1]) if len(sys.argv) > 1 else 0.86
    scrim = float(sys.argv[2]) if len(sys.argv) > 2 else 0.70
    px = photos()
    if not px:
        print(f"tidak ada foto di {WALL}")
        return 1

    worst: dict[tuple[str, str], tuple[float, str]] = {}
    for name, data in px.items():
        for pal_name, pal in PALETTES.items():
            top = brightest_composite(data, pal, panel_a, scrim)
            for tok in ("ink", "muted", "faint"):
                r = contrast(lum(*rgb(pal[tok])), top)
                key = (pal_name, tok)
                if key not in worst or r < worst[key][0]:
                    worst[key] = (r, name)

    print(f"panel alpha {panel_a:.2f} (0x{round(panel_a * 255):02X}) · "
          f"scrim {scrim:.2f} · {len(px)} foto")
    bad = 0
    for (pal_name, tok), (r, name) in sorted(worst.items()):
        flag = "" if r >= MIN_TOKOK else "  < 4.5:1"
        if r < MIN_TOKOK:
            bad += 1
        print(f"  {pal_name}/{tok:5s} {r:5.2f}:1 terburuk pada {name}{flag}")
    if bad:
        print(f"\n{bad} token turun di bawah {MIN_TOKOK}:1 — naikkan scrim atau panel alpha")
        return 1
    print("\nsemua token di atas 4,5:1 pada 12 foto")
    return 0


if __name__ == "__main__":
    sys.exit(main())
