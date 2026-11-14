package dev.epro.r0;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class X11811226133381831620 {
    public static final /* synthetic */ long a = T5284056093300834442.a.objectFieldOffset(X11811226133381831620.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new N6572332724797096369(8, false);

    public final boolean a(Runnable runnable) {
        X11811226133381831620 x11811226133381831620;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = a;
            N6572332724797096369 n6572332724797096369 = (N6572332724797096369) unsafe.getObjectVolatile(this, j);
            int a2 = n6572332724797096369.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                N6572332724797096369 c = n6572332724797096369.c();
                while (true) {
                    Unsafe unsafe2 = T5284056093300834442.a;
                    x11811226133381831620 = this;
                    if (!unsafe2.compareAndSwapObject(x11811226133381831620, a, n6572332724797096369, c) && unsafe2.getObjectVolatile(x11811226133381831620, j) == n6572332724797096369) {
                        this = x11811226133381831620;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                x11811226133381831620 = this;
            }
            this = x11811226133381831620;
        }
    }

    public final void b() {
        X11811226133381831620 x11811226133381831620;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = a;
            N6572332724797096369 n6572332724797096369 = (N6572332724797096369) unsafe.getObjectVolatile(this, j);
            if (n6572332724797096369.b()) {
                return;
            }
            N6572332724797096369 c = n6572332724797096369.c();
            while (true) {
                x11811226133381831620 = this;
                if (!T5284056093300834442.a.compareAndSwapObject(x11811226133381831620, a, n6572332724797096369, c) && T5284056093300834442.a.getObjectVolatile(x11811226133381831620, j) == n6572332724797096369) {
                    this = x11811226133381831620;
                }
            }
            this = x11811226133381831620;
        }
    }

    public final int c() {
        N6572332724797096369 n6572332724797096369 = (N6572332724797096369) T5284056093300834442.a.getObjectVolatile(this, a);
        n6572332724797096369.getClass();
        long longVolatile = T5284056093300834442.a.getLongVolatile(n6572332724797096369, N6572332724797096369.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        X11811226133381831620 x11811226133381831620;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = a;
            N6572332724797096369 n6572332724797096369 = (N6572332724797096369) unsafe.getObjectVolatile(this, j);
            Object d = n6572332724797096369.d();
            if (d != N6572332724797096369.e) {
                return d;
            }
            N6572332724797096369 c = n6572332724797096369.c();
            while (true) {
                x11811226133381831620 = this;
                if (!T5284056093300834442.a.compareAndSwapObject(x11811226133381831620, a, n6572332724797096369, c) && T5284056093300834442.a.getObjectVolatile(x11811226133381831620, j) == n6572332724797096369) {
                    this = x11811226133381831620;
                }
            }
            this = x11811226133381831620;
        }
    }
}
