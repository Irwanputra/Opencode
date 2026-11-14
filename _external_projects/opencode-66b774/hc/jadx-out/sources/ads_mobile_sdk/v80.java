package ads_mobile_sdk;

import dev.epro.r0.O11692414993408430441;
import dev.epro.r0.V2597580950516131749;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v80 implements V2597580950516131749 {
    public final Object a;
    public final /* synthetic */ byte b = 0;

    public v80(V2597580950516131749 v2597580950516131749) {
        v2597580950516131749.getClass();
        this.a = v2597580950516131749;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                m3 m3Var = (m3) obj;
                r80 r80Var = (r80) m3Var.a;
                m3 m3Var2 = (m3) m3Var.b;
                O11692414993408430441 o11692414993408430441 = new O11692414993408430441();
                o11692414993408430441.a = r80Var;
                o11692414993408430441.b = m3Var2;
                return o11692414993408430441;
            default:
                return Optional.of(((V2597580950516131749) obj).get());
        }
    }

    public v80(m3 m3Var) {
        this.a = m3Var;
    }
}
