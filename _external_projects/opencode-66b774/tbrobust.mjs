// Cara tahan-banting buka share TeraBox: baca SSR state dari HTML -> shareid/uk -> list + mediameta + streaming
import crypto from "node:crypto";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl = process.argv[2] || "LA0Jq-HW5Fcv-8Q2FNC1ng";
const HOST = process.argv[3] || "https://www.terabox.com";
const sleep = (ms) => new Promise((r) => setTimeout(r, ms));

const cookies = new Map();
const jar = (r) => { for (const c of r.headers.getSetCookie?.() || []) { const [kv] = c.split(";"); const i = kv.indexOf("="); if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim()); } };
const hdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
const H = (ref) => ({ "user-agent": UA, accept: "*/*", "accept-language": "id-ID,id;q=0.9,en;q=0.8", referer: ref || `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: hdr() });
const get = async (url, ref) => {
  const r = await fetch(url, { headers: H(ref), signal: AbortSignal.timeout(25000) });
  jar(r);
  return { status: r.status, t: await r.text() };
};

// ---- 1. halaman share: cookie + jsToken + SSR state ----
const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html,application/xhtml+xml", "accept-language": "id-ID,id;q=0.9,en;q=0.8" }, signal: AbortSignal.timeout(30000) });
jar(pageRes);
const html = await pageRes.text();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/) || [])[1]) || "";
const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };

let shareid, uk, title;
const ssi = html.indexOf("__INITIAL_STATE__");
if (ssi > -1) {
  const raw = html.slice(ssi).match(/__INITIAL_STATE__\s*=\s*(\{[\s\S]*?\})\s*<\/script>/);
  let st = null;
  if (raw) { try { st = JSON.parse(raw[1]); } catch {} }
  const si = st && st.pinia && st.pinia.share && st.pinia.share.shareInfo;
  if (si && (si.shareid || si.share_id)) {
    shareid = si.shareid || si.share_id;
    uk = si.uk;
    title = si.title || (si.filePathList && si.filePathList[0]);
    console.log("SSR state OK");
  } else console.log("SSR state ada tapi shareInfo kosong");
}
const m = html.match(/"shareid"?:"?(\d{6,20})/) || html.match(/share_id"?:"?(\d{6,20})/);
if (!shareid && m) shareid = m[1];
const mu = html.match(/"uk"?:"?(\d{6,20})/);
if (!uk && mu) uk = mu[1];

// ---- 2. fallback: /api/shorturlinfo berulang (server-nya suka errno 2/105) ----
if (!shareid || !uk) {
  for (let i = 0; i < 6 && (!shareid || !uk); i++) {
    for (const variant of [{ shorturl: surl, root: 1, scene: "" }, { shorturl: surl, root: 1, scene: "", slide: 0 }]) {
      const r = await get(`${HOST}/api/shorturlinfo?${q({ ...common, ...variant })}`);
      try {
        const j = JSON.parse(r.t);
        if (j.errno === 0 && j.shareid) { shareid = j.shareid; uk = j.uk; title = (j.list && j.list[0] && j.list[0].path) || ""; console.log(`shorturlinfo sukses (percobaan ${i + 1})`); break; }
      } catch {}
    }
    await sleep(800);
  }
}
console.log(`surl=${surl} shareid=${shareid} uk=${uk} judul="${title}"`);
if (!shareid || !uk) { console.log("MENTOK: shareid/uk tidak bisa didapat"); process.exit(1); }

// ---- 3. daftar file (rekursif 1 level) ----
const ls = async (dir) => {
  const r = await get(`${HOST}/share/list?${q({ ...common, shareid, uk, dir, page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1 })}`);
  let j = null;
  try { j = JSON.parse(r.t); } catch {}
  if (j && j.errno === 0) return j.list || [];
  const r2 = await get(`${HOST}/share/list?${q({ ...common, shorturl: surl, surl, dir, page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1, root: 1 })}`);
  try { j = JSON.parse(r2.t); } catch {}
  return (j && j.errno === 0 && j.list) || [];
};
const rootDir = title && title.startsWith("/") ? title.replace(/^\/+/, "") : "/";
let items = await ls("/");
if (!items.length && rootDir !== "/") items = await ls(rootDir);
console.log(`isi root: ${items.length} item`);
let files = items.filter((f) => Number(f.isdir) !== 1);
for (const d of items.filter((f) => Number(f.isdir) === 1).slice(0, 4)) {
  const kids = await ls(d.path);
  console.log(`  folder "${d.server_filename}" -> ${kids.length} item`);
  files = files.concat(kids.filter((f) => Number(f.isdir) !== 1).map((f) => ({ ...f, sub: d.server_filename })));
}
const vids = files.filter((f) => /\.(mp4|mov|mkv|avi)$/i.test(f.server_filename || f.filename || ""));
console.log(`video: ${vids.length}, total ${(vids.reduce((a, f) => a + Number(f.size || 0), 0) / 1048576).toFixed(0)}MB`);

// ---- 4. mediameta utk semua file ----
const ts0 = Math.floor(Date.now() / 1000);
let totalDur = 0;
const rows = [];
for (const f of vids.slice(0, 60)) {
  const r = await get(`${HOST}/share/mediameta?${q({ ...common, shareid, uk, fid: f.fs_id, timestamp: ts0 })}`);
  let j = null;
  try { j = JSON.parse(r.t); } catch {}
  const dur = j && j.errno === 0 ? Number(j.duration) || 0 : 0;
  totalDur += dur;
  rows.push({ name: (f.sub ? f.sub + " / " : "") + (f.server_filename || f.filename), fid: f.fs_id, size: Number(f.size || 0), dur, w: j && j.width, h: j && j.height });
}
rows.sort((a, b) => a.name.localeCompare(b.name, "id", { numeric: true }));
const mmss = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;
rows.forEach((r, i) => console.log(`  ${String(i + 1).padStart(2)}. ${r.name.slice(0, 46).padEnd(47)} ${mmss(r.dur).padStart(6)} ${(r.size / 1048576).toFixed(1).padStart(6)}MB ${r.w}x${r.h} fid=${r.fid}`));
console.log(`TOTAL DURASI: ${mmss(totalDur)} pada ${rows.length} file`);

// ---- 5. streaming: cek apakah full atau trial ----
const ts = Math.floor(Date.now() / 1000);
const hs = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${ts}`).digest("hex");
const pick = rows[0];
console.log(`\nstreaming "${pick.name}" fid=${pick.fid} (durasi asli ${mmss(pick.dur)})`);
for (const type of ["M3U8_AUTO_360", "M3U8_AUTO_720", "M3U8_AUTO_480", "M3U8_FLV_264_480", "M3U8_AUTO_1080"]) {
  const r = await get(`${HOST}/share/streaming?${q({ uk, shareid, type, fid: pick.fid, sign: hs, timestamp: ts, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" })}`);
  const segs = (r.t.match(/#EXTINF/g) || []).length;
  const sec = [...r.t.matchAll(/#EXTINF:([\d.]+)/g)].reduce((a, x) => a + Number(x[1]), 0);
  const j = (() => { try { return JSON.parse(r.t); } catch { return null; } })();
  console.log(`  ${type.padEnd(18)} ${r.status} ${j ? "errno=" + j.errno : `${segs} segmen = ${sec}s dari ${mmss(pick.dur)}`}`);
}
