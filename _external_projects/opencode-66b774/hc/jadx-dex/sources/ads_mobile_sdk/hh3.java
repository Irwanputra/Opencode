package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hh3 implements java.util.concurrent.ThreadFactory {
    public final java.lang.String a;
    public java.lang.Integer b = null;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(1);

    public hh3(java.lang.String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        runnable.getClass();
        java.lang.String str = "GMA(" + this.a + ") " + this.c.getAndIncrement();
        java.lang.Integer num = this.b;
        return num == null ? new java.lang.Thread(runnable, str) : new java.lang.Thread((java.lang.Runnable) new dev.epro.r0.Q9622116641457785369(num, runnable, (byte) 21), str);
    }
}
