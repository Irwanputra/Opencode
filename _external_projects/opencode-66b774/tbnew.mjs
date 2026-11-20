// Detail penuh utk surl baru: daftar file + mediameta + percobaan streaming (uk/shareid dari item list)
import crypto from "node:crypto";

const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY = "iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl = process.argv[2] || "LA0Jq-HW5Fcv-8Q2FNC1ng";
const HOSTS = (process.argv[3] || "https://www.terabox.com,https://www.terabox.app,https://www.teraboxshare.com,https://1024terabox.com").split(",");

for (const HOST of HOSTS) {
  const cookies = new Map();
  const jar = (r) => {
    for (const c of r.headers.getSetCookie?.() || []) {
      const [kv] = c.split(";");
      const i = kv.indexOf("=");
      if (i > 0) cookies.set(kv.slice(0, i).trim(), kv.slice(i + 1).trim());
    }
  };
  const cookieHdr = () => [...cookies].map(([k, v]) => `${k}=${v}`).join("; ");
  const q = (o) => Object.entries(o).filter(([, v]) => v !== "" && v != null).map(([k, v]) => `${k}=${encodeURIComponent(v)}`).join("&");
  const H = (ref) => ({ "user-agent": UA, accept: "*/*", "accept-language": "id-ID,id;q=0.9,en;q=0.8", referer: ref || `${HOST}/sharing/link?surl=${surl}`, origin: HOST, cookie: cookieHdr() });
  const get = async (url, ref) => {
    try {
      const r = await fetch(url, { headers: H(ref), signal: AbortSignal.timeout(25000) });
      jar(r);
      const t = await r.text();
      let j = null;
      try { j = JSON.parse(t); } catch {}
      return { status: r.status, t, j };
    } catch (e) {
      return { status: 0, t: "ERR " + String(e.message).slice(0, 60), j: null };
    }
  };

  console.log(`\n########## ${HOST}`);
  const pageRes = await fetch(`${HOST}/sharing/link?surl=${surl}`, { headers: { "user-agent": UA, accept: "text/html" }, signal: AbortSignal.timeout(25000) }).catch(() => null);
  if (!pageRes) {
    console.log("  halaman share: DNS/koneksi gagal");
    continue;
  }
  jar(pageRes);
  const html = await pageRes.text();
  const jsToken = ((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/) || html.match(/fn\("([0-9a-fA-F]{40,400})"\)/) || [])[1]) || "";
  const common = { app_id: 250528, web: 1, channel: "dubox", clienttype: 0, jsToken, devuid: cookies.get("browserid") || "" };
  console.log(`  page ${pageRes.status} jsToken=${jsToken.slice(0, 12)}… cookie=[${[...cookies.keys()]}]`);

  const info = await get(`${HOST}/api/shorturlinfo?${q({ ...common, shorturl: surl, root: 1, scene: "" })}`);
  console.log(`  shorturlinfo errno=${info.j && info.j.errno} shareid=${info.j && info.j.shareid} uk=${info.j && info.j.uk}`);

  // root via shorturl (fallback saat shorturlinfo errno 2)
  const root = await get(`${HOST}/share/list?${q({ ...common, shorturl: surl, surl, dir: "/", page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1, root: 1 })}`);
  const top = (root.j && root.j.list) || [];
  console.log(`  share/list(root) errno=${root.j && root.j.errno} jumlah=${top.length}`);
  if (!top.length) {
    console.log("  " + root.t.slice(0, 140));
    continue;
  }
  const folder = top.find((f) => Number(f.isdir) === 1);
  const shareid = (info.j && info.j.shareid) || top[0].shareid;
  const uk = (info.j && info.j.uk) || top[0].uk;
  console.log(`  item root: ${top.map((f) => `${f.server_filename}${Number(f.isdir) === 1 ? "/" : ""}`).join(", ")}`);
  console.log(`  shareid dari item=${top[0].shareid} uk dari item=${top[0].uk} -> pakai ${shareid}/${uk}`);

  const dirs = folder ? [folder.path] : [];
  let files = top.filter((f) => Number(f.isdir) !== 1);
  for (const dir of dirs) {
    for (const [lab, p] of [
      ["shareid+uk", { ...common, shareid, uk, dir, page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1 }],
      ["shorturl", { ...common, shorturl: surl, surl, dir, page: 1, num: 100, order: "name", desc: 0, scene: "", web: 1 }],
    ]) {
      const r = await get(`${HOST}/share/list?${q(p)}`);
      const arr = (r.j && r.j.list) || [];
      console.log(`  share/list(${lab}) errno=${r.j && r.j.errno} jumlah=${arr.length}`);
      if (arr.length) {
        files = files.concat(arr.filter((f) => Number(f.isdir) !== 1));
        break;
      }
    }
  }

  const vids = files.filter((f) => /\.(mp4|mov|mkv|avi)$/i.test(f.server_filename || f.filename || ""));
  console.log(`  video=${vids.length} ukuran=${(vids.reduce((a, f) => a + Number(f.size || 0), 0) / 1048576).toFixed(0)}MB`);

  // mediameta + streaming utk file terbesar
  vids.sort((a, b) => Number(b.size) - Number(a.size));
  const ts = Math.floor(Date.now() / 1000);
  const hs = crypto.createHmac("sha256", KEY).update(`0dubox${cookies.get("browserid") || ""}${ts}`).digest("hex");
  for (const f of vids.slice(0, 4)) {
    const mm = await get(`${HOST}/share/mediameta?${q({ ...common, uk, shareid, fid: f.fs_id, timestamp: ts })}`);
    console.log(`\n  • ${f.server_filename} ${(Number(f.size) / 1048576).toFixed(1)}MB fid=${f.fs_id}`);
    console.log(`    mediameta: ${mm.t.slice(0, 150).replace(/\s+/g, " ")}`);
    for (const type of ["M3U8_AUTO_360", "M3U8_AUTO_720"]) {
      const r = await get(`${HOST}/share/streaming?${q({ uk, shareid, type, fid: f.fs_id, sign: hs, timestamp: ts, jsToken, esl: 1, isplayer: 1, ehps: 1, clienttype: 0, app_id: 250528, web: 1, channel: "dubox" })}`);
      const segs = r.j ? `errno=${r.j.errno}` : `${(r.t.match(/#EXTINF/g) || []).length} segmen, ${[...r.t.matchAll(/#EXTINF:([\d.]+)/g)].reduce((a, m) => a + Number(m[1]), 0)}s`;
      console.log(`    ${type.padEnd(15)} ${r.status} ${segs}`);
    }
    // path-based
    const pb = await get(`${HOST}/api/streaming?${q({ path: f.path, app_id: 250528, clienttype: 0, type: "M3U8_AUTO_360", vip: 1 })}`);
    console.log(`    /api/streaming    ${pb.status} ${pb.j ? "errno=" + pb.j.errno : (pb.t.match(/#EXTINF/g) || []).length + " segmen"}`);
  }
  console.log("\n  SEMUA FILE:");
  vids.forEach((f, i) => console.log(`    ${String(i + 1).padStart(2)}. ${f.server_filename} | ${(Number(f.size) / 1048576).toFixed(1)}MB | fid=${f.fs_id}`));
  break;
}
