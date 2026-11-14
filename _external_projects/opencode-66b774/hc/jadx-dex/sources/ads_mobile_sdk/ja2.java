package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ja2 extends ads_mobile_sdk.cc3 {
    public final android.content.Context d;
    public final int e;
    public final ads_mobile_sdk.b41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja2(android.content.Context context, int i, ads_mobile_sdk.b41 b41Var) {
        super(null, 2);
        context.getClass();
        b41Var.getClass();
        this.d = context;
        this.e = i;
        this.f = b41Var;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.PACKAGE_INFO;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String strH;
        dev.epro.r0.X13869420807587484607 x13869420807587484607B;
        dev.epro.r0.X13869420807587484607 x13869420807587484607B2;
        android.content.Context context = this.d;
        java.lang.String packageName = context.getPackageName();
        packageName.getClass();
        java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        int i = this.e;
        java.lang.Integer num = new java.lang.Integer(i);
        java.lang.String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        java.lang.String str2 = null;
        try {
            strH = android.os.Build.VERSION.SDK_INT >= 30 ? dev.epro.r0.F11474578038339593445.h(dev.epro.r0.F11474578038339593445.b(context.getPackageManager(), context.getApplicationInfo().packageName)) : context.getPackageManager().getInstallerPackageName(context.getApplicationInfo().packageName);
        } catch (java.lang.Throwable unused) {
            strH = null;
        }
        java.lang.String strL = android.os.Build.VERSION.SDK_INT >= 30 ? dev.epro.r0.F11474578038339593445.l(dev.epro.r0.F11474578038339593445.b(context.getPackageManager(), context.getApplicationInfo().packageName)) : null;
        java.lang.String str3 = i + ".android." + context.getPackageName();
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        ads_mobile_sdk.b41 b41Var = this.f;
        dev.epro.r0.V10300877997588547986 v10300877997588547986A = b41Var.a();
        java.lang.String str4 = v10300877997588547986A != null ? (java.lang.String) v10300877997588547986A.b : "";
        dev.epro.r0.H5336160545165318150 h5336160545165318150 = ads_mobile_sdk.rw0.h;
        dev.epro.r0.U12307647644992999381 u12307647644992999381B = dev.epro.r0.H5336160545165318150.b(h5336160545165318150, str4);
        java.lang.String str5 = (u12307647644992999381B == null || (x13869420807587484607B2 = u12307647644992999381B.c.b(1)) == null) ? null : x13869420807587484607B2.a;
        dev.epro.r0.V10300877997588547986 v10300877997588547986A2 = b41Var.a();
        dev.epro.r0.U12307647644992999381 u12307647644992999381B2 = dev.epro.r0.H5336160545165318150.b(h5336160545165318150, v10300877997588547986A2 != null ? (java.lang.String) v10300877997588547986A2.b : "");
        if (u12307647644992999381B2 != null && (x13869420807587484607B = u12307647644992999381B2.c.b(2)) != null) {
            str2 = x13869420807587484607B.a;
        }
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.ia2(packageName, str, num, string, strH, strL, str3, str5, str2));
    }
}
