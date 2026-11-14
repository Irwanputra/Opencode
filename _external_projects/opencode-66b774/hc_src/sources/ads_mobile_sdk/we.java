package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import android.view.WindowMetrics;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.K9808832422180718119;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.V10300877997588547986;
import dev.epro.r0.X2485016533998461232;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class we {
    public final Context a;
    public final O16637889491137121389 b;
    public final fz c;
    public final hs d;
    public final jr0 e;
    public final K12714355155332733186 g;
    public final xj h;
    public final fi0 i;
    public final kv0 j;

    public we(Context context, b41 b41Var, String str, String str2, O16637889491137121389 o16637889491137121389, fz fzVar, hs hsVar, jr0 jr0Var, dj0 dj0Var, K12714355155332733186 k12714355155332733186, xj xjVar, fi0 fi0Var) {
        Rect rect;
        PackageInfo packageInfo;
        WindowMetrics maximumWindowMetrics;
        context.getClass();
        b41Var.getClass();
        str.getClass();
        str2.getClass();
        o16637889491137121389.getClass();
        fzVar.getClass();
        hsVar.getClass();
        jr0Var.getClass();
        dj0Var.getClass();
        k12714355155332733186.getClass();
        xjVar.getClass();
        fi0Var.getClass();
        this.a = context;
        this.b = o16637889491137121389;
        this.c = fzVar;
        this.d = hsVar;
        this.e = jr0Var;
        this.g = k12714355155332733186;
        this.h = xjVar;
        this.i = fi0Var;
        WindowManager b = dj0Var.b(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            maximumWindowMetrics = b.getMaximumWindowMetrics();
            rect = maximumWindowMetrics.getBounds();
        } else {
            Rect rect2 = new Rect();
            b.getDefaultDisplay().getRectSize(rect2);
            rect = rect2;
        }
        rect.getClass();
        PackageManager packageManager = context.getPackageManager();
        String str3 = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) == null || (str3 = packageInfo.versionName) == null) ? "" : str3;
        K9808832422180718119 p = kv0.p();
        p.getClass();
        p.b();
        ((kv0) p.b).o("CUI_NAME_ANR_DETECTED");
        p.b();
        kv0 kv0Var = (kv0) p.b;
        kv0Var.getClass();
        kv0Var.os_ = X2485016533998461232.c(2);
        String str4 = Build.VERSION.RELEASE;
        str4.getClass();
        str4.getClass();
        p.b();
        ((kv0) p.b).p$1();
        String str5 = Build.MODEL;
        str5.getClass();
        str5.getClass();
        p.b();
        ((kv0) p.b).j(str5);
        p.b();
        ((kv0) p.b).targetVersion_ = i;
        p.b();
        ((kv0) p.b).t(str2);
        p.b();
        ((kv0) p.b).d(str);
        String packageName = context.getPackageName();
        packageName.getClass();
        p.b();
        ((kv0) p.b).f(packageName);
        p.b();
        ((kv0) p.b).g(str3);
        V10300877997588547986 a = b41Var.a();
        String str6 = a != null ? (String) a.b : "";
        p.b();
        ((kv0) p.b).e(str6);
        String country = Locale.getDefault().getCountry();
        country.getClass();
        p.b();
        ((kv0) p.b).i(country);
        int width = rect.width();
        p.b();
        ((kv0) p.b).displayWidth_ = width;
        int height = rect.height();
        p.b();
        ((kv0) p.b).displayHeight_ = height;
        this.j = (kv0) p.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x028d A[LOOP:1: B:26:0x0287->B:28:0x028d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e8 A[LOOP:3: B:42:0x02e2->B:44:0x02e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0367 A[LOOP:4: B:47:0x0361->B:49:0x0367, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c2 A[LOOP:6: B:63:0x03bc->B:65:0x03c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x052f A[LOOP:8: B:91:0x052d->B:92:0x052f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0547  */
    /* JADX WARN: Type inference failed for: r7v0, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ads_mobile_sdk.km1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.we.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
