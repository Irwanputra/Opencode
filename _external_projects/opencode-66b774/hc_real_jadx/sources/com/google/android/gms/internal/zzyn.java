package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyn implements Runnable {
    private /* synthetic */ zzalf zzckm;
    private /* synthetic */ String zzckn;
    private /* synthetic */ zzym zzcko;

    public zzyn(zzym zzymVar, zzalf zzalfVar, String str) {
        this.zzcko = zzymVar;
        this.zzckm = zzalfVar;
        this.zzckn = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzba zzbaVar;
        zzalf zzalfVar = this.zzckm;
        zzbaVar = this.zzcko.zzckh;
        zzalfVar.set(zzbaVar.zzdu().get(this.zzckn));
    }
}
