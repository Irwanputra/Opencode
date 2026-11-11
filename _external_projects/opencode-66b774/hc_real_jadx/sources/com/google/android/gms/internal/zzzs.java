package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzs implements Runnable {
    private /* synthetic */ zzakc zzcmk;
    private /* synthetic */ String zzcml;

    public zzzs(zzzp zzzpVar, zzakc zzakcVar, String str) {
        this.zzcmk = zzakcVar;
        this.zzcml = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcmk.zzck(this.zzcml);
    }
}
