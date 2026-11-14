package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R3229391822211813842 implements J12043550928838212009 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ J12043550928838212009 b;
    public final /* synthetic */ L12639328004344855510 c;

    public R3229391822211813842(J12043550928838212009 j12043550928838212009, L12639328004344855510 l12639328004344855510) {
        this.a = (byte) 0;
        this.c = l12639328004344855510;
        this.b = j12043550928838212009;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // dev.epro.r0.J12043550928838212009
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(dev.epro.r0.S7864201625552763331 r9, dev.epro.r0.R4833348786910499294 r10) {
        /*
            r8 = this;
            byte r0 = r8.a
            r1 = 3
            dev.epro.r0.J12043550928838212009 r2 = r8.b
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            dev.epro.r0.L12639328004344855510 r5 = r8.c
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L1b;
                default: goto Le;
            }
        Le:
            dev.epro.r0.Z10733167746954993267 r8 = new dev.epro.r0.Z10733167746954993267
            r8.<init>(r9, r5, r1)
            java.lang.Object r8 = r2.collect(r8, r10)
            if (r8 != r4) goto L1a
            r3 = r8
        L1a:
            return r3
        L1b:
            dev.epro.r0.M4043793213707479819 r8 = new dev.epro.r0.M4043793213707479819
            r8.<init>()
            dev.epro.r0.J4301161590161457380 r0 = new dev.epro.r0.J4301161590161457380
            r0.<init>(r8, r9, r5, r1)
            java.lang.Object r8 = r2.collect(r0, r10)
            if (r8 != r4) goto L2c
            r3 = r8
        L2c:
            return r3
        L2d:
            boolean r0 = r10 instanceof dev.epro.r0.W6187904106450766098
            if (r0 == 0) goto L40
            r0 = r10
            dev.epro.r0.W6187904106450766098 r0 = (dev.epro.r0.W6187904106450766098) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r1 & r2
            if (r6 == 0) goto L40
            int r1 = r1 - r2
            r0.u = r1
            goto L45
        L40:
            dev.epro.r0.W6187904106450766098 r0 = new dev.epro.r0.W6187904106450766098
            r0.<init>(r8, r10)
        L45:
            java.lang.Object r10 = r0.t
            int r1 = r0.u
            r2 = 0
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L69
            if (r1 == r7) goto L5d
            if (r1 != r6) goto L56
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L9a
        L56:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r3 = r2
            goto L9a
        L5d:
            dev.epro.r0.A8827556657263063407 r8 = r0.y
            dev.epro.r0.S7864201625552763331 r9 = r0.x
            dev.epro.r0.R3229391822211813842 r1 = r0.w
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L67
            goto L86
        L67:
            r9 = move-exception
            goto L9d
        L69:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.A8827556657263063407 r10 = new dev.epro.r0.A8827556657263063407
            dev.epro.r0.G8001132634698687269 r1 = r0.getContext()
            r10.<init>(r9, r1)
            r0.w = r8     // Catch: java.lang.Throwable -> L9b
            r0.x = r9     // Catch: java.lang.Throwable -> L9b
            r0.y = r10     // Catch: java.lang.Throwable -> L9b
            r0.u = r7     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r5.invoke(r10, r0)     // Catch: java.lang.Throwable -> L9b
            if (r1 != r4) goto L84
            goto L99
        L84:
            r1 = r8
            r8 = r10
        L86:
            r8.releaseIntercepted()
            dev.epro.r0.J12043550928838212009 r8 = r1.b
            r0.w = r2
            r0.x = r2
            r0.y = r2
            r0.u = r6
            java.lang.Object r8 = r8.collect(r9, r0)
            if (r8 != r4) goto L9a
        L99:
            r3 = r4
        L9a:
            return r3
        L9b:
            r9 = move-exception
            r8 = r10
        L9d:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R3229391822211813842.collect(dev.epro.r0.S7864201625552763331, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public /* synthetic */ R3229391822211813842(J12043550928838212009 j12043550928838212009, L12639328004344855510 l12639328004344855510, byte b) {
        this.a = b;
        this.b = j12043550928838212009;
        this.c = l12639328004344855510;
    }
}
