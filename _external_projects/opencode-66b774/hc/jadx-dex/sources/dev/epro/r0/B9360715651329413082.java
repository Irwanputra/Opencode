package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B9360715651329413082 extends dev.epro.r0.P9674367971006745590 implements java.lang.Runnable {
    public final java.lang.Runnable h;

    public B9360715651329413082(java.lang.Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    public final java.lang.String i() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            l(e);
            throw e;
        }
    }
}
