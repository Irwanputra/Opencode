import http from "node:http";
import net from "node:net";
import crypto from "node:crypto";
import fs from "node:fs";
import path from "node:path";
import os from "node:os";
import { spawn, execFileSync, execSync } from "node:child_process";
import { Transform } from "node:stream";
import { pipeline } from "node:stream/promises";

const PASSWORD = (process.env.OPENCODE_PASSWORD || "").trim();
const OC_VER = (process.env.OC_VER || "v2").trim();
const WORKSPACE = process.env.WORKSPACE_DIR || process.cwd();
const HOME_DIR = process.env.HOME || "/root";
const START_TIME = Number(process.env.START_TIME_MS || Date.now());
const DURATION_MIN = Number(process.env.DURASI_MENIT || 350);
const LISTEN_PORT = Number(process.env.LISTEN_PORT || 4096);
const TOKEN = crypto.createHmac("sha256", PASSWORD || "default").update("opencode-cookie-v3").digest("hex");
const GLOBAL_CFG_FILE = path.join(HOME_DIR, ".config/opencode/opencode.json");
const OC_DB_FILE = path.join(HOME_DIR, ".local/share/opencode/opencode.db");
const MAX_EDIT_KB = Math.max(16, Number(process.env.MAX_EDIT_KB || 1024));
const MIME_BY_EXT = {
  png: "image/png", jpg: "image/jpeg", jpeg: "image/jpeg", gif: "image/gif", webp: "image/webp",
  svg: "image/svg+xml", ico: "image/x-icon", bmp: "image/bmp", avif: "image/avif",
  pdf: "application/pdf", mp4: "video/mp4", webm: "video/webm", mp3: "audio/mpeg", wav: "audio/wav",
  json: "application/json; charset=utf-8", txt: "text/plain; charset=utf-8", md: "text/markdown; charset=utf-8",
  csv: "text/plain; charset=utf-8", log: "text/plain; charset=utf-8", apk: "application/vnd.android.package-archive",
};

const previewTunnels = new Map();

function getPersistenceMeta() {
  const out = { worktrees: WORKSPACE ? [WORKSPACE] : [], sessionCount: 0 };
  if (!fs.existsSync(OC_DB_FILE)) return out;
  try {
    const py = [
      "import sys, os, json, sqlite3",
      "db, hd = sys.argv[1], os.path.realpath(sys.argv[2])",
      "conn = sqlite3.connect(db, timeout=5)",
      "wts = [r[0] for r in conn.execute('SELECT worktree FROM project ORDER BY time_updated DESC').fetchall() if r[0] and os.path.exists(r[0]) and os.path.realpath(r[0]) != hd]",
      "try:",
      "  cnt = conn.execute('SELECT COUNT(*) FROM session_v2 WHERE time_archived IS NULL').fetchone()[0]",
      "except Exception:",
      "  cnt = 0",
      "print(json.dumps({'worktrees': wts, 'sessionCount': cnt}))",
    ].join("\n");
    const raw = execFileSync("python3", ["-c", py, OC_DB_FILE, HOME_DIR], { encoding: "utf8", timeout: 4000 }).trim();
    const parsed = JSON.parse(raw);
    for (const wt of parsed.worktrees || []) {
      if (wt && !out.worktrees.includes(wt)) out.worktrees.push(wt);
    }
    out.sessionCount = Number(parsed.sessionCount || 0);
  } catch {}
  return out;
}

function readGlobalConfig() {
  try {
    if (fs.existsSync(GLOBAL_CFG_FILE)) {
      return JSON.parse(fs.readFileSync(GLOBAL_CFG_FILE, "utf8"));
    }
  } catch {}
  return { $schema: "https://opencode.ai/config.json", provider: {} };
}

function getCustomModelEntries() {
  const cfg = readGlobalConfig();
  const entries = [];
  for (const [providerID, p] of Object.entries(cfg.provider || {})) {
    for (const modelID of Object.keys((p && p.models) || {})) {
      entries.push({ providerID, modelID });
    }
  }
  return entries;
}

function reloadOpenCodeEngine() {
  try {
    if (OC_VER === "v1") {
      execSync('pkill -TERM -f "opencode web" || true');
    } else {
      const ocBin = path.join(HOME_DIR, ".local/bin/opencode");
      try {
        execFileSync(ocBin, ["service", "stop"], { env: { ...process.env, HOME: HOME_DIR }, timeout: 10000 });
      } catch {}
      execSync("sleep 1");
      execFileSync(ocBin, ["service", "start"], { cwd: WORKSPACE, env: { ...process.env, HOME: HOME_DIR }, timeout: 15000 });
    }
  } catch {}
}

function writeGlobalConfig(cfg) {
  fs.mkdirSync(path.dirname(GLOBAL_CFG_FILE), { recursive: true });
  const tmp = `${GLOBAL_CFG_FILE}.tmp.${process.pid}`;
  fs.writeFileSync(tmp, JSON.stringify(cfg, null, 2));
  fs.renameSync(tmp, GLOBAL_CFG_FILE);
  // Simpan terenkripsi AES-256 ke GitHub secara non-blocking di latar belakang
  try {
    const saveBin = path.join(HOME_DIR, ".local/bin/oc-save");
    if (fs.existsSync(saveBin)) {
      const bg = spawn(saveBin, ["chore: auto-save custom provider terenkripsi"], {
        env: { ...process.env, FINAL_PW: PASSWORD, WORKSPACE_DIR: WORKSPACE },
        stdio: "ignore",
        detached: true,
      });
      bg.unref();
    }
  } catch {}
}

// Baca port & UUID service dinamis untuk OpenCode v2 (maupun fallback 4097 untuk v1)
function getUpstreamService() {
  if (OC_VER !== "v1") {
    try {
      const svcFile = path.join(HOME_DIR, ".local/state/opencode/service.json");
      const svc = JSON.parse(fs.readFileSync(svcFile, "utf8"));
      if (svc && svc.url) {
        const u = new URL(svc.url);
        if (u.port) return { port: Number(u.port), id: String(svc.id || "") };
      }
    } catch {}
  }
  return { port: 4097, id: "v1" };
}

function getUpstreamPort() {
  return getUpstreamService().port;
}

// Buat link pairing sekali pakai resmi untuk OpenCode v2 agar otomatis login tanpa ketik terminal
function getV2PairPath() {
  if (OC_VER === "v1") return "/";
  try {
    const ocBin = path.join(HOME_DIR, ".local/bin/opencode");
    const out = execFileSync(ocBin, ["pair", "--url", `http://127.0.0.1:${LISTEN_PORT}`], {
      env: { ...process.env, HOME: HOME_DIR },
      encoding: "utf8",
      timeout: 8000,
    });
    const m = out.match(/\/auth\/connect\/[-A-Za-z0-9_]+/);
    if (m) return m[0];
  } catch {}
  return "/";
}

function parseCookies(header = "") {
  const out = {};
  for (const part of header.split(";")) {
    const idx = part.indexOf("=");
    if (idx > -1) out[part.slice(0, idx).trim()] = part.slice(idx + 1).trim();
  }
  return out;
}

function isAuthed(req) {
  if (!PASSWORD) return true;
  return parseCookies(req.headers.cookie || "").oc_auth === TOKEN;
}

function sendJson(res, code, data, extraHeaders = {}) {
  res.writeHead(code, { "content-type": "application/json; charset=utf-8", "cache-control": "no-store", ...extraHeaders });
  res.end(JSON.stringify(data));
}

function readBody(req, limit = 131072) {
  return new Promise((resolve) => {
    let body = "";
    let tooBig = false;
    req.on("data", (c) => {
      if (tooBig) return;
      body += c;
      if (body.length > limit) { tooBig = true; body = ""; req.destroy(); }
    });
    req.on("end", () => resolve(body));
    req.on("close", () => resolve(body));
  });
}

function scanArtifacts(dir, depth = 0, out = []) {
  if (depth > 6) return out;
  let entries = [];
  try { entries = fs.readdirSync(dir, { withFileTypes: true }); } catch { return out; }
  for (const e of entries) {
    if ([".git", "node_modules", ".gradle", ".cache"].includes(e.name)) continue;
    const full = path.join(dir, e.name);
    if (e.isDirectory()) {
      scanArtifacts(full, depth + 1, out);
    } else if (/\.(apk|aab|ipa|exe|AppImage)$/i.test(e.name)) {
      try {
        const st = fs.statSync(full);
        out.push({
          name: e.name,
          relPath: path.relative(WORKSPACE, full),
          sizeMB: (st.size / (1024 * 1024)).toFixed(2),
          mtime: st.mtimeMs,
        });
      } catch {}
    }
  }
  return out.sort((a, b) => b.mtime - a.mtime);
}

// ---------- Helper File Manager (semua path dikunci di dalam workspace) ----------
function resolveWorkspacePath(rel) {
  const root = path.resolve(WORKSPACE);
  const target = path.resolve(root, String(rel || "").replace(/^[/\\]+/, ""));
  if (target !== root && !target.startsWith(root + path.sep)) throw new Error("Path di luar workspace.");
  const relPath = path.relative(root, target).split(path.sep).join("/");
  if (relPath === ".git" || relPath.startsWith(".git/")) throw new Error("Folder .git tidak bisa diakses.");
  return { root, target, rel: relPath };
}

function isProtectedPath(relPath) {
  return !relPath || relPath === ".git" || relPath.startsWith(".git/") ||
    relPath === ".github" || relPath.startsWith(".github/");
}

function detectActivePorts() {
  try {
    const raw = execSync("ss -tlnH 2>/dev/null || true", { encoding: "utf8" });
    const ignored = new Set([22, 4096, 4097, 20241, getUpstreamPort()]);
    const found = new Set();
    for (const line of raw.split("\n")) {
      const m = line.match(/:(\d+)\s+/);
      if (m) {
        const p = Number(m[1]);
        if (p >= 1024 && p <= 65535 && !ignored.has(p) && p < 32768) found.add(p);
      }
    }
    return Array.from(found).sort((a, b) => a - b);
  } catch {
    return [];
  }
}

async function startPortPreviewTunnel(port) {
  const p = Number(port);
  if (!p || p < 1 || p > 65535) throw new Error("Port tidak valid");
  const existing = previewTunnels.get(p);
  if (existing && existing.url && existing.proc && existing.proc.exitCode === null) {
    return existing.url;
  }
  const cfBin = path.join(HOME_DIR, ".local/bin/cloudflared");
  const proc = spawn(cfBin, ["tunnel", "--no-autoupdate", "--protocol", "http2", "--url", `http://127.0.0.1:${p}`], {
    stdio: ["ignore", "pipe", "pipe"],
  });
  let logs = "";
  const urlPromise = new Promise((resolve, reject) => {
    const timer = setTimeout(() => reject(new Error("Timeout membuat tunnel preview")), 20000);
    const onChunk = (buf) => {
      logs += buf.toString();
      const m = logs.match(/https:\/\/[-a-z0-9]+\.trycloudflare\.com/);
      if (m) {
        clearTimeout(timer);
        resolve(m[0]);
      }
    };
    proc.stdout.on("data", onChunk);
    proc.stderr.on("data", onChunk);
    proc.on("exit", () => {
      previewTunnels.delete(p);
      clearTimeout(timer);
      reject(new Error("Cloudflared berhenti"));
    });
  });
  const url = await urlPromise;
  previewTunnels.set(p, { url, proc });
  return url;
}

const LOGIN_HTML = (err = false) => `<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Login — OpenCode Cloud Pro</title>
  <style>
    * { box-sizing: border-box; font-family: system-ui, -apple-system, sans-serif; }
    body { margin: 0; min-height: 100vh; display: grid; place-items: center; background: #0b0d12; color: #f3f4f6; padding: 16px; }
    .card { width: 100%; max-width: 390px; background: #161922; border: 1px solid #2a2f3d; border-radius: 18px; padding: 28px 24px; box-shadow: 0 20px 50px rgba(0,0,0,.5); }
    h1 { margin: 0 0 8px; font-size: 21px; }
    p { margin: 0 0 18px; font-size: 14px; color: #9ca3af; line-height: 1.5; }
    .err { background: #3b181e; border: 1px solid #ef4444; color: #fca5a5; padding: 10px 12px; border-radius: 10px; font-size: 13px; margin-bottom: 16px; }
    label { display: block; font-size: 13px; color: #d1d5db; margin-bottom: 6px; }
    input { width: 100%; padding: 12px 14px; border-radius: 10px; border: 1px solid #374151; background: #0b0d12; color: #fff; font-size: 15px; margin-bottom: 16px; }
    button { width: 100%; padding: 12px; border: 0; border-radius: 10px; background: #3b82f6; color: #fff; font-weight: 600; font-size: 15px; cursor: pointer; }
  </style>
</head>
<body>
  <form class="card" method="POST" action="/__oc_login">
    <h1>🚀 OpenCode Cloud Pro (${OC_VER.toUpperCase()})</h1>
    <p>Masukkan password kamu untuk membuka ruang kerja AI & Cloud Panel.</p>
    ${err ? '<div class="err">Password belum cocok. Cek kembali password kamu.</div>' : ''}
    <label>Password</label>
    <input type="password" name="password" placeholder="Ketik password..." autofocus required />
    <button type="submit">Masuk Sekarang →</button>
  </form>
</body>
</html>`;

const PANEL_HTML = `<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>⚡ Cloud Control Panel — OpenCode Pro</title>
  <style>
    * { box-sizing: border-box; font-family: system-ui, -apple-system, sans-serif; }
    body { margin: 0; background: #0b0d12; color: #f3f4f6; padding: 18px; }
    .wrap { max-width: 760px; margin: 0 auto; }
    .top { display: flex; flex-wrap: wrap; gap: 10px; justify-content: space-between; align-items: center; margin-bottom: 18px; }
    h1 { margin: 0; font-size: 20px; }
    .back { padding: 9px 14px; border-radius: 10px; background: #2563eb; color: #fff; text-decoration: none; font-weight: 600; font-size: 13px; }
    .grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(160px, 1fr)); gap: 12px; margin-bottom: 16px; }
    .stat { background: #161922; border: 1px solid #262c3d; border-radius: 14px; padding: 14px; }
    .stat .k { font-size: 12px; color: #9ca3af; margin-bottom: 4px; }
    .stat .v { font-size: 18px; font-weight: 700; color: #60a5fa; }
    .card { background: #161922; border: 1px solid #262c3d; border-radius: 14px; padding: 18px; margin-bottom: 14px; }
    .card h2 { margin: 0 0 8px; font-size: 16px; }
    .card p { margin: 0 0 12px; font-size: 13px; color: #9ca3af; line-height: 1.5; }
    .row { display: flex; flex-wrap: wrap; gap: 8px; align-items: center; }
    .form-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(200px, 1fr)); gap: 8px; margin-bottom: 10px; }
    input { padding: 10px 12px; border-radius: 9px; border: 1px solid #374151; background: #0b0d12; color: #fff; font-size: 13px; width: 100%; }
    input.short { width: 130px; }
    button, a.btn { display: inline-flex; align-items: center; gap: 6px; padding: 10px 14px; border: 0; border-radius: 9px; background: #3b82f6; color: #fff; font-weight: 600; font-size: 13px; cursor: pointer; text-decoration: none; }
    button.green, a.btn.green { background: #059669; }
    button.amber { background: #d97706; }
    button.red { background: #dc2626; padding: 7px 11px; font-size: 12px; }
    .pill { display: inline-block; padding: 6px 10px; border-radius: 8px; background: #1f2937; font-size: 12px; margin: 4px 4px 0 0; cursor: pointer; border: 1px solid #374151; color: #e5e7eb; }
    .msg { margin-top: 10px; font-size: 13px; color: #6ee7b7; word-break: break-all; }
    .list-item { display: flex; justify-content: space-between; align-items: center; gap: 8px; padding: 10px 12px; background: #0f1219; border: 1px solid #23293a; border-radius: 10px; margin-top: 8px; font-size: 13px; }
    .drop { border: 2px dashed #374151; border-radius: 14px; padding: 22px 16px; text-align: center; color: #9ca3af; cursor: pointer; transition: all .15s; background: #0f1219; }
    .drop.over { border-color: #3b82f6; background: #101a2e; color: #bfdbfe; }
    .drop b { color: #e5e7eb; font-size: 14px; }
    .drop-icon { font-size: 26px; margin-bottom: 6px; }
    .drop-hint { font-size: 11px; color: #6b7280; margin-top: 4px; }
    label.check { display: flex; align-items: center; gap: 8px; font-size: 13px; color: #cbd5e1; margin-top: 10px; cursor: pointer; }
    label.check input { width: 16px; height: 16px; flex: none; }
    .up-item { background: #0f1219; border: 1px solid #23293a; border-radius: 10px; padding: 10px 12px; margin-top: 8px; font-size: 12px; }
    .up-line { display: flex; justify-content: space-between; gap: 8px; margin-bottom: 6px; color: #e5e7eb; word-break: break-all; }
    .up-bar { height: 5px; background: #1b2130; border-radius: 99px; overflow: hidden; }
    .up-bar i { display: block; height: 100%; width: 0%; background: linear-gradient(90deg, #3b82f6, #34d399); transition: width .15s; }
    .up-item.ok .up-bar i { background: #059669; }
    .up-item.err .up-bar i { background: #dc2626; }
    .fm-bar { display: flex; gap: 8px; align-items: center; }
    .fm-bar input { flex: 1; }
    .fm-row { display: flex; align-items: center; gap: 8px; padding: 8px 10px; border: 1px solid #23293a; background: #0f1219; border-radius: 10px; margin-top: 6px; font-size: 13px; }
    .fm-name { flex: 1; cursor: pointer; word-break: break-all; color: #e5e7eb; }
    .fm-name:hover { color: #93c5fd; text-decoration: underline; }
    .fm-size { color: #6b7280; font-size: 11px; white-space: nowrap; }
    .fm-acts { display: flex; gap: 4px; }
    .fm-ico { background: #1f2433; border: 1px solid #32394e; border-radius: 8px; padding: 5px 8px; font-size: 12px; color: #e5e7eb; cursor: pointer; text-decoration: none; flex: none; }
    .fm-modal { position: fixed; inset: 0; background: rgba(0,0,0,.72); display: none; align-items: center; justify-content: center; padding: 16px; z-index: 20; }
    .fm-modal.open { display: flex; }
    .fm-modal-box { width: 100%; max-width: 900px; background: #12151d; border: 1px solid #2a3042; border-radius: 16px; padding: 14px; }
    .fm-modal-head { display: flex; align-items: center; gap: 8px; margin-bottom: 10px; font-size: 13px; word-break: break-all; }
    #fm-editor { width: 100%; height: 62vh; background: #0b0d12; color: #d1fae5; border: 1px solid #262c3d; border-radius: 10px; padding: 12px; font-family: ui-monospace, SFMono-Regular, Menlo, monospace; font-size: 12.5px; line-height: 1.5; resize: vertical; }
    .fm-preview { display: flex; justify-content: center; background: #0b0d12; border: 1px solid #262c3d; border-radius: 10px; padding: 10px; max-height: 62vh; overflow: auto; }
    .fm-preview img { max-width: 100%; height: auto; }
    .fm-modal-foot { margin-top: 8px; font-size: 11px; color: #6b7280; }
  </style>
</head>
<body>
  <div class="wrap">
    <div class="top">
      <h1>⚡ OpenCode Cloud Control Panel</h1>
      <a class="back" href="/__oc_pair">← Kembali ke OpenCode Web</a>
    </div>

    <div class="grid">
      <div class="stat"><div class="k">Versi Engine</div><div class="v" id="st-ver">Memuat...</div></div>
      <div class="stat"><div class="k">Sisa Waktu Sesi</div><div class="v" id="st-time">Memuat...</div></div>
      <div class="stat"><div class="k">Project & Chat Aman</div><div class="v" id="st-sess">Memuat...</div></div>
      <div class="stat"><div class="k">RAM / Disk Bebas</div><div class="v" id="st-ram">Memuat...</div></div>
    </div>

    <div class="card">
      <h2>🔌 Penyedia Kustom (OpenAI-Compatible Provider)</h2>
      <p>Bisa ditambah langsung dari menu <b>Settings → Providers → Custom Provider</b> di dalam OpenCode Web <i>maupun</i> lewat form cepat di bawah ini (API key otomatis dienkripsi AES-256). Pakai <b>🔍 Ambil Daftar Model</b> & <b>⚡ Tes Koneksi 3-Tahap</b> dulu — tes ini mensimulasikan request asli OpenCode (tools + reasoning) dan otomatis mendeteksi penyebab error 400 "Invalid inference request"!</p>
      <div class="form-grid">
        <input id="cp-id" placeholder="Provider ID (cth: myprovider)" />
        <input id="cp-name" placeholder="Nama Tampilan (cth: My AI)" />
        <input id="cp-url" placeholder="Base URL (https://.../v1)" />
        <input id="cp-key" type="password" placeholder="API Key (sk-...)" />
        <input id="cp-mid" placeholder="Model ID (cth: gpt-4.1)" />
        <input id="cp-mname" placeholder="Nama Model (cth: GPT 4.1)" />
        <select id="cp-reason">
          <option value="">🧠 Reasoning: Default — tanpa parameter (paling kompatibel)</option>
          <option value="none">🧠 Reasoning: none (matikan thinking)</option>
          <option value="high">🧠 Reasoning: high</option>
          <option value="max">🧠 Reasoning: max</option>
        </select>
      </div>
      <select id="cp-model-sel" style="display:none" onchange="document.getElementById('cp-mid').value=this.value"></select>
      <div class="row">
        <button onclick="fetchCpModels()">🔍 Ambil Daftar Model</button>
        <button class="amber" onclick="testCpConn()">⚡ Tes Koneksi (3-Tahap)</button>
      </div>
      <button class="green" onclick="addCustomProvider()">➕ Simpan Penyedia Kustom</button>
      <button class="amber" id="cp-fix-btn" style="display:none" onclick="applyCpFix()">🛡️ Terapkan Perbaikan Otomatis</button>
      <div class="msg" id="cp-msg"></div>
      <div id="cp-list" style="margin-top:10px;"></div>
    </div>

    <div class="card">
      <h2>🌐 Live Preview Website / App Buatan OpenCode</h2>
      <p>Masukkan port web yang dijalankan OpenCode (misal <code>3000</code>, <code>5173</code>, <code>8000</code>) untuk membuat Link HTTPS Publik instan:</p>
      <div class="row">
        <input class="short" id="port-in" type="number" value="3000" placeholder="Port (cth: 3000)" />
        <button onclick="openPreview()">🚀 Buat & Buka Link Live Preview</button>
        <button class="green" onclick="openSubpath()">⚡ Preview Cepat (/preview/port)</button>
      </div>
      <div id="ports-detected" style="margin-top:10px;font-size:12px;color:#9ca3af;"></div>
      <div id="preview-list"></div>
    </div>

    <div class="card">
      <h2>📦 Download Project (.zip) & File Aplikasi (.apk)</h2>
      <p>Unduh seluruh folder project sebagai <code>.zip</code> atau unduh langsung file <code>.apk</code> hasil build Android:</p>
      <div class="row">
        <a class="btn green" href="/__api/zip">📥 Download Seluruh Project (.zip)</a>
      </div>
      <div id="apk-list" style="margin-top:10px;"></div>
    </div>

    <div class="card">
      <h2>📤 Upload File ke Workspace</h2>
      <p>Tarik & lepas file (gambar, aset, ZIP, APK, dataset…) ke area di bawah. File langsung masuk ke folder project aktif sehingga bisa dipakai OpenCode tanpa perlu commit manual.</p>
      <div class="drop" id="drop">
        <div class="drop-icon">⬆️</div>
        <div><b>Klik atau tarik file ke sini</b></div>
        <div class="drop-hint">Bisa banyak file sekaligus · batas <span id="up-max">200</span> MB per file</div>
        <input type="file" id="file-in" multiple hidden />
      </div>
      <div class="form-grid" style="margin-top:10px;">
        <input id="up-dir" placeholder="Folder tujuan (opsional, cth: assets/gambar)" />
      </div>
      <label class="check"><input type="checkbox" id="up-overwrite" /> Timpa file jika namanya sudah ada</label>
      <div id="up-list"></div>
    </div>

    <div class="card">
      <h2>🗂️ File Manager</h2>
      <p>Jelajahi, buka, edit, rename, dan hapus file di workspace — tanpa perlu download ZIP. Folder <code>.git</code>, <code>.github</code>, dan <code>.pages</code> sengaja dilindungi.</p>
      <div class="fm-bar">
        <button class="fm-ico" onclick="fmUp()" title="Naik satu folder">⬆️</button>
        <input id="fm-path" placeholder="path/folder" onkeydown="if(event.key==='Enter')fmLoad(this.value)" />
        <button onclick="fmLoad(document.getElementById('fm-path').value)">Buka</button>
      </div>
      <div class="row" style="margin-top:8px;">
        <button onclick="fmMkdir()">📁 Folder Baru</button>
        <button class="green" onclick="fmUploadHere()">📤 Upload ke Folder Ini</button>
        <button onclick="fmLoad(fmPath)">🔄 Refresh</button>
      </div>
      <input id="fm-search" placeholder="🔎 Filter nama di folder ini..." oninput="fmFilter()" style="margin-top:8px;" />
      <div id="fm-list" style="margin-top:8px;"></div>
    </div>

    <div class="card">
      <h2>🛠️ Kontrol Server & Link Permanen</h2>
      <p id="pages-info">Memuat link permanen GitHub Pages...</p>
      <div class="row">
        <button class="green" onclick="doAction('/__api/save', 'Menyimpan kode & chat ke GitHub...')">💾 Save & Backup Sekarang</button>
        <button class="amber" onclick="doAction('/__api/restart', 'Me-restart mesin OpenCode...')">🔄 Restart OpenCode</button>
        <a class="btn" href="/__oc_pair">🔗 Hubungkan Ulang Sesi Web</a>
      </div>
      <div class="msg" id="act-msg"></div>
    </div>
  </div>

  <div class="fm-modal" id="fm-modal">
    <div class="fm-modal-box">
      <div class="fm-modal-head">
        <b id="fm-file-name">-</b>
        <span id="fm-dirty" style="color:#fbbf24;font-size:12px;"></span>
        <span style="flex:1"></span>
        <button class="green" onclick="fmSave()">💾 Simpan</button>
        <button onclick="fmClose()">✖</button>
      </div>
      <textarea id="fm-editor" spellcheck="false"></textarea>
      <div class="fm-preview" id="fm-preview" style="display:none;"><img id="fm-img" alt="preview" /></div>
      <div class="fm-modal-foot"><span id="fm-edit-info"></span></div>
    </div>
  </div>

  <script>
    async function loadStatus() {
      const r = await fetch('/__api/status');
      const d = await r.json();
      document.getElementById('st-ver').textContent = d.ocVersion || '-';
      document.getElementById('st-time').textContent = d.remainingMin + ' menit';
      document.getElementById('st-sess').textContent = (d.projectCount || 1) + ' proj · ' + (d.sessionCount || 0) + ' sesi';
      document.getElementById('st-ram').textContent = d.usedMemGB + '/' + d.totalMemGB + 'G · ' + d.freeDisk;
      if (d.maxUploadMB) document.getElementById('up-max').textContent = d.maxUploadMB;
      document.getElementById('pages-info').innerHTML = '🔗 <b>Link Permanen GitHub Pages:</b> <a style="color:#60a5fa" target="_blank" href="' + d.pagesUrl + '">' + d.pagesUrl + '</a>';

      const cpl = document.getElementById('cp-list');
      if (d.customProviders && d.customProviders.length) {
        cpl.innerHTML = d.customProviders.map(p => '<div class="list-item"><span>🔌 <b>' + p.name + '</b> (<code>' + p.id + '</code> — ' + p.models.map(m => m.id + (m.effort ? ' <b style="color:#fbbf24">🧠' + m.effort + '</b>' : '')).join(', ') + ')</span><button class="red" onclick="delCustomProvider(\\'' + p.id + '\\')">Hapus</button></div>').join('');
      } else {
        cpl.innerHTML = '<div style="font-size:12px;color:#6b7280;margin-top:6px;">Belum ada penyedia kustom tersimpan.</div>';
      }

      const pd = document.getElementById('ports-detected');
      if (d.activePorts.length) {
        pd.innerHTML = 'Port aktif terdeteksi (klik untuk pilih): ' + d.activePorts.map(p => '<span class="pill" onclick="document.getElementById(\\'port-in\\').value=' + p + '">Port ' + p + '</span>').join('');
      } else {
        pd.textContent = 'Belum ada port web tambahan yang menyala.';
      }

      const pl = document.getElementById('preview-list');
      pl.innerHTML = d.tunnels.map(t => '<div class="list-item"><span>🌐 Port <b>' + t.port + '</b></span><a class="btn" target="_blank" href="' + t.url + '">Buka Website ↗</a></div>').join('');

      const al = document.getElementById('apk-list');
      if (d.artifacts.length) {
        al.innerHTML = d.artifacts.map(a => '<div class="list-item"><span>📱 <b>' + a.name + '</b> (' + a.sizeMB + ' MB)</span><a class="btn green" href="/__api/download?path=' + encodeURIComponent(a.relPath) + '">Download ⬇</a></div>').join('');
      } else {
        al.innerHTML = '<div style="font-size:12px;color:#6b7280;margin-top:6px;">Belum ada file .apk — suruh OpenCode membuat aplikasi Android untuk melihat tombol unduh otomatis di sini!</div>';
      }
    }

    async function addCustomProvider() {
      const providerID = document.getElementById('cp-id').value.trim().toLowerCase();
      const name = document.getElementById('cp-name').value.trim();
      const baseURL = document.getElementById('cp-url').value.trim();
      const key = document.getElementById('cp-key').value.trim();
      const mid = document.getElementById('cp-mid').value.trim();
      const mname = document.getElementById('cp-mname').value.trim() || mid;
      const msg = document.getElementById('cp-msg');
      if (!providerID || !name || !baseURL || !mid) {
        msg.textContent = '❌ Isi minimal Provider ID, Nama, Base URL, dan Model ID!';
        return;
      }
      const reason = document.getElementById('cp-reason') ? document.getElementById('cp-reason').value : '';
      const modelEntry = { name: mname };
      if (reason) modelEntry.options = { reasoningEffort: reason };
      const payload = {
        providerID,
        name,
        key: key || undefined,
        config: {
          npm: '@ai-sdk/openai-compatible',
          name,
          options: { baseURL },
          models: { [mid]: modelEntry }
        }
      };
      const r = await fetch('/__api/custom-provider', {
        method: 'POST',
        headers: { 'content-type': 'application/json' },
        body: JSON.stringify(payload)
      });
      const d = await r.json();
      if (r.ok) {
        msg.textContent = '✅ Penyedia kustom "' + name + '" tersimpan & langsung aktif di OpenCode Web!';
        loadStatus();
      } else {
        msg.textContent = '❌ Gagal: ' + (d.error || 'Unknown error');
      }
    }

    async function delCustomProvider(id) {
      await fetch('/__api/custom-provider?id=' + encodeURIComponent(id), { method: 'DELETE' });
      loadStatus();
    }

    async function fetchCpModels() {
      const msg = document.getElementById('cp-msg');
      const baseURL = document.getElementById('cp-url').value.trim();
      const key = document.getElementById('cp-key').value.trim();
      if (!baseURL) { msg.textContent = '❌ Isi Base URL dulu!'; return; }
      msg.textContent = '⏳ Mengambil daftar model dari provider...';
      const r = await fetch('/__api/cp-models', { method: 'POST', headers: { 'content-type': 'application/json' }, body: JSON.stringify({ baseURL, key }) });
      const d = await r.json();
      if (d.models && d.models.length) {
        const sel = document.getElementById('cp-model-sel');
        sel.style.display = 'block';
        sel.innerHTML = d.models.map(m => '<option value="' + m.replace(/"/g, '&quot;') + '">' + m + '</option>').join('');
        if (!document.getElementById('cp-mid').value) document.getElementById('cp-mid').value = d.models[0];
        msg.textContent = '✅ Ditemukan ' + d.models.length + ' model! Pilih dari dropdown di atas.';
      } else {
        msg.textContent = '❌ ' + (d.error || 'Tidak ada model yang dikembalikan.');
      }
    }

    let __cpFixHigh = false;
    async function testCpConn() {
      const msg = document.getElementById('cp-msg');
      const baseURL = document.getElementById('cp-url').value.trim();
      const key = document.getElementById('cp-key').value.trim();
      const mid = document.getElementById('cp-mid').value.trim();
      if (!baseURL || !mid) { msg.textContent = '❌ Isi Base URL dan Model ID dulu!'; return; }
      msg.textContent = '⏳ Tes 3-tahap: dasar → +reasoning medium +tools → +tools saja...';
      try {
        const r = await fetch('/__api/cp-test', { method: 'POST', headers: { 'content-type': 'application/json' }, body: JSON.stringify({ baseURL, key, mid }) });
        const d = await r.json();
        msg.textContent = d.message || d.error;
        __cpFixHigh = Boolean(d.reasoningHighWorks);
        const fb = document.getElementById('cp-fix-btn');
        if (fb) fb.style.display = d.fixReasoning ? 'block' : 'none';
      } catch (e) {
        msg.textContent = '❌ Tes gagal: ' + e.message;
      }
    }

    async function applyCpFix() {
      document.getElementById('cp-reason').value = __cpFixHigh ? 'high' : '';
      document.getElementById('cp-fix-btn').style.display = 'none';
      await addCustomProvider();
    }

    async function openPreview() {
      const port = document.getElementById('port-in').value;
      const msg = document.getElementById('act-msg');
      msg.textContent = '⏳ Membuat link HTTPS publik untuk port ' + port + ' (~5 detik)...';
      const r = await fetch('/__api/preview', { method: 'POST', headers: {'content-type':'application/json'}, body: JSON.stringify({ port }) });
      const d = await r.json();
      if (d.url) {
        msg.innerHTML = '✅ Live Preview aktif: <a style="color:#6ee7b7" target="_blank" href="' + d.url + '">' + d.url + '</a>';
        loadStatus();
        window.open(d.url, '_blank');
      } else {
        msg.textContent = '❌ Gagal: ' + (d.error || 'Unknown error');
      }
    }

    function openSubpath() {
      const port = document.getElementById('port-in').value;
      window.open('/preview/' + port + '/', '_blank');
    }

    async function doAction(url, waitText) {
      const msg = document.getElementById('act-msg');
      msg.textContent = '⏳ ' + waitText;
      const r = await fetch(url, { method: 'POST' });
      const d = await r.json();
      msg.textContent = d.message || '✅ Selesai!';
      loadStatus();
    }

    // --- Upload file ke workspace (drag & drop + progress bar) ---
    const dropEl = document.getElementById('drop');
    const fileIn = document.getElementById('file-in');
    const upList = document.getElementById('up-list');

    function escHtml(s) {
      return String(s == null ? '' : s).replace(/[&<>"']/g, function (c) {
        return { '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c];
      });
    }

    function fmtSize(n) {
      if (n < 1024) return n + ' B';
      if (n < 1048576) return (n / 1024).toFixed(0) + ' KB';
      if (n < 1073741824) return (n / 1048576).toFixed(1) + ' MB';
      return (n / 1073741824).toFixed(2) + ' GB';
    }

    dropEl.addEventListener('click', function () { fileIn.click(); });
    dropEl.addEventListener('dragenter', function (e) { e.preventDefault(); dropEl.classList.add('over'); });
    dropEl.addEventListener('dragover', function (e) { e.preventDefault(); dropEl.classList.add('over'); });
    dropEl.addEventListener('dragleave', function (e) { e.preventDefault(); dropEl.classList.remove('over'); });
    dropEl.addEventListener('drop', function (e) {
      e.preventDefault();
      dropEl.classList.remove('over');
      if (e.dataTransfer && e.dataTransfer.files && e.dataTransfer.files.length) uploadFiles(e.dataTransfer.files);
    });
    fileIn.addEventListener('change', function () {
      if (fileIn.files && fileIn.files.length) uploadFiles(fileIn.files);
    });

    async function uploadFiles(files) {
      const dir = document.getElementById('up-dir').value.trim().replace(/^\\/+|\\/+$/g, '');
      const overwrite = document.getElementById('up-overwrite').checked;
      for (let i = 0; i < files.length; i++) {
        await uploadOne(files[i], dir, overwrite);
      }
      fileIn.value = '';
      if (typeof fmLoad === 'function') fmLoad(fmPath);
      loadStatus();
    }

    function uploadOne(file, dir, overwrite) {
      return new Promise(function (resolve) {
        const row = document.createElement('div');
        row.className = 'up-item';
        row.innerHTML = '<div class="up-line"><span>📄 ' + escHtml(file.name) + ' <span style="color:#6b7280">(' + fmtSize(file.size) + ')</span></span><span class="up-pct">0%</span></div><div class="up-bar"><i></i></div>';
        upList.insertBefore(row, upList.firstChild);
        const bar = row.querySelector('.up-bar i');
        const pct = row.querySelector('.up-pct');

        const xhr = new XMLHttpRequest();
        let query = '/__api/upload?dir=' + encodeURIComponent(dir);
        if (overwrite) query += '&overwrite=1';
        xhr.open('POST', query);
        xhr.setRequestHeader('content-type', 'application/octet-stream');
        xhr.setRequestHeader('x-file-name', encodeURIComponent(file.name));
        xhr.upload.onprogress = function (e) {
          if (!e.lengthComputable) return;
          const p = Math.round((e.loaded / e.total) * 100);
          bar.style.width = p + '%';
          pct.textContent = p + '%';
        };
        xhr.onload = function () {
          let d = {};
          try { d = JSON.parse(xhr.responseText || '{}'); } catch (err) {}
          if (xhr.status >= 200 && xhr.status < 300 && d.ok) {
            row.classList.add('ok');
            bar.style.width = '100%';
            pct.innerHTML = '✅ <a style="color:#6ee7b7" href="' + d.downloadUrl + '">' + escHtml(d.path) + '</a>';
          } else {
            row.classList.add('err');
            bar.style.width = '100%';
            pct.textContent = '❌ ' + (d.error || ('HTTP ' + xhr.status));
          }
          resolve();
        };
        xhr.onerror = function () {
          row.classList.add('err');
          pct.textContent = '❌ Koneksi terputus';
          resolve();
        };
        xhr.send(file);
      });
    }

    // --- File Manager ---
    var fmPath = "";
    var fmEntries = [];
    var fmEditing = null;
    var fmDirty = false;

    function fmJoin(dir, name) { return dir ? dir + "/" + name : name; }

    function fmIcon(ext) {
      var map = { png: "🖼️", jpg: "🖼️", jpeg: "🖼️", gif: "🖼️", webp: "🖼️", svg: "🖼️", ico: "🖼️",
        js: "🟨", mjs: "🟨", ts: "🟦", tsx: "🟦", jsx: "🟦", json: "🟪", html: "🌐", css: "🎨", md: "📝", txt: "📄",
        py: "🐍", sh: "⚙️", yml: "🧾", yaml: "🧾", zip: "🗜️", apk: "📱", pdf: "📕", mp4: "🎬", mp3: "🎵" };
      return map[ext] || "📄";
    }

    function fmErr(msg) {
      document.getElementById("fm-list").innerHTML = '<div class="fm-row" style="color:#fca5a5">❌ ' + escHtml(msg) + '</div>';
    }

    async function fmLoad(p) {
      try {
        const r = await fetch("/__api/files?path=" + encodeURIComponent(p || ""));
        const d = await r.json();
        if (!d.ok) return fmErr(d.error || "Gagal membuka folder");
        fmPath = d.path;
        fmEntries = d.entries || [];
        document.getElementById("fm-path").value = fmPath;
        document.getElementById("fm-search").value = "";
        var rows = fmEntries.map(function (e) {
          var isDir = e.type === "dir";
          var full = fmJoin(fmPath, e.name);
          var enc = encodeURIComponent(full);
          return '<div class="fm-row" data-name="' + escHtml(e.name.toLowerCase()) + '">' +
            '<span class="fm-name" data-act="open" data-name="' + escHtml(e.name) + '">' + (isDir ? "📁" : fmIcon(e.ext)) + " " + escHtml(e.name) + '</span>' +
            '<span class="fm-size">' + (isDir ? "" : fmtSize(e.size)) + '</span>' +
            '<span class="fm-acts">' +
              (isDir ? "" : '<a class="fm-ico" href="/__api/download?path=' + enc + '" title="Download">⬇️</a>') +
              '<button class="fm-ico" data-act="rename" data-name="' + escHtml(e.name) + '" title="Rename">✏️</button>' +
              '<button class="fm-ico" data-act="delete" data-name="' + escHtml(e.name) + '" title="Hapus">🗑️</button>' +
            '</span></div>';
        }).join("");
        document.getElementById("fm-list").innerHTML = rows || '<div style="font-size:12px;color:#6b7280;margin-top:6px;">Folder kosong.</div>';
      } catch (e) { fmErr("Koneksi gagal: " + e.message); }
    }

    function fmFilter() {
      var q = document.getElementById("fm-search").value.toLowerCase();
      var rows = document.querySelectorAll("#fm-list .fm-row[data-name]");
      for (var i = 0; i < rows.length; i++) {
        rows[i].style.display = rows[i].getAttribute("data-name").indexOf(q) > -1 ? "flex" : "none";
      }
    }

    function fmUp() {
      if (!fmPath) return;
      fmLoad(fmPath.indexOf("/") > -1 ? fmPath.slice(0, fmPath.lastIndexOf("/")) : "");
    }

    async function fmOpen(name) {
      var entry = null;
      for (var i = 0; i < fmEntries.length; i++) if (fmEntries[i].name === name) entry = fmEntries[i];
      if (!entry) return;
      var full = fmJoin(fmPath, name);
      if (entry.type === "dir") return fmLoad(full);
      if (entry.type === "link") { window.open("/__api/download?path=" + encodeURIComponent(full), "_blank"); return; }
      try {
        const r = await fetch("/__api/file?path=" + encodeURIComponent(full));
        const d = await r.json();
        if (!d.ok) { alert(d.error || "Gagal membuka file"); return; }
        fmEditing = d.path;
        fmDirty = false;
        document.getElementById("fm-file-name").textContent = d.path;
        document.getElementById("fm-dirty").textContent = "";
        var img = ["png", "jpg", "jpeg", "gif", "webp", "svg", "ico", "bmp", "avif", "pdf"];
        var isImg = d.binary === true && img.indexOf(d.ext) > -1;
        document.getElementById("fm-preview").style.display = isImg ? "flex" : "none";
        document.getElementById("fm-editor").style.display = isImg ? "none" : "block";
        document.getElementById("fm-editor").disabled = d.binary === true;
        document.getElementById("fm-editor").value = d.binary === true ? "" : (d.content || "");
        if (isImg) document.getElementById("fm-img").src = "/__api/download?inline=1&path=" + encodeURIComponent(d.path);
        document.getElementById("fm-edit-info").textContent = d.binary === true ? (isImg ? "Pratinjau gambar" : "File biner — pakai tombol ⬇️ Download") : fmtSize(d.size) + " · Ctrl+S untuk menyimpan";
        document.getElementById("fm-modal").classList.add("open");
      } catch (e) { alert("Gagal membuka file: " + e.message); }
    }

    function fmClose() {
      if (fmDirty && !confirm("Ada perubahan belum disimpan. Tutup saja?")) return;
      document.getElementById("fm-modal").classList.remove("open");
      fmEditing = null;
      fmDirty = false;
    }

    async function fmSave() {
      if (!fmEditing) return;
      var content = document.getElementById("fm-editor").value;
      try {
        const r = await fetch("/__api/file", { method: "POST", headers: { "content-type": "application/json" }, body: JSON.stringify({ path: fmEditing, content: content }) });
        const d = await r.json();
        if (!d.ok) { alert(d.error || "Gagal menyimpan"); return; }
        fmDirty = false;
        document.getElementById("fm-dirty").textContent = "✅ tersimpan";
        setTimeout(function () { document.getElementById("fm-dirty").textContent = ""; }, 2500);
        fmLoad(fmPath);
      } catch (e) { alert("Gagal menyimpan: " + e.message); }
    }

    async function fmFs(payload) {
      const r = await fetch("/__api/fs", { method: "POST", headers: { "content-type": "application/json" }, body: JSON.stringify(payload) });
      return r.json();
    }

    async function fmMkdir() {
      var name = prompt("Nama folder baru di " + (fmPath || "root") + ":");
      if (!name) return;
      var d = await fmFs({ op: "mkdir", path: fmJoin(fmPath, name) });
      if (!d.ok) return alert(d.error || "Gagal membuat folder");
      fmLoad(fmPath);
    }

    async function fmRename(name) {
      var nn = prompt("Nama baru untuk " + name + ":", name);
      if (!nn || nn === name) return;
      var d = await fmFs({ op: "rename", path: fmJoin(fmPath, name), to: fmJoin(fmPath, nn) });
      if (!d.ok) return alert(d.error || "Gagal rename");
      fmLoad(fmPath);
    }

    async function fmDelete(name) {
      if (!confirm("Hapus permanen " + name + "?")) return;
      var d = await fmFs({ op: "delete", path: fmJoin(fmPath, name) });
      if (!d.ok) return alert(d.error || "Gagal menghapus");
      fmLoad(fmPath);
    }

    function fmUploadHere() {
      document.getElementById("up-dir").value = fmPath;
      document.getElementById("file-in").click();
    }

    document.getElementById("fm-list").addEventListener("click", function (ev) {
      var el = ev.target.closest("[data-act]");
      if (!el) return;
      var act = el.getAttribute("data-act");
      var name = el.getAttribute("data-name");
      if (act === "open") fmOpen(name);
      else if (act === "rename") fmRename(name);
      else if (act === "delete") fmDelete(name);
    });
    document.getElementById("fm-editor").addEventListener("input", function () {
      fmDirty = true;
      document.getElementById("fm-dirty").textContent = "● belum disimpan";
    });
    document.getElementById("fm-editor").addEventListener("keydown", function (ev) {
      if ((ev.ctrlKey || ev.metaKey) && (ev.key === "s" || ev.key === "S")) { ev.preventDefault(); fmSave(); }
    });
    document.getElementById("fm-modal").addEventListener("click", function (ev) {
      if (ev.target.id === "fm-modal") fmClose();
    });

    fmLoad("");

    loadStatus();
    setInterval(loadStatus, 10000);
  </script>
</body>
</html>`;

const buildWidgetJs = () => {
  const pMeta = getPersistenceMeta();
  return `(() => {
  const OC_WORKSPACE = ${JSON.stringify(WORKSPACE)};
  const OC_WORKTREES = ${JSON.stringify(pMeta.worktrees)};
  const OC_HAS_SESSIONS = ${JSON.stringify(pMeta.sessionCount > 0)};
  const OC_MODE = ${JSON.stringify(OC_VER)};
  const OC_CUSTOM_MODELS = ${JSON.stringify(getCustomModelEntries())};

  // 1. Daftarkan otomatis SEMUA project user & tampilkan semua model kustom walau domain *.trycloudflare.com berganti tiap 6 jam!
  if (OC_MODE !== 'v1') {
    try {
      if (OC_WORKTREES.length > 0) {
        const key = 'opencode.global.dat:server';
        const parsed = JSON.parse(localStorage.getItem(key) || 'null') || {
          list: [],
          hidden: {},
          projects: { local: [] },
          lastProject: {},
          recentlyClosed: {}
        };
        parsed.projects = parsed.projects || {};
        parsed.projects.local = Array.isArray(parsed.projects.local) ? parsed.projects.local : [];
        for (const wt of OC_WORKTREES) {
          if (wt && !parsed.projects.local.some((p) => p && p.worktree === wt)) {
            parsed.projects.local.push({ worktree: wt, expanded: true });
          }
        }
        parsed.lastProject = parsed.lastProject || {};
        if (!parsed.lastProject.local && OC_WORKSPACE) {
          parsed.lastProject.local = OC_WORKSPACE;
        }
        localStorage.setItem(key, JSON.stringify(parsed));
      }
      if (OC_CUSTOM_MODELS.length > 0) {
        const mKey = 'opencode.global.dat:model';
        const mData = JSON.parse(localStorage.getItem(mKey) || 'null') || { user: [], recent: [], variant: {} };
        mData.user = Array.isArray(mData.user) ? mData.user : [];
        for (const item of OC_CUSTOM_MODELS) {
          const existing = mData.user.find((x) => x && x.providerID === item.providerID && x.modelID === item.modelID);
          if (!existing) {
            mData.user.push({ providerID: item.providerID, modelID: item.modelID, visibility: 'show' });
          }
        }
        localStorage.setItem(mKey, JSON.stringify(mData));
      }
    } catch {}
  }

  // 2. Real-Time SSE-over-WebSocket Tunnel (mengatasi buffering HTTP chunked di *.trycloudflare.com!)
  if (!window.__ocSsePatched) {
    window.__ocSsePatched = true;
    const origFetch = window.fetch.bind(window);
    const isSseReq = (input, init) => {
      try {
        const rawUrl = typeof input === 'string'
          ? input
          : input instanceof URL
          ? input.href
          : (input && input.url) || String(input || '');
        const u = new URL(rawUrl, location.origin);
        if (u.origin !== location.origin) return null;
        let accept = '';
        if (init && init.headers) {
          if (init.headers instanceof Headers) accept = init.headers.get('accept') || '';
          else if (Array.isArray(init.headers)) {
            const found = init.headers.find(([k]) => String(k).toLowerCase() === 'accept');
            accept = found ? found[1] : '';
          } else {
            for (const k of Object.keys(init.headers)) {
              if (k.toLowerCase() === 'accept') accept = init.headers[k];
            }
          }
        } else if (input instanceof Request) {
          accept = input.headers.get('accept') || '';
        }
        if (accept.includes('text/event-stream') || u.pathname === '/event' || u.pathname.endsWith('/event')) {
          return u.pathname + u.search;
        }
      } catch {}
      return null;
    };

    const openWsStream = (targetPath, signal) => new Promise((resolve, reject) => {
      const proto = location.protocol === 'https:' ? 'wss:' : 'ws:';
      const ws = new WebSocket(proto + '//' + location.host + '/__oc_sse_ws?path=' + encodeURIComponent(targetPath));
      ws.binaryType = 'arraybuffer';
      let settled = false;
      let controllerRef = null;
      const stream = new ReadableStream({
        start(controller) { controllerRef = controller; },
        cancel() { try { ws.close(); } catch {} }
      });
      if (signal) {
        if (signal.aborted) { try { ws.close(); } catch {} return reject(new DOMException('Aborted', 'AbortError')); }
        signal.addEventListener('abort', () => {
          try { ws.close(); } catch {}
          try { controllerRef && controllerRef.close(); } catch {}
        }, { once: true });
      }
      ws.onmessage = (ev) => {
        if (!settled) {
          settled = true;
          resolve(new Response(stream, {
            status: 200,
            headers: { 'content-type': 'text/event-stream', 'cache-control': 'no-cache' }
          }));
        }
        try {
          const bytes = typeof ev.data === 'string' ? new TextEncoder().encode(ev.data) : new Uint8Array(ev.data);
          controllerRef.enqueue(bytes);
        } catch {}
      };
      ws.onerror = () => {
        if (!settled) { settled = true; reject(new TypeError('SSE WebSocket failed')); }
        else { try { controllerRef && controllerRef.close(); } catch {} }
      };
      ws.onclose = () => {
        if (!settled) {
          settled = true;
          resolve(new Response(stream, { status: 200, headers: { 'content-type': 'text/event-stream' } }));
        }
        try { controllerRef && controllerRef.close(); } catch {}
      };
    });

    window.fetch = function(input, init) {
      const method = (init && init.method) || (input instanceof Request ? input.method : 'GET');
      const ssePath = isSseReq(input, init);
      if (ssePath && String(method).toUpperCase() === 'GET') {
        return openWsStream(ssePath, (init && init.signal) || (input instanceof Request ? input.signal : undefined));
      }
      return origFetch(input, init);
    };
  }

  // 3. Jika di v2 belum ada chat tersimpan sama sekali di halaman awal, buka otomatis kolom chat baru!
  if (OC_MODE !== 'v1' && !OC_HAS_SESSIONS) {
    let tries = 0;
    let autoClicked = false;
    const autoTimer = setInterval(() => {
      tries++;
      if (autoClicked || tries > 25 || location.pathname !== '/') {
        clearInterval(autoTimer);
        return;
      }
      const newBtn = document.querySelector('[data-action="home-new-session"]');
      if (newBtn && document.body && document.body.innerText.includes('Nothing here yet')) {
        autoClicked = true;
        clearInterval(autoTimer);
        newBtn.click();
      }
    }, 300);
  }

  // 4. Tombol ⚡ Panel Mini di Atas Tengah + Bisa Digeser Bebas (Drag) & Diperkecil (Minimize)
  //    100% TIDAK PERNAH menghalangi tombol kirim chat, pilih model, atau menu OpenCode!
  const mountFab = () => {
    if (document.getElementById('__oc_cloud_fab') || !document.body) return;
    const wrap = document.createElement('div');
    wrap.id = '__oc_cloud_fab';
    let savedPos = null;
    try { savedPos = JSON.parse(localStorage.getItem('__oc_fab_pos') || 'null'); } catch {}
    let minimized = localStorage.getItem('__oc_fab_min') === '1';

    Object.assign(wrap.style, {
      position: 'fixed',
      top: savedPos && typeof savedPos.top === 'number' ? savedPos.top + 'px' : '88px',
      left: savedPos && typeof savedPos.left === 'number' ? savedPos.left + 'px' : 'auto',
      right: savedPos && typeof savedPos.left === 'number' ? 'auto' : '8px',
      transform: 'none',
      zIndex: '2147483647',
      display: 'inline-flex',
      alignItems: 'center',
      gap: '4px',
      borderRadius: '999px',
      background: 'rgba(22, 25, 34, 0.88)',
      color: '#60a5fa',
      border: '1px solid rgba(71, 85, 105, 0.85)',
      fontSize: '11px',
      fontWeight: '600',
      fontFamily: 'system-ui, -apple-system, sans-serif',
      boxShadow: '0 3px 12px rgba(0,0,0,0.28)',
      backdropFilter: 'blur(8px)',
      userSelect: 'none',
      touchAction: 'none',
    });

    const link = document.createElement('a');
    link.href = '/__panel';
    link.target = '_blank';
    link.title = 'Buka Cloud Control Panel (geser untuk pindah posisi)';
    Object.assign(link.style, {
      color: '#60a5fa',
      textDecoration: 'none',
      padding: '3px 8px 3px 9px',
      lineHeight: '1.2',
      whiteSpace: 'nowrap',
    });

    const toggleBtn = document.createElement('button');
    toggleBtn.type = 'button';
    toggleBtn.title = 'Kecilkan / Perbesar tombol panel';
    Object.assign(toggleBtn.style, {
      border: '0',
      background: 'transparent',
      color: '#94a3b8',
      fontSize: '11px',
      lineHeight: '1',
      padding: '3px 7px 3px 2px',
      cursor: 'pointer',
    });

    const renderState = () => {
      if (minimized) {
        link.textContent = '⚡';
        link.style.padding = '3px 7px';
        toggleBtn.style.display = 'none';
        wrap.style.opacity = '0.55';
      } else {
        link.textContent = '⚡ Panel';
        link.style.padding = '3px 4px 3px 9px';
        toggleBtn.textContent = '–';
        toggleBtn.style.display = 'inline-block';
        wrap.style.opacity = '0.92';
      }
    };
    renderState();

    let dragging = false;
    let moved = false;
    let startX = 0, startY = 0, origLeft = 0, origTop = 0;

    wrap.addEventListener('pointerdown', (e) => {
      dragging = true;
      moved = false;
      const rect = wrap.getBoundingClientRect();
      startX = e.clientX;
      startY = e.clientY;
      origLeft = rect.left;
      origTop = rect.top;
      wrap.setPointerCapture(e.pointerId);
    });

    wrap.addEventListener('pointermove', (e) => {
      if (!dragging) return;
      const dx = e.clientX - startX;
      const dy = e.clientY - startY;
      if (Math.abs(dx) > 5 || Math.abs(dy) > 5) moved = true;
      if (!moved) return;
      const nextLeft = Math.max(4, Math.min(window.innerWidth - wrap.offsetWidth - 4, origLeft + dx));
      const nextTop = Math.max(4, Math.min(window.innerHeight - wrap.offsetHeight - 4, origTop + dy));
      wrap.style.transform = 'none';
      wrap.style.left = nextLeft + 'px';
      wrap.style.top = nextTop + 'px';
    });

    const finishDrag = (e) => {
      if (!dragging) return;
      dragging = false;
      try { wrap.releasePointerCapture(e.pointerId); } catch {}
      if (moved) {
        const rect = wrap.getBoundingClientRect();
        try {
          localStorage.setItem('__oc_fab_pos', JSON.stringify({ left: Math.round(rect.left), top: Math.round(rect.top) }));
        } catch {}
      }
    };
    wrap.addEventListener('pointerup', finishDrag);
    wrap.addEventListener('pointercancel', finishDrag);

    link.addEventListener('click', (e) => {
      if (moved) {
        e.preventDefault();
        moved = false;
        return;
      }
      if (minimized) {
        e.preventDefault();
        minimized = false;
        localStorage.setItem('__oc_fab_min', '0');
        renderState();
      }
    });

    toggleBtn.addEventListener('click', (e) => {
      e.stopPropagation();
      if (moved) { moved = false; return; }
      minimized = true;
      localStorage.setItem('__oc_fab_min', '1');
      renderState();
    });

    wrap.appendChild(link);
    wrap.appendChild(toggleBtn);
    document.body.appendChild(wrap);
  };
  document.addEventListener('DOMContentLoaded', mountFab);
  mountFab();
})();`;
};

let cachedOcVersion = "";
try {
  cachedOcVersion = execFileSync(path.join(HOME_DIR, ".local/bin/opencode"), ["--version"], { encoding: "utf8" }).trim();
} catch {}

function sendWsBinary(socket, buf) {
  if (socket.destroyed) return;
  const len = buf.length;
  let header;
  if (len < 126) {
    header = Buffer.from([0x82, len]);
  } else if (len < 65536) {
    header = Buffer.alloc(4);
    header[0] = 0x82;
    header[1] = 126;
    header.writeUInt16BE(len, 2);
  } else {
    header = Buffer.alloc(10);
    header[0] = 0x82;
    header[1] = 127;
    header.writeBigUInt64BE(BigInt(len), 2);
  }
  socket.write(Buffer.concat([header, buf]));
}

const server = http.createServer(async (req, res) => {
  const url = new URL(req.url || "/", `http://${req.headers.host || "localhost"}`);
  const targetPort = getUpstreamPort();

  if (url.pathname === "/__oc_health") {
    // CORS dibuka agar dashboard GitHub Pages bisa memantau status sesi secara langsung
    return sendJson(res, 200, { ok: true, version: cachedOcVersion }, { "access-control-allow-origin": "*" });
  }

  if (url.pathname === "/__oc_login" && req.method === "POST") {
    const body = await readBody(req);
    const pw = (new URLSearchParams(body).get("password") || "").trim();
    if (pw === PASSWORD) {
      const isHttps = req.headers["x-forwarded-proto"] === "https";
      const svc = getUpstreamService();
      res.writeHead(302, {
        "Set-Cookie": [
          `oc_auth=${TOKEN}; Path=/; HttpOnly; Max-Age=2592000; SameSite=Lax${isHttps ? "; Secure" : ""}`,
          `oc_svc_id=${svc.id}; Path=/; HttpOnly; Max-Age=2592000; SameSite=Lax`,
        ],
        "Location": getV2PairPath(),
      });
      return res.end();
    }
    res.writeHead(401, { "content-type": "text/html; charset=utf-8" });
    return res.end(LOGIN_HTML(true));
  }

  if (!isAuthed(req)) {
    if (url.pathname.startsWith("/__api/")) {
      return sendJson(res, 401, { error: "Sesi login berakhir. Muat ulang halaman lalu login kembali." });
    }
    res.writeHead(200, { "content-type": "text/html; charset=utf-8", "cache-control": "no-store" });
    return res.end(LOGIN_HTML(false));
  }

  if (url.pathname === "/__oc_pair") {
    const svc = getUpstreamService();
    res.writeHead(302, {
      "Set-Cookie": `oc_svc_id=${svc.id}; Path=/; HttpOnly; Max-Age=2592000; SameSite=Lax`,
      "Location": getV2PairPath(),
      "cache-control": "no-store",
    });
    return res.end();
  }

  if (url.pathname === "/__oc_widget.js") {
    res.writeHead(200, { "content-type": "application/javascript; charset=utf-8", "cache-control": "no-store" });
    return res.end(buildWidgetJs());
  }

  if (url.pathname === "/__panel") {
    res.writeHead(200, { "content-type": "text/html; charset=utf-8", "cache-control": "no-store" });
    return res.end(PANEL_HTML);
  }

  // Endpoint penyimpanan & penghapusan Custom OpenAI-Compatible Provider (aktif langsung & auto-reload!)
  if (url.pathname === "/__api/cp-models" && req.method === "POST") {
    try {
      const d = JSON.parse((await readBody(req)) || "{}");
      const base = String(d.baseURL || "").trim().replace(/\/+$/, "");
      const key = String(d.key || "").trim();
      if (!base) return sendJson(res, 400, { error: "Isi Base URL dulu." });
      const hdrs = { accept: "application/json" };
      if (key) hdrs.authorization = "Bearer " + key;
      const r = await fetch(base + "/models", { headers: hdrs, signal: AbortSignal.timeout(15000) });
      const txt = await r.text();
      if (!r.ok) return sendJson(res, 200, { error: "HTTP " + r.status + ": " + txt.slice(0, 160) });
      const j = JSON.parse(txt || "{}");
      const list = Array.isArray(j.data) ? j.data.map((m) => m && (m.id || m.name)).filter(Boolean) : [];
      return sendJson(res, 200, { models: [...new Set(list)].sort() });
    } catch (e) {
      return sendJson(res, 500, { error: "Gagal: " + e.message });
    }
  }

  if (url.pathname === "/__api/cp-test" && req.method === "POST") {
    try {
      const d = JSON.parse((await readBody(req)) || "{}");
      const base = String(d.baseURL || "").trim().replace(/\/+$/, "");
      const key = String(d.key || "").trim();
      const mid = String(d.mid || "").trim();
      if (!base || !mid) return sendJson(res, 400, { error: "Isi Base URL dan Model ID dulu." });
      const hdrs = { "content-type": "application/json" };
      if (key) hdrs.authorization = "Bearer " + key;
      const simTools = [{ type: "function", function: { name: "check_status", description: "Cek status sistem", parameters: { type: "object", properties: {}, additionalProperties: false } } }];
      const call = async (extra) => {
        const r = await fetch(base + "/chat/completions", {
          method: "POST",
          headers: hdrs,
          body: JSON.stringify({ model: mid, messages: [{ role: "user", content: "Jawab singkat: OK" }], max_tokens: 16, ...extra }),
          signal: AbortSignal.timeout(25000),
        });
        return { status: r.status, text: await r.text() };
      };
      const t0 = Date.now();
      const rA = await call({});
      if (rA.status >= 300) {
        return sendJson(res, 200, { error: "❌ Tes Dasar GAGAL (HTTP " + rA.status + ", " + (Date.now() - t0) + " ms): " + rA.text.slice(0, 160) });
      }
      const ms = Date.now() - t0;
      const rB = await call({ reasoning_effort: "medium", tools: simTools });
      if (rB.status < 300) {
        return sendJson(res, 200, { message: "⚡ Koneksi SEMPURNA (" + ms + " ms)! Key, model, tools & reasoning 'medium' semuanya diterima — siap dipakai OpenCode tanpa error." });
      }
      const rC = await call({ tools: simTools });
      if (rC.status < 300) {
        const rB2 = await call({ reasoning_effort: "high", tools: simTools });
        const highOk = rB2.status < 300;
        return sendJson(res, 200, {
          message: "⚠️ Masalah ketemu! Key & model valid (" + ms + " ms), TAPI provider menolak reasoning 'medium' (HTTP " + rB.status + ") — penyebab error 400 'Invalid inference request'. " + (highOk ? "Provider MENERIMA 'high' → klik 🛡️ Terapkan Perbaikan Otomatis di bawah." : "Provider juga menolak 'high' → pastikan Reasoning: Default (tanpa parameter) lalu klik Simpan ulang."),
          fixReasoning: true,
          reasoningHighWorks: highOk,
        });
      }
      return sendJson(res, 200, { error: "❌ Model ini tampaknya TIDAK mendukung tools/function-calling (HTTP " + rC.status + "): " + rC.text.slice(0, 140) + " — OpenCode butuh model yang support tools. Pilih model lain lewat 🔍 Ambil Daftar Model." });
    } catch (e) {
      return sendJson(res, 500, { error: "❌ Gagal konek: " + e.message });
    }
  }

  if (url.pathname === "/__api/custom-provider") {
    if (req.method === "POST") {
      try {
        const data = JSON.parse((await readBody(req)) || "{}");
        const providerID = String(data.providerID || "").trim();
        if (!providerID || !data.config) {
          return sendJson(res, 400, { error: "Data penyedia kustom tidak lengkap." });
        }
        const cfg = readGlobalConfig();
        cfg.provider = cfg.provider || {};
        const options = { ...(data.config.options || {}) };
        if (data.key) options.apiKey = String(data.key).trim();
        cfg.provider[providerID] = {
          ...data.config,
          options,
        };
        writeGlobalConfig(cfg);
        reloadOpenCodeEngine();
        return sendJson(res, 200, { ok: true, providerID, name: data.name || providerID });
      } catch (e) {
        return sendJson(res, 500, { error: e.message });
      }
    }
    if (req.method === "DELETE") {
      try {
        const id = String(url.searchParams.get("id") || "").trim();
        const cfg = readGlobalConfig();
        if (cfg.provider && cfg.provider[id]) {
          delete cfg.provider[id];
          writeGlobalConfig(cfg);
          reloadOpenCodeEngine();
        }
        return sendJson(res, 200, { ok: true });
      } catch (e) {
        return sendJson(res, 500, { error: e.message });
      }
    }
  }

  if (url.pathname === "/__api/status") {
    const elapsedMin = Math.floor((Date.now() - START_TIME) / 60000);
    const remainingMin = Math.max(0, DURATION_MIN - elapsedMin);
    const totalMemGB = (os.totalmem() / 1073741824).toFixed(1);
    const usedMemGB = ((os.totalmem() - os.freemem()) / 1073741824).toFixed(1);
    let freeDisk = "-";
    try {
      freeDisk = execSync("df -h / | awk 'NR==2{print $4}'", { encoding: "utf8" }).trim();
    } catch {}
    let pagesUrl = "";
    try { pagesUrl = fs.readFileSync("/tmp/pages_url.txt", "utf8").trim(); } catch {}
    const tunnels = [];
    for (const [port, info] of previewTunnels.entries()) {
      if (info.url && info.proc && info.proc.exitCode === null) tunnels.push({ port, url: info.url });
    }
    const cfg = readGlobalConfig();
    const customProviders = Object.entries(cfg.provider || {}).map(([id, val]) => ({
      id,
      name: (val && val.name) || id,
      models: Object.entries((val && val.models) || {}).map(([mid, mm]) => ({
        id: mid,
        effort: (mm && mm.options && mm.options.reasoningEffort) || "",
      })),
    }));
    const pMeta = getPersistenceMeta();
    return sendJson(res, 200, {
      ocVersion: cachedOcVersion,
      maxUploadMB: Math.max(1, Number(process.env.MAX_UPLOAD_MB || 200)),
      remainingMin,
      totalMemGB,
      usedMemGB,
      freeDisk,
      pagesUrl,
      projectCount: pMeta.worktrees.length || 1,
      sessionCount: pMeta.sessionCount || 0,
      customProviders,
      activePorts: detectActivePorts(),
      tunnels,
      artifacts: scanArtifacts(WORKSPACE),
    });
  }

  if (url.pathname === "/__api/preview" && req.method === "POST") {
    try {
      const body = JSON.parse((await readBody(req)) || "{}");
      const pUrl = await startPortPreviewTunnel(body.port);
      return sendJson(res, 200, { url: pUrl });
    } catch (e) {
      return sendJson(res, 500, { error: e.message });
    }
  }

  if (url.pathname === "/__api/save" && req.method === "POST") {
    try {
      execFileSync(path.join(HOME_DIR, ".local/bin/oc-save"), ["chore: manual save dari Cloud Panel"], {
        env: { ...process.env, FINAL_PW: PASSWORD, WORKSPACE_DIR: WORKSPACE },
        timeout: 45000,
      });
      return sendJson(res, 200, { message: "✅ Berhasil! Semua kode & riwayat chat sudah tersimpan ke GitHub." });
    } catch (e) {
      return sendJson(res, 500, { message: "❌ Gagal save: " + e.message });
    }
  }

  if (url.pathname === "/__api/restart" && req.method === "POST") {
    try {
      if (OC_VER === "v1") {
        execSync('pkill -TERM -f "opencode web" || true');
      } else {
        const ocBin = path.join(HOME_DIR, ".local/bin/opencode");
        execFileSync(ocBin, ["service", "stop"], { env: { ...process.env, HOME: HOME_DIR }, timeout: 10000 });
        execFileSync(ocBin, ["service", "start"], { cwd: WORKSPACE, env: { ...process.env, HOME: HOME_DIR }, timeout: 10000 });
      }
      return sendJson(res, 200, { message: "✅ Mesin OpenCode di-restart! Klik tombol 'Hubungkan Ulang Sesi Web' di sebelah kanan untuk masuk kembali." });
    } catch (e) {
      return sendJson(res, 500, { message: "❌ Gagal restart: " + e.message });
    }
  }

  if (url.pathname === "/__api/zip") {
    const zipFile = `/tmp/project-${Date.now()}.zip`;
    try {
      execFileSync("zip", ["-rq", zipFile, ".", "-x", ".git/*", "node_modules/*", ".gradle/*", ".opencode-backup.enc"], {
        cwd: WORKSPACE,
        timeout: 60000,
      });
      const st = fs.statSync(zipFile);
      res.writeHead(200, {
        "content-type": "application/zip",
        "content-length": st.size,
        "content-disposition": 'attachment; filename="opencode-project.zip"',
      });
      const stream = fs.createReadStream(zipFile);
      stream.pipe(res);
      stream.on("close", () => fs.unlink(zipFile, () => {}));
      return;
    } catch (e) {
      return sendJson(res, 500, { error: "Gagal membuat ZIP: " + e.message });
    }
  }

  if (url.pathname === "/__api/download") {
    const rel = url.searchParams.get("path") || "";
    const target = path.resolve(WORKSPACE, rel);
    if (!target.startsWith(path.resolve(WORKSPACE) + path.sep) || !fs.existsSync(target)) {
      return sendJson(res, 404, { error: "File tidak ditemukan" });
    }
    const st = fs.statSync(target);
    if (st.isDirectory()) return sendJson(res, 400, { error: "Ini folder, bukan file." });
    const inline = url.searchParams.get("inline") === "1";
    const ext = path.extname(target).slice(1).toLowerCase();
    res.writeHead(200, {
      "content-type": inline ? MIME_BY_EXT[ext] || "application/octet-stream" : "application/octet-stream",
      "content-length": st.size,
      "cache-control": "no-store",
      ...(inline ? {} : { "content-disposition": `attachment; filename="${path.basename(target)}"` }),
    });
    return fs.createReadStream(target).pipe(res);
  }

  // Upload file mentah (drag & drop dari Cloud Panel) langsung ke workspace
  if (url.pathname === "/__api/upload" && req.method === "POST") {
    let rawName = String(req.headers["x-file-name"] || url.searchParams.get("name") || "");
    try { rawName = decodeURIComponent(rawName); } catch {}
    const fileName = path.basename(rawName.replace(/\\/g, "/")).replace(/[\u0000-\u001f]/g, "").trim();
    if (!fileName || fileName === "." || fileName === "..") {
      return sendJson(res, 400, { error: "Nama file tidak valid." });
    }
    const rootDir = path.resolve(WORKSPACE);
    const relDir = (url.searchParams.get("dir") || "").replace(/\\/g, "/").replace(/^\/+|\/+$/g, "").trim();
    const targetDir = path.resolve(rootDir, relDir);
    if (targetDir !== rootDir && !targetDir.startsWith(rootDir + path.sep)) {
      return sendJson(res, 400, { error: "Folder tujuan harus di dalam workspace." });
    }
    if (path.relative(rootDir, targetDir).split(path.sep)[0] === ".git") {
      return sendJson(res, 403, { error: "Folder .git tidak boleh diubah lewat upload." });
    }
    const target = path.join(targetDir, fileName);
    if (fs.existsSync(target) && url.searchParams.get("overwrite") !== "1") {
      return sendJson(res, 409, { error: "File sudah ada: " + path.relative(rootDir, target) });
    }
    const maxBytes = Math.max(1, Number(process.env.MAX_UPLOAD_MB || 200)) * 1024 * 1024;
    try {
      fs.mkdirSync(targetDir, { recursive: true });
    } catch (e) {
      return sendJson(res, 500, { error: "Gagal membuat folder: " + e.message });
    }
    const tmpPath = path.join(targetDir, ".oc-upload-" + Date.now() + "-" + crypto.randomBytes(4).toString("hex") + ".part");
    let received = 0;
    const limiter = new Transform({
      transform(chunk, _enc, cb) {
        received += chunk.length;
        if (received > maxBytes) return cb(new Error("Ukuran file melebihi batas " + Math.round(maxBytes / 1048576) + " MB"));
        cb(null, chunk);
      },
    });
    try {
      await pipeline(req, limiter, fs.createWriteStream(tmpPath));
      fs.renameSync(tmpPath, target);
      const rel = path.relative(rootDir, target).split(path.sep).join("/");
      return sendJson(res, 200, {
        ok: true,
        path: rel,
        size: received,
        downloadUrl: "/__api/download?path=" + encodeURIComponent(rel),
      });
    } catch (e) {
      try { fs.unlinkSync(tmpPath); } catch {}
      return sendJson(res, received > maxBytes ? 413 : 500, { error: "Upload gagal: " + e.message });
    }
  }

  // ---------- File Manager: list, baca, simpan, rename/hapus/mkdir ----------
  if (url.pathname === "/__api/files" && req.method === "GET") {
    try {
      const { target, rel } = resolveWorkspacePath(url.searchParams.get("path") || "");
      const st = fs.statSync(target);
      if (!st.isDirectory()) return sendJson(res, 400, { error: "Bukan folder." });
      const entries = [];
      for (const e of fs.readdirSync(target, { withFileTypes: true })) {
        if (e.name === ".git") continue;
        const full = path.join(target, e.name);
        let s = null;
        try { s = fs.statSync(full); } catch {}
        entries.push({
          name: e.name,
          type: e.isDirectory() ? "dir" : e.isSymbolicLink() ? "link" : "file",
          size: s ? s.size : 0,
          mtime: s ? s.mtimeMs : 0,
          ext: path.extname(e.name).slice(1).toLowerCase(),
        });
      }
      entries.sort((a, b) => (a.type === b.type ? a.name.localeCompare(b.name) : a.type === "dir" ? -1 : 1));
      const parent = rel === "" ? null : rel.includes("/") ? rel.slice(0, rel.lastIndexOf("/")) : "";
      return sendJson(res, 200, { ok: true, path: rel, parent, entries, maxEditKB: MAX_EDIT_KB });
    } catch (e) {
      return sendJson(res, e.code === "ENOENT" ? 404 : 400, { error: e.message });
    }
  }

  if (url.pathname === "/__api/file" && req.method === "GET") {
    try {
      const { target, rel } = resolveWorkspacePath(url.searchParams.get("path") || "");
      const st = fs.statSync(target);
      if (st.isDirectory()) return sendJson(res, 400, { error: "Ini sebuah folder." });
      if (st.size > MAX_EDIT_KB * 1024) {
        return sendJson(res, 413, { error: "File terlalu besar untuk editor (maks " + MAX_EDIT_KB + " KB). Pakai tombol ⬇️ Download." });
      }
      const buf = fs.readFileSync(target);
      if (buf.includes(0)) return sendJson(res, 200, { ok: true, path: rel, binary: true, size: st.size, ext: path.extname(rel).slice(1).toLowerCase() });
      return sendJson(res, 200, { ok: true, path: rel, content: buf.toString("utf8"), size: st.size, ext: path.extname(rel).slice(1).toLowerCase() });
    } catch (e) {
      return sendJson(res, e.code === "ENOENT" ? 404 : 400, { error: e.message });
    }
  }

  if (url.pathname === "/__api/file" && req.method === "POST") {
    try {
      const body = JSON.parse((await readBody(req, 3 * 1024 * 1024)) || "{}");
      const content = String(body.content == null ? "" : body.content);
      const { target, rel } = resolveWorkspacePath(body.path || "");
      if (isProtectedPath(rel)) return sendJson(res, 403, { error: "File di .github/.git tidak bisa diedit dari panel." });
      if (Buffer.byteLength(content) > MAX_EDIT_KB * 1024) return sendJson(res, 413, { error: "Isi file melebihi batas " + MAX_EDIT_KB + " KB." });
      let isLink = false;
      try { isLink = fs.lstatSync(target).isSymbolicLink(); } catch {}
      if (isLink) return sendJson(res, 403, { error: "File symlink tidak bisa diedit." });
      fs.mkdirSync(path.dirname(target), { recursive: true });
      const tmpPath = target + ".oc-edit-" + Date.now() + ".tmp";
      fs.writeFileSync(tmpPath, content, "utf8");
      fs.renameSync(tmpPath, target);
      return sendJson(res, 200, { ok: true, path: rel, size: Buffer.byteLength(content) });
    } catch (e) {
      return sendJson(res, 400, { error: "Gagal menyimpan: " + e.message });
    }
  }

  if (url.pathname === "/__api/fs" && req.method === "POST") {
    try {
      const body = JSON.parse((await readBody(req, 262144)) || "{}");
      const op = String(body.op || "");
      const src = resolveWorkspacePath(body.path || "");
      if (isProtectedPath(src.rel)) return sendJson(res, 403, { error: "Path .github/.git dilindungi." });
      if (op === "mkdir") {
        if (!src.rel) return sendJson(res, 400, { error: "Nama folder kosong." });
        fs.mkdirSync(src.target, { recursive: false });
        return sendJson(res, 200, { ok: true, path: src.rel });
      }
      if (op === "delete") {
        if (!src.rel) return sendJson(res, 400, { error: "Folder root tidak bisa dihapus." });
        if (src.rel.split("/")[0] === ".pages") return sendJson(res, 403, { error: "Folder .pages dilindungi (aset dashboard)." });
        fs.rmSync(src.target, { recursive: true, force: false });
        return sendJson(res, 200, { ok: true });
      }
      if (op === "rename" || op === "copy") {
        const dest = resolveWorkspacePath(body.to || "");
        if (!dest.rel || isProtectedPath(dest.rel)) return sendJson(res, 403, { error: "Tujuan tidak diizinkan." });
        if (fs.existsSync(dest.target)) return sendJson(res, 409, { error: "Tujuan sudah ada: " + dest.rel });
        fs.mkdirSync(path.dirname(dest.target), { recursive: true });
        if (op === "rename") fs.renameSync(src.target, dest.target);
        else fs.cpSync(src.target, dest.target, { recursive: true, errorOnExist: true });
        return sendJson(res, 200, { ok: true, path: dest.rel });
      }
      return sendJson(res, 400, { error: "Operasi tidak dikenal." });
    } catch (e) {
      return sendJson(res, 400, { error: e.message });
    }
  }

  const prevMatch = url.pathname.match(/^\/preview\/(\d+)(\/.*)?$/);
  if (prevMatch) {
    const appPort = Number(prevMatch[1]);
    const subPath = (prevMatch[2] || "/") + url.search;
    const pReq = http.request(
      {
        hostname: "127.0.0.1",
        port: appPort,
        path: subPath,
        method: req.method,
        headers: { ...req.headers, host: `127.0.0.1:${appPort}` },
      },
      (pRes) => {
        res.writeHead(pRes.statusCode || 200, pRes.headers);
        pRes.pipe(res);
      }
    );
    pReq.on("error", () => {
      res.writeHead(502, { "content-type": "text/plain; charset=utf-8" });
      res.end(`Belum ada web server aktif di port ${appPort}. Suruh OpenCode menyalakan server di port ${appPort} terlebih dahulu.`);
    });
    return req.pipe(pReq);
  }

  // Patch otomatis bundle JS OpenCode v2 agar fitur Custom OpenAI-Compatible Provider & Disconnect berfungsi penuh!
  if (
    OC_VER !== "v1" &&
    req.method === "GET" &&
    (url.pathname.startsWith("/_assets/") || url.pathname.startsWith("/assets/")) &&
    url.pathname.endsWith(".js")
  ) {
    const jsHeaders = {
      ...req.headers,
      host: `127.0.0.1:${targetPort}`,
      origin: `http://127.0.0.1:${targetPort}`,
    };
    delete jsHeaders["accept-encoding"];
    delete jsHeaders["if-none-match"];
    const jsReq = http.request(
      { hostname: "127.0.0.1", port: targetPort, path: req.url, method: "GET", headers: jsHeaders },
      (jsRes) => {
        const chunks = [];
        jsRes.on("data", (c) => chunks.push(c));
        jsRes.on("end", () => {
          let code = Buffer.concat(chunks).toString("utf8");
          let patched = false;
          if (code.includes("provider.custom.unavailable")) {
            const next = code.replace(
              /throw\s+(?:new\s+)?Error\(([A-Za-z0-9_$]+)\.t\([`"']provider\.custom\.unavailable[`"']\)\)/g,
              'return await fetch("/__api/custom-provider",{method:"POST",headers:{"content-type":"application/json"},body:JSON.stringify(e)}).then(async _r=>{const _d=await _r.json();if(!_r.ok)throw Error(_d.error||"Gagal menyimpan penyedia kustom");setTimeout(()=>location.reload(),500);return e})'
            );
            if (next !== code) {
              code = next;
              patched = true;
            }
          }
          if (code.includes("provider.disconnect.toast.noCredentials.description")) {
            const next = code.replace(
              /if\(([A-Za-z0-9_$]+)\.length===0\)\{([A-Za-z0-9_$]+)\(\{title:([A-Za-z0-9_$]+)\.t\([`"']common\.requestFailed[`"']\),description:\3\.t\([`"']provider\.disconnect\.toast\.noCredentials\.description[`"'],\{provider:([A-Za-z0-9_$]+)\}\)\}\);return\}/g,
              'if($1.length===0){await fetch("/__api/custom-provider?id="+encodeURIComponent(o[0]),{method:"DELETE"});$2({variant:"success",icon:"circle-check",title:$3.t("provider.disconnect.toast.disconnected.title",{provider:$4}),description:$3.t("provider.disconnect.toast.disconnected.description",{provider:$4})});setTimeout(()=>location.reload(),500);return}'
            );
            if (next !== code) {
              code = next;
              patched = true;
            }
          }
          const outHeaders = { ...jsRes.headers };
          delete outHeaders["access-control-allow-origin"];
          if (patched) {
            delete outHeaders["content-length"];
            delete outHeaders["etag"];
            outHeaders["cache-control"] = "no-store";
          }
          res.writeHead(jsRes.statusCode || 200, outHeaders);
          res.end(code);
        });
      }
    );
    jsReq.on("error", () => {
      if (!res.headersSent) res.writeHead(502);
      res.end();
    });
    return jsReq.end();
  }

  // Semua navigasi halaman HTML (/, /new-session, /session/..., F5 reload) -> auto-pair + injeksi <head> widget & SSE WS bridge!
  const acceptHdr = String(req.headers.accept || "");
  const isHtmlNav =
    req.method === "GET" &&
    acceptHdr.includes("text/html") &&
    !url.pathname.startsWith("/auth/") &&
    !url.pathname.startsWith("/api/") &&
    !url.pathname.startsWith("/_assets/") &&
    !url.pathname.startsWith("/assets/");

  if (isHtmlNav) {
    const cookies = parseCookies(req.headers.cookie || "");
    const svc = getUpstreamService();
    if (OC_VER !== "v1" && (!cookies[`opencode_session_${targetPort}`] || cookies.oc_svc_id !== svc.id)) {
      const pairPath = getV2PairPath();
      if (pairPath !== "/") {
        res.writeHead(302, {
          "Set-Cookie": `oc_svc_id=${svc.id}; Path=/; HttpOnly; Max-Age=2592000; SameSite=Lax`,
          "Location": pairPath,
          "cache-control": "no-store",
        });
        return res.end();
      }
    }

    // Jika tab HP/browser di-reload saat masih di draft kosong (?draftId=...), arahkan balik ke / agar draft segar dibuat otomatis
    if (url.pathname === "/new-session" && url.searchParams.has("draftId")) {
      res.writeHead(302, { "Location": "/", "cache-control": "no-store" });
      return res.end();
    }

    const cleanHeaders = {
      ...req.headers,
      host: `127.0.0.1:${targetPort}`,
      origin: `http://127.0.0.1:${targetPort}`,
    };
    delete cleanHeaders["accept-encoding"];
    const proxyReq = http.request(
      { hostname: "127.0.0.1", port: targetPort, path: req.url, method: "GET", headers: cleanHeaders },
      (proxyRes) => {
        const ct = String(proxyRes.headers["content-type"] || "");
        const outHeaders = { ...proxyRes.headers };
        delete outHeaders["access-control-allow-origin"];
        if (!ct.includes("text/html")) {
          res.writeHead(proxyRes.statusCode || 200, outHeaders);
          return proxyRes.pipe(res);
        }
        const chunks = [];
        proxyRes.on("data", (c) => chunks.push(c));
        proxyRes.on("end", () => {
          let html = Buffer.concat(chunks).toString("utf8");
          if (html.includes("<head>")) {
            html = html.replace("<head>", '<head><script src="/__oc_widget.js"></script>');
          } else if (html.includes("</body>")) {
            html = html.replace("</body>", '<script src="/__oc_widget.js"></script></body>');
          }
          delete outHeaders["content-length"];
          res.writeHead(proxyRes.statusCode || 200, outHeaders);
          res.end(html);
        });
      }
    );
    proxyReq.on("error", (err) => {
      res.writeHead(502, { "content-type": "text/plain" });
      res.end("OpenCode sedang menyala: " + err.message);
    });
    return proxyReq.end();
  }

  const upHeaders = {
    ...req.headers,
    host: `127.0.0.1:${targetPort}`,
    origin: `http://127.0.0.1:${targetPort}`,
  };
  const proxyReq = http.request(
    {
      hostname: "127.0.0.1",
      port: targetPort,
      path: req.url,
      method: req.method,
      headers: upHeaders,
    },
    (proxyRes) => {
      const outHeaders = { ...proxyRes.headers };
      delete outHeaders["access-control-allow-origin"];
      res.writeHead(proxyRes.statusCode || 200, outHeaders);
      proxyRes.pipe(res);
    }
  );
  proxyReq.on("error", (err) => {
    if (!res.headersSent) res.writeHead(502, { "content-type": "text/plain" });
    res.end("OpenCode sedang menyala: " + err.message);
  });
  req.pipe(proxyReq);
});

server.on("upgrade", (req, socket, head) => {
  if (!isAuthed(req)) {
    socket.write("HTTP/1.1 401 Unauthorized\r\n\r\n");
    socket.destroy();
    return;
  }
  const targetPort = getUpstreamPort();
  const upUrl = new URL(req.url || "/", "http://localhost");

  // Endpoint WebSocket khusus untuk streaming SSE real-time tanpa buffering Cloudflare Quick Tunnel!
  if (upUrl.pathname === "/__oc_sse_ws") {
    const wsKey = req.headers["sec-websocket-key"];
    const ssePath = upUrl.searchParams.get("path") || "/api/event";
    if (!wsKey || !ssePath.startsWith("/")) {
      socket.destroy();
      return;
    }
    const acceptKey = crypto
      .createHash("sha1")
      .update(wsKey + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")
      .digest("base64");
    socket.write(
      "HTTP/1.1 101 Switching Protocols\r\n" +
      "Upgrade: websocket\r\n" +
      "Connection: Upgrade\r\n" +
      `Sec-WebSocket-Accept: ${acceptKey}\r\n\r\n`
    );
    const sseHeaders = {
      cookie: req.headers.cookie || "",
      accept: "text/event-stream",
      host: `127.0.0.1:${targetPort}`,
      origin: `http://127.0.0.1:${targetPort}`,
    };
    const upstreamReq = http.request(
      { hostname: "127.0.0.1", port: targetPort, path: ssePath, method: "GET", headers: sseHeaders },
      (upstreamRes) => {
        sendWsBinary(socket, Buffer.from(": connected\n\n", "utf8"));
        upstreamRes.on("data", (chunk) => sendWsBinary(socket, Buffer.from(chunk)));
        upstreamRes.on("end", () => { try { socket.end(); } catch {} });
        upstreamRes.on("error", () => { try { socket.destroy(); } catch {} });
      }
    );
    upstreamReq.on("error", () => { try { socket.destroy(); } catch {} });
    upstreamReq.end();
    socket.on("data", (frame) => {
      if (frame.length >= 1) {
        const op = frame[0] & 0x0f;
        if (op === 0x08) {
          upstreamReq.destroy();
          try { socket.end(); } catch {}
        } else if (op === 0x09 && !socket.destroyed) {
          socket.write(Buffer.from([0x8a, 0x00]));
        }
      }
    });
    socket.on("close", () => upstreamReq.destroy());
    socket.on("error", () => upstreamReq.destroy());
    return;
  }

  const upstream = net.connect(targetPort, "127.0.0.1", () => {
    let raw = `${req.method} ${req.url} HTTP/${req.httpVersion}\r\n`;
    for (let i = 0; i < req.rawHeaders.length; i += 2) {
      const k = req.rawHeaders[i];
      const kl = k.toLowerCase();
      const v =
        kl === "host"
          ? `127.0.0.1:${targetPort}`
          : kl === "origin"
          ? `http://127.0.0.1:${targetPort}`
          : req.rawHeaders[i + 1];
      raw += `${k}: ${v}\r\n`;
    }
    raw += "\r\n";
    upstream.write(raw);
    if (head && head.length) upstream.write(head);
    socket.pipe(upstream).pipe(socket);
  });
  upstream.on("error", () => socket.destroy());
  socket.on("error", () => upstream.destroy());
});

server.listen(LISTEN_PORT, "127.0.0.1");
