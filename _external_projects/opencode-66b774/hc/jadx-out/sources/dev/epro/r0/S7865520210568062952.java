package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S7865520210568062952 implements J13386303774951932313 {
    public final V5142773592757085764 a;
    public boolean b;

    public S7865520210568062952(V5142773592757085764 v5142773592757085764, boolean z) {
        this.a = v5142773592757085764;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.J13386303774951932313
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(long r4, long r6, dev.epro.r0.R4833348786910499294 r8) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r8 instanceof dev.epro.r0.O8499802109121609575
            if (r4 == 0) goto L13
            r4 = r8
            dev.epro.r0.O8499802109121609575 r4 = (dev.epro.r0.O8499802109121609575) r4
            int r5 = r4.w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.w = r5
            goto L1a
        L13:
            dev.epro.r0.O8499802109121609575 r4 = new dev.epro.r0.O8499802109121609575
            dev.epro.r0.K14749510448791472029 r8 = (dev.epro.r0.K14749510448791472029) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.u
            int r8 = r4.w
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.t
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r3)
            r3 = 0
            return r3
        L30:
            dev.epro.r0.E17665849472693074628.k(r5)
            boolean r5 = r3.b
            r1 = 0
            if (r5 == 0) goto L55
            dev.epro.r0.V5142773592757085764 r3 = r3.a
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L51
        L40:
            r4.t = r6
            r4.w = r0
            java.lang.Object r5 = r3.a(r6, r4)
            dev.epro.r0.Z3437138737604933638 r3 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r3) goto L4d
            return r3
        L4d:
            dev.epro.r0.L9139634373441254073 r5 = (dev.epro.r0.L9139634373441254073) r5
            long r1 = r5.a
        L51:
            long r1 = dev.epro.r0.L9139634373441254073.d(r6, r1)
        L55:
            dev.epro.r0.L9139634373441254073 r3 = new dev.epro.r0.L9139634373441254073
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7865520210568062952.I0(long, long, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final long c0(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        V5142773592757085764 v5142773592757085764 = this.a;
        if (v5142773592757085764.a.b()) {
            return 0L;
        }
        return v5142773592757085764.i(v5142773592757085764.e(v5142773592757085764.a.d(v5142773592757085764.e(v5142773592757085764.h(j2)))));
    }
}
