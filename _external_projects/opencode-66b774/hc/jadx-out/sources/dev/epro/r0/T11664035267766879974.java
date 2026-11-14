package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T11664035267766879974 {
    public static final long a = L12240044716294895599.c(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final dev.epro.r0.B13729205492206812220 r30, dev.epro.r0.I1722681268793429505 r31, dev.epro.r0.L7100317404093621994 r32, float r33, boolean r34, dev.epro.r0.I5573661370475160895 r35, long r36, long r38, long r40, dev.epro.r0.L12639328004344855510 r42, dev.epro.r0.L12639328004344855510 r43, dev.epro.r0.R14415661131438974095 r44, final dev.epro.r0.T15443218846549482730 r45, dev.epro.r0.M3727281027331139839 r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T11664035267766879974.a(dev.epro.r0.B13729205492206812220, dev.epro.r0.I1722681268793429505, dev.epro.r0.L7100317404093621994, float, boolean, dev.epro.r0.I5573661370475160895, long, long, long, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.R14415661131438974095, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void b(final U16834965109098959004 u16834965109098959004, final W5797197595347441198 w5797197595347441198, final B13729205492206812220 b13729205492206812220, final F4096073349764486348 f4096073349764486348, final I1722681268793429505 i1722681268793429505, final L7100317404093621994 l7100317404093621994, final float f, final boolean z, final I5573661370475160895 i5573661370475160895, final long j, final long j2, final float f2, final L12639328004344855510 l12639328004344855510, final L12639328004344855510 l126393280043448555102, final T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, final int i) {
        boolean z2;
        m3727281027331139839.b0(-37400432);
        int i2 = i | (m3727281027331139839.h(u16834965109098959004) ? 32 : 16) | (m3727281027331139839.h(w5797197595347441198) ? 256 : 128) | (m3727281027331139839.h(b13729205492206812220) ? 2048 : 1024) | (m3727281027331139839.h(f4096073349764486348) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (m3727281027331139839.f(i1722681268793429505) ? 131072 : 65536) | (m3727281027331139839.f(l7100317404093621994) ? 1048576 : 524288) | (m3727281027331139839.c(f) ? 8388608 : 4194304) | (m3727281027331139839.g(z) ? 67108864 : 33554432) | (m3727281027331139839.f(i5573661370475160895) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        int i3 = (m3727281027331139839.e(j) ? 4 : 2) | (m3727281027331139839.e(j2) ? 32 : 16) | (m3727281027331139839.c(f2) ? 256 : 128) | (m3727281027331139839.h(l12639328004344855510) ? 2048 : 1024) | (m3727281027331139839.h(l126393280043448555102) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (m3727281027331139839.h(t15443218846549482730) ? 131072 : 65536);
        if (m3727281027331139839.R(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            m3727281027331139839.W();
            if ((i & 1) != 0 && !m3727281027331139839.z()) {
                m3727281027331139839.U();
            }
            m3727281027331139839.r();
            String strH = H4776669175763245653.h(R.string.m3c_bottom_sheet_pane_title, m3727281027331139839);
            I1722681268793429505 i1722681268793429505Q0 = V16747615581620678882.p(E11770641342832797588.a.a(i1722681268793429505, T13350664027331345869.c), f, 1).Q0(V16747615581620678882.a);
            I1722681268793429505 i1722681268793429505O = V10993962107938880611.a;
            Object obj = O9023047933786425027.a;
            if (z) {
                m3727281027331139839.a0(-1582035383);
                boolean z3 = (((i2 & 3670016) ^ 1572864) > 1048576 && m3727281027331139839.f(l7100317404093621994)) || (i2 & 1572864) == 1048576;
                Object objM = m3727281027331139839.M();
                if (z3 || objM == obj) {
                    J15264501749816156841 j15264501749816156841 = M9984471881434117539.a;
                    objM = new C9803106604533055608(l7100317404093621994, f4096073349764486348);
                    m3727281027331139839.k0(objM);
                }
                i1722681268793429505O = C9869900372345142877.O(i1722681268793429505O, (J13386303774951932313) objM, null);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(-1582020872);
                m3727281027331139839.q(false);
            }
            I1722681268793429505 i1722681268793429505Q02 = i1722681268793429505Q0.Q0(i1722681268793429505O);
            F9886074403848142923 f9886074403848142923 = l7100317404093621994.d;
            F9886074403848142923 f98860744038481429232 = l7100317404093621994.d;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z4 = (i4 > 1048576 && m3727281027331139839.f(l7100317404093621994)) || (i2 & 1572864) == 1048576;
            Object objM2 = m3727281027331139839.M();
            if (z4 || objM2 == obj) {
                z2 = true;
                objM2 = new Q15027034467569330017(l7100317404093621994, (byte) 1);
                m3727281027331139839.k0(objM2);
            } else {
                z2 = true;
            }
            I1722681268793429505 i1722681268793429505B = Q3181834110876746778.B(i1722681268793429505Q02, f9886074403848142923, (L12639328004344855510) objM2);
            H9049518308677093740 h9049518308677093740 = (H9049518308677093740) f98860744038481429232.m;
            boolean z5 = (z && l7100317404093621994.d()) ? z2 : false;
            boolean z6 = f98860744038481429232.d.getValue() != null ? z2 : false;
            boolean z7 = (i2 & 57344) == 16384 ? z2 : false;
            Object objM3 = m3727281027331139839.M();
            if (z7 || objM3 == obj) {
                objM3 = new P421968919732646895(f4096073349764486348, null);
                m3727281027331139839.k0(objM3);
            }
            I1722681268793429505 i1722681268793429505A = R3964428913610127921.a(i1722681268793429505B, h9049518308677093740, z5, z6, null, (J12078565427869724451) objM3, 168);
            boolean zF = m3727281027331139839.f(strH);
            Object objM4 = m3727281027331139839.M();
            if (zF || objM4 == obj) {
                objM4 = new V1772710875189249092(strH, (byte) 19);
                m3727281027331139839.k0(objM4);
            }
            I1722681268793429505 i1722681268793429505B2 = J11170665878571083300.b(i1722681268793429505A, false, (F4096073349764486348) objM4);
            int iG = (int) f98860744038481429232.f.g();
            if (iG < 0) {
                iG = 0;
            }
            I1722681268793429505 i1722681268793429505A2 = M18113111391818111737.A(i1722681268793429505B2, E18444280280170001567.q(iG, 13));
            boolean z8 = ((i4 > 1048576 && m3727281027331139839.f(l7100317404093621994)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || m3727281027331139839.h(u16834965109098959004));
            Object objM5 = m3727281027331139839.M();
            if (z8 || objM5 == obj) {
                objM5 = new B2138252231653711516(l7100317404093621994, u16834965109098959004, (byte) 21);
                m3727281027331139839.k0(objM5);
            }
            int i5 = i3 << 6;
            X15668192874961033526.a(M18113111391818111737.J(M18113111391818111737.J(i1722681268793429505A2, (F4096073349764486348) objM5), new Y18394829151188660697(l7100317404093621994, (byte) 0)), i5573661370475160895, j, j2, f2, 0.0f, null, S10823041268949770285.T(728743275, new J1473911187262617919(l126393280043448555102, u16834965109098959004, l7100317404093621994, l12639328004344855510, t15443218846549482730, b13729205492206812220, w5797197595347441198, z), m3727281027331139839), m3727281027331139839, ((i2 >> 24) & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 96);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510(w5797197595347441198, b13729205492206812220, f4096073349764486348, i1722681268793429505, l7100317404093621994, f, z, i5573661370475160895, j, j2, f2, l12639328004344855510, l126393280043448555102, t15443218846549482730, i) { // from class: dev.epro.r0.V11972832133769137045
                public final /* synthetic */ W5797197595347441198 b;
                public final /* synthetic */ B13729205492206812220 c;
                public final /* synthetic */ F4096073349764486348 d;
                public final /* synthetic */ I1722681268793429505 e;
                public final /* synthetic */ L7100317404093621994 f;
                public final /* synthetic */ float g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ I5573661370475160895 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ L12639328004344855510 m;
                public final /* synthetic */ L12639328004344855510 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ T15443218846549482730 f531o;

                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = V16504496955554646429.p(71);
                    T11664035267766879974.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f531o, (M3727281027331139839) obj2, iP);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final void c(long j, B13729205492206812220 b13729205492206812220, boolean z, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(-391613911);
        int i2 = i | (m3727281027331139839.e(j) ? 4 : 2) | (m3727281027331139839.h(b13729205492206812220) ? 32 : 16) | (m3727281027331139839.g(z) ? 256 : 128) | (m3727281027331139839.g(true) ? 2048 : 1024);
        if (!m3727281027331139839.R(i2 & 1, (i2 & 1171) != 1170)) {
            m3727281027331139839.U();
        } else if (j != 16) {
            m3727281027331139839.a0(-1438582326);
            Object objB = H12930139083347033944.b(z ? 1.0f : 0.0f, J8045362843799184672.A0(H12684780467384173668.c, m3727281027331139839), null, m3727281027331139839, 0, 28);
            String strH = H4776669175763245653.h(R.string.close_sheet, m3727281027331139839);
            m3727281027331139839.a0(-1438283579);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objM = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            if (z2 || objM == obj) {
                objM = new K9854114937003160207(b13729205492206812220, (byte) 0);
                m3727281027331139839.k0(objM);
            }
            I1722681268793429505 i1722681268793429505B = T7055906184043387232.b(V10993962107938880611.a, b13729205492206812220, (PointerInputEventHandler) objM);
            boolean zF = (i3 == 32) | m3727281027331139839.f(strH);
            Object objM2 = m3727281027331139839.M();
            if (zF || objM2 == obj) {
                objM2 = new L18313429423471219115((byte) 0, b13729205492206812220, strH);
                m3727281027331139839.k0(objM2);
            }
            I1722681268793429505 i1722681268793429505B2 = J11170665878571083300.b(i1722681268793429505B, true, (F4096073349764486348) objM2);
            m3727281027331139839.q(false);
            I1722681268793429505 i1722681268793429505Q0 = V16747615581620678882.c.Q0(i1722681268793429505B2);
            boolean zF2 = ((i2 & 14) == 4) | m3727281027331139839.f(objB);
            Object objM3 = m3727281027331139839.M();
            if (zF2 || objM3 == obj) {
                objM3 = new Y6572374584111496817(j, objB, (byte) 1);
                m3727281027331139839.k0(objM3);
            }
            B11964701839924937722.b(i1722681268793429505Q0, (F4096073349764486348) objM3, m3727281027331139839, 0);
            m3727281027331139839.q(false);
        } else {
            m3727281027331139839.a0(-1437676103);
            m3727281027331139839.q(false);
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new Z11249674732035621435(j, b13729205492206812220, z, i);
        }
    }

    public static final float d(O16200024709371809403 o16200024709371809403, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o16200024709371809403.r >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (V933048422416352811.x(0.0f, Math.min(o16200024709371809403.t.c() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(O16200024709371809403 o16200024709371809403, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o16200024709371809403.r & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (V933048422416352811.x(0.0f, Math.min(o16200024709371809403.t.c() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final L7100317404093621994 f(int i, int i2, M3727281027331139839 m3727281027331139839) {
        Object objM = m3727281027331139839.M();
        Object obj = O9023047933786425027.a;
        Object obj2 = objM;
        if (objM == obj) {
            Object p16607035664026122700 = new P16607035664026122700((byte) 12);
            m3727281027331139839.k0(p16607035664026122700);
            obj2 = p16607035664026122700;
        }
        F4096073349764486348 f4096073349764486348 = (F4096073349764486348) obj2;
        int i3 = (i & 14) | 384;
        J15264501749816156841 j15264501749816156841 = M9984471881434117539.a;
        final float f = O5281141647562557162.c;
        final float f2 = O5281141647562557162.d;
        final R8540738700654750557 r8540738700654750557 = (R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h);
        boolean zF = m3727281027331139839.f(r8540738700654750557) | m3727281027331139839.c(f);
        Object objM2 = m3727281027331139839.M();
        final byte b = 0;
        Object obj3 = objM2;
        if (zF || objM2 == obj) {
            Object obj4 = new B13729205492206812220() { // from class: dev.epro.r0.G2859559496543101833
                @Override // dev.epro.r0.B13729205492206812220
                public final Object invoke() {
                    float fK;
                    byte b2 = b;
                    float f3 = f;
                    R8540738700654750557 r85407387006547505572 = r8540738700654750557;
                    switch (b2) {
                        case 0:
                            fK = r85407387006547505572.K(f3);
                            break;
                        default:
                            fK = r85407387006547505572.K(f3);
                            break;
                    }
                    return Float.valueOf(fK);
                }
            };
            m3727281027331139839.k0(obj4);
            obj3 = obj4;
        }
        B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj3;
        boolean zF2 = m3727281027331139839.f(r8540738700654750557) | m3727281027331139839.c(f2);
        Object objM3 = m3727281027331139839.M();
        final byte b2 = 1;
        Object obj5 = objM3;
        if (zF2 || objM3 == obj) {
            Object obj6 = new B13729205492206812220() { // from class: dev.epro.r0.G2859559496543101833
                @Override // dev.epro.r0.B13729205492206812220
                public final Object invoke() {
                    float fK;
                    byte b22 = b2;
                    float f3 = f2;
                    R8540738700654750557 r85407387006547505572 = r8540738700654750557;
                    switch (b22) {
                        case 0:
                            fK = r85407387006547505572.K(f3);
                            break;
                        default:
                            fK = r85407387006547505572.K(f3);
                            break;
                    }
                    return Float.valueOf(fK);
                }
            };
            m3727281027331139839.k0(obj6);
            obj5 = obj6;
        }
        B13729205492206812220 b137292054922068122202 = (B13729205492206812220) obj5;
        Object[] objArr = {false, f4096073349764486348, Boolean.FALSE};
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986(new R15397193384711361242((byte) 18), new T16092471010129747396(false, b13729205492206812220, b137292054922068122202, f4096073349764486348), (byte) 20);
        if ((((i3 & 14) ^ 6) <= 4 || !m3727281027331139839.g(false)) && (i3 & 6) != 4) {
            b2 = 0;
        }
        int i4 = (m3727281027331139839.f(b13729205492206812220) ? 1 : 0) | b2 | (m3727281027331139839.f(b137292054922068122202) ? 1 : 0) | (m3727281027331139839.f(f4096073349764486348) ? 1 : 0) | (m3727281027331139839.g(false) ? 1 : 0);
        Object objM4 = m3727281027331139839.M();
        Object obj7 = objM4;
        if (i4 != 0 || objM4 == obj) {
            Object z14336393938898883709 = new Z14336393938898883709(false, b13729205492206812220, b137292054922068122202, F16729560403295819437.a, f4096073349764486348);
            m3727281027331139839.k0(z14336393938898883709);
            obj7 = z14336393938898883709;
        }
        return (L7100317404093621994) C468629748621011703.m(objArr, v10300877997588547986, (B13729205492206812220) obj7, m3727281027331139839, 0);
    }
}
