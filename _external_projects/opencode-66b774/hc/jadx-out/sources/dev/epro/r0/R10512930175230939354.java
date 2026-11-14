package dev.epro.r0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R10512930175230939354 extends I13152720973475179368 {
    public final D16915945238461757356 h;

    public R10512930175230939354(D16915945238461757356 d16915945238461757356) {
        d16915945238461757356.getClass();
        this.h = d16915945238461757356;
    }

    @Override // dev.epro.r0.R4225980552687347745, dev.epro.r0.D16915945238461757356
    public final void a(Runnable runnable, Executor executor) {
        this.h.a(runnable, executor);
    }

    @Override // dev.epro.r0.R4225980552687347745, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.h.cancel(z);
    }

    @Override // dev.epro.r0.R4225980552687347745, java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // dev.epro.r0.R4225980552687347745, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // dev.epro.r0.R4225980552687347745, java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String toString() {
        return this.h.toString();
    }

    @Override // dev.epro.r0.R4225980552687347745, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }
}
