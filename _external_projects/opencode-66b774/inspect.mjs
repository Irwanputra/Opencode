const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/125 Safari/537.36";
const urls = ["https://vid.pemersatu.link/e/2avu1zh94e7v", "https://streamtape.com/e/g1DajRr7bAhqeae/x"];
for (const u of urls) {
  try {
    const r = await fetch(u, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(15000) });
    const t = await r.text();
    console.log("\n========", u, r.status, t.length, "B");
    const noscript = t.replace(/<script[\s\S]*?<\/script>/g, "<script/>");
    console.log("--- tanpa script ---");
    console.log(noscript.replace(/<[^>]+>/g, " ").replace(/\s+/g, " ").slice(0, 400));
    const scripts = [...t.matchAll(/<script[^>]*>([\s\S]{5,4000}?)<\/script>/g)].map((m) => m[1].replace(/\s+/g, " ").trim());
    scripts.slice(0, 6).forEach((s, i) => console.log(`\n[script ${i}] ${s.slice(0, 700)}`));
    for (const key of ["eval(", "sources", "get-video", "atob", "document.write", "file:", "m3u8", "jwplayer", "plyr", "video."]) {
      const i = t.indexOf(key);
      if (i !== -1) console.log(`\n<<${key}>> ...`, t.slice(Math.max(0, i - 60), i + 260).replace(/\s+/g, " "));
    }
  } catch (e) {
    console.log("\n========", u, "ERR", String(e.message).slice(0, 80));
  }
}
