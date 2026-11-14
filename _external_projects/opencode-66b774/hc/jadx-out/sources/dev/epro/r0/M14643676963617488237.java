package dev.epro.r0;

import ads_mobile_sdk.d62;
import ads_mobile_sdk.v03;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M14643676963617488237 {
    public static Z7022156542152740569 a;
    public static Z7022156542152740569 b;

    static {
        izmyclvb.dpqpjfpoanwt1(24);
    }

    public static final void a(K3983185380106045713 k3983185380106045713, long j, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(-1353562852);
        int i2 = (m3727281027331139839.f(k3983185380106045713) ? 4 : 2) | i | (m3727281027331139839.e(j) ? 32 : 16);
        if (m3727281027331139839.R(i2 & 1, (i2 & 19) != 18)) {
            Object objM = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            Object obj2 = objM;
            if (objM == obj) {
                B1061516154492673368 b1061516154492673368A = W7346099082318612118.a();
                b1061516154492673368A.h(1);
                m3727281027331139839.k0(b1061516154492673368A);
                obj2 = b1061516154492673368A;
            }
            Object obj3 = (B1061516154492673368) obj2;
            Object objM2 = m3727281027331139839.M();
            if (objM2 == obj) {
                objM2 = Z3658309082448601011.b(new N8306548196372912291(k3983185380106045713, (byte) 4));
                m3727281027331139839.k0(objM2);
            }
            Object objB = H12930139083347033944.b(((Number) ((L13148442655056575112) objM2).getValue()).floatValue(), J8045362843799184672.A0(H12684780467384173668.c, m3727281027331139839), null, m3727281027331139839, 0, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM3 = m3727281027331139839.M();
            if (z || objM3 == obj) {
                objM3 = new H8734584053421516944(k3983185380106045713, (byte) 16);
                m3727281027331139839.k0(objM3);
            }
            I1722681268793429505 i1722681268793429505K = V16747615581620678882.k(J11170665878571083300.a(V10993962107938880611.a, (F4096073349764486348) objM3), 16.0f);
            boolean zF = (i3 == 4) | m3727281027331139839.f(objB) | ((i2 & 112) == 32) | m3727281027331139839.h(obj3);
            Object objM4 = m3727281027331139839.M();
            if (zF || objM4 == obj) {
                Object a2259591046879578716 = new A2259591046879578716(k3983185380106045713, objB, j, obj3, (byte) 2);
                m3727281027331139839.k0(a2259591046879578716);
                objM4 = a2259591046879578716;
            }
            B11964701839924937722.b(i1722681268793429505K, (F4096073349764486348) objM4, m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new H13075619831258834471(k3983185380106045713, j, i);
        }
    }

    public static final void b(final boolean z, final B13729205492206812220 b13729205492206812220, final I1722681268793429505 i1722681268793429505, final S11237161986419267460 s11237161986419267460, G15527156457921655762 g15527156457921655762, final J12078565427869724451 j12078565427869724451, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, final int i) {
        T15443218846549482730 t154432188465494827302;
        G15527156457921655762 g155271564579216557622;
        m3727281027331139839.b0(-532332839);
        int i2 = i | (m3727281027331139839.g(z) ? 4 : 2) | (m3727281027331139839.h(b13729205492206812220) ? 32 : 16) | (m3727281027331139839.f(i1722681268793429505) ? 256 : 128) | (m3727281027331139839.f(s11237161986419267460) ? 2048 : 1024) | 24576;
        if (m3727281027331139839.R(i2 & 1, (599187 & i2) != 599186)) {
            m3727281027331139839.W();
            if ((i & 1) == 0 || m3727281027331139839.z()) {
                g155271564579216557622 = T13350664027331345869.b;
            } else {
                m3727281027331139839.U();
                g155271564579216557622 = g15527156457921655762;
            }
            m3727281027331139839.r();
            I1722681268793429505 i1722681268793429505Q0 = i1722681268793429505.Q0(new D8748169905697783845(z, b13729205492206812220, s11237161986419267460, U13247145094049343231.c));
            A10838822263452390785 a10838822263452390785C = Z6714950837425363575.c(g155271564579216557622, false);
            int iA = E12775674050813925581.A(m3727281027331139839);
            P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m3727281027331139839, i1722681268793429505Q0);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m3727281027331139839.S || !S10823041268949770285.t(m3727281027331139839.M(), Integer.valueOf(iA))) {
                L11610354117192841236.t(iA, m3727281027331139839, iA, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            E11770641342832797588 e11770641342832797588 = E11770641342832797588.a;
            t154432188465494827302 = t15443218846549482730;
            t154432188465494827302.invoke(e11770641342832797588, m3727281027331139839, 54);
            j12078565427869724451.invoke(e11770641342832797588, m3727281027331139839, 54);
            m3727281027331139839.q(true);
        } else {
            t154432188465494827302 = t15443218846549482730;
            m3727281027331139839.U();
            g155271564579216557622 = g15527156457921655762;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            final T15443218846549482730 t154432188465494827303 = t154432188465494827302;
            final G15527156457921655762 g155271564579216557623 = g155271564579216557622;
            v4878375136513573151T.d = new L12639328004344855510(z, b13729205492206812220, i1722681268793429505, s11237161986419267460, g155271564579216557623, j12078565427869724451, t154432188465494827303, i) { // from class: dev.epro.r0.W8150370803497351952
                public final /* synthetic */ boolean a;
                public final /* synthetic */ B13729205492206812220 b;
                public final /* synthetic */ I1722681268793429505 c;
                public final /* synthetic */ S11237161986419267460 d;
                public final /* synthetic */ G15527156457921655762 e;
                public final /* synthetic */ J12078565427869724451 f;
                public final /* synthetic */ T15443218846549482730 g;

                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = V16504496955554646429.p(1769473);
                    M14643676963617488237.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (M3727281027331139839) obj, iP);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static v03 c(I16631908410500040363 i16631908410500040363) {
        v03 v03Var = null;
        try {
            String strA = d62.a(i16631908410500040363, "click_string", "");
            String strA2 = d62.a(i16631908410500040363, "report_url", "");
            int i = 0;
            boolean zA = d62.a(i16631908410500040363, "non_malicious_reporting_enabled", false);
            boolean zA2 = d62.a(i16631908410500040363, "protection_enabled", false);
            P16422848101170923038 p16422848101170923038E = d62.e(i16631908410500040363, "allowed_headers");
            ArrayList arrayList = new ArrayList();
            if (p16422848101170923038E != null) {
                ArrayList arrayList2 = p16422848101170923038E.a;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        K5751602218013079365.f0();
                        throw null;
                    }
                    K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                    k15572083692188606544.getClass();
                    String strP = k15572083692188606544.p();
                    if (strP != null) {
                        arrayList.add(strP);
                    }
                    i = i3;
                }
            }
            v03Var = new v03(strA, strA2, zA, zA2, arrayList);
        } catch (Exception e) {
            ArrayList arrayList3 = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList3.add(message);
        }
        return v03Var == null ? new v03() : v03Var;
    }

    public static Object d(String str, F4096073349764486348 f4096073349764486348) {
        if (M8927913404651150384.Y(str)) {
            return null;
        }
        return f4096073349764486348.invoke(str);
    }

    public static final native Integer e(Q7430090668634766253 q7430090668634766253, Y15427935686644244568 y15427935686644244568);

    public static final long f() {
        return Thread.currentThread().getId();
    }

    public static final native int g(Q7430090668634766253 q7430090668634766253);

    public static final void h(L17598299826319227431 l17598299826319227431, B1061516154492673368 b1061516154492673368, S6349823729575121924 s6349823729575121924, long j, float f, J12368838350359828847 j12368838350359828847) {
        b1061516154492673368.g();
        b1061516154492673368.a.moveTo(0.0f, 0.0f);
        float fK = l17598299826319227431.K(10.0f);
        float f2 = j12368838350359828847.b;
        b1061516154492673368.e((fK * f2) / 2.0f, l17598299826319227431.K(5.0f) * f2);
        b1061516154492673368.e(l17598299826319227431.K(10.0f) * f2, 0.0f);
        float fMin = Math.min(s6349823729575121924.c - s6349823729575121924.a, s6349823729575121924.d - s6349823729575121924.b) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (s6349823729575121924.d() >> 32)) + fMin) - ((l17598299826319227431.K(10.0f) * f2) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s6349823729575121924.d() & 4294967295L)) - l17598299826319227431.K(2.5f);
        b1061516154492673368.i((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fK2 = j12368838350359828847.a - l17598299826319227431.K(2.5f);
        long jM0 = l17598299826319227431.m0();
        Q7316561721656982910 q7316561721656982910R = l17598299826319227431.R();
        long jF = q7316561721656982910R.F();
        q7316561721656982910R.A().l();
        try {
            ((H12843822278061842084) q7316561721656982910R.b).G(fK2, jM0);
            L17598299826319227431.H(l17598299826319227431, b1061516154492673368, j, f, new I1470541803076273897(l17598299826319227431.K(2.5f), 0.0f, 0, 0, 30), 48);
        } finally {
            L11610354117192841236.w(q7316561721656982910R, jF);
        }
    }

    public static final Z7022156542152740569 i() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Route", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 15.18f);
        v14323974914327418545.r(7.0f);
        v14323974914327418545.e(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        v14323974914327418545.o(-4.0f, 1.79f, -4.0f, 4.0f);
        v14323974914327418545.s(10.0f);
        v14323974914327418545.e(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        v14323974914327418545.o(-2.0f, -0.9f, -2.0f, -2.0f);
        v14323974914327418545.r(8.82f);
        v14323974914327418545.d(8.16f, 8.4f, 9.0f, 7.3f, 9.0f, 6.0f);
        v14323974914327418545.e(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        v14323974914327418545.n(3.0f, 4.34f, 3.0f, 6.0f);
        v14323974914327418545.e(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        v14323974914327418545.r(17.0f);
        v14323974914327418545.e(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        v14323974914327418545.o(4.0f, -1.79f, 4.0f, -4.0f);
        v14323974914327418545.r(7.0f);
        v14323974914327418545.e(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        v14323974914327418545.o(2.0f, 0.9f, 2.0f, 2.0f);
        v14323974914327418545.s(8.18f);
        v14323974914327418545.e(-1.16f, 0.41f, -2.0f, 1.51f, -2.0f, 2.82f);
        v14323974914327418545.e(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        v14323974914327418545.o(3.0f, -1.34f, 3.0f, -3.0f);
        v14323974914327418545.d(21.0f, 16.7f, 20.16f, 15.6f, 19.0f, 15.18f);
        v14323974914327418545.c();
        v14323974914327418545.j(6.0f, 7.0f);
        v14323974914327418545.d(5.45f, 7.0f, 5.0f, 6.55f, 5.0f, 6.0f);
        v14323974914327418545.o(0.45f, -1.0f, 1.0f, -1.0f);
        v14323974914327418545.o(1.0f, 0.45f, 1.0f, 1.0f);
        v14323974914327418545.n(6.55f, 7.0f, 6.0f, 7.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(18.0f, 19.0f);
        v14323974914327418545.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v14323974914327418545.o(0.45f, -1.0f, 1.0f, -1.0f);
        v14323974914327418545.o(1.0f, 0.45f, 1.0f, 1.0f);
        v14323974914327418545.n(18.55f, 19.0f, 18.0f, 19.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 j() {
        Z7022156542152740569 z7022156542152740569 = b;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.SwapHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(6.99f, 11.0f);
        v14323974914327418545.h(3.0f, 15.0f);
        v14323974914327418545.i(3.99f, 4.0f);
        v14323974914327418545.s(-3.0f);
        v14323974914327418545.f(14.0f);
        v14323974914327418545.s(-2.0f);
        v14323974914327418545.f(6.99f);
        v14323974914327418545.s(-3.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(21.0f, 9.0f);
        v14323974914327418545.i(-3.99f, -4.0f);
        v14323974914327418545.s(3.0f);
        v14323974914327418545.f(10.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.g(7.01f);
        v14323974914327418545.s(3.0f);
        v14323974914327418545.h(21.0f, 9.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        b = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final boolean k(float f, float f2, B1061516154492673368 b1061516154492673368) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        B1061516154492673368 b1061516154492673368A = W7346099082318612118.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            W7346099082318612118.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = b1061516154492673368A.b;
        if (rectF == null) {
            rectF = new RectF();
            b1061516154492673368A.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = b1061516154492673368A.a;
        RectF rectF2 = b1061516154492673368A.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        B1061516154492673368 b1061516154492673368A2 = W7346099082318612118.a();
        b1061516154492673368A2.f(b1061516154492673368, b1061516154492673368A, 1);
        boolean zIsEmpty = b1061516154492673368A2.a.isEmpty();
        b1061516154492673368A2.g();
        b1061516154492673368A.g();
        return !zIsEmpty;
    }

    public static boolean l(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean m(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final S11237161986419267460 n(M3727281027331139839 m3727281027331139839) {
        Object[] objArr = new Object[0];
        Object objM = m3727281027331139839.M();
        if (objM == O9023047933786425027.a) {
            objM = new H475444086652660118((byte) 7);
            m3727281027331139839.k0(objM);
        }
        return (S11237161986419267460) C468629748621011703.m(objArr, S11237161986419267460.b, (B13729205492206812220) objM, m3727281027331139839, 384);
    }

    public static final float o(long j, float f, R8540738700654750557 r8540738700654750557) {
        float fC;
        long jB = J5593409210068682756.b(j);
        if (E6417708602094478350.a(jB, 4294967296L)) {
            if (r8540738700654750557.s() <= 1.05d) {
                return r8540738700654750557.v0(j);
            }
            fC = J5593409210068682756.c(j) / J5593409210068682756.c(r8540738700654750557.E0(f));
        } else {
            if (!E6417708602094478350.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = J5593409210068682756.c(j);
        }
        return fC * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(dev.epro.r0.G4373553504164397325 r4, float r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof dev.epro.r0.Q6085726047049367823
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.Q6085726047049367823 r0 = (dev.epro.r0.Q6085726047049367823) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.Q6085726047049367823 r0 = new dev.epro.r0.Q6085726047049367823
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            dev.epro.r0.A81664135048468380 r4 = r0.t
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.A81664135048468380 r6 = new dev.epro.r0.A81664135048468380
            r6.<init>()
            dev.epro.r0.S11833130751855926073 r1 = new dev.epro.r0.S11833130751855926073
            r1.<init>(r6, r5, r2)
            r0.t = r6
            r0.v = r3
            dev.epro.r0.D6414970586266598845 r5 = dev.epro.r0.D6414970586266598845.a
            java.lang.Object r4 = r4.e(r5, r1, r0)
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r6
        L4b:
            float r4 = r4.a
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M14643676963617488237.p(dev.epro.r0.G4373553504164397325, float, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static final void q(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(J8045362843799184672.u0(j)), i, i2, 33);
        }
    }

    public static final void r(Spannable spannable, long j, R8540738700654750557 r8540738700654750557, int i, int i2) {
        long jB = J5593409210068682756.b(j);
        if (E6417708602094478350.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(T18016951143603335921.Z(r8540738700654750557.v0(j)), false), i, i2, 33);
        } else if (E6417708602094478350.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(J5593409210068682756.c(j)), i, i2, 33);
        }
    }

    public static final void s(Spannable spannable, A5535629440393075509 a5535629440393075509, int i, int i2) {
        if (a5535629440393075509 != null) {
            ArrayList arrayList = new ArrayList(Z115818233709597990.k0(a5535629440393075509, 10));
            Iterator it = a5535629440393075509.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((L6737218101458117862) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final Object t(O11762812214053478134 o11762812214053478134, O11762812214053478134 o117628122140534781342, L12639328004344855510 l12639328004344855510) {
        Object t13610764347093379131;
        Object objT;
        try {
            V12319504402545346730.s(2, l12639328004344855510);
            t13610764347093379131 = l12639328004344855510.invoke(o117628122140534781342, o11762812214053478134);
        } catch (Throwable th) {
            t13610764347093379131 = new T13610764347093379131(th, false);
        }
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (t13610764347093379131 == z3437138737604933638 || (objT = o11762812214053478134.T(t13610764347093379131)) == O4077903568229246.m) {
            return z3437138737604933638;
        }
        if (objT instanceof T13610764347093379131) {
            throw ((T13610764347093379131) objT).a;
        }
        return O4077903568229246.X(objT);
    }

    public static final native Q7430090668634766253 u(Q7430090668634766253 q7430090668634766253);
}
