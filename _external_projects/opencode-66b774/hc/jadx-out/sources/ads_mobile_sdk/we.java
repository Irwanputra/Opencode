package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.K9808832422180718119;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.V10300877997588547986;
import dev.epro.r0.X2485016533998461232;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
        Rect bounds;
        PackageInfo packageInfo;
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
        WindowManager windowManagerB = dj0Var.b(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            bounds = windowManagerB.getMaximumWindowMetrics().getBounds();
        } else {
            Rect rect = new Rect();
            windowManagerB.getDefaultDisplay().getRectSize(rect);
            bounds = rect;
        }
        bounds.getClass();
        PackageManager packageManager = context.getPackageManager();
        String str3 = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) == null || (str3 = packageInfo.versionName) == null) ? "" : str3;
        K9808832422180718119 k9808832422180718119P = kv0.p();
        k9808832422180718119P.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).o("CUI_NAME_ANR_DETECTED");
        k9808832422180718119P.b();
        kv0 kv0Var = (kv0) k9808832422180718119P.b;
        kv0Var.getClass();
        kv0Var.os_ = X2485016533998461232.c(2);
        String str4 = Build.VERSION.RELEASE;
        str4.getClass();
        str4.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).p$1();
        String str5 = Build.MODEL;
        str5.getClass();
        str5.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).j(str5);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).targetVersion_ = i;
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).t(str2);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).d(str);
        String packageName = context.getPackageName();
        packageName.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).f(packageName);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).g(str3);
        V10300877997588547986 v10300877997588547986A = b41Var.a();
        String str6 = v10300877997588547986A != null ? (String) v10300877997588547986A.b : "";
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).e(str6);
        String country = Locale.getDefault().getCountry();
        country.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).i(country);
        int iWidth = bounds.width();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).displayWidth_ = iWidth;
        int iHeight = bounds.height();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).displayHeight_ = iHeight;
        this.j = (kv0) k9808832422180718119P.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x052f A[LOOP:8: B:113:0x052d->B:114:0x052f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028d A[LOOP:1: B:65:0x0287->B:67:0x028d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e8 A[LOOP:3: B:75:0x02e2->B:77:0x02e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0367 A[LOOP:4: B:79:0x0361->B:81:0x0367, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c2 A[LOOP:6: B:89:0x03bc->B:91:0x03c2, LOOP_END] */
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
            Method dump skipped, instruction units count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.we.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
