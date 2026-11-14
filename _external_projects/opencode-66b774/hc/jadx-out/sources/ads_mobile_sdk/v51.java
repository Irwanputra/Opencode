package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.V2597580950516131749;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v51 implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final r33 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ v51(V2597580950516131749 v2597580950516131749, r33 r33Var, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = r33Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.c;
        r33 r33Var = this.b;
        V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                g0 g0Var = (g0) v2597580950516131749.get();
                Set set = (Set) r33Var.get();
                g0Var.getClass();
                set.getClass();
                return new f41(g0Var, set, (byte) 1);
            default:
                return new ub3((pb3) v2597580950516131749.get(), (Set) r33Var.get());
        }
    }
}
