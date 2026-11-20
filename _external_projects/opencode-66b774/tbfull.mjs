// Cari cara membuka playlist HLS PENUH (non-trial) untuk file share
import crypto from "node:crypto";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl = process.argv[2] || "115f0upixp623O2JTwRzTJw";
const HOST = process.argv[3] || "https://www.terabox.com";

const cookies = new Map();
const jar = (r) => {
  for (const c of r.headers.getSetCookie?.() || []) {
    const [kv] = c.split(";");
    const i = kv.indexOf("=");
    if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim());
  }
};
const cookieHdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
const H = (ref) => ({ "user-agent": UA, accept: "*/*", "accept-language": "id-ID,id;q=0.9,en;q=0.8", referer: ref || `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: cookieHdr() });

const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(30000) });
jar(pageRes);
const html = await pageRes.text();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/) || [])[1]) || "";
const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };

const get = async (url, ref) => {
  const r = await fetch(url, { headers: H(ref), signal: AbortSignal.timeout(30000) });
  jar(r);
  const t = await r.text();
  return { status: r.status, ct: String(r.headers.get("content-type")), t };
};
const segCount = (t) => (t.includes("#EXTM3U") ? [...t.matchAll(/#EXTINF:([\d.]+)/g)].reduce((a, m) => a + Number(m[1]), 0).toFixed(0) + "s/" + (t.match(/#EXTINF/g) || []).length + "seg" : t.slice(0, 90).replace(/\s+/g, " "));

const info = await (await fetch(`${HOST}/api/shorturlinfo?${q({ ...common, shorturl: surl, root: 1, scene: "" })}`, { headers: H(), signal: AbortSignal.timeout(25000) })).json();
const { shareid, uk } = info;
const folder = (info.list && info.list[0] && info.list[0].path) || "/";
const lst = await (await fetch(`${HOST}/share/list?${q({ ...common, shareid, uk, dir: folder, page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1 })}`, { headers: H(), signal: AbortSignal.timeout(25000) })).json();
const big = lst.list.filter((f) => Number(f.isdir) !== 1).sort((a, b) => Number(b.size) - Number(a.size))[0];
const fid = big.fs_id;
const path = big.path;
console.log(`fid=${fid} path="${path}" size=${(big.size / 1048576).toFixed(1)}MB shareid=${shareid} uk=${uk}`);

const ts = Math.floor(Date.now() / 1000);
const hs = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${ts}`).digest("hex");

console.log("\n=== A. /api/streaming (berbasis path, tanpa sign) ===");
for (const type of ["M3U8_AUTO_360", "M3U8_AUTO_720", "M3U8_AUTO_1080", "M3U8_FLV_264_480"]) {
  for (const vip of [0, 1]) {
    const r = await get(`${HOST}/api/streaming?${q({ path, app_id: 250528, clienttype: 0, type, vip })}`);
    console.log(`  ${type.padEnd(17)} vip=${vip} ${r.status} ${segCount(r.t)}`);
  }
}

console.log("\n=== B. /share/streaming + varian parameter ===");
const base = { uk, shareid, fid, sign: hs, timestamp: ts, jsToken, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" };
const variants = {
  "esl=0 isplayer=0": { ...base, esl: 0, isplayer: 0, ehps: 1, type: "M3U8_AUTO_360" },
  "tanpa esl/ehps": { ...base, type: "M3U8_AUTO_360" },
  "esl=2": { ...base, esl: 2, isplayer: 1, ehps: 1, type: "M3U8_AUTO_360" },
  "vip=1": { ...base, esl: 1, isplayer: 1, ehps: 1, vip: 1, type: "M3U8_AUTO_360" },
  "web=0": { ...base, esl: 1, isplayer: 1, ehps: 1, web: 0, type: "M3U8_AUTO_360" },
  "clienttype=5": { ...base, esl: 1, isplayer: 1, ehps: 1, clienttype: 5, type: "M3U8_AUTO_360" },
  "start=0&limit": { ...base, esl: 1, isplayer: 1, ehps: 1, start: 0, limit: 500, type: "M3U8_AUTO_360" },
  "M3U8_AUTO": { ...base, esl: 1, isplayer: 1, ehps: 1, type: "M3U8_AUTO" },
  "M3U8_AUTO_264_360": { ...base, esl: 1, isplayer: 1, ehps: 1, type: "M3U8_AUTO_264_360" },
  "FLV_264_360": { ...base, esl: 1, isplayer: 1, ehps: 1, type: "M3U8_FLV_264_360" },
  "MP4_AUTO_360": { ...base, esl: 1, isplayer: 1, ehps: 1, type: "MP4_AUTO_360" },
};
for (const [lab, p] of Object.entries(variants)) {
  const r = await get(`${HOST}/share/streaming?${q(p)}`);
  console.log(`  ${lab.padEnd(20)} ${r.status} ${segCount(r.t)}`);
}

console.log("\n=== C. /api/list (path-based) ===");
for (const body of [{ dir: folder, start: 0, limit: 500, order: "name", desc: 0 }, { dir: folder, start: 0, limit: 500 }]) {
  const r = await get(`${HOST}/api/list?${q({ ...common, ...body, shareid, uk })}`);
  console.log(`  ${r.status} ${r.t.slice(0, 160).replace(/\s+/g, " ")}`);
}

console.log("\n=== D. apakah segmen bisa di-request manual (range berikutnya)? ===");
const pl = await get(`${HOST}/share/streaming?${q({ ...base, esl: 1, isplayer: 1, ehps: 1, type: "M3U8_AUTO_360" })}`);
const urls = pl.t.split("\n").map((s) => s.trim()).filter((s) => s && !s.startsWith("#"));
console.log("  segmen di playlist: " + urls.length);
if (urls.length) {
  const u = new URL(urls[0]);
  console.log("  parameter segmen: " + [...u.searchParams.keys()].join(","));
  const orig = u.searchParams.get("range");
  const len = u.searchParams.get("len");
  console.log(`  range=${orig} len=${len}`);
  for (const rg of [`${Number(len) * 5}-${Number(len) * 5 + 344603}`, "0-999999"]) {
    const nu = new URL(urls[0]);
    nu.searchParams.set("range", rg);
    const r = await fetch(nu.href, { headers: { "user-agent": UA, referer: `${HOST}/`, cookie: cookieHdr() }, signal: AbortSignal.timeout(30000) });
    console.log(`  range=${rg.padEnd(22)} -> ${r.status} ${(r.headers.get("content-length") || "?").padStart(8)}B ${String(r.headers.get("content-type")).slice(0, 24)}`);
    if (r.status === 200 || r.status === 206) await r.arrayBuffer();
  }
}
