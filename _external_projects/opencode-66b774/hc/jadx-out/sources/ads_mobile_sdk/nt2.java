package ads_mobile_sdk;

import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class nt2 implements Y4798753258822141670 {
    public final G16864365537574524285 a;

    public nt2(G16864365537574524285 g16864365537574524285) {
        g16864365537574524285.getClass();
        this.a = g16864365537574524285;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        Object objB;
        String str = (String) map.get("action");
        boolean zEquals = "pause".equals(str);
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        G16864365537574524285 g16864365537574524285 = this.a;
        if (zEquals) {
            Object objA = g16864365537574524285.a(true, r4833348786910499294);
            if (objA == z3437138737604933638) {
                return objA;
            }
        } else if ("resume".equals(str) && (objB = g16864365537574524285.b(true, r4833348786910499294)) == z3437138737604933638) {
            return objB;
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 7;
    }
}
