package dev.epro.r0;

import android.os.Build;
import android.view.KeyEvent;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N17102349568798422850 extends J2215566372910931965 implements V6844203142031704410, E1787814229672241378, T11401768751197276141, O10709431398915260868, B18307494358031290147, K4700587928988752109, F16971278462881137815, P9179653189917234378, C12172695433110393112, A11121185661545552785, O15099455688051794795 {
    public G14063045981989969453 A;
    public final X1076061028887460523 B;
    public H18157283590851071619 C;
    public X7175349259954592591 D;
    public final Q7316561721656982910 E;
    public final S5730883377765920436 F;
    public X7175349259954592591 G;
    public final X11739465584883262539 H;
    public final V697849047308847220 I;
    public N1420218926656397722 q;
    public I12071840179596922896 r;
    public D2717688760023469083 s;
    public boolean t;
    public W17015830374102496917 u;
    public boolean v;
    public S9385204271696540760 w;
    public Q2423450198286343102 x;
    public final O7079424195051088996 y;
    public final P9733793856018248168 z;

    public N17102349568798422850(N1420218926656397722 n1420218926656397722, I12071840179596922896 i12071840179596922896, D2717688760023469083 d2717688760023469083, boolean z, W17015830374102496917 w17015830374102496917, boolean z2, S9385204271696540760 s9385204271696540760, Q2423450198286343102 q2423450198286343102) {
        this.q = n1420218926656397722;
        this.r = i12071840179596922896;
        this.s = d2717688760023469083;
        this.t = z;
        this.u = w17015830374102496917;
        this.v = z2;
        this.w = s9385204271696540760;
        this.x = q2423450198286343102;
        byte b = 3;
        d2717688760023469083.l = new X11739465584883262539(this, b);
        byte b2 = 0;
        this.y = new O7079424195051088996(s9385204271696540760, new L2088545775067967710(this, b2), 2);
        P9733793856018248168 a = T7055906184043387232.a(new J11977321013895313576(this, (byte) 7));
        h1(a);
        this.z = a;
        byte b3 = 5;
        X11739465584883262539 x11739465584883262539 = new X11739465584883262539(this, b3);
        S5730883377765920436 s5730883377765920436 = new S5730883377765920436(this, b2);
        byte b4 = 1;
        L2088545775067967710 l2088545775067967710 = new L2088545775067967710(this, b4);
        L2088545775067967710 l20885457750679677102 = new L2088545775067967710(this, (byte) 2);
        L2088545775067967710 l20885457750679677103 = new L2088545775067967710(this, b);
        byte b5 = 4;
        X1076061028887460523 x1076061028887460523 = new X1076061028887460523(new B2138252231653711516(new K13841493441907392258((Object) x11739465584883262539, (byte) 18), new A8343247053991953801(l2088545775067967710, s5730883377765920436, l20885457750679677102, l20885457750679677103, new L2088545775067967710(this, b5), new L2088545775067967710(this, b3)), (byte) 0), 1);
        h1(x1076061028887460523);
        this.B = x1076061028887460523;
        this.E = new Q7316561721656982910((byte) 9);
        this.F = new S5730883377765920436(this, b4);
        this.H = new X11739465584883262539(this, b5);
        this.I = V4416135141588678913.t(Boolean.FALSE);
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final boolean B0() {
        return true;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        n17396598995248644478.a();
        if (((Boolean) this.I.getValue()).booleanValue()) {
            D14208870094104617988 d14208870094104617988 = (D14208870094104617988) B11964701839924937722.o(this, K15926616311476803792.a);
            long j = ((U10174709222559481877) B11964701839924937722.o(this, K15926616311476803792.b)).a;
            long e = J8045362843799184672.e(1308617531);
            int i = U10174709222559481877.i;
            if (!P15388715743159210616.a(j, e)) {
                d14208870094104617988 = new H10765568533039107979(j);
            }
            L17598299826319227431.f0(n17396598995248644478, d14208870094104617988, 0L, 0L, 0.0f, null, 126);
        }
    }

    @Override // dev.epro.r0.O15099455688051794795
    public final void N(C13258628320776285546 c13258628320776285546) {
        B1029012102904255937 b;
        D2717688760023469083 d2717688760023469083 = this.s;
        I12071840179596922896 i12071840179596922896 = d2717688760023469083.b;
        Q17957571128037780363 c = i12071840179596922896.c();
        S6349823729575121924 s6349823729575121924 = S6349823729575121924.e;
        if (c != null) {
            if (d2717688760023469083.h) {
                C8185053590072587931 d = d2717688760023469083.a.d();
                if (F12478849263529740365.d(d.d)) {
                    s6349823729575121924 = d2717688760023469083.a(c, d);
                } else {
                    long j = d.d;
                    if (!F12478849263529740365.d(j)) {
                        int i = (int) (j >> 32);
                        V11538895333762958192 v11538895333762958192 = c.b;
                        int d2 = v11538895333762958192.d(i);
                        int i2 = (int) (4294967295L & j);
                        int d3 = v11538895333762958192.d(i2);
                        if (d2 == d3) {
                            float e = c.e(i, true);
                            float e2 = c.e(i2, true);
                            s6349823729575121924 = new S6349823729575121924(Math.min(e, e2), v11538895333762958192.f(d2), Math.max(e, e2), v11538895333762958192.b(d3));
                        } else {
                            s6349823729575121924 = c.j(F12478849263529740365.g(j), F12478849263529740365.f(j)).d();
                        }
                    }
                }
                B1029012102904255937 e3 = i12071840179596922896.e();
                if (e3 != null) {
                    if (!e3.C()) {
                        e3 = null;
                    }
                    if (e3 != null && (b = i12071840179596922896.b()) != null) {
                        B1029012102904255937 b1029012102904255937 = b.C() ? b : null;
                        if (b1029012102904255937 != null) {
                            s6349823729575121924 = s6349823729575121924.k(b1029012102904255937.E(e3, false).f());
                        }
                    }
                }
            } else {
                s6349823729575121924 = P2382941533350862833.f428o;
            }
        }
        c13258628320776285546.b(s6349823729575121924);
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        R1411039272204519728 r1411039272204519728;
        AutofillValue forText;
        C8185053590072587931 d = this.q.a.d();
        long j = d.d;
        M11181104712105445833 m11181104712105445833 = new M11181104712105445833(this.q.a.d().c.toString());
        D15596191924284547207[] d15596191924284547207Arr = U4676709778812953726.a;
        P14992748401341948828 p14992748401341948828 = D10671166500636893138.F;
        D15596191924284547207[] d15596191924284547207Arr2 = U4676709778812953726.a;
        D15596191924284547207 d15596191924284547207 = d15596191924284547207Arr2[18];
        p14992748401341948828.getClass();
        s2460821117650695638.a(p14992748401341948828, m11181104712105445833);
        M11181104712105445833 m111811047121054458332 = new M11181104712105445833(d.c.toString());
        P14992748401341948828 p149927484013419488282 = D10671166500636893138.G;
        D15596191924284547207 d155961919242845472072 = d15596191924284547207Arr2[19];
        p149927484013419488282.getClass();
        s2460821117650695638.a(p149927484013419488282, m111811047121054458332);
        P14992748401341948828 p149927484013419488283 = D10671166500636893138.H;
        D15596191924284547207 d155961919242845472073 = d15596191924284547207Arr2[20];
        F12478849263529740365 f12478849263529740365 = new F12478849263529740365(j);
        p149927484013419488283.getClass();
        s2460821117650695638.a(p149927484013419488283, f12478849263529740365);
        F12478849263529740365 f124788492635297403652 = this.q.a.d().e;
        P14992748401341948828 p149927484013419488284 = D10671166500636893138.I;
        D15596191924284547207 d155961919242845472074 = d15596191924284547207Arr2[21];
        p149927484013419488284.getClass();
        s2460821117650695638.a(p149927484013419488284, f124788492635297403652);
        D7213087464567441683 d7213087464567441683 = new D7213087464567441683(((Boolean) this.q.a.e.getValue()).booleanValue(), ((Boolean) this.q.a.f.getValue()).booleanValue());
        P14992748401341948828 p149927484013419488285 = D10671166500636893138.M;
        D15596191924284547207 d155961919242845472075 = d15596191924284547207Arr2[27];
        p149927484013419488285.getClass();
        s2460821117650695638.a(p149927484013419488285, d7213087464567441683);
        if (!this.t) {
            s2460821117650695638.a(D10671166500636893138.j, O9245300239821758723.a);
        }
        final boolean z = this.t;
        P14992748401341948828 p149927484013419488286 = D10671166500636893138.Q;
        D15596191924284547207 d155961919242845472076 = d15596191924284547207Arr2[28];
        Boolean valueOf = Boolean.valueOf(z);
        p149927484013419488286.getClass();
        s2460821117650695638.a(p149927484013419488286, valueOf);
        U4676709778812953726.f(s2460821117650695638, N5158094851646208854.e);
        if (Build.VERSION.SDK_INT >= 26) {
            forText = AutofillValue.forText(C9869900372345142877.b0(d));
            r1411039272204519728 = new R1411039272204519728(forText);
        } else {
            r1411039272204519728 = null;
        }
        if (r1411039272204519728 != null) {
            U4676709778812953726.i(s2460821117650695638, r1411039272204519728);
        }
        final byte b = 0;
        U4676709778812953726.c(s2460821117650695638, new F4096073349764486348() { // from class: dev.epro.r0.I5533454748543164555
            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj) {
                boolean isText;
                byte b2 = b;
                boolean z2 = true;
                N17102349568798422850 n17102349568798422850 = this;
                boolean z3 = z;
                switch (b2) {
                    case 0:
                        R1411039272204519728 r14110392722045197282 = (R1411039272204519728) obj;
                        if (z3) {
                            isText = r14110392722045197282.a.isText();
                            R4833348786910499294 r4833348786910499294 = null;
                            CharSequence textValue = isText ? r14110392722045197282.a.getTextValue() : null;
                            if (textValue != null) {
                                n17102349568798422850.q.g(textValue);
                            }
                            n17102349568798422850.I.setValue(Boolean.TRUE);
                            R7033599853981556291.E(n17102349568798422850.V0(), null, null, new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 3), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        M11181104712105445833 m111811047121054458333 = (M11181104712105445833) obj;
                        if (z3) {
                            n17102349568798422850.q.g(m111811047121054458333);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        M11181104712105445833 m111811047121054458334 = (M11181104712105445833) obj;
                        if (z3) {
                            N1420218926656397722.h(n17102349568798422850.q, m111811047121054458334, false, false, 28);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        });
        int i = this.u.c;
        byte b2 = 8;
        byte b3 = 6;
        if (i == 6) {
            G17950093153428970417.a.getClass();
            U4676709778812953726.h(s2460821117650695638, J2489305106522451990.c);
        } else if (i == 7) {
            G17950093153428970417.a.getClass();
            U4676709778812953726.h(s2460821117650695638, J2489305106522451990.b);
        } else if (i == 8) {
            G17950093153428970417.a.getClass();
            U4676709778812953726.h(s2460821117650695638, J2489305106522451990.b);
        } else if (i == 4) {
            G17950093153428970417.a.getClass();
            U4676709778812953726.h(s2460821117650695638, J2489305106522451990.d);
        }
        U4676709778812953726.a(s2460821117650695638, new L2088545775067967710(this, b3));
        if (z) {
            final byte b4 = 1;
            s2460821117650695638.a(E5458822993765169982.k, new R17587901753867651123(null, new F4096073349764486348() { // from class: dev.epro.r0.I5533454748543164555
                @Override // dev.epro.r0.F4096073349764486348
                public final Object invoke(Object obj) {
                    boolean isText;
                    byte b22 = b4;
                    boolean z2 = true;
                    N17102349568798422850 n17102349568798422850 = this;
                    boolean z3 = z;
                    switch (b22) {
                        case 0:
                            R1411039272204519728 r14110392722045197282 = (R1411039272204519728) obj;
                            if (z3) {
                                isText = r14110392722045197282.a.isText();
                                R4833348786910499294 r4833348786910499294 = null;
                                CharSequence textValue = isText ? r14110392722045197282.a.getTextValue() : null;
                                if (textValue != null) {
                                    n17102349568798422850.q.g(textValue);
                                }
                                n17102349568798422850.I.setValue(Boolean.TRUE);
                                R7033599853981556291.E(n17102349568798422850.V0(), null, null, new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            M11181104712105445833 m111811047121054458333 = (M11181104712105445833) obj;
                            if (z3) {
                                n17102349568798422850.q.g(m111811047121054458333);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            M11181104712105445833 m111811047121054458334 = (M11181104712105445833) obj;
                            if (z3) {
                                N1420218926656397722.h(n17102349568798422850.q, m111811047121054458334, false, false, 28);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            final byte b5 = 2;
            s2460821117650695638.a(E5458822993765169982.f226o, new R17587901753867651123(null, new F4096073349764486348() { // from class: dev.epro.r0.I5533454748543164555
                @Override // dev.epro.r0.F4096073349764486348
                public final Object invoke(Object obj) {
                    boolean isText;
                    byte b22 = b5;
                    boolean z2 = true;
                    N17102349568798422850 n17102349568798422850 = this;
                    boolean z3 = z;
                    switch (b22) {
                        case 0:
                            R1411039272204519728 r14110392722045197282 = (R1411039272204519728) obj;
                            if (z3) {
                                isText = r14110392722045197282.a.isText();
                                R4833348786910499294 r4833348786910499294 = null;
                                CharSequence textValue = isText ? r14110392722045197282.a.getTextValue() : null;
                                if (textValue != null) {
                                    n17102349568798422850.q.g(textValue);
                                }
                                n17102349568798422850.I.setValue(Boolean.TRUE);
                                R7033599853981556291.E(n17102349568798422850.V0(), null, null, new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            M11181104712105445833 m111811047121054458333 = (M11181104712105445833) obj;
                            if (z3) {
                                n17102349568798422850.q.g(m111811047121054458333);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            M11181104712105445833 m111811047121054458334 = (M11181104712105445833) obj;
                            if (z3) {
                                N1420218926656397722.h(n17102349568798422850.q, m111811047121054458334, false, false, 28);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        s2460821117650695638.a(E5458822993765169982.j, new R17587901753867651123(null, new Q2768324090487661247(this, (byte) 23)));
        int a = this.u.a();
        U4676709778812953726.d(s2460821117650695638, a, new H15176749518301005726(this, a, (byte) 3));
        U4676709778812953726.b(s2460821117650695638, new X11739465584883262539(this, b2));
        s2460821117650695638.a(E5458822993765169982.c, new R17587901753867651123(null, new X11739465584883262539(this, (byte) 9)));
        if (!F12478849263529740365.d(j)) {
            s2460821117650695638.a(E5458822993765169982.q, new R17587901753867651123(null, new X11739465584883262539(this, (byte) 10)));
            if (this.t) {
                s2460821117650695638.a(E5458822993765169982.r, new R17587901753867651123(null, new X11739465584883262539(this, b)));
            }
        }
        if (z) {
            s2460821117650695638.a(E5458822993765169982.s, new R17587901753867651123(null, new X11739465584883262539(this, b3)));
        }
        if (this.t) {
            this.y.V(s2460821117650695638);
        }
    }

    @Override // dev.epro.r0.C12172695433110393112
    public final void Z() {
        I3887072968740112330.D(this, new X11739465584883262539(this, (byte) 1));
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        I3887072968740112330.D(this, new X11739465584883262539(this, (byte) 1));
        this.s.m = this.H;
        if (this.t) {
            h1(this.y);
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        l1();
        this.s.m = null;
    }

    @Override // dev.epro.r0.A11121185661545552785, dev.epro.r0.T975006071468260715
    public final void d(long j) {
        this.B.r = j;
    }

    @Override // dev.epro.r0.A11121185661545552785
    public final void d0(B1029012102904255937 b1029012102904255937) {
        this.B.getClass();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    @Override // dev.epro.r0.K4700587928988752109
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0(android.view.KeyEvent r25) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N17102349568798422850.j0(android.view.KeyEvent):boolean");
    }

    public final boolean k1(int i) {
        if (i == 6) {
            ((D10236220797215130727) ((T10243012841839397329) B11964701839924937722.o(this, Y238707362170117896.i))).h(1, true);
            return true;
        }
        if (i == 5) {
            ((D10236220797215130727) ((T10243012841839397329) B11964701839924937722.o(this, Y238707362170117896.i))).h(2, true);
            return true;
        }
        if (i != 7) {
            return false;
        }
        ((Y3239112907774449419) o1()).a();
        return true;
    }

    public final void l1() {
        X7175349259954592591 x7175349259954592591 = this.G;
        if (x7175349259954592591 != null) {
            x7175349259954592591.c(null);
        }
        this.G = null;
        Q2423450198286343102 q2423450198286343102 = this.x;
        if (q2423450198286343102 != null) {
            q2423450198286343102.g();
        }
    }

    public final void m1() {
        G14063045981989969453 g14063045981989969453 = this.A;
        if (g14063045981989969453 != null) {
            this.w.c(new T5663127441908862287(g14063045981989969453));
            this.A = null;
        }
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void n0(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141, long j) {
        this.z.n0(y1086209215650239921, j17191566391535857141, j);
    }

    public final boolean n1() {
        H18157283590851071619 h18157283590851071619;
        return this.y.v.m1().b() && (h18157283590851071619 = this.C) != null && ((L16736062046028781057) h18157283590851071619).a();
    }

    public final L2387191309177986288 o1() {
        L2387191309177986288 l2387191309177986288 = (L2387191309177986288) B11964701839924937722.o(this, Y238707362170117896.q);
        if (l2387191309177986288 != null) {
            return l2387191309177986288;
        }
        S10973172697741180971.m("No software keyboard controller");
        return null;
    }

    @Override // dev.epro.r0.K4700587928988752109
    public final boolean p(KeyEvent keyEvent) {
        N1420218926656397722 n1420218926656397722 = this.q;
        D2717688760023469083 d2717688760023469083 = this.s;
        o1();
        this.E.getClass();
        if (F12478849263529740365.d(n1420218926656397722.d().d) || keyEvent.getKeyCode() != 4 || D15445857918358799638.K(keyEvent) != 1) {
            return false;
        }
        N1420218926656397722 n14202189266563977222 = d2717688760023469083.a;
        if (!F12478849263529740365.d(n14202189266563977222.d().d)) {
            J9879469284241532070 j9879469284241532070 = n14202189266563977222.a;
            j9879469284241532070.b.a().m();
            F13711604687869105489 f13711604687869105489 = j9879469284241532070.b;
            int i = (int) (f13711604687869105489.f & 4294967295L);
            E2166724654553415323.q(f13711604687869105489, i, i);
            j9879469284241532070.b(true, E1418573787900340271.a);
            j9879469284241532070.g(true);
            j9879469284241532070.f(j9879469284241532070.b.d);
        }
        d2717688760023469083.w(false);
        d2717688760023469083.x(S5779100572589057142.a);
        return true;
    }

    public final void p1(boolean z) {
        if (!z) {
            Boolean bool = this.u.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        J8045362843799184672.Z(this);
        this.G = R7033599853981556291.E(V0(), null, L856869997670741194.d, new M9597626798198327245(this, null, (byte) 5), 1);
    }

    @Override // dev.epro.r0.O10709431398915260868
    public final void s0(Y4989033692226475498 y4989033692226475498) {
        this.r.e.setValue(y4989033692226475498);
        if (this.t) {
            this.y.s0(y4989033692226475498);
        }
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        this.z.x0();
    }
}
