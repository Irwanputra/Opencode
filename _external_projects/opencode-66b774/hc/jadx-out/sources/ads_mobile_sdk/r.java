package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.P17493338506140929634;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.V5431423861497278836;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class r implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final V2597580950516131749 b;
    public final hb1 c;
    public final hb1 d;
    public final V2597580950516131749 e;
    public final /* synthetic */ byte f;

    public r(hb1 hb1Var, hb1 hb1Var2, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493) {
        this.f = (byte) 4;
        this.c = hb1Var;
        this.d = hb1Var2;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.e = v25975809505161317493;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.f;
        V2597580950516131749 v2597580950516131749 = this.e;
        V2597580950516131749 v25975809505161317492 = this.b;
        V2597580950516131749 v25975809505161317493 = this.a;
        hb1 hb1Var = this.d;
        hb1 hb1Var2 = this.c;
        switch (b) {
            case 0:
                return new q((V5431423861497278836) v25975809505161317493.get(), (rp1) v25975809505161317492.get(), (View) hb1Var2.a, (Activity) hb1Var.a, (vi3) v2597580950516131749.get());
            case 1:
                return new yo3((Context) hb1Var2.a, (wi0) v25975809505161317493.get(), (v6) v25975809505161317492.get(), (uo3) v2597580950516131749.get(), ((j7) hb1Var.a).t());
            case 2:
                return new ot0((Context) hb1Var2.a, (vi3) v25975809505161317493.get(), (F7878618420024429111) v25975809505161317492.get(), (j7) hb1Var.a, (P17493338506140929634) v2597580950516131749.get());
            case 3:
                return new rw0((Context) hb1Var2.a, (g0) v25975809505161317493.get(), (jr0) v25975809505161317492.get(), (l0) v2597580950516131749.get(), (Class) hb1Var.a);
            default:
                return new t42((z1) hb1Var2.a, (hv) hb1Var.a, (q22) v25975809505161317493.get(), (n42) v25975809505161317492.get(), (jr0) v2597580950516131749.get());
        }
    }

    public /* synthetic */ r(hb1 hb1Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, hb1 hb1Var2, byte b) {
        this.f = b;
        this.c = hb1Var;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.e = v25975809505161317493;
        this.d = hb1Var2;
    }

    public r(hb1 hb1Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var2, V2597580950516131749 v25975809505161317493) {
        this.f = (byte) 2;
        this.c = hb1Var;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.d = hb1Var2;
        this.e = v25975809505161317493;
    }

    public r(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var, hb1 hb1Var2, V2597580950516131749 v25975809505161317493) {
        this.f = (byte) 0;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = hb1Var;
        this.d = hb1Var2;
        this.e = v25975809505161317493;
    }
}
