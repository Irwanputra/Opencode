package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D11478169082374621824 implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;

    public D11478169082374621824() {
        this.a = (byte) 0;
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                java.lang.Thread thread = new java.lang.Thread(runnable);
                thread.setName("arch_disk_io_" + ((java.util.concurrent.atomic.AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                dev.epro.r0.L10699316803831699764 l10699316803831699764 = (dev.epro.r0.L10699316803831699764) obj;
                java.lang.Thread thread2 = new java.lang.Thread(runnable, dev.epro.r0.G6547577305291411977.n(l10699316803831699764.a.getAndIncrement(), "Google consent worker #"));
                l10699316803831699764.c = new java.lang.ref.WeakReference(thread2);
                return thread2;
        }
    }

    public /* synthetic */ D11478169082374621824(dev.epro.r0.L10699316803831699764 l10699316803831699764) {
        this.a = (byte) 1;
        this.b = l10699316803831699764;
    }
}
