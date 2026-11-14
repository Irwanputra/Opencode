package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ki implements B8427392651679410143 {
    public final hb1 a;
    public final rg0 b;
    public final V2597580950516131749 c;
    public final /* synthetic */ byte d;

    public ki(hb1 hb1Var, V2597580950516131749 v2597580950516131749, rg0 rg0Var) {
        this.d = (byte) 1;
        this.a = hb1Var;
        this.c = v2597580950516131749;
        this.b = rg0Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        switch (this.d) {
            case 0:
                return new ji((Context) this.a.a, (ci3) this.b.get(), (O16637889491137121389) this.c.get());
            case 1:
                return new zv1((Context) this.a.a, (jr0) this.c.get(), (ci3) this.b.get());
            default:
                return new i80((Context) this.a.a, (W5797197595347441198) this.b.get(), (kz2) this.c.get());
        }
    }

    public /* synthetic */ ki(hb1 hb1Var, rg0 rg0Var, V2597580950516131749 v2597580950516131749, byte b) {
        this.d = b;
        this.a = hb1Var;
        this.b = rg0Var;
        this.c = v2597580950516131749;
    }
}
