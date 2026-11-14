package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class nt2 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.G16864365537574524285 a;

    public nt2(dev.epro.r0.G16864365537574524285 g16864365537574524285) {
        g16864365537574524285.getClass();
        this.a = g16864365537574524285;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objB;
        java.lang.String str = (java.lang.String) map.get("action");
        boolean zEquals = "pause".equals(str);
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.G16864365537574524285 g16864365537574524285 = this.a;
        if (zEquals) {
            java.lang.Object objA = g16864365537574524285.a(true, r4833348786910499294);
            if (objA == z3437138737604933638) {
                return objA;
            }
        } else if ("resume".equals(str) && (objB = g16864365537574524285.b(true, r4833348786910499294)) == z3437138737604933638) {
            return objB;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 7;
    }
}
