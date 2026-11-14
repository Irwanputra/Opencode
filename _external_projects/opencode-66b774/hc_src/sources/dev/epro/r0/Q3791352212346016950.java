package dev.epro.r0;

import ads_mobile_sdk.av0;
import ads_mobile_sdk.bv0;
import ads_mobile_sdk.pu0;
import ads_mobile_sdk.qu0;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.su0;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.uu0;
import ads_mobile_sdk.vu0;
import ads_mobile_sdk.wu0;
import ads_mobile_sdk.yu0;
import ads_mobile_sdk.zu0;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.reflect.Field;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class Q3791352212346016950 {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static Z7022156542152740569 i;

    static {
        izmyclvb.qgayjvbiagej2(755);
    }

    public static final native void a(R6894569913291645384 r6894569913291645384, M3727281027331139839 m3727281027331139839, int i2);

    public static final void b(boolean z, O16392062884302746898 o16392062884302746898, L9852841107405549527 l9852841107405549527, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        N17980339148608222959 d2;
        m3727281027331139839.b0(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.d(o16392062884302746898.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(l9852841107405549527) ? 256 : 128;
        }
        byte b2 = 1;
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean f2 = (i4 == 4) | m3727281027331139839.f(l9852841107405549527);
            Object M = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            if (f2 || M == obj) {
                M = new H12271112700473822464(l9852841107405549527, z);
                m3727281027331139839.k0(M);
            }
            N235339945877347053 n235339945877347053 = (N235339945877347053) M;
            boolean h2 = m3727281027331139839.h(l9852841107405549527) | (i4 == 4);
            Object M2 = m3727281027331139839.M();
            if (h2 || M2 == obj) {
                M2 = new I2771180180402593071(l9852841107405549527, z);
                m3727281027331139839.k0(M2);
            }
            A7033694156606186337 a7033694156606186337 = (A7033694156606186337) M2;
            boolean h3 = F12478849263529740365.h(l9852841107405549527.l().b);
            F13241018602672925865 l = l9852841107405549527.l();
            int i5 = (int) (z ? l.b >> 32 : l.b & 4294967295L);
            I2076339260272013590 i2076339260272013590 = l9852841107405549527.d;
            float h4 = (i2076339260272013590 == null || (d2 = i2076339260272013590.d()) == null) ? 0.0f : J10256772239794345968.h(d2.a, i5);
            boolean h5 = m3727281027331139839.h(n235339945877347053);
            Object M3 = m3727281027331139839.M();
            if (h5 || M3 == obj) {
                M3 = new N13431395266789109929(n235339945877347053, b2);
                m3727281027331139839.k0(M3);
            }
            T18016951143603335921.k(a7033694156606186337, z, o16392062884302746898, h3, 0L, h4, T7055906184043387232.b(V10993962107938880611.a, n235339945877347053, (PointerInputEventHandler) M3), m3727281027331139839, (i3 << 3) & 1008, 16);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new W13996358013743084846(z, (Object) o16392062884302746898, (Object) l9852841107405549527, i2, (byte) 7);
        }
    }

    public static float c(Context context, float f2) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return TypedValue.applyDimension(1, f2, displayMetrics);
    }

    public static String d(pu0 pu0Var) {
        pu0Var.getClass();
        if (pu0Var.a() == 1 || (pu0Var instanceof av0)) {
            return "Internal error.";
        }
        if (pu0Var instanceof zu0) {
            zu0 zu0Var = (zu0) pu0Var;
            return "WebView HTTP error " + zu0Var.c + ": " + zu0Var.d + " on url: " + zu0Var.e;
        }
        if (pu0Var instanceof bv0) {
            return "The system WebView required for this operation was terminated.";
        }
        if (pu0Var instanceof tu0) {
            return ((tu0) pu0Var).c;
        }
        if (pu0Var instanceof qu0) {
            qu0 qu0Var = (qu0) pu0Var;
            String str = qu0Var.e;
            return str == null ? qu0Var.c.toString() : str;
        }
        if (pu0Var instanceof su0) {
            return ((su0) pu0Var).c.toString();
        }
        if (pu0Var instanceof ru0) {
            return pu0Var.toString();
        }
        if (pu0Var instanceof wu0) {
            return ((wu0) pu0Var).c;
        }
        if (pu0Var instanceof uu0) {
            return ((uu0) pu0Var).c;
        }
        if (pu0Var instanceof yu0) {
            return ((yu0) pu0Var).c;
        }
        if (pu0Var instanceof vu0) {
            return ((vu0) pu0Var).c;
        }
        Z3383101362411723454.g();
        return null;
    }

    public static final native void e(W4445408150576281555 w4445408150576281555, F6942723054099263096 f6942723054099263096, V4617472272554968715 v4617472272554968715, int i2);

    public static final Z7022156542152740569 f() {
        Z7022156542152740569 z7022156542152740569 = i;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Filled.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 d2 = G11450220448113054352.d(12.0f, 4.5f);
        d2.d(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
        d2.e(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        d2.o(9.27f, -3.11f, 11.0f, -7.5f);
        d2.e(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        d2.c();
        d2.j(12.0f, 17.0f);
        d2.e(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        d2.o(2.24f, -5.0f, 5.0f, -5.0f);
        d2.o(5.0f, 2.24f, 5.0f, 5.0f);
        d2.o(-2.24f, 5.0f, -5.0f, 5.0f);
        d2.c();
        d2.j(12.0f, 9.0f);
        d2.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        d2.o(1.34f, 3.0f, 3.0f, 3.0f);
        d2.o(3.0f, -1.34f, 3.0f, -3.0f);
        d2.o(-1.34f, -3.0f, -3.0f, -3.0f);
        d2.c();
        Q17593287602150918564.a(q17593287602150918564, d2.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        i = b2;
        return b2;
    }

    public static final boolean g(R6653624393204003746 r6653624393204003746) {
        E10198359844879945462 k = r6653624393204003746.k();
        return k.a.c(D10671166500636893138.B);
    }

    public static final boolean h(L9852841107405549527 l9852841107405549527, boolean z) {
        B1029012102904255937 c2;
        I2076339260272013590 i2076339260272013590 = l9852841107405549527.d;
        if (i2076339260272013590 == null || (c2 = i2076339260272013590.c()) == null) {
            return false;
        }
        return M18113111391818111737.C(l9852841107405549527.j(z), M18113111391818111737.T(c2));
    }

    public static long i(long j, B3798966058357121240 b3798966058357121240, O9176062718639849859 o9176062718639849859) {
        long d2;
        int i2 = F12478849263529740365.c;
        long a2 = b3798966058357121240.a((int) (j >> 32), true);
        long a3 = F12478849263529740365.d(j) ? a2 : b3798966058357121240.a((int) (j & 4294967295L), true);
        R7332211110819204002 r7332211110819204002 = null;
        R7332211110819204002 r73322111108192040022 = o9176062718639849859 != null ? o9176062718639849859.a : null;
        if (F12478849263529740365.d(j)) {
            r7332211110819204002 = r73322111108192040022;
        } else if (o9176062718639849859 != null) {
            r7332211110819204002 = o9176062718639849859.b;
        }
        if (r73322111108192040022 != null && !F12478849263529740365.d(a2)) {
            int ordinal = r73322111108192040022.ordinal();
            if (ordinal == 0) {
                int i3 = (int) (a2 >> 32);
                a2 = T1335862270807194835.d(i3, i3);
            } else {
                if (ordinal != 1) {
                    Z3383101362411723454.g();
                    return 0L;
                }
                int i4 = (int) (a2 & 4294967295L);
                a2 = T1335862270807194835.d(i4, i4);
            }
        }
        if (r7332211110819204002 != null && !F12478849263529740365.d(a3)) {
            int ordinal2 = r7332211110819204002.ordinal();
            if (ordinal2 == 0) {
                int i5 = (int) (a3 >> 32);
                d2 = T1335862270807194835.d(i5, i5);
            } else {
                if (ordinal2 != 1) {
                    Z3383101362411723454.g();
                    return 0L;
                }
                int i6 = (int) (a3 & 4294967295L);
                d2 = T1335862270807194835.d(i6, i6);
            }
            a3 = d2;
        }
        int min = Math.min(F12478849263529740365.g(a2), F12478849263529740365.g(a3));
        int max = Math.max(F12478849263529740365.f(a2), F12478849263529740365.f(a3));
        return F12478849263529740365.h(j) ? T1335862270807194835.d(max, min) : T1335862270807194835.d(min, max);
    }

    public static final native boolean j(JSONObject jSONObject);

    public static final native boolean k(JSONArray jSONArray);

    public static final native boolean l(boolean z, S17255966974483065294 s17255966974483065294, T10320069907180517450 t10320069907180517450, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k("Cannot return null from a non-@Nullable @Provides method");
    }
}
