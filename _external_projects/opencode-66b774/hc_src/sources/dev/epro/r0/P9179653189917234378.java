package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        H11725168162114556860 R = R7033599853981556291.R(this);
        while (R != null) {
            if ((((R15896830329318850690) R.F.g).d & 32) != 0) {
                while (r158968303293188506902 != null) {
                    if ((r158968303293188506902.c & 32) != 0) {
                        J2215566372910931965 j2215566372910931965 = r158968303293188506902;
                        ?? r4 = 0;
                        while (j2215566372910931965 != 0) {
                            if (j2215566372910931965 instanceof P9179653189917234378) {
                                P9179653189917234378 p9179653189917234378 = (P9179653189917234378) j2215566372910931965;
                                if (p9179653189917234378.l().x(o14561027293699174040)) {
                                    return p9179653189917234378.l().D(o14561027293699174040);
                                }
                            } else if ((j2215566372910931965.c & 32) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506903 = j2215566372910931965.p;
                                int i = 0;
                                j2215566372910931965 = j2215566372910931965;
                                r4 = r4;
                                while (r158968303293188506903 != null) {
                                    if ((r158968303293188506903.c & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            j2215566372910931965 = r158968303293188506903;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (j2215566372910931965 != 0) {
                                                r4.b(j2215566372910931965);
                                                j2215566372910931965 = 0;
                                            }
                                            r4.b(r158968303293188506903);
                                        }
                                    }
                                    r158968303293188506903 = r158968303293188506903.f;
                                    j2215566372910931965 = j2215566372910931965;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            j2215566372910931965 = R7033599853981556291.M(r4);
                        }
                    }
                    r158968303293188506902 = r158968303293188506902.e;
                }
            }
            R = R.u();
            r158968303293188506902 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
        }
        return o14561027293699174040.a.invoke();
    }

    default Z860808776098365610 l() {
        return E5367294674037035345.f225o;
    }
}
