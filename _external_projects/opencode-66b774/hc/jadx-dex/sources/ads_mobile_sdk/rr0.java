package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class rr0 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.W5797197595347441198 a;

    public rr0(dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        w5797197595347441198.getClass();
        this.a = w5797197595347441198;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        int i;
        java.lang.String str = (java.lang.String) map.get("height");
        java.lang.Integer numG = str != null ? dev.epro.r0.Z13168519540281190457.G(10, str) : null;
        if (numG != null) {
            synchronized (tx0Var) {
                i = tx0Var.s;
            }
            if (i != numG.intValue()) {
                int iIntValue = numG.intValue();
                synchronized (tx0Var) {
                    tx0Var.s = iIntValue;
                }
                ads_mobile_sdk.zi3.a(this.a, new ads_mobile_sdk.ex0(tx0Var, null, (byte) 3));
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 55;
    }
}
