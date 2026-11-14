package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xq3 implements dev.epro.r0.S3216761178606715008 {
    public final ads_mobile_sdk.bs3 a;
    public final ads_mobile_sdk.jr0 b;

    public xq3(ads_mobile_sdk.bs3 bs3Var, ads_mobile_sdk.jr0 jr0Var) {
        bs3Var.getClass();
        jr0Var.getClass();
        this.a = bs3Var;
        this.b = jr0Var;
    }

    public final java.lang.Object a(java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.jr0 jr0Var = this.b;
        jr0Var.getClass();
        java.util.List list = (java.util.List) map.get((java.lang.String) jr0Var.a("gads:webview_prefetch_resource_url_header", "X-Afma-Creative-Resource-Urls", ads_mobile_sdk.ao.a$6));
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!dev.epro.r0.M8927913404651150384.Y((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ads_mobile_sdk.bs3 bs3Var = this.a;
                bs3Var.getClass();
                java.lang.Object objA = ads_mobile_sdk.bs3.a(bs3Var, arrayList, (dev.epro.r0.K14749510448791472029) r4833348786910499294);
                if (objA == dev.epro.r0.Z3437138737604933638.a) {
                    return objA;
                }
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
