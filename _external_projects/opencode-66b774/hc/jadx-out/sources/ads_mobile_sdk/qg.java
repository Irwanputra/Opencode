package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.V5431423861497278836;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qg implements B8427392651679410143 {
    public final hb1 a;
    public final V2597580950516131749 b;
    public final hb1 c;
    public final V2597580950516131749 d;
    public final /* synthetic */ byte e;

    public qg(hb1 hb1Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var2) {
        this.e = (byte) 2;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.d = v25975809505161317492;
        this.c = hb1Var2;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.e;
        hb1 hb1Var = this.c;
        V2597580950516131749 v2597580950516131749 = this.d;
        V2597580950516131749 v25975809505161317492 = this.b;
        hb1 hb1Var2 = this.a;
        switch (b) {
            case 0:
                return new pg((Context) hb1Var2.a, (vi3) v25975809505161317492.get(), (j7) hb1Var.a, (F7878618420024429111) v2597580950516131749.get());
            case 1:
                return new qj0((V5431423861497278836) hb1Var2.a, (rp1) v25975809505161317492.get(), (Context) hb1Var.a, (vi3) v2597580950516131749.get(), (byte) 0);
            default:
                return new up1((Context) hb1Var2.a, (vi3) v25975809505161317492.get(), (a) v2597580950516131749.get(), (j7) hb1Var.a);
        }
    }

    public /* synthetic */ qg(hb1 hb1Var, V2597580950516131749 v2597580950516131749, hb1 hb1Var2, V2597580950516131749 v25975809505161317492, byte b) {
        this.e = b;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = hb1Var2;
        this.d = v25975809505161317492;
    }
}
