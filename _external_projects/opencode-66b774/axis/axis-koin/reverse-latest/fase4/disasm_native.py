import sys, subprocess
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from capstone.arm64 import *

so="/home/hatch/workspace/axis-koin/reverse-latest/scratch-apk/native/lib/arm64-v8a/libnative-lib.so"
data=open(so,'rb').read()
# symbol -> address via nm -D
syms={}
out=subprocess.check_output(["nm","-D",so]).decode()
for line in out.splitlines():
    parts=line.split()
    if len(parts)==3 and parts[2].startswith("Java_com_axis"):
        syms[parts[2]]=int(parts[0],16)

targets=sys.argv[1:] or ["Java_com_axis_net_config_Signature_keyTempest",
                         "Java_com_axis_net_helper_AxisnetHelpers_getSaltKey",
                         "Java_com_axis_net_helper_AxisnetHelpers_getMsisdnSaltKey"]
md=Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
md.detail=False
for t in targets:
    addr=syms.get(t)
    if addr is None:
        print("NOT FOUND", t); continue
    # find next symbol address as end bound
    addrs=sorted(syms.values())
    i=addrs.index(addr)
    end=addrs[i+1] if i+1<len(addrs) else addr+0x200
    print(f"\n### {t} @ {addr:#x} .. {end:#x} ({end-addr} bytes)")
    code=data[addr:end]
    for ins in md.disasm(code, addr):
        print(f"  {ins.address:#x}: {ins.mnemonic:10s} {ins.op_str}")
