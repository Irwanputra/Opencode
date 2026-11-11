package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zziz {
    private final byte[] zzbcp;
    private int zzbcq;
    private int zzbcr;
    private /* synthetic */ zzix zzbcs;

    private zziz(zzix zzixVar, byte[] bArr) {
        this.zzbcs = zzixVar;
        this.zzbcp = bArr;
    }

    public final synchronized void zzbk() {
        try {
            zzix zzixVar = this.zzbcs;
            if (zzixVar.zzbco) {
                zzixVar.zzbcn.zzc(this.zzbcp);
                this.zzbcs.zzbcn.zzg(this.zzbcq);
                this.zzbcs.zzbcn.zzh(this.zzbcr);
                this.zzbcs.zzbcn.zza(null);
                this.zzbcs.zzbcn.zzbk();
            }
        } catch (RemoteException e) {
            zzakb.zza("Clearcut log failed", e);
        }
    }

    public final zziz zzp(int i) {
        this.zzbcq = i;
        return this;
    }

    public final zziz zzq(int i) {
        this.zzbcr = i;
        return this;
    }
}
