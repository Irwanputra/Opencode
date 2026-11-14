package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B9360715651329413082 extends P9674367971006745590 implements Runnable {
    public final Runnable h;

    public B9360715651329413082(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Error | RuntimeException e) {
            l(e);
            throw e;
        }
    }
}
