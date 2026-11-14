package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class k23 implements B8427392651679410143 {
    public final rg0 a;
    public final V2597580950516131749 b;
    public final rg0 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ k23(rg0 rg0Var, V2597580950516131749 v2597580950516131749, rg0 rg0Var2, byte b) {
        this.d = b;
        this.a = rg0Var;
        this.b = v2597580950516131749;
        this.c = rg0Var2;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.d;
        rg0 rg0Var = this.c;
        V2597580950516131749 v2597580950516131749 = this.b;
        rg0 rg0Var2 = this.a;
        switch (b) {
            case 0:
                return new j23((W5797197595347441198) rg0Var2.get(), (jr0) v2597580950516131749.get(), (zj1) rg0Var.get());
            case 1:
                return new n23((W5797197595347441198) rg0Var2.get(), (jr0) v2597580950516131749.get(), (zj1) rg0Var.get());
            default:
                return new ra3((w81) rg0Var2.get(), (jr0) v2597580950516131749.get(), (ci3) rg0Var.get());
        }
    }
}
