package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C10696704014433963524 implements java.io.Serializable {
    public final java.lang.Throwable a;

    public C10696704014433963524(java.lang.Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.C10696704014433963524) {
            return dev.epro.r0.S10823041268949770285.t(this.a, ((dev.epro.r0.C10696704014433963524) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.a + ')';
    }
}
