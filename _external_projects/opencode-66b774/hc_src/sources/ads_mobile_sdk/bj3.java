package ads_mobile_sdk;

import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bj3 implements Y4798753258822141670 {
    public final x12 a;

    public bj3(x12 x12Var) {
        x12Var.getClass();
        this.a = x12Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        x12 x12Var = this.a;
        x12Var.g.getAndSet(true);
        Object a = x12Var.a(r4833348786910499294);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (a != z3437138737604933638) {
            a = o9245300239821758723;
        }
        return a == z3437138737604933638 ? a : o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 31;
    }
}
