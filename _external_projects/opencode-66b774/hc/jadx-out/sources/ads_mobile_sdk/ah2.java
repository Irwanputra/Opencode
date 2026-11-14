package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z888930033515493246;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ah2 implements B8427392651679410143 {
    public final hb1 a;
    public final V2597580950516131749 b;
    public final hb1 c;
    public final rg0 d;
    public final V2597580950516131749 e;
    public final /* synthetic */ byte f = 1;

    public ah2(hb1 hb1Var, hb1 hb1Var2, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, rg0 rg0Var) {
        this.a = hb1Var;
        this.c = hb1Var2;
        this.b = v2597580950516131749;
        this.e = v25975809505161317492;
        this.d = rg0Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.f;
        rg0 rg0Var = this.d;
        V2597580950516131749 v2597580950516131749 = this.e;
        V2597580950516131749 v25975809505161317492 = this.b;
        hb1 hb1Var = this.c;
        hb1 hb1Var2 = this.a;
        switch (b) {
            case 0:
                return new zg2((z1) hb1Var2.a, (O16637889491137121389) v25975809505161317492.get(), (hv) hb1Var.a, (W5797197595347441198) rg0Var.get(), (kz2) v2597580950516131749.get());
            default:
                U4857089234315512256 u4857089234315512256 = (U4857089234315512256) hb1Var2.a;
                qw2 qw2Var = (qw2) hb1Var.a;
                pe2 pe2Var = (pe2) rg0Var.get();
                u4857089234315512256.getClass();
                qw2Var.getClass();
                v25975809505161317492.getClass();
                v2597580950516131749.getClass();
                pe2Var.getClass();
                S4967920478913205567 s4967920478913205567 = u4857089234315512256 instanceof S4967920478913205567 ? (S4967920478913205567) u4857089234315512256 : null;
                if (s4967920478913205567 != null) {
                    if (((pe2Var.b(s4967920478913205567, qw2Var) && pe2Var.a(s4967920478913205567, qw2Var) == 0) ? new xu0(O9245300239821758723.a) : new tu0("Persistent cache is disabled.", 1)) instanceof xu0) {
                        Object obj = v2597580950516131749.get();
                        obj.getClass();
                        return (Z888930033515493246) obj;
                    }
                }
                Object obj2 = v25975809505161317492.get();
                obj2.getClass();
                return (Z888930033515493246) obj2;
        }
    }

    public ah2(hb1 hb1Var, V2597580950516131749 v2597580950516131749, hb1 hb1Var2, rg0 rg0Var, V2597580950516131749 v25975809505161317492) {
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = hb1Var2;
        this.d = rg0Var;
        this.e = v25975809505161317492;
    }
}
