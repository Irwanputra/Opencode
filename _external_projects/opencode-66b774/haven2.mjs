import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/haven2.out", s + "\n");
};
const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;

const FILES = {
  "Syaliong Imut Suka Colmek": "54D77NF6BYm0aoAF",
  Masyaliong: "yQJenhh2LwjcwXRj",
};

for (const [title, id] of Object.entries(FILES)) {
  log(`\n##### ${title} [${id}]`);
  const emb = await (
    await fetch(`https://havenfile.cc/e/${id}`, { headers: { "user-agent": UA, accept: "*/*" }, signal: AbortSignal.timeout(25000) })
  ).text();
  const cfg = JSON.parse((emb.match(/id="havsub-embed-config">([\s\S]*?)<\/script>/) || [])[1] || "{}");
  const ed = cfg.embeddedData || {};
  for (const k of ["videoUrl", "downloadUrl", "videoUrlExpiresAt", "downloadUrlExpiresAt", "downloadDirectLinks"]) {
    log(`  ${k}: ${JSON.stringify(ed[k]).slice(0, 260)}`);
  }
  const url = ed.videoUrl || ed.downloadUrl;
  if (!url) continue;
  for (const ref of ["https://havenfile.cc/", new URL(url).origin + "/", ""]) {
    try {
      const r = await fetch(url, { headers: { "user-agent": UA, referer: ref, accept: "*/*" }, signal: AbortSignal.timeout(60000) });
      const ct = r.headers.get("content-type");
      const cl = r.headers.get("content-length");
      if (ct && ct.includes("mpegurl")) {
        const t = await r.text();
        const segs = t.split("\n").filter((l) => l && !l.startsWith("#"));
        const total = [...t.matchAll(/#EXTINF:([\d.]+)/g)].reduce((a, m) => a + parseFloat(m[1]), 0);
        log(`  ✅ HLS via ref=${(ref || "tanpa").slice(0, 24)} | ${segs.length} segmen | durasi ${fmt(total)} | ${cl} B`);
        log(`     playlist: ${url.slice(0, 130)}`);
        break;
      }
      const b = Buffer.from(await r.arrayBuffer());
      const mv = b.indexOf("mvhd");
      let dur = "bukan mp4 (" + (ct || "?") + ")";
      if (mv !== -1) {
        const v = b.readUInt8(mv + 4);
        const ts = v === 1 ? b.readUInt32BE(mv + 24) : b.readUInt32BE(mv + 16);
        const du = v === 1 ? Number(b.readBigUInt64BE(mv + 28)) : b.readUInt32BE(mv + 20);
        if (ts && du) dur = fmt(du / ts);
      }
      log(`  ${r.status} | ${(b.length / 1048576).toFixed(2)} MB | ${dur} | ref=${(ref || "tanpa").slice(0, 24)} | ct=${ct}`);
      if (mv !== -1) break;
    } catch (e) {
      log(`  ERR ${String(e.message).slice(0, 55)} ref=${(ref || "tanpa").slice(0, 22)}`);
    }
  }
}
