package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.G2352924714470945535;
import dev.epro.r0.T1501356432609323047;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class aa implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final fn1 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ aa(V2597580950516131749 v2597580950516131749, fn1 fn1Var, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = fn1Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.c;
        fn1 fn1Var = this.b;
        V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                return new z9((W5797197595347441198) v2597580950516131749.get(), (Map) fn1Var.get());
            case 1:
                return new is3((W5797197595347441198) v2597580950516131749.get(), (Map) fn1Var.get());
            case 2:
                return new ja((W5797197595347441198) v2597580950516131749.get(), (Map) fn1Var.get());
            case 3:
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) v2597580950516131749.get();
                Map map = (Map) fn1Var.get();
                w5797197595347441198.getClass();
                map.getClass();
                return new T1501356432609323047(w5797197595347441198, map);
            case 4:
                return new ts3((W5797197595347441198) v2597580950516131749.get(), (Map) fn1Var.get());
            default:
                W5797197595347441198 w57971975953474411982 = (W5797197595347441198) v2597580950516131749.get();
                Map map2 = (Map) fn1Var.get();
                w57971975953474411982.getClass();
                map2.getClass();
                return new G2352924714470945535(w57971975953474411982, map2);
        }
    }
}
