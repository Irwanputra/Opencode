package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfjy extends zzfjm<zzfjy> {
    private static volatile zzfjy[] zzpol;
    public byte[] zzpom = null;
    public byte[] zzohg = null;

    public zzfjy() {
        this.zzpnc = null;
        this.zzpfd = -1;
    }

    public static zzfjy[] zzdan() {
        if (zzpol == null) {
            synchronized (zzfjq.zzpnk) {
                if (zzpol == null) {
                    zzpol = new zzfjy[0];
                }
            }
        }
        return zzpol;
    }

    @Override // com.google.android.gms.internal.zzfjs
    public final /* synthetic */ zzfjs zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            if (zzcvt == 0) {
                return this;
            }
            if (zzcvt == 10) {
                this.zzpom = zzfjjVar.readBytes();
            } else if (zzcvt == 18) {
                this.zzohg = zzfjjVar.readBytes();
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        zzfjkVar.zzc(1, this.zzpom);
        byte[] bArr = this.zzohg;
        if (bArr != null) {
            zzfjkVar.zzc(2, bArr);
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzd = zzfjk.zzd(1, this.zzpom) + super.zzq();
        byte[] bArr = this.zzohg;
        return bArr != null ? zzd + zzfjk.zzd(2, bArr) : zzd;
    }
}
