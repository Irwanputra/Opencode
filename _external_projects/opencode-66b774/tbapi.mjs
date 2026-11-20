// Klien Terabox: jsToken (dari HTML) -> /api/home/info (sign1..3) -> sign -> /share/list
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const APP_ID = 250528;
const HOSTS = ["https://www.terabox.com", "https://www.teraboxapp.com", "https://1024terabox.com", "https://4funbox.com", "https://mirrobox.com", "https://nephobox.com"];

const b64 = (bytes) => {
  const s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
  let t = "";
  const e = typeof bytes === "string" ? [...bytes].map((c) => c.charCodeAt(0)) : [...bytes];
  const o = e.length;
  let i, r, l, v;
  for (i = 0, t = ""; i < o; ) {
    r = e[i++] & 255;
    if (i === o) { t += s.charAt(r >> 2) + s.charAt((r & 3) << 4) + "=="; break; }
    l = e[i++];
    if (i === o) { t += s.charAt(r >> 2) + s.charAt(((r & 3) << 4) | ((l & 240) >> 4)) + s.charAt((l & 15) << 2) + "="; break; }
    v = e[i++];
    t += s.charAt(r >> 2) + s.charAt(((r & 3) << 4) | ((l & 240) >> 4)) + s.charAt(((l & 15) << 2) | ((v & 192) >> 6)) + s.charAt(v & 63);
  }
  return t;
};

class Terabox {
  constructor(host) {
    this.host = host;
    this.cookies = new Map();
    this.jsToken = "";
    this.sign = "";
    this.timestamp = "";
    this.trace = [];
  }
  cookieHeader() {
    return [...this.cookies].map(([k, v]) => `${k}=${v}`).join("; ");
  }
  saveCookies(res) {
    for (const c of res.headers.getSetCookie?.() || []) {
      const [kv] = c.split(";");
      const i = kv.indexOf("=");
      if (i > 0) this.cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim());
    }
  }
  qs(obj) {
    return Object.entries(obj)
      .filter(([, v]) => v !== undefined && v !== null && v !== "")
      .map(([k, v]) => `${k}=${encodeURIComponent(v)}`)
      .join("&");
  }
  async req(path, params = {}, opt = {}) {
    const common = { app_id: APP_ID, web: 1, channel: "dubox", clienttype: 0, devuid: this.cookies.get("browserid") || "", jsToken: this.jsToken };
    const url = `${this.host}${path}?${this.qs({ ...common, ...params })}`;
    const res = await fetch(url, {
      headers: {
        "user-agent": UA,
        accept: "application/json, text/plain, */*",
        "accept-language": "id-ID,id;q=0.9,en;q=0.8",
        referer: `${this.host}/sharing/link?surl=${params.surl || params.shorturl || ""}`,
        origin: this.host,
        cookie: this.cookieHeader(),
        ...(opt.headers || {}),
      },
      redirect: "follow",
      signal: AbortSignal.timeout(opt.ms || 20000),
    });
    this.saveCookies(res);
    const text = await res.text();
    let json = null;
    try {
      json = JSON.parse(text);
    } catch {}
    this.trace.push({ path, status: res.status, errno: json ? json.errno : "non-json", bytes: text.length });
    return { status: res.status, json, text, url };
  }

  async boot(surl) {
    const html = await (await fetch(`${this.host}/sharing/link?surl=${surl}`, {
      headers: { "user-agent": UA, accept: "text/html,application/xhtml+xml", "accept-language": "id-ID,id;q=0.9,en;q=0.8" },
      signal: AbortSignal.timeout(25000),
    })).text().then(async (t) => {
      // simpan cookie dari halaman share
      const r = await fetch(`${this.host}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(25000) });
      this.saveCookies(r);
      return t;
    });
    const m = html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/);
    this.jsToken = m ? m[1] : "";
    return { html: html.length, jsToken: this.jsToken.slice(0, 24) + (this.jsToken ? "…" : ""), cookies: [...this.cookies.keys()] };
  }

  async makeSign() {
    const r = await this.req("/api/home/info", {});
    const d = r.json && (r.json.data || r.json);
    if (!d || !d.sign2) return { ok: false, status: r.status, errno: r.json && r.json.errno, raw: r.text.slice(0, 200) };
    let fn;
    try {
      fn = new Function("return " + d.sign2)();
    } catch (e) {
      return { ok: false, error: "sign2 bukan fungsi: " + e.message };
    }
    const raw = fn(d.sign3, d.sign1);
    this.sign = b64(raw);
    this.timestamp = String(d.timestamp || Math.floor(Date.now() / 1000));
    return { ok: true, sign1: String(d.sign1).slice(0, 24), sign3: String(d.sign3).slice(0, 24), fnSrc: String(d.sign2).slice(0, 160), raw: String(raw).slice(0, 60), sign: this.sign.slice(0, 30), timestamp: this.timestamp };
  }

  async info(surl) {
    return this.req("/api/shorturlinfo", { shorturl: surl, root: 1, scene: "" });
  }
  async list(surl, extra = {}) {
    return this.req("/share/list", {
      page: 1,
      num: 50,
      web: 1,
      scene: "",
      surl,
      shorturl: surl,
      shortlink: surl,
      root: 1,
      order: "name",
      desc: 1,
      ...extra,
    });
  }
}

const surl = process.argv[2] || "115f0upixp623O2JTwRzTJw";
const only = process.argv[3];
const hosts = only ? [only] : HOSTS;

for (const h of hosts) {
  const tb = new Terabox(h);
  console.log(`\n########## ${h}`);
  try {
    console.log(" boot      :", JSON.stringify(await tb.boot(surl)));
    const sg = await tb.makeSign();
    console.log(" sign      :", JSON.stringify(sg).slice(0, 420));
    const inf = await tb.info(surl);
    console.log(" shorturl  :", inf.status, JSON.stringify(inf.json).slice(0, 300));
    const d = inf.json && (inf.json.data || inf.json);
    const shareid = d && (d.shareid || d.share_id);
    const uk = d && (d.uk || (d.user_info && d.user_info.uk));
    const l1 = await tb.list(surl, { sign: tb.sign, timestamp: tb.timestamp, ...(shareid ? { shareid } : {}), ...(uk ? { uk } : {}) });
    console.log(" list      :", l1.status, JSON.stringify(l1.json).slice(0, 700));
    if (l1.json && (l1.json.list || (l1.json.data && l1.json.data.list))) {
      const arr = l1.json.list || l1.json.data.list;
      console.log(" ⭐ FILE   :", arr.length);
      arr.forEach((f) => console.log("    •", f.filename, "|", ((f.size || 0) / 1048576).toFixed(1) + " MB", "| fs_id", f.fs_id, "| server_id", f.server_id, "| dlink", String(f.dlink).slice(0, 90)));
      break;
    }
  } catch (e) {
    console.log(" ERR", String(e.message).slice(0, 120));
  }
  console.log(" trace     :", JSON.stringify(tb.trace));
}
