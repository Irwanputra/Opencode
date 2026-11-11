package com.google.android.gms.internal;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfkf extends zzfjm<zzfkf> {
    public String zzpph = null;
    public Long zzppi = null;
    public Boolean zzppj = null;

    public zzfkf() {
        this.zzpnc = null;
        this.zzpfd = -1;
    }

    @Override // com.google.android.gms.internal.zzfjs
    public final /* synthetic */ zzfjs zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            if (zzcvt == 0) {
                return this;
            }
            if (zzcvt == 10) {
                this.zzpph = zzfjjVar.readString();
            } else if (zzcvt == 16) {
                this.zzppi = Long.valueOf(zzfjjVar.zzcvv());
            } else if (zzcvt == 24) {
                this.zzppj = Boolean.valueOf(zzfjjVar.zzcvz());
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        String str = this.zzpph;
        if (str != null) {
            zzfjkVar.zzn(1, str);
        }
        Long l = this.zzppi;
        if (l != null) {
            zzfjkVar.zzf(2, l.longValue());
        }
        Boolean bool = this.zzppj;
        if (bool != null) {
            zzfjkVar.zzl(3, bool.booleanValue());
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzpph;
        if (str != null) {
            zzq += zzfjk.zzo(1, str);
        }
        Long l = this.zzppi;
        if (l != null) {
            zzq = C2098.m4177(l, 2, zzq);
        }
        Boolean bool = this.zzppj;
        if (bool == null) {
            return zzq;
        }
        bool.booleanValue();
        return zzq + zzfjk.zzlg(3) + 1;
    }
}
