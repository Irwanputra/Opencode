package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W16989069692222643684 implements P6802326504044700406 {
    public static final Object c = new Object();
    public volatile P6802326504044700406 a;
    public volatile Object b;

    public static W16989069692222643684 b(P6802326504044700406 p6802326504044700406) {
        if (p6802326504044700406 instanceof W16989069692222643684) {
            return (W16989069692222643684) p6802326504044700406;
        }
        W16989069692222643684 w16989069692222643684 = new W16989069692222643684();
        w16989069692222643684.b = c;
        w16989069692222643684.a = p6802326504044700406;
        return w16989069692222643684;
    }

    @Override // dev.epro.r0.P6802326504044700406
    public final Object a() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.a.a();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.b = objA;
                this.a = null;
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
