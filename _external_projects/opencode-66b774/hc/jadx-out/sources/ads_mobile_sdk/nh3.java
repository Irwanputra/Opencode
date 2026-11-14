package ads_mobile_sdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.S1392253949846343516;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class nh3 implements S1392253949846343516 {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public final O16637889491137121389 i;
    public final long j;

    public nh3(O16637889491137121389 o16637889491137121389) {
        this.i = o16637889491137121389;
        o16637889491137121389.getClass();
        this.j = SystemClock.uptimeMillis();
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final synchronized void a(HashMap map, Context context, View view) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics;
        try {
            this.d = this.c;
            this.i.getClass();
            this.c = SystemClock.uptimeMillis();
            long j = this.e;
            if (j != -1) {
                this.f = j;
            }
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics2);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics2);
                }
                displayMetrics = displayMetrics2;
            } else {
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f && (!view.isShown() || view.getGlobalVisibleRect(new Rect()))) {
                    int iMin = Math.min(view.getHeight(), displayMetrics.heightPixels) * Math.min(view.getWidth(), displayMetrics.widthPixels);
                    if (iMin * 2 >= i || (iMin == 0 && a(view))) {
                        this.e = this.c;
                    }
                }
                c(map);
            }
            this.e = -1L;
            c(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final synchronized void b(HashMap map) {
        this.h = this.g;
        this.i.getClass();
        this.g = SystemClock.uptimeMillis();
        c(map);
    }

    public final void c(HashMap map) {
        map.put("tcq", Long.valueOf(this.a));
        map.put("tpq", Long.valueOf(this.b));
        map.put("tcc", Long.valueOf(this.g));
        map.put("tpc", Long.valueOf(this.h));
        map.put("tpv", Long.valueOf(this.d));
        map.put("tcv", Long.valueOf(this.c));
        map.put("tchv", Long.valueOf(this.e));
        map.put("tphv", Long.valueOf(this.f));
        map.put("tst", Long.valueOf(this.j));
    }

    public static View b(View view) {
        return view.getClass().getName().contains("DebugGestureViewWrapper") ? ((ViewGroup) view).getChildAt(0) : view;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final synchronized void a(HashMap map) {
        this.b = this.a;
        this.i.getClass();
        this.a = SystemClock.uptimeMillis();
        c(map);
    }

    public static boolean a(View view) {
        try {
            View viewB = b(view);
            Object objInvoke = viewB.getClass().getMethod("getAdConfiguration", null).invoke(viewB, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.getClass();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }
}
