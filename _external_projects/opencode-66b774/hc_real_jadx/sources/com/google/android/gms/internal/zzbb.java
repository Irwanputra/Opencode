package com.google.android.gms.internal;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbb extends zzfjm<zzbb> {
    private Long zzep = null;
    private Long zzeq = null;
    public Long zzgd = null;
    public Long zzge = null;
    public Long zzgf = null;

    public zzbb() {
        this.zzpfd = -1;
    }

    @Override // com.google.android.gms.internal.zzfjs
    public final /* synthetic */ zzfjs zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            if (zzcvt == 0) {
                return this;
            }
            if (zzcvt == 8) {
                this.zzep = Long.valueOf(zzfjjVar.zzcwn());
            } else if (zzcvt == 16) {
                this.zzeq = Long.valueOf(zzfjjVar.zzcwn());
            } else if (zzcvt == 24) {
                this.zzgd = Long.valueOf(zzfjjVar.zzcwn());
            } else if (zzcvt == 32) {
                this.zzge = Long.valueOf(zzfjjVar.zzcwn());
            } else if (zzcvt == 40) {
                this.zzgf = Long.valueOf(zzfjjVar.zzcwn());
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        Long l = this.zzep;
        if (l != null) {
            zzfjkVar.zzf(1, l.longValue());
        }
        Long l2 = this.zzeq;
        if (l2 != null) {
            zzfjkVar.zzf(2, l2.longValue());
        }
        Long l3 = this.zzgd;
        if (l3 != null) {
            zzfjkVar.zzf(3, l3.longValue());
        }
        Long l4 = this.zzge;
        if (l4 != null) {
            zzfjkVar.zzf(4, l4.longValue());
        }
        Long l5 = this.zzgf;
        if (l5 != null) {
            zzfjkVar.zzf(5, l5.longValue());
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        Long l = this.zzep;
        if (l != null) {
            zzq = C2098.m4177(l, 1, zzq);
        }
        Long l2 = this.zzeq;
        if (l2 != null) {
            zzq = C2098.m4177(l2, 2, zzq);
        }
        Long l3 = this.zzgd;
        if (l3 != null) {
            zzq = C2098.m4177(l3, 3, zzq);
        }
        Long l4 = this.zzge;
        if (l4 != null) {
            zzq = C2098.m4177(l4, 4, zzq);
        }
        Long l5 = this.zzgf;
        return l5 != null ? C2098.m4177(l5, 5, zzq) : zzq;
    }
}
