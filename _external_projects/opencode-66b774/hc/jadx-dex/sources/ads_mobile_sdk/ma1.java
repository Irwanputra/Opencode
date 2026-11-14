package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ma1 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.w81 a;

    public ma1(ads_mobile_sdk.w81 w81Var) {
        w81Var.getClass();
        this.a = w81Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("persistentData");
        if (str != null && !dev.epro.r0.M8927913404651150384.Y(str)) {
            ads_mobile_sdk.w81 w81Var = this.a;
            w81Var.getClass();
            java.lang.Object objB = ads_mobile_sdk.w81.b(w81Var, str, r4833348786910499294);
            if (objB == dev.epro.r0.Z3437138737604933638.a) {
                return objB;
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 42;
    }
}
