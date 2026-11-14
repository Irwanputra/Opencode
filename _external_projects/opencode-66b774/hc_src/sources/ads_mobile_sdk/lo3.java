package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.Y4798753258822141670;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class lo3 implements Y4798753258822141670 {
    public final Context a;
    public final g0 b;

    public lo3(Context context, g0 g0Var) {
        context.getClass();
        g0Var.getClass();
        this.a = context;
        this.b = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        r3 = r3.getCurrentWindowMetrics();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[RETURN] */
    @Override // dev.epro.r0.Y4798753258822141670
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r4, java.util.Map r5, dev.epro.r0.R4833348786910499294 r6) {
        /*
            r3 = this;
            dev.epro.r0.I16631908410500040363 r5 = new dev.epro.r0.I16631908410500040363
            r5.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r4.getLocationInWindow(r0)
            r1 = 0
            r1 = r0[r1]
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            java.lang.String r1 = "xInPixels"
            r5.s(r1, r2)
            r1 = 1
            r0 = r0[r1]
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "yInPixels"
            r5.s(r0, r1)
            ads_mobile_sdk.g0 r0 = r3.b
            android.app.Activity r0 = r0.b()
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            android.content.Context r0 = r3.a
        L30:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            java.lang.Class<android.view.WindowManager> r2 = android.view.WindowManager.class
            if (r3 < r1) goto L58
            java.lang.Object r3 = r0.getSystemService(r2)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            if (r3 == 0) goto L94
            android.view.WindowMetrics r3 = dev.epro.r0.I2796715180830478750.l(r3)
            if (r3 != 0) goto L47
            goto L94
        L47:
            android.graphics.Rect r0 = dev.epro.r0.F11474578038339593445.d(r3)
            int r0 = r0.width()
            android.graphics.Rect r3 = dev.epro.r0.F11474578038339593445.d(r3)
            int r3 = r3.height()
            goto L75
        L58:
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L6a
            android.view.Display r0 = r0.getDefaultDisplay()
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r0 != 0) goto L6e
            goto L94
        L6e:
            r0.getMetrics(r3)
            int r0 = r3.widthPixels
            int r3 = r3.heightPixels
        L75:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "windowWidthInPixels"
            r5.s(r0, r1)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            java.lang.String r3 = "windowHeightInPixels"
            r5.s(r3, r0)
            java.lang.String r3 = "locationReady"
            java.lang.Object r3 = r4.a(r5, r3, r6)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r3 != r4) goto L94
            return r3
        L94:
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lo3.a(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 24;
    }
}
