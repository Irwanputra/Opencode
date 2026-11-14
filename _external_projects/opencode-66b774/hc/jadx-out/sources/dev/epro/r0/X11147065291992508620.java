package dev.epro.r0;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X11147065291992508620 extends AbstractOwnableSynchronizer implements Runnable {
    public final Z13138252466311837697 a;

    public X11147065291992508620(Z13138252466311837697 z13138252466311837697) {
        this.a = z13138252466311837697;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
