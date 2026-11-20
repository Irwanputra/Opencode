const u = "https://mp4-09.overfetch.video/glDsWqOPy-PHD5zsNfd";
const b = Buffer.from(await (await fetch(u, { headers: { "user-agent": "Mozilla/5.0", referer: new URL(u).origin + "/" } })).arrayBuffer());

// index tag = posisi string tipe; isi box dimulai di idx+4
function readTsDu(idx) {
  const v = b.readUInt8(idx + 4);
  if (v === 1) return { v, ts: b.readUInt32BE(idx + 24), du: Number(b.readBigUInt64BE(idx + 28)) };
  return { v, ts: b.readUInt32BE(idx + 16), du: b.readUInt32BE(idx + 20) };
}

const fmt = (s) => `${Math.floor(s / 60)}:${String(Math.round(s % 60)).padStart(2, "0")}`;

let n = 0;
let i = -1;
while ((i = b.indexOf("mdhd", i + 1)) !== -1) {
  const { v, ts, du } = readTsDu(i);
  if (ts > 0 && du > 0 && du / ts < 36000) console.log(`track[${n}] v${v} timescale=${ts} durasi=${fmt(du / ts)} (${(du / ts).toFixed(1)} dtk)`);
  n++;
}

const mv = b.indexOf("mvhd");
if (mv !== -1) {
  const { v, ts, du } = readTsDu(mv);
  if (ts > 0 && du > 0) console.log(`FIM UTUH: ${fmt(du / ts)}  (${(du / ts).toFixed(1)} dtk, timescale ${ts}, v${v})`);
}

const found = ["avc1", "hev1", "hvc1", "mp4a", "stsd", "moof", "styp", "esds", "tx3g", "ftyp"]
  .map((t) => [t, b.indexOf(t)])
  .filter((x) => x[1] !== -1);
console.log("  box/codec:", found.map(([t, p]) => `${t}@${p}`).join(" "));
console.log("  ukuran:", (b.length / 1048576).toFixed(2), "MB");
