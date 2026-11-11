package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfka extends zzfjm<zzfka> {
    private byte[] zzpor = null;
    private byte[] zzpos = null;
    private byte[] zzpot = null;

    public zzfka() {
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
                this.zzpor = zzfjjVar.readBytes();
            } else if (zzcvt == 18) {
                this.zzpos = zzfjjVar.readBytes();
            } else if (zzcvt == 26) {
                this.zzpot = zzfjjVar.readBytes();
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        byte[] bArr = this.zzpor;
        if (bArr != null) {
            zzfjkVar.zzc(1, bArr);
        }
        byte[] bArr2 = this.zzpos;
        if (bArr2 != null) {
            zzfjkVar.zzc(2, bArr2);
        }
        byte[] bArr3 = this.zzpot;
        if (bArr3 != null) {
            zzfjkVar.zzc(3, bArr3);
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        byte[] bArr = this.zzpor;
        if (bArr != null) {
            zzq += zzfjk.zzd(1, bArr);
        }
        byte[] bArr2 = this.zzpos;
        if (bArr2 != null) {
            zzq += zzfjk.zzd(2, bArr2);
        }
        byte[] bArr3 = this.zzpot;
        return bArr3 != null ? zzq + zzfjk.zzd(3, bArr3) : zzq;
    }
}
