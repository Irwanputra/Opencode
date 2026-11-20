"""Fase 5 — bedah 4 getter native yang tidak mengembalikan string statis."""
import subprocess

from capstone import CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN, Cs

SO = "/tmp/opencode/axis/axis-koin/reverse-latest/scratch-apk/native/lib/arm64-v8a/libnative-lib.so"
data = open(SO, "rb").read()
syms = {}
for line in subprocess.check_output(["nm", "-D", SO]).decode().splitlines():
    p = line.split()
    if len(p) == 3 and p[2].startswith("Java_"):
        syms[p[2]] = int(p[0], 16)
order = sorted(syms.values())
md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
PLTS = {0x66550: "malloc?", 0x66530: "free?"}

for name in [n for n in syms if "getString" in n or "getNewSaltKey" in n]:
    a = syms[name]
    end = order[order.index(a) + 1]
    print(f"\n=== {name.replace('Java_com_axis_net_', '')}  [{a:#x}..{end:#x}] ===")
    for ins in md.disasm(data[a:end], a):
        t = PLTS.get(int(ins.op_str.lstrip("#"), 16) if ins.mnemonic == "bl" else 0, "")
        print(f"  {ins.address:#08x}  {ins.mnemonic:8s} {ins.op_str:32s} {t}")
