package dev.epro.r0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L10699316803831699764 implements Executor {
    public final ThreadPoolExecutor b;
    public final AtomicInteger a = new AtomicInteger(1);
    public WeakReference c = new WeakReference(null);

    public L10699316803831699764() {
        D11478169082374621824 d11478169082374621824 = new D11478169082374621824(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), d11478169082374621824);
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.c.get()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }
}
