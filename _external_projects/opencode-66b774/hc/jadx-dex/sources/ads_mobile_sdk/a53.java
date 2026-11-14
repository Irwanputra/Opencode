package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a53 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.G8001132634698687269 a;
    public final ads_mobile_sdk.jp0 b;

    public a53(dev.epro.r0.G8001132634698687269 g8001132634698687269, ads_mobile_sdk.jp0 jp0Var) {
        g8001132634698687269.getClass();
        jp0Var.getClass();
        this.a = g8001132634698687269;
        this.b = jp0Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.tx0 tx0Var2 = (ads_mobile_sdk.tx0) this.b.e.get();
        if (tx0Var2 != null) {
            java.lang.Object objD0 = dev.epro.r0.R7033599853981556291.d0(this.a, new ads_mobile_sdk.ex0(tx0Var2, null, (byte) 10), r4833348786910499294);
            if (objD0 == dev.epro.r0.Z3437138737604933638.a) {
                return objD0;
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 52;
    }
}
