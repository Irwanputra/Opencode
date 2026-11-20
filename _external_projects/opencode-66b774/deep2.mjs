import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const H = { "user-agent": UA, accept: "text/html,application/json;q=0.9,*/*;q=0.8" };
const F = async (u, o = {}) => fetch(u, { ...o, redirect: "follow", signal: AbortSignal.timeout(o.ms || 20000) });
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/deep2.out", s + "\n");
};

const fmt = (b) => {
  const mv = b.indexOf("mvhd");
  if (mv === -1) return null;
  const v = b.readUInt8(mv + 4);
  const ts = v === 1 ? b.readUInt32BE(mv + 24) : b.readUInt32BE(mv + 16);
  const du = v === 1 ? Number(b.readBigUInt64BE(mv + 28)) : b.readUInt32BE(mv + 20);
  if (!ts || !du) return null;
  const s = du / ts;
  return { dur: `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`, sec: +s.toFixed(1) };
};

async function probe(u, refs) {
  for (const ref of refs) {
    try {
      const r = await F(u, { headers: { "user-agent": UA, referer: ref, accept: "*/*" }, ms: 40000 });
      if (!r.ok) continue;
      const b = Buffer.from(await r.arrayBuffer());
      const m = fmt(b);
      if (!m) continue;
      log(`   ✅ ${m.dur} | ${(b.length / 1048576).toFixed(2)} MB | ${m.sec}s | ref=${(ref || "tanpa").slice(0, 28)}\n      ${u}`);
      return { url: u, ...m, mb: +(b.length / 1048576).toFixed(2) };
    } catch {}
  }
  log(`   ❌ tidak terputar: ${u.slice(0, 110)}`);
  return null;
}

const hits = [];

// ---------- 1. vid.pemersatu.link : config JSON ----------
for (const playId of ["2avu1zh94e7v", "1f9b32gi1d7e"]) {
  log(`\n=== PEMERSATU ${playId} ===`);
  const pageUrl = `https://vid.pemersatu.link/e/${playId}`;
  try {
    const page = await (await F(pageUrl, { headers: H })).text();
    const cfg = JSON.parse((page.match(/window\.__PLAYER_CONFIG__\s*=\s*(\{[\s\S]*?\});/) || [])[1]);
    log(`  configPath: ${cfg.configPath}`);
    for (const path of [cfg.configPath, cfg.configPath.replace("_ce=", "ce=")]) {
      try {
        const r = await F("https://vid.pemersatu.link" + path, { headers: { ...H, referer: pageUrl, origin: "https://vid.pemersatu.link" } });
        const t = await r.text();
        log(`  config ${r.status} ${t.length} B :: ${t.slice(0, 300).replace(/\s+/g, " ")}`);
        const urls = [...new Set([...t.matchAll(/https?:\/\/[^"'\\\s]+?\.(?:mp4|m3u8)/g)].map((m) => m[0]))];
        const b64 = [...new Set([...t.matchAll(/"([A-Za-z0-9+/=%_\-]{40,})"/g)].map((m) => m[1]))]
          .map((s) => {
            try {
              return Buffer.from(s, "base64").toString("utf8");
            } catch {
              return "";
            }
          })
          .filter((s) => /^https?:\/\//.test(s));
        const cand = [...new Set(urls.concat(b64))];
        log(`  kandidat: ${cand.length} -> ${cand.slice(0, 3).join(" | ").slice(0, 220)}`);
        for (const c of cand.slice(0, 3)) {
          const h = await probe(c, ["https://vid.pemersatu.link/", new URL(c).origin + "/", ""]);
          if (h) hits.push({ src: `pemersatu ${playId}`, ...h });
        }
        if (cand.length) break;
      } catch (e) {
        log(`  config ERR ${String(e.message).slice(0, 70)}`);
      }
    }
  } catch (e) {
    log(`  ERR ${String(e.message).slice(0, 90)}`);
  }
}

// ---------- 2. streamtape : get_video ----------
for (const id of ["g1DajRr7bAhqeae"]) {
  log(`\n=== STREAMTAPE ${id} ===`);
  const pageUrl = `https://streamtape.com/e/${id}/x`;
  try {
    const page = await (await F(pageUrl, { headers: H })).text();
    const vc = JSON.parse((page.match(/var vidconfig\s*=\s*(\{[\s\S]*?\});/) || [])[1]);
    const q = new URLSearchParams(new URL(vc.cors.replace("https://thumb.tapecontent.net/remotecaption/", "https://x.com/?") + "").search);
    const api = `https://streamtape.com/get_video?id=${vc.id}&expires=${q.get("expires")}&ip=${q.get("ip")}&token=${q.get("token")}`;
    log(`  api: ${api.slice(0, 130)}`);
    const r = await fetch(api, { headers: { "user-agent": UA, referer: pageUrl }, redirect: "manual", signal: AbortSignal.timeout(20000) });
    const loc = r.headers.get("location");
    log(`  get_video ${r.status} -> ${String(loc).slice(0, 120)}`);
    if (loc) {
      const final = loc.startsWith("http") ? loc : "https://streamtape.com" + loc;
      const h = await probe(final, [pageUrl, "https://streamtape.com/", ""]);
      if (h) hits.push({ src: "streamtape", ...h });
    }
  } catch (e) {
    log(`  ERR ${String(e.message).slice(0, 90)}`);
  }
}

log("\n=== RINGKASAN FILE TERPUTAR ===");
log(JSON.stringify(hits, null, 1));
