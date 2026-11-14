package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vq3 implements dev.epro.r0.L1518091290833714583 {
    public final java.util.Optional a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final ads_mobile_sdk.jr0 c;

    public vq3(java.util.Optional optional, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.jr0 jr0Var) {
        optional.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.a = optional;
        this.b = w5797197595347441198;
        this.c = jr0Var;
    }

    public final dev.epro.r0.O9245300239821758723 a(boolean z) {
        ads_mobile_sdk.tx0 tx0Var;
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        boolean zBooleanValue = ((java.lang.Boolean) jr0Var.a("gads:pause_webview_when_not_visible", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (zBooleanValue && (tx0Var = (ads_mobile_sdk.tx0) dev.epro.r0.M18113111391818111737.H(this.a)) != null) {
            dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.b;
            if (z) {
                ads_mobile_sdk.ex0 ex0Var = new ads_mobile_sdk.ex0(tx0Var, null, (byte) 5);
                w5797197595347441198.getClass();
                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ex0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                return o9245300239821758723;
            }
            ads_mobile_sdk.ex0 ex0Var2 = new ads_mobile_sdk.ex0(tx0Var, null, (byte) 6);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ex0Var2, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return o9245300239821758723;
    }
}
