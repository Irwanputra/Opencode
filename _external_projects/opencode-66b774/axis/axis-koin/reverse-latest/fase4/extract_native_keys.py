"""Extract string values returned by libnative-lib.so JNI getters.

Each getter copies N bytes from a .rodata address (adrp page + add imm),
optionally patches a few tail bytes with mov/movk constants, NUL-terminates,
and returns NewStringUTF. Capstone prints adrp's operand as the ABSOLUTE
target page (verified by manual decode of the keyTempest getter).
"""
import subprocess, re, json
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

SO="/home/hatch/workspace/axis-koin/reverse-latest/scratch-apk/native/lib/arm64-v8a/libnative-lib.so"
data=open(SO,'rb').read()

out=subprocess.check_output(["nm","-D",SO]).decode()
syms={}
for line in out.splitlines():
    p=line.split()
    if len(p)==3 and p[2].startswith("Java_com_axis"):
        syms[p[2]]=int(p[0],16)

md=Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
md.detail=True

def extract(name):
    addr=syms[name]
    addrs=sorted(syms.values())
    i=addrs.index(addr)
    end=addrs[i+1] if i+1<len(addrs) else addr+0x300
    insns=list(md.disasm(data[addr:end], addr))
    page=None; addimm=None; nul=None; patches=[]; movw=None; movh=None
    bufsize=None; stack_base=None
    for ins in insns:
        mn=ins.mnemonic; o=mn+" "+ins.op_str
        mm=re.match(r"mov\s+w0, #0x([0-9a-f]+)", o)
        if mn=="mov" and mm:
            bufsize=int(mm.group(1),16)
        mm=re.match(r"adrp\s+x\d+, #0x([0-9a-f]+)", o)
        if mn=="adrp" and mm:
            page=int(mm.group(1),16)
        mm=re.match(r"add\s+x\d+, x\d+, #0x([0-9a-f]+)", o)
        if mn=="add" and mm and page is not None and addimm is None:
            addimm=int(mm.group(1),16)
        mm=re.match(r"strb\s+wzr, \[x0, #0x([0-9a-f]+)\]", o)
        if mn=="strb" and mm:
            nul=int(mm.group(1),16)
        mm=re.match(r"strb\s+wzr, \[sp, #0x([0-9a-f]+)\]", o)
        if mn=="strb" and mm:
            nul=int(mm.group(1),16)-1  # stack copy starts at sp+1
        mm=re.match(r"mov\s+w8, #0x([0-9a-f]+)", o)
        if mn=="mov" and mm:
            movw=int(mm.group(1),16)
        mm=re.match(r"movk\s+w8, #0x([0-9a-f]+), lsl #16", o)
        if mn=="movk" and mm and movw is not None:
            movw |= int(mm.group(1),16)<<16
        mm=re.match(r"stur\s+w8, \[x0, #0x([0-9a-f]+)\]", o)
        if mn=="stur" and mm and movw is not None:
            patches.append((int(mm.group(1),16), movw))
            movw=None
        mm=re.match(r"mov\s+w8, #0x([0-9a-f]+)", o)
        if mn=="mov" and mm:
            movh=int(mm.group(1),16)
        mm=re.match(r"strh\s+w8, \[x0, #0x([0-9a-f]+)\]", o)
        if mn=="strh" and mm and movh is not None:
            patches.append((int(mm.group(1),16), movh & 0xff))
            nul=int(mm.group(1),16)+1
            movh=None
    if page is None or addimm is None:
        return {"error": "no adrp/add found"}
    src=page+addimm
    n=nul if nul is not None else (bufsize or 64)
    raw=bytearray(data[src:src+n])
    for off, val in patches:
        raw[off:off+4]=val.to_bytes(4,'little')
        # strh patch: only 2 bytes (char + NUL); trim the raw length via nul already set
    raw=bytes(raw).split(b'\x00')[0]
    try:
        s=raw.decode()
    except Exception:
        s=repr(raw)
    return {"src": hex(src), "len": n, "patches": [(hex(o), hex(v)) for o,v in patches], "value": s}

targets=[
 "Java_com_axis_net_config_Signature_apiKey",
 "Java_com_axis_net_config_Signature_keyTempest",
 "Java_com_axis_net_config_Signature_keyTempestCapital",
 "Java_com_axis_net_config_Signature_keyTempestGuardian",
 "Java_com_axis_net_config_Signature_keyTempestMarket",
 "Java_com_axis_net_config_Signature_keyTempestMarketCapital",
 "Java_com_axis_net_helper_AxisnetHelpers_getSaltKey",
 "Java_com_axis_net_helper_AxisnetHelpers_getMsisdnSaltKey",
 "Java_com_axis_net_helper_AxisnetHelpers_getSecretKey",
 "Java_com_axis_net_helper_AxisnetHelpers_getOtpCode",
 "Java_com_axis_net_helper_AxisnetHelpers_getStringDecrypt",
 "Java_com_axis_net_helper_AxisnetHelpers_getStringXl",
 "Java_com_axis_net_helper_AxisnetHelpers_getStringAxis",
 "Java_com_axis_net_helper_AxisnetHelpers_getStringHash",
 "Java_com_axis_net_helper_AxisnetHelpers_getAppsFlayerKey",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos1",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos2",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos3",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos4",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos5",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos6",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos7",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos9",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos10",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos11",
 "Java_com_axis_net_helper_AxisnetHelpers_getPos12",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_claimBonusAlifetimeUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getCoinProfileUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getBonusAlifetimeUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getAlifetimeBonusUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getAlifetimeMembershipUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getBonusAlifetimeProfilingUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getVoucherAlifetimeUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getVoucherAlifetimeV2Url",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getRewardAlifetimeUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_getLevelProfileUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_flashWarInfoUrl",
 "Java_com_axis_net_features_alifetime_dashboard_repositories_AlifetimeDashboardRepository_putLevelUpUrl",
 "Java_com_axis_net_features_alifetime_general_repositories_ProfileSectionRepository_alifetimeClaimBonusUrl",
 "Java_com_axis_net_features_alifetime_general_repositories_ProfileSectionRepository_getPointHistoryUrl",
]
res={}
for t in targets:
    if t not in syms:
        res[t]={"error":"symbol not found"}
        continue
    try:
        res[t]=extract(t)
    except Exception as e:
        res[t]={"error": str(e)}
    print(t.split("Java_com_axis_net_")[-1], "=>", res[t].get("value", res[t]))
json.dump(res, open("/home/hatch/workspace/axis-koin/reverse-latest/fase4/native_keys.json",'w'), indent=1)
print("saved native_keys.json")
