package ads_mobile_sdk;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.S1392253949846343516;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (a(r8) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:3:0x0001, B:5:0x0018, B:6:0x001e, B:8:0x0024, B:14:0x009c, B:15:0x009e, B:20:0x004b, B:23:0x0053, B:25:0x0059, B:28:0x0063, B:30:0x0069, B:33:0x0075, B:36:0x0097, B:38:0x0091, B:40:0x002b, B:42:0x0037, B:44:0x0040, B:47:0x0044), top: B:2:0x0001, inners: #0 }] */
    @Override // dev.epro.r0.S1392253949846343516
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.util.HashMap r6, android.content.Context r7, android.view.View r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.c     // Catch: java.lang.Throwable -> L1b
            r5.d = r0     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.O16637889491137121389 r0 = r5.i     // Catch: java.lang.Throwable -> L1b
            r0.getClass()     // Catch: java.lang.Throwable -> L1b
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L1b
            r5.c = r0     // Catch: java.lang.Throwable -> L1b
            long r0 = r5.e     // Catch: java.lang.Throwable -> L1b
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1e
            r5.f = r0     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r6 = move-exception
            goto La3
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r1 = 33
            if (r0 < r1) goto L2b
            boolean r0 = dev.epro.r0.R10617406068291706632.t(r7)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L1b
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L37
        L35:
            r7 = 0
            goto L48
        L37:
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Throwable -> L1b
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            r7.getRealMetrics(r0)     // Catch: java.lang.Throwable -> L1b java.lang.NoSuchMethodError -> L44
            goto L47
        L44:
            r7.getMetrics(r0)     // Catch: java.lang.Throwable -> L1b
        L47:
            r7 = r0
        L48:
            if (r7 != 0) goto L4b
            goto L9c
        L4b:
            int r0 = r7.widthPixels     // Catch: java.lang.Throwable -> L1b
            int r1 = r7.heightPixels     // Catch: java.lang.Throwable -> L1b
            int r0 = r0 * r1
            if (r8 != 0) goto L53
            goto L9c
        L53:
            int r1 = r8.getVisibility()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L9c
            float r1 = r8.getAlpha()     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L63
            goto L9c
        L63:
            boolean r1 = r8.isShown()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L75
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r8.getGlobalVisibleRect(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L75
            goto L9c
        L75:
            int r1 = r8.getWidth()     // Catch: java.lang.Throwable -> L1b
            int r4 = r7.widthPixels     // Catch: java.lang.Throwable -> L1b
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L1b
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L1b
            int r7 = r7.heightPixels     // Catch: java.lang.Throwable -> L1b
            int r7 = java.lang.Math.min(r4, r7)     // Catch: java.lang.Throwable -> L1b
            int r7 = r7 * r1
            int r1 = r7 * 2
            if (r1 < r0) goto L8f
            goto L97
        L8f:
            if (r7 != 0) goto L9c
            boolean r7 = a(r8)     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L9c
        L97:
            long r7 = r5.c     // Catch: java.lang.Throwable -> L1b
            r5.e = r7     // Catch: java.lang.Throwable -> L1b
            goto L9e
        L9c:
            r5.e = r2     // Catch: java.lang.Throwable -> L1b
        L9e:
            r5.c(r6)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r5)
            return
        La3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nh3.a(java.util.HashMap, android.content.Context, android.view.View):void");
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final synchronized void b(HashMap hashMap) {
        this.h = this.g;
        this.i.getClass();
        this.g = SystemClock.uptimeMillis();
        c(hashMap);
    }

    public final void c(HashMap hashMap) {
        hashMap.put("tcq", Long.valueOf(this.a));
        hashMap.put("tpq", Long.valueOf(this.b));
        hashMap.put("tcc", Long.valueOf(this.g));
        hashMap.put("tpc", Long.valueOf(this.h));
        hashMap.put("tpv", Long.valueOf(this.d));
        hashMap.put("tcv", Long.valueOf(this.c));
        hashMap.put("tchv", Long.valueOf(this.e));
        hashMap.put("tphv", Long.valueOf(this.f));
        hashMap.put("tst", Long.valueOf(this.j));
    }

    public static View b(View view) {
        return view.getClass().getName().contains("DebugGestureViewWrapper") ? ((ViewGroup) view).getChildAt(0) : view;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final synchronized void a(HashMap hashMap) {
        this.b = this.a;
        this.i.getClass();
        this.a = SystemClock.uptimeMillis();
        c(hashMap);
    }

    public static boolean a(View view) {
        try {
            View b = b(view);
            Object invoke = b.getClass().getMethod("getAdConfiguration", null).invoke(b, null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.getClass();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }
}
