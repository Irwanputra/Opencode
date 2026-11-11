package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpk implements Runnable {
    private /* synthetic */ zzow zzbvt;
    private /* synthetic */ zzpj zzbwa;

    public zzpk(zzpj zzpjVar, zzow zzowVar) {
        this.zzbwa = zzpjVar;
        this.zzbvt = zzowVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbwa.zza(this.zzbvt);
    }
}
