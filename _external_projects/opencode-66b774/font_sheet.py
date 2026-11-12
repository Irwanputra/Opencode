#!/usr/bin/env python3
"""Lembar perbandingan kandidat font "Konsol" dari Google Fonts.

Digambar pada densitas 2,75 (setara 1080x2340 / 440dpi, HP pemakai) supaya yang
kelihatan di layar sama dengan yang nanti dirender Android. Ukuran teks dibulatkan
ke piksel utuh — bagian dari perbaikan "geter": 9,5sp x 2,75 = 26,125px bikin
baseline jatuh di setengah piksel, huruf kecil jadi kelihatan bergetar.
"""
from __future__ import annotations

import sys
from PIL import Image, ImageDraw, ImageFont

D = 2.75                     # densitas layar contoh
F = "/tmp/opencode/fonts/"
DJ = "/usr/share/fonts/truetype/dejavu/"

DARK = dict(bg=0x131410, panel=0x1E1F19, ink=0xF2F2EA, muted=0xA9ADA4,
            faint=0x8B8F87, hair=0x32342C, accent=0xC9A22F, ok=0x5BC08A,
            warn=0xEFAE3C)
LIGHT = dict(bg=0xF1F1EC, panel=0xE8E8E2, ink=0x15171A, muted=0x5F645F,
             faint=0x646862, hair=0xC7C9C2, accent=0x7E5B10, ok=0x146B46,
             warn=0x8A5300)

# tag, nama, mono 400, mono 500, sans 400, sans 500
COMBOS = [
    ("NOW", "IBM Plex Mono + Roboto (bawaan HP)",
     "current_plex_regular.ttf", "current_plex_medium.ttf",
     DJ + "DejaVuSans.ttf", DJ + "DejaVuSans-Bold.ttf"),
    ("A", "JetBrains Mono + Space Grotesk",
     "jbm-400.ttf", "jbm-500.ttf", "spaceg-400.ttf", "spaceg-500.ttf"),
    ("B", "JetBrains Mono + IBM Plex Sans",
     "jbm-400.ttf", "jbm-500.ttf", "plexs-400.ttf", "plexs-500.ttf"),
    ("C", "Spline Sans Mono + Chivo",
     "spline-400.ttf", "spline-500.ttf", "chivo-400.ttf", "chivo-500.ttf"),
    ("D", "Chivo Mono + Chivo",
     "chivom-400.ttf", "chivom-500.ttf", "chivo-400.ttf", "chivo-500.ttf"),
    ("E", "JetBrains Mono + Work Sans",
     "jbm-400.ttf", "jbm-500.ttf", "works-400.ttf", "works-500.ttf"),
]

BLOCK_H = 560
PAD = 26


def px(sp: float) -> int:
    """sp -> piksel utuh. Pembulatan ini bagian dari perbaikan 'geter'."""
    return max(1, round(sp * D))


def fnt(path: str, sp: float) -> ImageFont.FreeTypeFont:
    p = path if path.startswith("/") else F + path
    return ImageFont.truetype(p, px(sp))


def col(v: int) -> tuple[int, int, int]:
    return (v >> 16 & 255, v >> 8 & 255, v & 255)


def tracked(d, xy, text, f, fill, track):
    x, y = xy
    for ch in text:
        d.text((x, y), ch, font=f, fill=fill)
        x += d.textlength(ch, font=f) + track


def T(d, x, y, s, f, c):
    d.text((x, y), s, font=f, fill=c)


def block(img, pal, combo, y):
    tag, desc, m4, m5, s4, s5 = combo
    mono = lambda sp: fnt(m4, sp)
    monom = lambda sp: fnt(m5, sp)
    sans = lambda sp: fnt(s4, sp)
    sansm = lambda sp: fnt(s5, sp)
    pn, ink, mu, fa, hr = (col(pal[k]) for k in
                           ("panel", "ink", "muted", "faint", "hair"))
    acc, ok, warn = col(pal["accent"]), col(pal["ok"]), col(pal["warn"])
    d = ImageDraw.Draw(img)
    x0, w = PAD, img.width - 2 * PAD
    d.rectangle([x0, y, x0 + w, y + BLOCK_H - 12], fill=pn)
    d.rectangle([x0, y, x0 + 3, y + BLOCK_H - 12], fill=acc)

    T(d, x0 + 18, y + 14, f"{tag} - {desc}", sans(10.5), fa)

    yy = y + 62
    tracked(d, (x0 + 18, yy), "TARGET", monom(9.5), fa, 1.6)
    tracked(d, (x0 + 520, yy), "AKUN", monom(9.5), fa, 1.6)
    yy += 28
    T(d, x0 + 18, yy, "bansos.sunekvpn.cc.cd:80", mono(12.5), ink)
    T(d, x0 + 520, yy, "sunek-coolmaxx", mono(12.5), ink)
    yy += 44
    tracked(d, (x0 + 18, yy), "PEMBUNGKUS", monom(9.5), fa, 1.6)
    T(d, x0 + 210, yy, "ws - SNI edu.ruangguru.com", mono(12.5), ink)
    yy += 46
    d.line([x0 + 18, yy, x0 + w - 18, yy], fill=hr, width=1)

    yy += 20
    tracked(d, (x0 + 18, yy), "KUNDE", monom(9.5), fa, 1.6)
    tracked(d, (x0 + 380, yy), "KIRIM", monom(9.5), fa, 1.6)
    tracked(d, (x0 + 720, yy), "AKTIF", monom(9.5), fa, 1.6)
    yy += 30
    T(d, x0 + 18, yy, "1.284,6", monom(21), ink)
    T(d, x0 + 275, yy, "MB", monom(11), mu)
    T(d, x0 + 380, yy, "96,20", monom(21), ink)
    T(d, x0 + 560, yy, "MB", monom(11), mu)
    T(d, x0 + 720, yy, "00:14:07", monom(21), ink)
    yy += 66
    T(d, x0 + 18, yy, "1,4 MB/s", mono(10.5), mu)
    T(d, x0 + 380, yy, "112 KB/s", mono(10.5), mu)
    T(d, x0 + 720, yy, "puncak 3,8 MB/s", mono(10.5), mu)
    yy += 44
    d.line([x0 + 18, yy, x0 + w - 18, yy], fill=hr, width=1)
    yy += 20
    T(d, x0 + 18, yy, "Terhubung - semua aplikasi lewat tunnel", sans(13), ink)
    T(d, x0 + 830, yy, "18 ms", monom(11), ok)
    yy += 48
    for t, c in (("18:41:02 [INFO] handshake ws ok (142 ms)", ok),
                 ("18:41:03 [INFO] DNS 1.1.1.1 -> 104.17.70.206", ink),
                 ("18:41:04 [PING] 1.1.1.1:443 18 ms", mu),
                 ("18:41:06 [WARN] rekey lambat (1,2 s)", warn)):
        T(d, x0 + 18, yy, t, mono(12.5), c)
        yy += 34
    return yy


def sheet(pal, name):
    w = 1080
    h = 150 + BLOCK_H * len(COMBOS) + 1200
    img = Image.new("RGB", (w, h), col(pal["bg"]))
    d = ImageDraw.Draw(img)
    judul = "gelap" if pal is DARK else "terang"
    T(d, PAD, 40, f"WANZ TUNNEL - uji font, mode {judul}", fnt("spaceg-500.ttf", 21),
      col(pal["ink"]))
    T(d, PAD, 92, "densitas 2,75 - semua ukuran dibulatkan ke piksel utuh",
      fnt("jbm-400.ttf", 11), col(pal["faint"]))
    y = 150
    for c in COMBOS:
        start = y
        y = block(img, pal, c, y) + 34
        img.crop((0, start - 8, img.width, y - 20)).save(
            f"/tmp/opencode/shots/font_{name}_{c[0]}.png")

    d.line([PAD, y, w - PAD, y], fill=col(pal["hair"]), width=1)
    T(d, PAD, y + 14, "diperbesar 2x (nearest) - label micro 9,5sp: di sini 'geter' paling kelihatan",
      fnt("jbm-400.ttf", 11), col(pal["faint"]))
    zy = y + 46
    SAMPLE = "TARGET - KIRIM - 00:14:07 - 1.284,6 MB"
    for tag, desc, m4, m5, s4, s5 in COMBOS:
        strip = upscale(F + m5, px(9.5), SAMPLE, pal)
        img.paste(strip, (PAD + 8, zy))
        T(d, PAD + 8, zy + strip.height + 6, tag, fnt(s4, 10.5), col(pal["accent"]))
        zy += strip.height + 40

    # pembulatan ukuran: akar masalah "geter"
    d.line([PAD, zy, w - PAD, zy], fill=col(pal["hair"]), width=1)
    zy += 16
    T(d, PAD, zy, "9,5sp x 2,75 = 26,125px (sebelum) dilawan 26px utuh (sesudah)",
      fnt("jbm-400.ttf", 11), col(pal["faint"]))
    zy += 34
    for size, lab in ((26.125, "sebelum"), (26.0, "sesudah")):
        strip = upscale(F + "jbm-500.ttf", size, SAMPLE, pal)
        img.paste(strip, (PAD + 8, zy))
        T(d, PAD + 8, zy + strip.height + 6, lab, fnt("jbm-400.ttf", 11),
          col(pal["accent"]))
        zy += strip.height + 40

    img.save(f"/tmp/opencode/shots/font_{name}.png")
    print(f"font_{name}.png  {img.width}x{img.height}")


def upscale(path, size, text, pal):
    """Render pada ukuran asli, lalu perbesar 2x tanpa interpolasi."""
    f = ImageFont.truetype(path, size)
    box = f.getbbox(text)
    pad = 3
    im = Image.new("RGB", (box[2] - box[0] + pad * 2, box[3] - box[1] + pad * 2),
                   col(pal["panel"]))
    ImageDraw.Draw(im).text((pad - box[0], pad - box[1]), text, font=f,
                            fill=col(pal["ink"]))
    return im.resize((im.width * 2, im.height * 2), Image.NEAREST)


if __name__ == "__main__":
    for pal, name in ((DARK, "gelap"), (LIGHT, "terang")):
        sheet(pal, name)
    sys.exit(0)
