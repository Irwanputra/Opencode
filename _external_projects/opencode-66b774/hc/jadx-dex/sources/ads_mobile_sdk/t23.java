package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class t23 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.X16599180054040010357 a;

    public t23(dev.epro.r0.X16599180054040010357 x16599180054040010357) {
        x16599180054040010357.getClass();
        this.a = x16599180054040010357;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        for (java.util.Map.Entry entry : map.entrySet()) {
            i16631908410500040363.t((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.Object objA = this.a.a(i16631908410500040363, r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 48;
    }
}
