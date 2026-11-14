package ads_mobile_sdk;

import dev.epro.r0.S10973172697741180971;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class j6 {
    public final ha2 a;
    public final ha2 b;
    public final boolean c;
    public final d00 d;
    public final q31 e;

    public j6(d00 d00Var, q31 q31Var, ha2 ha2Var, ha2 ha2Var2, boolean z) {
        this.d = d00Var;
        this.e = q31Var;
        this.a = ha2Var;
        if (ha2Var2 == null) {
            this.b = ha2.d;
        } else {
            this.b = ha2Var2;
        }
        this.c = z;
    }

    public static j6 a(d00 d00Var, q31 q31Var, ha2 ha2Var, ha2 ha2Var2, boolean z) {
        if (d00Var == null) {
            S10973172697741180971.j("CreativeType is null");
            return null;
        }
        if (q31Var == null) {
            S10973172697741180971.j("ImpressionType is null");
            return null;
        }
        if (ha2Var == null) {
            S10973172697741180971.j("Impression owner is null");
            return null;
        }
        if (ha2Var == ha2.d) {
            S10973172697741180971.j("Impression owner is none");
            return null;
        }
        d00 d00Var2 = d00.b;
        ha2 ha2Var3 = ha2.b;
        if (d00Var == d00Var2 && ha2Var == ha2Var3) {
            S10973172697741180971.j("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (q31Var != q31.b || ha2Var != ha2Var3) {
            return new j6(d00Var, q31Var, ha2Var, ha2Var2, z);
        }
        S10973172697741180971.j("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }
}
