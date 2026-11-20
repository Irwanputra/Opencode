// Apakah login (ndus/bduss) membuka stream penuh? Cek dulu bentuk respons tanpa login.
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const surl = process.argv[2] || "LA0Jq-HW5Fcv-8Q2FNC1ng";
const HOST = "https://www.terabox.com";
const cookies = new Map();
const jar = (r) => { for (const c of r.headers.getSetCookie?.() || []) { const [kv] = c.split(";"); const i = kv.indexOf("="); if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim()); } };
const hdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
const H = () => ({ "user-agent": UA, accept: "application/json, text/plain, */*", "accept-language": "id-ID,id;q=0.9,en;q=0.8", referer: `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: hdr() });

const res = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(30000) });
jar(res);
const html = await res.text();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || [])[1]) || "";
const shareid = (html.match(/"shareid"?:"?(\d{6,20})/) || [])[1];
const uk = (html.match(/"uk"?:"?(\d{6,20})/) || [])[1];
const bdstoken = (html.match(/"bdstoken":"([0-9a-f]{16,40})"/) || [])[1] || "";
console.log(`shareid=${shareid} uk=${uk} bdstoken=${bdstoken || "(kosong)"} cookie=[${[...cookies.keys()]}]`);
const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };

const fid = process.argv[3] || "786085997243448";
const ts = Math.floor(Date.now() / 1000);

const call = async (label, url, opt = {}) => {
  try {
    const r = await fetch(url, { ...opt, headers: { ...H(), ...(opt.headers || {}) }, redirect: "manual", signal: AbortSignal.timeout(30000) });
    jar(r);
    const t = await r.text();
    console.log(`  ${label.padEnd(38)} ${r.status} loc=${String(r.headers.get("location")).slice(0, 40)} ${t.replace(/\s+/g, " ").slice(0, 220)}`);
  } catch (e) {
    console.log(`  ${label.padEnd(38)} ERR ${String(e.message).slice(0, 60)}`);
  }
};

console.log("\n=== /share/download (dlink) ===");
for (const sg of ["", "bd"]) {
  const qs = { ...common, shareid, uk, sign: sg === "bd" ? (html.match(/"sign":"([0-9a-f]{30,50})"/) || [])[1] || "" : "", timestamp: ts, ...(sg === "bd" ? { timestamp: Number((html.match(/"timestamp":(\d+)/) || [])[1] || ts) } : {}) };
  await call(`GET bduss=- ${sg}`, `${HOST}/share/download?${q({ ...qs, type: "dlink", need_speed: 0, fid_list: fid, uk, primaryid: shareid })}`);
  await call(`POST bduss=- ${sg}`, `${HOST}/share/download?${q({ ...qs, type: "dlink", need_speed: 0 })}`, { method: "POST", headers: { "content-type": "application/x-www-form-urlencoded" }, body: q({ uk, fid_list: JSON.stringify([fid]), primaryid: shareid, bdstoken }) });
}

console.log("\n=== endpoint pembeda login ===");
for (const [lab, u] of [
  ["/api/logincheck", `${HOST}/api/logincheck?${q({ ...common })}`],
  ["/api/quota", `${HOST}/api/quota?${q({ ...common })}`],
  ["/share/pset", `${HOST}/share/pset?${q({ ...common, from: "share_link", embedvideo: 1, bdstoken })}`],
  ["/share/webmaster/check", `${HOST}/share/webmaster/check?${q({ ...common, shareid, uk })}`],
  ["/rest/2.0/netdisk/dumptimestamp", `${HOST}/rest/2.0/netdisk/dumptimestamp?${q({ ...common, method: "get" })}`],
]) await call(lab, u);

console.log("\n=== playlist: apa ts_size/len/dtime bisa dinaikkan? ===");
import crypto from "node:crypto";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const hs = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${ts}`).digest("hex");
const base = { uk, shareid, fid, sign: hs, timestamp: ts, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" };
for (const [lab, extra] of [["bawaan", { type: "M3U8_AUTO_360" }], ["+ts_size", { type: "M3U8_AUTO_360", ts_size: 0 }], ["+start=10", { type: "M3U8_AUTO_360", start: 10 }], ["+offset=10", { type: "M3U8_AUTO_360", offset: 10 }], ["+st=10", { type: "M3U8_AUTO_360", st: 10 }], ["+dp-logid", { type: "M3U8_AUTO_360", "dp-logid": String(Date.now()) + "000000" }], ["vip=1&esl=0", { type: "M3U8_AUTO_360", vip: 1, esl: 0 }], ["isplayer=0", { type: "M3U8_AUTO_360", isplayer: 0, esl: 0, ehps: 0 }]]) {
  const r = await fetch(`${HOST}/share/streaming?${q({ ...base, ...extra })}`, { headers: H(), signal: AbortSignal.timeout(25000) });
  const t = await r.text();
  const j = (() => { try { return JSON.parse(t); } catch { return null; } })();
  const segs = [...t.matchAll(/#EXTINF:([\d.]+)/g)].map((x) => x[1]);
  console.log(`  ${lab.padEnd(14)} ${r.status} ${j ? "errno=" + j.errno : `[${segs.join(",")}] = ${segs.reduce((a, x) => a + Number(x), 0)}s`}`);
}
