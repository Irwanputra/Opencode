package com.google.android.gms.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaku<T> implements zzakv<T> {
    private final T value;
    private final zzakw zzdey;

    public zzaku(T t) {
        this.value = t;
        zzakw zzakwVar = new zzakw();
        this.zzdey = zzakwVar;
        zzakwVar.zzre();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.zzakv
    public final void zza(Runnable runnable, Executor executor) {
        this.zzdey.zza(runnable, executor);
    }
}
