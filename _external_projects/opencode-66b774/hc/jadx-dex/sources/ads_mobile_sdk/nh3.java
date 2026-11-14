package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class nh3 implements dev.epro.r0.S1392253949846343516 {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public final dev.epro.r0.O16637889491137121389 i;
    public final long j;

    public nh3(dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        this.i = o16637889491137121389;
        o16637889491137121389.getClass();
        this.j = android.os.SystemClock.uptimeMillis();
    }

    public final synchronized void a(java.util.HashMap map, android.content.Context context, android.view.View view) {
        android.view.WindowManager windowManager;
        android.util.DisplayMetrics displayMetrics;
        try {
            this.d = this.c;
            this.i.getClass();
            this.c = android.os.SystemClock.uptimeMillis();
            long j = this.e;
            if (j != -1) {
                this.f = j;
            }
            if ((android.os.Build.VERSION.SDK_INT < 33 || dev.epro.r0.R10617406068291706632.t(context)) && (windowManager = (android.view.WindowManager) context.getSystemService("window")) != null) {
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics2);
                } catch (java.lang.NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics2);
                }
                displayMetrics = displayMetrics2;
            } else {
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f && (!view.isShown() || view.getGlobalVisibleRect(new android.graphics.Rect()))) {
                    int iMin = java.lang.Math.min(view.getHeight(), displayMetrics.heightPixels) * java.lang.Math.min(view.getWidth(), displayMetrics.widthPixels);
                    if (iMin * 2 >= i || (iMin == 0 && a(view))) {
                        this.e = this.c;
                    }
                }
                c(map);
            }
            this.e = -1L;
            c(map);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(java.util.HashMap map) {
        this.h = this.g;
        this.i.getClass();
        this.g = android.os.SystemClock.uptimeMillis();
        c(map);
    }

    public final void c(java.util.HashMap map) {
        map.put("tcq", java.lang.Long.valueOf(this.a));
        map.put("tpq", java.lang.Long.valueOf(this.b));
        map.put("tcc", java.lang.Long.valueOf(this.g));
        map.put("tpc", java.lang.Long.valueOf(this.h));
        map.put("tpv", java.lang.Long.valueOf(this.d));
        map.put("tcv", java.lang.Long.valueOf(this.c));
        map.put("tchv", java.lang.Long.valueOf(this.e));
        map.put("tphv", java.lang.Long.valueOf(this.f));
        map.put("tst", java.lang.Long.valueOf(this.j));
    }

    public static android.view.View b(android.view.View view) {
        return view.getClass().getName().contains("DebugGestureViewWrapper") ? ((android.view.ViewGroup) view).getChildAt(0) : view;
    }

    public final synchronized void a(java.util.HashMap map) {
        this.b = this.a;
        this.i.getClass();
        this.a = android.os.SystemClock.uptimeMillis();
        c(map);
    }

    public static boolean a(android.view.View view) {
        try {
            android.view.View viewB = b(view);
            java.lang.Object objInvoke = viewB.getClass().getMethod("getAdConfiguration", null).invoke(viewB, null);
            java.lang.Integer num = (java.lang.Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.getClass();
            java.lang.String str = (java.lang.String) objInvoke.getClass().getMethod("adTypeToString", java.lang.Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (java.lang.NullPointerException | java.lang.ReflectiveOperationException | java.lang.SecurityException unused) {
            return false;
        }
    }
}
