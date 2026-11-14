package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E16236172717107512059 extends dev.epro.r0.R15896830329318850690 implements dev.epro.r0.D10205225622993155321, dev.epro.r0.V6844203142031704410, dev.epro.r0.T11401768751197276141, dev.epro.r0.B18307494358031290147, dev.epro.r0.P9179653189917234378, dev.epro.r0.F10302678904745754545, dev.epro.r0.A11121185661545552785, dev.epro.r0.O10709431398915260868, dev.epro.r0.H7873830272239816472, dev.epro.r0.O15099455688051794795, dev.epro.r0.L10763019129195295039, dev.epro.r0.G13991919739136867102, dev.epro.r0.P12234187177891585406 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.L8750838032724194107 f216o;
    public dev.epro.r0.R14612536297276259359 p;
    public java.util.HashSet q;

    public final void E(dev.epro.r0.N17396598995248644478 n17396598995248644478) {
        this.f216o.getClass();
        n17396598995248644478.a();
    }

    public final void H0() {
        dev.epro.r0.V1475975160983963926.D(this);
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void J0() {
        dev.epro.r0.I17687524211334993649 i17687524211334993649 = this.f216o;
        i17687524211334993649.getClass();
        i17687524211334993649.d.getClass();
    }

    public final boolean L() {
        return ((dev.epro.r0.R15896830329318850690) this).n;
    }

    public final void N(dev.epro.r0.C13258628320776285546 c13258628320776285546) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        dev.epro.r0.P753981624812481271.b("applyFocusProperties called on wrong node");
        l8750838032724194107.getClass();
        throw new java.lang.ClassCastException();
    }

    public final void V(dev.epro.r0.S2460821117650695638 s2460821117650695638) {
        dev.epro.r0.U5372921367212226273 u5372921367212226273 = this.f216o;
        u5372921367212226273.getClass();
        dev.epro.r0.E10198359844879945462 e10198359844879945462F0 = u5372921367212226273.F0();
        s2460821117650695638.getClass();
        dev.epro.r0.E10198359844879945462 e10198359844879945462 = (dev.epro.r0.E10198359844879945462) s2460821117650695638;
        dev.epro.r0.A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
        if (e10198359844879945462F0.c) {
            e10198359844879945462.c = true;
        }
        if (e10198359844879945462F0.d) {
            e10198359844879945462.d = true;
        }
        dev.epro.r0.A4559761392562572984 a45597613925625729842 = e10198359844879945462F0.a;
        java.lang.Object[] objArr = a45597613925625729842.b;
        java.lang.Object[] objArr2 = a45597613925625729842.c;
        long[] jArr = a45597613925625729842.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        java.lang.Object obj2 = objArr2[i4];
                        dev.epro.r0.P14992748401341948828 p14992748401341948828 = (dev.epro.r0.P14992748401341948828) obj;
                        if (!a4559761392562572984.b(p14992748401341948828)) {
                            a4559761392562572984.n(p14992748401341948828, obj2);
                        } else if (obj2 instanceof dev.epro.r0.R17587901753867651123) {
                            java.lang.Object objG = a4559761392562572984.g(p14992748401341948828);
                            objG.getClass();
                            dev.epro.r0.R17587901753867651123 r17587901753867651123 = (dev.epro.r0.R17587901753867651123) objG;
                            java.lang.String str = r17587901753867651123.a;
                            if (str == null) {
                                str = ((dev.epro.r0.R17587901753867651123) obj2).a;
                            }
                            dev.epro.r0.S8977162183056139880 s8977162183056139880 = r17587901753867651123.b;
                            if (s8977162183056139880 == null) {
                                s8977162183056139880 = ((dev.epro.r0.R17587901753867651123) obj2).b;
                            }
                            a4559761392562572984.n(p14992748401341948828, new dev.epro.r0.R17587901753867651123(str, s8977162183056139880));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int W(dev.epro.r0.I11965759855724288421 i11965759855724288421, dev.epro.r0.G17613326942144185441 g17613326942144185441, int i) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((dev.epro.r0.B321559534056331132) l8750838032724194107).h(new dev.epro.r0.O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new dev.epro.r0.D677275267896868264(g17613326942144185441, dev.epro.r0.V988791003021430672.b, dev.epro.r0.Q11831194664157489693.a, (byte) 1), dev.epro.r0.O15160157444238005800.b(0, 0, 0, i, 7)).g();
    }

    public final void Z0() {
        h1(true);
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void a() {
        if (this.f216o instanceof dev.epro.r0.I17687524211334993649) {
            x0();
        }
    }

    public final void a1() {
        i1();
    }

    public final void b0(dev.epro.r0.H12838525957287096428 h12838525957287096428) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        dev.epro.r0.P753981624812481271.b("onFocusEvent called on wrong node");
        l8750838032724194107.getClass();
        throw new java.lang.ClassCastException();
    }

    public final dev.epro.r0.R8540738700654750557 c() {
        return dev.epro.r0.R7033599853981556291.R(this).y;
    }

    public final long e() {
        return dev.epro.r0.I3887072968740112330.Q(((dev.epro.r0.Z17471428274427141949) dev.epro.r0.R7033599853981556291.P(this, 128)).c);
    }

    public final java.lang.Object f() {
        dev.epro.r0.X9608137461199640409 x9608137461199640409;
        dev.epro.r0.O14561027293699174040 o14561027293699174040 = dev.epro.r0.J8045362843799184672.i;
        this.q.add(o14561027293699174040);
        if (!((dev.epro.r0.R15896830329318850690) this).a.n) {
            dev.epro.r0.P753981624812481271.b("visitAncestors called on an unattached node");
        }
        dev.epro.r0.R15896830329318850690 r15896830329318850690 = ((dev.epro.r0.R15896830329318850690) this).a.e;
        dev.epro.r0.H11725168162114556860 h11725168162114556860R = dev.epro.r0.R7033599853981556291.R(this);
        while (h11725168162114556860R != null) {
            if ((((dev.epro.r0.R15896830329318850690) h11725168162114556860R.F.g).d & 32) != 0) {
                while (r15896830329318850690 != null) {
                    if ((r15896830329318850690.c & 32) != 0) {
                        dev.epro.r0.R15896830329318850690 r15896830329318850690M = r15896830329318850690;
                        dev.epro.r0.D389890677992184566 d389890677992184566 = null;
                        while (r15896830329318850690M != null) {
                            if (r15896830329318850690M instanceof dev.epro.r0.P9179653189917234378) {
                                dev.epro.r0.P9179653189917234378 p9179653189917234378 = (dev.epro.r0.P9179653189917234378) r15896830329318850690M;
                                if (p9179653189917234378.l().x(o14561027293699174040)) {
                                    return p9179653189917234378.l().D(o14561027293699174040);
                                }
                            } else if ((r15896830329318850690M.c & 32) != 0 && (r15896830329318850690M instanceof dev.epro.r0.J2215566372910931965)) {
                                int i = 0;
                                for (dev.epro.r0.R15896830329318850690 r158968303293188506902 = ((dev.epro.r0.J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                                    if ((r158968303293188506902.c & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            r15896830329318850690M = r158968303293188506902;
                                        } else {
                                            if (d389890677992184566 == null) {
                                                d389890677992184566 = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.R15896830329318850690[16]);
                                            }
                                            if (r15896830329318850690M != null) {
                                                d389890677992184566.b(r15896830329318850690M);
                                                r15896830329318850690M = null;
                                            }
                                            d389890677992184566.b(r158968303293188506902);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            r15896830329318850690M = dev.epro.r0.R7033599853981556291.M(d389890677992184566);
                        }
                    }
                    r15896830329318850690 = r15896830329318850690.e;
                }
            }
            h11725168162114556860R = h11725168162114556860R.u();
            r15896830329318850690 = (h11725168162114556860R == null || (x9608137461199640409 = h11725168162114556860R.F) == null) ? null : (dev.epro.r0.E6101237837392211295) x9608137461199640409.f;
        }
        return o14561027293699174040.a.invoke();
    }

    public final dev.epro.r0.F10342546226345611902 getLayoutDirection() {
        return dev.epro.r0.R7033599853981556291.R(this).z;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final dev.epro.r0.H11646813293457574213 h(dev.epro.r0.I5164649337253478959 i5164649337253478959, dev.epro.r0.G17613326942144185441 g17613326942144185441, long j) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((dev.epro.r0.B321559534056331132) l8750838032724194107).h(i5164649337253478959, g17613326942144185441, j);
    }

    public final void h1(boolean z) {
        if (!((dev.epro.r0.R15896830329318850690) this).n) {
            dev.epro.r0.P753981624812481271.b("initializeModifier called on unattached node");
        }
        dev.epro.r0.W2387504280787725972 w2387504280787725972 = this.f216o;
        if ((((dev.epro.r0.R15896830329318850690) this).c & 32) != 0 && (w2387504280787725972 instanceof dev.epro.r0.W2387504280787725972)) {
            dev.epro.r0.W2387504280787725972 w23875042807877259722 = w2387504280787725972;
            dev.epro.r0.O14561027293699174040 o14561027293699174040 = dev.epro.r0.R17739216783154562303.a;
            dev.epro.r0.R14612536297276259359 r14612536297276259359 = this.p;
            if (r14612536297276259359 == null || !r14612536297276259359.x(o14561027293699174040)) {
                dev.epro.r0.R14612536297276259359 r146125362972762593592 = new dev.epro.r0.R14612536297276259359();
                r146125362972762593592.o = w23875042807877259722;
                this.p = r146125362972762593592;
                dev.epro.r0.E6101237837392211295 e6101237837392211295 = (dev.epro.r0.E6101237837392211295) dev.epro.r0.R7033599853981556291.R(this).F.f;
                e6101237837392211295.getClass();
                if (e6101237837392211295.f227o) {
                    dev.epro.r0.X1072671764734194220 modifierLocalManager = dev.epro.r0.R7033599853981556291.S(this).getModifierLocalManager();
                    dev.epro.r0.U9803441765912152712 u9803441765912152712 = modifierLocalManager.b;
                    if (u9803441765912152712 == null) {
                        u9803441765912152712 = new dev.epro.r0.U9803441765912152712();
                        modifierLocalManager.b = u9803441765912152712;
                    }
                    u9803441765912152712.a(this);
                    dev.epro.r0.U9803441765912152712 u98034417659121527122 = modifierLocalManager.c;
                    if (u98034417659121527122 == null) {
                        u98034417659121527122 = new dev.epro.r0.U9803441765912152712();
                        modifierLocalManager.c = u98034417659121527122;
                    }
                    u98034417659121527122.a(o14561027293699174040);
                    modifierLocalManager.a();
                }
            } else {
                r14612536297276259359.o = w23875042807877259722;
                dev.epro.r0.X1072671764734194220 modifierLocalManager2 = dev.epro.r0.R7033599853981556291.S(this).getModifierLocalManager();
                dev.epro.r0.U9803441765912152712 u98034417659121527123 = modifierLocalManager2.b;
                if (u98034417659121527123 == null) {
                    u98034417659121527123 = new dev.epro.r0.U9803441765912152712();
                    modifierLocalManager2.b = u98034417659121527123;
                }
                u98034417659121527123.a(this);
                dev.epro.r0.U9803441765912152712 u98034417659121527124 = modifierLocalManager2.c;
                if (u98034417659121527124 == null) {
                    u98034417659121527124 = new dev.epro.r0.U9803441765912152712();
                    modifierLocalManager2.c = u98034417659121527124;
                }
                u98034417659121527124.a(o14561027293699174040);
                modifierLocalManager2.a();
            }
        }
        if ((((dev.epro.r0.R15896830329318850690) this).c & 4) != 0 && !z) {
            dev.epro.r0.R7033599853981556291.P(this, 2).m1();
        }
        if ((((dev.epro.r0.R15896830329318850690) this).c & 2) != 0) {
            dev.epro.r0.E6101237837392211295 e61012378373922112952 = (dev.epro.r0.E6101237837392211295) dev.epro.r0.R7033599853981556291.R(this).F.f;
            e61012378373922112952.getClass();
            if (e61012378373922112952.f227o) {
                dev.epro.r0.K12961197752049417088 k12961197752049417088 = ((dev.epro.r0.R15896830329318850690) this).h;
                k12961197752049417088.getClass();
                k12961197752049417088.I1(this);
                dev.epro.r0.R12643293538999642754 r12643293538999642754 = ((dev.epro.r0.Y4989033692226475498) k12961197752049417088).T;
                if (r12643293538999642754 != null) {
                    r12643293538999642754.c();
                }
            }
            if (!z) {
                dev.epro.r0.R7033599853981556291.P(this, 2).m1();
                dev.epro.r0.R7033599853981556291.R(this).E();
            }
        }
        if (w2387504280787725972 instanceof dev.epro.r0.O8465802837550908662) {
            dev.epro.r0.O8465802837550908662 o8465802837550908662 = (dev.epro.r0.O8465802837550908662) w2387504280787725972;
            dev.epro.r0.H11725168162114556860 h11725168162114556860R = dev.epro.r0.R7033599853981556291.R(this);
            switch (o8465802837550908662.a) {
                case 0:
                    o8465802837550908662.b.j = h11725168162114556860R;
                    break;
                case 1:
                    ((dev.epro.r0.E17523205116624666034) o8465802837550908662.b).l = h11725168162114556860R;
                    break;
                default:
                    o8465802837550908662.b.w.setValue(h11725168162114556860R);
                    break;
            }
        }
        if ((((dev.epro.r0.R15896830329318850690) this).c & 256) != 0 && (w2387504280787725972 instanceof dev.epro.r0.T10113869190613358580)) {
            dev.epro.r0.E6101237837392211295 e61012378373922112953 = (dev.epro.r0.E6101237837392211295) dev.epro.r0.R7033599853981556291.R(this).F.f;
            e61012378373922112953.getClass();
            if (e61012378373922112953.f227o) {
                dev.epro.r0.R7033599853981556291.R(this).E();
            }
        }
        int i = ((dev.epro.r0.R15896830329318850690) this).c;
        if ((i & 16) != 0 && (w2387504280787725972 instanceof dev.epro.r0.I17687524211334993649)) {
            ((dev.epro.r0.I17687524211334993649) w2387504280787725972).d.c = ((dev.epro.r0.R15896830329318850690) this).h;
        }
        if ((i & 8) != 0) {
            dev.epro.r0.R7033599853981556291.S(this).C();
        }
    }

    @Override // dev.epro.r0.F10302678904745754545
    public final java.lang.Object i(dev.epro.r0.R8540738700654750557 r8540738700654750557, java.lang.Object obj) {
        dev.epro.r0.M14071578157262992915 m14071578157262992915 = this.f216o;
        m14071578157262992915.getClass();
        return m14071578157262992915.i(r8540738700654750557, obj);
    }

    public final void i1() {
        if (!((dev.epro.r0.R15896830329318850690) this).n) {
            dev.epro.r0.P753981624812481271.b("unInitializeModifier called on unattached node");
        }
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        if ((((dev.epro.r0.R15896830329318850690) this).c & 32) != 0 && (l8750838032724194107 instanceof dev.epro.r0.W2387504280787725972)) {
            dev.epro.r0.X1072671764734194220 modifierLocalManager = dev.epro.r0.R7033599853981556291.S(this).getModifierLocalManager();
            dev.epro.r0.O14561027293699174040 o14561027293699174040 = dev.epro.r0.R17739216783154562303.a;
            dev.epro.r0.U9803441765912152712 u9803441765912152712 = modifierLocalManager.d;
            if (u9803441765912152712 == null) {
                u9803441765912152712 = new dev.epro.r0.U9803441765912152712();
                modifierLocalManager.d = u9803441765912152712;
            }
            u9803441765912152712.a(dev.epro.r0.R7033599853981556291.R(this));
            dev.epro.r0.U9803441765912152712 u98034417659121527122 = modifierLocalManager.e;
            if (u98034417659121527122 == null) {
                u98034417659121527122 = new dev.epro.r0.U9803441765912152712();
                modifierLocalManager.e = u98034417659121527122;
            }
            u98034417659121527122.a(o14561027293699174040);
            modifierLocalManager.a();
        }
        if ((((dev.epro.r0.R15896830329318850690) this).c & 8) != 0) {
            dev.epro.r0.R7033599853981556291.S(this).C();
        }
    }

    public final void j1() {
        if (((dev.epro.r0.R15896830329318850690) this).n) {
            this.q.clear();
            dev.epro.r0.B4499109999593241705 snapshotObserver = dev.epro.r0.R7033599853981556291.S(this).getSnapshotObserver();
            snapshotObserver.a.d(this, dev.epro.r0.G16660188620551127941.c, new dev.epro.r0.S464754454553842217(this, (byte) 7));
        }
    }

    public final dev.epro.r0.Z860808776098365610 l() {
        dev.epro.r0.R14612536297276259359 r14612536297276259359 = this.p;
        return r14612536297276259359 != null ? r14612536297276259359 : dev.epro.r0.E5367294674037035345.f225o;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(dev.epro.r0.I11965759855724288421 i11965759855724288421, dev.epro.r0.G17613326942144185441 g17613326942144185441, int i) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((dev.epro.r0.B321559534056331132) l8750838032724194107).h(new dev.epro.r0.O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new dev.epro.r0.D677275267896868264(g17613326942144185441, dev.epro.r0.V988791003021430672.b, dev.epro.r0.Q11831194664157489693.b, (byte) 1), dev.epro.r0.O15160157444238005800.b(0, i, 0, 0, 13)).d();
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void n0(dev.epro.r0.Y1086209215650239921 y1086209215650239921, dev.epro.r0.J17191566391535857141 j17191566391535857141, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        dev.epro.r0.I17687524211334993649 i17687524211334993649 = this.f216o;
        i17687524211334993649.getClass();
        dev.epro.r0.J15730374346044043770 j15730374346044043770 = i17687524211334993649.d;
        dev.epro.r0.I17687524211334993649 i176875242113349936492 = (dev.epro.r0.I17687524211334993649) j15730374346044043770.b;
        java.util.List list = y1086209215650239921.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dev.epro.r0.N13196868278329319633 n13196868278329319633 = (dev.epro.r0.N13196868278329319633) list.get(i);
            if (dev.epro.r0.I3887072968740112330.r(n13196868278329319633) || dev.epro.r0.I3887072968740112330.t(n13196868278329319633)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((dev.epro.r0.N13196868278329319633) list.get(i2)).c()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (i176875242113349936492.c) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    dev.epro.r0.N13196868278329319633 n131968682783293196332 = (dev.epro.r0.N13196868278329319633) list.get(i3);
                    if (dev.epro.r0.I3887072968740112330.r(n131968682783293196332) || dev.epro.r0.I3887072968740112330.t(n131968682783293196332)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        dev.epro.r0.Y15332629801367963516 y15332629801367963516 = (dev.epro.r0.Y15332629801367963516) j15730374346044043770.d;
        dev.epro.r0.Y15332629801367963516 y153326298013679635162 = dev.epro.r0.Y15332629801367963516.c;
        dev.epro.r0.J17191566391535857141 j171915663915358571412 = dev.epro.r0.J17191566391535857141.c;
        if (y15332629801367963516 != y153326298013679635162) {
            if (j17191566391535857141 == dev.epro.r0.J17191566391535857141.a && z3) {
                j15730374346044043770.e = y1086209215650239921;
                j15730374346044043770.x(y1086209215650239921, !z || i176875242113349936492.c);
            }
            if (j17191566391535857141 == dev.epro.r0.J17191566391535857141.b && z && y1086209215650239921 == ((dev.epro.r0.Y1086209215650239921) j15730374346044043770.e) && i176875242113349936492.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((dev.epro.r0.N13196868278329319633) list.get(i4)).a();
                }
            }
            if (j17191566391535857141 == j171915663915358571412 && !z3 && y1086209215650239921 != ((dev.epro.r0.Y1086209215650239921) j15730374346044043770.e)) {
                j15730374346044043770.x(y1086209215650239921, true);
            }
        }
        if (j17191566391535857141 == j171915663915358571412) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    j15730374346044043770.d = dev.epro.r0.Y15332629801367963516.a;
                    ((dev.epro.r0.I17687524211334993649) j15730374346044043770.b).c = false;
                    j15730374346044043770.e = null;
                    break;
                } else if (!dev.epro.r0.I3887072968740112330.t((dev.epro.r0.N13196868278329319633) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (y1086209215650239921 == ((dev.epro.r0.Y1086209215650239921) j15730374346044043770.e) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((dev.epro.r0.N13196868278329319633) list.get(i6)).c()) {
                        i6++;
                    } else if (!i176875242113349936492.c) {
                        j15730374346044043770.Y(y1086209215650239921);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((dev.epro.r0.N13196868278329319633) list.get(i7)).a();
                }
            }
        }
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final boolean o0() {
        dev.epro.r0.I17687524211334993649 i17687524211334993649 = this.f216o;
        i17687524211334993649.getClass();
        i17687524211334993649.d.getClass();
        return true;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(dev.epro.r0.I11965759855724288421 i11965759855724288421, dev.epro.r0.G17613326942144185441 g17613326942144185441, int i) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((dev.epro.r0.B321559534056331132) l8750838032724194107).h(new dev.epro.r0.O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new dev.epro.r0.D677275267896868264(g17613326942144185441, dev.epro.r0.V988791003021430672.a, dev.epro.r0.Q11831194664157489693.b, (byte) 1), dev.epro.r0.O15160157444238005800.b(0, i, 0, 0, 13)).d();
    }

    public final void s0(dev.epro.r0.Y4989033692226475498 y4989033692226475498) {
        dev.epro.r0.T10113869190613358580 t10113869190613358580 = this.f216o;
        t10113869190613358580.getClass();
        t10113869190613358580.s0(y4989033692226475498);
    }

    public final java.lang.String toString() {
        return this.f216o.toString();
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        dev.epro.r0.I17687524211334993649 i17687524211334993649 = this.f216o;
        i17687524211334993649.getClass();
        dev.epro.r0.J15730374346044043770 j15730374346044043770 = i17687524211334993649.d;
        dev.epro.r0.Y15332629801367963516 y15332629801367963516 = (dev.epro.r0.Y15332629801367963516) j15730374346044043770.d;
        dev.epro.r0.I17687524211334993649 i176875242113349936492 = (dev.epro.r0.I17687524211334993649) j15730374346044043770.b;
        if (y15332629801367963516 == dev.epro.r0.Y15332629801367963516.b) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            i176875242113349936492.a().invoke(motionEventObtain);
            motionEventObtain.recycle();
            j15730374346044043770.d = dev.epro.r0.Y15332629801367963516.a;
            i176875242113349936492.c = false;
            j15730374346044043770.e = null;
        }
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(dev.epro.r0.I11965759855724288421 i11965759855724288421, dev.epro.r0.G17613326942144185441 g17613326942144185441, int i) {
        dev.epro.r0.L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((dev.epro.r0.B321559534056331132) l8750838032724194107).h(new dev.epro.r0.O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new dev.epro.r0.D677275267896868264(g17613326942144185441, dev.epro.r0.V988791003021430672.a, dev.epro.r0.Q11831194664157489693.a, (byte) 1), dev.epro.r0.O15160157444238005800.b(0, 0, 0, i, 7)).g();
    }

    @Override // dev.epro.r0.A11121185661545552785
    public final void d(long j) {
    }

    @Override // dev.epro.r0.A11121185661545552785
    public final void d0(dev.epro.r0.B1029012102904255937 b1029012102904255937) {
    }
}
