package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import dev.epro.r0.E10717724117948616506;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.T18016951143603335921;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bq1 {
    public final Context a;
    public final W5797197595347441198 b;
    public final g0 c;
    public final dj0 d;

    public bq1(Context context, W5797197595347441198 w5797197595347441198, g0 g0Var, dj0 dj0Var) {
        context.getClass();
        w5797197595347441198.getClass();
        g0Var.getClass();
        dj0Var.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = g0Var;
        this.d = dj0Var;
    }

    public final void a(tx0 tx0Var) {
        Display display;
        dj0 dj0Var = this.d;
        Context context = this.a;
        Context contextC = dj0Var.c(context);
        Context contextC2 = dj0Var.c(context);
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                display = contextC2.getDisplay();
            } catch (Exception e) {
                e.getMessage();
                display = dj0Var.b(contextC2).getDefaultDisplay();
            }
        } else {
            display = dj0Var.b(contextC2).getDefaultDisplay();
        }
        if (display == null) {
            return;
        }
        int rotation = display.getRotation();
        DisplayMetrics displayMetricsD = E10717724117948616506.d(contextC);
        float f = displayMetricsD.density;
        float f2 = displayMetricsD.widthPixels;
        DisplayMetrics displayMetrics = contextC.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int iZ = T18016951143603335921.Z(f2 / displayMetrics.density);
        float f3 = displayMetricsD.heightPixels;
        DisplayMetrics displayMetrics2 = contextC.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int iZ2 = T18016951143603335921.Z(f3 / displayMetrics2.density);
        Activity activityB = this.c.b();
        H9390398899829886498 h9390398899829886498G = activityB != null ? E10717724117948616506.g(activityB) : new H9390398899829886498(new Integer(iZ), new Integer(iZ2));
        int iIntValue = ((Number) h9390398899829886498G.a).intValue();
        int iIntValue2 = ((Number) h9390398899829886498G.b).intValue();
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.s("width", new Integer(iZ));
        i16631908410500040363.s("height", new Integer(iZ2));
        i16631908410500040363.s("maxSizeWidth", new Integer(iIntValue));
        i16631908410500040363.s("maxSizeHeight", new Integer(iIntValue2));
        i16631908410500040363.s("density", new Double(f));
        i16631908410500040363.s("rotation", new Integer(rotation));
        R7033599853981556291.E(this.b, null, null, new aq1(tx0Var, i16631908410500040363, null, (byte) 0), 3);
    }

    public static Object a(tx0 tx0Var, String str, String str2, R14062301455140331524 r14062301455140331524) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("action", str2);
        i16631908410500040363.t("message", str);
        Object objA = tx0Var.a(i16631908410500040363, "onError", r14062301455140331524);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    public static Object a(tx0 tx0Var, int i, int i2, int i3, int i4, nr1 nr1Var) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.s("x", new Integer(i));
        i16631908410500040363.s("y", new Integer(i2));
        i16631908410500040363.s("width", new Integer(i3));
        i16631908410500040363.s("height", new Integer(i4));
        Object objA = tx0Var.a(i16631908410500040363, "onSizeChanged", nr1Var);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }
}
