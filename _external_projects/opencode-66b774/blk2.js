
const $ = (id) => document.getElementById(id);
let tbFiles = [], otherFiles = [], queue = [], idx = -1, hls = null, current = null, tbLink = "", tbLogin = false;

function log(m, c = "") {
  const el = $("log");
  const d = document.createElement("div");
  if (c) d.className = c;
  d.textContent = "[" + new Date().toLocaleTimeString("id-ID") + "] " + m;
  el.appendChild(d);
  el.scrollTop = el.scrollHeight;
}
const dur = (s) => (s ? `${Math.floor(s / 60)}:${String(s % 60).padStart(2, "0")}` : "-");
const mb = (b) => (b ? (b / 1048576).toFixed(1) + " MB" : "-");

function setTab(which) {
  $("video").style.display = which === "video" ? "block" : "none";
  $("frame").style.display = which === "video" ? "none" : "block";
  $("tabV").classList.toggle("on", which === "video");
  $("tabF").classList.toggle("on", which !== "video");
}

function mount(url, kind) {
  const v = $("video");
  if (hls) { hls.destroy(); hls = null; }
  v.removeAttribute("src");
  if (kind === "hls") {
    if (v.canPlayType("application/vnd.apple.mpegurl")) {
      v.src = url;
      log("HLS native", "ok");
    } else if (window.Hls && Hls.isSupported()) {
      hls = new Hls({ maxBufferLength: 30 });
      hls.loadSource(url);
      hls.attachMedia(v);
      let pulih = 0;
      hls.on(Hls.Events.ERROR, (_, d) => {
        if (!d.fatal) return;
        const kedaluarsa = d.response && d.response.code === 410;
        if (kedaluarsa && pulih < 2) {
          pulih++;
          log("tanda tangan segmen kedaluwarsa — minta playlist baru (" + pulih + "/2)", "warn");
          hls.startLoad();
          return;
        }
        log("HLS fatal: " + d.details, "err");
      });
      log("HLS via hls.js", "ok");
    } else return log("Browser ini tidak bisa putar HLS", "err");
  } else {
    v.src = url;
  }
  v.load();
  const p = v.play();
  if (p && p.catch) p.catch(() => log("Autoplay diblokir — tekan tombol play", "warn"));
}

function showEmbed(url, note) {
  setTab("embed");
  $("frame").src = url;
  if (note) log(note, "warn");
}

function paint() {
  document.querySelectorAll(".f").forEach((n, k) => n.classList.toggle("act", k === idx && queue === tbFiles));
  document.querySelectorAll("#catalog .item").forEach((n, k) => n.classList.toggle("act", k === idx && queue === otherFiles));
}

async function play(i) {
  if (!queue.length) return;
  idx = (i + queue.length) % queue.length;
  const it = queue[idx];
  current = it;
  paint();
  $("now").textContent = it.t + (it.d ? " — " + it.d : "");
  $("srcLink").textContent = "sumber ↗";
  $("srcLink").href = it.src || "#";

  if (it.kind === "tb") {
    setTab("video");
    $("frame").src = "about:blank";
    const url = `/tb/pl?link=${encodeURIComponent(it.surl)}&fid=${encodeURIComponent(it.fid)}&type=${encodeURIComponent($("qual").value)}`;
    let span = 0,
      real = it.dur || 0;
    try {
      const r = await fetch(url);
      span = Number(r.headers.get("x-playlist-span")) || 0;
      real = Number(r.headers.get("x-real-duration")) || real;
    } catch {}
    const ql = $("qual").selectedOptions[0].textContent.split(" —")[0];
    mount(url, "hls");
    const kurang = span && real && span + 4 < real;
    log(`Putar ${it.name} — playlist ${dur(span)} dari ${dur(real)}`, kurang ? "warn" : "ok");
    $("now").textContent = `${it.name} — ${dur(real)} · ${ql}${kurang ? ` (yang kesampaian ${dur(span)})` : ""}`;
    return;
  }
  if (it.kind === "mp4") {
    setTab("video");
    $("frame").src = "about:blank";
    mount("/p?url=" + encodeURIComponent(it.u), "mp4");
    return log("Putar mp4: " + it.t, "ok");
  }
  if (it.kind === "hls") {
    setTab("video");
    $("frame").src = "about:blank";
    mount("/hls?url=" + encodeURIComponent(it.u), "hls");
    return log("Putar HLS: " + it.t, "ok");
  }
  if (it.kind === "embed") return showEmbed(it.u, "Entri ini cuma bisa lewat embed: host-nya menolak bot.");
  if (it.kind === "haven") {
    $("now").textContent = it.t + " — mengambil token…";
    try {
      const r = await (await fetch("/api/haven?id=" + encodeURIComponent(it.u))).json();
      if (r.ok) {
        setTab("video");
        $("frame").src = "about:blank";
        mount((r.kind === "hls" ? "/hls?url=" : "/p?url=") + encodeURIComponent(r.url), r.kind);
        log("havenfile OK · " + r.kind.toUpperCase(), "ok");
      } else {
        showEmbed(it.page, "havenfile tidak memberi URL — pindah ke embed halaman sumber.");
      }
    } catch (e) {
      showEmbed(it.page, "havenfile gagal: " + e.message);
    }
  }
}

function renderTb() {
  const box = $("tb");
  box.innerHTML = "";
  tbFiles.forEach((it, i) => {
    const row = document.createElement("div");
    row.className = "f";
    row.onclick = () => {
      queue = tbFiles;
      play(i);
    };
    const n = document.createElement("div");
    n.className = "n";
    n.textContent = i + 1;
    const nm = document.createElement("div");
    nm.className = "nm";
    nm.textContent = it.name;
    const mt = document.createElement("div");
    mt.className = "mt";
    mt.innerHTML = `<span class="du">${dur(it.dur)}</span> · ${mb(it.size)}${it.w ? " · " + it.w + "×" + it.h : ""}`;
    row.append(n, nm, mt);
    box.appendChild(row);
  });
}

async function loadTb(link, percobaan = 1) {
  $("tbGo").disabled = true;
  const box = $("tb");
  const t0 = Date.now();
  const jam = () => ((Date.now() - t0) / 1000).toFixed(0);
  box.innerHTML = '<span class="spin"></span>Menghubungi TeraBox… <span class="dim" id="tbt">0s</span>';
  const ticks = setInterval(() => {
    const el = $("tbt");
    if (!el) return clearInterval(ticks);
    el.textContent = jam() + "s";
    if (Number(jam()) > 6) el.textContent += " — 6 domain lagi disodorin paralel…";
  }, 1000);
  try {
    const r = await (await fetch("/api/tb?link=" + encodeURIComponent(link || ""))).json();
    clearInterval(ticks);
    if (!r.ok) {
      if (percobaan < 3) {
        box.innerHTML = `<span class="spin"></span>${r.error} — nyoba lagi (${percobaan}/2)…`;
        log("Terabox nolak, coba lagi (" + percobaan + "/2) · " + jam() + "s", "warn");
        await new Promise((k) => setTimeout(k, 1500));
        return loadTb(link, percobaan + 1);
      }
      box.innerHTML =
        "<div class='sub' style='margin:0'>" + (r.error || "gagal") + "</div>" +
        "<button class='ghost' style='margin-top:8px' id='tbRetry'>Coba lagi</button>";
      $("tbRetry").onclick = () => loadTb(link);
      return log("Terabox: " + (r.error || "gagal") + " (" + jam() + "s)", "err");
    }
    tbLink = r.surl;
    tbLogin = !!r.login;
    $("src").textContent = "› " + r.title + " (" + r.surl + ")";
    $("badge").textContent = r.count + " file dari pack TeraBox";
    $("tbmeta").textContent = `${r.count} video · ${dur(r.total)} total · via ${r.host.replace("https://", "")}`;
    $("tbnote").innerHTML = "Mode tamu, tanpa login. Jendela baca segmen digeser sampai <code>ts_size</code> (TeraBox nggak ngunci <code>len</code>/<code>range</code>), jadi video utuh keputer di 360p. File paling panjang bisa kelewat ±10 detik di ujung karena kuota tamu dipatok ±2 MB per file.";
    tbFiles = r.files.map((f) => ({
      kind: "tb", name: f.name, t: f.name, d: `${dur(f.dur)} · ${mb(f.size)}`, fid: f.fid, surl: r.surl, dur: f.dur, src: `https://www.terabox.com/s/${r.surl}`,
    }));
    renderTb();
    log(`Terabox: ${r.count} file, ${dur(r.total)} total${tbLogin ? " (login)" : " (pratinjau)"}`, tbLogin ? "ok" : "warn");
    if (!queue.length || queue === otherFiles) {
      queue = tbFiles;
      play(0);
    }
  } catch (e) {
    clearInterval(ticks);
    if (percobaan < 3) {
      box.innerHTML = `<span class="spin"></span>Koneksi putus — nyoba lagi (${percobaan}/2)…`;
      await new Promise((k) => setTimeout(k, 1500));
      return loadTb(link, percobaan + 1);
    }
    box.innerHTML =
      "<div class='sub' style='margin:0'>Gagal: " + e.message + "</div>" +
      "<button class='ghost' style='margin-top:8px' id='tbRetry'>Coba lagi</button>";
    $("tbRetry").onclick = () => loadTb(link, 1);
    log("Terabox gagal: " + e.message + " (" + jam() + "s)", "err");
  }
  $("tbGo").disabled = false;
}

function renderCatalog(list) {
  const box = $("catalog");
  box.innerHTML = "";
  const order = { mp4: 0, hls: 1, haven: 2, embed: 3 };
  list.sort((a, b) => (order[a.kind] ?? 9) - (order[b.kind] ?? 9));
  otherFiles = list;
  list.forEach((it, i) => {
    const row = document.createElement("div");
    row.className = "item";
    const left = document.createElement("div");
    const tag = document.createElement("div");
    tag.className = "tag " + it.kind;
    tag.textContent = it.kind === "mp4" ? "mp4 langsung" : it.kind === "hls" ? "hls" : it.kind === "haven" ? "havenfile" : "embed saja";
    const b = document.createElement("b");
    b.textContent = it.t;
    const s = document.createElement("small");
    s.textContent = it.d;
    left.append(tag, b, s);
    const btn = document.createElement("button");
    btn.textContent = it.kind === "embed" ? "Buka" : "Putar";
    btn.className = it.kind === "embed" ? "ghost" : "";
    btn.onclick = () => {
      queue = otherFiles;
      play(i);
    };
    row.append(left, btn);
    box.appendChild(row);
  });
  log(list.length + " entri katalog lain dimuat", "ok");
}

$("tabV").onclick = () => idx >= 0 && play(idx);
$("tabF").onclick = () => {
  if (!current) return;
  setTab("embed");
  $("frame").src = current.page || (current.kind === "embed" ? current.u : current.src || "about:blank");
};
$("next").onclick = () => play(idx + 1);
$("prev").onclick = () => play(idx - 1);
$("full").onclick = () => $("video").requestFullscreen && $("video").requestFullscreen();
$("reload").onclick = () => idx >= 0 && play(idx);
$("qual").onchange = () => idx >= 0 && play(idx);
$("repl").onclick = () => idx >= 0 && current && current.kind === "tb" && play(idx);
$("tbGo").onclick = () => loadTb($("link").value.trim());
$("link").addEventListener("keydown", (e) => e.key === "Enter" && loadTb($("link").value.trim()));
document.addEventListener("keydown", (e) => {
  if ("INPUT".includes(e.target.tagName)) return;
  const v = $("video");
  if (e.code === "Space") { e.preventDefault(); v.paused ? v.play() : v.pause(); }
  if (e.key === "ArrowRight") v.currentTime += 5;
  if (e.key === "ArrowLeft") v.currentTime -= 5;
  if (e.key === "f") $("full").click();
  if (e.key === "n") play(idx + 1);
  if (e.key === "p") play(idx - 1);
});

queue = tbFiles;
loadTb("");
fetch("/api/catalog").then((r) => r.json()).then(renderCatalog).catch((e) => log("Katalog gagal: " + e.message, "err"));
