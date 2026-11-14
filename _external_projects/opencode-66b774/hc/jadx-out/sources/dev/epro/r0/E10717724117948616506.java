package dev.epro.r0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class E10717724117948616506 {
    public static Z7022156542152740569 a;
    public static Z7022156542152740569 b;

    static {
        izmyclvb.oeynnivvrnts0(830);
    }

    public static final native void a(int i, X11638668447546090163 x11638668447546090163, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, boolean z, boolean z2, boolean z3);

    public static int b(int i, List list) {
        return G6547577305291411977.h(i, 31, list);
    }

    public static Rect c(Context context, Rect rect) {
        int iZ = T18016951143603335921.Z(rect.left / d(context).density);
        float f = rect.top;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int iZ2 = T18016951143603335921.Z(f / displayMetrics.density);
        float f2 = rect.right;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int iZ3 = T18016951143603335921.Z(f2 / displayMetrics2.density);
        float f3 = rect.bottom;
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        return new Rect(iZ, iZ2, iZ3, T18016951143603335921.Z(f3 / displayMetrics3.density));
    }

    public static DisplayMetrics d(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    public static H9390398899829886498 e(Activity activity) {
        Window window = activity.getWindow();
        View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
        H9390398899829886498 h9390398899829886498 = viewFindViewById != null ? new H9390398899829886498(Integer.valueOf(viewFindViewById.getTop()), Integer.valueOf(viewFindViewById.getBottom())) : new H9390398899829886498(0, 0);
        int iIntValue = ((Number) h9390398899829886498.a).intValue();
        int iIntValue2 = ((Number) h9390398899829886498.b).intValue();
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        Integer numValueOf = Integer.valueOf(T18016951143603335921.Z(iIntValue / displayMetrics.density));
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        return new H9390398899829886498(numValueOf, Integer.valueOf(T18016951143603335921.Z(iIntValue2 / displayMetrics2.density)));
    }

    public static int f(Context context, int i) {
        context.getClass();
        return T18016951143603335921.Z(i / d(context).density);
    }

    public static H9390398899829886498 g(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
        H9390398899829886498 h9390398899829886498 = viewFindViewById != null ? new H9390398899829886498(Integer.valueOf(viewFindViewById.getWidth()), Integer.valueOf(viewFindViewById.getHeight())) : new H9390398899829886498(0, 0);
        int iIntValue = ((Number) h9390398899829886498.a).intValue();
        int iIntValue2 = ((Number) h9390398899829886498.b).intValue();
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        Integer numValueOf = Integer.valueOf(T18016951143603335921.Z(iIntValue / displayMetrics.density));
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        return new H9390398899829886498(numValueOf, Integer.valueOf(T18016951143603335921.Z(iIntValue2 / displayMetrics2.density)));
    }

    public static final long h(N1420218926656397722 n1420218926656397722, D2717688760023469083 d2717688760023469083, I12071840179596922896 i12071840179596922896, long j) {
        long j2;
        long jN = d2717688760023469083.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && n1420218926656397722.d().c.length() != 0) {
            long j3 = n1420218926656397722.d().d;
            V8323072410254082725 v8323072410254082725L = d2717688760023469083.l();
            int i = v8323072410254082725L == null ? -1 : V7613669981225271275.a[v8323072410254082725L.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = F12478849263529740365.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        Z3383101362411723454.g();
                        return 0L;
                    }
                    int i3 = F12478849263529740365.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                Q17957571128037780363 q17957571128037780363C = i12071840179596922896.c();
                if (q17957571128037780363C != null) {
                    V11538895333762958192 v11538895333762958192 = q17957571128037780363C.b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iD = v11538895333762958192.d(i4);
                    float f = q17957571128037780363C.f(iD);
                    float fG = q17957571128037780363C.g(iD);
                    float fP = W7808703833045379622.p(fIntBitsToFloat, Math.min(f, fG), Math.max(f, fG));
                    if (Q13254524308163418711.a(j, 0L) || Math.abs(fIntBitsToFloat - fP) <= ((int) (j >> 32)) / 2) {
                        float f2 = v11538895333762958192.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((v11538895333762958192.b(iD) - f2) / 2.0f) + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fP)) << 32);
                        B1029012102904255937 b1029012102904255937E = i12071840179596922896.e();
                        L2216691091636065972 l2216691091636065972 = null;
                        if (b1029012102904255937E != null) {
                            if (!b1029012102904255937E.C()) {
                                b1029012102904255937E = null;
                            }
                            if (b1029012102904255937E != null) {
                                jFloatToRawIntBits = V4416135141588678913.i(jFloatToRawIntBits, M18113111391818111737.T(b1029012102904255937E));
                            }
                        }
                        B1029012102904255937 b1029012102904255937E2 = i12071840179596922896.e();
                        if (b1029012102904255937E2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!b1029012102904255937E2.C()) {
                            b1029012102904255937E2 = null;
                        }
                        if (b1029012102904255937E2 == null) {
                            return jFloatToRawIntBits;
                        }
                        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) i12071840179596922896.d.getValue();
                        if (b1029012102904255937 != null) {
                            if (!b1029012102904255937.C()) {
                                b1029012102904255937 = null;
                            }
                            if (b1029012102904255937 != null) {
                                l2216691091636065972 = new L2216691091636065972(b1029012102904255937.r(b1029012102904255937E2, jFloatToRawIntBits));
                            }
                        }
                        return l2216691091636065972 != null ? l2216691091636065972.a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final S6349823729575121924 i(R15896830329318850690 r15896830329318850690, boolean z, boolean z2) {
        if (!r15896830329318850690.a.n) {
            return S6349823729575121924.e;
        }
        if (z) {
            return R7033599853981556291.P(r15896830329318850690, 8).B1();
        }
        Y4989033692226475498 y4989033692226475498P = R7033599853981556291.P(r15896830329318850690, 8);
        return V12319504402545346730.z(y4989033692226475498P).E(y4989033692226475498P, z2);
    }

    public static final Object j(G5610643384273062965 g5610643384273062965, String str, K14749510448791472029 k14749510448791472029) {
        Object objA = g5610643384273062965.a(str, new S11108027743417284456((byte) 24), k14749510448791472029);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    public static final J5715778638296486773 k(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(net.zetetic.database.R.id.view_tree_view_model_store_owner);
            J5715778638296486773 j5715778638296486773 = tag instanceof J5715778638296486773 ? (J5715778638296486773) tag : null;
            if (j5715778638296486773 != null) {
                return j5715778638296486773;
            }
            Object objG = P13747563277035175218.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final Z7022156542152740569 l() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Remove", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new K11581048818582425500(19.0f, 13.0f));
        arrayList.add(new D17019851967677288206(5.0f));
        arrayList.add(new I13705132866148191069(-2.0f));
        arrayList.add(new B7853650354552420046(14.0f));
        arrayList.add(new I13705132866148191069(2.0f));
        arrayList.add(G18244342923164738699.c);
        Q17593287602150918564.a(q17593287602150918564, arrayList, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 m() {
        Z7022156542152740569 z7022156542152740569 = b;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.SaveAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 12.0f);
        v14323974914327418545.s(7.0f);
        v14323974914327418545.h(5.0f, 19.0f);
        v14323974914327418545.s(-7.0f);
        v14323974914327418545.h(3.0f, 12.0f);
        v14323974914327418545.s(7.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545.g(14.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.s(-7.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(13.0f, 12.67f);
        v14323974914327418545.i(2.59f, -2.58f);
        v14323974914327418545.h(17.0f, 11.5f);
        v14323974914327418545.i(-5.0f, 5.0f);
        v14323974914327418545.i(-5.0f, -5.0f);
        v14323974914327418545.i(1.41f, -1.41f);
        v14323974914327418545.h(11.0f, 12.67f);
        v14323974914327418545.h(11.0f, 3.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(9.67f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        b = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final void n(T11401768751197276141 t11401768751197276141) {
        R7033599853981556291.R(t11401768751197276141).F();
    }

    public static final native Object o(W4445408150576281555 w4445408150576281555, JSONObject jSONObject, I18324398817215695651 i18324398817215695651, P2881760482579526509 p2881760482579526509, K14749510448791472029 k14749510448791472029);

    public static final native int p(String str);

    public static void q(int i, int i2) {
        String strT;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strT = O14838623545224379975.t("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strT = O14838623545224379975.t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strT);
        }
    }

    public static void r(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? s(i, i3, "start index") : (i2 < 0 || i2 > i3) ? s(i2, i3, "end index") : O14838623545224379975.t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String s(int i, int i2, String str) {
        if (i < 0) {
            return O14838623545224379975.t("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return O14838623545224379975.t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
