package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.X16599180054040010357;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class t23 implements Y4798753258822141670 {
    public final X16599180054040010357 a;

    public t23(X16599180054040010357 x16599180054040010357) {
        x16599180054040010357.getClass();
        this.a = x16599180054040010357;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        for (Map.Entry entry : map.entrySet()) {
            i16631908410500040363.t((String) entry.getKey(), (String) entry.getValue());
        }
        Object objA = this.a.a(i16631908410500040363, r4833348786910499294);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 48;
    }
}
