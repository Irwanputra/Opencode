package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.C7508661312750798838;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.K182608585094072039;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pf3 implements B8427392651679410143 {
    public final rg0 a;
    public final hb1 b;
    public final rg0 c;
    public final V2597580950516131749 d;
    public final V2597580950516131749 e;
    public final V2597580950516131749 f;
    public final /* synthetic */ byte g = 1;

    public pf3(hb1 hb1Var, V2597580950516131749 v2597580950516131749, rg0 rg0Var, rg0 rg0Var2, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493) {
        this.b = hb1Var;
        this.d = v2597580950516131749;
        this.a = rg0Var;
        this.c = rg0Var2;
        this.e = v25975809505161317492;
        this.f = v25975809505161317493;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.g;
        V2597580950516131749 v2597580950516131749 = this.f;
        V2597580950516131749 v25975809505161317492 = this.e;
        rg0 rg0Var = this.c;
        rg0 rg0Var2 = this.a;
        V2597580950516131749 v25975809505161317493 = this.d;
        hb1 hb1Var = this.b;
        switch (b) {
            case 0:
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) rg0Var2.get();
                z1 z1Var = (z1) hb1Var.a;
                y2 y2Var = (y2) rg0Var.get();
                C7508661312750798838 c7508661312750798838 = (C7508661312750798838) v25975809505161317493.get();
                K182608585094072039 k182608585094072039 = (K182608585094072039) v25975809505161317492.get();
                Optional optional = (Optional) v2597580950516131749.get();
                w5797197595347441198.getClass();
                z1Var.getClass();
                y2Var.getClass();
                c7508661312750798838.getClass();
                k182608585094072039.getClass();
                optional.getClass();
                return new of3();
            default:
                return new x52((Context) hb1Var.a, (G8001132634698687269) v25975809505161317493.get(), (W5797197595347441198) rg0Var2.get(), (ci3) rg0Var.get(), (kz2) v25975809505161317492.get(), (String) v2597580950516131749.get());
        }
    }

    public pf3(rg0 rg0Var, hb1 hb1Var, rg0 rg0Var2, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493) {
        this.a = rg0Var;
        this.b = hb1Var;
        this.c = rg0Var2;
        this.d = v2597580950516131749;
        this.e = v25975809505161317492;
        this.f = v25975809505161317493;
    }
}
