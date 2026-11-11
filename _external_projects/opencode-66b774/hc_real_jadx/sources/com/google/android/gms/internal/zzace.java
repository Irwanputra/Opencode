package com.google.android.gms.internal;

import java.util.concurrent.Future;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzace implements Runnable {
    private /* synthetic */ Future zzcrr;

    public zzace(zzacb zzacbVar, Future future) {
        this.zzcrr = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzcrr.isDone()) {
            return;
        }
        this.zzcrr.cancel(true);
    }
}
