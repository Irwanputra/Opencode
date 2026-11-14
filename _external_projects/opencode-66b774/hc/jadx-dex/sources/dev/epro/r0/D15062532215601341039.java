package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D15062532215601341039 {
    public abstract dev.epro.r0.A13981518004556070623 a();

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dev.epro.r0.D15062532215601341039) {
            return a().equals(((dev.epro.r0.D15062532215601341039) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return a().toString();
    }
}
