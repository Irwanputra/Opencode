package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzahi implements Callable<Void> {
    private /* synthetic */ Runnable zzdat;

    public zzahi(Runnable runnable) {
        this.zzdat = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.zzdat.run();
        return null;
    }
}
