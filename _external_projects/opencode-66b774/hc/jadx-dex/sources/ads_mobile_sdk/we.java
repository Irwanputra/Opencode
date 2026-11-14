package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class we {
    public final android.content.Context a;
    public final dev.epro.r0.O16637889491137121389 b;
    public final ads_mobile_sdk.fz c;
    public final ads_mobile_sdk.hs d;
    public final ads_mobile_sdk.jr0 e;
    public final dev.epro.r0.K12714355155332733186 g;
    public final ads_mobile_sdk.xj h;
    public final ads_mobile_sdk.fi0 i;
    public final ads_mobile_sdk.kv0 j;

    public we(android.content.Context context, ads_mobile_sdk.b41 b41Var, java.lang.String str, java.lang.String str2, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.fz fzVar, ads_mobile_sdk.hs hsVar, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.dj0 dj0Var, dev.epro.r0.K12714355155332733186 k12714355155332733186, ads_mobile_sdk.xj xjVar, ads_mobile_sdk.fi0 fi0Var) {
        android.graphics.Rect rectK;
        android.content.pm.PackageInfo packageInfo;
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
        android.view.WindowManager windowManagerB = dj0Var.b(context);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 30) {
            rectK = dev.epro.r0.F11474578038339593445.k(dev.epro.r0.F11474578038339593445.f(windowManagerB));
        } else {
            android.graphics.Rect rect = new android.graphics.Rect();
            windowManagerB.getDefaultDisplay().getRectSize(rect);
            rectK = rect;
        }
        rectK.getClass();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.lang.String str3 = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) == null || (str3 = packageInfo.versionName) == null) ? "" : str3;
        dev.epro.r0.K9808832422180718119 k9808832422180718119P = ads_mobile_sdk.kv0.p();
        k9808832422180718119P.getClass();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).o("CUI_NAME_ANR_DETECTED");
        k9808832422180718119P.b();
        ads_mobile_sdk.kv0 kv0Var = (ads_mobile_sdk.kv0) k9808832422180718119P.b;
        kv0Var.getClass();
        kv0Var.os_ = dev.epro.r0.X2485016533998461232.c(2);
        java.lang.String str4 = android.os.Build.VERSION.RELEASE;
        str4.getClass();
        str4.getClass();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).p$1();
        java.lang.String str5 = android.os.Build.MODEL;
        str5.getClass();
        str5.getClass();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).j(str5);
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).targetVersion_ = i;
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).t(str2);
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).d(str);
        java.lang.String packageName = context.getPackageName();
        packageName.getClass();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).f(packageName);
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).g(str3);
        dev.epro.r0.V10300877997588547986 v10300877997588547986A = b41Var.a();
        java.lang.String str6 = v10300877997588547986A != null ? (java.lang.String) v10300877997588547986A.b : "";
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).e(str6);
        java.lang.String country = java.util.Locale.getDefault().getCountry();
        country.getClass();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).i(country);
        int iWidth = rectK.width();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).displayWidth_ = iWidth;
        int iHeight = rectK.height();
        k9808832422180718119P.b();
        ((ads_mobile_sdk.kv0) k9808832422180718119P.b).displayHeight_ = iHeight;
        this.j = (ads_mobile_sdk.kv0) k9808832422180718119P.a();
    }

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
