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
const q = (o) =>
  Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
const H = (ref) => ({
  "user-agent": UA,
  accept: "application/json, text/plain, */*",
  "accept-language": "id-ID,id;q=0.9,en;q=0.8",
  referer: ref || `${HOST}/sharing/link?surl=${surl}`,
  origin: HOST,
  cookie: cookieHdr(),
});

const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(30000) });
jar(pageRes);
const html = await pageRes.text();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/) || [])[1]) || "";
const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };

const get = async (path, params, ref) => {
  const r = await fetch(`${HOST}${path}?${q(params)}`, { headers: H(ref), signal: AbortSignal.timeout(30000) });
  jar(r);
  const t = await r.text();
  let j = null;
  try { j = JSON.parse(t); } catch {}
  return { status: r.status, j, t, ct: String(r.headers.get("content-type")) };
};
const post = async (path, query, body) => {
  const r = await fetch(`${HOST}${path}?${q(query)}`, {
    method: "POST",
    headers: { ...H(), "content-type": "application/x-www-form-urlencoded" },
    body: q(body),
    signal: AbortSignal.timeout(30000),
  });
  jar(r);
  const t = await r.text();
  let j = null;
  try { j = JSON.parse(t); } catch {}
  return { status: r.status, j, t };
};

const info = await get("/api/shorturlinfo", { ...common, shorturl: surl, root: 1, scene: "" });
const d = info.j || {};
const { shareid, uk, sign: shareSign, timestamp: shareTs } = d;
const folder = (d.list && d.list[0] && d.list[0].path) || "/";
console.log(`shareid=${shareid} uk=${uk} folder="${folder}" shareSign=${String(shareSign).slice(0, 16)}… shareTs=${shareTs}`);

const lst = await get("/share/list", { ...common, shareid, uk, dir: folder, page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1 });
const files = (lst.j && lst.j.list ? lst.j.list : []).filter((f) => Number(f.isdir) !== 1);
files.sort((a, b) => Number(b.size) - Number(a.size));
console.log(`file=${files.length} — terbesar: ${files.slice(0, 3).map((f) => `${f.server_filename}(${(f.size / 1048576).toFixed(0)}MB)`).join(", ")}`);

const vid = files[0];
const fid = vid.fs_id;
console.log(`\npcoba pada: ${vid.server_filename} fs_id=${fid} size=${(vid.size / 1048576).toFixed(1)}MB md5=${vid.md5}`);

const ts = Math.floor(Date.now() / 1000);
const hs = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${ts}`).digest("hex");

// ---- A. HLS streaming ----
console.log("\n--- A. /share/streaming (HLS) ---");
for (const type of ["M3U8_AUTO_720", "M3U8_AUTO_360", "M3U8_AUTO_1080"]) {
  for (const [lab, sg, tsp] of [["hmac baru", hs, ts], ["share sign", shareSign, shareTs]]) {
    const r = await get("/share/streaming", { uk, shareid, type, fid, sign: sg, timestamp: tsp, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" });
    console.log(`  ${type.padEnd(15)} ${lab.padEnd(11)} ${r.status} ${r.ct.slice(0, 20).padEnd(22)} ${r.t.replace(/\s+/g, " ").slice(0, 150)}`);
  }
}

// ---- B. dlink ----
console.log("\n--- B. /share/download (dlink) ---");
for (const [lab, sg, tsp] of [["share sign", shareSign, shareTs], ["hmac baru", hs, ts]]) {
  const qy = { ...common, shareid, type: "dlink", sign: sg, timestamp: tsp, need_speed: 0 };
  const bd = { uk, fid_list: JSON.stringify([fid]), primaryid: shareid };
  const g = await get("/share/download", { ...qy, uk, fid_list: fid, primaryid: shareid });
  const p = await post("/share/download", qy, bd);
  console.log(`  GET  ${lab.padEnd(11)} ${g.status} ${g.t.replace(/\s+/g, " ").slice(0, 220)}`);
  console.log(`  POST ${lab.padEnd(11)} ${p.status} ${p.t.replace(/\s+/g, " ").slice(0, 220)}`);
}

// ---- C. mediameta ----
console.log("\n--- C. /share/mediameta ---");
for (const [lab, sg, tsp] of [["tanpa sign", "", ts], ["share sign", shareSign, shareTs], ["hmac", hs, ts]]) {
  const r = await get("/share/mediameta", { ...common, uk, shareid, fid, timestamp: tsp, ...(sg ? { sign: sg } : {}) });
  console.log(`  ${lab.padEnd(11)} ${r.status} ${r.t.replace(/\s+/g, " ").slice(0, 260)}`);
}
