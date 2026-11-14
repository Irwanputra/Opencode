package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class c43 implements B8427392651679410143 {
    public final hb1 a;
    public final V2597580950516131749 b;
    public final V2597580950516131749 c;
    public final rg0 d;
    public final /* synthetic */ byte e;

    public c43(hb1 hb1Var, rg0 rg0Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492) {
        this.e = (byte) 4;
        this.a = hb1Var;
        this.d = rg0Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.e;
        V2597580950516131749 v2597580950516131749 = this.c;
        V2597580950516131749 v25975809505161317492 = this.b;
        rg0 rg0Var = this.d;
        hb1 hb1Var = this.a;
        switch (b) {
            case 0:
                return new b43((Context) hb1Var.a, (jr0) v25975809505161317492.get(), (O16637889491137121389) v2597580950516131749.get(), (W5797197595347441198) rg0Var.get());
            case 1:
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) rg0Var.get();
                xj xjVar = (xj) v25975809505161317492.get();
                n53 n53Var = (n53) v2597580950516131749.get();
                xn2 xn2Var = (xn2) hb1Var.a;
                w5797197595347441198.getClass();
                xjVar.getClass();
                n53Var.getClass();
                xn2Var.getClass();
                return new d62();
            case 2:
                return new nr0((Context) hb1Var.a, (jr0) v25975809505161317492.get(), (O16637889491137121389) v2597580950516131749.get(), (W5797197595347441198) rg0Var.get());
            case 3:
                return new pm0((U4857089234315512256) v25975809505161317492.get(), (um0) v2597580950516131749.get(), (z1) hb1Var.a, (W5797197595347441198) rg0Var.get());
            default:
                return new um0((Context) hb1Var.a, (ci3) rg0Var.get(), (kz2) v25975809505161317492.get(), (jr0) v2597580950516131749.get());
        }
    }

    public /* synthetic */ c43(hb1 hb1Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, rg0 rg0Var, byte b) {
        this.e = b;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.d = rg0Var;
    }

    public c43(rg0 rg0Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var) {
        this.e = (byte) 1;
        this.d = rg0Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.a = hb1Var;
    }

    public c43(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var, rg0 rg0Var) {
        this.e = (byte) 3;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.a = hb1Var;
        this.d = rg0Var;
    }
}
