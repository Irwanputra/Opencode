# HTTP-Custom-config-Decryptor
# HTTP Custom Decryptor API

Pure Node.js API for decrypting HTTP Custom / HTTP Injector encrypted profiles.  
Includes interactive **Swagger UI**.

**Zero external dependencies** – only Node.js built-ins.

## Quick Start

```bash
node server.js
# or
npm start
```

Then open:

| URL | Description |
|-----|-------------|
| http://localhost:3000/docs | **Swagger UI** (interactive) |
| http://localhost:3000/openapi.json | OpenAPI 3.0 specification |
| http://localhost:3000/health | Health check |

Default port: **3000** (override with `PORT` env var).

## API Endpoints

### `POST /api/v1/decrypt`

Decrypt a profile. Supports multiple content types:

**1. File upload (multipart)**
```bash
curl -X POST http://localhost:3000/api/v1/decrypt \
  -F "file=@profile.hc"
```

**2. JSON body (hex or text)**
```bash
curl -X POST http://localhost:3000/api/v1/decrypt \
  -H "Content-Type: application/json" \
  -d '{"content": "a1b2c3d4..."}'
```

**3. Raw body**
```bash
curl -X POST http://localhost:3000/api/v1/decrypt \
  -H "Content-Type: application/octet-stream" \
  --data-binary @profile.hc
```

### `POST /api/v1/decrypt/base64`

```bash
curl -X POST http://localhost:3000/api/v1/decrypt/base64 \
  -H "Content-Type: application/json" \
  -d '{"data": "BASE64_ENCODED_FILE_CONTENT"}'
```

### Response (success)

```json
{
  "success": true,
  "result": "codeofsaladin HTTP CUSTOM SCRIPT\n==============================\n\n{ ... }",
  "data": {
    "Protections": { ... },
    "Config": { ... }
  }
}
```

## Files

| File | Description |
|------|-------------|
| `server.js` | HTTP API server + Swagger UI |
| `decryptor.js` | Core decryption engine (ChaCha20, AES, JKL, RST…) |
| `http-custom-decryptor.html` | Standalone browser version (optional) |

## Notes

- Educational / authorized use only.
- Supports old & new HTTP Custom formats.
- CORS enabled for browser clients.
