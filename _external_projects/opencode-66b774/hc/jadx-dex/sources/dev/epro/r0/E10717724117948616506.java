package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E10717724117948616506 {
    public static dev.epro.r0.Z7022156542152740569 a;
    public static dev.epro.r0.Z7022156542152740569 b;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(830);
    }

    public static final native void a(int i, dev.epro.r0.X11638668447546090163 x11638668447546090163, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, dev.epro.r0.I1722681268793429505 i1722681268793429505, boolean z, boolean z2, boolean z3);

    public static int b(int i, java.util.List list) {
        return dev.epro.r0.G6547577305291411977.h(i, 31, list);
    }

    public static android.graphics.Rect c(android.content.Context context, android.graphics.Rect rect) {
        int iZ = dev.epro.r0.T18016951143603335921.Z(rect.left / d(context).density);
        float f = rect.top;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int iZ2 = dev.epro.r0.T18016951143603335921.Z(f / displayMetrics.density);
        float f2 = rect.right;
        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int iZ3 = dev.epro.r0.T18016951143603335921.Z(f2 / displayMetrics2.density);
        float f3 = rect.bottom;
        android.util.DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        return new android.graphics.Rect(iZ, iZ2, iZ3, dev.epro.r0.T18016951143603335921.Z(f3 / displayMetrics3.density));
    }

    public static android.util.DisplayMetrics d(android.content.Context context) {
        context.getClass();
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    public static dev.epro.r0.H9390398899829886498 e(android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        android.view.View viewFindViewById = window != null ? window.findViewById(android.R.id.content) : null;
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = viewFindViewById != null ? new dev.epro.r0.H9390398899829886498(java.lang.Integer.valueOf(viewFindViewById.getTop()), java.lang.Integer.valueOf(viewFindViewById.getBottom())) : new dev.epro.r0.H9390398899829886498(0, 0);
        int iIntValue = ((java.lang.Number) h9390398899829886498.a).intValue();
        int iIntValue2 = ((java.lang.Number) h9390398899829886498.b).intValue();
        android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(iIntValue / displayMetrics.density));
        android.util.DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        return new dev.epro.r0.H9390398899829886498(numValueOf, java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(iIntValue2 / displayMetrics2.density)));
    }

    public static int f(android.content.Context context, int i) {
        context.getClass();
        return dev.epro.r0.T18016951143603335921.Z(i / d(context).density);
    }

    public static dev.epro.r0.H9390398899829886498 g(android.app.Activity activity) {
        activity.getClass();
        android.view.Window window = activity.getWindow();
        android.view.View viewFindViewById = window != null ? window.findViewById(android.R.id.content) : null;
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = viewFindViewById != null ? new dev.epro.r0.H9390398899829886498(java.lang.Integer.valueOf(viewFindViewById.getWidth()), java.lang.Integer.valueOf(viewFindViewById.getHeight())) : new dev.epro.r0.H9390398899829886498(0, 0);
        int iIntValue = ((java.lang.Number) h9390398899829886498.a).intValue();
        int iIntValue2 = ((java.lang.Number) h9390398899829886498.b).intValue();
        android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(iIntValue / displayMetrics.density));
        android.util.DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        return new dev.epro.r0.H9390398899829886498(numValueOf, java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(iIntValue2 / displayMetrics2.density)));
    }

    public static final long h(dev.epro.r0.N1420218926656397722 n1420218926656397722, dev.epro.r0.D2717688760023469083 d2717688760023469083, dev.epro.r0.I12071840179596922896 i12071840179596922896, long j) {
        long j2;
        long jN = d2717688760023469083.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && n1420218926656397722.d().c.length() != 0) {
            long j3 = n1420218926656397722.d().d;
            dev.epro.r0.V8323072410254082725 v8323072410254082725L = d2717688760023469083.l();
            int i = v8323072410254082725L == null ? -1 : dev.epro.r0.V7613669981225271275.a[v8323072410254082725L.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = dev.epro.r0.F12478849263529740365.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        dev.epro.r0.Z3383101362411723454.g();
                        return 0L;
                    }
                    int i3 = dev.epro.r0.F12478849263529740365.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                dev.epro.r0.Q17957571128037780363 q17957571128037780363C = i12071840179596922896.c();
                if (q17957571128037780363C != null) {
                    dev.epro.r0.V11538895333762958192 v11538895333762958192 = q17957571128037780363C.b;
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jN >> 32));
                    int iD = v11538895333762958192.d(i4);
                    float f = q17957571128037780363C.f(iD);
                    float fG = q17957571128037780363C.g(iD);
                    float fP = dev.epro.r0.W7808703833045379622.p(fIntBitsToFloat, java.lang.Math.min(f, fG), java.lang.Math.max(f, fG));
                    if (dev.epro.r0.Q13254524308163418711.a(j, 0L) || java.lang.Math.abs(fIntBitsToFloat - fP) <= ((int) (j >> 32)) / 2) {
                        float f2 = v11538895333762958192.f(iD);
                        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(((v11538895333762958192.b(iD) - f2) / 2.0f) + f2)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(fP)) << 32);
                        dev.epro.r0.B1029012102904255937 b1029012102904255937E = i12071840179596922896.e();
                        dev.epro.r0.L2216691091636065972 l2216691091636065972 = null;
                        if (b1029012102904255937E != null) {
                            if (!b1029012102904255937E.C()) {
                                b1029012102904255937E = null;
                            }
                            if (b1029012102904255937E != null) {
                                jFloatToRawIntBits = dev.epro.r0.V4416135141588678913.i(jFloatToRawIntBits, dev.epro.r0.M18113111391818111737.T(b1029012102904255937E));
                            }
                        }
                        dev.epro.r0.B1029012102904255937 b1029012102904255937E2 = i12071840179596922896.e();
                        if (b1029012102904255937E2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!b1029012102904255937E2.C()) {
                            b1029012102904255937E2 = null;
                        }
                        if (b1029012102904255937E2 == null) {
                            return jFloatToRawIntBits;
                        }
                        dev.epro.r0.B1029012102904255937 b1029012102904255937 = (dev.epro.r0.B1029012102904255937) i12071840179596922896.d.getValue();
                        if (b1029012102904255937 != null) {
                            if (!b1029012102904255937.C()) {
                                b1029012102904255937 = null;
                            }
                            if (b1029012102904255937 != null) {
                                l2216691091636065972 = new dev.epro.r0.L2216691091636065972(b1029012102904255937.r(b1029012102904255937E2, jFloatToRawIntBits));
                            }
                        }
                        return l2216691091636065972 != null ? l2216691091636065972.a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final dev.epro.r0.S6349823729575121924 i(dev.epro.r0.R15896830329318850690 r15896830329318850690, boolean z, boolean z2) {
        if (!r15896830329318850690.a.n) {
            return dev.epro.r0.S6349823729575121924.e;
        }
        if (z) {
            return dev.epro.r0.R7033599853981556291.P(r15896830329318850690, 8).B1();
        }
        dev.epro.r0.B1029012102904255937 b1029012102904255937P = dev.epro.r0.R7033599853981556291.P(r15896830329318850690, 8);
        return dev.epro.r0.V12319504402545346730.z(b1029012102904255937P).E(b1029012102904255937P, z2);
    }

    public static final java.lang.Object j(dev.epro.r0.G5610643384273062965 g5610643384273062965, java.lang.String str, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        java.lang.Object objA = g5610643384273062965.a(str, new dev.epro.r0.S11108027743417284456((byte) 24), k14749510448791472029);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    public static final dev.epro.r0.J5715778638296486773 k(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(2131296820);
            dev.epro.r0.J5715778638296486773 j5715778638296486773 = tag instanceof dev.epro.r0.J5715778638296486773 ? (dev.epro.r0.J5715778638296486773) tag : null;
            if (j5715778638296486773 != null) {
                return j5715778638296486773;
            }
            java.lang.Object objG = dev.epro.r0.P13747563277035175218.g(view);
            view = objG instanceof android.view.View ? (android.view.View) objG : null;
        }
        return null;
    }

    public static final dev.epro.r0.Z7022156542152740569 l() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.Remove", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        java.util.ArrayList arrayList = new java.util.ArrayList(32);
        arrayList.add(new dev.epro.r0.K11581048818582425500(19.0f, 13.0f));
        arrayList.add(new dev.epro.r0.D17019851967677288206(5.0f));
        arrayList.add(new dev.epro.r0.I13705132866148191069(-2.0f));
        arrayList.add(new dev.epro.r0.B7853650354552420046(14.0f));
        arrayList.add(new dev.epro.r0.I13705132866148191069(2.0f));
        arrayList.add(dev.epro.r0.G18244342923164738699.c);
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, arrayList, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final dev.epro.r0.Z7022156542152740569 m() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = b;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.SaveAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545 = new dev.epro.r0.V14323974914327418545((byte) 3);
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
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        b = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final void n(dev.epro.r0.T11401768751197276141 t11401768751197276141) {
        dev.epro.r0.R7033599853981556291.R(t11401768751197276141).F();
    }

    public static final native java.lang.Object o(dev.epro.r0.W4445408150576281555 w4445408150576281555, org.json.JSONObject jSONObject, dev.epro.r0.I18324398817215695651 i18324398817215695651, dev.epro.r0.P2881760482579526509 p2881760482579526509, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public static final native int p(java.lang.String str);

    public static void q(int i, int i2) {
        java.lang.String strT;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strT = dev.epro.r0.O14838623545224379975.t("%s (%s) must not be negative", new java.lang.Object[]{"index", java.lang.Integer.valueOf(i)});
            } else {
                if (i2 < 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                strT = dev.epro.r0.O14838623545224379975.t("%s (%s) must be less than size (%s)", new java.lang.Object[]{"index", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
            }
            throw new java.lang.IndexOutOfBoundsException(strT);
        }
    }

    public static void r(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException((i < 0 || i > i3) ? s(i, i3, "start index") : (i2 < 0 || i2 > i3) ? s(i2, i3, "end index") : dev.epro.r0.O14838623545224379975.t("end index (%s) must not be less than start index (%s)", new java.lang.Object[]{java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)}));
        }
    }

    public static java.lang.String s(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return dev.epro.r0.O14838623545224379975.t("%s (%s) must not be negative", new java.lang.Object[]{str, java.lang.Integer.valueOf(i)});
        }
        if (i2 >= 0) {
            return dev.epro.r0.O14838623545224379975.t("%s (%s) must not be greater than size (%s)", new java.lang.Object[]{str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
