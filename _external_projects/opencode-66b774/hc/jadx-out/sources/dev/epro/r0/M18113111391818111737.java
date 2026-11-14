package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Optional;
import net.zetetic.database.CursorWindow;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class M18113111391818111737 {
    public static final Y4261039727803185691 A;
    public static final V10933700885381486763 B;
    public static final float C;
    public static final Y4261039727803185691 D;
    public static final float E;
    public static final Y4261039727803185691 F;
    public static final Y4261039727803185691 G;
    public static final float H;
    public static final float I;
    public static final float J;
    public static final V10933700885381486763 K;
    public static final float L;
    public static final Y4261039727803185691 M;
    public static final Y4261039727803185691 N;
    public static final float O;
    public static final Y4261039727803185691 P;
    public static final Y4261039727803185691 Q;
    public static final H2442898661687873181 R;
    public static Z7022156542152740569 S;
    public static F2238012860950049442 T;
    public static U5519500298982620611 U;
    public static N16536369055082677148 V;
    public static Z7022156542152740569 W;
    public static final Object b;
    public static Context c;
    public static Bundle d;
    public static final V10933700885381486763 e;
    public static final float f;
    public static final float g;
    public static final X4712621039624176170 h;
    public static final L2311487989567145532 i;
    public static O16200024709371809403 j;
    public static final B6440366792515411106 k;
    public static final L12293142626931145046 l;
    public static final X18244299380549586254 m;
    public static final X17873598080297061904 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final S6349823729575121924 f365o;
    public static final Y4261039727803185691 p;
    public static final float q;
    public static final Y4261039727803185691 r;
    public static final float s;
    public static final Y4261039727803185691 t;
    public static final float u;
    public static final Y4261039727803185691 v;
    public static final float w;
    public static final Y4261039727803185691 x;
    public static final float y;
    public static final Y4261039727803185691 z;
    public final Z17561488864728364842 a = new Z17561488864728364842();

    public static final I1722681268793429505 A(I1722681268793429505 i1722681268793429505, D5719685721490174593 d5719685721490174593) {
        return i1722681268793429505.Q0(new H2873143400216120234(d5719685721490174593));
    }

    public static final I1722681268793429505 B(I1722681268793429505 i1722681268793429505, T1241271073913685060 t1241271073913685060) {
        return i1722681268793429505.Q0(new C13648834854383503398(t1241271073913685060));
    }

    public static final boolean C(long j2, S6349823729575121924 s6349823729575121924) {
        float f2 = s6349823729575121924.a;
        float f3 = s6349823729575121924.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = s6349823729575121924.b;
        float f5 = s6349823729575121924.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final long E(A15234621907337682254 a15234621907337682254, long j2, Z6884774333691094167 z6884774333691094167) {
        B1029012102904255937 b1029012102904255937C;
        long jD;
        long j3;
        V11538895333762958192 v11538895333762958192;
        int iD;
        float fP;
        V11538895333762958192 v115388953337629581922;
        int iD2;
        V11538895333762958192 v115388953337629581923;
        int iD3;
        float fB;
        V11538895333762958192 v115388953337629581924;
        int iD4;
        U5234994727412699525 u5234994727412699525E = a15234621907337682254.e(z6884774333691094167);
        if (u5234994727412699525E == null) {
            return 9205357640488583168L;
        }
        U2691514441685065476 u2691514441685065476 = u5234994727412699525E.c;
        B1029012102904255937 b1029012102904255937 = a15234621907337682254.l;
        if (b1029012102904255937 == null || (b1029012102904255937C = u5234994727412699525E.c()) == null) {
            return 9205357640488583168L;
        }
        int i2 = z6884774333691094167.b;
        Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) u2691514441685065476.invoke();
        if (i2 > (q17957571128037780363 == null ? 0 : u5234994727412699525E.b(q17957571128037780363))) {
            return 9205357640488583168L;
        }
        L2216691091636065972 l2216691091636065972 = (L2216691091636065972) a15234621907337682254.q.getValue();
        l2216691091636065972.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b1029012102904255937C.r(b1029012102904255937, l2216691091636065972.a) >> 32));
        Q17957571128037780363 q179575711280377803632 = (Q17957571128037780363) u2691514441685065476.invoke();
        if (q179575711280377803632 == null) {
            jD = F12478849263529740365.b;
        } else {
            V11538895333762958192 v115388953337629581925 = q179575711280377803632.b;
            int iB = u5234994727412699525E.b(q179575711280377803632);
            if (iB < 1) {
                jD = F12478849263529740365.b;
            } else {
                int iD5 = v115388953337629581925.d(W7808703833045379622.q(i2, 0, iB - 1));
                jD = T1335862270807194835.d(q179575711280377803632.h(iD5), v115388953337629581925.c(iD5, true));
            }
        }
        if (F12478849263529740365.d(jD)) {
            Q17957571128037780363 q179575711280377803633 = (Q17957571128037780363) u2691514441685065476.invoke();
            fP = (q179575711280377803633 != null && (iD4 = (v115388953337629581924 = q179575711280377803633.b).d(i2)) < v115388953337629581924.f) ? q179575711280377803633.f(iD4) : -1.0f;
            j3 = 4294967295L;
        } else {
            j3 = 4294967295L;
            int i3 = (int) (jD >> 32);
            Q17957571128037780363 q179575711280377803634 = (Q17957571128037780363) u2691514441685065476.invoke();
            float f2 = (q179575711280377803634 != null && (iD2 = (v115388953337629581922 = q179575711280377803634.b).d(i3)) < v115388953337629581922.f) ? q179575711280377803634.f(iD2) : -1.0f;
            int i4 = ((int) (jD & 4294967295L)) - 1;
            Q17957571128037780363 q179575711280377803635 = (Q17957571128037780363) u2691514441685065476.invoke();
            float fG = (q179575711280377803635 != null && (iD = (v11538895333762958192 = q179575711280377803635.b).d(i4)) < v11538895333762958192.f) ? q179575711280377803635.g(iD) : -1.0f;
            fP = W7808703833045379622.p(fIntBitsToFloat, Math.min(f2, fG), Math.max(f2, fG));
        }
        if (fP == -1.0f) {
            return 9205357640488583168L;
        }
        if (!Q13254524308163418711.a(j2, 0L) && Math.abs(fIntBitsToFloat - fP) > ((int) (j2 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        Q17957571128037780363 q179575711280377803636 = (Q17957571128037780363) u2691514441685065476.invoke();
        if (q179575711280377803636 != null && (iD3 = (v115388953337629581923 = q179575711280377803636.b).d(i2)) < v115388953337629581923.f) {
            float f3 = v115388953337629581923.f(iD3);
            fB = ((v115388953337629581923.b(iD3) - f3) / 2.0f) + f3;
        } else {
            fB = -1.0f;
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        return b1029012102904255937.r(b1029012102904255937C, (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(fB)) & j3));
    }

    public static Bundle F(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (b) {
            if (applicationContext != c) {
                U1748733558996603759.b("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                d = bundle2;
                c = applicationContext;
                Trace.endSection();
            }
            bundle = d;
        }
        return bundle;
    }

    public static final Object G(Optional optional, Object obj) {
        optional.getClass();
        return optional.isPresent() ? optional.get() : obj;
    }

    public static final Object H(Optional optional) {
        optional.getClass();
        return optional.orElse(null);
    }

    public static final L5844152868342410893 I(L5844152868342410893 l5844152868342410893) {
        H11725168162114556860 h11725168162114556860 = l5844152868342410893.u.u;
        while (true) {
            H11725168162114556860 h11725168162114556860U = h11725168162114556860.u();
            H11725168162114556860 h117251681621145568602 = null;
            if ((h11725168162114556860U != null ? h11725168162114556860U.h : null) == null) {
                L5844152868342410893 l5844152868342410893C1 = ((Y4989033692226475498) h11725168162114556860.F.e).c1();
                l5844152868342410893C1.getClass();
                return l5844152868342410893C1;
            }
            H11725168162114556860 h11725168162114556860U2 = h11725168162114556860.u();
            if (h11725168162114556860U2 != null) {
                h117251681621145568602 = h11725168162114556860U2.h;
            }
            h117251681621145568602.getClass();
            H11725168162114556860 h11725168162114556860U3 = h11725168162114556860.u();
            h11725168162114556860U3.getClass();
            h11725168162114556860 = h11725168162114556860U3.h;
            h11725168162114556860.getClass();
        }
    }

    public static final I1722681268793429505 J(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new O1604469965577560697(f4096073349764486348));
    }

    public static I1722681268793429505 K(I1722681268793429505 i1722681268793429505, float f2, float f3, float f4, float f5, float f6, long j2, I5573661370475160895 i5573661370475160895, boolean z2, long j3, long j4, int i2) {
        return i1722681268793429505.Q0(new J3193063299506776700((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 4) != 0 ? 1.0f : f4, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f5, 0.0f, 0.0f, (i2 & 256) != 0 ? 0.0f : f6, 8.0f, (i2 & 1024) != 0 ? N13757329872968394114.b : j2, (i2 & 2048) != 0 ? R7033599853981556291.n : i5573661370475160895, (i2 & 4096) != 0 ? false : z2, (i2 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE) != 0 ? P15210604536357993274.a : j3, (i2 & 32768) != 0 ? P15210604536357993274.a : j4, 0, 3, null, X3174009376965511256.a));
    }

    public static I1722681268793429505 L(I1722681268793429505 i1722681268793429505, float f2, float f3, float f4, float f5, I5573661370475160895 i5573661370475160895, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j2 = N13757329872968394114.b;
        I5573661370475160895 i55736613704751608952 = (i2 & 2048) != 0 ? R7033599853981556291.n : i5573661370475160895;
        long j3 = P15210604536357993274.a;
        return K(i1722681268793429505, f6, f7, f8, f9, 0.0f, j2, i55736613704751608952, false, j3, j3, 524288);
    }

    public static final native E9947071562186447382 M(List list);

    public static final native List N(List list);

    public static final I1722681268793429505 O(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new O12225365777483860847(f4096073349764486348));
    }

    public static final boolean P(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final native int Q(int i2, List list);

    public static D14731132657808549702 R(D14731132657808549702 d14731132657808549702) {
        if (d14731132657808549702 == D14731132657808549702.U) {
            return D14731132657808549702.k0;
        }
        if (d14731132657808549702 == D14731132657808549702.V) {
            return D14731132657808549702.m0;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static final long S(long j2, long j3) {
        int iE;
        int iG = F12478849263529740365.g(j2);
        int iF = F12478849263529740365.f(j2);
        if ((F12478849263529740365.g(j3) < F12478849263529740365.f(j2)) && (F12478849263529740365.g(j2) < F12478849263529740365.f(j3))) {
            if (F12478849263529740365.a(j3, j2)) {
                iG = F12478849263529740365.g(j3);
                iF = iG;
            } else {
                if (F12478849263529740365.a(j2, j3)) {
                    iE = F12478849263529740365.e(j3);
                } else {
                    int iG2 = F12478849263529740365.g(j3);
                    if (iG >= F12478849263529740365.f(j3) || iG2 > iG) {
                        iF = F12478849263529740365.g(j3);
                    } else {
                        iG = F12478849263529740365.g(j3);
                        iE = F12478849263529740365.e(j3);
                    }
                }
                iF -= iE;
            }
        } else if (iF > F12478849263529740365.g(j3)) {
            iG -= F12478849263529740365.e(j3);
            iE = F12478849263529740365.e(j3);
            iF -= iE;
        }
        return T1335862270807194835.d(iG, iF);
    }

    public static final S6349823729575121924 T(B1029012102904255937 b1029012102904255937) {
        S6349823729575121924 s6349823729575121924U = V12319504402545346730.u(b1029012102904255937, true);
        long jG = b1029012102904255937.g(s6349823729575121924U.f());
        float f2 = s6349823729575121924U.c;
        float f3 = s6349823729575121924U.d;
        long jG2 = b1029012102904255937.g((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new S6349823729575121924(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jG2 >> 32)), Float.intBitsToFloat((int) (jG2 & 4294967295L)));
    }

    public static final native Object U(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    public static final I1722681268793429505 V(I1722681268793429505 i1722681268793429505, B9345618057833789735 b9345618057833789735) {
        return i1722681268793429505.Q0(new D13018299933075300827(b9345618057833789735));
    }

    public static final native void a(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void b(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void c(long j2, L739450498903353996 l739450498903353996, float f2, float f3, float f4, float f5, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void d(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void e(int i2, M3727281027331139839 m3727281027331139839);

    public static final U6155824110361579454 f(float f2, long j2) {
        return new U6155824110361579454(f2, new H10765568533039107979(j2));
    }

    public static final native void g(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, boolean z2);

    public static final native void h(Z7022156542152740569 z7022156542152740569, String str, boolean z2, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, J12078565427869724451 j12078565427869724451, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void i(Z7022156542152740569 z7022156542152740569, String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void j(I1722681268793429505 i1722681268793429505, float f2, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final void m(B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, B14178846910827721115 b14178846910827721115, I9108530243911643998 i9108530243911643998, M3727281027331139839 m3727281027331139839, int i2) {
        I9108530243911643998 i91085302439116439982;
        B14178846910827721115 b141788469108277211152;
        I1722681268793429505 i17226812687934295052;
        m3727281027331139839.b0(1055276397);
        int i3 = (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | i2 | (m3727281027331139839.f(i1722681268793429505) ? 32 : 16) | (m3727281027331139839.f(b14178846910827721115) ? 256 : 128) | (m3727281027331139839.f(i9108530243911643998) ? 2048 : 1024);
        if (m3727281027331139839.R(i3 & 1, (i3 & 1171) != 1170)) {
            i91085302439116439982 = i9108530243911643998;
            T10611927573311748125 t10611927573311748125 = new T10611927573311748125((Object) b14178846910827721115, (Object) i1722681268793429505, (Object) i91085302439116439982, (Object) V4416135141588678913.v(b13729205492206812220, m3727281027331139839), (byte) 2);
            b141788469108277211152 = b14178846910827721115;
            i17226812687934295052 = i1722681268793429505;
            U16229988784104357932.h(S10823041268949770285.T(-933153643, t10611927573311748125, m3727281027331139839), m3727281027331139839, 6);
        } else {
            i91085302439116439982 = i9108530243911643998;
            b141788469108277211152 = b14178846910827721115;
            i17226812687934295052 = i1722681268793429505;
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new I15182068337753965030(b13729205492206812220, i17226812687934295052, b141788469108277211152, i91085302439116439982, i2);
        }
    }

    public static final native void n(F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, F2652319623815706820 f2652319623815706820, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(A16842337154698931828 a16842337154698931828, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(List list, List list2, boolean z2, boolean z3, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(M4860099956793226162 m4860099956793226162, boolean z2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native Object r(L12602321637077960189 l12602321637077960189, X11745913536878472556 x11745913536878472556, K14749510448791472029 k14749510448791472029);

    public static final native Object s(L12602321637077960189 l12602321637077960189, U6661402979307074403 u6661402979307074403, K14749510448791472029 k14749510448791472029);

    public static void t(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            G6547577305291411977.B(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void u(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        S10973172697741180971.m(str);
    }

    public static void v(Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k("null reference");
    }

    public static void w(String str, Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k(str);
    }

    public static T1056749650218919949 x(M3727281027331139839 m3727281027331139839) {
        J3745674191043464657 j3745674191043464657 = (J3745674191043464657) m3727281027331139839.j(J5654975781851244064.a);
        T1056749650218919949 t1056749650218919949 = j3745674191043464657.f0;
        if (t1056749650218919949 != null) {
            return t1056749650218919949;
        }
        long jD = J5654975781851244064.d(j3745674191043464657, G18207866021774821160.c);
        long j2 = U10174709222559481877.g;
        Y4261039727803185691 y4261039727803185691 = G18207866021774821160.a;
        long jD2 = J5654975781851244064.d(j3745674191043464657, y4261039727803185691);
        Y4261039727803185691 y42610397278031856912 = G18207866021774821160.b;
        T1056749650218919949 t10567496502189199492 = new T1056749650218919949(jD, j2, jD2, j2, U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, y42610397278031856912)), j2, U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, y42610397278031856912)), J5654975781851244064.d(j3745674191043464657, y4261039727803185691), J5654975781851244064.d(j3745674191043464657, G18207866021774821160.f), U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, y42610397278031856912)), U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, G18207866021774821160.e)), U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, y42610397278031856912)));
        j3745674191043464657.f0 = t10567496502189199492;
        return t10567496502189199492;
    }

    public static final native Object y(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    public static int z(int i2, int i3) {
        if (i3 <= 1073741823) {
            return Math.min(Math.max(i2, i3), 1073741823);
        }
        S10973172697741180971.j(E17665849472693074628.f("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), 1073741823));
        return 0;
    }

    public final void D(E9133045636215945243 e9133045636215945243, K15438463641018513946 k15438463641018513946, E1005111105761972824 e1005111105761972824, J10190266792694782308 j10190266792694782308) {
        this.a.c0(e9133045636215945243, k15438463641018513946, e1005111105761972824, j10190266792694782308);
    }

    static {
        izmyclvb.dpqpjfpoanwt1(476);
        b = new Object();
        V10933700885381486763 v10933700885381486763 = V10933700885381486763.e;
        e = v10933700885381486763;
        f = 8.0f;
        g = 1.0f;
        h = new X4712621039624176170((byte) 29);
        i = new L2311487989567145532((byte) 0);
        k = new B6440366792515411106(Q17410559678825476760.class, new D11988991656201568495((byte) 5));
        l = new L12293142626931145046("type.googleapis.com/google.crypto.tink.KmsAeadKey", new D11988991656201568495((byte) 6));
        m = new X18244299380549586254(Q1452147735941829490.class, new D11988991656201568495((byte) 7));
        n = new X17873598080297061904("type.googleapis.com/google.crypto.tink.KmsAeadKey", new D11988991656201568495((byte) 8));
        f365o = new S6349823729575121924(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        p = Y4261039727803185691.r;
        q = 1.0f;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        r = y4261039727803185691;
        s = 0.38f;
        t = y4261039727803185691;
        u = 0.12f;
        v = y4261039727803185691;
        w = 0.38f;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.u;
        x = y42610397278031856912;
        y = 0.38f;
        z = y42610397278031856912;
        A = y4261039727803185691;
        B = v10933700885381486763;
        C = 28.0f;
        D = Y4261039727803185691.e;
        E = 24.0f;
        F = Y4261039727803185691.f;
        G = Y4261039727803185691.m;
        H = 40.0f;
        I = 32.0f;
        J = 2.0f;
        K = v10933700885381486763;
        L = 52.0f;
        Y4261039727803185691 y42610397278031856913 = Y4261039727803185691.k;
        M = y42610397278031856913;
        N = y42610397278031856913;
        O = 16.0f;
        P = y42610397278031856912;
        Q = y42610397278031856912;
        R = new H2442898661687873181((byte) 3);
    }
}
