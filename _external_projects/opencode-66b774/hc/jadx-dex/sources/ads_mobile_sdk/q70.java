package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class q70 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.y2 a;

    public q70(ads_mobile_sdk.y2 y2Var) {
        y2Var.getClass();
        this.a = y2Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("asset");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str == null || str.length() == 0) {
            ads_mobile_sdk.zi3.a(6, "No asset name provided in custom click GMSG.", null);
            return o9245300239821758723;
        }
        this.a.a(str, r4833348786910499294);
        return o9245300239821758723;
    }

    public final int b() {
        return 35;
    }
}
