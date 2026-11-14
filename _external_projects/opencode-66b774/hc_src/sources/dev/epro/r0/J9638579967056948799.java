package dev.epro.r0;

import android.os.Trace;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J9638579967056948799 extends R15896830329318850690 implements F16971278462881137815, C12172695433110393112, P9179653189917234378, O11952820282592357826, R16749699847173633337 {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f321o;
    public final L12639328004344855510 p;
    public boolean q;
    public boolean r;
    public final int s;
    public R11800251031747375035 t;

    public J9638579967056948799(int i, L12639328004344855510 l12639328004344855510, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        l12639328004344855510 = (i2 & 4) != 0 ? null : l12639328004344855510;
        this.f321o = z;
        this.p = l12639328004344855510;
        this.s = i;
    }

    public static boolean p1(J9638579967056948799 j9638579967056948799) {
        return j9638579967056948799.o1(7);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.C12172695433110393112
    public final void Z() {
        n1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    @Override // dev.epro.r0.R15896830329318850690
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1() {
        /*
            r4 = this;
            dev.epro.r0.H12838525957287096428 r0 = r4.m1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L39
            r1 = 3
            if (r0 != r1) goto L14
            goto L59
        L14:
            dev.epro.r0.Z3383101362411723454.g()
            return
        L18:
            dev.epro.r0.Y633750919412282388 r0 = dev.epro.r0.R7033599853981556291.S(r4)
            dev.epro.r0.S7974369370986781936 r0 = (dev.epro.r0.S7974369370986781936) r0
            dev.epro.r0.Y10761909198794972532 r0 = r0.getFocusOwner()
            dev.epro.r0.J9638579967056948799 r2 = dev.epro.r0.B11964701839924937722.s(r4)
            if (r2 == 0) goto L59
            boolean r2 = r2.f321o
            if (r2 != r1) goto L59
            dev.epro.r0.D10236220797215130727 r0 = (dev.epro.r0.D10236220797215130727) r0
            dev.epro.r0.S7974369370986781936 r1 = r0.a
            r1.H()
            dev.epro.r0.S8823403042703197154 r0 = r0.d
            r0.a()
            goto L59
        L39:
            dev.epro.r0.Y633750919412282388 r0 = dev.epro.r0.R7033599853981556291.S(r4)
            dev.epro.r0.S7974369370986781936 r0 = (dev.epro.r0.S7974369370986781936) r0
            dev.epro.r0.Y10761909198794972532 r0 = r0.getFocusOwner()
            dev.epro.r0.D10236220797215130727 r0 = (dev.epro.r0.D10236220797215130727) r0
            r2 = 8
            r3 = 0
            r0.c(r2, r1, r3)
            boolean r1 = r4.f321o
            if (r1 == 0) goto L54
            dev.epro.r0.S7974369370986781936 r1 = r0.a
            r1.H()
        L54:
            dev.epro.r0.S8823403042703197154 r0 = r0.d
            r0.a()
        L59:
            dev.epro.r0.R11800251031747375035 r0 = r4.t
            if (r0 == 0) goto L62
            dev.epro.r0.I1632105416032993715 r0 = (dev.epro.r0.I1632105416032993715) r0
            r0.x()
        L62:
            r0 = 0
            r4.t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J9638579967056948799.a1():void");
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void b1() {
        if (m1().b()) {
            ((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(this)).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean h1(int i) {
        int ordinal = V12319504402545346730.R(this, i).ordinal();
        if (ordinal == 0) {
            return V12319504402545346730.S(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        Z3383101362411723454.g();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [dev.epro.r0.D389890677992184566] */
    public final void i1(H12838525957287096428 h12838525957287096428, H12838525957287096428 h128385259572870964282) {
        X9608137461199640409 x9608137461199640409;
        L12639328004344855510 l12639328004344855510;
        D10236220797215130727 d10236220797215130727 = (D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(this)).getFocusOwner();
        J9638579967056948799 g = d10236220797215130727.g();
        if (!h12838525957287096428.equals(h128385259572870964282) && (l12639328004344855510 = this.p) != null) {
            l12639328004344855510.invoke(h12838525957287096428, h128385259572870964282);
        }
        R15896830329318850690 r15896830329318850690 = this.a;
        if (!r15896830329318850690.n) {
            P753981624812481271.b("visitAncestors called on an unattached node");
        }
        R15896830329318850690 r158968303293188506902 = this.a;
        H11725168162114556860 R = R7033599853981556291.R(this);
        while (R != null) {
            if ((((R15896830329318850690) R.F.g).d & 5120) != 0) {
                while (r158968303293188506902 != null) {
                    int i = r158968303293188506902.c;
                    if ((i & 5120) != 0) {
                        if (r158968303293188506902 != r15896830329318850690 && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            J2215566372910931965 j2215566372910931965 = r158968303293188506902;
                            ?? r5 = 0;
                            while (j2215566372910931965 != 0) {
                                if (j2215566372910931965 instanceof H7873830272239816472) {
                                    H7873830272239816472 h7873830272239816472 = (H7873830272239816472) j2215566372910931965;
                                    if (g == d10236220797215130727.g()) {
                                        h7873830272239816472.b0(h128385259572870964282);
                                    }
                                } else if ((j2215566372910931965.c & 4096) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                                    R15896830329318850690 r158968303293188506903 = j2215566372910931965.p;
                                    int i2 = 0;
                                    j2215566372910931965 = j2215566372910931965;
                                    r5 = r5;
                                    while (r158968303293188506903 != null) {
                                        if ((r158968303293188506903.c & 4096) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                j2215566372910931965 = r158968303293188506903;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                }
                                                if (j2215566372910931965 != 0) {
                                                    r5.b(j2215566372910931965);
                                                    j2215566372910931965 = 0;
                                                }
                                                r5.b(r158968303293188506903);
                                            }
                                        }
                                        r158968303293188506903 = r158968303293188506903.f;
                                        j2215566372910931965 = j2215566372910931965;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                j2215566372910931965 = R7033599853981556291.M(r5);
                            }
                        }
                    }
                    r158968303293188506902 = r158968303293188506902.e;
                }
            }
            R = R.u();
            r158968303293188506902 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [dev.epro.r0.D389890677992184566] */
    public final I12008059209901932953 j1() {
        boolean z;
        X9608137461199640409 x9608137461199640409;
        I12008059209901932953 i12008059209901932953 = new I12008059209901932953();
        i12008059209901932953.a = true;
        H10681976249452161517 h10681976249452161517 = H10681976249452161517.b;
        i12008059209901932953.b = h10681976249452161517;
        i12008059209901932953.c = h10681976249452161517;
        i12008059209901932953.d = h10681976249452161517;
        i12008059209901932953.e = h10681976249452161517;
        i12008059209901932953.f = h10681976249452161517;
        i12008059209901932953.g = h10681976249452161517;
        i12008059209901932953.h = h10681976249452161517;
        i12008059209901932953.i = h10681976249452161517;
        i12008059209901932953.j = new V10450421848591554621((byte) 27);
        i12008059209901932953.k = new V10450421848591554621((byte) 28);
        i12008059209901932953.l = P2382941533350862833.f428o;
        int i = this.s;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((K2783449822245835676) ((H3362630114104355390) ((V10542822055277485764) B11964701839924937722.o(this, Y238707362170117896.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                S10973172697741180971.m("Unknown Focusability");
                return null;
            }
            z = false;
        }
        i12008059209901932953.a = z;
        R15896830329318850690 r15896830329318850690 = this.a;
        if (!r15896830329318850690.n) {
            P753981624812481271.b("visitAncestors called on an unattached node");
        }
        R15896830329318850690 r158968303293188506902 = this.a;
        H11725168162114556860 R = R7033599853981556291.R(this);
        loop0: while (R != null) {
            if ((((R15896830329318850690) R.F.g).d & 3072) != 0) {
                while (r158968303293188506902 != null) {
                    int i2 = r158968303293188506902.c;
                    if ((i2 & 3072) != 0) {
                        if (r158968303293188506902 != r15896830329318850690 && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? r7 = 0;
                            J2215566372910931965 j2215566372910931965 = r158968303293188506902;
                            while (j2215566372910931965 != 0) {
                                if (j2215566372910931965 instanceof O15099455688051794795) {
                                    ((O15099455688051794795) j2215566372910931965).N(i12008059209901932953);
                                } else if ((j2215566372910931965.c & 2048) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                                    R15896830329318850690 r158968303293188506903 = j2215566372910931965.p;
                                    int i3 = 0;
                                    j2215566372910931965 = j2215566372910931965;
                                    r7 = r7;
                                    while (r158968303293188506903 != null) {
                                        if ((r158968303293188506903.c & 2048) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                j2215566372910931965 = r158968303293188506903;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                }
                                                if (j2215566372910931965 != 0) {
                                                    r7.b(j2215566372910931965);
                                                    j2215566372910931965 = 0;
                                                }
                                                r7.b(r158968303293188506903);
                                            }
                                        }
                                        r158968303293188506903 = r158968303293188506903.f;
                                        j2215566372910931965 = j2215566372910931965;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                j2215566372910931965 = R7033599853981556291.M(r7);
                            }
                        }
                    }
                    r158968303293188506902 = r158968303293188506902.e;
                }
            }
            R = R.u();
            r158968303293188506902 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
        }
        return i12008059209901932953;
    }

    public final S6349823729575121924 k1(B1029012102904255937 b1029012102904255937) {
        S6349823729575121924 s6349823729575121924 = j1().l;
        return s6349823729575121924 != P2382941533350862833.f428o ? b1029012102904255937 == null ? s6349823729575121924 : s6349823729575121924.k(b1029012102904255937.h(R7033599853981556291.Q(this), 0L)) : b1029012102904255937 != null ? b1029012102904255937.E(R7033599853981556291.Q(this), false) : E2166724654553415323.a(0L, I3887072968740112330.Q(R7033599853981556291.Q(this).c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Q5955270991419754356 l1() {
        /*
            r6 = this;
            dev.epro.r0.R15896830329318850690 r0 = r6.a
            boolean r0 = r0.n
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            dev.epro.r0.P753981624812481271.b(r0)
        Lb:
            dev.epro.r0.R15896830329318850690 r0 = r6.a
            dev.epro.r0.R15896830329318850690 r0 = r0.e
            dev.epro.r0.H11725168162114556860 r6 = dev.epro.r0.R7033599853981556291.R(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9f
            dev.epro.r0.X9608137461199640409 r2 = r6.F
            java.lang.Object r2 = r2.g
            dev.epro.r0.R15896830329318850690 r2 = (dev.epro.r0.R15896830329318850690) r2
            int r2 = r2.d
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8c
        L24:
            if (r0 == 0) goto L8c
            int r2 = r0.c
            r4 = r2 & r3
            if (r4 == 0) goto L89
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4f
            boolean r6 = r0 instanceof dev.epro.r0.Q5955270991419754356
            if (r6 == 0) goto L36
            goto L4a
        L36:
            boolean r6 = r0 instanceof dev.epro.r0.J2215566372910931965
            if (r6 == 0) goto L49
            dev.epro.r0.J2215566372910931965 r0 = (dev.epro.r0.J2215566372910931965) r0
            dev.epro.r0.R15896830329318850690 r6 = r0.p
            r0 = r1
        L3f:
            if (r6 == 0) goto L4a
            boolean r2 = r6 instanceof dev.epro.r0.Q5955270991419754356
            if (r2 == 0) goto L46
            r0 = r6
        L46:
            dev.epro.r0.R15896830329318850690 r6 = r6.f
            goto L3f
        L49:
            r0 = r1
        L4a:
            dev.epro.r0.Q5955270991419754356 r0 = (dev.epro.r0.Q5955270991419754356) r0
            if (r0 == 0) goto L9f
            return r0
        L4f:
            r2 = r2 & 32
            if (r2 == 0) goto L89
            boolean r2 = r0 instanceof dev.epro.r0.P9179653189917234378
            if (r2 == 0) goto L59
            r4 = r0
            goto L6e
        L59:
            boolean r2 = r0 instanceof dev.epro.r0.J2215566372910931965
            if (r2 == 0) goto L6d
            r2 = r0
            dev.epro.r0.J2215566372910931965 r2 = (dev.epro.r0.J2215566372910931965) r2
            dev.epro.r0.R15896830329318850690 r2 = r2.p
            r4 = r1
        L63:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof dev.epro.r0.P9179653189917234378
            if (r5 == 0) goto L6a
            r4 = r2
        L6a:
            dev.epro.r0.R15896830329318850690 r2 = r2.f
            goto L63
        L6d:
            r4 = r1
        L6e:
            dev.epro.r0.P9179653189917234378 r4 = (dev.epro.r0.P9179653189917234378) r4
            if (r4 == 0) goto L89
            dev.epro.r0.Z860808776098365610 r2 = r4.l()
            dev.epro.r0.O14561027293699174040 r5 = dev.epro.r0.Z860808776098365610.b
            boolean r2 = r2.x(r5)
            if (r2 == 0) goto L89
            dev.epro.r0.Z860808776098365610 r6 = r4.l()
            java.lang.Object r6 = r6.D(r5)
            dev.epro.r0.Q5955270991419754356 r6 = (dev.epro.r0.Q5955270991419754356) r6
            return r6
        L89:
            dev.epro.r0.R15896830329318850690 r0 = r0.e
            goto L24
        L8c:
            dev.epro.r0.H11725168162114556860 r6 = r6.u()
            if (r6 == 0) goto L9c
            dev.epro.r0.X9608137461199640409 r0 = r6.F
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.f
            dev.epro.r0.E6101237837392211295 r0 = (dev.epro.r0.E6101237837392211295) r0
            goto L13
        L9c:
            r0 = r1
            goto L13
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J9638579967056948799.l1():dev.epro.r0.Q5955270991419754356");
    }

    public final H12838525957287096428 m1() {
        X9608137461199640409 x9608137461199640409;
        boolean z = this.n;
        H12838525957287096428 h12838525957287096428 = H12838525957287096428.c;
        if (!z) {
            return h12838525957287096428;
        }
        J9638579967056948799 g = ((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(this)).getFocusOwner()).g();
        if (g == null) {
            return h12838525957287096428;
        }
        if (this == g) {
            return H12838525957287096428.a;
        }
        if (g.n) {
            if (!g.a.n) {
                P753981624812481271.b("visitAncestors called on an unattached node");
            }
            R15896830329318850690 r15896830329318850690 = g.a.e;
            H11725168162114556860 R = R7033599853981556291.R(g);
            while (R != null) {
                if ((((R15896830329318850690) R.F.g).d & 1024) != 0) {
                    while (r15896830329318850690 != null) {
                        if ((r15896830329318850690.c & 1024) != 0) {
                            R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                            D389890677992184566 d389890677992184566 = null;
                            while (r158968303293188506902 != null) {
                                if (r158968303293188506902 instanceof J9638579967056948799) {
                                    if (this == ((J9638579967056948799) r158968303293188506902)) {
                                        return H12838525957287096428.b;
                                    }
                                } else if ((r158968303293188506902.c & 1024) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                                    int i = 0;
                                    for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                        if ((r158968303293188506903.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r158968303293188506902 = r158968303293188506903;
                                            } else {
                                                if (d389890677992184566 == null) {
                                                    d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                }
                                                if (r158968303293188506902 != null) {
                                                    d389890677992184566.b(r158968303293188506902);
                                                    r158968303293188506902 = null;
                                                }
                                                d389890677992184566.b(r158968303293188506903);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                r158968303293188506902 = R7033599853981556291.M(d389890677992184566);
                            }
                        }
                        r15896830329318850690 = r15896830329318850690.e;
                    }
                }
                R = R.u();
                r15896830329318850690 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
            }
        }
        return h12838525957287096428;
    }

    public final void n1() {
        int ordinal = m1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                Z3383101362411723454.g();
                return;
            }
        }
        A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
        I3887072968740112330.D(this, new O9814524300768724052(a7209497065939201693, this, (byte) 6));
        Object obj = a7209497065939201693.a;
        if (obj == null) {
            S10823041268949770285.b0("focusProperties");
            throw null;
        }
        if (((C13258628320776285546) obj).a()) {
            return;
        }
        ((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(this)).getFocusOwner()).c(8, true, true);
    }

    public final boolean o1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return j1().a ? h1(i) : V4416135141588678913.l(this, i, new O16774394856129852758(i, (byte) 6));
        } finally {
            Trace.endSection();
        }
    }

    @Override // dev.epro.r0.O11952820282592357826
    public final void T0() {
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
    }
}
