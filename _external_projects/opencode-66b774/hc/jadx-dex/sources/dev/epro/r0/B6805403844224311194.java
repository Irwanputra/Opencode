package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6805403844224311194 implements dev.epro.r0.D16915945238461757356 {
    public static final dev.epro.r0.B6805403844224311194 b = new dev.epro.r0.B6805403844224311194(null);
    public static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(dev.epro.r0.B6805403844224311194.class.getName());
    public final java.lang.Object a;

    public B6805403844224311194(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // dev.epro.r0.D16915945238461757356
    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        if (executor == null) {
            dev.epro.r0.Z3383101362411723454.k("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException unused) {
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
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
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
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

    public final java.lang.String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.a;
    }
}
