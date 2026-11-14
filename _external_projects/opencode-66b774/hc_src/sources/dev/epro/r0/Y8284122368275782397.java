package dev.epro.r0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y8284122368275782397 extends W9286035018771293936 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final Y8284122368275782397 k;
    public static final long l;

    static {
        Long l2;
        Y8284122368275782397 y8284122368275782397 = new Y8284122368275782397();
        k = y8284122368275782397;
        y8284122368275782397.F(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // dev.epro.r0.W9286035018771293936
    public final void I(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.I(runnable);
    }

    @Override // dev.epro.r0.W9286035018771293936
    public final Thread L() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // dev.epro.r0.W9286035018771293936
    public final void N(long j, Y7561558295041324700 y7561558295041324700) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void P() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = T5284056093300834442.a;
            unsafe.putObjectVolatile(this, W9286035018771293936.i, (Object) null);
            unsafe.putObjectVolatile(this, W9286035018771293936.g, (Object) null);
            notifyAll();
        }
    }

    @Override // dev.epro.r0.W9286035018771293936, dev.epro.r0.W8575158046285589709
    public final U16840712152025914198 d(long j, Runnable runnable, G8001132634698687269 g8001132634698687269) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return F15788397839700158005.a;
        }
        long nanoTime = System.nanoTime();
        M9304039166107187473 m9304039166107187473 = new M9304039166107187473(runnable, j2 + nanoTime);
        O(nanoTime, m9304039166107187473);
        return m9304039166107187473;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean M;
        P13752028179861838617.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (M) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long G = G();
                    if (G == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = l + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            P();
                            if (M()) {
                                return;
                            }
                            L();
                            return;
                        }
                        if (G > j2) {
                            G = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (G > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            P();
                            if (M()) {
                                return;
                            }
                            L();
                            return;
                        }
                        LockSupport.parkNanos(this, G);
                    }
                }
            }
        } finally {
            _thread = null;
            P();
            if (!M()) {
                L();
            }
        }
    }

    @Override // dev.epro.r0.W9286035018771293936, dev.epro.r0.I17129535152515035455
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        return "DefaultExecutor";
    }
}
