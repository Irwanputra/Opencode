package com.google.android.gms.internal;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzja extends zzfjm<zzja> {
    public Integer zzbct = null;

    public zzja() {
        this.zzpnc = null;
        this.zzpfd = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzfjs
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzja zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            if (zzcvt == 0) {
                return this;
            }
            if (zzcvt == 56) {
                int position = zzfjjVar.getPosition();
                try {
                    int zzcwi = zzfjjVar.zzcwi();
                    switch (zzcwi) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.zzbct = Integer.valueOf(zzcwi);
                            continue;
                        default:
                            StringBuilder sb = new StringBuilder(43);
                            sb.append(zzcwi);
                            sb.append(" is not a valid enum AdInitiater");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                    }
                } catch (IllegalArgumentException unused) {
                    zzfjjVar.zzmg(position);
                    zza(zzfjjVar, zzcvt);
                }
                zzfjjVar.zzmg(position);
                zza(zzfjjVar, zzcvt);
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        Integer num = this.zzbct;
        if (num != null) {
            zzfjkVar.zzaa(7, num.intValue());
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbct;
        return num != null ? C2098.m4200(num, 7, zzq) : zzq;
    }
}
