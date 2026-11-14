package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class s33 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.pa2 a;

    public s33(ads_mobile_sdk.pa2 pa2Var) {
        pa2Var.getClass();
        this.a = pa2Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("enabled");
        if (!dev.epro.r0.Z13168519540281190457.A(str, "true", true) && !dev.epro.r0.Z13168519540281190457.A(str, "false", true)) {
            return dev.epro.r0.O9245300239821758723.a;
        }
        ads_mobile_sdk.pa2 pa2Var = this.a;
        boolean z = java.lang.Boolean.parseBoolean(str);
        pa2Var.getClass();
        try {
            java.lang.Object value = pa2Var.e.getValue();
            value.getClass();
            ads_mobile_sdk.yy0 yy0Var = (ads_mobile_sdk.yy0) value;
            synchronized (ads_mobile_sdk.yy0.class) {
                yy0Var.a.a("paidv2_user_option", java.lang.Boolean.valueOf(z));
            }
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(4, "Exception while setting GpidV2 UserOption", e);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 28;
    }
}
