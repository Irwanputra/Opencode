package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzxx implements Runnable {
    private /* synthetic */ zzxw zzcjq;

    public zzxx(zzxw zzxwVar) {
        this.zzcjq = zzxwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcjq.onStop();
    }
}
