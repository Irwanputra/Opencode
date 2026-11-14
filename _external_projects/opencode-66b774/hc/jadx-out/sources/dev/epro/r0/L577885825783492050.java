package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L577885825783492050 {
    public static final J15264501749816156841 a = new J15264501749816156841(256, (J6301524036964264730) null, 6);

    public static final void a(B9345618057833789735 b9345618057833789735, I1722681268793429505 i1722681268793429505, I5573661370475160895 i5573661370475160895, long j, long j2, K3983185380106045713 k3983185380106045713, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i) {
        int i2;
        I5573661370475160895 i55736613704751608952;
        K3983185380106045713 k39831853801060457132;
        K3983185380106045713 k39831853801060457133;
        int i3;
        m3727281027331139839.b0(1560288494);
        if ((i & 6) == 0) {
            i2 = (m3727281027331139839.f(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= m3727281027331139839.f(b9345618057833789735) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= m3727281027331139839.f(i1722681268793429505) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i55736613704751608952 = i5573661370475160895;
            i2 |= m3727281027331139839.f(i55736613704751608952) ? 2048 : 1024;
        } else {
            i55736613704751608952 = i5573661370475160895;
        }
        if ((i & 24576) == 0) {
            i2 |= m3727281027331139839.e(j) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= m3727281027331139839.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= m3727281027331139839.c(0.0f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= m3727281027331139839.h(t15443218846549482730) ? 67108864 : 33554432;
        }
        if (m3727281027331139839.R(i2 & 1, (38347923 & i2) != 38347922)) {
            m3727281027331139839.W();
            if ((i & 1) == 0 || m3727281027331139839.z()) {
                Object objM = m3727281027331139839.M();
                if (objM == O9023047933786425027.a) {
                    objM = new K20551553851858923();
                    m3727281027331139839.k0(objM);
                }
                k39831853801060457133 = (K3983185380106045713) objM;
                i3 = i2 & (-29360129);
            } else {
                m3727281027331139839.U();
                i3 = i2 & (-29360129);
                k39831853801060457133 = k3983185380106045713;
            }
            m3727281027331139839.r();
            R8540738700654750557 r8540738700654750557 = (R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h);
            float f = T18016951143603335921.h;
            float fK = r8540738700654750557.K(f);
            boolean z = m3727281027331139839.j(Y238707362170117896.n) == F10342546226345611902.b;
            I1722681268793429505 i1722681268793429505Q0 = M18113111391818111737.J(V16747615581620678882.n(i1722681268793429505, 240.0f, 0.0f, f, 10), new B16441894542753227226(k39831853801060457133, fK, z, (byte) 1)).Q0(V10993962107938880611.a).Q0(V16747615581620678882.b);
            K3983185380106045713 k39831853801060457134 = k39831853801060457133;
            T15443218846549482730 t15443218846549482730T = S10823041268949770285.T(-315420087, new P10802630798587874086(z, f, k39831853801060457134, fK, b9345618057833789735, t15443218846549482730), m3727281027331139839);
            int i4 = i3 >> 6;
            X15668192874961033526.a(i1722681268793429505Q0, i55736613704751608952, j, j2, 0.0f, 0.0f, null, t15443218846549482730T, m3727281027331139839, (i4 & 57344) | (i4 & 112) | 12582912 | (i4 & 896) | (i4 & 7168), 96);
            k39831853801060457132 = k39831853801060457134;
        } else {
            m3727281027331139839.U();
            k39831853801060457132 = k3983185380106045713;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new T8512120711574733906(b9345618057833789735, i1722681268793429505, i5573661370475160895, j, j2, k39831853801060457132, t15443218846549482730, i, (byte) 1);
        }
    }

    public static final void b(I1722681268793429505 i1722681268793429505, I5573661370475160895 i5573661370475160895, long j, long j2, B9345618057833789735 b9345618057833789735, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i) {
        I5573661370475160895 i55736613704751608952;
        long j3;
        long j4;
        int i2;
        long jB;
        long j5;
        I5573661370475160895 i55736613704751608953;
        m3727281027331139839.b0(1922633461);
        int i3 = i | (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | 25744 | (m3727281027331139839.f(b9345618057833789735) ? 131072 : 65536);
        if (m3727281027331139839.R(i3 & 1, (599187 & i3) != 599186)) {
            m3727281027331139839.W();
            if ((i & 1) == 0 || m3727281027331139839.z()) {
                float f = K17967194420215097389.a;
                I5573661370475160895 i5573661370475160895B = N13258083306148085703.b(T18016951143603335921.g, m3727281027331139839);
                long jE = J5654975781851244064.e(T18016951143603335921.k, m3727281027331139839);
                i2 = i3 & (-8177);
                jB = J5654975781851244064.b(jE, m3727281027331139839);
                j5 = jE;
                i55736613704751608953 = i5573661370475160895B;
            } else {
                m3727281027331139839.U();
                i2 = i3 & (-8177);
                jB = j2;
                i55736613704751608953 = i5573661370475160895;
                j5 = j;
            }
            m3727281027331139839.r();
            a(b9345618057833789735, i1722681268793429505, i55736613704751608953, j5, jB, null, t15443218846549482730, m3727281027331139839, ((i2 >> 12) & 112) | 6 | ((i2 << 6) & 896) | 102236160);
            j4 = jB;
            j3 = j5;
            i55736613704751608952 = i55736613704751608953;
        } else {
            m3727281027331139839.U();
            i55736613704751608952 = i5573661370475160895;
            j3 = j;
            j4 = j2;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L14829036885005298862(i1722681268793429505, i55736613704751608952, j3, j4, b9345618057833789735, t15443218846549482730, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final dev.epro.r0.T15443218846549482730 r24, dev.epro.r0.I1722681268793429505 r25, dev.epro.r0.K1246821697113442187 r26, final boolean r27, long r28, final dev.epro.r0.T15443218846549482730 r30, dev.epro.r0.M3727281027331139839 r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L577885825783492050.c(dev.epro.r0.T15443218846549482730, dev.epro.r0.I1722681268793429505, dev.epro.r0.K1246821697113442187, boolean, long, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(dev.epro.r0.T15443218846549482730 r19, boolean r20, dev.epro.r0.B13729205492206812220 r21, dev.epro.r0.I1722681268793429505 r22, dev.epro.r0.L12639328004344855510 r23, dev.epro.r0.I5573661370475160895 r24, dev.epro.r0.T9486746963944005828 r25, dev.epro.r0.M3727281027331139839 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L577885825783492050.d(dev.epro.r0.T15443218846549482730, boolean, dev.epro.r0.B13729205492206812220, dev.epro.r0.I1722681268793429505, dev.epro.r0.L12639328004344855510, dev.epro.r0.I5573661370475160895, dev.epro.r0.T9486746963944005828, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void e(final boolean z, final B13729205492206812220 b13729205492206812220, final B13729205492206812220 b137292054922068122202, final long j, M3727281027331139839 m3727281027331139839, final int i) {
        int i2;
        m3727281027331139839.b0(2106487387);
        if ((i & 6) == 0) {
            i2 = (m3727281027331139839.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= m3727281027331139839.h(b13729205492206812220) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= m3727281027331139839.h(b137292054922068122202) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= m3727281027331139839.e(j) ? 2048 : 1024;
        }
        if (m3727281027331139839.R(i2 & 1, (i2 & 1171) != 1170)) {
            String strH = H4776669175763245653.h(R.string.close_drawer, m3727281027331139839);
            I1722681268793429505 i1722681268793429505B = V10993962107938880611.a;
            Object obj = O9023047933786425027.a;
            if (z) {
                m3727281027331139839.a0(598792893);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objM = m3727281027331139839.M();
                if (z2 || objM == obj) {
                    objM = new K9854114937003160207(b13729205492206812220, b);
                    m3727281027331139839.k0(objM);
                }
                I1722681268793429505 i1722681268793429505B2 = T7055906184043387232.b(i1722681268793429505B, b13729205492206812220, (PointerInputEventHandler) objM);
                boolean zF = (i3 == 32) | m3727281027331139839.f(strH);
                Object objM2 = m3727281027331139839.M();
                if (zF || objM2 == obj) {
                    objM2 = new L18313429423471219115((byte) 1, b13729205492206812220, strH);
                    m3727281027331139839.k0(objM2);
                }
                i1722681268793429505B = J11170665878571083300.b(i1722681268793429505B2, true, (F4096073349764486348) objM2);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(599116967);
                m3727281027331139839.q(false);
            }
            I1722681268793429505 i1722681268793429505Q0 = V16747615581620678882.c.Q0(i1722681268793429505B);
            int i4 = ((i2 & 7168) == 2048 ? (byte) 1 : (byte) 0) | ((i2 & 896) != 256 ? (byte) 0 : (byte) 1);
            Object objM3 = m3727281027331139839.M();
            if (i4 != 0 || objM3 == obj) {
                objM3 = new Y6572374584111496817(j, b137292054922068122202, (byte) 2);
                m3727281027331139839.k0(objM3);
            }
            B11964701839924937722.b(i1722681268793429505Q0, (F4096073349764486348) objM3, m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510() { // from class: dev.epro.r0.Z18143384401428227858
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    L577885825783492050.e(z, b13729205492206812220, b137292054922068122202, j, (M3727281027331139839) obj2, V16504496955554646429.p(i | 1));
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final K1246821697113442187 f(M3727281027331139839 m3727281027331139839) {
        Object objM = m3727281027331139839.M();
        Object obj = O9023047933786425027.a;
        if (objM == obj) {
            objM = new H12529970590088694579((byte) 1);
            m3727281027331139839.k0(objM);
        }
        F4096073349764486348 f4096073349764486348 = (F4096073349764486348) objM;
        Object[] objArr = new Object[0];
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986((Object) new L2311487989567145532((byte) 3), (Object) new W906153071831269531(f4096073349764486348, (byte) 2), (byte) 20);
        boolean zF = m3727281027331139839.f(f4096073349764486348);
        Object objM2 = m3727281027331139839.M();
        if (zF || objM2 == obj) {
            objM2 = new F10146579574050854529(f4096073349764486348);
            m3727281027331139839.k0(objM2);
        }
        return (K1246821697113442187) C468629748621011703.m(objArr, v10300877997588547986, (B13729205492206812220) objM2, m3727281027331139839, 0);
    }
}
