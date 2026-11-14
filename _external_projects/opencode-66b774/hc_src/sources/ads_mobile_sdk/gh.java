package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gh implements B8427392651679410143 {
    public final hb1 a;
    public final V2597580950516131749 b;
    public final hb1 c;
    public final V2597580950516131749 d;
    public final V2597580950516131749 e;
    public final bb0 f;
    public final /* synthetic */ byte g;

    public /* synthetic */ gh(hb1 hb1Var, V2597580950516131749 v2597580950516131749, hb1 hb1Var2, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, bb0 bb0Var, byte b) {
        this.g = b;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = hb1Var2;
        this.d = v25975809505161317492;
        this.e = v25975809505161317493;
        this.f = bb0Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.g;
        V2597580950516131749 v2597580950516131749 = this.e;
        V2597580950516131749 v25975809505161317492 = this.d;
        hb1 hb1Var = this.c;
        V2597580950516131749 v25975809505161317493 = this.b;
        hb1 hb1Var2 = this.a;
        switch (b) {
            case 0:
                return new fh((U4857089234315512256) hb1Var2.a, (sv2) v25975809505161317493.get(), (Context) hb1Var.a, (g0) v25975809505161317492.get(), (kh0) v2597580950516131749.get(), this.f);
            default:
                return new xh((U4857089234315512256) hb1Var2.a, (sv2) v25975809505161317493.get(), (Context) hb1Var.a, (g0) v25975809505161317492.get(), (kh0) v2597580950516131749.get(), this.f);
        }
    }
}
