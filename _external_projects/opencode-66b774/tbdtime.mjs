// apakah dtime/ts_sl/ts_size bisa dinego lewat /share/streaming?
import crypto from "node:crypto";
const UA="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
const KEY="iuuPc64E4Fhn0rTXEzrnbLph0o5qyEEa";
const surl="LA0Jq-HW5Fcv-8Q2FNC1ng", fid=process.argv[2]||"178525394818666", HOST="https://www.terabox.com";
const cookies=new Map();
const jar=r=>{for(const c of r.headers.getSetCookie?.()||[]){const[kv]=c.split(";");const i=kv.indexOf("=");if(i>0)cookies.set(kv.slice(0,i).trim(),kv.slice(i+1).trim());}};
const q=o=>Object.entries(o).filter(([,v])=>v!==""&&v!=null).map(([k,v])=>`${k}=${encodeURIComponent(v)}`).join("&");
const p=await fetch(`${HOST}/sharing/link?surl=${surl}`,{headers:{"user-agent":UA,accept:"text/html"},signal:AbortSignal.timeout(30000)});
jar(p);
const html=await p.text();
const jsToken=((html.match(/fn%28%22([0-9a-fA-F]{40,400})%22%29/)||[])[1])||"";
const shareid=(html.match(/"(?:shareid|share_id)"?:"?(\d{6,20})/)||[])[1];
const uk=(html.match(/"uk"?:"?(\d{6,20})/)||[])[1];
const H={"user-agent":UA,accept:"*/*",referer:`${HOST}/sharing/link?surl=${surl}`,origin:HOST,cookie:[...cookies].map(([k,v])=>`${k}=${v}`).join("; ")};
for (const extra of [{}, {dtime:30}, {dtime:60}, {ts_size:8000000}, {ts_sl:1}, {ts_sl:2}, {csl:1}, {hit_sl:1}, {start_ply:0,sta_cs:1}, {tot:""}, {xv:5}]) {
  const t=Math.floor(Date.now()/1000);
  const sg=crypto.createHmac("sha256",KEY).update(`0dubox${cookies.get("browserid")||""}${t}`).digest("hex");
  const r=await fetch(`${HOST}/share/streaming?${q({uk,shareid,type:"M3U8_AUTO_360",fid,sign:sg,timestamp:t,jsToken,esl:1,isplayer:1,ehps:1,clienttype:0,app_id:250528,web:1,channel:"dubox",...extra})}`,{headers:H,signal:AbortSignal.timeout(25000)});
  const tx=await r.text();
  const segs=tx.split("\n").filter(s=>s&&!s.startsWith("#"));
  const u=segs.length?new URL(segs[0]):null;
  const j=(()=>{try{return JSON.parse(tx)}catch{return null}})();
  console.log(`  ${JSON.stringify(extra).padEnd(26)} ${segs.length?`${segs.length} seg, len=${u.searchParams.get("len")}, dtime=${u.searchParams.get("dtime")}, ts_size=${u.searchParams.get("ts_size")}`:"errno="+(j&&j.errno)}`);
}
