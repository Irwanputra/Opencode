package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class s82 implements dev.epro.r0.K4548097313143615345 {
    public final ads_mobile_sdk.x52 a;
    public final java.lang.String b;
    public final ads_mobile_sdk.jr0 c;
    public final ads_mobile_sdk.rw0 d;

    public s82(ads_mobile_sdk.x52 x52Var, java.lang.String str, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.rw0 rw0Var) {
        x52Var.getClass();
        str.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        this.a = x52Var;
        this.b = str;
        this.c = jr0Var;
        this.d = rw0Var;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.OMID;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String strC;
        java.lang.String str;
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        java.util.List list = (java.util.List) jr0Var.a("gads:omid_instant_app_incompatible_versions", dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"1.5.2", "1.4.14"}), ads_mobile_sdk.ao.a$23);
        ads_mobile_sdk.x52 x52Var = this.a;
        if (dev.epro.r0.R9411874267597469228.v0(list, x52Var.b()) && this.d.c()) {
            str = null;
            strC = null;
        } else {
            java.lang.String strB = x52Var.b();
            strC = dev.epro.r0.G6547577305291411977.C((java.lang.String) jr0Var.a("gads:omid_partner_name_prefix", "Google/", ads_mobile_sdk.ao.a$6), this.b);
            str = strB;
        }
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.r82(x52Var.b(), str, strC));
    }
}
