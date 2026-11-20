import { appendFileSync, writeFileSync } from "node:fs";
const surl = "115f0upixp623O2JTwRzTJw";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/tbtoken.out", s + "\n");
};

const html = await (await fetch(`https://www.terabox.com/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(25000) })).text();
writeFileSync("/tmp/opencode/tbshare.html", html);

const i = html.indexOf("jsToken");
log("posisi jsToken: " + i + " / panjang html " + html.length);
log("--- konteks mentah ---");
log(html.slice(Math.max(0, i - 2500), i + 2500));
log("--- versi decoded ---");
log(decodeURIComponent(html.slice(Math.max(0, i - 2500), i + 2500)).replace(/\s+/g, " ").slice(0, 3000));
for (const k of ["browserid", "cookie", "ndus", "tsiskin", "jsToken", "fn(", "token?"]) {
  const n = (html.match(new RegExp(k.replace(/[.*+?^${}()|[\]\\]/g, "\\$&"), "g")) || []).length;
  log(`jumlah "${k}": ${n}`);
}
