package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzj implements Executor {
    private /* synthetic */ Handler zzw;

    public zzj(zzi zziVar, Handler handler) {
        this.zzw = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zzw.post(runnable);
    }
}
