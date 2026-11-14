package ads_mobile_sdk;

import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class a53 implements Y4798753258822141670 {
    public final G8001132634698687269 a;
    public final jp0 b;

    public a53(G8001132634698687269 g8001132634698687269, jp0 jp0Var) {
        g8001132634698687269.getClass();
        jp0Var.getClass();
        this.a = g8001132634698687269;
        this.b = jp0Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        tx0 tx0Var2 = (tx0) this.b.e.get();
        if (tx0Var2 != null) {
            Object objD0 = R7033599853981556291.d0(this.a, new ex0(tx0Var2, null, (byte) 10), r4833348786910499294);
            if (objD0 == Z3437138737604933638.a) {
                return objD0;
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 52;
    }
}
