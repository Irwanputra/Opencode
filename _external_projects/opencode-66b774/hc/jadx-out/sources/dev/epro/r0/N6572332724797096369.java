package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N6572332724797096369 {
    public static final D14731132657808549702 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        f = unsafe.objectFieldOffset(N6572332724797096369.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(N6572332724797096369.class.getDeclaredField("_state$volatile"));
        e = new D14731132657808549702("REMOVE_FROZEN", (byte) 25);
    }

    public N6572332724797096369(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            S10973172697741180971.m("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        S10973172697741180971.m("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        N6572332724797096369 n6572332724797096369 = this;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(n6572332724797096369, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = n6572332724797096369.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = n6572332724797096369.b;
            AtomicReferenceArray atomicReferenceArray = n6572332724797096369.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(n6572332724797096369, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    N6572332724797096369 n6572332724797096369C = this;
                    while ((T5284056093300834442.a.getLongVolatile(n6572332724797096369C, j) & 1152921504606846976L) != 0) {
                        n6572332724797096369C = n6572332724797096369C.c();
                        AtomicReferenceArray atomicReferenceArray2 = n6572332724797096369C.d;
                        int i4 = n6572332724797096369C.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C3216923031738322397) && ((C3216923031738322397) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            n6572332724797096369C = null;
                        }
                        if (n6572332724797096369C == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                n6572332724797096369 = this;
            } else {
                int i5 = n6572332724797096369.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = T5284056093300834442.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            N6572332724797096369 n6572332724797096369 = this;
            if (T5284056093300834442.a.compareAndSwapLong(n6572332724797096369, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = n6572332724797096369;
        }
    }

    public final N6572332724797096369 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = T5284056093300834442.a;
            long j2 = g;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = T5284056093300834442.a;
            long j3 = f;
            N6572332724797096369 n6572332724797096369 = (N6572332724797096369) unsafe3.getObjectVolatile(this, j3);
            if (n6572332724797096369 != null) {
                return n6572332724797096369;
            }
            N6572332724797096369 n65723327247970963692 = new N6572332724797096369(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c3216923031738322397 = this.d.get(i4);
                if (c3216923031738322397 == null) {
                    c3216923031738322397 = new C3216923031738322397(i);
                }
                n65723327247970963692.d.set(n65723327247970963692.c & i, c3216923031738322397);
                i++;
            }
            T5284056093300834442.a.putLongVolatile(n65723327247970963692, g, j & (-1152921504606846977L));
            do {
                unsafe = T5284056093300834442.a;
                if (unsafe.compareAndSwapObject(this, f, (Object) null, n65723327247970963692)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r34 = this;
            r1 = r34
        L2:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r2 = dev.epro.r0.N6572332724797096369.g
            long r4 = r0.getLongVolatile(r1, r2)
            r8 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r4 & r8
            r10 = 0
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L17
            dev.epro.r0.D14731132657808549702 r0 = dev.epro.r0.N6572332724797096369.e
            return r0
        L17:
            r12 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r4 & r12
            int r6 = (int) r6
            r14 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r14 = r14 & r4
            r7 = 30
            long r14 = r14 >> r7
            int r7 = (int) r14
            int r14 = r1.c
            r7 = r7 & r14
            r14 = r14 & r6
            r15 = 0
            if (r7 != r14) goto L2f
            goto L44
        L2f:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.d
            r16 = r8
            java.lang.Object r8 = r7.get(r14)
            boolean r9 = r1.b
            if (r8 != 0) goto L3e
            if (r9 == 0) goto L2
            goto L44
        L3e:
            r18 = r10
            boolean r10 = r8 instanceof dev.epro.r0.C3216923031738322397
            if (r10 == 0) goto L45
        L44:
            return r15
        L45:
            int r6 = r6 + 1
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            r6 = r6 & r10
            r10 = -1073741824(0xffffffffc0000000, double:NaN)
            long r20 = r4 & r10
            r22 = r10
            long r10 = (long) r6
            long r20 = r20 | r10
            r24 = r12
            r12 = r7
            r6 = r20
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L64
            r12.set(r14, r15)
            return r8
        L64:
            r1 = r34
            if (r9 == 0) goto L2
        L68:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r2 = dev.epro.r0.N6572332724797096369.g
            long r30 = r0.getLongVolatile(r1, r2)
            long r4 = r30 & r24
            int r4 = (int) r4
            long r5 = r30 & r16
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 == 0) goto L7f
            dev.epro.r0.N6572332724797096369 r0 = r1.c()
            r1 = r0
            goto L98
        L7f:
            long r5 = r30 & r22
            long r32 = r5 | r10
            r26 = r0
            r27 = r1
            r28 = r2
            boolean r0 = r26.compareAndSwapLong(r27, r28, r30, r32)
            if (r0 == 0) goto L68
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.d
            int r1 = r1.c
            r1 = r1 & r4
            r0.set(r1, r15)
            r1 = r15
        L98:
            if (r1 != 0) goto L68
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N6572332724797096369.d():java.lang.Object");
    }
}
