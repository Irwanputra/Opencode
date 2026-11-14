package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v12 implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final v80 b;
    public final V2597580950516131749 c;
    public final /* synthetic */ byte d = 1;

    public v12(v80 v80Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492) {
        this.b = v80Var;
        this.a = v2597580950516131749;
        this.c = v25975809505161317492;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        switch (this.d) {
            case 0:
                return new u12((bq1) this.a.get(), (Optional) this.b.get(), (W5797197595347441198) this.c.get());
            default:
                return new vq3((Optional) this.b.get(), (W5797197595347441198) this.a.get(), (jr0) this.c.get());
        }
    }

    public v12(V2597580950516131749 v2597580950516131749, v80 v80Var, V2597580950516131749 v25975809505161317492) {
        this.a = v2597580950516131749;
        this.b = v80Var;
        this.c = v25975809505161317492;
    }
}
