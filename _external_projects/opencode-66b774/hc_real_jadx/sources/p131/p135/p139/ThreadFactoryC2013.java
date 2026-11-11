package p131.p135.p139;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ThreadFactoryC2013 implements ThreadFactory {

    /* renamed from: なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2014 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ Runnable f8740;

        public RunnableC2014(Runnable runnable) {
            this.f8740 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ThreadFactoryC2013.this.getClass();
                Process.setThreadPriority(10);
            } catch (Throwable unused) {
            }
            this.f8740.run();
        }
    }

    public ThreadFactoryC2013(int i) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC2014(runnable));
    }
}
