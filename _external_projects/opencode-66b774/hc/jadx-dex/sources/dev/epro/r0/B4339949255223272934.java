package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B4339949255223272934 implements android.net.DnsResolver$Callback {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
    public final /* synthetic */ java.util.concurrent.CountDownLatch b;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(10);
    }

    private native void ppgtwoyrbqdb(java.util.concurrent.atomic.AtomicReference<dev.epro.r0.A1302650530911925947> atomicReference, java.util.concurrent.CountDownLatch countDownLatch);

    public final native void onAnswer(java.lang.Object obj, int i);

    public final native void onError(android.net.DnsResolver.DnsException dnsException);

    public B4339949255223272934(java.util.concurrent.atomic.AtomicReference<dev.epro.r0.A1302650530911925947> atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.a = atomicReference;
        this.b = countDownLatch;
        ppgtwoyrbqdb(atomicReference, countDownLatch);
    }
}
