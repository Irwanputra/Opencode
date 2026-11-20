import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const H = { "user-agent": UA, accept: "*/*" };
const F = (u, o = {}) => fetch(u, { ...o, redirect: "follow", signal: AbortSignal.timeout(o.ms || 25000) });
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/hls.out", s + "\n");
};
const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;

const TARGETS = [
  ["Masyaliong havenfile", "https://havenfile.cc/e/yQJenhh2LwjcwXRj"],
  ["Syaliong Imut havenfile", "https://havenfile.cc/e/54D77NF6BYm0aoAF"],
  ["Syaliong Imut m3u8", "https://fragment-cdn01.drstream.cc/92bd7158-4fdd-4f8d-a59f-e6b5bd23d57b/index.m3u8"],
  ["Syaliong Imut playmogo", "https://playmogo.com/e/kthc5tlz3u9b"],
];

for (const [tag, u] of TARGETS) {
  log(`\n===== ${tag}\n${u}`);
  try {
    const r = await F(u, { headers: H });
    const t = await r.text();
    log(`  status ${r.status} | ${r.headers.get("content-type")} | ${t.length} B`);

    // --- HLS ---
    if (t.includes("#EXTINF") || t.includes("#EXT-X-STREAM-INF")) {
      const master = t.includes("#EXT-X-STREAM-INF");
      const variants = [...t.matchAll(/#EXT-X-STREAM-INF:([^\n]*)\n([^\n]+)/g)].map((m) => ({
        bw: (m[1].match(/BANDWIDTH=(\d+)/) || [])[1],
        res: (m[1].match(/RESOLUTION=([\dx]+)/) || [])[1],
        url: m[2].trim(),
      }));
      log(`  MASTER=${master} varian=${variants.length} :: ${variants.slice(0, 4).map((v) => v.res + "@" + v.bw).join(", ")}`);
      const mediaUrl = master ? new URL(variants[0].url, u).href : u;
      const media = await (await F(mediaUrl, { headers: H })).text();
      const segs = media.split("\n").filter((l) => l && !l.startsWith("#"));
      const total = [...media.matchAll(/#EXTINF:([\d.]+)/g)].reduce((a, m) => a + parseFloat(m[1]), 0);
      const keys = media.includes("#EXT-X-KEY");
      log(`  media: ${segs.length} segmen, durasi ${fmt(total)} (${total.toFixed(1)} dtk), enkripsi=${keys}`);
      log(`  segmen[0]: ${segs[0] ? new URL(segs[0], mediaUrl).href.slice(0, 120) : "-"}`);
      log(`  target pemutar: ${mediaUrl}`);
      if (segs.length) {
        const sg = await fetch(new URL(segs[0], mediaUrl).href, { headers: { ...H, referer: "https://vid.pemersatu.link/" }, signal: AbortSignal.timeout(25000) });
        const sb = Buffer.from(await sg.arrayBuffer());
        log(`  segmen pertama: ${sg.status} ${(sg.headers.get("content-type") || "-")} ${(sb.length / 1024).toFixed(0)} KB`);
      }
      continue;
    }

    // --- halaman embed: cari file ---
    const files = [...new Set([...t.matchAll(/https?:\/\/[^"'\s<>\\]+?\.(?:mp4|m3u8)/g)].map((m) => m[0]))];
    const cfg = t.match(/window\.__PLAYER_CONFIG__\s*=\s*(\{[\s\S]*?\});/);
    log(`  file langsung: ${files.length ? files.slice(0, 4).join(" | ").slice(0, 260) : "tidak ada"}`);
    const ids = [...new Set([...t.matchAll(/(?:data|id|hash|src|key|token)\s*[:=]\s*["']([^"']{6,60})["']/gi)].map((m) => m[1]))];
    log(`  cfg block: ${cfg ? cfg[1].slice(0, 260) : "tidak ada"}`);
    log(`  id/hash unik: ${ids.slice(0, 10).join(" , ").slice(0, 300)}`);
    const js = [...new Set([...t.matchAll(/<script[^>]*src="([^"]+\.js[^"]*)"/g)].map((m) => m[1]))];
    log(`  js: ${js.slice(0, 5).join(" ")}`);
    log(`  unpacked? ${(t.match(/eval\(function\(p,a,c,k,e/g) || []).length} eval, ${t.length} B`);
  } catch (e) {
    log(`  ERR ${String(e.message).slice(0, 100)}`);
  }
}
