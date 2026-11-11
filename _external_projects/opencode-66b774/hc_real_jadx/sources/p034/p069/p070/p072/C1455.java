package p034.p069.p070.p072;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1455 extends AbstractC1457 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f6749 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ExecutorService f6748 = Executors.newFixedThreadPool(2, new ThreadFactoryC1456(this));

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class ThreadFactoryC1456 implements ThreadFactory {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final AtomicInteger f6750 = new AtomicInteger(0);

        public ThreadFactoryC1456(C1455 c1455) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f6750.getAndIncrement())));
            return thread;
        }
    }

    @Override // p034.p069.p070.p072.AbstractC1457
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo3196() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
