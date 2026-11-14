package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W1742516786250891319 implements H1203938712873468075 {
    public final T12552481909083146428 a;
    public final long b;
    public final R6694982557896913324 c;
    public final M2626744064473853568 d;
    public final S12008558933731077464 e;
    public final H885820584188137964 f;
    public final String g;
    public final long h;
    public final V16528451706120227503 i;
    public final T10255414283460940890 j;
    public final A5535629440393075509 k;
    public final long l;
    public final W7621125212597703960 m;
    public final H7281108764511748709 n;

    /* renamed from: o, reason: collision with root package name */
    public final U9290200654526904876 f556o;
    public final Q15653065705375360223 p;

    public W1742516786250891319(long j, long j2, R6694982557896913324 r6694982557896913324, M2626744064473853568 m2626744064473853568, S12008558933731077464 s12008558933731077464, H885820584188137964 h885820584188137964, String str, long j3, V16528451706120227503 v16528451706120227503, T10255414283460940890 t10255414283460940890, A5535629440393075509 a5535629440393075509, long j4, W7621125212597703960 w7621125212597703960, H7281108764511748709 h7281108764511748709, int i) {
        this((i & 1) != 0 ? U10174709222559481877.h : j, (i & 2) != 0 ? J5593409210068682756.c : j2, (i & 4) != 0 ? null : r6694982557896913324, (i & 8) != 0 ? null : m2626744064473853568, (i & 16) != 0 ? null : s12008558933731077464, (i & 32) != 0 ? null : h885820584188137964, (i & 64) != 0 ? null : str, (i & 128) != 0 ? J5593409210068682756.c : j3, (i & 256) != 0 ? null : v16528451706120227503, (i & 512) != 0 ? null : t10255414283460940890, (i & 1024) != 0 ? null : a5535629440393075509, (i & 2048) != 0 ? U10174709222559481877.h : j4, (i & 4096) != 0 ? null : w7621125212597703960, (i & 8192) != 0 ? null : h7281108764511748709, (U9290200654526904876) null);
    }

    public final boolean a(W1742516786250891319 w1742516786250891319) {
        if (this == w1742516786250891319) {
            return true;
        }
        if (!J5593409210068682756.a(this.b, w1742516786250891319.b) || !S10823041268949770285.t(this.c, w1742516786250891319.c) || !S10823041268949770285.t(this.d, w1742516786250891319.d) || !S10823041268949770285.t(this.e, w1742516786250891319.e) || !S10823041268949770285.t(this.f, w1742516786250891319.f) || !S10823041268949770285.t(this.g, w1742516786250891319.g) || !J5593409210068682756.a(this.h, w1742516786250891319.h) || !S10823041268949770285.t(this.i, w1742516786250891319.i) || !S10823041268949770285.t(this.j, w1742516786250891319.j) || !S10823041268949770285.t(this.k, w1742516786250891319.k)) {
            return false;
        }
        long j = w1742516786250891319.l;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.l, j) && S10823041268949770285.t(this.f556o, w1742516786250891319.f556o);
    }

    public final boolean b(W1742516786250891319 w1742516786250891319) {
        return S10823041268949770285.t(this.a, w1742516786250891319.a) && S10823041268949770285.t(this.m, w1742516786250891319.m) && S10823041268949770285.t(this.n, w1742516786250891319.n) && S10823041268949770285.t(this.p, w1742516786250891319.p);
    }

    public final W1742516786250891319 c(W1742516786250891319 w1742516786250891319) {
        if (w1742516786250891319 == null) {
            return this;
        }
        T12552481909083146428 t12552481909083146428 = w1742516786250891319.a;
        return Q13509723123186406745.a(this, t12552481909083146428.b(), t12552481909083146428.c(), t12552481909083146428.a(), w1742516786250891319.b, w1742516786250891319.c, w1742516786250891319.d, w1742516786250891319.e, w1742516786250891319.f, w1742516786250891319.g, w1742516786250891319.h, w1742516786250891319.i, w1742516786250891319.j, w1742516786250891319.k, w1742516786250891319.l, w1742516786250891319.m, w1742516786250891319.n, w1742516786250891319.f556o, w1742516786250891319.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1742516786250891319)) {
            return false;
        }
        W1742516786250891319 w1742516786250891319 = (W1742516786250891319) obj;
        return a(w1742516786250891319) && b(w1742516786250891319);
    }

    public final int hashCode() {
        T12552481909083146428 t12552481909083146428 = this.a;
        long b = t12552481909083146428.b();
        int i = U10174709222559481877.i;
        int hashCode = Long.hashCode(b) * 31;
        D14208870094104617988 c = t12552481909083146428.c();
        int hashCode2 = (Float.hashCode(t12552481909083146428.a()) + ((hashCode + (c != null ? c.hashCode() : 0)) * 31)) * 31;
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        int j = G6547577305291411977.j(hashCode2, this.b, 31);
        R6694982557896913324 r6694982557896913324 = this.c;
        int i2 = (j + (r6694982557896913324 != null ? r6694982557896913324.a : 0)) * 31;
        M2626744064473853568 m2626744064473853568 = this.d;
        int hashCode3 = (i2 + (m2626744064473853568 != null ? Integer.hashCode(m2626744064473853568.a) : 0)) * 31;
        S12008558933731077464 s12008558933731077464 = this.e;
        int hashCode4 = (hashCode3 + (s12008558933731077464 != null ? Integer.hashCode(s12008558933731077464.a) : 0)) * 31;
        H885820584188137964 h885820584188137964 = this.f;
        int hashCode5 = (hashCode4 + (h885820584188137964 != null ? h885820584188137964.hashCode() : 0)) * 31;
        String str = this.g;
        int j2 = G6547577305291411977.j((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.h, 31);
        V16528451706120227503 v16528451706120227503 = this.i;
        int hashCode6 = (j2 + (v16528451706120227503 != null ? Float.hashCode(v16528451706120227503.a) : 0)) * 31;
        T10255414283460940890 t10255414283460940890 = this.j;
        int hashCode7 = (hashCode6 + (t10255414283460940890 != null ? t10255414283460940890.hashCode() : 0)) * 31;
        A5535629440393075509 a5535629440393075509 = this.k;
        int j3 = G6547577305291411977.j((hashCode7 + (a5535629440393075509 != null ? a5535629440393075509.a.hashCode() : 0)) * 31, this.l, 31);
        W7621125212597703960 w7621125212597703960 = this.m;
        int i3 = (j3 + (w7621125212597703960 != null ? w7621125212597703960.a : 0)) * 31;
        H7281108764511748709 h7281108764511748709 = this.n;
        int hashCode8 = (i3 + (h7281108764511748709 != null ? h7281108764511748709.hashCode() : 0)) * 31;
        U9290200654526904876 u9290200654526904876 = this.f556o;
        int hashCode9 = (hashCode8 + (u9290200654526904876 != null ? u9290200654526904876.hashCode() : 0)) * 31;
        Q15653065705375360223 q15653065705375360223 = this.p;
        return hashCode9 + (q15653065705375360223 != null ? q15653065705375360223.hashCode() : 0);
    }

    public final String toString() {
        T12552481909083146428 t12552481909083146428 = this.a;
        String h = U10174709222559481877.h(t12552481909083146428.b());
        D14208870094104617988 c = t12552481909083146428.c();
        float a = t12552481909083146428.a();
        String d = J5593409210068682756.d(this.b);
        String d2 = J5593409210068682756.d(this.h);
        String h2 = U10174709222559481877.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(h);
        sb.append(", brush=");
        sb.append(c);
        sb.append(", alpha=");
        sb.append(a);
        sb.append(", fontSize=");
        sb.append(d);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        G6547577305291411977.B(sb, this.g, ", letterSpacing=", d2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(h2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.f556o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public W1742516786250891319(T12552481909083146428 t12552481909083146428, long j, R6694982557896913324 r6694982557896913324, M2626744064473853568 m2626744064473853568, S12008558933731077464 s12008558933731077464, H885820584188137964 h885820584188137964, String str, long j2, V16528451706120227503 v16528451706120227503, T10255414283460940890 t10255414283460940890, A5535629440393075509 a5535629440393075509, long j3, W7621125212597703960 w7621125212597703960, H7281108764511748709 h7281108764511748709, U9290200654526904876 u9290200654526904876, Q15653065705375360223 q15653065705375360223) {
        this.a = t12552481909083146428;
        this.b = j;
        this.c = r6694982557896913324;
        this.d = m2626744064473853568;
        this.e = s12008558933731077464;
        this.f = h885820584188137964;
        this.g = str;
        this.h = j2;
        this.i = v16528451706120227503;
        this.j = t10255414283460940890;
        this.k = a5535629440393075509;
        this.l = j3;
        this.m = w7621125212597703960;
        this.n = h7281108764511748709;
        this.f556o = u9290200654526904876;
        this.p = q15653065705375360223;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public W1742516786250891319(long r24, long r26, dev.epro.r0.R6694982557896913324 r28, dev.epro.r0.M2626744064473853568 r29, dev.epro.r0.S12008558933731077464 r30, dev.epro.r0.H885820584188137964 r31, java.lang.String r32, long r33, dev.epro.r0.V16528451706120227503 r35, dev.epro.r0.T10255414283460940890 r36, dev.epro.r0.A5535629440393075509 r37, long r38, dev.epro.r0.W7621125212597703960 r40, dev.epro.r0.H7281108764511748709 r41, dev.epro.r0.U9290200654526904876 r42) {
        /*
            r23 = this;
            r0 = r24
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lf
            dev.epro.r0.Y9689624121730268783 r2 = new dev.epro.r0.Y9689624121730268783
            r2.<init>(r0)
        Ld:
            r4 = r2
            goto L12
        Lf:
            dev.epro.r0.D10940439092163644790 r2 = dev.epro.r0.D10940439092163644790.a
            goto Ld
        L12:
            r22 = 0
            r3 = r23
            r5 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r19 = r40
            r20 = r41
            r21 = r42
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W1742516786250891319.<init>(long, long, dev.epro.r0.R6694982557896913324, dev.epro.r0.M2626744064473853568, dev.epro.r0.S12008558933731077464, dev.epro.r0.H885820584188137964, java.lang.String, long, dev.epro.r0.V16528451706120227503, dev.epro.r0.T10255414283460940890, dev.epro.r0.A5535629440393075509, long, dev.epro.r0.W7621125212597703960, dev.epro.r0.H7281108764511748709, dev.epro.r0.U9290200654526904876):void");
    }
}
