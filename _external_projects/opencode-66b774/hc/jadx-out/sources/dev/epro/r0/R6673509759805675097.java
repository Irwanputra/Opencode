package dev.epro.r0;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R6673509759805675097 implements ScheduledFuture, D16915945238461757356, Future {
    public final R4225980552687347745 a;
    public final ScheduledFuture b;

    public R6673509759805675097(R4225980552687347745 r4225980552687347745, ScheduledFuture scheduledFuture) {
        this.a = r4225980552687347745;
        this.b = scheduledFuture;
    }

    @Override // dev.epro.r0.D16915945238461757356
    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    public final boolean b(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zB = b(z);
        if (zB) {
            this.b.cancel(z);
        }
        return zB;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
