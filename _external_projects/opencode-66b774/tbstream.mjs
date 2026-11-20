import crypto from "node:crypto";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl = process.argv[2] || "115f0upixp623O2JTwRzTJw";
const HOST = process.argv[3] || "https://www.terabox.com";

const cookies = new Map();
const jar = (res) => {
  for (const c of res.headers.getSetCookie?.() || []) {
    const [kv] = c.split(";");
    const i = kv.indexOf("=");
    if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim());
  }
};
const cookieHdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");

// 1. halaman share -> cookie browserid + jsToken
const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, {
  headers: { "user-agent": UA, accept: "text/html,application/xhtml+xml", "accept-language": "id-ID,id;q=0.9,en;q=0.8" },
  signal: AbortSignal.timeout(30000),
});
jar(pageRes);
const html = await pageRes.text();
const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/) || [])[1]) || "";
console.log("cookie :", [...cookies.keys()].join(","));
console.log("jsToken:", jsToken.slice(0, 30) + "…");

const common = () => ({ app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" });

// 2. shorturlinfo -> shareid, uk, fs_id
const siRes = await fetch(`${HOST}/api/shorturlinfo?${q({ ...common(), shorturl: surl, root: 1, scene: "" })}`, {
  headers: { "user-agent": UA, accept: "application/json, text/plain, */*", referer: `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: cookieHdr() },
  signal: AbortSignal.timeout(25000),
});
jar(siRes);
const si = await siRes.json();
console.log("\nSHORTURLINFO errno:", si.errno, "| fcount:", si.fcount, "| shareid:", si.shareid, "| uk:", si.uk);
console.log(JSON.stringify(si, null, 1).slice(0, 1800));

const shareid = si.shareid || (si.list && si.list[0] && si.list[0].shareid);
const uk = si.uk || (si.list && si.list[0] && si.list[0].uk);
const f0 = (si.list && si.list[0]) || {};
console.log("\nshareid =", shareid, "uk =", uk, "fs_id =", f0.fs_id, "nama =", f0.filename, "ukuran =", f0.size, "md5 =", f0.md5);

// 3. sign: HMAC(clienttype+channel+browserid+timestamp, KEY)
const ts = Math.floor(Date.now() / 1000);
const msg = `0dubox${cookies.get("browserid") || ""}${ts}`;
const variants = {
  HmacSHA256: crypto.createHmac("sha256", KEY).update(msg).digest("hex"),
  HmacSHA1: crypto.createHmac("sha1", KEY).update(msg).digest("hex"),
  HmacMD5: crypto.createHmac("md5", KEY).update(msg).digest("hex"),
  MD5: crypto.createHash("md5").update(msg + KEY).digest("hex"),
  SHA256: crypto.createHash("sha256").update(msg + KEY).digest("hex"),
};
console.log("\nsign input:", msg);

for (const [algo, sign] of Object.entries(variants)) {
  for (const type of ["M3U8_AUTO_720", "M3U8_AUTO_360"]) {
    const url = `${HOST}/share/streaming?${q({
      uk: uk || "",
      shareid: shareid || "",
      type,
      fid: f0.fs_id || "",
      sign,
      timestamp: ts,
      jsToken,
      esl: 1,
      isplayer: 1,
      ehps: 1,
      clienttype: 0,
      app_id: 250528,
      web: 1,
      channel: "dubox",
    })}`;
    try {
      const r = await fetch(url, {
        headers: { "user-agent": UA, accept: "*/*", referer: `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: cookieHdr() },
        redirect: "follow",
        signal: AbortSignal.timeout(25000),
      });
      const ct = String(r.headers.get("content-type"));
      const t = await r.text();
      const tag = t.includes("#EXTM3U") ? "🎬 M3U8" : t.trim().startsWith("{") ? "json errno=" + (JSON.parse(t).errno ?? "?") : "lain";
      console.log(`  ${algo.padEnd(10)} ${type.padEnd(14)} ${r.status} ${ct.slice(0, 22).padEnd(24)} ${tag.padEnd(18)} ${t.replace(/\s+/g, " ").slice(0, 130)}`);
      if (t.includes("#EXTM3U")) {
        console.log("     ✅ PLAYLIST:\n" + t.split("\n").slice(0, 12).join("\n     "));
      }
    } catch (e) {
      console.log(`  ${algo.padEnd(10)} ${type.padEnd(14)} ERR ${String(e.message).slice(0, 50)}`);
    }
  }
}
