package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D9201356603168736774 implements dev.epro.r0.I3673563500665330592 {
    public static final java.lang.Object c = new java.lang.Object();
    public volatile dev.epro.r0.I3673563500665330592 a;
    public volatile java.lang.Object b;

    public static dev.epro.r0.D9201356603168736774 a(dev.epro.r0.I3673563500665330592 i3673563500665330592) {
        if (i3673563500665330592 instanceof dev.epro.r0.D9201356603168736774) {
            return (dev.epro.r0.D9201356603168736774) i3673563500665330592;
        }
        dev.epro.r0.D9201356603168736774 d9201356603168736774 = new dev.epro.r0.D9201356603168736774();
        d9201356603168736774.b = c;
        d9201356603168736774.a = i3673563500665330592;
        return d9201356603168736774;
    }

    public final java.lang.Object h() {
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                java.lang.Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                java.lang.Object objH = this.a.h();
                java.lang.Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objH) {
                    throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objH + ". This is likely due to a circular dependency.");
                }
                this.b = objH;
                this.a = null;
                return objH;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
