import os, logging, json
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
outdir="/home/hatch/workspace/axis-koin/reverse-latest/fase4"
dex=DEX(open(os.path.join(base,"tmp14169616706995394833.dex"),'rb').read())
mids=dex.get_methods()

def val_str(v):
    # v: EncodedValue
    try:
        raw=v.get_value()
    except Exception as e:
        return f"?{e}"
    if hasattr(raw, "get_values"):
        try:
            return [val_str(x) if hasattr(x, "get_value") else str(x) for x in raw.get_values()]
        except Exception:
            return str(raw)
    return str(raw)

def ann_list(asi):
    out=[]
    for off in asi.get_annotation_off_item():
        ann=off.get_annotation_item().get_annotation()
        try:
            typ=dex.CM.get_type(ann.get_type_idx())
        except Exception as e:
            typ=f"?type_idx {ann.get_type_idx()} ({e})"
        els=[]
        for el in ann.get_elements():
            try:
                nm=dex.CM.get_string(el.get_name_idx())
            except Exception:
                nm=f"?name_idx {el.get_name_idx()}"
            els.append((nm, val_str(el.get_value())))
        out.append({"type": typ, "elements": els})
    return out

want={"alifetimeClaimBonus","claimBonus","getPointProfile","getAlifetimeBonus","checkNumberSimReplace","getOtpLogin","getOtp","getAlifetimeBonusDetail","getAlifetimeBonusProfiling","getAlifetimeMembership","getAlifetimeVoucher","getRewardAlifetime","levelUpAlifetime","redeemBonusFlashWar","purchaseTicketFlashWar","claimVoucher","getCoinWordingLevel","getLevelAlifetime"}
results={}
for c in dex.get_classes():
    if c.get_name()!="Lcom/axis/net/api/AxisnetApiServices;":
        continue
    adi=c.annotations_directory_item
    for ma in adi.get_method_annotations():
        mid=mids[ma.get_method_idx()]
        if mid.get_name() not in want: continue
        asi=dex.CM.get_annotation_set_item(ma.get_annotations_off())
        results[mid.get_name()]=ann_list(asi)
    for pa in adi.get_parameter_annotations():
        mid=mids[pa.get_method_idx()]
        if mid.get_name() not in want: continue
        try:
            lst=dex.CM.get_obj_by_offset(pa.get_annotations_off())
            params=[]
            for ref in lst.get_list():
                if ref is None or ref.get_annotations_off()==0:
                    params.append(None)
                else:
                    params.append(ann_list(dex.CM.get_annotation_set_item(ref.get_annotations_off())))
            results[mid.get_name()+"__params"]=params
        except Exception as e:
            results[mid.get_name()+"__params"]=[f"err {e}"]
    break

for k in sorted(results):
    print(f"== {k} ==")
    print(json.dumps(results[k], indent=1))
open(os.path.join(outdir,"api-annotations2.json"),'w').write(json.dumps(results, indent=1))
print("saved")
