package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j6 {
    public final ads_mobile_sdk.ha2 a;
    public final ads_mobile_sdk.ha2 b;
    public final boolean c;
    public final ads_mobile_sdk.d00 d;
    public final ads_mobile_sdk.q31 e;

    public j6(ads_mobile_sdk.d00 d00Var, ads_mobile_sdk.q31 q31Var, ads_mobile_sdk.ha2 ha2Var, ads_mobile_sdk.ha2 ha2Var2, boolean z) {
        this.d = d00Var;
        this.e = q31Var;
        this.a = ha2Var;
        if (ha2Var2 == null) {
            this.b = ads_mobile_sdk.ha2.d;
        } else {
            this.b = ha2Var2;
        }
        this.c = z;
    }

    public static ads_mobile_sdk.j6 a(ads_mobile_sdk.d00 d00Var, ads_mobile_sdk.q31 q31Var, ads_mobile_sdk.ha2 ha2Var, ads_mobile_sdk.ha2 ha2Var2, boolean z) {
        if (d00Var == null) {
            dev.epro.r0.S10973172697741180971.j("CreativeType is null");
            return null;
        }
        if (q31Var == null) {
            dev.epro.r0.S10973172697741180971.j("ImpressionType is null");
            return null;
        }
        if (ha2Var == null) {
            dev.epro.r0.S10973172697741180971.j("Impression owner is null");
            return null;
        }
        if (ha2Var == ads_mobile_sdk.ha2.d) {
            dev.epro.r0.S10973172697741180971.j("Impression owner is none");
            return null;
        }
        ads_mobile_sdk.d00 d00Var2 = ads_mobile_sdk.d00.b;
        ads_mobile_sdk.ha2 ha2Var3 = ads_mobile_sdk.ha2.b;
        if (d00Var == d00Var2 && ha2Var == ha2Var3) {
            dev.epro.r0.S10973172697741180971.j("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (q31Var != ads_mobile_sdk.q31.b || ha2Var != ha2Var3) {
            return new ads_mobile_sdk.j6(d00Var, q31Var, ha2Var, ha2Var2, z);
        }
        dev.epro.r0.S10973172697741180971.j("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }
}
