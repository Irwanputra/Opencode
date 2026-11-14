package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.Z3383101362411723454;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class rg0 implements B8427392651679410143 {
    public V2597580950516131749 a;

    public static void a(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492) {
        rg0 rg0Var = (rg0) v2597580950516131749;
        if (rg0Var.a == null) {
            rg0Var.a = v25975809505161317492;
        } else {
            Z3383101362411723454.r();
        }
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        V2597580950516131749 v2597580950516131749 = this.a;
        if (v2597580950516131749 != null) {
            return v2597580950516131749.get();
        }
        Z3383101362411723454.r();
        return null;
    }
}
