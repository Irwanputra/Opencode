package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.O5354877807466160604;
import dev.epro.r0.V2597580950516131749;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ps implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final rg0 b;
    public final V2597580950516131749 c;
    public final V2597580950516131749 d;
    public final hb1 e;
    public final /* synthetic */ byte f;

    public ps(hb1 hb1Var, V2597580950516131749 v2597580950516131749, rg0 rg0Var, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493) {
        this.f = (byte) 1;
        this.e = hb1Var;
        this.a = v2597580950516131749;
        this.b = rg0Var;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.f;
        hb1 hb1Var = this.e;
        V2597580950516131749 v2597580950516131749 = this.d;
        V2597580950516131749 v25975809505161317492 = this.c;
        rg0 rg0Var = this.b;
        V2597580950516131749 v25975809505161317493 = this.a;
        switch (b) {
            case 0:
                return new os((k8) v25975809505161317493.get(), (y2) rg0Var.get(), (kx2) v25975809505161317492.get(), (zm0) v2597580950516131749.get(), (z1) hb1Var.a);
            case 1:
                return new zm1((Context) hb1Var.a, (String) v25975809505161317493.get(), (fz) rg0Var.get(), (rw0) v25975809505161317492.get(), (jr0) v2597580950516131749.get());
            default:
                return new fa2((ca2) v25975809505161317493.get(), (ci3) rg0Var.get(), (jr0) v25975809505161317492.get(), (F14240031463097426304) O5354877807466160604.g.get(), (zv1) v2597580950516131749.get(), (Context) hb1Var.a);
        }
    }

    public /* synthetic */ ps(V2597580950516131749 v2597580950516131749, rg0 rg0Var, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, hb1 hb1Var, byte b) {
        this.f = b;
        this.a = v2597580950516131749;
        this.b = rg0Var;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.e = hb1Var;
    }
}
