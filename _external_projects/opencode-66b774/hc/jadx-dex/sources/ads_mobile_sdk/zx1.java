package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zx1 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.y2 a;
    public final ads_mobile_sdk.kx2 b;

    public zx1(ads_mobile_sdk.y2 y2Var, ads_mobile_sdk.kx2 kx2Var) {
        y2Var.getClass();
        kx2Var.getClass();
        this.a = y2Var;
        this.b = kx2Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("u");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str == null || str.length() == 0) {
            ads_mobile_sdk.zi3.a(6, "Impression URL in native GMSG is null or empty", null);
            return o9245300239821758723;
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        dev.epro.r0.Y2677586711477821327 y2677586711477821327 = ads_mobile_sdk.qw2.b;
        ads_mobile_sdk.kx2 kx2Var = this.b;
        kx2Var.getClass();
        uri.getClass();
        kx2Var.c.a(uri, kx2Var.a, kx2Var.b, this.a, bool);
        return o9245300239821758723;
    }

    public final int b() {
        return 56;
    }
}
