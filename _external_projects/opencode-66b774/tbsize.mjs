// Bypass pratinjau: main di len/range (bukan sign) buat narik TS lebih panjang
import crypto from "node:crypto";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl = process.argv[2] || "LA0Jq-HW5Fcv-8Q2FNC1ng";
const fid = process.argv[3] || "786085997243448";
const HOST = "https://www.terabox.com";

const cookies = new Map();
const jar = (r) => { for (const c of r.headers.getSetCookie?.() || []) { const [kv] = c.split(";"); const i = kv.indexOf("="); if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim()); } };
const hdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
const H = { "user-agent": UA, accept: "*/*", "accept-language": "id-ID,id;q=0.9", referer: "https://www.terabox.com/", origin: HOST, cookie: "" };

const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(30000) });
jar(pageRes);
const html = await pageRes.text();
H.cookie = hdr();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || [])[1]) || "";
const shareid = (html.match(/"(?:shareid|share_id)"?:"?(\d{6,20})/) || [])[1];
const uk = (html.match(/"uk"?:"?(\d{6,20})/) || [])[1];

const now = () => Math.floor(Date.now() / 1000);
const signFor = () => crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${now()}`).digest("hex");
async function playlist(type) {
  const t = now();
  const sg = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${t}`).digest("hex");
  const r = await fetch(`${HOST}/share/streaming?${q({ uk, shareid, type, fid, sign: sg, timestamp: t, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" })}`, { headers: H, signal: AbortSignal.timeout(25000) });
  const tx = await r.text();
  const segs = tx.split("\n").map((s) => s.trim()).filter((s) => s && !s.startsWith("#"));
  const j = (() => { try { return JSON.parse(tx); } catch { return null; } })();
  return { segs, j, tx };
}
async function probe(url, label, range) {
  try {
    const r = await fetch(url, { headers: { ...H, ...(range ? { range } : {}) }, signal: AbortSignal.timeout(60000) });
    const cl = Number(r.headers.get("content-length") || 0);
    if (range) {
      const b = Buffer.from(await r.arrayBuffer());
      console.log(`  ${label.padEnd(30)} ${r.status} cr="${r.headers.get("content-range")}" got=${b.length} ts@${b.indexOf(Buffer.from([0x47, 0x40, 0x11, 0x10]))}`);
      return b;
    }
    // HEAD-ish: ambil 4 byte doang pakai range buat baca total
    const r2 = await fetch(url, { headers: { ...H, range: "bytes=0-3" }, signal: AbortSignal.timeout(30000) });
    await r2.arrayBuffer();
    console.log(`  ${label.padEnd(30)} ${r.status} len-respons=${cl || "?"} total-SDH="${r2.headers.get("content-range")}" ct=${r.headers.get("content-type")}`);
    await r.arrayBuffer().catch(() => {});
    return null;
  } catch (e) {
    console.log(`  ${label.padEnd(30)} ERR ${String(e.message).slice(0, 45)}`);
    return null;
  }
}

for (const type of ["M3U8_AUTO_360", "M3U8_AUTO_480", "M3U8_FLV_264_480"]) {
  const { segs, j } = await playlist(type);
  if (!segs.length) {
    console.log(`\n### ${type}: errno=${j && j.errno}`);
    continue;
  }
  const u = new URL(segs[0]);
  const tsSize = Number(u.searchParams.get("ts_size"));
  const realSize = Number(u.searchParams.get("size"));
  const L = Number(u.searchParams.get("len"));
  console.log(`\n### ${type}: ${segs.length} segmen | len=${L} ts_size=${tsSize} mp4=${realSize}`);
  await probe(segs[0], "bawaan", "bytes=0-3");
  for (const mult of [2, 4, 8, 16, 64]) {
    const nu = new URL(segs[0]);
    const nl = Math.min(L * mult, realSize + 1048576);
    nu.searchParams.set("len", String(nl));
    nu.searchParams.set("range", `0-${nl - 1}`);
    await probe(nu.href, `len=${(nl / 1048576).toFixed(2)}MB`, "bytes=0-3");
  }
  // geser jendela ke ujung ts_size & seberangnya
  for (const start of [L, tsSize - L, tsSize, tsSize + 1024, realSize - L]) {
    const nu = new URL(segs[0]);
    nu.searchParams.set("len", String(L));
    nu.searchParams.set("range", `${start}-${start + L - 1}`);
    await probe(nu.href, `range mulai ${start}`, `bytes=0-3`);
  }
}
