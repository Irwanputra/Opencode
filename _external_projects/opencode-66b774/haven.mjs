import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/haven.out", s + "\n");
};
const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;

const FILES = {
  "Syaliong Imut Suka Colmek": "54D77NF6BYm0aoAF",
  "Masyaliong Abg imut Sudah Berbakat Colmek": "yQJenhh2LwjcwXRj",
};

for (const [title, id] of Object.entries(FILES)) {
  log(`\n##### ${title}  [${id}]`);
  const base = "https://havenfile.cc";
  const emb = await (await fetch(`${base}/e/${id}`, { headers: { "user-agent": UA, accept: "*/*" }, signal: AbortSignal.timeout(20000) })).text();
  const cfg = JSON.parse((emb.match(/id="havsub-embed-config">([\s\S]*?)<\/script>/) || [])[1] || "{}");
  const ed = cfg.embeddedData || {};
  log(`  nama file : ${cfg.fileName || ed.fileName || "?"}`);
  log(`  ukuran    : ${cfg.fileSize || ed.fileSize || "?"}`);
  log(`  streamTok : ${String(ed.streamToken).slice(0, 40)}...  downloadTok: ${String(ed.deliveryToken).slice(0, 40)}...`);
  log(`  keys cfg  : ${Object.keys(cfg).join(", ")}`);
  log(`  keys emb  : ${Object.keys(ed).join(", ")}`);

  const api = async (path, token) => {
    for (const url of [`${base}${path}`, `${base}${path}${path.includes("?") ? "&" : "?"}t=${Date.now()}`]) {
      try {
        const r = await fetch(url, {
          headers: {
            "user-agent": UA,
            accept: "application/json",
            "x-requested-with": "XMLHttpRequest",
            referer: `${base}/e/${id}`,
            origin: base,
            ...(token ? { "x-delivery-token": token } : {}),
          },
          signal: AbortSignal.timeout(15000),
        });
        const t = await r.text();
        log(`  ${path} -> ${r.status} ${t.slice(0, 220).replace(/\s+/g, " ")}`);
        if (r.ok && t.trim().startsWith("{")) return JSON.parse(t);
      } catch (e) {
        log(`  ${path} ERR ${String(e.message).slice(0, 60)}`);
      }
    }
    return null;
  };

  let token = ed.streamToken || "";
  if (!token) {
    const t1 = await api(`/api/get-video-token/${id}`);
    token = (t1 && (t1.delivery_token || t1.token)) || "";
  }
  if (token) {
    const v = await api(`/api/video-url/${id}?dt=${encodeURIComponent(token)}`, token);
    const url = v && (v.video_url || v.url || v.link || (v.data && (v.data.url || v.data.video_url)));
    log(`  STREAM URL: ${url}`);
    if (url) {
      for (const ref of [base + "/", new URL(url).origin + "/", ""]) {
        try {
          const r = await fetch(url, { headers: { "user-agent": UA, referer: ref, accept: "*/*" }, signal: AbortSignal.timeout(40000) });
          const b = Buffer.from(await r.arrayBuffer());
          const mv = b.indexOf("mvhd");
          let dur = "bukan mp4 utuh";
          if (mv !== -1) {
            const ver = b.readUInt8(mv + 4);
            const ts = ver === 1 ? b.readUInt32BE(mv + 24) : b.readUInt32BE(mv + 16);
            const du = ver === 1 ? Number(b.readBigUInt64BE(mv + 28)) : b.readUInt32BE(mv + 20);
            if (ts && du) dur = fmt(du / ts);
          }
          log(`  PUTAR ${r.status} | ${(b.length / 1048576).toFixed(2)} MB | ${dur} | ref=${(ref || "tanpa").slice(0, 26)} | ct=${r.headers.get("content-type")}`);
          if (dur !== "bukan mp4 utuh") break;
        } catch (e) {
          log(`  PUTAR ERR ${String(e.message).slice(0, 60)} (ref=${(ref || "tanpa").slice(0, 20)})`);
        }
      }
    }
  }
}
