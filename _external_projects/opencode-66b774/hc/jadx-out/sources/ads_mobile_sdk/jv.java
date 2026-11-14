package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class jv implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final v80 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ jv(V2597580950516131749 v2597580950516131749, v80 v80Var, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = v80Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.c;
        v80 v80Var = this.b;
        V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                Optional optional = (Optional) v2597580950516131749.get();
                Optional optional2 = (Optional) v80Var.get();
                optional.getClass();
                optional2.getClass();
                return new mi3((ur2) M18113111391818111737.G(optional, new ur2()), (fh1) M18113111391818111737.G(optional2, new fh1()), new tu2(), new s8());
            default:
                return new os3((W5797197595347441198) v2597580950516131749.get(), (Optional) v80Var.get());
        }
    }
}
