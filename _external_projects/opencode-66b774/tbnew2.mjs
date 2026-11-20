// Bongkar HTML + window变量 utk surl baru: cari shareid/uk, lalu coba semua jalur streaming
const fs = await import("node:fs");
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const surl = process.argv[2] || "LA0Jq-HW5Fcv-8Q2FNC1ng";
const HOST = process.argv[3] || "https://www.terabox.com";

const cookies = new Map();
const jar = (r) => { for (const c of r.headers.getSetCookie?.() || []) { const [kv] = c.split(";"); const i = kv.indexOf("="); if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim()); } };
const hdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");

const res = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html,application/xhtml+xml", "accept-language": "id-ID,id;q=0.9,en;q=0.8" }, signal: AbortSignal.timeout(30000) });
jar(res);
const html = await res.text();
fs.writeFileSync("/tmp/opencode/tbnew.html", html);
console.log("HTML:", res.status, html.length, "B | cookie:", [...cookies.keys()].join(","));
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/) || [])[1]) || "";

for (const k of ["shareid", "uk=", "\"uk\"", "ssr", "templateData", "errno", "passcode", "提取码", "password"]) {
  const n = (html.match(new RegExp(k.replace(/[.*+?^${}()|[\]\\]/g, "\\$&"), "g")) || []).length;
  console.log(`  "${k}": ${n}`);
}
for (const m of html.matchAll(/(shareid|uk|share_?id)["']?\s*[:=]\s*["']?(\d{6,20})/g)) console.log("  KOTEKAN:", m[0].slice(0, 60));
const i = html.indexOf("templateData");
if (i > -1) console.log("\ntemplateData:", decodeURIComponent(html.slice(i, i + 1200)).replace(/\s+/g, " ").slice(0, 1000));
const j = html.indexOf("errno");
if (j > -1) console.log("\nkonteks errno:", decodeURIComponent(html.slice(Math.max(0, j - 400), j + 400)).replace(/\s+/g, " "));

// coba /api/unformat & rekanannya utk dapat longurl
const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };
const H = { "user-agent": UA, accept: "application/json, text/plain, */*", referer: `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: hdr() };
console.log("\n=== berburu shareid/uk ===");
for (const [path, params] of [
  ["/api/unformat", { ...common, shorturl: surl, method: "short" }],
  ["/api/unformat", { ...common, shorturl: "1" + surl, method: "short" }],
  ["/api/shorturlinfo", { ...common, shorturl: "1" + surl, root: 1, scene: "" }],
  ["/api/shorturlinfo", { ...common, shorturl: surl, root: 1, scene: "", slide: 0 }],
  ["/api/shorturlinfo", { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, shorturl: surl, root: 1 }],
  ["/share/list", { ...common, shorturl: surl, dir: "/", page: 1, num: 100, web: 1, root: 1 }],
]) {
  try {
    const r = await fetch(`${HOST}${path}?${q(params)}`, { headers: H, signal: AbortSignal.timeout(25000) });
    jar(r);
    const t = await r.text();
    console.log(`  ${path}?${Object.keys(params).filter((k) => k !== "app_id" && k !== "web" && k !== "channel" && k !== "clienttype" && k !== "jsToken" && k !== "devuid").join(",")} -> ${r.status} ${t.slice(0, 200).replace(/\s+/g, " ")}`);
  } catch (e) {
    console.log(`  ${path} ERR ${String(e.message).slice(0, 50)}`);
  }
}
