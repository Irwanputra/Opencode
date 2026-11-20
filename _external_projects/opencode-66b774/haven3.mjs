import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/haven3.out", s + "\n");
};
const sleep = (ms) => new Promise((r) => setTimeout(r, ms));

async function resolveHaven(id) {
  const base = "https://havenfile.cc";
  const jar = new Map();
  const cookieHeader = () => [...jar].map(([k, v]) => `${k}=${v}`).join("; ");

  const res = await fetch(`${base}/e/${id}`, {
    headers: { "user-agent": UA, accept: "text/html", "accept-language": "id-ID,id;q=0.9,en;q=0.8" },
    signal: AbortSignal.timeout(25000),
  });
  for (const c of res.headers.getSetCookie?.() || []) {
    const [kv] = c.split(";");
    const i = kv.indexOf("=");
    if (i > 0) jar.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim());
  }
  const emb = await res.text();
  const ed = (JSON.parse((emb.match(/id="havsub-embed-config">([\s\S]*?)<\/script>/) || [])[1] || "{}").embeddedData) || {};
  log(`  cookie: ${[...jar.keys()].join(",") || "(kosong)"} | streamToken: ${ed.streamToken ? "ada" : "tidak"}`);

  const call = async (label, url, headers) => {
    try {
      const r = await fetch(url, { headers: { "user-agent": UA, origin: base, referer: `${base}/e/${id}`, cookie: cookieHeader(), ...headers }, signal: AbortSignal.timeout(20000) });
      const t = await r.text();
      log(`  ${label} -> ${r.status} ${t.slice(0, 200).replace(/\s+/g, " ")}`);
      for (const c of r.headers.getSetCookie?.() || []) {
        const [kv] = c.split(";");
        const i = kv.indexOf("=");
        if (i > 0) jar.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim());
      }
      return { status: r.status, json: t.trim().startsWith("{") ? JSON.parse(t) : null, text: t };
    } catch (e) {
      log(`  ${label} ERR ${String(e.message).slice(0, 60)}`);
      return null;
    }
  };

  let token = ed.streamToken || "";
  if (!token) {
    const t = await call("get-video-token", `${base}/api/get-video-token/${id}`, { accept: "application/json", "x-requested-with": "XMLHttpRequest" });
    token = t?.json?.delivery_token || t?.json?.token || "";
  }
  const variants = [
    ["dt query + header", `${base}/api/video-url/${id}?dt=${encodeURIComponent(token)}`, { accept: "application/json", "x-requested-with": "XMLHttpRequest", "x-delivery-token": token }],
    ["header saja", `${base}/api/video-url/${id}`, { accept: "application/json", "x-requested-with": "XMLHttpRequest", "x-delivery-token": token }],
    ["tanpa xrw", `${base}/api/video-url/${id}?dt=${encodeURIComponent(token)}`, { accept: "application/json", "x-delivery-token": token }],
    ["POST", `${base}/api/video-url/${id}`, { accept: "application/json", "x-requested-with": "XMLHttpRequest", "x-delivery-token": token }],
  ];
  for (let round = 0; round < 3; round++) {
    for (const [label, url, headers] of variants) {
      if (label === "POST") {
        const r = await call(`POST ${round}`, url, { ...headers, "content-type": "application/json" });
        if (r?.json?.success) return r.json;
        continue;
      }
      const r = await call(`${label} #${round}`, url, headers);
      if (r?.json?.success) return r.json;
      if (round === 0 && r && r.status !== 502) break;
      await sleep(1200);
    }
  }
  return null;
}

const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;

for (const [title, id] of Object.entries({ "Syaliong Imut Suka Colmek": "54D77NF6BYm0aoAF", Masyaliong: "yQJenhh2LwjcwXRj" })) {
  log(`\n##### ${title} [${id}]`);
  const j = await resolveHaven(id);
  if (!j) {
    log("  ❌ API tidak menghasilkan URL");
    continue;
  }
  const url = j.video_url || j.url || j.link || (j.data && (j.data.url || j.data.video_url));
  const size = j.file_size || j.size || (j.data && (j.data.file_size || j.data.size));
  log(`  🎯 ${url}\n     size=${size} name=${j.file_name || j.name || "?"} exp=${j.expires_at || j.expires || "?"}`);
  if (!url) continue;
  for (const ref of ["https://havenfile.cc/", new URL(url).origin + "/", ""]) {
    try {
      const r = await fetch(url, { headers: { "user-agent": UA, referer: ref, accept: "*/*" }, signal: AbortSignal.timeout(60000) });
      const ct = String(r.headers.get("content-type"));
      if (ct.includes("mpegurl") || ct.includes("octet")) {
        const t = await r.text();
        if (t.includes("#EXTINF")) {
          const total = [...t.matchAll(/#EXTINF:([\d.]+)/g)].reduce((a, m) => a + parseFloat(m[1]), 0);
          log(`  ✅ HLS ref=${(ref || "tanpa").slice(0, 22)} durasi=${fmt(total)}`);
          break;
        }
      }
      const b = Buffer.from(await r.arrayBuffer());
      const mv = b.indexOf("mvhd");
      let dur = "bukan mp4 (" + ct + ")";
      if (mv !== -1) {
        const v = b.readUInt8(mv + 4);
        const ts = v === 1 ? b.readUInt32BE(mv + 24) : b.readUInt32BE(mv + 16);
        const du = v === 1 ? Number(b.readBigUInt64BE(mv + 28)) : b.readUInt32BE(mv + 20);
        if (ts && du) dur = fmt(du / ts);
      }
      log(`  ${r.status} | ${(b.length / 1048576).toFixed(2)} MB | ${dur} | ref=${(ref || "tanpa").slice(0, 22)}`);
      if (mv !== -1) break;
    } catch (e) {
      log(`  PUTAR ERR ${String(e.message).slice(0, 55)} ref=${(ref || "tanpa").slice(0, 20)}`);
    }
  }
}
