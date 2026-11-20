import { appendFileSync } from "node:fs";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const H = { "user-agent": UA, accept: "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8" };

const rawFetch = globalThis.fetch;
const get = async (u, o = {}) => {
  const r = await rawFetch(u, { ...o, redirect: "follow", signal: AbortSignal.timeout(o.ms || 15000) });
  return { status: r.status, headers: r.headers, text: await r.text(), buf: null };
};

// ---- Dean Edwards unpacker (filemoon / dsvplay / pemersatu pakai ini) ----
function unpackAll(html) {
  let out = html;
  const re = /eval\(function\(p,a,c,k,e,[^)]*\)\('([^']*)',(\d+),(\d+),'([^']*)'\.split\('\|'\)/g;
  for (const m of html.matchAll(re)) {
    const [, p, aStr, cStr, kStr] = m;
    const a = +aStr;
    const c = +cStr;
    const k = kStr.split("|");
    try {
      const dec = p.replace(/\\w+/g, (w) => {
        const n = parseInt(w, a);
        return !isNaN(n) && n < c && k[n] ? k[n] : w;
      });
      out += "\n<!--UNPACKED-->\n" + dec;
    } catch {}
  }
  return out;
}

// ----解开 bokepindoterbaru.site/embed-player?url=<encoded> bertingkat----
function unwrapEmbedPlayer(u) {
  let cur = u;
  for (let i = 0; i < 4; i++) {
    const m = cur.match(/[?&]url=([^&]+)/);
    if (!m) return cur;
    let inner = m[1];
    try {
      inner = decodeURIComponent(inner);
    } catch {}
    if (!/^https?:/i.test(inner)) return cur;
    cur = inner;
  }
  return cur;
}

const FILE_RE = /(?:file|url|src|link)\s*[:=]\s*["'](https?:\/\/[^"'\\\s]+?\.(?:mp4|m3u8)[^"'\\\s]*)["']/gi;
const BARE_RE = /https?:\/\/[^"'\s<>\\]+\.mp4/g;

function pickMp4s(html) {
  const set = new Set();
  for (const m of html.matchAll(FILE_RE)) set.add(m[1]);
  for (const m of html.matchAll(BARE_RE)) {
    const u = m[0];
    if (!/embed-player|\.jpg|\.png/i.test(u)) set.add(u);
  }
  const unw = [];
  for (const u of [...set]) unw.push(unwrapEmbedPlayer(u));
  return [...new Set(unw)].filter((u) => /^https?:/i.test(u));
}

function iframes(html) {
  return [...new Set([...html.matchAll(/<iframe[^>]+src="([^"]+)"/g)])]
    .map((m) => m[1].replace(/&amp;/g, "&"))
    .filter((u) => /^https?:/.test(u) && !/about:blank/.test(u));
}

// ---- listeamed: endpoint hash/src ----
async function listeamed(html, ref) {
  const hash = (html.match(/hash\s*[:=]\s*["']([a-f0-9]{8,40})["']/i) || [])[1];
  const src = (html.match(/src\s*[:=]\s*["']([^"']{4,60})["']/i) || [])[1];
  if (!hash) return [];
  const eps = [
    `https://listeamed.net/7d3f0f910cfd059ca611b64065e50bad20.php?hash=${hash}${src ? "&src=" + encodeURIComponent(src) : ""}`,
    `https://listeamed.net/7d3f0f910cfd059ca611b64065e50bad20.php?id=${hash}`,
  ];
  const out = [];
  for (const e of eps) {
    try {
      const r = await get(e, { headers: { ...H, referer: ref }, ms: 12000 });
      out.push(...pickMp4s(r.text));
    } catch {}
  }
  return out;
}

async function probe(u, referers) {
  const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;
  for (const ref of referers) {
    try {
      const r = await rawFetch(u, {
        headers: { "user-agent": UA, referer: ref, accept: "*/*" },
        signal: AbortSignal.timeout(30000),
      });
      if (!r.ok) continue;
      const b = Buffer.from(await r.arrayBuffer());
      const mv = b.indexOf("mvhd");
      if (mv === -1) return { url: u, status: r.status, type: r.headers.get("content-type"), mb: +(b.length / 1048576).toFixed(2), note: "bukan mp4 utuh" };
      const v = b.readUInt8(mv + 4);
      const ts = v === 1 ? b.readUInt32BE(mv + 24) : b.readUInt32BE(mv + 16);
      const du = v === 1 ? Number(b.readBigUInt64BE(mv + 28)) : b.readUInt32BE(mv + 20);
      if (!ts || !du) continue;
      const s = du / ts;
      return {
        url: u,
        status: r.status,
        ref: (ref || "tanpa").slice(8, 30),
        mb: +(b.length / 1048576).toFixed(2),
        dur: fmt(s),
        sec: +s.toFixed(1),
        codec: b.indexOf("avc1") !== -1 ? "H.264" : b.indexOf("hev1") !== -1 ? "HEVC" : "?",
        audio: b.indexOf("mp4a") !== -1 ? "AAC" : "-",
      };
    } catch (e) {
      /* coba referer berikutnya */
    }
  }
  return null;
}

const PAGES = JSON.parse(process.argv[2] || "[]");

for (const { title, page } of PAGES) {
  const found = [];
  const seen = new Set();
  const queue = [{ u: page, depth: 0 }];
  const trail = [];
  while (queue.length && trail.length < 14) {
    const { u, depth } = queue.shift();
    if (seen.has(u)) continue;
    seen.add(u);
    let html = "";
    try {
      html = (await get(u, { headers: { ...H, referer: depth ? new URL(queue[0]?.u || page).origin + "/" : undefined } })).text;
    } catch (e) {
      trail.push(`      x ${u.slice(0, 70)} ERR ${String(e.message).slice(0, 40)}`);
      continue;
    }
    trail.push(`      · ${u.slice(0, 74)} [${html.length} B]`);
    const full = unpackAll(html);
    for (const m of pickMp4s(full)) if (!found.includes(m)) found.push(m);
    if (u.includes("listeamed")) for (const m of await listeamed(html, u)) if (!found.includes(m)) found.push(m);
    if (depth < 3) for (const f of iframes(html).slice(0, 4)) queue.push({ u: f, depth: depth + 1 });
  }

  const playable = [];
  for (const u of found.slice(0, 5)) {
    const p = await probe(u, [new URL(u).origin + "/", new URL(page).origin + "/", "https://www.google.com/", ""]);
    if (p) playable.push(p);
  }

  appendFileSync("/tmp/opencode/deep.out", `\n### ${title}\n  ${page}\n` + trail.join("\n") + "\n" + playable.map((p) => `  => ${p.dur || p.note} | ${p.mb} MB | ${p.codec || "?"}/${p.audio || "-"} | ref=${p.ref} | ${p.url.slice(0, 100)}`).join("\n") + "\n");
}
appendFileSync("/tmp/opencode/deep.out", "\nSELESAI\n");
