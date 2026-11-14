package dev.epro.r0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B6805403844224311194 implements D16915945238461757356 {
    public static final B6805403844224311194 b = new B6805403844224311194(null);
    public static final Logger c = Logger.getLogger(B6805403844224311194.class.getName());
    public final Object a;

    public B6805403844224311194(Object obj) {
        this.a = obj;
    }

    @Override // dev.epro.r0.D16915945238461757356
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            Z3383101362411723454.k("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            Level level = Level.SEVERE;
            runnable.toString();
            executor.toString();
            c.getClass();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
