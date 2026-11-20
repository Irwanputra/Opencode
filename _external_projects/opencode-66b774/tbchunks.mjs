import { appendFileSync, writeFileSync } from "node:fs";
const surl = process.argv[2] || "115f0upixp623O2JTwRzTJw";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/tbchunks.out", s + "\n");
};

const html = await (await fetch(`https://www.terabox.com/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(25000) })).text();
const urls = [...new Set([...html.matchAll(/https:\/\/[^"'()\s]+\.js/g)].map((m) => m[0]))];
log(`chunk terlihat di HTML: ${urls.length}`);
urls.forEach((u) => log("  " + u));

const want = urls.filter((u) => /share|index|list|player|video/i.test(u));
for (const u of urls) {
  try {
    const r = await fetch(u, { headers: { "user-agent": UA }, signal: AbortSignal.timeout(60000) });
    const t = await r.text();
    const marks = ["share/list", "dlink", "shareid", "passcode", "fs_id", "md5", "timestamp", "video_preview", "/sharing/"].filter((k) => t.includes(k));
    log(`  ${r.status} ${(t.length / 1024).toFixed(0)}KB ${marks.length ? "◆ " + marks.join(",") : "—"} ${u.split("/").pop()}`);
    if (marks.includes("share/list")) writeFileSync("/tmp/opencode/tbshare.js", t);
  } catch (e) {
    log(`  ERR ${String(e.message).slice(0, 50)} ${u.split("/").pop()}`);
  }
}
log("SELESAI");
