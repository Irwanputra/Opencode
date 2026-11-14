package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gj0 implements dev.epro.r0.V2597580950516131749, dev.epro.r0.A8094652504661216977 {
    public static final java.lang.Object c = new java.lang.Object();
    public volatile dev.epro.r0.V2597580950516131749 a;
    public volatile java.lang.Object b = c;

    public gj0(dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        this.a = v2597580950516131749;
    }

    public static dev.epro.r0.A8094652504661216977 a(dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        if (v2597580950516131749 instanceof dev.epro.r0.A8094652504661216977) {
            return (dev.epro.r0.A8094652504661216977) v2597580950516131749;
        }
        v2597580950516131749.getClass();
        return new ads_mobile_sdk.gj0(v2597580950516131749);
    }

    @Override // dev.epro.r0.A8094652504661216977
    public final java.lang.Object get() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.b;
        java.lang.Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    java.lang.Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
