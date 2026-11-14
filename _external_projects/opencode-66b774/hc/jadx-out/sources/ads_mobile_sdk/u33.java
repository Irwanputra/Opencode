package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.N8216500077550626412;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u33 implements N8216500077550626412 {
    public final Object a;
    public final /* synthetic */ byte b = 1;

    public u33(fz fzVar) {
        fzVar.getClass();
        this.a = fzVar;
    }

    @Override // dev.epro.r0.N8216500077550626412
    public final Object a(I16631908410500040363 i16631908410500040363, k kVar) {
        Object objB;
        byte b = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj = this.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                int iA = d62.a(i16631908410500040363, "total_inflight_ad_limit", 0);
                if (iA <= 0) {
                    return o9245300239821758723;
                }
                q43 q43Var = (q43) obj;
                q43Var.getClass();
                Object objA = q43.a(q43Var, new n43(iA), kVar);
                if (objA != z3437138737604933638) {
                    objA = o9245300239821758723;
                }
                return objA == z3437138737604933638 ? objA : o9245300239821758723;
            default:
                fz fzVar = (fz) obj;
                if (d62.a(i16631908410500040363, "clear", "").length() > 0) {
                    objB = fzVar.v(kVar);
                    if (objB != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                } else {
                    String strA = d62.a(i16631908410500040363, "cookie", "");
                    if (strA.length() <= 0 || (objB = fzVar.b(strA, kVar)) != z3437138737604933638) {
                        return o9245300239821758723;
                    }
                }
                return objB;
        }
    }

    public u33(q43 q43Var) {
        q43Var.getClass();
        this.a = q43Var;
    }
}
