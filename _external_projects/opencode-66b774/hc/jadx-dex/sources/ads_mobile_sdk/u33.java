package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u33 implements dev.epro.r0.N8216500077550626412 {
    public final java.lang.Object a;
    public final /* synthetic */ byte b = 1;

    public u33(ads_mobile_sdk.fz fzVar) {
        fzVar.getClass();
        this.a = fzVar;
    }

    public final java.lang.Object a(dev.epro.r0.I16631908410500040363 i16631908410500040363, ads_mobile_sdk.k kVar) {
        java.lang.Object objB;
        byte b = this.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj = this.a;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                int iA = ads_mobile_sdk.d62.a(i16631908410500040363, "total_inflight_ad_limit", 0);
                if (iA <= 0) {
                    return o9245300239821758723;
                }
                ads_mobile_sdk.q43 q43Var = (ads_mobile_sdk.q43) obj;
                q43Var.getClass();
                java.lang.Object objA = ads_mobile_sdk.q43.a(q43Var, new ads_mobile_sdk.n43(iA), kVar);
                if (objA != z3437138737604933638) {
                    objA = o9245300239821758723;
                }
                return objA == z3437138737604933638 ? objA : o9245300239821758723;
            default:
                ads_mobile_sdk.fz fzVar = (ads_mobile_sdk.fz) obj;
                if (ads_mobile_sdk.d62.a(i16631908410500040363, "clear", "").length() > 0) {
                    objB = fzVar.v(kVar);
                    if (objB != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                } else {
                    java.lang.String strA = ads_mobile_sdk.d62.a(i16631908410500040363, "cookie", "");
                    if (strA.length() <= 0 || (objB = fzVar.b(strA, kVar)) != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                }
                return objB;
        }
    }

    public u33(ads_mobile_sdk.q43 q43Var) {
        q43Var.getClass();
        this.a = q43Var;
    }
}
