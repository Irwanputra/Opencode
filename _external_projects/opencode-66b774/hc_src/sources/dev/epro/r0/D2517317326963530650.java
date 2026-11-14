package dev.epro.r0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D2517317326963530650 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger();
    public final /* synthetic */ I1632105416032993715 b;

    public D2517317326963530650(I1632105416032993715 i1632105416032993715) {
        this.b = i1632105416032993715;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.a.incrementAndGet();
        Thread thread = new Thread(runnable, "Trilead_TimeoutService_" + ((String) this.b.c) + "-" + incrementAndGet);
        thread.setDaemon(true);
        return thread;
    }
}
