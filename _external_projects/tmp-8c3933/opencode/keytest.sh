#!/bin/bash
RAW="f9b6ccc9860bdd5124fb6c0c90cba678a68df991d88002f80c3ae0ed1229cb51"
SHA256=$(python3 -c "import hashlib;print(hashlib.sha256(bytes.fromhex('$RAW')).hexdigest())")
SHA512=$(python3 -c "import hashlib;print(hashlib.sha512(bytes.fromhex('$RAW')).hexdigest()[:64])")
REV=$(python3 -c "print(bytes.fromhex('$RAW')[::-1].hex())")
BLAKE=$(python3 -c "import hashlib;h=hashlib.blake2s(digest_size=32);h.update(bytes.fromhex('$RAW'));print(h.hexdigest())")
for kv in "sha256:$SHA256" "sha512:$SHA512" "rev:$REV" "blake2s:$BLAKE"; do
  /tmp/opencode/try.sh "dnstt 2020-04-13" chacha blake2s "${kv#*:}" | sed "s/key=${kv#*:}/key=${kv%%:*}/"
done
