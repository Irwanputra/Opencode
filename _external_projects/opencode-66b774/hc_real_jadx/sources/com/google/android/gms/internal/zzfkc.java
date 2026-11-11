package com.google.android.gms.internal;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfkc extends zzfjm<zzfkc> {
    private Integer zzpow = null;
    private byte[] zzpox = null;
    private byte[] zzpot = null;

    public zzfkc() {
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
            if (zzcvt == 8) {
                this.zzpow = Integer.valueOf(zzfjjVar.zzcvw());
            } else if (zzcvt == 18) {
                this.zzpox = zzfjjVar.readBytes();
            } else if (zzcvt == 26) {
                this.zzpot = zzfjjVar.readBytes();
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        Integer num = this.zzpow;
        if (num != null) {
            zzfjkVar.zzaa(1, num.intValue());
        }
        byte[] bArr = this.zzpox;
        if (bArr != null) {
            zzfjkVar.zzc(2, bArr);
        }
        byte[] bArr2 = this.zzpot;
        if (bArr2 != null) {
            zzfjkVar.zzc(3, bArr2);
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzpow;
        if (num != null) {
            zzq = C2098.m4200(num, 1, zzq);
        }
        byte[] bArr = this.zzpox;
        if (bArr != null) {
            zzq += zzfjk.zzd(2, bArr);
        }
        byte[] bArr2 = this.zzpot;
        return bArr2 != null ? zzq + zzfjk.zzd(3, bArr2) : zzq;
    }
}
