package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D9201356603168736774 implements I3673563500665330592 {
    public static final Object c = new Object();
    public volatile I3673563500665330592 a;
    public volatile Object b;

    public static D9201356603168736774 a(I3673563500665330592 i3673563500665330592) {
        if (i3673563500665330592 instanceof D9201356603168736774) {
            return (D9201356603168736774) i3673563500665330592;
        }
        D9201356603168736774 d9201356603168736774 = new D9201356603168736774();
        d9201356603168736774.b = c;
        d9201356603168736774.a = i3673563500665330592;
        return d9201356603168736774;
    }

    @Override // dev.epro.r0.I3673563500665330592
    public final Object h() {
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
                Object objH = this.a.h();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objH) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objH + ". This is likely due to a circular dependency.");
                }
                this.b = objH;
                this.a = null;
                return objH;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
