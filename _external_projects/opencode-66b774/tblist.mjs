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
  Object.entries(o)
    .filter(([, v]) => v !== "" && v != null)
    .map(([k, v]) => `${k}=${encodeURIComponent(v)}`)
    .join("&");
const hdr = (ref) => ({
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

let lastRes;
async function getJson(path, params) {
  lastRes = await fetch(`${HOST}${path}?${q(params)}`, { headers: hdr(), signal: AbortSignal.timeout(25000) });
  jar(lastRes);
  const t = await lastRes.text();
  try {
    return { status: lastRes.status, json: JSON.parse(t), text: t };
  } catch {
    return { status: lastRes.status, json: null, text: t };
  }
}

const info = await getJson("/api/shorturlinfo", { ...common, shorturl: surl, root: 1, scene: "" });
const d = info.json || {};
const shareid = d.shareid;
const uk = d.uk;
const folder = (d.list && d.list[0] && d.list[0].path) || "/";
console.log(`errno=${d.errno} shareid=${shareid} uk=${uk} folder="${folder}" fcount=${d.fcount}`);
console.log(`share sign=${d.sign} ts=${d.timestamp} randsk=${String(d.randsk).slice(0, 20)}…`);

// ---- /share/list dalam beberapa varian parameter ----
const tries = [
  ["dasar", { ...common, shareid, uk, dir: folder, page: 1, num: 50, order: "name", desc: 1, scene: "", web: 1 }],
  ["+sign share", { ...common, shareid, uk, dir: folder, page: 1, num: 50, order: "name", desc: 1, scene: "", web: 1, sign: d.sign, timestamp: d.timestamp }],
  ["+randsk", { ...common, shareid, uk, dir: folder, page: 1, num: 50, order: "name", desc: 1, scene: "", web: 1, sign: d.sign, timestamp: d.timestamp, randsk: d.randsk }],
  ["surl saja", { ...common, shorturl: surl, surl, dir: folder, page: 1, num: 50, order: "name", desc: 1, scene: "", web: 1, root: 1 }],
];

let files = null;
for (const [label, params] of tries) {
  const r = await getJson("/share/list", params);
  const j = r.json || {};
  const arr = j.list || [];
  console.log(`  list[${label}] ${r.status} errno=${j.errno} file=${arr.length}${arr.length ? "" : " " + String(r.text).slice(0, 90)}`);
  if (arr.length) {
    files = arr;
    console.log("     ↳ varian yang jalan: " + label);
    break;
  }
}

if (files) {
  console.log("\nISI FOLDER:");
  for (const f of files) {
    console.log(
      `  • ${f.server_filename || f.filename} | ${(Number(f.size || 0) / 1048576).toFixed(1)} MB | fs_id=${f.fs_id} | cat=${f.category} | isdir=${f.isdir} | md5=${String(f.md5).slice(0, 12)}`
    );
    if (f.dlink) console.log(`      dlink: ${String(f.dlink).slice(0, 160)}`);
    if (f.thumbs) console.log(`      thumb: ${JSON.stringify(f.thumbs).slice(0, 160)}`);
  }

  // ---- streaming HLS untuk file video pertama ----
  const vid = files.find((f) => String(f.category) !== "1" && Number(f.isdir) !== 1 && /\.mp4|\.mkv|\.mov/i.test(f.server_filename || f.filename || "")) || files[0];
  const ts = Math.floor(Date.now() / 1000);
  const msg = `0dubox${cookies.get("browserid") || ""}${ts}`;
  const signHs = crypto.createHmac("sha256", KEY).update(msg).digest("hex");
  console.log(`\nstreaming untuk "${vid.server_filename || vid.filename}" fs_id=${vid.fs_id}`);
  for (const type of ["M3U8_AUTO_720", "M3U8_AUTO_360", "M3U8_FLV_264_480"]) {
    const r = await getJson("/share/streaming", {
      uk, shareid, type, fid: vid.fs_id, sign: signHs, timestamp: ts, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox",
    });
    console.log(`  ${type.padEnd(17)} ${r.status} ${String(r.json ? "json errno=" + r.json.errno : (r.text.includes("#EXTM3U") ? "M3U8" : "lain"))} ${r.text.replace(/\s+/g, " ").slice(0, 200)}`);
  }
  // ---- mediameta (durasi/ukuran) ----
  const mm = await getJson("/share/mediameta", { ...common, uk, shareid, fid: vid.fs_id, timestamp: ts });
  console.log("\nmediameta:", mm.status, mm.text.slice(0, 400));
}
