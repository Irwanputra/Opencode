package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.V2597580950516131749;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ta3 implements V2597580950516131749 {
    public static final Object c = new Object();
    public volatile B8427392651679410143 a;
    public volatile Object b;

    public static V2597580950516131749 a(B8427392651679410143 b8427392651679410143) {
        if ((b8427392651679410143 instanceof ta3) || (b8427392651679410143 instanceof gj0)) {
            return b8427392651679410143;
        }
        ta3 ta3Var = new ta3();
        ta3Var.b = c;
        ta3Var.a = b8427392651679410143;
        return ta3Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        B8427392651679410143 b8427392651679410143 = this.a;
        if (b8427392651679410143 == null) {
            return this.b;
        }
        Object obj2 = b8427392651679410143.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
