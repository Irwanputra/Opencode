package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class im1 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.um0 a;
    public final ads_mobile_sdk.z1 b;

    public im1(ads_mobile_sdk.um0 um0Var, ads_mobile_sdk.z1 z1Var) {
        um0Var.getClass();
        z1Var.getClass();
        this.a = um0Var;
        this.b = z1Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str;
        int i;
        java.lang.String str2 = (java.lang.String) map.get("eventName");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str2 != null && (str = (java.lang.String) map.get("eventId")) != null) {
            if (!str2.equals("_ac")) {
                i = str2.equals("_ai") ? 2 : 1;
            }
            android.os.Bundle bundle = this.b.q;
            ads_mobile_sdk.um0 um0Var = this.a;
            um0Var.getClass();
            ads_mobile_sdk.um0.a(um0Var, i, bundle, str);
        }
        return o9245300239821758723;
    }

    public final int b() {
        return 49;
    }
}
