package dev.epro.r0;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O1218119530002257462 extends R15896830329318850690 implements D10205225622993155321, V6844203142031704410, T11401768751197276141 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f396o;
    public S16571168858015125610 p;
    public U14340554418656580554 q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public HashMap v;
    public U12360584732002626345 w;
    public T8076737975737680466 x;
    public J13160356703928124810 y;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // dev.epro.r0.V6844203142031704410
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(dev.epro.r0.N17396598995248644478 r11) {
        /*
            r10 = this;
            boolean r0 = r10.n
            if (r0 != 0) goto L6
            goto L94
        L6:
            dev.epro.r0.J13160356703928124810 r0 = r10.y
            if (r0 == 0) goto L16
            boolean r1 = r0.c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            dev.epro.r0.U12360584732002626345 r0 = r0.d
            if (r0 != 0) goto L1a
        L16:
            dev.epro.r0.U12360584732002626345 r0 = r10.h1()
        L1a:
            dev.epro.r0.R8360857824092671497 r1 = r0.j
            if (r1 == 0) goto L9b
            dev.epro.r0.N16536369055082677148 r11 = r11.a
            dev.epro.r0.Q7316561721656982910 r11 = r11.b
            dev.epro.r0.V1715405128288489768 r2 = r11.A()
            boolean r11 = r0.k
            if (r11 == 0) goto L43
            long r3 = r0.l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.l()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.h(r3, r4, r5, r6, r7)
        L43:
            dev.epro.r0.S16571168858015125610 r10 = r10.p     // Catch: java.lang.Throwable -> L4f
            dev.epro.r0.W1742516786250891319 r0 = r10.a     // Catch: java.lang.Throwable -> L4f
            dev.epro.r0.W7621125212597703960 r3 = r0.m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4d
            dev.epro.r0.W7621125212597703960 r3 = dev.epro.r0.W7621125212597703960.b     // Catch: java.lang.Throwable -> L4f
        L4d:
            r6 = r3
            goto L52
        L4f:
            r0 = move-exception
            r10 = r0
            goto L95
        L52:
            dev.epro.r0.H7281108764511748709 r3 = r0.n     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L58
            dev.epro.r0.H7281108764511748709 r3 = dev.epro.r0.H7281108764511748709.d     // Catch: java.lang.Throwable -> L4f
        L58:
            r5 = r3
            dev.epro.r0.Q15653065705375360223 r3 = r0.p     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L5f
            dev.epro.r0.C10274207051762801329 r3 = dev.epro.r0.C10274207051762801329.a     // Catch: java.lang.Throwable -> L4f
        L5f:
            r7 = r3
            dev.epro.r0.T12552481909083146428 r0 = r0.a     // Catch: java.lang.Throwable -> L4f
            dev.epro.r0.D14208870094104617988 r3 = r0.c()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L74
            dev.epro.r0.W1742516786250891319 r10 = r10.a     // Catch: java.lang.Throwable -> L4f
            dev.epro.r0.T12552481909083146428 r10 = r10.a     // Catch: java.lang.Throwable -> L4f
            float r4 = r10.a()     // Catch: java.lang.Throwable -> L4f
            r1.f(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L8f
        L74:
            long r3 = dev.epro.r0.U10174709222559481877.h     // Catch: java.lang.Throwable -> L4f
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L7d
            goto L8c
        L7d:
            long r3 = r10.b()     // Catch: java.lang.Throwable -> L4f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L8a
            long r3 = r10.b()     // Catch: java.lang.Throwable -> L4f
            goto L8c
        L8a:
            long r3 = dev.epro.r0.U10174709222559481877.b     // Catch: java.lang.Throwable -> L4f
        L8c:
            r1.e(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L8f:
            if (r11 == 0) goto L94
            r2.j()
        L94:
            return
        L95:
            if (r11 == 0) goto L9a
            r2.j()
        L9a:
            throw r10
        L9b:
            dev.epro.r0.U12360584732002626345 r11 = r10.w
            dev.epro.r0.J13160356703928124810 r10 = r10.y
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ", textSubstitution="
            r0.append(r11)
            r0.append(r10)
            java.lang.String r10 = ")"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            dev.epro.r0.Y16081827717826519461.b(r10)
            dev.epro.r0.Z3383101362411723454.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1218119530002257462.E(dev.epro.r0.N17396598995248644478):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dev.epro.r0.F4096073349764486348] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dev.epro.r0.T8076737975737680466] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        T8076737975737680466 t8076737975737680466 = this.x;
        ?? r0 = t8076737975737680466;
        if (t8076737975737680466 == null) {
            final byte b = 0;
            ?? r02 = new F4096073349764486348(this) { // from class: dev.epro.r0.T8076737975737680466
                public final /* synthetic */ O1218119530002257462 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
                @Override // dev.epro.r0.F4096073349764486348
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r31) {
                    /*
                        Method dump skipped, instruction units count: 316
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T8076737975737680466.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.x = r02;
            r0 = r02;
        }
        M11181104712105445833 m11181104712105445833 = new M11181104712105445833(this.f396o);
        D15596191924284547207[] d15596191924284547207Arr = U4676709778812953726.a;
        s2460821117650695638.a(D10671166500636893138.C, K5751602218013079365.U(m11181104712105445833));
        J13160356703928124810 j13160356703928124810 = this.y;
        if (j13160356703928124810 != null) {
            boolean z = j13160356703928124810.c;
            P14992748401341948828 p14992748401341948828 = D10671166500636893138.E;
            D15596191924284547207[] d15596191924284547207Arr2 = U4676709778812953726.a;
            D15596191924284547207 d15596191924284547207 = d15596191924284547207Arr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            p14992748401341948828.getClass();
            s2460821117650695638.a(p14992748401341948828, boolValueOf);
            M11181104712105445833 m111811047121054458332 = new M11181104712105445833(j13160356703928124810.b);
            P14992748401341948828 p149927484013419488282 = D10671166500636893138.D;
            D15596191924284547207 d155961919242845472072 = d15596191924284547207Arr2[16];
            p149927484013419488282.getClass();
            s2460821117650695638.a(p149927484013419488282, m111811047121054458332);
        }
        final byte b2 = 1;
        s2460821117650695638.a(E5458822993765169982.l, new R17587901753867651123(null, new F4096073349764486348(this) { // from class: dev.epro.r0.T8076737975737680466
            public final /* synthetic */ O1218119530002257462 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
            @Override // dev.epro.r0.F4096073349764486348
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 316
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T8076737975737680466.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final byte b3 = 2;
        s2460821117650695638.a(E5458822993765169982.m, new R17587901753867651123(null, new F4096073349764486348(this) { // from class: dev.epro.r0.T8076737975737680466
            public final /* synthetic */ O1218119530002257462 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
            @Override // dev.epro.r0.F4096073349764486348
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 316
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T8076737975737680466.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        s2460821117650695638.a(E5458822993765169982.n, new R17587901753867651123(null, new E6464496061242537963(this, (byte) 6)));
        U4676709778812953726.a(s2460821117650695638, r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // dev.epro.r0.D10205225622993155321
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int W(dev.epro.r0.I11965759855724288421 r1, dev.epro.r0.G17613326942144185441 r2, int r3) {
        /*
            r0 = this;
            dev.epro.r0.J13160356703928124810 r2 = r0.y
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            dev.epro.r0.U12360584732002626345 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            dev.epro.r0.U12360584732002626345 r2 = r0.h1()
        L14:
            r2.d(r1)
            dev.epro.r0.F10342546226345611902 r0 = r1.getLayoutDirection()
            dev.epro.r0.P7456194097047421796 r0 = r2.e(r0)
            float r0 = r0.c()
            int r0 = dev.epro.r0.T13998044911588922055.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1218119530002257462.W(dev.epro.r0.I11965759855724288421, dev.epro.r0.G17613326942144185441, int):int");
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:24:0x0059, B:26:0x0069, B:28:0x0084, B:30:0x0094, B:29:0x008d, B:25:0x0062, B:31:0x00a1, B:12:0x0015), top: B:37:0x0005 }] */
    @Override // dev.epro.r0.D10205225622993155321
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.H11646813293457574213 h(dev.epro.r0.I5164649337253478959 r8, dev.epro.r0.G17613326942144185441 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1218119530002257462.h(dev.epro.r0.I5164649337253478959, dev.epro.r0.G17613326942144185441, long):dev.epro.r0.H11646813293457574213");
    }

    public final U12360584732002626345 h1() {
        S16571168858015125610 s16571168858015125610 = this.p;
        U12360584732002626345 u12360584732002626345 = this.w;
        if (u12360584732002626345 == null) {
            u12360584732002626345 = new U12360584732002626345(this.f396o, s16571168858015125610, this.q, this.r, this.s, this.t, this.u);
            this.w = u12360584732002626345;
        }
        u12360584732002626345.getClass();
        return u12360584732002626345;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // dev.epro.r0.D10205225622993155321
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l0(dev.epro.r0.I11965759855724288421 r2, dev.epro.r0.G17613326942144185441 r3, int r4) {
        /*
            r1 = this;
            dev.epro.r0.J13160356703928124810 r3 = r1.y
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            dev.epro.r0.U12360584732002626345 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            dev.epro.r0.U12360584732002626345 r3 = r1.h1()
        L14:
            r3.d(r2)
            dev.epro.r0.F10342546226345611902 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1218119530002257462.l0(dev.epro.r0.I11965759855724288421, dev.epro.r0.G17613326942144185441, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // dev.epro.r0.D10205225622993155321
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(dev.epro.r0.I11965759855724288421 r2, dev.epro.r0.G17613326942144185441 r3, int r4) {
        /*
            r1 = this;
            dev.epro.r0.J13160356703928124810 r3 = r1.y
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            dev.epro.r0.U12360584732002626345 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            dev.epro.r0.U12360584732002626345 r3 = r1.h1()
        L14:
            r3.d(r2)
            dev.epro.r0.F10342546226345611902 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1218119530002257462.r(dev.epro.r0.I11965759855724288421, dev.epro.r0.G17613326942144185441, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // dev.epro.r0.D10205225622993155321
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(dev.epro.r0.I11965759855724288421 r1, dev.epro.r0.G17613326942144185441 r2, int r3) {
        /*
            r0 = this;
            dev.epro.r0.J13160356703928124810 r2 = r0.y
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            dev.epro.r0.U12360584732002626345 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            dev.epro.r0.U12360584732002626345 r2 = r0.h1()
        L14:
            r2.d(r1)
            dev.epro.r0.F10342546226345611902 r0 = r1.getLayoutDirection()
            dev.epro.r0.P7456194097047421796 r0 = r2.e(r0)
            float r0 = r0.a()
            int r0 = dev.epro.r0.T13998044911588922055.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1218119530002257462.z(dev.epro.r0.I11965759855724288421, dev.epro.r0.G17613326942144185441, int):int");
    }
}
