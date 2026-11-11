package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzagc implements Runnable {
    private /* synthetic */ zzagb zzdae;

    public zzagc(zzagb zzagbVar) {
        this.zzdae = zzagbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdae.zzdac = Thread.currentThread();
        this.zzdae.zzdm();
    }
}
