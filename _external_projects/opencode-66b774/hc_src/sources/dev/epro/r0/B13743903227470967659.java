package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B13743903227470967659 implements W5631948913832446850 {
    @Override // dev.epro.r0.W5631948913832446850
    public final void c(H11725168162114556860 h11725168162114556860, long j, Z12993664435766561681 z12993664435766561681, int i, boolean z) {
        h11725168162114556860.A(j, z12993664435766561681, i, z);
    }

    @Override // dev.epro.r0.W5631948913832446850
    public final int h() {
        return 16;
    }

    @Override // dev.epro.r0.W5631948913832446850
    public final boolean j(H11725168162114556860 h11725168162114556860) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // dev.epro.r0.W5631948913832446850
    public final boolean n(Z12993664435766561681 z12993664435766561681, H11725168162114556860 h11725168162114556860) {
        Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) h11725168162114556860.F.e;
        y4989033692226475498.getClass();
        R15896830329318850690 h1 = y4989033692226475498.h1(L5069768235772837017.g(16));
        if (h1 != null && h1.n) {
            if (!h1.a.n) {
                P753981624812481271.b("visitLocalDescendants called on an unattached node");
            }
            R15896830329318850690 r15896830329318850690 = h1.a;
            if ((r15896830329318850690.d & 16) != 0) {
                while (r15896830329318850690 != null) {
                    if ((r15896830329318850690.c & 16) != 0) {
                        J2215566372910931965 j2215566372910931965 = r15896830329318850690;
                        ?? r3 = 0;
                        while (j2215566372910931965 != 0) {
                            if (j2215566372910931965 instanceof B18307494358031290147) {
                                if (((B18307494358031290147) j2215566372910931965).o0()) {
                                    z12993664435766561681.c = z12993664435766561681.a.b - 1;
                                    return true;
                                }
                            } else if ((j2215566372910931965.c & 16) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506902 = j2215566372910931965.p;
                                int i = 0;
                                j2215566372910931965 = j2215566372910931965;
                                r3 = r3;
                                while (r158968303293188506902 != null) {
                                    if ((r158968303293188506902.c & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            j2215566372910931965 = r158968303293188506902;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (j2215566372910931965 != 0) {
                                                r3.b(j2215566372910931965);
                                                j2215566372910931965 = 0;
                                            }
                                            r3.b(r158968303293188506902);
                                        }
                                    }
                                    r158968303293188506902 = r158968303293188506902.f;
                                    j2215566372910931965 = j2215566372910931965;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            j2215566372910931965 = R7033599853981556291.M(r3);
                        }
                    }
                    r15896830329318850690 = r15896830329318850690.f;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // dev.epro.r0.W5631948913832446850
    public final boolean p(R15896830329318850690 r15896830329318850690) {
        ?? r0 = 0;
        while (r15896830329318850690 != 0) {
            if (r15896830329318850690 instanceof B18307494358031290147) {
                ((B18307494358031290147) r15896830329318850690).J0();
            } else if ((r15896830329318850690.c & 16) != 0 && (r15896830329318850690 instanceof J2215566372910931965)) {
                R15896830329318850690 r158968303293188506902 = r15896830329318850690.p;
                int i = 0;
                r0 = r0;
                r15896830329318850690 = r15896830329318850690;
                while (r158968303293188506902 != null) {
                    if ((r158968303293188506902.c & 16) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            r15896830329318850690 = r158968303293188506902;
                        } else {
                            if (r0 == 0) {
                                r0 = new D389890677992184566(0, new R15896830329318850690[16]);
                            }
                            if (r15896830329318850690 != 0) {
                                r0.b(r15896830329318850690);
                                r15896830329318850690 = 0;
                            }
                            r0.b(r158968303293188506902);
                        }
                    }
                    r158968303293188506902 = r158968303293188506902.f;
                    r0 = r0;
                    r15896830329318850690 = r15896830329318850690;
                }
                if (i == 1) {
                }
            }
            r15896830329318850690 = R7033599853981556291.M(r0);
        }
        return false;
    }
}
