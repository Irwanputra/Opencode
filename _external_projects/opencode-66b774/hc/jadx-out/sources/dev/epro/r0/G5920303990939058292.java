package dev.epro.r0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G5920303990939058292 implements D16915945238461757356 {
    public final WeakReference a;
    public final Q67451660661543800 b = new Q67451660661543800(this);

    public G5920303990939058292(X627358512999327803 x627358512999327803) {
        this.a = new WeakReference(x627358512999327803);
    }

    @Override // dev.epro.r0.D16915945238461757356
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        X627358512999327803 x627358512999327803 = (X627358512999327803) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && x627358512999327803 != null) {
            x627358512999327803.a = null;
            x627358512999327803.b = null;
            x627358512999327803.c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof H1338852860419971224;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
