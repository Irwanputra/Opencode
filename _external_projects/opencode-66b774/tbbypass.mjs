// Uji penentu: apakah URL segmen TeraBox bisa ditempel-engkel buat ngambil segmen yang NGGAK dikasih playlist
import crypto from "node:crypto";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl = process.argv[2] || "LA0Jq-HW5Fcv-8Q2FNC1ng";
const fid = process.argv[3] || "786085997243448"; // 1_syaliongnew, 59s
const HOST = "https://www.terabox.com";
const fs = await import("node:fs");

const cookies = new Map();
const jar = (r) => { for (const c of r.headers.getSetCookie?.() || []) { const [kv] = c.split(";"); const i = kv.indexOf("="); if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim()); } };
const hdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
const H = (ref) => ({ "user-agent": UA, accept: "*/*", "accept-language": "id-ID,id;q=0.9,en;q=0.8", referer: ref || `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: hdr() });

const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(30000) });
jar(pageRes);
const html = await pageRes.text();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || [])[1]) || "";
const shareid = (html.match(/"(?:shareid|share_id)"?:"?(\d{6,20})/) || [])[1];
const uk = (html.match(/"uk"?:"?(\d{6,20})/) || [])[1];
const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };

const ts = Math.floor(Date.now() / 1000);
const hs = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${ts}`).digest("hex");
const plUrl = `${HOST}/share/streaming?${q({ uk, shareid, type: "M3U8_AUTO_360", fid, sign: hs, timestamp: ts, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" })}`;
const plText = await (await fetch(plUrl, { headers: H(), signal: AbortSignal.timeout(25000) })).text();
const seg = plText.split("\n").map((s) => s.trim()).find((s) => s && !s.startsWith("#"));
if (!seg) {
  console.log("playlist nggak kasih segmen:", plText.slice(0, 200));
  process.exit(1);
}
const u = new URL(seg);
console.log("segmen asli:");
for (const k of ["path", "len", "range", "dtime", "time", "ts_size", "size", "fsid", "fid", "etag", "xcode", "sign", "pmk", "by", "uo", "r"]) console.log(`  ${k.padEnd(8)} = ${u.searchParams.get(k)}`);

const md5 = (b) => crypto.createHash("md5").update(b).digest("hex");
const fetchBuf = async (url, label, range) => {
  try {
    const r = await fetch(url, { headers: { ...H("https://www.terabox.com/"), ...(range ? { range } : {}) }, signal: AbortSignal.timeout(40000) });
    const b = Buffer.from(await r.arrayBuffer());
    console.log(`  ${label.padEnd(34)} ${r.status} ${String(b.length).padStart(8)}B cr="${r.headers.get("content-range")}" md5=${md5(b).slice(0, 12)} ts@${b.indexOf(Buffer.from([0x47, 0x40, 0x11, 0x10]))}`);
    return b;
  } catch (e) {
    console.log(`  ${label.padEnd(34)} ERR ${String(e.message).slice(0, 50)}`);
    return null;
  }
};

console.log("\n=== A. apakah RANGE beneran ngasih byte beda (bukan echo)? ===");
const L = Number(u.searchParams.get("len"));
const a = await fetchBuf(seg, "range bawaan 0-(L-1)");
const b = await fetchBuf(seg, "range L-(2L-1)", `bytes=${L}-${2 * L - 1}`);
const c = await fetchBuf(seg, "range 2L-(3L-1)", `bytes=${2 * L}-${3 * L - 1}`);
const d = await fetchBuf(seg, "range 0-(L-1) ulang", `bytes=0-${L - 1}`);
const sameBC = a && b && md5(a) === md5(b);
const sameAD = a && d && md5(a) === md5(d);
console.log(`  >> a==b ? ${sameBC ? "SAMA (range diabaikan → mentok)" : "BEDA (range jalan!)"} | a==a-ulang ? ${sameAD ? "konsisten" : "TIDAK KONSISTEN"}`);
if (b) fs.writeFileSync("/tmp/opencode/win_b.ts", b);
if (c) fs.writeFileSync("/tmp/opencode/win_c.ts", c);

console.log("\n=== B. ganti LEN (jendela lebih besar) dgn sign/xcode lama ===");
for (const mult of [2, 4, 8]) {
  const nu = new URL(seg);
  const nl = L * mult;
  nu.searchParams.set("len", String(nl));
  nu.searchParams.set("range", `0-${nl - 1}`);
  await fetchBuf(nu.href, `len=x${mult} (${(nl / 1024).toFixed(0)}KB)`);
}

console.log("\n=== C. ganti fsid/fid buat tahu parameter mana yang dijaga ===");
for (const k of ["fsid", "fid", "etag", "xcode", "sign", "path", "dtime", "time", "pmk"]) {
  const nu = new URL(seg);
  const cur = nu.searchParams.get(k) || "";
  nu.searchParams.set(k, k === "path" ? "/asal/bedang.mp4" : cur.length > 8 ? cur.slice(0, 4) + cur.slice(5) : String(Number(cur) + 7));
  await fetchBuf(nu.href, `rusak ${k}`);
}

console.log("\n=== D. apa nama segmen = md5_asli_<n>_<fsid>_ts ? (tebak segmen berikutnya) ===");
const mm = await (await fetch(`${HOST}/share/mediameta?${q({ ...common, shareid, uk, fid, timestamp: ts })}`, { headers: H(), signal: AbortSignal.timeout(20000) })).text();
const mmd = (() => { try { return JSON.parse(mm); } catch { return {}; } })();
console.log(`  mediameta: durasi=${mmd.duration} real_md5=${mmd.real_md5} ukuran_file=${(Number(u.searchParams.get("size")) / 1048576).toFixed(1)}MB`);
const pathParts = decodeURIComponent(u.searchParams.get("path") || "");
console.log(`  path=${pathParts}`);
