package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X1072671764734194220 {
    public final S7974369370986781936 a;
    public U9803441765912152712 b;
    public U9803441765912152712 c;
    public U9803441765912152712 d;
    public U9803441765912152712 e;
    public boolean f;

    public X1072671764734194220(S7974369370986781936 s7974369370986781936) {
        this.a = s7974369370986781936;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static void b(R15896830329318850690 r15896830329318850690, O14561027293699174040 o14561027293699174040) {
        if (!r15896830329318850690.a.n) {
            P753981624812481271.b("visitSubtreeIf called on an unattached node");
        }
        D389890677992184566 d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
        R15896830329318850690 r158968303293188506902 = r15896830329318850690.a;
        R15896830329318850690 r158968303293188506903 = r158968303293188506902.f;
        if (r158968303293188506903 == null) {
            R7033599853981556291.i(d389890677992184566, r158968303293188506902);
        } else {
            d389890677992184566.b(r158968303293188506903);
        }
        while (true) {
            int i = d389890677992184566.c;
            if (i == 0) {
                return;
            }
            R15896830329318850690 r158968303293188506904 = (R15896830329318850690) d389890677992184566.m(i - 1);
            if ((r158968303293188506904.d & 32) != 0) {
                for (R15896830329318850690 r158968303293188506905 = r158968303293188506904; r158968303293188506905 != null && r158968303293188506905.n; r158968303293188506905 = r158968303293188506905.f) {
                    if ((r158968303293188506905.c & 32) != 0) {
                        ?? M = r158968303293188506905;
                        ?? d3898906779921845662 = 0;
                        while (M != 0) {
                            if (M instanceof P9179653189917234378) {
                                if (((P9179653189917234378) M).l().x(o14561027293699174040)) {
                                    break;
                                }
                            } else if ((M.c & 32) != 0 && (M instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506906 = ((J2215566372910931965) M).p;
                                int i2 = 0;
                                M = M;
                                d3898906779921845662 = d3898906779921845662;
                                while (r158968303293188506906 != null) {
                                    if ((r158968303293188506906.c & 32) != 0) {
                                        i2++;
                                        d3898906779921845662 = d3898906779921845662;
                                        if (i2 == 1) {
                                            M = r158968303293188506906;
                                        } else {
                                            if (d3898906779921845662 == 0) {
                                                d3898906779921845662 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (M != 0) {
                                                d3898906779921845662.b(M);
                                                M = 0;
                                            }
                                            d3898906779921845662.b(r158968303293188506906);
                                        }
                                    }
                                    r158968303293188506906 = r158968303293188506906.f;
                                    M = M;
                                    d3898906779921845662 = d3898906779921845662;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = R7033599853981556291.M(d3898906779921845662);
                        }
                    }
                }
            }
            R7033599853981556291.i(d389890677992184566, r158968303293188506904);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        W2269277550458425547 w2269277550458425547 = new W2269277550458425547(this, (byte) 14);
        U9803441765912152712 u9803441765912152712 = this.a.q0;
        if (u9803441765912152712.g(w2269277550458425547) >= 0) {
            return;
        }
        u9803441765912152712.a(w2269277550458425547);
    }
}
