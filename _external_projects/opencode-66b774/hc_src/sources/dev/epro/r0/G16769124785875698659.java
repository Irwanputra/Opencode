package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class G16769124785875698659 {
    public static final long a = D1286559660607336098.c(40.0f, 40.0f);

    public static final void a(final J9879469284241532070 j9879469284241532070, final I1722681268793429505 i1722681268793429505, final boolean z, final S16571168858015125610 s16571168858015125610, final W17015830374102496917 w17015830374102496917, final P12772215240311114381 p12772215240311114381, final S9385204271696540760 s9385204271696540760, final D14208870094104617988 d14208870094104617988, final A17211599337460384546 a17211599337460384546, final G17854281415623469737 g17854281415623469737, M3727281027331139839 m3727281027331139839, final int i) {
        m3727281027331139839.b0(469439921);
        int i2 = i | (m3727281027331139839.f(j9879469284241532070) ? 4 : 2) | (m3727281027331139839.f(i1722681268793429505) ? 32 : 16) | (m3727281027331139839.g(z) ? 256 : 128) | (m3727281027331139839.g(false) ? 2048 : 1024) | (m3727281027331139839.f(null) ? 16384 : 8192) | (m3727281027331139839.f(s16571168858015125610) ? 131072 : 65536) | (m3727281027331139839.f(w17015830374102496917) ? 1048576 : 524288) | (m3727281027331139839.f(null) ? 8388608 : 4194304) | (m3727281027331139839.f(p12772215240311114381) ? 67108864 : 33554432) | (m3727281027331139839.h(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        int i3 = (m3727281027331139839.f(s9385204271696540760) ? 4 : 2) | (m3727281027331139839.f(d14208870094104617988) ? 32 : 16) | (m3727281027331139839.f(null) ? 256 : 128) | (m3727281027331139839.f(a17211599337460384546) ? 2048 : 1024) | (m3727281027331139839.f(g17854281415623469737) ? 16384 : 8192);
        if (m3727281027331139839.R(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 9363) == 9362) ? false : true)) {
            m3727281027331139839.W();
            if ((i & 1) != 0 && !m3727281027331139839.z()) {
                m3727281027331139839.U();
            }
            m3727281027331139839.r();
            int i4 = (i3 & 14) | 384 | (i3 & 112);
            int i5 = i3 << 3;
            b(j9879469284241532070, i1722681268793429505, z, s16571168858015125610, w17015830374102496917, p12772215240311114381, s9385204271696540760, d14208870094104617988, a17211599337460384546, g17854281415623469737, m3727281027331139839, i2 & 2147483646, i4 | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new L12639328004344855510(i1722681268793429505, z, s16571168858015125610, w17015830374102496917, p12772215240311114381, s9385204271696540760, d14208870094104617988, a17211599337460384546, g17854281415623469737, i) { // from class: dev.epro.r0.F16694479087247346140
                public final /* synthetic */ I1722681268793429505 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ S16571168858015125610 d;
                public final /* synthetic */ W17015830374102496917 e;
                public final /* synthetic */ P12772215240311114381 f;
                public final /* synthetic */ S9385204271696540760 g;
                public final /* synthetic */ D14208870094104617988 h;
                public final /* synthetic */ A17211599337460384546 i;
                public final /* synthetic */ G17854281415623469737 j;

                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = V16504496955554646429.p(1);
                    G16769124785875698659.a(J9879469284241532070.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (M3727281027331139839) obj, p);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x045e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(dev.epro.r0.J9879469284241532070 r38, dev.epro.r0.I1722681268793429505 r39, final boolean r40, final dev.epro.r0.S16571168858015125610 r41, final dev.epro.r0.W17015830374102496917 r42, final dev.epro.r0.P12772215240311114381 r43, dev.epro.r0.S9385204271696540760 r44, final dev.epro.r0.D14208870094104617988 r45, final dev.epro.r0.A17211599337460384546 r46, final dev.epro.r0.G17854281415623469737 r47, dev.epro.r0.M3727281027331139839 r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16769124785875698659.b(dev.epro.r0.J9879469284241532070, dev.epro.r0.I1722681268793429505, boolean, dev.epro.r0.S16571168858015125610, dev.epro.r0.W17015830374102496917, dev.epro.r0.P12772215240311114381, dev.epro.r0.S9385204271696540760, dev.epro.r0.D14208870094104617988, dev.epro.r0.A17211599337460384546, dev.epro.r0.G17854281415623469737, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final dev.epro.r0.F13241018602672925865 r35, final dev.epro.r0.F4096073349764486348 r36, final dev.epro.r0.I1722681268793429505 r37, boolean r38, final dev.epro.r0.S16571168858015125610 r39, dev.epro.r0.W17015830374102496917 r40, dev.epro.r0.O12013896688000893502 r41, boolean r42, int r43, int r44, dev.epro.r0.H14763425654620554740 r45, dev.epro.r0.F4096073349764486348 r46, dev.epro.r0.S9385204271696540760 r47, dev.epro.r0.D14208870094104617988 r48, dev.epro.r0.J12078565427869724451 r49, dev.epro.r0.M3727281027331139839 r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16769124785875698659.c(dev.epro.r0.F13241018602672925865, dev.epro.r0.F4096073349764486348, dev.epro.r0.I1722681268793429505, boolean, dev.epro.r0.S16571168858015125610, dev.epro.r0.W17015830374102496917, dev.epro.r0.O12013896688000893502, boolean, int, int, dev.epro.r0.H14763425654620554740, dev.epro.r0.F4096073349764486348, dev.epro.r0.S9385204271696540760, dev.epro.r0.D14208870094104617988, dev.epro.r0.J12078565427869724451, dev.epro.r0.M3727281027331139839, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r33, final dev.epro.r0.F4096073349764486348 r34, final dev.epro.r0.I1722681268793429505 r35, boolean r36, boolean r37, final dev.epro.r0.S16571168858015125610 r38, dev.epro.r0.W17015830374102496917 r39, dev.epro.r0.O12013896688000893502 r40, final boolean r41, int r42, int r43, dev.epro.r0.H14763425654620554740 r44, dev.epro.r0.F4096073349764486348 r45, dev.epro.r0.S9385204271696540760 r46, final dev.epro.r0.D14208870094104617988 r47, dev.epro.r0.J12078565427869724451 r48, dev.epro.r0.M3727281027331139839 r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16769124785875698659.d(java.lang.String, dev.epro.r0.F4096073349764486348, dev.epro.r0.I1722681268793429505, boolean, boolean, dev.epro.r0.S16571168858015125610, dev.epro.r0.W17015830374102496917, dev.epro.r0.O12013896688000893502, boolean, int, int, dev.epro.r0.H14763425654620554740, dev.epro.r0.F4096073349764486348, dev.epro.r0.S9385204271696540760, dev.epro.r0.D14208870094104617988, dev.epro.r0.J12078565427869724451, dev.epro.r0.M3727281027331139839, int, int, int):void");
    }

    public static final void e(D2717688760023469083 d2717688760023469083, M3727281027331139839 m3727281027331139839, int i) {
        M3727281027331139839 m37272810273311398392;
        m3727281027331139839.b0(1991581797);
        byte b = 2;
        int i2 = (m3727281027331139839.h(d2717688760023469083) ? 4 : 2) | i;
        byte b2 = 1;
        byte b3 = 0;
        if (m3727281027331139839.R(i2 & 1, (i2 & 3) != 2)) {
            boolean f = m3727281027331139839.f(d2717688760023469083);
            Object M = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (f || M == e17149812035295265804) {
                M = Z3658309082448601011.b(new J14087722038307951427(d2717688760023469083, b));
                m3727281027331139839.k0(M);
            }
            if (((Boolean) ((L13148442655056575112) M).getValue()).booleanValue()) {
                m3727281027331139839.a0(535437134);
                boolean h = m3727281027331139839.h(d2717688760023469083);
                Object M2 = m3727281027331139839.M();
                if (h || M2 == e17149812035295265804) {
                    M2 = new A4501613079962398728(d2717688760023469083, (byte) 0);
                    m3727281027331139839.k0(M2);
                }
                A7033694156606186337 a7033694156606186337 = (A7033694156606186337) M2;
                boolean h2 = m3727281027331139839.h(d2717688760023469083);
                Object M3 = m3727281027331139839.M();
                if (h2 || M3 == e17149812035295265804) {
                    M3 = new U18068834637174231718(d2717688760023469083, b3);
                    m3727281027331139839.k0(M3);
                }
                m37272810273311398392 = m3727281027331139839;
                E12186453405150684810.a(a7033694156606186337, T7055906184043387232.b(V10993962107938880611.a, d2717688760023469083, (PointerInputEventHandler) M3), a, m37272810273311398392, 384, 0);
                m37272810273311398392.q(false);
            } else {
                m37272810273311398392 = m3727281027331139839;
                m37272810273311398392.a0(535820573);
                m37272810273311398392.q(false);
            }
        } else {
            m37272810273311398392 = m3727281027331139839;
            m37272810273311398392.U();
        }
        V4878375136513573151 t = m37272810273311398392.t();
        if (t != null) {
            t.d = new K8585323957339949769(d2717688760023469083, i, b2);
        }
    }

    public static final void f(D2717688760023469083 d2717688760023469083, M3727281027331139839 m3727281027331139839, int i) {
        E17149812035295265804 e17149812035295265804;
        V10993962107938880611 v10993962107938880611;
        m3727281027331139839.b0(2025287684);
        int i2 = (m3727281027331139839.h(d2717688760023469083) ? 4 : 2) | i;
        byte b = 1;
        byte b2 = 0;
        if (m3727281027331139839.R(i2 & 1, (i2 & 3) != 2)) {
            boolean f = m3727281027331139839.f(d2717688760023469083);
            Object M = m3727281027331139839.M();
            E17149812035295265804 e171498120352952658042 = O9023047933786425027.a;
            if (f || M == e171498120352952658042) {
                M = Z3658309082448601011.b(new J14087722038307951427(d2717688760023469083, b2));
                m3727281027331139839.k0(M);
            }
            N18340289048873574260 n18340289048873574260 = (N18340289048873574260) ((L13148442655056575112) M).getValue();
            boolean z = n18340289048873574260.a;
            V10993962107938880611 v109939621079388806112 = V10993962107938880611.a;
            if (z) {
                m3727281027331139839.a0(-354609545);
                boolean h = m3727281027331139839.h(d2717688760023469083);
                Object M2 = m3727281027331139839.M();
                if (h || M2 == e171498120352952658042) {
                    M2 = new A4501613079962398728(d2717688760023469083, (byte) 1);
                    m3727281027331139839.k0(M2);
                }
                A7033694156606186337 a7033694156606186337 = (A7033694156606186337) M2;
                O16392062884302746898 o16392062884302746898 = n18340289048873574260.d;
                boolean z2 = n18340289048873574260.e;
                boolean h2 = m3727281027331139839.h(d2717688760023469083);
                Object M3 = m3727281027331139839.M();
                if (h2 || M3 == e171498120352952658042) {
                    M3 = new U18068834637174231718(d2717688760023469083, b);
                    m3727281027331139839.k0(M3);
                }
                v10993962107938880611 = v109939621079388806112;
                e17149812035295265804 = e171498120352952658042;
                T18016951143603335921.k(a7033694156606186337, true, o16392062884302746898, z2, a, n18340289048873574260.c, T7055906184043387232.b(v109939621079388806112, d2717688760023469083, (PointerInputEventHandler) M3), m3727281027331139839, 24624, 0);
                m3727281027331139839.q(false);
            } else {
                e17149812035295265804 = e171498120352952658042;
                v10993962107938880611 = v109939621079388806112;
                m3727281027331139839.a0(-353981826);
                m3727281027331139839.q(false);
            }
            boolean f2 = m3727281027331139839.f(d2717688760023469083);
            Object M4 = m3727281027331139839.M();
            if (f2 || M4 == e17149812035295265804) {
                M4 = Z3658309082448601011.b(new J14087722038307951427(d2717688760023469083, b));
                m3727281027331139839.k0(M4);
            }
            N18340289048873574260 n183402890488735742602 = (N18340289048873574260) ((L13148442655056575112) M4).getValue();
            if (n183402890488735742602.a) {
                m3727281027331139839.a0(-353488678);
                boolean h3 = m3727281027331139839.h(d2717688760023469083);
                Object M5 = m3727281027331139839.M();
                if (h3 || M5 == e17149812035295265804) {
                    M5 = new A4501613079962398728(d2717688760023469083, (byte) 2);
                    m3727281027331139839.k0(M5);
                }
                A7033694156606186337 a70336941566061863372 = (A7033694156606186337) M5;
                O16392062884302746898 o163920628843027468982 = n183402890488735742602.d;
                boolean z3 = n183402890488735742602.e;
                boolean h4 = m3727281027331139839.h(d2717688760023469083);
                Object M6 = m3727281027331139839.M();
                if (h4 || M6 == e17149812035295265804) {
                    M6 = new U18068834637174231718(d2717688760023469083, (byte) 2);
                    m3727281027331139839.k0(M6);
                }
                T18016951143603335921.k(a70336941566061863372, false, o163920628843027468982, z3, a, n183402890488735742602.c, T7055906184043387232.b(v10993962107938880611, d2717688760023469083, (PointerInputEventHandler) M6), m3727281027331139839, 24624, 0);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(-352863842);
                m3727281027331139839.q(false);
            }
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new K8585323957339949769(d2717688760023469083, i, b2);
        }
    }
}
