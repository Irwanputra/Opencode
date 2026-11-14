package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class t3 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.v3 a;
    public final dev.epro.r0.Z17063040099457330719 b;

    public t3(ads_mobile_sdk.v3 v3Var, dev.epro.r0.Z17063040099457330719 z17063040099457330719) {
        v3Var.getClass();
        z17063040099457330719.getClass();
        this.a = v3Var;
        this.b = z17063040099457330719;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("info");
        if (str == null) {
            str = "";
        }
        android.os.Bundle bundleA = ads_mobile_sdk.d62.a(str);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (bundleA == null) {
            ads_mobile_sdk.zi3.a(6, "Unable to parse ad metadata info: ".concat(str), null);
            return o9245300239821758723;
        }
        ads_mobile_sdk.v3 v3Var = this.a;
        v3Var.a.setValue(v3Var, ads_mobile_sdk.v3.b[0], bundleA);
        this.b.a(bundleA, r4833348786910499294);
        return o9245300239821758723;
    }

    public final int b() {
        return 20;
    }
}
