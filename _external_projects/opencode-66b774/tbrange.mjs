// Uji: apa segmen preview TeraBox bisa dientengi pakai Range header (-> full mp4 di /p)?
const UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const fs = await import("node:fs");
const pl = fs.readFileSync("/tmp/opencode/pl2.m3u8", "utf8");
const seg = pl.split("\n").map((s) => s.trim()).find((s) => s && !s.startsWith("#"));
const url = decodeURIComponent(seg.replace(/^\/p\?url=/, "").split("&ref=")[0]);
const u = new URL(url);
console.log("segmen :", url.slice(0, 90) + "…");
console.log("ts_size=", u.searchParams.get("ts_size"), "| size(asli)=", u.searchParams.get("size"), "| len=", u.searchParams.get("len"), "| dtime=", u.searchParams.get("dtime"), "| range=", u.searchParams.get("range"), "| time=", u.searchParams.get("time"));

const H = { "user-agent": UA, referer: "https://www.terabox.com/", accept: "*/*" };
const head = await (await fetch(url, { headers: H, signal: AbortSignal.timeout(30000) })).headers;
console.log("\nGET tanpa range ->", head.get("content-type"), head.get("content-length"), "accept-ranges:", head.get("accept-ranges"));

async function probe(range, label) {
  const r = await fetch(url, { headers: { ...H, range }, signal: AbortSignal.timeout(40000) });
  const buf = Buffer.from(await r.arrayBuffer());
  const i = buf.indexOf(0x66, 4); // ftyp marker
  const ftyp = buf.subarray(4, 12).toString("latin1");
  const tsAt = buf.indexOf(Buffer.from([0x47, 0x40, 0x11, 0x10]));
  console.log(`  ${label.padEnd(28)} ${r.status} cr="${r.headers.get("content-range")}" ct=${r.headers.get("content-type")} got=${buf.length}B  head=${JSON.stringify(ftyp)} tsSync@${tsAt}`);
  return buf;
}
const b0 = await probe("bytes=0-1", "bytes=0-1");
const bAll = await probe("bytes=0-", "bytes=0- (utuh)");
fs.writeFileSync("/tmp/opencode/tbfull.mp4", bAll);
console.log("\ntersimpan /tmp/opencode/tbfull.mp4", (bAll.length / 1048576).toFixed(2), "MB");

// parser moov/mvhd sederhana (tanpa ffprobe)
function mp4Info(buf) {
  const out = { ftyp: "", duration: 0, timescale: 0, tracks: [], moovEnd: -1, moovStart: -1 };
  if (buf.subarray(4, 8).toString("latin1") !== "ftyp") out.ftyp = "?" + buf.subarray(4, 8).toString("latin1");
  else out.ftyp = buf.subarray(4, 12).toString("latin1");
  let i = 0;
  const walk = (start, end, depth, path) => {
    let p = start;
    while (p + 8 <= end) {
      const size = buf.readUInt32BE(p);
      const type = buf.subarray(p + 4, p + 8).toString("latin1");
      if (size < 8 || p + size > end) break;
      if (type === "moov" && depth === 0) { out.moovStart = p; out.moovEnd = p + size; }
      if (type === "mvhd") {
        const v = buf[p + 8];
        const ts = buf.readUInt32BE(p + (v === 1 ? 28 : 16));
        const dur = v === 1 ? Number(buf.readBigUInt64BE(p + 32)) : buf.readUInt32BE(p + 20);
        out.timescale = ts;
        out.duration = ts ? dur / ts : 0;
      }
      if (type === "trak") walk(p + 8, p + size, depth + 1, path + "/trak");
      if (type === "hdlr" && depth >= 1) out.tracks.push(path.includes("trak") ? buf.subarray(p + 20, p + 24).toString("latin1") : "?");
      if (type === "mdhd") {
        const v = buf[p + 8];
        const ts = buf.readUInt32BE(p + (v === 1 ? 28 : 16));
        const dur = v === 1 ? Number(buf.readBigUInt64BE(p + 32)) : buf.readUInt32BE(p + 20);
        if (ts) out.tracks[out.tracks.length - 1] += ` ${dur / ts}s`;
      }
      if (["stsd"].includes(type)) {
        const fmt = buf.subarray(p + 20, p + 24).toString("latin1");
        out.tracks[out.tracks.length - 1] = (out.tracks[out.tracks.length - 1] || "") + " " + fmt.trim();
      }
      p += size;
    }
  };
  walk(0, buf.length, 0, "");
  return out;
}
const info = mp4Info(bAll);
console.log("ftyp:", info.ftyp, "| durasi:", info.duration.toFixed(2), "s | moov di byte", info.moovStart, "..", info.moovEnd, "dari", bAll.length);
console.log("track:", info.tracks.join(" | "));
if (info.moovEnd > 0) console.log("moov muat penuh dalam unduhan?", info.moovEnd <= bAll.length ? "YA — file utuh" : "TIDAK (terpotong)");
