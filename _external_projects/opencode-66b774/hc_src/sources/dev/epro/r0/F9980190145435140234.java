package dev.epro.r0;

import android.os.Trace;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F9980190145435140234 {
    public final H11725168162114556860 a;
    public boolean c;
    public boolean d;
    public I16980768508151520658 h;
    public final Q7316561721656982910 b = new Q7316561721656982910((byte) 17);
    public final V10300877997588547986 e = new V10300877997588547986((byte) 10);
    public final D389890677992184566 f = new D389890677992184566(0, new H11725168162114556860[16]);
    public final D389890677992184566 g = new D389890677992184566(0, new A12350950740000434161[16]);

    public F9980190145435140234(H11725168162114556860 h11725168162114556860) {
        this.a = h11725168162114556860;
    }

    public static boolean c(H11725168162114556860 h11725168162114556860, I16980768508151520658 i16980768508151520658) {
        boolean G0;
        H11725168162114556860 h117251681621145568602 = h11725168162114556860.h;
        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
        if (h117251681621145568602 == null) {
            return false;
        }
        if (i16980768508151520658 != null) {
            if (h117251681621145568602 != null) {
                L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
                l8383256292871170816.getClass();
                G0 = l8383256292871170816.G0(i16980768508151520658.a);
            }
            G0 = false;
        } else {
            L8383256292871170816 l83832562928711708162 = r8000300579679385019.q;
            I16980768508151520658 i169807685081515206582 = l83832562928711708162 != null ? l83832562928711708162.n : null;
            if (i169807685081515206582 != null && h117251681621145568602 != null) {
                l83832562928711708162.getClass();
                G0 = l83832562928711708162.G0(i169807685081515206582.a);
            }
            G0 = false;
        }
        H11725168162114556860 u = h11725168162114556860.u();
        if (G0 && u != null) {
            if (u.h == null) {
                H11725168162114556860.W(u, false, 3);
                return G0;
            }
            if (h11725168162114556860.s() == Q8181337811809788579.a) {
                H11725168162114556860.U(u, false, 3);
                return G0;
            }
            if (h11725168162114556860.s() == Q8181337811809788579.b) {
                u.T(false);
            }
        }
        return G0;
    }

    public static boolean d(H11725168162114556860 h11725168162114556860, I16980768508151520658 i16980768508151520658) {
        boolean z;
        Q8181337811809788579 q8181337811809788579 = Q8181337811809788579.c;
        if (i16980768508151520658 != null) {
            if (h11725168162114556860.C == q8181337811809788579) {
                h11725168162114556860.c();
            }
            z = h11725168162114556860.G.p.G0(i16980768508151520658.a);
        } else {
            T8458668874796040341 t8458668874796040341 = h11725168162114556860.G.p;
            I16980768508151520658 i169807685081515206582 = t8458668874796040341.j ? new I16980768508151520658(t8458668874796040341.d) : null;
            if (i169807685081515206582 != null) {
                if (h11725168162114556860.C == q8181337811809788579) {
                    h11725168162114556860.c();
                }
                z = h11725168162114556860.G.p.G0(i169807685081515206582.a);
            } else {
                h11725168162114556860.getClass();
                z = false;
            }
        }
        H11725168162114556860 u = h11725168162114556860.u();
        if (z && u != null) {
            if (h11725168162114556860.r() == Q8181337811809788579.a) {
                H11725168162114556860.W(u, false, 3);
                return z;
            }
            if (h11725168162114556860.r() == Q8181337811809788579.b) {
                u.V(false);
            }
        }
        return z;
    }

    public static boolean i(H11725168162114556860 h11725168162114556860) {
        L8383256292871170816 l8383256292871170816;
        V13058232089047844042 v13058232089047844042;
        if (h11725168162114556860.G.e) {
            return (h11725168162114556860.s() == Q8181337811809788579.c && ((l8383256292871170816 = h11725168162114556860.G.q) == null || (v13058232089047844042 = l8383256292871170816.s) == null || !v13058232089047844042.e())) ? false : true;
        }
        return false;
    }

    public static boolean j(H11725168162114556860 h11725168162114556860) {
        if (!h11725168162114556860.q()) {
            return false;
        }
        do {
            if (h11725168162114556860.r() == Q8181337811809788579.c && !h11725168162114556860.G.p.y.e()) {
                H11725168162114556860 u = h11725168162114556860.u();
                if ((u != null ? u.G.d : null) != J4327291511168983093.a) {
                    return false;
                }
            }
            h11725168162114556860 = h11725168162114556860.u();
            if (h11725168162114556860 == null) {
                return false;
            }
        } while (!h11725168162114556860.I());
        return true;
    }

    public static boolean k(H11725168162114556860 h11725168162114556860) {
        L8383256292871170816 l8383256292871170816;
        V13058232089047844042 v13058232089047844042;
        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
        return h11725168162114556860.I() || r8000300579679385019.p.u || j(h11725168162114556860) || S10823041268949770285.t(h11725168162114556860.J(), Boolean.TRUE) || i(h11725168162114556860) || r8000300579679385019.p.y.e() || !((l8383256292871170816 = r8000300579679385019.q) == null || (v13058232089047844042 = l8383256292871170816.s) == null || !v13058232089047844042.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void a() {
        D389890677992184566 d389890677992184566 = this.f;
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            X9608137461199640409 x9608137461199640409 = ((H11725168162114556860) objArr[i2]).F;
            I16141028645763443416 i16141028645763443416 = (I16141028645763443416) x9608137461199640409.d;
            boolean g = L5069768235772837017.g(4194304);
            R15896830329318850690 r15896830329318850690 = i16141028645763443416.c0;
            if (g || (r15896830329318850690 = r15896830329318850690.e) != null) {
                H12529970590088694579 h12529970590088694579 = Y4989033692226475498.V;
                for (R15896830329318850690 h1 = i16141028645763443416.h1(g); h1 != null && (h1.d & 4194304) != 0; h1 = h1.f) {
                    if ((h1.c & 4194304) != 0) {
                        J2215566372910931965 j2215566372910931965 = h1;
                        ?? r10 = 0;
                        while (j2215566372910931965 != 0) {
                            if (j2215566372910931965 instanceof A11121185661545552785) {
                                ((A11121185661545552785) j2215566372910931965).d0((I16141028645763443416) x9608137461199640409.d);
                            } else if ((j2215566372910931965.c & 4194304) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506902 = j2215566372910931965.p;
                                int i3 = 0;
                                j2215566372910931965 = j2215566372910931965;
                                r10 = r10;
                                while (r158968303293188506902 != null) {
                                    if ((r158968303293188506902.c & 4194304) != 0) {
                                        i3++;
                                        r10 = r10;
                                        if (i3 == 1) {
                                            j2215566372910931965 = r158968303293188506902;
                                        } else {
                                            if (r10 == 0) {
                                                r10 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (j2215566372910931965 != 0) {
                                                r10.b(j2215566372910931965);
                                                j2215566372910931965 = 0;
                                            }
                                            r10.b(r158968303293188506902);
                                        }
                                    }
                                    r158968303293188506902 = r158968303293188506902.f;
                                    j2215566372910931965 = j2215566372910931965;
                                    r10 = r10;
                                }
                                if (i3 == 1) {
                                }
                            }
                            j2215566372910931965 = R7033599853981556291.M(r10);
                        }
                    }
                    if (h1 != r15896830329318850690) {
                    }
                }
            }
        }
        d389890677992184566.i();
    }

    public final void b(boolean z) {
        V10300877997588547986 v10300877997588547986 = this.e;
        D389890677992184566 d389890677992184566 = (D389890677992184566) v10300877997588547986.b;
        if (z) {
            H11725168162114556860 h11725168162114556860 = this.a;
            if (h11725168162114556860.P > 0) {
                d389890677992184566.i();
                d389890677992184566.b(h11725168162114556860);
                h11725168162114556860.O = true;
            }
        }
        if (d389890677992184566.c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                v10300877997588547986.i();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        D389890677992184566 d389890677992184566 = this.g;
        int i = d389890677992184566.c;
        if (i != 0) {
            Object[] objArr = d389890677992184566.a;
            for (int i2 = 0; i2 < i; i2++) {
                A12350950740000434161 a12350950740000434161 = (A12350950740000434161) objArr[i2];
                if (a12350950740000434161.a.H()) {
                    boolean z = a12350950740000434161.b;
                    H11725168162114556860 h11725168162114556860 = a12350950740000434161.a;
                    boolean z2 = a12350950740000434161.c;
                    if (z) {
                        H11725168162114556860.U(h11725168162114556860, z2, 2);
                    } else {
                        H11725168162114556860.W(h11725168162114556860, z2, 2);
                    }
                }
            }
            d389890677992184566.i();
        }
    }

    public final void f(H11725168162114556860 h11725168162114556860) {
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            if (S10823041268949770285.t(h117251681621145568602.J(), Boolean.TRUE) && !h117251681621145568602.Q) {
                if (this.b.s(h117251681621145568602)) {
                    h117251681621145568602.K();
                }
                f(h117251681621145568602);
            }
        }
    }

    public final void g(H11725168162114556860 h11725168162114556860, boolean z) {
        if (!this.c) {
            P753981624812481271.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? h11725168162114556860.G.e : h11725168162114556860.q()) {
            P753981624812481271.a("node not yet measured");
        }
        h(h11725168162114556860, z);
    }

    public final void h(H11725168162114556860 h11725168162114556860, boolean z) {
        L8383256292871170816 l8383256292871170816;
        V13058232089047844042 v13058232089047844042;
        D389890677992184566 z2 = h11725168162114556860.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            Q8181337811809788579 q8181337811809788579 = Q8181337811809788579.a;
            if ((!z && (h117251681621145568602.r() == q8181337811809788579 || h117251681621145568602.G.p.y.e())) || (z && (h117251681621145568602.s() == q8181337811809788579 || ((l8383256292871170816 = h117251681621145568602.G.q) != null && (v13058232089047844042 = l8383256292871170816.s) != null && v13058232089047844042.e())))) {
                boolean y = O4077903568229246.y(h117251681621145568602);
                R8000300579679385019 r8000300579679385019 = h117251681621145568602.G;
                if (y && !z) {
                    if (r8000300579679385019.e && this.b.s(h117251681621145568602)) {
                        p(h117251681621145568602, true);
                    } else {
                        g(h117251681621145568602, true);
                    }
                }
                if (z ? r8000300579679385019.e : h117251681621145568602.q()) {
                    p(h117251681621145568602, z);
                }
                if (!(z ? r8000300579679385019.e : h117251681621145568602.q())) {
                    h(h117251681621145568602, z);
                }
            }
        }
        if (z ? h11725168162114556860.G.e : h11725168162114556860.q()) {
            p(h11725168162114556860, z);
        }
    }

    public final boolean l(B13729205492206812220 b13729205492206812220) {
        boolean z;
        boolean z2;
        H11725168162114556860 h11725168162114556860;
        boolean z3;
        boolean p;
        Q7316561721656982910 q7316561721656982910 = this.b;
        F6942723054099263096 f6942723054099263096 = (F6942723054099263096) q7316561721656982910.b;
        H11725168162114556860 h117251681621145568602 = this.a;
        if (!h117251681621145568602.H()) {
            P753981624812481271.a("performMeasureAndLayout called with unattached root");
        }
        if (!h117251681621145568602.I()) {
            P753981624812481271.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            P753981624812481271.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (q7316561721656982910.I()) {
                    z = false;
                    while (true) {
                        F6942723054099263096 f69427230540992630962 = (F6942723054099263096) q7316561721656982910.d;
                        X7482811339048806651 x7482811339048806651 = (X7482811339048806651) f69427230540992630962.b;
                        F6942723054099263096 f69427230540992630963 = (F6942723054099263096) q7316561721656982910.c;
                        X7482811339048806651 x74828113390488066512 = (X7482811339048806651) f69427230540992630963.b;
                        if (!((X7482811339048806651) f6942723054099263096.b).isEmpty()) {
                            h11725168162114556860 = (H11725168162114556860) ((X7482811339048806651) f6942723054099263096.b).first();
                            f6942723054099263096.l(h11725168162114556860);
                            z3 = h11725168162114556860.h != null;
                            z2 = false;
                        } else if (!x74828113390488066512.isEmpty()) {
                            h11725168162114556860 = (H11725168162114556860) x74828113390488066512.first();
                            f69427230540992630963.l(h11725168162114556860);
                            z3 = h11725168162114556860.h != null;
                            z2 = true;
                        } else {
                            if (x7482811339048806651.isEmpty()) {
                                break;
                            }
                            H11725168162114556860 h117251681621145568603 = (H11725168162114556860) x7482811339048806651.first();
                            f69427230540992630962.l(h117251681621145568603);
                            z2 = true;
                            h11725168162114556860 = h117251681621145568603;
                            z3 = false;
                        }
                        if (z2) {
                            p = o(h11725168162114556860, z3);
                        } else {
                            p = p(h11725168162114556860, z3);
                            if (h11725168162114556860.G.f) {
                                q7316561721656982910.f(h11725168162114556860, J5032171413189498920.b);
                            }
                            if (h11725168162114556860.p()) {
                                q7316561721656982910.f(h11725168162114556860, J5032171413189498920.d);
                            }
                        }
                        if (h11725168162114556860 == h117251681621145568602 && p) {
                            z = true;
                        }
                    }
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z4 = z;
            } finally {
            }
        }
        a();
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00b9, B:45:0x00c2, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00b9, B:45:0x00c2, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00b9, B:45:0x00c2, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00b9, B:45:0x00c2, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(dev.epro.r0.H11725168162114556860 r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6.Q
            dev.epro.r0.R8000300579679385019 r1 = r6.G
            if (r0 == 0) goto L7
            return
        L7:
            dev.epro.r0.H11725168162114556860 r0 = r5.a
            if (r6 == r0) goto Lc
            goto L11
        Lc:
            java.lang.String r2 = "measureAndLayout called on root"
            dev.epro.r0.P753981624812481271.a(r2)
        L11:
            boolean r2 = r0.H()
            if (r2 != 0) goto L1c
            java.lang.String r2 = "performMeasureAndLayout called with unattached root"
            dev.epro.r0.P753981624812481271.a(r2)
        L1c:
            boolean r0 = r0.I()
            if (r0 != 0) goto L27
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            dev.epro.r0.P753981624812481271.a(r0)
        L27:
            boolean r0 = r5.c
            if (r0 == 0) goto L30
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            dev.epro.r0.P753981624812481271.a(r0)
        L30:
            dev.epro.r0.I16980768508151520658 r0 = r5.h
            if (r0 == 0) goto Ld1
            r0 = 1
            r5.c = r0
            r2 = 0
            r5.d = r2
            dev.epro.r0.Q7316561721656982910 r3 = r5.b     // Catch: java.lang.Throwable -> L61
            java.lang.Object r4 = r3.b     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.F6942723054099263096 r4 = (dev.epro.r0.F6942723054099263096) r4     // Catch: java.lang.Throwable -> L61
            r4.l(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r4 = r3.c     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.F6942723054099263096 r4 = (dev.epro.r0.F6942723054099263096) r4     // Catch: java.lang.Throwable -> L61
            r4.l(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r3.d     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.F6942723054099263096 r3 = (dev.epro.r0.F6942723054099263096) r3     // Catch: java.lang.Throwable -> L61
            r3.l(r6)     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.I16980768508151520658 r3 = new dev.epro.r0.I16980768508151520658     // Catch: java.lang.Throwable -> L61
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L61
            boolean r3 = c(r6, r3)     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L63
            boolean r3 = r1.f     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L72
            goto L63
        L61:
            r6 = move-exception
            goto Lca
        L63:
            java.lang.Boolean r3 = r6.J()     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61
            boolean r3 = dev.epro.r0.S10823041268949770285.t(r3, r4)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L72
            r6.K()     // Catch: java.lang.Throwable -> L61
        L72:
            r5.f(r6)     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.Q8181337811809788579 r3 = r6.C     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.Q8181337811809788579 r4 = dev.epro.r0.Q8181337811809788579.c     // Catch: java.lang.Throwable -> L61
            if (r3 != r4) goto L7e
            r6.c()     // Catch: java.lang.Throwable -> L61
        L7e:
            dev.epro.r0.T8458668874796040341 r1 = r1.p     // Catch: java.lang.Throwable -> L61
            boolean r7 = r1.G0(r7)     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.H11725168162114556860 r8 = r6.u()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto La4
            if (r8 == 0) goto La4
            dev.epro.r0.Q8181337811809788579 r7 = r6.r()     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.Q8181337811809788579 r1 = dev.epro.r0.Q8181337811809788579.a     // Catch: java.lang.Throwable -> L61
            if (r7 != r1) goto L99
            r7 = 3
            dev.epro.r0.H11725168162114556860.W(r8, r2, r7)     // Catch: java.lang.Throwable -> L61
            goto La4
        L99:
            dev.epro.r0.Q8181337811809788579 r7 = r6.r()     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.Q8181337811809788579 r1 = dev.epro.r0.Q8181337811809788579.b     // Catch: java.lang.Throwable -> L61
            if (r7 != r1) goto La4
            r8.V(r2)     // Catch: java.lang.Throwable -> L61
        La4:
            boolean r7 = r6.p()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto Lc2
            boolean r7 = r6.I()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto Lc2
            r6.S()     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.V10300877997588547986 r7 = r5.e     // Catch: java.lang.Throwable -> L61
            int r8 = r6.P     // Catch: java.lang.Throwable -> L61
            if (r8 <= 0) goto Lc2
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.D389890677992184566 r7 = (dev.epro.r0.D389890677992184566) r7     // Catch: java.lang.Throwable -> L61
            r7.b(r6)     // Catch: java.lang.Throwable -> L61
            r6.O = r0     // Catch: java.lang.Throwable -> L61
        Lc2:
            r5.e()     // Catch: java.lang.Throwable -> L61
            r5.c = r2
            r5.d = r2
            goto Ld1
        Lca:
            throw r6     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r6 = move-exception
            r5.c = r2
            r5.d = r2
            throw r6
        Ld1:
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F9980190145435140234.m(dev.epro.r0.H11725168162114556860, long):void");
    }

    public final void n() {
        Q7316561721656982910 q7316561721656982910 = this.b;
        if (q7316561721656982910.I()) {
            H11725168162114556860 h11725168162114556860 = this.a;
            if (!h11725168162114556860.H()) {
                P753981624812481271.a("performMeasureAndLayout called with unattached root");
            }
            if (!h11725168162114556860.I()) {
                P753981624812481271.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                P753981624812481271.a("performMeasureAndLayout called during measure layout");
            }
            if (this.h != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((X7482811339048806651) ((F6942723054099263096) q7316561721656982910.d).b).isEmpty() || ((X7482811339048806651) ((F6942723054099263096) q7316561721656982910.b).b).isEmpty()) ? false : true) {
                        if (h11725168162114556860.h != null) {
                            r(h11725168162114556860, true);
                        } else {
                            q(h11725168162114556860);
                        }
                    }
                    r(h11725168162114556860, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(H11725168162114556860 h11725168162114556860, boolean z) {
        I16980768508151520658 i16980768508151520658;
        H11725168162114556860 u;
        boolean z2 = h11725168162114556860.Q;
        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
        if (!z2 && k(h11725168162114556860)) {
            H11725168162114556860 h117251681621145568602 = this.a;
            if (h11725168162114556860 == h117251681621145568602) {
                i16980768508151520658 = this.h;
                i16980768508151520658.getClass();
            } else {
                i16980768508151520658 = null;
            }
            if (z) {
                r2 = r8000300579679385019.e ? c(h11725168162114556860, i16980768508151520658) : false;
                if ((r2 || r8000300579679385019.f) && S10823041268949770285.t(h11725168162114556860.J(), Boolean.TRUE)) {
                    h11725168162114556860.K();
                }
            } else {
                boolean d = h11725168162114556860.q() ? d(h11725168162114556860, i16980768508151520658) : false;
                if (h11725168162114556860.p() && (h11725168162114556860 == h117251681621145568602 || ((u = h11725168162114556860.u()) != null && u.I() && r8000300579679385019.p.u))) {
                    if (h11725168162114556860 == h117251681621145568602) {
                        if (h11725168162114556860.C == Q8181337811809788579.c) {
                            h11725168162114556860.d();
                        }
                        H11725168162114556860 u2 = h11725168162114556860.u();
                        Y2066038017114788875.j(u2 != null ? ((I16141028645763443416) u2.F.d).p : ((S7974369370986781936) P12010630787994328224.a(h11725168162114556860)).getPlacementScope(), r8000300579679385019.p, 0, 0);
                    } else {
                        h11725168162114556860.S();
                    }
                    if (h11725168162114556860.P > 0) {
                        ((D389890677992184566) this.e.b).b(h11725168162114556860);
                        h11725168162114556860.O = true;
                    }
                }
                r2 = d;
            }
            e();
        }
        return r2;
    }

    public final boolean p(H11725168162114556860 h11725168162114556860, boolean z) {
        I16980768508151520658 i16980768508151520658;
        boolean z2 = false;
        if (!h11725168162114556860.Q && k(h11725168162114556860)) {
            if (h11725168162114556860 == this.a) {
                i16980768508151520658 = this.h;
                i16980768508151520658.getClass();
            } else {
                i16980768508151520658 = null;
            }
            if (z) {
                if (h11725168162114556860.G.e) {
                    z2 = c(h11725168162114556860, i16980768508151520658);
                }
            } else if (h11725168162114556860.q()) {
                z2 = d(h11725168162114556860, i16980768508151520658);
            }
            e();
        }
        return z2;
    }

    public final void q(H11725168162114556860 h11725168162114556860) {
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            if (h117251681621145568602.r() == Q8181337811809788579.a || h117251681621145568602.G.p.y.e()) {
                if (O4077903568229246.y(h117251681621145568602)) {
                    r(h117251681621145568602, true);
                } else {
                    q(h117251681621145568602);
                }
            }
        }
    }

    public final void r(H11725168162114556860 h11725168162114556860, boolean z) {
        I16980768508151520658 i16980768508151520658;
        if (h11725168162114556860.Q) {
            return;
        }
        if (h11725168162114556860 == this.a) {
            i16980768508151520658 = this.h;
            i16980768508151520658.getClass();
        } else {
            i16980768508151520658 = null;
        }
        if (z) {
            c(h11725168162114556860, i16980768508151520658);
        } else {
            d(h11725168162114556860, i16980768508151520658);
        }
    }

    public final boolean s(H11725168162114556860 h11725168162114556860, boolean z) {
        int ordinal = h11725168162114556860.G.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.g.b(new A12350950740000434161(h11725168162114556860, false, z));
            } else {
                if (ordinal != 4) {
                    Z3383101362411723454.g();
                    return false;
                }
                if (!h11725168162114556860.q() || z) {
                    h11725168162114556860.G.p.v = true;
                    if (!h11725168162114556860.Q && (h11725168162114556860.I() || j(h11725168162114556860))) {
                        H11725168162114556860 u = h11725168162114556860.u();
                        if (u == null || !u.q()) {
                            this.b.f(h11725168162114556860, J5032171413189498920.c);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void t(long j) {
        I16980768508151520658 i16980768508151520658 = this.h;
        if (i16980768508151520658 == null ? false : I16980768508151520658.c(i16980768508151520658.a, j)) {
            return;
        }
        if (this.c) {
            P753981624812481271.a("updateRootConstraints called while measuring");
        }
        this.h = new I16980768508151520658(j);
        H11725168162114556860 h11725168162114556860 = this.a;
        boolean H = h11725168162114556860.H();
        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
        if (H) {
            H11725168162114556860 h117251681621145568602 = h11725168162114556860.h;
            if (h117251681621145568602 != null) {
                r8000300579679385019.e = true;
            }
            r8000300579679385019.p.v = true;
            this.b.f(h11725168162114556860, h117251681621145568602 != null ? J5032171413189498920.a : J5032171413189498920.c);
        }
    }
}
