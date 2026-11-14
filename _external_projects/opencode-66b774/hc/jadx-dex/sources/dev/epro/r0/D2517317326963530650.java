package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D2517317326963530650 implements java.util.concurrent.ThreadFactory {
    public final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger();
    public final /* synthetic */ dev.epro.r0.I1632105416032993715 b;

    public D2517317326963530650(dev.epro.r0.I1632105416032993715 i1632105416032993715) {
        this.b = i1632105416032993715;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int iIncrementAndGet = this.a.incrementAndGet();
        java.lang.Thread thread = new java.lang.Thread(runnable, "Trilead_TimeoutService_" + ((java.lang.String) this.b.c) + "-" + iIncrementAndGet);
        thread.setDaemon(true);
        return thread;
    }
}
