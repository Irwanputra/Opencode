package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R6653624393204003746 {
    public final R15896830329318850690 a;
    public final boolean b;
    public final H11725168162114556860 c;
    public final E10198359844879945462 d;
    public R6653624393204003746 e;
    public final int f;

    public R6653624393204003746(R15896830329318850690 r15896830329318850690, boolean z, H11725168162114556860 h11725168162114556860, E10198359844879945462 e10198359844879945462) {
        this.a = r15896830329318850690;
        this.b = z;
        this.c = h11725168162114556860;
        this.d = e10198359844879945462;
        this.f = h11725168162114556860.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final S6349823729575121924 a(Y4989033692226475498 y4989033692226475498) {
        ?? M;
        R6653624393204003746 r6653624393204003746L = l();
        if (r6653624393204003746L == null) {
            return S6349823729575121924.e;
        }
        R15896830329318850690 r15896830329318850690 = (R15896830329318850690) r6653624393204003746L.c.F.g;
        if ((r15896830329318850690.d & 8) != 0) {
            loop0: while (r15896830329318850690 != null) {
                if ((r15896830329318850690.c & 8) != 0) {
                    M = r15896830329318850690;
                    ?? d389890677992184566 = 0;
                    while (M != 0) {
                        if (M instanceof T11401768751197276141) {
                            if (((T11401768751197276141) M).k()) {
                                break loop0;
                            }
                        } else if ((M.c & 8) != 0 && (M instanceof J2215566372910931965)) {
                            R15896830329318850690 r158968303293188506902 = ((J2215566372910931965) M).p;
                            int i = 0;
                            M = M;
                            d389890677992184566 = d389890677992184566;
                            while (r158968303293188506902 != null) {
                                if ((r158968303293188506902.c & 8) != 0) {
                                    i++;
                                    d389890677992184566 = d389890677992184566;
                                    if (i == 1) {
                                        M = r158968303293188506902;
                                    } else {
                                        if (d389890677992184566 == 0) {
                                            d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        }
                                        if (M != 0) {
                                            d389890677992184566.b(M);
                                            M = 0;
                                        }
                                        d389890677992184566.b(r158968303293188506902);
                                    }
                                }
                                r158968303293188506902 = r158968303293188506902.f;
                                M = M;
                                d389890677992184566 = d389890677992184566;
                            }
                            if (i == 1) {
                            }
                        }
                        M = R7033599853981556291.M(d389890677992184566);
                    }
                }
                if ((r15896830329318850690.d & 8) == 0) {
                    break;
                }
                r15896830329318850690 = r15896830329318850690.f;
            }
            M = 0;
        } else {
            M = 0;
        }
        T11401768751197276141 t11401768751197276141 = (T11401768751197276141) M;
        Y4989033692226475498 y4989033692226475498P = t11401768751197276141 != null ? R7033599853981556291.P(t11401768751197276141, 8) : null;
        return y4989033692226475498P == null ? r6653624393204003746L.a(y4989033692226475498) : y4989033692226475498P.E(y4989033692226475498, true);
    }

    public final R6653624393204003746 b(H10924029057425269323 h10924029057425269323, F4096073349764486348 f4096073349764486348) {
        E10198359844879945462 e10198359844879945462 = new E10198359844879945462();
        e10198359844879945462.c = false;
        e10198359844879945462.d = false;
        f4096073349764486348.invoke(e10198359844879945462);
        R6653624393204003746 r6653624393204003746 = new R6653624393204003746(new W2281413920162580551(f4096073349764486348), false, new H11725168162114556860(this.f + (h10924029057425269323 != null ? 1000000000 : 2000000000), true), e10198359844879945462);
        r6653624393204003746.e = this;
        return r6653624393204003746;
    }

    public final void c(H11725168162114556860 h11725168162114556860, ArrayList arrayList) {
        D389890677992184566 d389890677992184566Y = h11725168162114556860.y();
        Object[] objArr = d389890677992184566Y.a;
        int i = d389890677992184566Y.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            if (h117251681621145568602.H() && !h117251681621145568602.Q) {
                if (h117251681621145568602.F.i(8)) {
                    arrayList.add(L12240044716294895599.b(h117251681621145568602, this.b));
                } else {
                    c(h117251681621145568602, arrayList);
                }
            }
        }
    }

    public final Y4989033692226475498 d() {
        if (!n()) {
            T11401768751197276141 t11401768751197276141F = f();
            return t11401768751197276141F != null ? R7033599853981556291.P(t11401768751197276141F, 8) : (I16141028645763443416) this.c.F.d;
        }
        R6653624393204003746 r6653624393204003746L = l();
        if (r6653624393204003746L != null) {
            return r6653624393204003746L.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            R6653624393204003746 r6653624393204003746 = (R6653624393204003746) arrayList.get(size2);
            if (r6653624393204003746.o()) {
                arrayList2.add(r6653624393204003746);
            } else if (!r6653624393204003746.d.d) {
                r6653624393204003746.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final T11401768751197276141 f() {
        ?? M;
        boolean z;
        boolean z2 = this.d.c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        H11725168162114556860 h11725168162114556860 = this.c;
        if (z2) {
            R15896830329318850690 r15896830329318850690 = (R15896830329318850690) h11725168162114556860.F.g;
            if ((r15896830329318850690.d & 8) != 0) {
                M = 0;
                while (r15896830329318850690 != null) {
                    if ((r15896830329318850690.c & 8) != 0) {
                        R15896830329318850690 r15896830329318850690M = r15896830329318850690;
                        D389890677992184566 d389890677992184566 = null;
                        while (r15896830329318850690M != null) {
                            if (r15896830329318850690M instanceof T11401768751197276141) {
                                T11401768751197276141 t11401768751197276141 = (T11401768751197276141) r15896830329318850690M;
                                ?? r0 = M;
                                if (t11401768751197276141.k()) {
                                    r0 = M;
                                    if (t11401768751197276141.B0()) {
                                        return t11401768751197276141;
                                    }
                                    if (M == 0) {
                                        r0 = t11401768751197276141;
                                    }
                                }
                                z = false;
                                M = r0;
                            } else {
                                z = true;
                                M = M;
                            }
                            if (z && (r15896830329318850690M.c & 8) != 0 && (r15896830329318850690M instanceof J2215566372910931965)) {
                                int i = 0;
                                for (R15896830329318850690 r158968303293188506902 = ((J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                                    if ((r158968303293188506902.c & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            r15896830329318850690M = r158968303293188506902;
                                        } else {
                                            if (d389890677992184566 == null) {
                                                d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
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
                            r15896830329318850690M = R7033599853981556291.M(d389890677992184566);
                        }
                    }
                    if ((r15896830329318850690.d & 8) == 0) {
                        break;
                    }
                    r15896830329318850690 = r15896830329318850690.f;
                    M = M;
                }
                r4 = M;
            }
        } else {
            R15896830329318850690 r158968303293188506903 = (R15896830329318850690) h11725168162114556860.F.g;
            if ((r158968303293188506903.d & 8) != 0) {
                loop3: while (r158968303293188506903 != null) {
                    if ((r158968303293188506903.c & 8) != 0) {
                        M = r158968303293188506903;
                        ?? d3898906779921845662 = 0;
                        while (M != 0) {
                            if (M instanceof T11401768751197276141) {
                                if (((T11401768751197276141) M).k()) {
                                    r4 = M;
                                }
                            } else if ((M.c & 8) != 0 && (M instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506904 = ((J2215566372910931965) M).p;
                                int i2 = 0;
                                M = M;
                                d3898906779921845662 = d3898906779921845662;
                                while (r158968303293188506904 != null) {
                                    if ((r158968303293188506904.c & 8) != 0) {
                                        i2++;
                                        d3898906779921845662 = d3898906779921845662;
                                        if (i2 == 1) {
                                            M = r158968303293188506904;
                                        } else {
                                            if (d3898906779921845662 == 0) {
                                                d3898906779921845662 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (M != 0) {
                                                d3898906779921845662.b(M);
                                                M = 0;
                                            }
                                            d3898906779921845662.b(r158968303293188506904);
                                        }
                                    }
                                    r158968303293188506904 = r158968303293188506904.f;
                                    M = M;
                                    d3898906779921845662 = d3898906779921845662;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = R7033599853981556291.M(d3898906779921845662);
                        }
                    }
                    if ((r158968303293188506903.d & 8) == 0) {
                        break;
                    }
                    r158968303293188506903 = r158968303293188506903.f;
                }
            }
        }
        return (T11401768751197276141) r4;
    }

    public final S6349823729575121924 g() {
        Y4989033692226475498 y4989033692226475498D = d();
        if (y4989033692226475498D != null) {
            if (!y4989033692226475498D.e1().n) {
                y4989033692226475498D = null;
            }
            if (y4989033692226475498D != null) {
                return V12319504402545346730.z(y4989033692226475498D).E(y4989033692226475498D, true);
            }
        }
        return S6349823729575121924.e;
    }

    public final S6349823729575121924 h() {
        Y4989033692226475498 y4989033692226475498D = d();
        if (y4989033692226475498D != null) {
            if (!y4989033692226475498D.e1().n) {
                y4989033692226475498D = null;
            }
            if (y4989033692226475498D != null) {
                return V12319504402545346730.u(y4989033692226475498D, true);
            }
        }
        return S6349823729575121924.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return O2161699089510411363.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final E10198359844879945462 k() {
        boolean zO = o();
        E10198359844879945462 e10198359844879945462 = this.d;
        if (!zO) {
            return e10198359844879945462;
        }
        E10198359844879945462 e101983598448799454622 = new E10198359844879945462();
        e101983598448799454622.c = e10198359844879945462.c;
        e101983598448799454622.d = e10198359844879945462.d;
        e101983598448799454622.a.k(e10198359844879945462.a);
        p(new ArrayList(), e101983598448799454622);
        return e101983598448799454622;
    }

    public final R6653624393204003746 l() {
        H11725168162114556860 h11725168162114556860U;
        R6653624393204003746 r6653624393204003746 = this.e;
        if (r6653624393204003746 != null) {
            return r6653624393204003746;
        }
        H11725168162114556860 h11725168162114556860 = this.c;
        boolean z = this.b;
        if (z) {
            h11725168162114556860U = h11725168162114556860.u();
            while (h11725168162114556860U != null) {
                E10198359844879945462 e10198359844879945462W = h11725168162114556860U.w();
                if (e10198359844879945462W != null && e10198359844879945462W.c) {
                    break;
                }
                h11725168162114556860U = h11725168162114556860U.u();
            }
            h11725168162114556860U = null;
        } else {
            h11725168162114556860U = null;
        }
        if (h11725168162114556860U == null) {
            H11725168162114556860 h11725168162114556860U2 = h11725168162114556860.u();
            while (true) {
                if (h11725168162114556860U2 == null) {
                    h11725168162114556860U = null;
                    break;
                }
                if (h11725168162114556860U2.F.i(8)) {
                    h11725168162114556860U = h11725168162114556860U2;
                    break;
                }
                h11725168162114556860U2 = h11725168162114556860U2.u();
            }
        }
        if (h11725168162114556860U == null) {
            return null;
        }
        return L12240044716294895599.b(h11725168162114556860U, z);
    }

    public final S6349823729575121924 m() {
        R16749699847173633337 r16749699847173633337F = f();
        if (r16749699847173633337F == null) {
            return ((I16141028645763443416) this.c.F.d).B1();
        }
        R15896830329318850690 r15896830329318850690 = ((R15896830329318850690) r16749699847173633337F).a;
        Object objG = this.d.a.g(E5458822993765169982.b);
        if (objG == null) {
            objG = null;
        }
        return E10717724117948616506.i(r15896830329318850690, objG != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.c;
    }

    public final void p(ArrayList arrayList, E10198359844879945462 e10198359844879945462) {
        if (this.d.d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            R6653624393204003746 r6653624393204003746 = (R6653624393204003746) arrayList.get(size2);
            if (!r6653624393204003746.o()) {
                e10198359844879945462.c(r6653624393204003746.d);
                r6653624393204003746.p(arrayList, e10198359844879945462);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return O2161699089510411363.a;
        }
        c(this.c, arrayList);
        if (z) {
            E10198359844879945462 e10198359844879945462 = this.d;
            A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
            Object objG = a4559761392562572984.g(D10671166500636893138.z);
            if (objG == null) {
                objG = null;
            }
            H10924029057425269323 h10924029057425269323 = (H10924029057425269323) objG;
            if (h10924029057425269323 != null && e10198359844879945462.c && !arrayList.isEmpty()) {
                arrayList.add(b(h10924029057425269323, new H8734584053421516944((Object) h10924029057425269323, (byte) 28)));
            }
            P14992748401341948828 p14992748401341948828 = D10671166500636893138.a;
            if (a4559761392562572984.c(p14992748401341948828) && !arrayList.isEmpty() && e10198359844879945462.c) {
                Object objG2 = a4559761392562572984.g(p14992748401341948828);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) R9411874267597469228.D0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new V11408211943757035929(str, (byte) 18)));
                }
            }
        }
        return arrayList;
    }
}
