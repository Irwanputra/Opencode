package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X16625187937554653603 implements G4373553504164397325 {
    public final W1972671267364756056 A;
    public final V697849047308847220 B;
    public final V697849047308847220 C;
    public final V697849047308847220 D;
    public final V697849047308847220 E;
    public boolean a;
    public Z10384052377193817149 b;
    public final V697849047308847220 c;
    public final N3336634644320470588 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final V16232943500580701817 k;
    public final boolean l;
    public final V697849047308847220 m;
    public R8540738700654750557 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f571o;
    public final S9385204271696540760 p;
    public final P6024466796603310388 q;
    public final P6024466796603310388 r;
    public final B14178846910827721115 s;
    public final B140335324496508088 t;
    public final V12816289154094534935 u;
    public final U8557721631511515756 v;
    public final V697849047308847220 w;
    public final O8465802837550908662 x;
    public final Y18072866666914382106 y;
    public final W1972671267364756056 z;

    public X16625187937554653603(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            Y16081827717826519461.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = V4416135141588678913.t(new L2216691091636065972(0L));
        this.d = new N3336634644320470588(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final byte b = 0;
        this.k = new V16232943500580701817(new F4096073349764486348(this) { // from class: dev.epro.r0.L17421747404679839651
            public final /* synthetic */ X16625187937554653603 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // dev.epro.r0.F4096073349764486348
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L17421747404679839651.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b2 = 1;
        this.l = true;
        this.m = new V697849047308847220(G14082206658910936320.b, B14824868959299866349.k);
        this.n = G14082206658910936320.a;
        this.p = new S9385204271696540760();
        this.q = new P6024466796603310388(-1);
        this.r = new P6024466796603310388(i);
        Z3658309082448601011.c(new I126528583771688852(this, b));
        Z3658309082448601011.c(new I126528583771688852(this, b2));
        B14178846910827721115 b14178846910827721115 = new B14178846910827721115(new F4096073349764486348(this) { // from class: dev.epro.r0.L17421747404679839651
            public final /* synthetic */ X16625187937554653603 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // dev.epro.r0.F4096073349764486348
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L17421747404679839651.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.s = b14178846910827721115;
        this.t = new B140335324496508088(new F6942723054099263096((Object) this, (byte) 24), b14178846910827721115, new I126528583771688852(this, (byte) 2));
        this.u = new V12816289154094534935((byte) 1);
        this.v = new U8557721631511515756();
        this.w = V4416135141588678913.t(null);
        this.x = new O8465802837550908662(this, (byte) 2);
        O15160157444238005800.b(0, 0, 0, 0, 15);
        this.y = new Y18072866666914382106();
        this.z = C775827382551829194.E();
        this.A = C775827382551829194.E();
        Boolean bool = Boolean.FALSE;
        this.B = V4416135141588678913.t(bool);
        this.C = V4416135141588678913.t(bool);
        this.D = V4416135141588678913.t(bool);
        this.E = V4416135141588678913.t(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r9.e(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object q(dev.epro.r0.X16625187937554653603 r6, dev.epro.r0.D6414970586266598845 r7, dev.epro.r0.L12639328004344855510 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof dev.epro.r0.B14094837580442189596
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.B14094837580442189596 r0 = (dev.epro.r0.B14094837580442189596) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            dev.epro.r0.B14094837580442189596 r0 = new dev.epro.r0.B14094837580442189596
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.w
            int r1 = r0.y
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            dev.epro.r0.X16625187937554653603 r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L7d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L33:
            dev.epro.r0.R14062301455140331524 r6 = r0.v
            r8 = r6
            dev.epro.r0.L12639328004344855510 r8 = (dev.epro.r0.L12639328004344855510) r8
            dev.epro.r0.D6414970586266598845 r7 = r0.u
            dev.epro.r0.X16625187937554653603 r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L55
        L40:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.t = r6
            r0.u = r7
            r9 = r8
            dev.epro.r0.R14062301455140331524 r9 = (dev.epro.r0.R14062301455140331524) r9
            r0.v = r9
            r0.y = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L7c
        L55:
            dev.epro.r0.V16232943500580701817 r9 = r6.k
            boolean r9 = r9.b()
            if (r9 != 0) goto L6c
            dev.epro.r0.N3336634644320470588 r9 = r6.d
            java.lang.Object r9 = r9.c
            dev.epro.r0.P6024466796603310388 r9 = (dev.epro.r0.P6024466796603310388) r9
            int r9 = r9.g()
            dev.epro.r0.P6024466796603310388 r1 = r6.r
            r1.h(r9)
        L6c:
            dev.epro.r0.V16232943500580701817 r9 = r6.k
            r0.t = r6
            r0.u = r2
            r0.v = r2
            r0.y = r3
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r5) goto L7d
        L7c:
            return r5
        L7d:
            r7 = -1
            dev.epro.r0.P6024466796603310388 r6 = r6.q
            r6.h(r7)
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X16625187937554653603.q(dev.epro.r0.X16625187937554653603, dev.epro.r0.D6414970586266598845, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean a() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean b() {
        return this.k.b();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean c() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final float d(float f) {
        return this.k.d(f);
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final Object e(D6414970586266598845 d6414970586266598845, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        return q(this, d6414970586266598845, l12639328004344855510, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, dev.epro.r0.M7102034154292440921 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof dev.epro.r0.I5847792700238581680
            if (r3 == 0) goto L14
            r3 = r14
            dev.epro.r0.I5847792700238581680 r3 = (dev.epro.r0.I5847792700238581680) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.x = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            dev.epro.r0.I5847792700238581680 r3 = new dev.epro.r0.I5847792700238581680
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.v
            int r3 = r6.x
            r7 = 0
            r4 = 0
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            r9 = 2
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r9) goto L30
            dev.epro.r0.E17665849472693074628.k(r2)
            return r8
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r7
        L36:
            int r0 = r6.t
            dev.epro.r0.M7102034154292440921 r3 = r6.u
            dev.epro.r0.E17665849472693074628.k(r2)
            r2 = r4
            r4 = r3
            goto L73
        L40:
            dev.epro.r0.E17665849472693074628.k(r2)
            dev.epro.r0.N3336634644320470588 r2 = r11.d
            java.lang.Object r3 = r2.c
            dev.epro.r0.P6024466796603310388 r3 = (dev.epro.r0.P6024466796603310388) r3
            int r3 = r3.g()
            if (r12 != r3) goto L5c
            java.lang.Object r2 = r2.d
            dev.epro.r0.O15319392248629494012 r2 = (dev.epro.r0.O15319392248629494012) r2
            float r2 = r2.g()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5c
            goto L92
        L5c:
            int r2 = r11.l()
            if (r2 != 0) goto L63
            goto L92
        L63:
            r6.u = r13
            r6.t = r12
            r6.x = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r10) goto L70
            goto L91
        L70:
            r0 = r12
            r2 = r4
            r4 = r13
        L73:
            int r0 = r11.j(r0)
            int r3 = r11.n()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            dev.epro.r0.O4748680816771539918 r0 = new dev.epro.r0.O4748680816771539918
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.u = r7
            r6.x = r9
            dev.epro.r0.D6414970586266598845 r2 = dev.epro.r0.D6414970586266598845.a
            java.lang.Object r0 = r11.e(r2, r0, r6)
            if (r0 != r10) goto L92
        L91:
            return r10
        L92:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X16625187937554653603.f(int, dev.epro.r0.M7102034154292440921, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0338 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:137:0x02e6, B:140:0x02ef, B:143:0x02fc, B:145:0x0308, B:153:0x033e, B:151:0x0338, B:148:0x0320), top: B:169:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(dev.epro.r0.Z10384052377193817149 r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X16625187937554653603.h(dev.epro.r0.Z10384052377193817149, boolean, boolean):void");
    }

    public final Object i(K14749510448791472029 k14749510448791472029) {
        Object objD;
        return (this.m.getValue() == G14082206658910936320.b && (objD = this.v.d(k14749510448791472029)) == Z3437138737604933638.a) ? objD : O9245300239821758723.a;
    }

    public final int j(int i) {
        if (l() > 0) {
            return W7808703833045379622.q(i, 0, l() - 1);
        }
        return 0;
    }

    public final Z10384052377193817149 k() {
        return (Z10384052377193817149) this.m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((Z10384052377193817149) this.m.getValue()).b;
    }

    public final int n() {
        return ((Z10384052377193817149) this.m.getValue()).c + m();
    }

    public final long o() {
        return ((L2216691091636065972) this.c.getValue()).a;
    }

    public final boolean p() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final void r(float f, int i, boolean z) {
        N3336634644320470588 n3336634644320470588 = this.d;
        P6024466796603310388 p6024466796603310388 = (P6024466796603310388) n3336634644320470588.c;
        O15319392248629494012 o15319392248629494012 = (O15319392248629494012) n3336634644320470588.d;
        if (p6024466796603310388.g() != i || o15319392248629494012.g() != f) {
            this.t.g();
        }
        ((P6024466796603310388) n3336634644320470588.c).h(i);
        ((L16987758992765039378) n3336634644320470588.f).a(i);
        o15319392248629494012.h(f);
        n3336634644320470588.e = null;
        if (!z) {
            this.A.setValue(O9245300239821758723.a);
            return;
        }
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) this.w.getValue();
        if (h11725168162114556860 != null) {
            h11725168162114556860.k();
        }
    }
}
