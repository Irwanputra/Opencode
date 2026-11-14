package dev.epro.r0;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E16236172717107512059 extends R15896830329318850690 implements D10205225622993155321, V6844203142031704410, T11401768751197276141, B18307494358031290147, P9179653189917234378, F10302678904745754545, A11121185661545552785, O10709431398915260868, H7873830272239816472, O15099455688051794795, L10763019129195295039, G13991919739136867102, P12234187177891585406 {

    /* renamed from: o, reason: collision with root package name */
    public L8750838032724194107 f216o;
    public R14612536297276259359 p;
    public HashSet q;

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        n17396598995248644478.a();
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void H0() {
        V1475975160983963926.D(this);
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void J0() {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        ((I17687524211334993649) l8750838032724194107).d.getClass();
    }

    @Override // dev.epro.r0.G13991919739136867102
    public final boolean L() {
        return this.n;
    }

    @Override // dev.epro.r0.O15099455688051794795
    public final void N(C13258628320776285546 c13258628320776285546) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        P753981624812481271.b("applyFocusProperties called on wrong node");
        l8750838032724194107.getClass();
        throw new ClassCastException();
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        E10198359844879945462 F0 = ((U5372921367212226273) l8750838032724194107).F0();
        s2460821117650695638.getClass();
        E10198359844879945462 e10198359844879945462 = (E10198359844879945462) s2460821117650695638;
        A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
        if (F0.c) {
            e10198359844879945462.c = true;
        }
        if (F0.d) {
            e10198359844879945462.d = true;
        }
        A4559761392562572984 a45597613925625729842 = F0.a;
        Object[] objArr = a45597613925625729842.b;
        Object[] objArr2 = a45597613925625729842.c;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        P14992748401341948828 p14992748401341948828 = (P14992748401341948828) obj;
                        if (!a4559761392562572984.b(p14992748401341948828)) {
                            a4559761392562572984.n(p14992748401341948828, obj2);
                        } else if (obj2 instanceof R17587901753867651123) {
                            Object g = a4559761392562572984.g(p14992748401341948828);
                            g.getClass();
                            R17587901753867651123 r17587901753867651123 = (R17587901753867651123) g;
                            String str = r17587901753867651123.a;
                            if (str == null) {
                                str = ((R17587901753867651123) obj2).a;
                            }
                            S8977162183056139880 s8977162183056139880 = r17587901753867651123.b;
                            if (s8977162183056139880 == null) {
                                s8977162183056139880 = ((R17587901753867651123) obj2).b;
                            }
                            a4559761392562572984.n(p14992748401341948828, new R17587901753867651123(str, s8977162183056139880));
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
    public final int W(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((B321559534056331132) l8750838032724194107).h(new O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new D677275267896868264(g17613326942144185441, V988791003021430672.b, Q11831194664157489693.a, (byte) 1), O15160157444238005800.b(0, 0, 0, i, 7)).g();
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        h1(true);
    }

    @Override // dev.epro.r0.R16749699847173633337
    public final void a() {
        if (this.f216o instanceof I17687524211334993649) {
            x0();
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        i1();
    }

    @Override // dev.epro.r0.H7873830272239816472
    public final void b0(H12838525957287096428 h12838525957287096428) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        P753981624812481271.b("onFocusEvent called on wrong node");
        l8750838032724194107.getClass();
        throw new ClassCastException();
    }

    @Override // dev.epro.r0.P12234187177891585406
    public final R8540738700654750557 c() {
        return R7033599853981556291.R(this).y;
    }

    @Override // dev.epro.r0.P12234187177891585406
    public final long e() {
        return I3887072968740112330.Q(R7033599853981556291.P(this, 128).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // dev.epro.r0.P9179653189917234378
    public final Object f() {
        X9608137461199640409 x9608137461199640409;
        O14561027293699174040 o14561027293699174040 = J8045362843799184672.i;
        this.q.add(o14561027293699174040);
        if (!this.a.n) {
            P753981624812481271.b("visitAncestors called on an unattached node");
        }
        R15896830329318850690 r15896830329318850690 = this.a.e;
        H11725168162114556860 R = R7033599853981556291.R(this);
        while (R != null) {
            if ((((R15896830329318850690) R.F.g).d & 32) != 0) {
                while (r15896830329318850690 != null) {
                    if ((r15896830329318850690.c & 32) != 0) {
                        J2215566372910931965 j2215566372910931965 = r15896830329318850690;
                        ?? r4 = 0;
                        while (j2215566372910931965 != 0) {
                            if (j2215566372910931965 instanceof P9179653189917234378) {
                                P9179653189917234378 p9179653189917234378 = (P9179653189917234378) j2215566372910931965;
                                if (p9179653189917234378.l().x(o14561027293699174040)) {
                                    return p9179653189917234378.l().D(o14561027293699174040);
                                }
                            } else if ((j2215566372910931965.c & 32) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506902 = j2215566372910931965.p;
                                int i = 0;
                                j2215566372910931965 = j2215566372910931965;
                                r4 = r4;
                                while (r158968303293188506902 != null) {
                                    if ((r158968303293188506902.c & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            j2215566372910931965 = r158968303293188506902;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (j2215566372910931965 != 0) {
                                                r4.b(j2215566372910931965);
                                                j2215566372910931965 = 0;
                                            }
                                            r4.b(r158968303293188506902);
                                        }
                                    }
                                    r158968303293188506902 = r158968303293188506902.f;
                                    j2215566372910931965 = j2215566372910931965;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            j2215566372910931965 = R7033599853981556291.M(r4);
                        }
                    }
                    r15896830329318850690 = r15896830329318850690.e;
                }
            }
            R = R.u();
            r15896830329318850690 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
        }
        return o14561027293699174040.a.invoke();
    }

    @Override // dev.epro.r0.P12234187177891585406
    public final F10342546226345611902 getLayoutDirection() {
        return R7033599853981556291.R(this).z;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((B321559534056331132) l8750838032724194107).h(i5164649337253478959, g17613326942144185441, j);
    }

    public final void h1(boolean z) {
        if (!this.n) {
            P753981624812481271.b("initializeModifier called on unattached node");
        }
        L8750838032724194107 l8750838032724194107 = this.f216o;
        if ((this.c & 32) != 0 && (l8750838032724194107 instanceof W2387504280787725972)) {
            W2387504280787725972 w2387504280787725972 = (W2387504280787725972) l8750838032724194107;
            O14561027293699174040 o14561027293699174040 = R17739216783154562303.a;
            R14612536297276259359 r14612536297276259359 = this.p;
            if (r14612536297276259359 == null || !r14612536297276259359.x(o14561027293699174040)) {
                R14612536297276259359 r146125362972762593592 = new R14612536297276259359();
                r146125362972762593592.f464o = w2387504280787725972;
                this.p = r146125362972762593592;
                E6101237837392211295 e6101237837392211295 = (E6101237837392211295) R7033599853981556291.R(this).F.f;
                e6101237837392211295.getClass();
                if (e6101237837392211295.f227o) {
                    X1072671764734194220 modifierLocalManager = ((S7974369370986781936) R7033599853981556291.S(this)).getModifierLocalManager();
                    U9803441765912152712 u9803441765912152712 = modifierLocalManager.b;
                    if (u9803441765912152712 == null) {
                        u9803441765912152712 = new U9803441765912152712();
                        modifierLocalManager.b = u9803441765912152712;
                    }
                    u9803441765912152712.a(this);
                    U9803441765912152712 u98034417659121527122 = modifierLocalManager.c;
                    if (u98034417659121527122 == null) {
                        u98034417659121527122 = new U9803441765912152712();
                        modifierLocalManager.c = u98034417659121527122;
                    }
                    u98034417659121527122.a(o14561027293699174040);
                    modifierLocalManager.a();
                }
            } else {
                r14612536297276259359.f464o = w2387504280787725972;
                X1072671764734194220 modifierLocalManager2 = ((S7974369370986781936) R7033599853981556291.S(this)).getModifierLocalManager();
                U9803441765912152712 u98034417659121527123 = modifierLocalManager2.b;
                if (u98034417659121527123 == null) {
                    u98034417659121527123 = new U9803441765912152712();
                    modifierLocalManager2.b = u98034417659121527123;
                }
                u98034417659121527123.a(this);
                U9803441765912152712 u98034417659121527124 = modifierLocalManager2.c;
                if (u98034417659121527124 == null) {
                    u98034417659121527124 = new U9803441765912152712();
                    modifierLocalManager2.c = u98034417659121527124;
                }
                u98034417659121527124.a(o14561027293699174040);
                modifierLocalManager2.a();
            }
        }
        if ((this.c & 4) != 0 && !z) {
            R7033599853981556291.P(this, 2).m1();
        }
        if ((this.c & 2) != 0) {
            E6101237837392211295 e61012378373922112952 = (E6101237837392211295) R7033599853981556291.R(this).F.f;
            e61012378373922112952.getClass();
            if (e61012378373922112952.f227o) {
                Y4989033692226475498 y4989033692226475498 = this.h;
                y4989033692226475498.getClass();
                ((K12961197752049417088) y4989033692226475498).I1(this);
                U18133900443301080740 u18133900443301080740 = y4989033692226475498.T;
                if (u18133900443301080740 != null) {
                    ((R12643293538999642754) u18133900443301080740).c();
                }
            }
            if (!z) {
                R7033599853981556291.P(this, 2).m1();
                R7033599853981556291.R(this).E();
            }
        }
        if (l8750838032724194107 instanceof O8465802837550908662) {
            O8465802837550908662 o8465802837550908662 = (O8465802837550908662) l8750838032724194107;
            H11725168162114556860 R = R7033599853981556291.R(this);
            switch (o8465802837550908662.a) {
                case 0:
                    ((W5896017744614017491) o8465802837550908662.b).j = R;
                    break;
                case 1:
                    ((E17523205116624666034) o8465802837550908662.b).l = R;
                    break;
                default:
                    ((X16625187937554653603) o8465802837550908662.b).w.setValue(R);
                    break;
            }
        }
        if ((this.c & 256) != 0 && (l8750838032724194107 instanceof T10113869190613358580)) {
            E6101237837392211295 e61012378373922112953 = (E6101237837392211295) R7033599853981556291.R(this).F.f;
            e61012378373922112953.getClass();
            if (e61012378373922112953.f227o) {
                R7033599853981556291.R(this).E();
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (l8750838032724194107 instanceof I17687524211334993649)) {
            ((I17687524211334993649) l8750838032724194107).d.c = this.h;
        }
        if ((i & 8) != 0) {
            ((S7974369370986781936) R7033599853981556291.S(this)).C();
        }
    }

    @Override // dev.epro.r0.F10302678904745754545
    public final Object i(R8540738700654750557 r8540738700654750557, Object obj) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((M14071578157262992915) l8750838032724194107).i(r8540738700654750557, obj);
    }

    public final void i1() {
        if (!this.n) {
            P753981624812481271.b("unInitializeModifier called on unattached node");
        }
        L8750838032724194107 l8750838032724194107 = this.f216o;
        if ((this.c & 32) != 0 && (l8750838032724194107 instanceof W2387504280787725972)) {
            X1072671764734194220 modifierLocalManager = ((S7974369370986781936) R7033599853981556291.S(this)).getModifierLocalManager();
            O14561027293699174040 o14561027293699174040 = R17739216783154562303.a;
            U9803441765912152712 u9803441765912152712 = modifierLocalManager.d;
            if (u9803441765912152712 == null) {
                u9803441765912152712 = new U9803441765912152712();
                modifierLocalManager.d = u9803441765912152712;
            }
            u9803441765912152712.a(R7033599853981556291.R(this));
            U9803441765912152712 u98034417659121527122 = modifierLocalManager.e;
            if (u98034417659121527122 == null) {
                u98034417659121527122 = new U9803441765912152712();
                modifierLocalManager.e = u98034417659121527122;
            }
            u98034417659121527122.a(o14561027293699174040);
            modifierLocalManager.a();
        }
        if ((this.c & 8) != 0) {
            ((S7974369370986781936) R7033599853981556291.S(this)).C();
        }
    }

    public final void j1() {
        if (this.n) {
            this.q.clear();
            B4499109999593241705 snapshotObserver = ((S7974369370986781936) R7033599853981556291.S(this)).getSnapshotObserver();
            snapshotObserver.a.d(this, G16660188620551127941.c, new S464754454553842217(this, (byte) 7));
        }
    }

    @Override // dev.epro.r0.P9179653189917234378
    public final Z860808776098365610 l() {
        R14612536297276259359 r14612536297276259359 = this.p;
        return r14612536297276259359 != null ? r14612536297276259359 : E5367294674037035345.f225o;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((B321559534056331132) l8750838032724194107).h(new O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new D677275267896868264(g17613326942144185441, V988791003021430672.b, Q11831194664157489693.b, (byte) 1), O15160157444238005800.b(0, i, 0, 0, 13)).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122 A[ORIG_RETURN, RETURN] */
    @Override // dev.epro.r0.B18307494358031290147
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(dev.epro.r0.Y1086209215650239921 r9, dev.epro.r0.J17191566391535857141 r10, long r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E16236172717107512059.n0(dev.epro.r0.Y1086209215650239921, dev.epro.r0.J17191566391535857141, long):void");
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final boolean o0() {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        ((I17687524211334993649) l8750838032724194107).d.getClass();
        return true;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((B321559534056331132) l8750838032724194107).h(new O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new D677275267896868264(g17613326942144185441, V988791003021430672.a, Q11831194664157489693.b, (byte) 1), O15160157444238005800.b(0, i, 0, 0, 13)).d();
    }

    @Override // dev.epro.r0.O10709431398915260868
    public final void s0(Y4989033692226475498 y4989033692226475498) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        ((T10113869190613358580) l8750838032724194107).s0(y4989033692226475498);
    }

    public final String toString() {
        return this.f216o.toString();
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        J15730374346044043770 j15730374346044043770 = ((I17687524211334993649) l8750838032724194107).d;
        Y15332629801367963516 y15332629801367963516 = (Y15332629801367963516) j15730374346044043770.d;
        I17687524211334993649 i17687524211334993649 = (I17687524211334993649) j15730374346044043770.b;
        if (y15332629801367963516 == Y15332629801367963516.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            ((K15228821986458594157) i17687524211334993649.a()).invoke(obtain);
            obtain.recycle();
            j15730374346044043770.d = Y15332629801367963516.a;
            i17687524211334993649.c = false;
            j15730374346044043770.e = null;
        }
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        L8750838032724194107 l8750838032724194107 = this.f216o;
        l8750838032724194107.getClass();
        return ((B321559534056331132) l8750838032724194107).h(new O8104569155564870270(i11965759855724288421, i11965759855724288421.getLayoutDirection()), new D677275267896868264(g17613326942144185441, V988791003021430672.a, Q11831194664157489693.a, (byte) 1), O15160157444238005800.b(0, 0, 0, i, 7)).g();
    }

    @Override // dev.epro.r0.A11121185661545552785, dev.epro.r0.T975006071468260715
    public final void d(long j) {
    }

    @Override // dev.epro.r0.A11121185661545552785
    public final void d0(B1029012102904255937 b1029012102904255937) {
    }
}
