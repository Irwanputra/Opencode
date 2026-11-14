package dev.epro.r0;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R4689349539015301944 extends Thread {
    public final /* synthetic */ byte a = 1;

    public /* synthetic */ R4689349539015301944(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        Y7327269104420830054 y7327269104420830054R;
        switch (this.a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                reentrantLock = Y7327269104420830054.j;
                reentrantLock.lock();
                try {
                    y7327269104420830054R = E12775674050813925581.r();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
            if (y7327269104420830054R == Y7327269104420830054.i) {
                Y7327269104420830054.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (y7327269104420830054R != null) {
                    y7327269104420830054R.j();
                }
            }
        }
    }

    public /* synthetic */ R4689349539015301944(String str) {
        super(str);
    }

    public /* synthetic */ R4689349539015301944(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
