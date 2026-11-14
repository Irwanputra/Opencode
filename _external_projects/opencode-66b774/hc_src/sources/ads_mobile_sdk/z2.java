package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.A5459349068949265291;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.H15747516787109764287;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.Map;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class z2 implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final V2597580950516131749 b;
    public final B8427392651679410143 c;
    public final /* synthetic */ byte d;

    public z2(hb1 hb1Var, hb1 hb1Var2, hb1 hb1Var3) {
        this.d = (byte) 4;
        this.c = hb1Var;
        this.a = hb1Var2;
        this.b = hb1Var3;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.d;
        V2597580950516131749 v2597580950516131749 = this.b;
        B8427392651679410143 b8427392651679410143 = this.c;
        V2597580950516131749 v25975809505161317492 = this.a;
        switch (b) {
            case 0:
                return new y2((W5797197595347441198) ((rg0) v25975809505161317492).get(), (Map) ((fn1) v2597580950516131749).get(), (z1) ((hb1) b8427392651679410143).a);
            case 1:
                return new b02((kz2) v25975809505161317492.get(), (sp3) v2597580950516131749.get(), (A5459349068949265291) ((m) b8427392651679410143).get());
            case 2:
                return new h02((kz2) v25975809505161317492.get(), (sp3) v2597580950516131749.get(), (A5459349068949265291) ((m) b8427392651679410143).get());
            case 3:
                return new kx2((z1) v25975809505161317492.get(), (hv) v2597580950516131749.get(), (jx2) ((da2) b8427392651679410143).get());
            case 4:
                Optional optional = (Optional) ((hb1) b8427392651679410143).a;
                Optional optional2 = (Optional) ((hb1) v25975809505161317492).a;
                Optional optional3 = (Optional) ((hb1) v2597580950516131749).a;
                optional.getClass();
                optional2.getClass();
                optional3.getClass();
                return new mi3((ur2) M18113111391818111737.G(optional, new ur2()), (fh1) M18113111391818111737.G(optional2, new fh1()), (tu2) M18113111391818111737.G(optional3, new tu2()), new s8());
            case 5:
                ((o7) v25975809505161317492).get();
                jr0 jr0Var = (jr0) v2597580950516131749.get();
                U4857089234315512256 u4857089234315512256 = (U4857089234315512256) ((hb1) b8427392651679410143).a;
                jr0Var.getClass();
                u4857089234315512256.getClass();
                return H15747516787109764287.a;
            default:
                return new yj3((W5797197595347441198) ((rg0) v25975809505161317492).get(), (Context) ((hb1) b8427392651679410143).a, (ci3) ((rg0) v2597580950516131749).get());
        }
    }

    public /* synthetic */ z2(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, B8427392651679410143 b8427392651679410143, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = b8427392651679410143;
    }

    public z2(rg0 rg0Var, hb1 hb1Var, rg0 rg0Var2) {
        this.d = (byte) 6;
        this.a = rg0Var;
        this.c = hb1Var;
        this.b = rg0Var2;
    }
}
