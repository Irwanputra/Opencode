const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const H = { "user-agent": UA, accept: "text/html,application/xhtml+xml" };

const PAGES = [
  ["Syaliong Xilla - Chindo Mulus Suka Banget Colmek", "https://mybokepindo.online/bokep-indo-syaliong-xilla-chindo-mulus-suka-banget-colmek/"],
  ["Syaliong Xilla - Ngentot Nikmat Sama Pacar di Vila", "https://mybokepindo.online/bokep-indo-syaliong-xilla-ngentot-nikmat-sama-pacar-di-vila/"],
  ["Syaliong Xilla - Edisi Ngentot", "https://mybokepindo.online/bokep-indo-syaliong-xilla-edisi-ngentot/"],
  ["Syaliong Xilla - Omek Mulus Tanpa Bulu", "https://mybokepindo.online/bokep-indo-syaliong-xilla-omek-mulus-tanpa-bulu/"],
  ["Syaliong Xilla - Omek Basah Mendesah Tanpa Bulu", "https://mybokepindo.online/bokep-indo-syaliong-xilla-omek-basah-mendesah-mulus-tanpa-bulu/"],
  ["P5 Ngentot Talent Syaliong Abg 18Yo", "https://mybokepindo.online/p5-ngentot-talent-syaliong-abg-18yo-mulus-5-2024/"],
  ["Masyaliong - Abg imut Sudah Berbakat Colmek", "https://bokepviralindo.org/view20502/masyaliong-abg-imut-sudah-berbakat-colmek/"],
  ["Syaliong Imut Suka Colmek", "https://bokepindoviral.org/view14221/syaliong-imut-suka-colmek"],
  ["Koleksi Asupan Syaliong Bocil Cindo", "https://pinkviral.media/video-koleksi-asupan-syaliong-bocil-cindo-baju-imut/"],
];

import { appendFileSync } from "node:fs";
const OUT = "/tmp/opencode/resolve.out";
const say = (s) => appendFileSync(OUT, s + "\n");

const raw = globalThis.fetch;
async function fetchT(u, o = {}) {
  return raw(u, { ...o, signal: AbortSignal.timeout(o.ms || 12000) });
}
async function txt(u, extra = {}) {
  const r = await fetchT(u, { headers: { ...H, ...extra }, redirect: "follow" });
  return { status: r.status, body: await r.text() };
}

// rekap kandidat file mp4 mentah dari HTML mana pun
function mp4s(html, base) {
  const out = new Set();
  const re = /https?:\/\/[^"'\s&<>]+\.mp4|https?:\/\/[^"'\s&<>]*(?:overfetch\.video|workers\.dev\/\?url=|filedon|d03\.app|dood\.stream)[^"'\s<>]*/g;
  for (const m of html.matchAll(re)) {
    let u = m[0].replace(/&amp;/g, "&");
    if (u.includes("workers.dev/?url=")) {
      const inner = decodeURIComponent(u.split("url=")[1] || "");
      if (inner.startsWith("http")) out.add(inner);
    }
    if (/\.mp4|overfetch|d03|workers/.test(u) && !u.includes("embed-player")) out.add(u);
  }
  return [...out].slice(0, 6).map((u) => (u.startsWith("http") ? u : new URL(u, base).href));
}

function iframeSrcs(html) {
  return [...new Set([...html.matchAll(/<iframe[^>]+src="([^"]+)"/g)])]
    .map((m) => m[1].replace(/&amp;/g, "&"))
    .filter((u) => /^https?:/.test(u));
}

function probeFmt(b) {
  const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;
  const rd = (idx) => {
    const v = b.readUInt8(idx + 4);
    return v === 1
      ? { ts: b.readUInt32BE(idx + 24), du: Number(b.readBigUInt64BE(idx + 28)) }
      : { ts: b.readUInt32BE(idx + 16), du: b.readUInt32BE(idx + 20) };
  };
  const mv = b.indexOf("mvhd");
  if (mv === -1) return null;
  const { ts, du } = rd(mv);
  if (!ts || !du) return null;
  const i = b.indexOf("ftyp");
  const brands = i === -1 ? "" : b.toString("ascii", i + 8, Math.min(i + 24, b.length)).replace(/[^\x20-\x7e]/g, "");
  return {
    dur: fmt(du / ts),
    sec: +(du / ts).toFixed(1),
    codec: b.indexOf("avc1") !== -1 ? "H.264" : b.indexOf("hvc1") !== -1 || b.indexOf("hev1") !== -1 ? "HEVC" : "?",
    audio: b.indexOf("mp4a") !== -1 ? "AAC" : "-",
    brands: brands.slice(0, 12),
  };
}

const results = [];

for (const [title, page] of PAGES) {
  const row = { title, page, files: [] };
  try {
    let html = (await txt(page)).body;
    let direct = mp4s(html, page);
    const frames = iframeSrcs(html).slice(0, 3);
    for (const f of frames) {
      if (direct.length >= 3) break;
      try {
        const fr = await txt(f, { referer: new URL(page).origin + "/" });
        direct = direct.concat(mp4s(fr.body, f));
        for (const f2 of iframeSrcs(fr.body).slice(0, 2)) {
          if (direct.length >= 4) break;
          try {
            const fr2 = await txt(f2, { referer: new URL(f).origin + "/" });
            direct = direct.concat(mp4s(fr2.body, f2));
          } catch {}
        }
      } catch {}
    }
    direct = [...new Set(direct)].slice(0, 4);

    for (const u of direct) {
      try {
        const r = await fetchT(u, { headers: { "user-agent": UA, referer: new URL(u).origin + "/", accept: "*/*" }, ms: 25000 });
        const buf = Buffer.from(await r.arrayBuffer());
        const meta = probeFmt(buf);
        row.files.push({
          url: u,
          status: r.status,
          type: r.headers.get("content-type"),
          mb: +(buf.length / 1048576).toFixed(2),
          meta,
        });
      } catch (e) {
        row.files.push({ url: u, error: String(e.message).slice(0, 60) });
      }
    }
    row.frames = frames.slice(0, 3);
  } catch (e) {
    row.error = String(e.message).slice(0, 90);
  }
  results.push(row);
  say(`\n### ${title}`);
  say(`  halaman: ${page} ${row.error ? "ERR " + row.error : ""}`);
  if (row.frames) say(`  iframe : ${row.frames.join(" | ").slice(0, 200)}`);
  for (const f of row.files) {
    say(
      `  -> ${f.status || "ERR"} ${(f.type || f.error || "").slice(0, 22).padEnd(23)} ${String(f.mb ?? "-").padStart(7)} MB  ${f.meta ? f.meta.dur + " " + f.meta.codec + "/" + f.meta.audio : "bukan mp4"}  ${f.url.slice(0, 95)}`
    );
  }
}

say(
  "\n=== KATALOG SIAP PAKAI ===\n" +
    JSON.stringify(
      results
        .flatMap((r) =>
          r.files
            .filter((f) => f.meta && f.meta.sec > 10)
            .map((f) => ({
              t: r.title,
              d: `${f.meta.dur} terverifikasi · ${f.mb} MB · ${f.meta.codec} + ${f.meta.audio}`,
              u: f.url,
            }))
        ),
      null,
      2
    )
);
