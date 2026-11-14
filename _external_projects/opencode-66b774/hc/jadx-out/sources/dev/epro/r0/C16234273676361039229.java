package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C16234273676361039229 extends H17686692708284905246 {
    public final T1542296375665870064 p;

    public C16234273676361039229(int i, T1542296375665870064 t1542296375665870064) {
        super(i);
        this.p = t1542296375665870064;
        if (t1542296375665870064 == T1542296375665870064.a) {
            K2042933864045806308.l("This implementation does not support suspension for senders, use ", J17975719213314763068.a(H17686692708284905246.class).c(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        S10973172697741180971.i(G6547577305291411977.o(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // dev.epro.r0.H17686692708284905246
    public final boolean B() {
        return this.p == T1542296375665870064.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            dev.epro.r0.T1542296375665870064 r1 = r15.p
            dev.epro.r0.T1542296375665870064 r2 = dev.epro.r0.T1542296375665870064.c
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.a(r16)
            boolean r1 = r0 instanceof dev.epro.r0.F15209282533750470613
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof dev.epro.r0.I12241705932167711945
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            dev.epro.r0.D14731132657808549702 r6 = dev.epro.r0.J11102083402305026174.d
            sun.misc.Unsafe r1 = dev.epro.r0.T5284056093300834442.a
            long r2 = dev.epro.r0.H17686692708284905246.n
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            dev.epro.r0.E7893495821728651450 r1 = (dev.epro.r0.E7893495821728651450) r1
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = dev.epro.r0.H17686692708284905246.b
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.y(r2, r7)
            int r9 = dev.epro.r0.J11102083402305026174.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.d
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L55
            dev.epro.r0.E7893495821728651450 r2 = r15.k(r2, r1)
            if (r2 != 0) goto L54
            if (r7 == 0) goto L23
            java.lang.Throwable r0 = r15.u()
            dev.epro.r0.I12241705932167711945 r1 = new dev.epro.r0.I12241705932167711945
            r1.<init>(r0)
            return r1
        L54:
            r1 = r2
        L55:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = r0.N(r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb5
            r3 = 1
            if (r12 == r3) goto Lb4
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L74
            r2 = 5
            if (r12 == r2) goto L70
            goto L23
        L70:
            r1.a()
            goto L23
        L74:
            long r2 = r15.t()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7f
            r1.a()
        L7f:
            java.lang.Throwable r0 = r15.u()
            dev.epro.r0.I12241705932167711945 r1 = new dev.epro.r0.I12241705932167711945
            r1.<init>(r0)
            return r1
        L89:
            java.lang.String r0 = "unexpected"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r13
        L8f:
            if (r7 == 0) goto L9e
            r1.i()
            java.lang.Throwable r0 = r15.u()
            dev.epro.r0.I12241705932167711945 r1 = new dev.epro.r0.I12241705932167711945
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof dev.epro.r0.J1083986568308928281
            if (r3 == 0) goto La5
            r13 = r6
            dev.epro.r0.J1083986568308928281 r13 = (dev.epro.r0.J1083986568308928281) r13
        La5:
            if (r13 == 0) goto Lac
            int r12 = r2 + r9
            r13.a(r1, r12)
        Lac:
            long r3 = r1.d
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.g(r3)
        Lb4:
            return r8
        Lb5:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C16234273676361039229.Q(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // dev.epro.r0.H17686692708284905246, dev.epro.r0.N13814068345032586384
    public final Object a(Object obj) {
        return Q(obj, false);
    }

    @Override // dev.epro.r0.H17686692708284905246, dev.epro.r0.N13814068345032586384
    public final Object r(R4833348786910499294 r4833348786910499294, Object obj) throws Throwable {
        if (Q(obj, true) instanceof I12241705932167711945) {
            throw u();
        }
        return O9245300239821758723.a;
    }
}
