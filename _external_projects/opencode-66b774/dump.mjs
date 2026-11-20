import { appendFileSync } from "node:fs";
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const F = (u, o = {}) => fetch(u, { ...o, redirect: "follow", signal: AbortSignal.timeout(o.ms || 20000) });
const H = { "user-agent": UA, accept: "*/*" };
const log = (s) => {
  console.log(s);
  appendFileSync("/tmp/opencode/dump.out", s + "\n");
};

// havenfile: dump konfigurasi embed
for (const id of ["54D77NF6BYm0aoAF", "yQJenhh2LwjcwXRj"]) {
  const t = await (await F(`https://havenfile.cc/e/${id}`, { headers: H })).text();
  log(`\n##### havenfile ${id} (${t.length} B)`);
  for (const key of ["havsub-embed-config", "fetch(", "/api/", "sources", "file:", "poster", "plyr-source"]) {
    let i = -1;
    let n = 0;
    while ((i = t.indexOf(key, i + 1)) !== -1 && n < 2) {
      log(`  <<${key}>> ${t.slice(Math.max(0, i - 200), i + 420).replace(/\s+/g, " ")}`);
      n++;
    }
  }
  const inline = [...t.matchAll(/<script(?![^>]*src)[^>]*>([\s\S]{40,3000}?)<\/script>/g)].map((m) => m[1].replace(/\s+/g, " ").trim());
  inline.slice(0, 4).forEach((s, k) => log(`  [inline ${k}] ${s.slice(0, 800)}`));
}

// bunny / vidoycdn
for (const p of ["8FBXj5RfL-5Zi5yLIPr", "l5RrRPs6g-rnUsN8ul0"]) {
  const u = `https://vidoycdn.b-cdn.net/${p}`;
  const r = await F(u, { headers: H });
  const t = await r.text();
  log(`\n##### bunny ${p} -> ${r.status} ${r.headers.get("content-type")} (${t.length} B)`);
  log("  HTML UTUH: " + t.replace(/\s+/g, " ").slice(0, 1400));
}
