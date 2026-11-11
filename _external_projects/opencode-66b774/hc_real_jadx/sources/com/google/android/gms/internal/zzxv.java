package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzxv implements Runnable {
    private /* synthetic */ zzxu zzcjp;

    public zzxv(zzxu zzxuVar) {
        this.zzcjp = zzxuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zzcjp.zzcjo;
        if (atomicBoolean.get()) {
            zzakb.e("Timed out waiting for WebView to finish loading.");
            this.zzcjp.cancel();
        }
    }
}
