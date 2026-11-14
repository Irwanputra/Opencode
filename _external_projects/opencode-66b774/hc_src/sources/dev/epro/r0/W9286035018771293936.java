package dev.epro.r0;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class W9286035018771293936 extends I17129535152515035455 implements W8575158046285589709 {
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ int j = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        i = unsafe.objectFieldOffset(W9286035018771293936.class.getDeclaredField("_queue$volatile"));
        g = unsafe.objectFieldOffset(W9286035018771293936.class.getDeclaredField("_delayed$volatile"));
        h = unsafe.objectFieldOffset(W9286035018771293936.class.getDeclaredField("_isCompleted$volatile"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // dev.epro.r0.I17129535152515035455
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long G() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W9286035018771293936.G():long");
    }

    public void I(Runnable runnable) {
        J();
        if (!K(runnable)) {
            Y8284122368275782397.k.I(runnable);
            return;
        }
        Thread L = L();
        if (Thread.currentThread() != L) {
            LockSupport.unpark(L);
        }
    }

    public final void J() {
        Y7561558295041324700 y7561558295041324700;
        U2553720332627295302 u2553720332627295302 = (U2553720332627295302) T5284056093300834442.a.getObjectVolatile(this, g);
        if (u2553720332627295302 == null || u2553720332627295302.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (u2553720332627295302) {
                try {
                    Y7561558295041324700[] y7561558295041324700Arr = u2553720332627295302.a;
                    Y7561558295041324700 y75615582950413247002 = y7561558295041324700Arr != null ? y7561558295041324700Arr[0] : null;
                    if (y75615582950413247002 != null) {
                        y7561558295041324700 = ((nanoTime - y75615582950413247002.a) > 0L ? 1 : ((nanoTime - y75615582950413247002.a) == 0L ? 0 : -1)) >= 0 ? K(y75615582950413247002) : false ? u2553720332627295302.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (y7561558295041324700 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(java.lang.Runnable r15) {
        /*
            r14 = this;
        L0:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r1 = dev.epro.r0.W9286035018771293936.i
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            long r3 = dev.epro.r0.W9286035018771293936.h
            int r0 = r0.getIntVolatile(r14, r3)
            r3 = 0
            if (r0 == 0) goto L12
            return r3
        L12:
            r0 = 1
            if (r7 != 0) goto L2e
        L15:
            sun.misc.Unsafe r8 = dev.epro.r0.T5284056093300834442.a
            long r10 = dev.epro.r0.W9286035018771293936.i
            r12 = 0
            r9 = r14
            r13 = r15
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r4 = r9
            if (r14 == 0) goto L24
            goto L78
        L24:
            java.lang.Object r14 = r8.getObjectVolatile(r4, r1)
            if (r14 == 0) goto L2b
            goto L7f
        L2b:
            r14 = r4
            r15 = r13
            goto L15
        L2e:
            r4 = r14
            r13 = r15
            boolean r14 = r7 instanceof dev.epro.r0.N6572332724797096369
            if (r14 == 0) goto L59
            r14 = r7
            dev.epro.r0.N6572332724797096369 r14 = (dev.epro.r0.N6572332724797096369) r14
            int r15 = r14.a(r13)
            if (r15 == 0) goto L78
            if (r15 == r0) goto L43
            r14 = 2
            if (r15 == r14) goto L5d
            goto L7f
        L43:
            dev.epro.r0.N6572332724797096369 r8 = r14.c()
        L47:
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r5 = dev.epro.r0.W9286035018771293936.i
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L52
            goto L7f
        L52:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L47
            goto L7f
        L59:
            dev.epro.r0.D14731132657808549702 r14 = dev.epro.r0.E12775674050813925581.l
            if (r7 != r14) goto L5e
        L5d:
            return r3
        L5e:
            dev.epro.r0.N6572332724797096369 r8 = new dev.epro.r0.N6572332724797096369
            r14 = 8
            r8.<init>(r14, r0)
            r14 = r7
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            r8.a(r14)
            r8.a(r13)
        L6e:
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r5 = dev.epro.r0.W9286035018771293936.i
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L79
        L78:
            return r0
        L79:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L6e
        L7f:
            r14 = r4
            r15 = r13
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W9286035018771293936.K(java.lang.Runnable):boolean");
    }

    public abstract Thread L();

    public final boolean M() {
        N11678082982039175888 n11678082982039175888 = this.e;
        if (n11678082982039175888 != null ? n11678082982039175888.isEmpty() : true) {
            Unsafe unsafe = T5284056093300834442.a;
            U2553720332627295302 u2553720332627295302 = (U2553720332627295302) unsafe.getObjectVolatile(this, g);
            if (u2553720332627295302 != null && u2553720332627295302.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, i);
            if (objectVolatile != null) {
                if (objectVolatile instanceof N6572332724797096369) {
                    long longVolatile = unsafe.getLongVolatile((N6572332724797096369) objectVolatile, N6572332724797096369.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == E12775674050813925581.l) {
                }
            }
            return true;
        }
        return false;
    }

    public void N(long j2, Y7561558295041324700 y7561558295041324700) {
        Y8284122368275782397.k.O(j2, y7561558295041324700);
    }

    public final void O(long j2, Y7561558295041324700 y7561558295041324700) {
        W9286035018771293936 w9286035018771293936;
        int b;
        Unsafe unsafe;
        Thread L;
        long j3 = g;
        Unsafe unsafe2 = T5284056093300834442.a;
        if (unsafe2.getIntVolatile(this, h) != 0) {
            w9286035018771293936 = this;
            b = 1;
        } else {
            U2553720332627295302 u2553720332627295302 = (U2553720332627295302) unsafe2.getObjectVolatile(this, j3);
            if (u2553720332627295302 == null) {
                U2553720332627295302 u25537203326272953022 = new U2553720332627295302();
                u25537203326272953022.c = j2;
                while (true) {
                    unsafe = T5284056093300834442.a;
                    w9286035018771293936 = this;
                    if (!unsafe.compareAndSwapObject(w9286035018771293936, g, (Object) null, u25537203326272953022) && unsafe.getObjectVolatile(w9286035018771293936, j3) == null) {
                        this = w9286035018771293936;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(w9286035018771293936, j3);
                objectVolatile.getClass();
                u2553720332627295302 = (U2553720332627295302) objectVolatile;
                unsafe2 = unsafe;
            } else {
                w9286035018771293936 = this;
            }
            b = y7561558295041324700.b(j2, u2553720332627295302, w9286035018771293936);
        }
        if (b != 0) {
            if (b == 1) {
                w9286035018771293936.N(j2, y7561558295041324700);
                return;
            } else {
                if (b == 2) {
                    return;
                }
                S10973172697741180971.m("unexpected result");
                return;
            }
        }
        U2553720332627295302 u25537203326272953023 = (U2553720332627295302) unsafe2.getObjectVolatile(w9286035018771293936, j3);
        if (u25537203326272953023 != null) {
            synchronized (u25537203326272953023) {
                Y7561558295041324700[] y7561558295041324700Arr = u25537203326272953023.a;
                r12 = y7561558295041324700Arr != null ? y7561558295041324700Arr[0] : null;
            }
        }
        if (r12 != y7561558295041324700 || Thread.currentThread() == (L = w9286035018771293936.L())) {
            return;
        }
        LockSupport.unpark(L);
    }

    @Override // dev.epro.r0.W8575158046285589709
    public U16840712152025914198 d(long j2, Runnable runnable, G8001132634698687269 g8001132634698687269) {
        return I14719250900203285588.a.d(j2, runnable, g8001132634698687269);
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final void h(long j2, H7219028874700587498 h7219028874700587498) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            N5933038264079785158 n5933038264079785158 = new N5933038264079785158(this, j3 + nanoTime, h7219028874700587498);
            O(nanoTime, n5933038264079785158);
            h7219028874700587498.w(new T5499530138885127132(n5933038264079785158, (byte) 2));
        }
    }

    @Override // dev.epro.r0.I17129535152515035455
    public void shutdown() {
        D14731132657808549702 d14731132657808549702;
        Unsafe unsafe;
        Y7561558295041324700 c;
        P13752028179861838617.a.set(null);
        T5284056093300834442.a.putIntVolatile(this, h, 1);
        D14731132657808549702 d147311326578085497022 = E12775674050813925581.l;
        long j2 = i;
        loop0: while (true) {
            Object objectVolatile = T5284056093300834442.a.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = T5284056093300834442.a;
                    d14731132657808549702 = d147311326578085497022;
                    if (unsafe2.compareAndSwapObject(this, i, (Object) null, d147311326578085497022)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    } else {
                        d147311326578085497022 = d14731132657808549702;
                    }
                }
                d147311326578085497022 = d14731132657808549702;
            } else {
                d14731132657808549702 = d147311326578085497022;
                if (objectVolatile instanceof N6572332724797096369) {
                    ((N6572332724797096369) objectVolatile).b();
                    break;
                }
                if (objectVolatile == d14731132657808549702) {
                    break;
                }
                N6572332724797096369 n6572332724797096369 = new N6572332724797096369(8, true);
                n6572332724797096369.a((Runnable) objectVolatile);
                do {
                    unsafe = T5284056093300834442.a;
                    if (unsafe.compareAndSwapObject(this, i, objectVolatile, n6572332724797096369)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
                d147311326578085497022 = d14731132657808549702;
            }
        }
        while (G() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            U2553720332627295302 u2553720332627295302 = (U2553720332627295302) T5284056093300834442.a.getObjectVolatile(this, g);
            if (u2553720332627295302 == null) {
                return;
            }
            synchronized (u2553720332627295302) {
                c = u2553720332627295302.b() > 0 ? u2553720332627295302.c(0) : null;
            }
            if (c == null) {
                return;
            } else {
                N(nanoTime, c);
            }
        }
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        I(runnable);
    }
}
