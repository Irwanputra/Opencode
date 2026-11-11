package com.google.android.gms.internal;

import java.util.concurrent.Executor;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzalc implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
