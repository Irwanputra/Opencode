package ads_mobile_sdk;

import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ma1 implements Y4798753258822141670 {
    public final w81 a;

    public ma1(w81 w81Var) {
        w81Var.getClass();
        this.a = w81Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("persistentData");
        if (str != null && !M8927913404651150384.Y(str)) {
            w81 w81Var = this.a;
            w81Var.getClass();
            Object b = w81.b(w81Var, str, r4833348786910499294);
            if (b == Z3437138737604933638.a) {
                return b;
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 42;
    }
}
