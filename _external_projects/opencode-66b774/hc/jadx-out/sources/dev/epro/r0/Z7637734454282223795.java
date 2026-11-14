package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z7637734454282223795 implements R8540738700654750557, R4833348786910499294 {
    public final /* synthetic */ P9733793856018248168 a;
    public final H7219028874700587498 b;
    public H7219028874700587498 c;
    public J17191566391535857141 d = J17191566391535857141.b;
    public final /* synthetic */ P9733793856018248168 e;

    public Z7637734454282223795(P9733793856018248168 p9733793856018248168, H7219028874700587498 h7219028874700587498) {
        this.e = p9733793856018248168;
        this.a = p9733793856018248168;
        this.b = h7219028874700587498;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long E0(float f) {
        return this.a.E0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long G(float f) {
        return this.a.G(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long I(long j) {
        return this.a.I(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float K(float f) {
        return this.a.c() * f;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float P0(float f) {
        return f / this.a.c();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int X(long j) {
        return this.a.X(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float Y(long j) {
        return this.a.Y(j);
    }

    public final Object a(J17191566391535857141 j17191566391535857141, B401944902727389462 b401944902727389462) {
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(b401944902727389462));
        h7219028874700587498.t();
        this.d = j17191566391535857141;
        this.c = h7219028874700587498;
        return h7219028874700587498.r();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a.c();
    }

    public final long g() {
        P9733793856018248168 p9733793856018248168 = this.e;
        long jT0 = p9733793856018248168.t0(R7033599853981556291.R(p9733793856018248168).A.g());
        long j = p9733793856018248168.y;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jT0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jT0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int g0(float f) {
        return this.a.g0(f);
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return I3826119971291161142.a;
    }

    public final K1865709164992808030 h() {
        return R7033599853981556291.R(this.e).A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r8, dev.epro.r0.L12639328004344855510 r10, dev.epro.r0.B401944902727389462 r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof dev.epro.r0.W4838806787270647216
            if (r0 == 0) goto L13
            r0 = r11
            dev.epro.r0.W4838806787270647216 r0 = (dev.epro.r0.W4838806787270647216) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.W4838806787270647216 r0 = new dev.epro.r0.W4838806787270647216
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dev.epro.r0.X7175349259954592591 r7 = r0.t
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Throwable -> L28
            goto L68
        L28:
            r8 = move-exception
            goto L72
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r11)
            r4 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L4a
            dev.epro.r0.H7219028874700587498 r11 = r7.c
            if (r11 == 0) goto L4a
            dev.epro.r0.F3982452524614060956 r1 = new dev.epro.r0.F3982452524614060956
            r1.<init>(r8)
            dev.epro.r0.C10696704014433963524 r4 = new dev.epro.r0.C10696704014433963524
            r4.<init>(r1)
            r11.resumeWith(r4)
        L4a:
            dev.epro.r0.P9733793856018248168 r11 = r7.e
            dev.epro.r0.W5797197595347441198 r11 = r11.V0()
            dev.epro.r0.N15919677834740887145 r1 = new dev.epro.r0.N15919677834740887145
            r1.<init>(r8, r7, r2)
            r8 = 3
            dev.epro.r0.X7175349259954592591 r8 = dev.epro.r0.R7033599853981556291.E(r11, r2, r2, r1, r8)
            r0.t = r8     // Catch: java.lang.Throwable -> L6e
            r0.w = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6e
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r11 != r7) goto L67
            return r7
        L67:
            r7 = r8
        L68:
            dev.epro.r0.I7017752413650465950 r8 = dev.epro.r0.I7017752413650465950.b
            r7.c(r8)
            return r11
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            dev.epro.r0.I7017752413650465950 r9 = dev.epro.r0.I7017752413650465950.b
            r7.c(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z7637734454282223795.i(long, dev.epro.r0.L12639328004344855510, dev.epro.r0.B401944902727389462):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r5, dev.epro.r0.L12639328004344855510 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof dev.epro.r0.P15638611603726142785
            if (r0 == 0) goto L13
            r0 = r8
            dev.epro.r0.P15638611603726142785 r0 = (dev.epro.r0.P15638611603726142785) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.P15638611603726142785 r0 = new dev.epro.r0.P15638611603726142785
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.t
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: dev.epro.r0.F3982452524614060956 -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2c:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.v = r3     // Catch: dev.epro.r0.F3982452524614060956 -> L3b
            java.lang.Object r4 = r4.i(r5, r7, r0)     // Catch: dev.epro.r0.F3982452524614060956 -> L3b
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z7637734454282223795.j(long, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        P9733793856018248168 p9733793856018248168 = this.e;
        synchronized (p9733793856018248168.v) {
            p9733793856018248168.u.l(this);
        }
        this.b.resumeWith(obj);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.a.s();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long t0(long j) {
        return this.a.t0(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float v0(long j) {
        return this.a.v0(j);
    }
}
