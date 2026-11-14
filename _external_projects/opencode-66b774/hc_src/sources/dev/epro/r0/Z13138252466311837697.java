package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Z13138252466311837697 extends AtomicReference implements Runnable {
    public static final A8962658062045365505 a;
    public static final A8962658062045365505 b;

    static {
        byte b2 = 2;
        a = new A8962658062045365505(b2);
        b = new A8962658062045365505(b2);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        A8962658062045365505 a8962658062045365505 = b;
        A8962658062045365505 a89626580620453655052 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            X11147065291992508620 x11147065291992508620 = new X11147065291992508620(this);
            x11147065291992508620.a(Thread.currentThread());
            if (compareAndSet(runnable, x11147065291992508620)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(a89626580620453655052)) == a8962658062045365505) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        X11147065291992508620 x11147065291992508620 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof X11147065291992508620;
            A8962658062045365505 a8962658062045365505 = b;
            if (!z2 && runnable != a8962658062045365505) {
                break;
            }
            if (z2) {
                x11147065291992508620 = (X11147065291992508620) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == a8962658062045365505 || compareAndSet(runnable, a8962658062045365505)) {
                z = Thread.interrupted() || z;
                LockSupport.park(x11147065291992508620);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d = d();
            A8962658062045365505 a8962658062045365505 = a;
            if (!d) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, a8962658062045365505)) {
                            g(currentThread);
                        }
                        if (d) {
                            return;
                        }
                        a(th);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, a8962658062045365505)) {
                            g(currentThread);
                        }
                        if (!d) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof X11147065291992508620) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
