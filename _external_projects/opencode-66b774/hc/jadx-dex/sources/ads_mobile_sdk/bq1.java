package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bq1 {
    public final android.content.Context a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final ads_mobile_sdk.g0 c;
    public final ads_mobile_sdk.dj0 d;

    public bq1(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.dj0 dj0Var) {
        context.getClass();
        w5797197595347441198.getClass();
        g0Var.getClass();
        dj0Var.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = g0Var;
        this.d = dj0Var;
    }

    public final void a(ads_mobile_sdk.tx0 tx0Var) {
        android.view.Display displayH;
        ads_mobile_sdk.dj0 dj0Var = this.d;
        android.content.Context context = this.a;
        android.content.Context contextC = dj0Var.c(context);
        android.content.Context contextC2 = dj0Var.c(context);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                displayH = dev.epro.r0.I2796715180830478750.h(contextC2);
            } catch (java.lang.Exception e) {
                e.getMessage();
                displayH = dj0Var.b(contextC2).getDefaultDisplay();
            }
        } else {
            displayH = dj0Var.b(contextC2).getDefaultDisplay();
        }
        if (displayH == null) {
            return;
        }
        int rotation = displayH.getRotation();
        android.util.DisplayMetrics displayMetricsD = dev.epro.r0.E10717724117948616506.d(contextC);
        float f = displayMetricsD.density;
        float f2 = displayMetricsD.widthPixels;
        android.util.DisplayMetrics displayMetrics = contextC.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int iZ = dev.epro.r0.T18016951143603335921.Z(f2 / displayMetrics.density);
        float f3 = displayMetricsD.heightPixels;
        android.util.DisplayMetrics displayMetrics2 = contextC.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int iZ2 = dev.epro.r0.T18016951143603335921.Z(f3 / displayMetrics2.density);
        android.app.Activity activityB = this.c.b();
        dev.epro.r0.H9390398899829886498 h9390398899829886498G = activityB != null ? dev.epro.r0.E10717724117948616506.g(activityB) : new dev.epro.r0.H9390398899829886498(new java.lang.Integer(iZ), new java.lang.Integer(iZ2));
        int iIntValue = ((java.lang.Number) h9390398899829886498G.a).intValue();
        int iIntValue2 = ((java.lang.Number) h9390398899829886498G.b).intValue();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.s("width", new java.lang.Integer(iZ));
        i16631908410500040363.s("height", new java.lang.Integer(iZ2));
        i16631908410500040363.s("maxSizeWidth", new java.lang.Integer(iIntValue));
        i16631908410500040363.s("maxSizeHeight", new java.lang.Integer(iIntValue2));
        i16631908410500040363.s("density", new java.lang.Double(f));
        i16631908410500040363.s("rotation", new java.lang.Integer(rotation));
        dev.epro.r0.R7033599853981556291.E(this.b, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, null, (byte) 0), 3);
    }

    public static java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.lang.String str, java.lang.String str2, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.t("action", str2);
        i16631908410500040363.t("message", str);
        java.lang.Object objA = tx0Var.a(i16631908410500040363, "onError", r14062301455140331524);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    public static java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, int i, int i2, int i3, int i4, ads_mobile_sdk.nr1 nr1Var) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.s("x", new java.lang.Integer(i));
        i16631908410500040363.s("y", new java.lang.Integer(i2));
        i16631908410500040363.s("width", new java.lang.Integer(i3));
        i16631908410500040363.s("height", new java.lang.Integer(i4));
        java.lang.Object objA = tx0Var.a(i16631908410500040363, "onSizeChanged", nr1Var);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }
}
