package ads_mobile_sdk;

import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.Z3383101362411723454;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 implements B8427392651679410143, A8094652504661216977 {
    public static final hb1 b = new hb1(null);
    public final Object a;

    public hb1(Object obj) {
        this.a = obj;
    }

    public static hb1 a(Object obj) {
        if (obj != null) {
            return new hb1(obj);
        }
        Z3383101362411723454.k("instance cannot be null");
        return null;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        return this.a;
    }
}
