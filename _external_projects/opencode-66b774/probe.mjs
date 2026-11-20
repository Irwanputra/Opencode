const u = "https://mp4-09.overfetch.video/glDsWqOPy-PHD5zsNfd";
const b = Buffer.from(await (await fetch(u, { headers: { "user-agent": "Mozilla/5.0", referer: new URL(u).origin + "/" } })).arrayBuffer());
const moov = b.indexOf("moov");
if (moov < 0) {
  console.log("moov tidak ditemukan (file belum faststart)");
  process.exit(0);
}
const root = b.subarray(moov - 4);

function walk(buf, off, end) {
  const out = [];
  let i = off;
  while (i + 8 <= end) {
    const L = buf.readUInt32BE(i);
    const t = buf.toString("ascii", i + 4, i + 8);
    if (L < 8 || i + L > end) break;
    out.push({ i, t, L, buf: buf.subarray(i + 8, i + L) });
    i += L;
  }
  return out;
}

const top = walk(root, 8, Math.min(root.length, 4 << 20));
console.log("struktur moov:", top.map((x) => x.t).join(" > "));

for (const tr of top.filter((x) => x.t === "trak")) {
  const kids = walk(tr.buf, 0, tr.buf.length);
  const md = kids.find((k) => k.t === "mdhd");
  const tk = kids.find((k) => k.t === "tkhd");
  const st = kids.find((k) => k.t === "stsd");
  const fmt = st ? st.buf.toString("ascii", 12, 16) : "?";
  if (!md) {
    console.log("  track:", fmt, "| mdhd tidak ada");
    continue;
  }
  const v = md.buf.readUInt8(0);
  const ts = v === 1 ? md.buf.readUInt32BE(20) : md.buf.readUInt32BE(12);
  const du = v === 1 ? Number(md.buf.readBigUInt64BE(24)) : md.buf.readUInt32BE(16);
  const s = du / ts;
  console.log(`  track: ${fmt} | durasi ${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")} (${s.toFixed(1)} dtk, timescale ${ts})`);
  if (tk) {
    const tv = tk.buf.readUInt8(0);
    const w = (tv === 1 ? tk.buf.readUInt32BE(96) : tk.buf.readUInt32BE(80)) / 65536;
    const h = (tv === 1 ? tk.buf.readUInt32BE(100) : tk.buf.readUInt32BE(84)) / 65536;
    if (w && h) console.log(`    resolusi: ${Math.round(w)}x${Math.round(h)}`);
  }
}
console.log("  ukuran file:", (b.length / 1048576).toFixed(1), "MB");
