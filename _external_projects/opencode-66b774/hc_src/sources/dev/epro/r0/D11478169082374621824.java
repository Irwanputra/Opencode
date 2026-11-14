package dev.epro.r0;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D11478169082374621824 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final Object b;

    public D11478169082374621824() {
        this.a = (byte) 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                L10699316803831699764 l10699316803831699764 = (L10699316803831699764) obj;
                Thread thread2 = new Thread(runnable, G6547577305291411977.n(l10699316803831699764.a.getAndIncrement(), "Google consent worker #"));
                l10699316803831699764.c = new WeakReference(thread2);
                return thread2;
        }
    }

    public /* synthetic */ D11478169082374621824(L10699316803831699764 l10699316803831699764) {
        this.a = (byte) 1;
        this.b = l10699316803831699764;
    }
}
