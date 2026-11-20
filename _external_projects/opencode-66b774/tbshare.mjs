import { appendFileSync, writeFileSync, existsSync, readFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/tbshare.out", s + "\n");
};

const html = readFileSync("/tmp/opencode/tbshare.html", "utf8");
const chunks = [...new Set([...html.matchAll(/https:\/\/s5\.teraboxcdn\.com\/fe-static\/fe-v5-web-share\/js\/[A-Za-z0-9_.$-]+\.js/g)].map((m) => m[0]))];
log("chunk: " + chunks.length);

const KEYWORDS = ["share/list", "shareid", "dlink", "jsToken", "browserid", "passcode", "verify_code", "md5", "MD5", "timestamp", "video_preview", "thumb", "resolution", "stream"];

for (const u of chunks) {
  const name = u.split("/").pop();
  const f = "/tmp/opencode/chunk_" + name;
  let t;
  if (existsSync(f)) t = readFileSync(f, "utf8");
  else {
    try {
      const r = await fetch(u, { headers: { "user-agent": UA }, signal: AbortSignal.timeout(60000) });
      t = await r.text();
      writeFileSync(f, t);
    } catch (e) {
      log(`  ERR ${String(e.message).slice(0, 50)} ${name}`);
      continue;
    }
  }
  const marks = KEYWORDS.filter((k) => t.includes(k));
  log(`  ${name} ${(t.length / 1024).toFixed(0)}KB ${marks.length ? "◆ " + marks.join(",") : "—"}`);
}

// konteks dari chunk yang memuat share/list
for (const f of chunks.map((u) => "/tmp/opencode/chunk_" + u.split("/").pop())) {
  if (!existsSync(f)) continue;
  const t = readFileSync(f, "utf8");
  for (const k of ["share/list", "video_preview", "jsToken", "browserid"]) {
    let i = -1;
    let n = 0;
    while ((i = t.indexOf(k, i + 1)) !== -1 && n < 3) {
      log(`\n[${f.split("/").pop()}] <<${k}>>\n${t.slice(Math.max(0, i - 700), i + 900).replace(/\s+/g, " ")}`);
      n++;
    }
  }
}
