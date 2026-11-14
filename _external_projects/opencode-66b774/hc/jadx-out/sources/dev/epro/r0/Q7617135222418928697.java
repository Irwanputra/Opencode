package dev.epro.r0;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q7617135222418928697 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        a = unsafe.objectFieldOffset(Q7617135222418928697.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(Q7617135222418928697.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(Q7617135222418928697.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean e(Q7617135222418928697 q7617135222418928697, int i) {
        Q7617135222418928697 q76171352224189286972;
        Q7617135222418928697 q76171352224189286973;
        while (true) {
            Q7617135222418928697 q7617135222418928697J = this.j();
            if (q7617135222418928697J instanceof R12383963674855877097) {
                return (((R12383963674855877097) q7617135222418928697J).d & i) == 0 && q7617135222418928697J.e(q7617135222418928697, i);
            }
            Unsafe unsafe = T5284056093300834442.a;
            unsafe.putObjectVolatile(q7617135222418928697, b, q7617135222418928697J);
            long j = a;
            unsafe.putObjectVolatile(q7617135222418928697, j, this);
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                q76171352224189286972 = this;
                q76171352224189286973 = q7617135222418928697;
                if (unsafe2.compareAndSwapObject(q7617135222418928697J, a, q76171352224189286972, q76171352224189286973)) {
                    q76171352224189286973.g(q76171352224189286972);
                    return true;
                }
                if (unsafe2.getObjectVolatile(q7617135222418928697J, j) != q76171352224189286972) {
                    break;
                }
                this = q76171352224189286972;
                q7617135222418928697 = q76171352224189286973;
            }
            this = q76171352224189286972;
            q7617135222418928697 = q76171352224189286973;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Q7617135222418928697 f() {
        /*
            r15 = this;
        L0:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r1 = dev.epro.r0.Q7617135222418928697.b
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            dev.epro.r0.Q7617135222418928697 r7 = (dev.epro.r0.Q7617135222418928697) r7
            r0 = 0
            r9 = r0
            r8 = r7
        Le:
            if (r8 == 0) goto L7b
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r4 = dev.epro.r0.Q7617135222418928697.a
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L36
            if (r7 != r8) goto L1d
            goto L2a
        L1d:
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r5 = dev.epro.r0.Q7617135222418928697.b
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L33
        L31:
            r15 = r7
            goto L0
        L33:
            r15 = r7
            r7 = r14
            goto L1d
        L36:
            r14 = r7
            r7 = r15
            boolean r15 = r7.k()
            if (r15 == 0) goto L3f
            return r0
        L3f:
            boolean r15 = r6 instanceof dev.epro.r0.J10149299614054140776
            if (r15 == 0) goto L72
            if (r9 == 0) goto L62
            dev.epro.r0.J10149299614054140776 r6 = (dev.epro.r0.J10149299614054140776) r6
            dev.epro.r0.Q7617135222418928697 r13 = r6.a
        L49:
            r12 = r8
            sun.misc.Unsafe r8 = dev.epro.r0.T5284056093300834442.a
            long r10 = dev.epro.r0.Q7617135222418928697.a
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L5b
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto Le
        L5b:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L49
            goto L31
        L62:
            if (r8 == 0) goto L6e
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            dev.epro.r0.Q7617135222418928697 r8 = (dev.epro.r0.Q7617135222418928697) r8
        L6b:
            r15 = r7
            r7 = r14
            goto Le
        L6e:
            dev.epro.r0.Z3383101362411723454.s()
            return r0
        L72:
            r6.getClass()
            r15 = r6
            dev.epro.r0.Q7617135222418928697 r15 = (dev.epro.r0.Q7617135222418928697) r15
            r9 = r8
            r8 = r15
            goto L6b
        L7b:
            dev.epro.r0.Z3383101362411723454.s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q7617135222418928697.f():dev.epro.r0.Q7617135222418928697");
    }

    public final void g(Q7617135222418928697 q7617135222418928697) {
        Q7617135222418928697 q76171352224189286972;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = b;
            Q7617135222418928697 q76171352224189286973 = (Q7617135222418928697) unsafe.getObjectVolatile(q7617135222418928697, j);
            if (this.h() != q7617135222418928697) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                q76171352224189286972 = this;
                Q7617135222418928697 q76171352224189286974 = q7617135222418928697;
                if (unsafe2.compareAndSwapObject(q76171352224189286974, b, q76171352224189286973, q76171352224189286972)) {
                    if (q76171352224189286972.k()) {
                        q76171352224189286974.f();
                        return;
                    }
                    return;
                } else {
                    q7617135222418928697 = q76171352224189286974;
                    if (unsafe2.getObjectVolatile(q76171352224189286974, j) != q76171352224189286973) {
                        break;
                    } else {
                        this = q76171352224189286972;
                    }
                }
            }
            this = q76171352224189286972;
        }
    }

    public final Object h() {
        return T5284056093300834442.a.getObjectVolatile(this, a);
    }

    public final Q7617135222418928697 i() {
        Object objH = h();
        J10149299614054140776 j10149299614054140776 = objH instanceof J10149299614054140776 ? (J10149299614054140776) objH : null;
        if (j10149299614054140776 != null) {
            return j10149299614054140776.a;
        }
        objH.getClass();
        return (Q7617135222418928697) objH;
    }

    public final Q7617135222418928697 j() {
        Q7617135222418928697 q7617135222418928697F = f();
        if (q7617135222418928697F != null) {
            return q7617135222418928697F;
        }
        Unsafe unsafe = T5284056093300834442.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            Q7617135222418928697 q7617135222418928697 = (Q7617135222418928697) objectVolatile;
            if (!q7617135222418928697.k()) {
                return q7617135222418928697;
            }
            objectVolatile = T5284056093300834442.a.getObjectVolatile(q7617135222418928697, j);
        }
    }

    public boolean k() {
        return h() instanceof J10149299614054140776;
    }

    public String toString() {
        return new X17141003924729678956(this, D15445857918358799638.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 3) + '@' + D15445857918358799638.I(this);
    }
}
