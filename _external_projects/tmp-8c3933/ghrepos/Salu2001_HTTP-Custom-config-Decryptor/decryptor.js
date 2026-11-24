/**
 * HTTP Custom config Decryptor - Pure Node.js Core
 */

'use strict';

// ============== Crypto Primitives ==============

function ChaCha20(keyBytes, nonceBytes) {
  const state = new Uint32Array(16);
  const viewKey = new DataView(keyBytes.buffer, keyBytes.byteOffset, 32);
  state[0] = 0x61707865; state[1] = 0x3320646e;
  state[2] = 0x79622d32; state[3] = 0x6b206574;
  for (let i = 0; i < 8; i++) state[4 + i] = viewKey.getUint32(i * 4, true);
  const viewNonce = new DataView(nonceBytes.buffer, nonceBytes.byteOffset, 8);
  state[14] = viewNonce.getUint32(0, true);
  state[15] = viewNonce.getUint32(4, true);

  function rotl(v, n) { return ((v << n) | (v >>> (32 - n))) >>> 0; }
  function quarterround(x, a, b, c, d) {
    x[a] = (x[a] + x[b]) >>> 0; x[d] = rotl(x[d] ^ x[a], 16);
    x[c] = (x[c] + x[d]) >>> 0; x[b] = rotl(x[b] ^ x[c], 12);
    x[a] = (x[a] + x[b]) >>> 0; x[d] = rotl(x[d] ^ x[a], 8);
    x[c] = (x[c] + x[d]) >>> 0; x[b] = rotl(x[b] ^ x[c], 7);
  }

  function generateBlock(counter) {
    const working = new Uint32Array(16);
    working.set(state);
    working[12] = counter >>> 0;
    working[13] = Math.floor(counter / 0x100000000) >>> 0;
    for (let i = 0; i < 10; i++) {
      quarterround(working, 0, 4, 8, 12);
      quarterround(working, 1, 5, 9, 13);
      quarterround(working, 2, 6, 10, 14);
      quarterround(working, 3, 7, 11, 15);
      quarterround(working, 0, 5, 10, 15);
      quarterround(working, 1, 6, 11, 12);
      quarterround(working, 2, 7, 8, 13);
      quarterround(working, 3, 4, 9, 14);
    }
    const out = Buffer.alloc(64);
    for (let i = 0; i < 16; i++) {
      out.writeUInt32LE((working[i] + state[i]) >>> 0, i * 4);
    }
    return out;
  }

  let counter = 1; // seek(64)
  let buffer = null;
  let bufPos = 64;

  this.decrypt = function (data) {
    const input = Buffer.isBuffer(data) ? data : Buffer.from(data);
    const output = Buffer.alloc(input.length);
    for (let i = 0; i < input.length; i++) {
      if (bufPos >= 64) {
        buffer = generateBlock(counter++);
        bufPos = 0;
      }
      output[i] = input[i] ^ buffer[bufPos++];
    }
    return output;
  };
}

// AES-128 ECB + PKCS7
const AES_SBOX = Buffer.from([
  0x63,0x7c,0x77,0x7b,0xf2,0x6b,0x6f,0xc5,0x30,0x01,0x67,0x2b,0xfe,0xd7,0xab,0x76,
  0xca,0x82,0xc9,0x7d,0xfa,0x59,0x47,0xf0,0xad,0xd4,0xa2,0xaf,0x9c,0xa4,0x72,0xc0,
  0xb7,0xfd,0x93,0x26,0x36,0x3f,0xf7,0xcc,0x34,0xa5,0xe5,0xf1,0x71,0xd8,0x31,0x15,
  0x04,0xc7,0x23,0xc3,0x18,0x96,0x05,0x9a,0x07,0x12,0x80,0xe2,0xeb,0x27,0xb2,0x75,
  0x09,0x83,0x2c,0x1a,0x1b,0x6e,0x5a,0xa0,0x52,0x3b,0xd6,0xb3,0x29,0xe3,0x2f,0x84,
  0x53,0xd1,0x00,0xed,0x20,0xfc,0xb1,0x5b,0x6a,0xcb,0xbe,0x39,0x4a,0x4c,0x58,0xcf,
  0xd0,0xef,0xaa,0xfb,0x43,0x4d,0x33,0x85,0x45,0xf9,0x02,0x7f,0x50,0x3c,0x9f,0xa8,
  0x51,0xa3,0x40,0x8f,0x92,0x9d,0x38,0xf5,0xbc,0xb6,0xda,0x21,0x10,0xff,0xf3,0xd2,
  0xcd,0x0c,0x13,0xec,0x5f,0x97,0x44,0x17,0xc4,0xa7,0x7e,0x3d,0x64,0x5d,0x19,0x73,
  0x60,0x81,0x4f,0xdc,0x22,0x2a,0x90,0x88,0x46,0xee,0xb8,0x14,0xde,0x5e,0x0b,0xdb,
  0xe0,0x32,0x3a,0x0a,0x49,0x06,0x24,0x5c,0xc2,0xd3,0xac,0x62,0x91,0x95,0xe4,0x79,
  0xe7,0xc8,0x37,0x6d,0x8d,0xd5,0x4e,0xa9,0x6c,0x56,0xf4,0xea,0x65,0x7a,0xae,0x08,
  0xba,0x78,0x25,0x2e,0x1c,0xa6,0xb4,0xc6,0xe8,0xdd,0x74,0x1f,0x4b,0xbd,0x8b,0x8a,
  0x70,0x3e,0xb5,0x66,0x48,0x03,0xf6,0x0e,0x61,0x35,0x57,0xb9,0x86,0xc1,0x1d,0x9e,
  0xe1,0xf8,0x98,0x11,0x69,0xd9,0x8e,0x94,0x9b,0x1e,0x87,0xe9,0xce,0x55,0x28,0xdf,
  0x8c,0xa1,0x89,0x0d,0xbf,0xe6,0x42,0x68,0x41,0x99,0x2d,0x0f,0xb0,0x54,0xbb,0x16
]);

const AES_INV_SBOX = Buffer.from([
  0x52,0x09,0x6a,0xd5,0x30,0x36,0xa5,0x38,0xbf,0x40,0xa3,0x9e,0x81,0xf3,0xd7,0xfb,
  0x7c,0xe3,0x39,0x82,0x9b,0x2f,0xff,0x87,0x34,0x8e,0x43,0x44,0xc4,0xde,0xe9,0xcb,
  0x54,0x7b,0x94,0x32,0xa6,0xc2,0x23,0x3d,0xee,0x4c,0x95,0x0b,0x42,0xfa,0xc3,0x4e,
  0x08,0x2e,0xa1,0x66,0x28,0xd9,0x24,0xb2,0x76,0x5b,0xa2,0x49,0x6d,0x8b,0xd1,0x25,
  0x72,0xf8,0xf6,0x64,0x86,0x68,0x98,0x16,0xd4,0xa4,0x5c,0xcc,0x5d,0x65,0xb6,0x92,
  0x6c,0x70,0x48,0x50,0xfd,0xed,0xb9,0xda,0x5e,0x15,0x46,0x57,0xa7,0x8d,0x9d,0x84,
  0x90,0xd8,0xab,0x00,0x8c,0xbc,0xd3,0x0a,0xf7,0xe4,0x58,0x05,0xb8,0xb3,0x45,0x06,
  0xd0,0x2c,0x1e,0x8f,0xca,0x3f,0x0f,0x02,0xc1,0xaf,0xbd,0x03,0x01,0x13,0x8a,0x6b,
  0x3a,0x91,0x11,0x41,0x4f,0x67,0xdc,0xea,0x97,0xf2,0xcf,0xce,0xf0,0xb4,0xe6,0x73,
  0x96,0xac,0x74,0x22,0xe7,0xad,0x35,0x85,0xe2,0xf9,0x37,0xe8,0x1c,0x75,0xdf,0x6e,
  0x47,0xf1,0x1a,0x71,0x1d,0x29,0xc5,0x89,0x6f,0xb7,0x62,0x0e,0xaa,0x18,0xbe,0x1b,
  0xfc,0x56,0x3e,0x4b,0xc6,0xd2,0x79,0x20,0x9a,0xdb,0xc0,0xfe,0x78,0xcd,0x5a,0xf4,
  0x1f,0xdd,0xa8,0x33,0x88,0x07,0xc7,0x31,0xb1,0x12,0x10,0x59,0x27,0x80,0xec,0x5f,
  0x60,0x51,0x7f,0xa9,0x19,0xb5,0x4a,0x0d,0x2d,0xe5,0x7a,0x9f,0x93,0xc9,0x9c,0xef,
  0xa0,0xe0,0x3b,0x4d,0xae,0x2a,0xf5,0xb0,0xc8,0xeb,0xbb,0x3c,0x83,0x53,0x99,0x61,
  0x17,0x2b,0x04,0x7e,0xba,0x77,0xd6,0x26,0xe1,0x69,0x14,0x63,0x55,0x21,0x0c,0x7d
]);

const AES_RCON = [0x00,0x01,0x02,0x04,0x08,0x10,0x20,0x40,0x80,0x1b,0x36];

function aesSubWord(w) {
  return ((AES_SBOX[(w >>> 24) & 0xff] << 24) |
          (AES_SBOX[(w >>> 16) & 0xff] << 16) |
          (AES_SBOX[(w >>> 8) & 0xff] << 8) |
          AES_SBOX[w & 0xff]) >>> 0;
}
function aesRotWord(w) { return ((w << 8) | (w >>> 24)) >>> 0; }

function aesExpandKey(key) {
  const w = new Uint32Array(44);
  for (let i = 0; i < 4; i++) {
    w[i] = key.readUInt32BE(i * 4);
  }
  for (let i = 4; i < 44; i++) {
    let temp = w[i - 1];
    if (i % 4 === 0) {
      temp = (aesSubWord(aesRotWord(temp)) ^ (AES_RCON[i / 4] << 24)) >>> 0;
    }
    w[i] = (w[i - 4] ^ temp) >>> 0;
  }
  return w;
}

function invMixColumns(s) {
  function mul(a, b) {
    let p = 0;
    for (let i = 0; i < 8; i++) {
      if (b & 1) p ^= a;
      const hi = a & 0x80;
      a = (a << 1) & 0xff;
      if (hi) a ^= 0x1b;
      b >>= 1;
    }
    return p;
  }
  for (let c = 0; c < 4; c++) {
    const i = c * 4;
    const a0 = s[i], a1 = s[i+1], a2 = s[i+2], a3 = s[i+3];
    s[i]   = mul(a0,0x0e) ^ mul(a1,0x0b) ^ mul(a2,0x0d) ^ mul(a3,0x09);
    s[i+1] = mul(a0,0x09) ^ mul(a1,0x0e) ^ mul(a2,0x0b) ^ mul(a3,0x0d);
    s[i+2] = mul(a0,0x0d) ^ mul(a1,0x09) ^ mul(a2,0x0e) ^ mul(a3,0x0b);
    s[i+3] = mul(a0,0x0b) ^ mul(a1,0x0d) ^ mul(a2,0x09) ^ mul(a3,0x0e);
  }
}

function aesDecryptBlock(state, roundKeys) {
  const s = Buffer.from(state);
  for (let i = 0; i < 16; i++) s[i] ^= (roundKeys[40 + (i >> 2)] >>> (24 - 8 * (i & 3))) & 0xff;

  for (let round = 9; round >= 1; round--) {
    let t = s[13]; s[13] = s[9]; s[9] = s[5]; s[5] = s[1]; s[1] = t;
    t = s[2]; s[2] = s[10]; s[10] = t; t = s[6]; s[6] = s[14]; s[14] = t;
    t = s[3]; s[3] = s[7]; s[7] = s[11]; s[11] = s[15]; s[15] = t;
    for (let i = 0; i < 16; i++) s[i] = AES_INV_SBOX[s[i]];
    for (let i = 0; i < 16; i++) s[i] ^= (roundKeys[round * 4 + (i >> 2)] >>> (24 - 8 * (i & 3))) & 0xff;
    invMixColumns(s);
  }
  let t = s[13]; s[13] = s[9]; s[9] = s[5]; s[5] = s[1]; s[1] = t;
  t = s[2]; s[2] = s[10]; s[10] = t; t = s[6]; s[6] = s[14]; s[14] = t;
  t = s[3]; s[3] = s[7]; s[7] = s[11]; s[11] = s[15]; s[15] = t;
  for (let i = 0; i < 16; i++) s[i] = AES_INV_SBOX[s[i]];
  for (let i = 0; i < 16; i++) s[i] ^= (roundKeys[i >> 2] >>> (24 - 8 * (i & 3))) & 0xff;
  s.copy(state);
}

function aesEcbDecrypt(ciphertext, key) {
  if (ciphertext.length % 16 !== 0) throw new Error('AES length not multiple of 16');
  const roundKeys = aesExpandKey(key);
  const out = Buffer.alloc(ciphertext.length);
  for (let i = 0; i < ciphertext.length; i += 16) {
    const block = Buffer.from(ciphertext.slice(i, i + 16));
    aesDecryptBlock(block, roundKeys);
    block.copy(out, i);
  }
  return out;
}

function pkcs7Unpad(data) {
  if (data.length === 0) throw new Error('empty');
  const pad = data[data.length - 1];
  if (pad < 1 || pad > 16) throw new Error('bad padding');
  for (let i = 0; i < pad; i++) {
    if (data[data.length - 1 - i] !== pad) throw new Error('bad padding');
  }
  return data.slice(0, data.length - pad);
}

// ============== Helpers ==============

function hexToBytes(hex) {
  hex = hex.replace(/[^0-9a-fA-F]/g, '');
  if (hex.length % 2) hex = '0' + hex;
  return Buffer.from(hex, 'hex');
}
function bytesToStr(buf) {
  return buf.toString('utf8');
}
function strToBytes(str) {
  return Buffer.from(str, 'utf8');
}
function isHex(s) {
  return s && s.length >= 16 && /^[0-9a-fA-F]+$/.test(s);
}
function isMostlyPrintable(s, strict = false) {
  if (!s) return false;
  if (s.length < 4) return true;
  let count = 0;
  for (let i = 0; i < s.length; i++) {
    const c = s.charCodeAt(i);
    if ((c >= 32 && c <= 126) || c === 9 || c === 10 || c === 13) count++;
  }
  return (count / s.length) > (strict ? 0.90 : 0.80);
}
function cleanHex(raw) {
  if (!raw) return '';
  let clean = raw.replace(/[^0-9a-fA-F]/g, '');
  return clean.length % 2 ? '0' + clean : clean;
}

// ============== Constants ==============

const CHACHA_KEYS = [
  hexToBytes('2be4342943c6f91ff58987f41a1aafd179eeb4e053f5cea55b11d6a7db58bd7d'),
  hexToBytes('3380aa278b744ba5b529a7f32fa803e48749280dae378345d9b526cf1dbce372'),
  hexToBytes('cea9305c95168b162a335b137c61983b8df54e6375da01136547890f14c5fac3'),
  hexToBytes('4beeace0e42bae8f29470cf40cf2dfacd5f4e1f751912bf52e803c8c85792193'),
  hexToBytes('f8e5f6ebea90558eb32229da24fd0fb7d813091dafe89bb2954fda33b4c60f63'),
  hexToBytes('81342f558a6273bac4548d473f54c4ffc7c41747dee81369acab9c787d41ab9c'),
  hexToBytes('45635e6fc70486e2fd10d3c2b4780f02d0b4c5f4aa929fc54f86bb8fa4417944'),
  hexToBytes('3d632a251c9820f2baf83e15498d27548fc67921cb437f8ce48505989378adea')
];

const RST_KEYS = [
  Buffer.from('JN1k3YHc2.6_v235'),
  Buffer.from('JN1k3YHc_2.7_v71'),
  Buffer.from('JN1k3YHc2.7.ps69'),
  Buffer.from('JN1k3YHc2.7.6950'),
  Buffer.from('Jn1K3yHc2.8.ps08'),
  Buffer.from('Jn1K3yHc2.9.ps6c'),
  Buffer.from('Zk:L7>WKaiK*s9>D'),
  Buffer.from('!<f!&WIlM**R.B0X'),
  Buffer.from('b4a5opinx2uloec6')
];

const JKL_KEY_OLD = Buffer.from([0xd5,0xd4,0xd3,0xd2,0xd1,0xd0,0xcf,0xce,0xcd,0xcc,0xbd,0xbc,0xbb,0xba,0xb9,0xb8,0xb7,0xb6,0xb5,0xb4]);
const JKL_KEY_NEW = Buffer.from([8,9,10,11,12,13,14,15,17,17,5,4,3,2,1,0,255,254,253,252]);

const TOKEN_MAP = {
  0:'payload',1:'proxy',2:'lockAllConfig',3:'blockedByRoot',
  4:'expiryTime',5:'noteEnabled',6:'notes',7:'sshField',
  8:'mobileDataAndLockProvider',9:'unlockUserAndPass',10:'ovpnConfig',
  11:'ovpnUserAndPass',12:'sni',13:'unlockUserAndPass2',
  14:'unknown14',15:'blockedByHwid',16:'cloudconfig',
  17:'psiphon',18:'name',19:'blockArea',
  20:'connectionMode',21:'blockedByPassword',22:'unknown22',
  23:'extraSniffer',24:'psiphon2',25:'v2rayEnabled',
  26:'v2rayConfig',27:'version',28:'slowdnsEnabled',
  29:'slowdnsServer',30:'slowdnsPublickey',31:'dnsResolver'
};

const BRAILLE_ALPHABET = '⠁⠃⠉⠙⠑⠋⠛⠓⠊⠚⠅⠇⠍⠝⠕⠏⠟⠗⠎⠞⠥⠧⠺⠭⠽⠵⠼⠁⠼⠃⠼⠉⠼⠙⠼⠑⠼⠋⠼⠛⠼⠓⠼⠊⠼⠚';
const STATIC_NONCE = Buffer.alloc(8, 0xdb);
const RST_XOR_KEY = Buffer.from(Array.from({length:20}, (_,i) => i+2));

// ============== Core Logic ==============

function extractZ3a(data, iv) {
  if (!data) return '';
  const newData = [];
  const re = /(-?\d+)\.(-?\d+)/g;
  let m;
  while ((m = re.exec(data)) !== null) {
    try {
      const val11 = parseInt(m[1], 10) - iv;
      const val22 = parseInt(m[2], 10) - iv;
      const divisor = 1 << val22;
      if (divisor !== 0) newData.push(((Math.floor(val11 / divisor) % 256) + 256) % 256);
    } catch (_) {}
  }
  return Buffer.from(newData).toString('utf8');
}

function decryptBraille(ciphertext) {
  try {
    const out = [];
    for (let i = 0; i < ciphertext.length - 1; i += 2) {
      const a = BRAILLE_ALPHABET.indexOf(ciphertext[i]);
      const b = BRAILLE_ALPHABET.indexOf(ciphertext[i + 1]);
      if (a < 0 || b < 0) return ciphertext;
      out.push((a * 16 + b) & 255);
    }
    return Buffer.from(out).toString('utf8');
  } catch (_) { return ciphertext; }
}

function processCredentials(rawVal, isSsh) {
  if (!rawVal) return rawVal;
  if (isSsh && BRAILLE_ALPHABET.includes(rawVal[0])) {
    rawVal = decryptBraille(rawVal);
  }
  const pattern = isSsh
    ? /^([\w\.-]+):([\d\-]+)@(.+):(.+)$/
    : /^([^:]+):(.+)$/;
  const match = rawVal.match(pattern);
  if (!match) return rawVal;
  const groups = match.slice(1);
  const uEnc = groups[groups.length - 2];
  const pEnc = groups[groups.length - 1];
  const uCount = (uEnc.match(/(-?\d+)\.(-?\d+)/g) || []).length;
  const pCount = (pEnc.match(/(-?\d+)\.(-?\d+)/g) || []).length;
  const uDec = extractZ3a(uEnc, uCount);
  const pDec = extractZ3a(pEnc, pCount);
  const finalUser = uDec || uEnc;
  const finalPass = pDec || pEnc;
  return isSsh
    ? `${groups[0]}:${groups[1]}@${finalUser}:${finalPass}`
    : `${finalUser}:${finalPass}`;
}

function abcDecrypt(rawInput, key, nonce = STATIC_NONCE) {
  if (!rawInput) return '';
  try {
    const data = hexToBytes(cleanHex(rawInput));
    if (data.length <= 16) return '';
    const cipher = new ChaCha20(key, nonce);
    const decrypted = cipher.decrypt(data.slice(0, data.length - 16));
    return bytesToStr(decrypted);
  } catch (_) { return ''; }
}

function rstDecrypt(encryptedStr) {
  try {
    const encBytes = Buffer.from(encryptedStr, 'utf8');
    const b64Bytes = Buffer.alloc(encBytes.length);
    for (let i = 0; i < encBytes.length; i++) {
      b64Bytes[i] = encBytes[i] ^ RST_XOR_KEY[i % 20];
    }
    const b64Str = b64Bytes.toString('utf8');
    const aesCiphertext = Buffer.from(b64Str, 'base64');

    for (const aesKey of RST_KEYS) {
      try {
        const key16 = aesKey.length >= 16 ? aesKey.slice(0, 16) : aesKey;
        const decrypted = pkcs7Unpad(aesEcbDecrypt(aesCiphertext, key16));
        const decStr = decrypted.toString('utf8');
        if (decStr.includes('[splitConfig]')) return decStr;
      } catch (_) {}
    }
  } catch (_) {}
  return null;
}

function jklDecrypt(inputStr, isNew = false) {
  if (!inputStr) return inputStr;
  const activeKey = isNew ? JKL_KEY_NEW : JKL_KEY_OLD;
  try {
    let padded = inputStr;
    const pad = padded.length % 4;
    if (pad) padded += '='.repeat(4 - pad);
    let data = Buffer.from(padded, 'base64');
    for (let i = 0; i < data.length; i++) {
      const d = data[i];
      const k = activeKey[i % 20];
      data[i] = (((d ^ 0xff) & 0xca) | (d & 0x35)) ^ (((k ^ 0xff) & 0xca) | (k & 0x35));
    }
    const inner = data.toString('utf8');
    return Buffer.from(inner, 'base64').toString('utf8');
  } catch (_) { return inputStr; }
}

function decryptField(token, dynamicNonce) {
  if (!token || ['true','false','lifeTime','[splitPsiphon][splitPsiphon]'].includes(token) || token.startsWith('<')) {
    return token;
  }
  const candidates = [];
  const cleanH = cleanHex(token);
  if (isHex(cleanH) && cleanH.length >= 32) {
    try { candidates.push(hexToBytes(cleanH)); } catch (_) {}
  }
  if (token.length > 16) {
    try { candidates.push(Buffer.from(token, 'utf8')); } catch (_) {}
  }
  const seen = new Set();
  const unique = [];
  for (const c of candidates) {
    const h = c.toString('hex');
    if (!seen.has(h) && c.length > 16) {
      seen.add(h);
      unique.push(c);
    }
  }

  for (const dataBytes of unique) {
    const ciphertext = dataBytes.slice(0, dataBytes.length - 16);
    for (const chachaKey of CHACHA_KEYS) {
      try {
        const cipher = new ChaCha20(chachaKey, dynamicNonce);
        const decBytes = cipher.decrypt(ciphertext);
        const decStr = bytesToStr(decBytes);
        for (const isNew of [true, false]) {
          const out = jklDecrypt(decStr, isNew);
          if (out && out !== decStr && isMostlyPrintable(out)) return out;
        }
        if (isMostlyPrintable(decStr, true) &&
            (decStr.includes('HTTP') || decStr.includes('@') || decStr.includes(':') ||
             decStr.includes('{') || /^[a-zA-Z0-9]+$/.test(decStr))) {
          return decStr;
        }
      } catch (_) {}
    }
  }
  for (const isNew of [true, false]) {
    const out = jklDecrypt(token, isNew);
    if (out !== token && isMostlyPrintable(out)) return out;
  }
  return token;
}

function extractInitialPayload(fileBytes, hexKey) {
  try {
    const keyBytes = hexToBytes(hexKey);
    const kLen = keyBytes.length;
    const out = Buffer.alloc(fileBytes.length);
    for (let i = 0; i < fileBytes.length; i++) {
      out[i] = fileBytes[i] ^ keyBytes[i % kLen];
    }
    return out.toString('utf8');
  } catch (_) { return null; }
}

/**
 * Main entry point
 * @param {Buffer} fileBytes
 * @returns {string|null}
 */
function execute(fileBytes) {
  if (!fileBytes || !fileBytes.length) return null;
  const hexPayload = extractInitialPayload(fileBytes, 'e382e4b8adc386f09f9293');
  if (!hexPayload) return null;

  try {
    const outer = abcDecrypt(hexPayload, CHACHA_KEYS[5]);
    if (!outer || !outer.startsWith('{')) return null;

    const jsonObj = JSON.parse(outer);
    if (typeof jsonObj !== 'object' || jsonObj === null) return null;

    const cfgObj = jsonObj.cfg || {};
    const isNewFormat = typeof cfgObj === 'object' && cfgObj !== null && 'content' in cfgObj;

    const metaValues = {};
    const protections = {};
    let targetCipher, splitDelim;

    if (isNewFormat) {
      for (const [k, name] of [['b','hwid'], ['f','area']]) {
        const val = String(jsonObj[k] || cfgObj[k] || '');
        if (val) {
          metaValues[name] = val;
          protections[name] = val;
        }
      }
      targetCipher = cfgObj.content;
      splitDelim = '[splitConfig]';
    } else {
      const objA = (typeof jsonObj.a === 'object' && jsonObj.a) ? jsonObj.a : {};
      for (const [k, name] of [['bb','hwid'], ['e','password'], ['fe','area'], ['ed','provider']]) {
        let val = (k === 'e') ? jsonObj[k] : objA[k];
        if (val) {
          const decVal = abcDecrypt(String(val), CHACHA_KEYS[7]);
          if (decVal) {
            metaValues[name] = decVal;
            protections[name] = decVal;
          }
        }
      }
      targetCipher = jsonObj.xy || objA.xy;
      splitDelim = jsonObj.uv || objA.uv;
    }

    if (!targetCipher || !splitDelim) return null;

    const toHex = s => s ? Buffer.from(s, 'utf8').toString('hex') : '';
    const h = metaValues.hwid, p = metaValues.password, pr = metaValues.provider, a = metaValues.area;
    let derivedHex;
    if (h && !p && !pr && !a) derivedHex = toHex(h) + toHex(h);
    else derivedHex = toHex(p) + toHex(h) + toHex(pr) + toHex(a);

    const dynamicNonce = Buffer.from(STATIC_NONCE);
    if (derivedHex) {
      try {
        const dBytes = hexToBytes(derivedHex.slice(0, 16));
        for (let i = 0; i < Math.min(8, dBytes.length); i++) dynamicNonce[i] = dBytes[i];
      } catch (_) {}
    }

    let xyDec = null;
    if (isNewFormat) {
      xyDec = rstDecrypt(String(targetCipher));
      if (!xyDec) {
        for (const key of CHACHA_KEYS) {
          const temp = abcDecrypt(String(targetCipher), key);
          if (temp && temp.includes(splitDelim)) {
            xyDec = temp;
            break;
          }
        }
      }
    } else {
      xyDec = abcDecrypt(String(targetCipher), CHACHA_KEYS[1]);
    }
    if (!xyDec) return null;

    const configData = {};
    const tokens = xyDec.split(String(splitDelim));
    for (let i = 0; i < tokens.length; i++) {
      if (i === 22 || i === 24) continue;
      const label = TOKEN_MAP[i] || `field_${i}`;
      let finalOut = tokens[i];

      if (isNewFormat) {
        finalOut = decryptField(tokens[i], dynamicNonce);
      } else {
        if (isHex(tokens[i])) {
          finalOut = abcDecrypt(tokens[i], CHACHA_KEYS[7], dynamicNonce);
        }
        finalOut = jklDecrypt(finalOut, false);
      }

      if (i === 7) finalOut = processCredentials(finalOut, true);
      else if (i === 11) finalOut = processCredentials(finalOut, false);

      if (finalOut) {
        if (typeof finalOut === 'string') {
          finalOut = finalOut.replace('88a05e8772eac3e5703e0cd26c6e6f23de72fb09f7ee5a43283d1681f19d', '');
          try {
            if (finalOut.startsWith('{') || finalOut.startsWith('[')) {
              finalOut = JSON.parse(finalOut);
            }
          } catch (_) {}
        }
        if (!(typeof finalOut === 'string' && isHex(finalOut))) {
          configData[label] = finalOut;
        }
      }
    }

    const resultDict = { Protections: protections, Config: configData };
    return (
      'Codeofsaladin HTTP CUSTOM SCRIPT\n' +
      '='.repeat(30) + '\n\n' +
      JSON.stringify(resultDict, null, 4) + '\n\n' +
      '='.repeat(30) + '\n' +
      'code : @Codeofsaladin'
    );
  } catch (e) {
    console.error(e);
    return null;
  }
}

module.exports = { execute, decrypt: execute };
