package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q13509723123186406745 {
    public static final long a = V3311072669930093336.l(14);
    public static final long b = V3311072669930093336.l(0);
    public static final long c = U10174709222559481877.g;
    public static final T12552481909083146428 d;

    static {
        long j = U10174709222559481877.b;
        d = j != 16 ? new Y9689624121730268783(j) : D10940439092163644790.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.W1742516786250891319 a(dev.epro.r0.W1742516786250891319 r24, long r25, dev.epro.r0.D14208870094104617988 r27, float r28, long r29, dev.epro.r0.R6694982557896913324 r31, dev.epro.r0.M2626744064473853568 r32, dev.epro.r0.S12008558933731077464 r33, dev.epro.r0.H885820584188137964 r34, java.lang.String r35, long r36, dev.epro.r0.V16528451706120227503 r38, dev.epro.r0.T10255414283460940890 r39, dev.epro.r0.A5535629440393075509 r40, long r41, dev.epro.r0.W7621125212597703960 r43, dev.epro.r0.H7281108764511748709 r44, dev.epro.r0.U9290200654526904876 r45, dev.epro.r0.Q15653065705375360223 r46) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q13509723123186406745.a(dev.epro.r0.W1742516786250891319, long, dev.epro.r0.D14208870094104617988, float, long, dev.epro.r0.R6694982557896913324, dev.epro.r0.M2626744064473853568, dev.epro.r0.S12008558933731077464, dev.epro.r0.H885820584188137964, java.lang.String, long, dev.epro.r0.V16528451706120227503, dev.epro.r0.T10255414283460940890, dev.epro.r0.A5535629440393075509, long, dev.epro.r0.W7621125212597703960, dev.epro.r0.H7281108764511748709, dev.epro.r0.U9290200654526904876, dev.epro.r0.Q15653065705375360223):dev.epro.r0.W1742516786250891319");
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    N17315172036749737048.a("Cannot perform operation for Unspecified type.");
                }
                if (!E6417708602094478350.a(J5593409210068682756.b(j), J5593409210068682756.b(j2))) {
                    N17315172036749737048.a("Cannot perform operation for " + E6417708602094478350.b(J5593409210068682756.b(j)) + " and " + E6417708602094478350.b(J5593409210068682756.b(j2)));
                }
                return V3311072669930093336.n(V933048422416352811.x(J5593409210068682756.c(j), J5593409210068682756.c(j2), f), j3);
            }
        }
        return ((J5593409210068682756) b(new J5593409210068682756(j), new J5593409210068682756(j2), f)).a;
    }
}
