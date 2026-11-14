package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class q23 extends ads_mobile_sdk.cc3 {
    public final java.lang.String d;
    public final ads_mobile_sdk.jr0 e;
    public final android.content.Context f;
    public final ads_mobile_sdk.rw0 g;
    public final java.lang.String h;
    public final ads_mobile_sdk.b41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q23(java.lang.String str, ads_mobile_sdk.jr0 jr0Var, android.content.Context context, ads_mobile_sdk.rw0 rw0Var, java.lang.String str2, ads_mobile_sdk.b41 b41Var) {
        super(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_INIT_ENVIRONMENT_SIGNAL, 2);
        str.getClass();
        jr0Var.getClass();
        context.getClass();
        rw0Var.getClass();
        str2.getClass();
        b41Var.getClass();
        this.d = str;
        this.e = jr0Var;
        this.f = context;
        this.g = rw0Var;
        this.h = str2;
        this.i = b41Var;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.SDK_ENV;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        android.content.pm.ApplicationInfo applicationInfo = this.f.getApplicationInfo();
        int i = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
        ads_mobile_sdk.jr0 jr0Var = this.e;
        jr0Var.getClass();
        java.lang.String str = (java.lang.String) jr0Var.a("gads:sdk_core_constants:caps", "", ads_mobile_sdk.ao.a$6);
        boolean zC = this.g.c();
        int iMyUid = android.os.Process.myUid();
        boolean z = iMyUid == 0 || iMyUid == 1000 || iMyUid == 1001 || iMyUid == 1002 || iMyUid == 1027;
        this.i.a();
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.p23(this.d, str, i, this.h, zC, z));
    }
}
