package dev.epro.r0;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class E10177778682618078576 extends J2215566372910931965 implements B18307494358031290147, K4700587928988752109, T11401768751197276141, F16971278462881137815, C12172695433110393112, T1688716394939190891, V17914047163624077766 {
    public String A = "idle";
    public R16749699847173633337 B;
    public L11334185135933894276 C;
    public R12814464680100893999 D;
    public final G14438155262350387569 E;
    public long F;
    public L11334185135933894276 G;
    public S9385204271696540760 H;
    public boolean I;
    public X7175349259954592591 J;
    public S9385204271696540760 q;
    public H15322912479122270765 r;
    public boolean s;
    public String t;
    public H10924029057425269323 u;
    public boolean v;
    public B13729205492206812220 w;
    public final O7079424195051088996 x;
    public H15322912479122270765 y;
    public J6677065442496343492 z;

    public E10177778682618078576(S9385204271696540760 s9385204271696540760, H15322912479122270765 h15322912479122270765, boolean z, boolean z2, String str, H10924029057425269323 h10924029057425269323, B13729205492206812220 b13729205492206812220) {
        this.q = s9385204271696540760;
        this.r = h15322912479122270765;
        this.s = z;
        this.t = str;
        this.u = h10924029057425269323;
        this.v = z2;
        this.w = b13729205492206812220;
        this.x = new O7079424195051088996(s9385204271696540760, 0, new C9424689592673022017(1, this, E10177778682618078576.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        G14438155262350387569 g14438155262350387569 = S11299071591039262705.a;
        this.E = new G14438155262350387569();
        this.F = 0L;
        S9385204271696540760 s93852042716965407602 = this.q;
        this.H = s93852042716965407602;
        this.I = s93852042716965407602 == null;
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final boolean B0() {
        return true;
    }

    @Override // dev.epro.r0.V17914047163624077766
    public final String L0() {
        return this.A;
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        H10924029057425269323 h10924029057425269323 = this.u;
        if (h10924029057425269323 != null) {
            U4676709778812953726.m(s2460821117650695638, h10924029057425269323.a);
        }
        String str = this.t;
        R8541388020781021827 r8541388020781021827 = new R8541388020781021827(this, (byte) 1);
        D15596191924284547207[] d15596191924284547207Arr = U4676709778812953726.a;
        s2460821117650695638.a(E5458822993765169982.b, new R17587901753867651123(str, r8541388020781021827));
        if (this.v) {
            this.x.V(s2460821117650695638);
        } else {
            s2460821117650695638.a(D10671166500636893138.j, O9245300239821758723.a);
        }
        k1(s2460821117650695638);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.C12172695433110393112
    public final void Z() {
        if (this.s) {
            I3887072968740112330.D(this, new R8541388020781021827(this, (byte) 0));
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        Z();
        if (!this.I) {
            s1();
        }
        if (this.v) {
            h1(this.x);
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        m1();
        if (this.H == null) {
            this.q = null;
        }
        R16749699847173633337 r16749699847173633337 = this.B;
        if (r16749699847173633337 != null) {
            i1(r16749699847173633337);
        }
        this.B = null;
        J6677065442496343492 j6677065442496343492 = this.z;
        if (j6677065442496343492 != null) {
            i1(j6677065442496343492);
        }
        this.z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // dev.epro.r0.K4700587928988752109
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.s1()
            long r0 = dev.epro.r0.D15445857918358799638.J(r12)
            boolean r2 = r11.v
            r3 = 3
            r4 = 0
            dev.epro.r0.G14438155262350387569 r5 = r11.E
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = dev.epro.r0.D15445857918358799638.K(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = dev.epro.r0.O5354877807466160604.V(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            dev.epro.r0.L11334185135933894276 r2 = new dev.epro.r0.L11334185135933894276
            long r9 = r11.F
            r2.<init>(r9)
            r5.i(r0, r2)
            dev.epro.r0.S9385204271696540760 r0 = r11.q
            if (r0 == 0) goto L3e
            dev.epro.r0.W5797197595347441198 r0 = r11.V0()
            dev.epro.r0.G13301441679948205994 r1 = new dev.epro.r0.G13301441679948205994
            r1.<init>(r11, r2, r4, r8)
            dev.epro.r0.R7033599853981556291.E(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.u1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.v
            if (r2 == 0) goto L78
            int r2 = dev.epro.r0.D15445857918358799638.K(r12)
            if (r2 != r6) goto L78
            boolean r2 = dev.epro.r0.O5354877807466160604.V(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.g(r0)
            dev.epro.r0.L11334185135933894276 r0 = (dev.epro.r0.L11334185135933894276) r0
            if (r0 == 0) goto L75
            dev.epro.r0.S9385204271696540760 r1 = r11.q
            if (r1 == 0) goto L72
            dev.epro.r0.W5797197595347441198 r1 = r11.V0()
            dev.epro.r0.G13301441679948205994 r2 = new dev.epro.r0.G13301441679948205994
            r2.<init>(r11, r0, r4, r3)
            dev.epro.r0.R7033599853981556291.E(r1, r4, r4, r2, r3)
        L72:
            r11.v1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E10177778682618078576.j0(android.view.KeyEvent):boolean");
    }

    public final boolean l1() {
        A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
        U1554499319261669842.u(this, J6677065442496343492.p, new W906153071831269531(new I12007476123594936550(a7209497065939201693, (byte) 1), (byte) 3));
        if (a7209497065939201693.a == null) {
            int i = G2974346431614699120.b;
            ViewParent parent = O5354877807466160604.Y(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1() {
        /*
            r17 = this;
            r0 = r17
            dev.epro.r0.S9385204271696540760 r1 = r0.q
            dev.epro.r0.G14438155262350387569 r2 = r0.E
            if (r1 == 0) goto L76
            dev.epro.r0.L11334185135933894276 r3 = r0.C
            if (r3 == 0) goto L14
            dev.epro.r0.D10175313246177059481 r4 = new dev.epro.r0.D10175313246177059481
            r4.<init>(r3)
            r1.c(r4)
        L14:
            dev.epro.r0.L11334185135933894276 r3 = r0.G
            if (r3 == 0) goto L20
            dev.epro.r0.D10175313246177059481 r4 = new dev.epro.r0.D10175313246177059481
            r4.<init>(r3)
            r1.c(r4)
        L20:
            dev.epro.r0.R12814464680100893999 r3 = r0.D
            if (r3 == 0) goto L2c
            dev.epro.r0.S6661593601236267363 r4 = new dev.epro.r0.S6661593601236267363
            r4.<init>(r3)
            r1.c(r4)
        L2c:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            dev.epro.r0.L11334185135933894276 r13 = (dev.epro.r0.L11334185135933894276) r13
            dev.epro.r0.D10175313246177059481 r14 = new dev.epro.r0.D10175313246177059481
            r14.<init>(r13)
            r1.c(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.C = r1
            r0.G = r1
            r0.D = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E10177778682618078576.m1():void");
    }

    @Override // dev.epro.r0.B18307494358031290147
    public void n0(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141, long j) {
        long jA = I3887072968740112330.A(j);
        this.F = (((long) Float.floatToRawIntBits((int) (jA & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jA >> 32)) << 32);
        s1();
        if (this.v) {
            if (this.z == null) {
                J6677065442496343492 j6677065442496343492 = new J6677065442496343492(this);
                h1(j6677065442496343492);
                this.z = j6677065442496343492;
            }
            if (j17191566391535857141 == J17191566391535857141.b) {
                int i = y1086209215650239921.f;
                R4833348786910499294 r4833348786910499294 = null;
                if (i == 4) {
                    R7033599853981556291.E(V0(), null, null, new P16848668998654070719(this, r4833348786910499294, (byte) 0), 3);
                } else if (i == 5) {
                    R7033599853981556291.E(V0(), null, null, new P16848668998654070719(this, r4833348786910499294, (byte) 1), 3);
                }
            }
        }
    }

    public final long n1(long j) {
        long jT0 = R7033599853981556291.R(this).y.t0(((K1865709164992808030) B11964701839924937722.o(this, Y238707362170117896.t)).g());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jT0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jT0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void o1(boolean z) {
        S9385204271696540760 s9385204271696540760 = this.q;
        if (s9385204271696540760 != null) {
            X7175349259954592591 x7175349259954592591 = this.J;
            R4833348786910499294 r4833348786910499294 = null;
            if (x7175349259954592591 == null || !x7175349259954592591.b()) {
                L11334185135933894276 l11334185135933894276 = z ? this.G : this.C;
                if (l11334185135933894276 != null) {
                    D10175313246177059481 d10175313246177059481 = new D10175313246177059481(l11334185135933894276);
                    Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) ((A2789795882633926065) V0()).a.get(P2382941533350862833.p);
                    R7033599853981556291.E(V0(), null, null, new H4546125934900659656((Object) s9385204271696540760, (Object) d10175313246177059481, (Object) (q15035754882231748864 != null ? q15035754882231748864.j(new J7403353095371830496(s9385204271696540760, d10175313246177059481, (byte) 0)) : null), r4833348786910499294, (byte) 0), 3);
                }
            } else {
                X7175349259954592591 x71753492599545925912 = this.J;
                if (x71753492599545925912 != null) {
                    x71753492599545925912.c(null);
                }
            }
            if (z) {
                this.G = null;
            } else {
                this.C = null;
            }
        }
    }

    @Override // dev.epro.r0.K4700587928988752109
    public final boolean p(KeyEvent keyEvent) {
        return false;
    }

    public final void p1(long j, boolean z) {
        S9385204271696540760 s9385204271696540760 = this.q;
        if (s9385204271696540760 != null) {
            X7175349259954592591 x7175349259954592591 = this.J;
            if (x7175349259954592591 == null || !x7175349259954592591.b()) {
                L11334185135933894276 l11334185135933894276 = z ? this.G : this.C;
                if (l11334185135933894276 != null) {
                    R7033599853981556291.E(V0(), null, null, new B6624716064381534511(l11334185135933894276, s9385204271696540760, null), 3);
                }
            } else {
                x7175349259954592591.c(null);
                R7033599853981556291.E(V0(), null, null, new F3485194578516100457((Object) x7175349259954592591, j, s9385204271696540760, (R4833348786910499294) null, (byte) 0), 3);
            }
            if (z) {
                this.G = null;
            } else {
                this.C = null;
            }
        }
    }

    public final void q1(V12527742189361867087 v12527742189361867087) {
        S9385204271696540760 s9385204271696540760 = this.q;
        if (s9385204271696540760 != null) {
            L11334185135933894276 l11334185135933894276 = new L11334185135933894276(v12527742189361867087.c);
            R4833348786910499294 r4833348786910499294 = null;
            if (l1()) {
                this.J = R7033599853981556291.E(V0(), null, null, new X7775063904365437305(s9385204271696540760, l11334185135933894276, this, r4833348786910499294, (byte) 0), 3);
            } else {
                this.G = l11334185135933894276;
                R7033599853981556291.E(V0(), null, null, new B6624716064381534511(s9385204271696540760, l11334185135933894276, r4833348786910499294, (byte) 1), 3);
            }
        }
    }

    public final void r1(N13196868278329319633 n13196868278329319633) {
        S9385204271696540760 s9385204271696540760 = this.q;
        if (s9385204271696540760 != null) {
            L11334185135933894276 l11334185135933894276 = new L11334185135933894276(n13196868278329319633.c);
            R4833348786910499294 r4833348786910499294 = null;
            if (l1()) {
                this.J = R7033599853981556291.E(V0(), null, null, new X7775063904365437305(s9385204271696540760, l11334185135933894276, this, r4833348786910499294, (byte) 1), 3);
            } else {
                this.C = l11334185135933894276;
                R7033599853981556291.E(V0(), null, null, new B6624716064381534511(s9385204271696540760, l11334185135933894276, r4833348786910499294, (byte) 2), 3);
            }
        }
    }

    public final void s1() {
        if (this.B != null) {
            return;
        }
        H15322912479122270765 h15322912479122270765 = this.s ? this.y : this.r;
        if (h15322912479122270765 != null) {
            S9385204271696540760 s9385204271696540760 = this.q;
            if (s9385204271696540760 == null) {
                s9385204271696540760 = new S9385204271696540760();
                this.q = s9385204271696540760;
            }
            this.x.m1(s9385204271696540760);
            S9385204271696540760 s93852042716965407602 = this.q;
            s93852042716965407602.getClass();
            R16749699847173633337 r16749699847173633337A = h15322912479122270765.a(s93852042716965407602);
            h1(r16749699847173633337A);
            this.B = r16749699847173633337A;
        }
    }

    public boolean u1(KeyEvent keyEvent) {
        return false;
    }

    public void v1(KeyEvent keyEvent) {
        w1();
    }

    public final void w1() {
        X212209155573794480 x212209155573794480 = (X212209155573794480) B11964701839924937722.o(this, Y238707362170117896.v);
        if (x212209155573794480 != null) {
            x212209155573794480.a();
        }
        this.w.invoke();
    }

    public final void x1(S9385204271696540760 s9385204271696540760, H15322912479122270765 h15322912479122270765, boolean z, boolean z2, String str, H10924029057425269323 h10924029057425269323, B13729205492206812220 b13729205492206812220) {
        boolean z3;
        boolean z4;
        R16749699847173633337 r16749699847173633337;
        boolean z5 = true;
        if (S10823041268949770285.t(this.H, s9385204271696540760)) {
            z3 = false;
        } else {
            m1();
            this.H = s9385204271696540760;
            this.q = s9385204271696540760;
            z3 = true;
        }
        if (!S10823041268949770285.t(this.r, h15322912479122270765)) {
            this.r = h15322912479122270765;
            z3 = true;
        }
        if (this.s != z) {
            this.s = z;
            if (z) {
                Z();
            }
            z3 = true;
        }
        boolean z6 = this.v;
        O7079424195051088996 o7079424195051088996 = this.x;
        if (z6 != z2) {
            if (z2) {
                h1(o7079424195051088996);
            } else {
                i1(o7079424195051088996);
                m1();
            }
            E10717724117948616506.n(this);
            if (!z2) {
                R16749699847173633337 r167496998471736333372 = this.z;
                if (r167496998471736333372 != null) {
                    i1(r167496998471736333372);
                }
                this.z = null;
                this.A = "idle";
            }
            this.v = z2;
        }
        if (!S10823041268949770285.t(this.t, str)) {
            this.t = str;
            E10717724117948616506.n(this);
        }
        if (!S10823041268949770285.t(this.u, h10924029057425269323)) {
            this.u = h10924029057425269323;
            E10717724117948616506.n(this);
        }
        this.w = b13729205492206812220;
        boolean z7 = this.I;
        S9385204271696540760 s93852042716965407602 = this.H;
        if (z7 == (s93852042716965407602 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = s93852042716965407602 == null;
            this.I = z4;
            if (z4 || this.B != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((r16749699847173633337 = this.B) != null || !z4)) {
            if (r16749699847173633337 != null) {
                i1(r16749699847173633337);
            }
            this.B = null;
            s1();
        }
        o7079424195051088996.m1(this.q);
    }

    public void t1() {
    }

    public void k1(S2460821117650695638 s2460821117650695638) {
    }
}
