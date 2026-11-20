import os, glob, logging, json
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
outdir="/home/hatch/workspace/axis-koin/reverse-latest/fase4"
dex=DEX(open(os.path.join(base,"tmp14169616706995394833.dex"),'rb').read())

def show_annotation_set(asi):
    out=[]
    try:
        anns=asi.get_annotations()
    except Exception as e:
        return [f"(get_annotations err {e})"]
    for a in anns:
        try:
            ann=a.get_annotation()
            typ=ann.get_type()
            elems=[]
            for el in ann.get_elements():
                try:
                    elems.append(f"{el.get_name()}={el.get_value()}")
                except Exception as e:
                    elems.append(f"?({e})")
            out.append(f"{typ} [{', '.join(elems)}]")
        except Exception as e:
            out.append(f"(ann err {e})")
    return out

want={"alifetimeClaimBonus","claimBonus","getPointProfile","getAlifetimeBonus","getCoinWordingLevel","getLevelAlifetime","redeemBonusFlashWar","claimVoucher","purchaseTicketFlashWar","getOtp","getOtpLogin","checkNumberPrefix","checkNumberSimReplace","getAlifetimeBonusDetail","getAlifetimeBonusProfiling","getAlifetimeMembership","getAlifetimeVoucher","getRewardAlifetime","levelUpAlifetime"}
results={}
for c in dex.get_classes():
    if c.get_name()!="Lcom/axis/net/api/AxisnetApiServices;":
        continue
    methods={m.get_name(): m for m in c.get_methods()}
    # method_idx mapping: method_annotations are in method_idx order (diff encoded)
    adi=c.annotations_directory_item
    # build idx->name via method list order (class_data methods are in idx order)
    mlist=list(c.get_methods())
    for ma in adi.get_method_annotations():
        idx=ma.get_method_idx()
        # method_idx is absolute? in androguard MethodAnnotation.method_idx is the idx diff-resolved? try direct index into mlist by matching
        # safer: use get_method_idx as index into dex method_ids
        try:
            mid=dex.get_method(idx)
            name=mid.get_name()
        except Exception as e:
            name=f"?idx{idx}({e})"
        if name not in want:
            continue
        asi=ma.get_annotation_set_item()
        results[name]=show_annotation_set(asi)
    # parameter annotations
    for pa in adi.get_parameter_annotations():
        try:
            idx=pa.get_method_idx()
            mid=dex.get_method(idx)
            name=mid.get_name()
        except Exception:
            continue
        if name not in want:
            continue
        # parameter annotations: list per parameter
        try:
            pas=pa.get_annotation_set_ref_list()
            items=[]
            for ref in pas.get_list():
                if ref is None:
                    items.append(None); continue
                items.append(show_annotation_set(ref))
            results.setdefault(name+"_params", items)
        except Exception as e:
            results.setdefault(name+"_params", [f"err {e}"])

for k in sorted(results):
    print(f"== {k} ==")
    v=results[k]
    if isinstance(v, list):
        for x in v: print("  ", x)
    else:
        print("  ", v)
open(os.path.join(outdir,"api-annotations2.json"),'w').write(json.dumps(results, indent=1, default=str))
print("saved api-annotations2.json")
