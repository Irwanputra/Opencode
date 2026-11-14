package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a1 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.U2595023890546017274 a;

    public a1(dev.epro.r0.U2595023890546017274 u2595023890546017274) {
        u2595023890546017274.getClass();
        this.a = u2595023890546017274;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("disabled");
        ((java.util.concurrent.atomic.AtomicBoolean) this.a.a).set(!(str != null && java.lang.Boolean.parseBoolean(str)));
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 18;
    }
}
