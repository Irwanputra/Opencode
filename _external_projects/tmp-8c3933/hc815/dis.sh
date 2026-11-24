#!/bin/bash
# usage: dis.sh START END LABEL
/usr/local/lib/android/sdk/ndk/27.3.13750724/toolchains/llvm/prebuilt/linux-x86_64/bin/llvm-objdump \
  -d --no-show-raw-insn --start-address=$1 --stop-address=$2 lib/arm64-v8a/libaio.so \
  | tail -n +8 | sed -E 's/^[0-9a-f]+:\s+//' | awk -v s=$1 '{printf "%x  %s\n", s+NR-1-0, $0}' | sed "s/^/[$3] /"
