package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.V2597580950516131749;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements B8427392651679410143 {
    public final hb1 a;
    public final hb1 b;
    public final V2597580950516131749 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ hj0(hb1 hb1Var, hb1 hb1Var2, V2597580950516131749 v2597580950516131749, byte b) {
        this.d = b;
        this.a = hb1Var;
        this.b = hb1Var2;
        this.c = v2597580950516131749;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        switch (this.d) {
            case 0:
                return new v6((qm1) this.c.get());
            default:
                return new wi0((Context) this.a.a, (j7) this.b.a, (ub3) this.c.get());
        }
    }
}
