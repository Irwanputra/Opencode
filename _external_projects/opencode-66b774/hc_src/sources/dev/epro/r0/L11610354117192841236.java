package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class L11610354117192841236 implements B14351301772695273662 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, pd.T0, pd.U0, pd.K0, pd.V0, pd.W0, pd.g1, pd.h1, pd.i1, pd.j1, pd.k1, pd.l1, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124};

    public static /* synthetic */ int A(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "IN_LINE" : "BLOCK" : "BLANK_LINE";
    }

    public static /* synthetic */ int[] C(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static String b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ boolean d(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static int e(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static int f(int i, int i2, B13729205492206812220 b13729205492206812220) {
        return (b13729205492206812220.hashCode() + i) * i2;
    }

    public static int g(F4096073349764486348 f4096073349764486348, int i, int i2) {
        return (f4096073349764486348.hashCode() + i) * i2;
    }

    public static int h(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static long i(M3727281027331139839 m3727281027331139839, int i, int i2, M3727281027331139839 m37272810273311398392, boolean z) {
        m3727281027331139839.a0(i);
        long A = U16229988784104357932.A(i2, m37272810273311398392);
        m3727281027331139839.q(z);
        return A;
    }

    public static M8821877208104636290 j(String str) {
        P753981624812481271.c(str);
        return new M8821877208104636290();
    }

    public static H10681976249452161517 k(M3727281027331139839 m3727281027331139839) {
        H10681976249452161517 h10681976249452161517 = new H10681976249452161517();
        m3727281027331139839.k0(h10681976249452161517);
        return h10681976249452161517;
    }

    public static X16972678375567016829 l(M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, X4712621039624176170 x4712621039624176170, float f, boolean z) {
        W7808703833045379622.J(x4712621039624176170, m3727281027331139839, i1722681268793429505);
        return new X16972678375567016829(f, z);
    }

    public static S9385204271696540760 m(M3727281027331139839 m3727281027331139839) {
        S9385204271696540760 s9385204271696540760 = new S9385204271696540760();
        m3727281027331139839.k0(s9385204271696540760);
        return s9385204271696540760;
    }

    public static P11507981277033739248 n(long j, X354568553596380848 x354568553596380848) {
        return x354568553596380848.a(new U10174709222559481877(j));
    }

    public static T6366323384730309747 o(O15378179187853170099 o15378179187853170099, int i) {
        return P15310403763067486318.a(new D2404297633479137514(o15378179187853170099, i));
    }

    public static String p(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String q(String str, String str2) {
        str.getClass();
        return M8927913404651150384.D0(str2).toString();
    }

    public static JSONObject r(String str, String str2) {
        return new JSONObject().put(str, str2);
    }

    public static void s(int i, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, boolean z) {
        l12639328004344855510.invoke(m3727281027331139839, Integer.valueOf(i));
        m3727281027331139839.q(z);
    }

    public static void t(int i, M3727281027331139839 m3727281027331139839, int i2, X4712621039624176170 x4712621039624176170) {
        m3727281027331139839.k0(Integer.valueOf(i));
        m3727281027331139839.b(x4712621039624176170, Integer.valueOf(i2));
    }

    public static void u(int i, M3727281027331139839 m3727281027331139839, X4712621039624176170 x4712621039624176170, M3727281027331139839 m37272810273311398392) {
        W7808703833045379622.J(x4712621039624176170, m3727281027331139839, Integer.valueOf(i));
        W7808703833045379622.H(m37272810273311398392);
    }

    public static void v(long j, String str, StringBuilder sb) {
        sb.append((Object) U10174709222559481877.h(j));
        sb.append(str);
    }

    public static void w(Q7316561721656982910 q7316561721656982910, long j) {
        q7316561721656982910.A().j();
        q7316561721656982910.P(j);
    }

    public static void x(N9422779686621825495 n9422779686621825495, String str, Map map, String str2) {
        n9422779686621825495.getClass();
        map.put(str2, N9422779686621825495.f(str));
    }

    public static /* synthetic */ void y(Object obj) {
        if (obj == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public static M8821877208104636290 z(String str) {
        P3521844374884164894.b(str);
        return new M8821877208104636290();
    }
}
