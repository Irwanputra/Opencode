package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ze2 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.fz a;

    public ze2(ads_mobile_sdk.fz fzVar) {
        fzVar.getClass();
        this.a = fzVar;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("key");
        java.lang.String str2 = (java.lang.String) map.get("state");
        if (str != null && str.length() != 0) {
            ads_mobile_sdk.fz fzVar = this.a;
            fzVar.getClass();
            java.lang.Object objA = ads_mobile_sdk.fz.a(fzVar, str, str2, r4833348786910499294);
            if (objA == dev.epro.r0.Z3437138737604933638.a) {
                return objA;
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 54;
    }
}
