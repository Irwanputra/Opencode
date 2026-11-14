package ads_mobile_sdk;

import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.V2597580950516131749;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 implements V2597580950516131749, A8094652504661216977 {
    public static final Object c = new Object();
    public volatile V2597580950516131749 a;
    public volatile Object b = c;

    public gj0(V2597580950516131749 v2597580950516131749) {
        this.a = v2597580950516131749;
    }

    public static A8094652504661216977 a(V2597580950516131749 v2597580950516131749) {
        if (v2597580950516131749 instanceof A8094652504661216977) {
            return (A8094652504661216977) v2597580950516131749;
        }
        v2597580950516131749.getClass();
        return new gj0(v2597580950516131749);
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
