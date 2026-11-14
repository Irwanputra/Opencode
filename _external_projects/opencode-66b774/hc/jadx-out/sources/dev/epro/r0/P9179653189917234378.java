package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public interface P9179653189917234378 extends R16749699847173633337 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [dev.epro.r0.P9179653189917234378, dev.epro.r0.R16749699847173633337] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
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
    /* JADX WARN: Type inference failed for: r5v6 */
    default Object f() {
        X9608137461199640409 x9608137461199640409;
        O14561027293699174040 o14561027293699174040 = J8045362843799184672.i;
        R15896830329318850690 r15896830329318850690 = (R15896830329318850690) this;
        if (!r15896830329318850690.a.n) {
            P753981624812481271.a("ModifierLocal accessed from an unattached node");
        }
        if (!r15896830329318850690.a.n) {
            P753981624812481271.b("visitAncestors called on an unattached node");
        }
        R15896830329318850690 r158968303293188506902 = r15896830329318850690.a.e;
        H11725168162114556860 h11725168162114556860R = R7033599853981556291.R(this);
        while (h11725168162114556860R != null) {
            if ((((R15896830329318850690) h11725168162114556860R.F.g).d & 32) != 0) {
                while (r158968303293188506902 != null) {
                    if ((r158968303293188506902.c & 32) != 0) {
                        ?? M = r158968303293188506902;
                        ?? d389890677992184566 = 0;
                        while (M != 0) {
                            if (M instanceof P9179653189917234378) {
                                P9179653189917234378 p9179653189917234378 = (P9179653189917234378) M;
                                if (p9179653189917234378.l().x(o14561027293699174040)) {
                                    return p9179653189917234378.l().D(o14561027293699174040);
                                }
                            } else if ((M.c & 32) != 0 && (M instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) M).p;
                                int i = 0;
                                M = M;
                                d389890677992184566 = d389890677992184566;
                                while (r158968303293188506903 != null) {
                                    if ((r158968303293188506903.c & 32) != 0) {
                                        i++;
                                        d389890677992184566 = d389890677992184566;
                                        if (i == 1) {
                                            M = r158968303293188506903;
                                        } else {
                                            if (d389890677992184566 == 0) {
                                                d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (M != 0) {
                                                d389890677992184566.b(M);
                                                M = 0;
                                            }
                                            d389890677992184566.b(r158968303293188506903);
                                        }
                                    }
                                    r158968303293188506903 = r158968303293188506903.f;
                                    M = M;
                                    d389890677992184566 = d389890677992184566;
                                }
                                if (i == 1) {
                                }
                            }
                            M = R7033599853981556291.M(d389890677992184566);
                        }
                    }
                    r158968303293188506902 = r158968303293188506902.e;
                }
            }
            h11725168162114556860R = h11725168162114556860R.u();
            r158968303293188506902 = (h11725168162114556860R == null || (x9608137461199640409 = h11725168162114556860R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
        }
        return o14561027293699174040.a.invoke();
    }

    default Z860808776098365610 l() {
        return E5367294674037035345.f225o;
    }
}
