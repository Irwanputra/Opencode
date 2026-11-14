package dev.epro.r0;

import android.net.DnsResolver;
import android.net.DnsResolver$Callback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class B4339949255223272934 implements DnsResolver$Callback {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ CountDownLatch b;

    static {
        izmyclvb.oeynnivvrnts0(10);
    }

    private native void ppgtwoyrbqdb(AtomicReference<A1302650530911925947> atomicReference, CountDownLatch countDownLatch);

    public final native void onAnswer(Object obj, int i);

    public final native void onError(DnsResolver.DnsException dnsException);

    public B4339949255223272934(AtomicReference<A1302650530911925947> atomicReference, CountDownLatch countDownLatch) {
        this.a = atomicReference;
        this.b = countDownLatch;
        ppgtwoyrbqdb(atomicReference, countDownLatch);
    }
}
