const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Safari/537.36";
const H = { "user-agent": UA, accept: "text/html,application/json;q=0.9,*/*;q=0.8" };
const F = (u, o = {}) => fetch(u, { ...o, redirect: "follow", signal: AbortSignal.timeout(o.ms || 20000) });
const unwrap = (u) => {
  let cur = u;
  for (let i = 0; i < 5; i++) {
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
};

const EMBEDS = [
  ["jasverkenvirall-13", "https://mybokepindo.online/telegram-jasverkenvirall-talent-syaliong-13-bokep-indo-viral/"],
  ["jasverkenvirall-11", "https://mybokepindo.online/telegram-jasverkenvirall-talent-syaliong-11-bokep-indo-viral/"],
];

for (const [tag, page] of EMBEDS) {
  const html = await (await F(page, { headers: H })).text();
  const fr = [...new Set([...html.matchAll(/<iframe[^>]+src="([^"]+)"/g)].map((m) => m[1].replace(/&amp;/g, "&")))].filter((u) => u.includes("embed-player"));
  console.log(`\n##### ${tag}`);
  for (const f of fr.slice(0, 1)) {
    const inner = unwrap(f);
    console.log("  iframe dalam :", inner.slice(0, 160));
    try {
      const eh = await (await F(inner, { headers: { ...H, referer: page } })).text();
      console.log("  len embed html:", eh.length);
      console.log("  video/source  :", [...eh.matchAll(/<video[^>]*>|<source[^>]*>/g)].map((m) => m[0]).slice(0, 4).join("\n               ").slice(0, 400));
      console.log("  http url unik :", [...new Set([...eh.matchAll(/https?:\/\/[^"'\s<>\\]+/g)].map((m) => m[0]))].filter((u) => !/script|css|font|icon|gstatic|google|jquery|cloudflare|plyr|jwplayer|hls\.js/i.test(u)).slice(0, 8).join("\n                 ").slice(0, 700));
      console.log("  eval/pack     :", /eval\(function\(p,a,c,k,e/.test(eh), "| atob:", /atob/.test(eh), "| fetch(", (eh.match(/fetch\(/g) || []).length);
      const js = [...eh.matchAll(/<script[^>]*src="([^"]+\.js[^"]*)"/g)].map((m) => m[1]);
      console.log("  js eksternal  :", js.slice(0, 6).join(" "));
    } catch (e) {
      console.log("  ERR", String(e.message).slice(0, 80));
    }
  }
}
