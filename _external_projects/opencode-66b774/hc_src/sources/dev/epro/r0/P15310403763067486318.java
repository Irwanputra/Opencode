package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P15310403763067486318 implements T6366323384730309747 {
    public static final Object c = new Object();
    public volatile T6366323384730309747 a;
    public volatile Object b;

    public static T6366323384730309747 a(T6366323384730309747 t6366323384730309747) {
        if (t6366323384730309747 instanceof P15310403763067486318) {
            return t6366323384730309747;
        }
        P15310403763067486318 p15310403763067486318 = new P15310403763067486318();
        p15310403763067486318.b = c;
        p15310403763067486318.a = t6366323384730309747;
        return p15310403763067486318;
    }

    @Override // dev.epro.r0.C12724819056537085121
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
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
        }
        return obj;
    }
}
