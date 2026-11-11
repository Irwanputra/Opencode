package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjb extends zzfjm<zzjb> {
    public String zzbcu = null;
    public zzjd zzbcv = null;

    public zzjb() {
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
                this.zzbcu = zzfjjVar.readString();
            } else if (zzcvt == 34) {
                if (this.zzbcv == null) {
                    this.zzbcv = new zzjd();
                }
                zzfjjVar.zza(this.zzbcv);
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        String str = this.zzbcu;
        if (str != null) {
            zzfjkVar.zzn(1, str);
        }
        zzjd zzjdVar = this.zzbcv;
        if (zzjdVar != null) {
            zzfjkVar.zza(4, zzjdVar);
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzbcu;
        if (str != null) {
            zzq += zzfjk.zzo(1, str);
        }
        zzjd zzjdVar = this.zzbcv;
        return zzjdVar != null ? zzq + zzfjk.zzb(4, zzjdVar) : zzq;
    }
}
