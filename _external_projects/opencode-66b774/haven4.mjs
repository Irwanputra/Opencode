import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/haven4.out", s + "\n");
};
const sleep = (ms) => new Promise((r) => setTimeout(r, ms));
const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;
const dur = (b) => {
  const mv = b.indexOf("mvhd");
  if (mv === -1) return null;
  const v = b.readUInt8(mv + 4);
  const ts = v === 1 ? b.readUInt32BE(mv + 24) : b.readUInt32BE(mv + 16);
  const du = v === 1 ? Number(b.readBigUInt64BE(mv + 28)) : b.readUInt32BE(mv + 20);
  return ts && du ? fmt(du / ts) : null;
};

// ---------- A. bunny: cari referer yang diterima ----------
log("=== A. vidoycdn.b-cdn.net (BunnyCDN) ===");
for (const p of ["8FBXj5RfL-5Zi5yLIPr", "l5RrRPs6g-rnUsN8ul0"]) {
  for (const ref of [
    "https://mybokepindo.online/",
    "https://bokepindoterbaru.site/",
    "https://kelasmalam.net/",
    "https://vidoycdn.b-cdn.net/",
    "",
  ]) {
    try {
      const r = await fetch(`https://vidoycdn.b-cdn.net/${p}`, {
        headers: { "user-agent": UA, referer: ref, accept: "*/*", origin: ref ? new URL(ref).origin : "" },
        signal: AbortSignal.timeout(15000),
      });
      const b = Buffer.from(await r.arrayBuffer());
      const d = dur(b);
      log(`  ${r.status} ${(b.length / 1024).toFixed(0)}KB ${d ? "DURASI " + d : (r.headers.get("content-type") || "").slice(0, 20)} ref=${(ref || "tanpa").slice(16, 40)} ${p.slice(0, 12)}`);
      if (d) break;
    } catch (e) {
      log(`  ERR ${String(e.message).slice(0, 40)} ref=${(ref || "tanpa").slice(16, 36)}`);
    }
  }
}

// ---------- B. havenfile API dengan header browser lengkap ----------
log("\n=== B. havenfile.cc /api/video-url ===");
const BROWSER = {
  "user-agent": UA,
  accept: "*/*",
  "accept-language": "id-ID,id;q=0.9,en-US;q=0.8,en;q=0.7",
  "sec-ch-ua": '"Chromium";v="125", "Google Chrome";v="125", "Not.A/Brand";v="24"',
  "sec-ch-ua-mobile": "?0",
  "sec-ch-ua-platform": '"Windows"',
  "sec-fetch-dest": "empty",
  "sec-fetch-mode": "cors",
  "sec-fetch-site": "same-origin",
  "x-requested-with": "XMLHttpRequest",
};
for (const [title, id] of Object.entries({ "Syaliong Imut": "54D77NF6BYm0aoAF", Masyaliong: "yQJenhh2LwjcwXRj" })) {
  log(`\n  ## ${title} [${id}]`);
  let token = "";
  try {
    const emb = await (await fetch(`https://havenfile.cc/e/${id}`, { headers: { ...BROWSER, accept: "text/html" }, signal: AbortSignal.timeout(25000) })).text();
    token = (JSON.parse((emb.match(/id="havsub-embed-config">([\s\S]*?)<\/script>/) || [])[1] || "{}").embeddedData || {}).streamToken || "";
    log(`     token: ${token ? "dapat " + token.slice(0, 20) + "…" : "gagal"}`);
  } catch (e) {
    log(`     halaman embed ERR ${String(e.message).slice(0, 60)}`);
    continue;
  }
  if (!token) continue;
  for (let i = 0; i < 4; i++) {
    try {
      const r = await fetch(`https://havenfile.cc/api/video-url/${id}?dt=${encodeURIComponent(token)}`, {
        headers: { ...BROWSER, origin: "https://havenfile.cc", referer: `https://havenfile.cc/e/${id}`, "x-delivery-token": token },
        signal: AbortSignal.timeout(45000),
      });
      const t = await r.text();
      log(`     percobaan ${i + 1}: ${r.status} ${t.slice(0, 240).replace(/\s+/g, " ")}`);
      if (r.ok && t.trim().startsWith("{")) {
        const j = JSON.parse(t);
        const url = j.video_url || j.url || j.link || (j.data && (j.data.url || j.data.video_url));
        log(`     🎯 url=${url}\n        size=${j.file_size || j.size || "?"} name=${j.file_name || j.name || "?"}`);
        if (url) {
          for (const ref of ["https://havenfile.cc/", new URL(url).origin + "/", ""]) {
            try {
              const rr = await fetch(url, { headers: { "user-agent": UA, referer: ref, accept: "*/*" }, signal: AbortSignal.timeout(60000) });
              const b = Buffer.from(await rr.arrayBuffer());
              log(`        putar ${rr.status} ${(b.length / 1048576).toFixed(2)}MB ${dur(b) || "bukan mp4"} ref=${(ref || "tanpa").slice(0, 26)}`);
              if (dur(b)) break;
            } catch (e) {
              log(`        putar ERR ${String(e.message).slice(0, 45)}`);
            }
          }
        }
        break;
      }
    } catch (e) {
      log(`     percobaan ${i + 1} ERR ${String(e.message).slice(0, 55)}`);
    }
    await sleep(2500);
  }
}
