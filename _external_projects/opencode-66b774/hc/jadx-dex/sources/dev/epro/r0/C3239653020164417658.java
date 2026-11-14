package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C3239653020164417658 implements dev.epro.r0.H1203938712873468075 {
    public final java.lang.String a;

    public C3239653020164417658(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.C3239653020164417658) {
            return this.a.equals(((dev.epro.r0.C3239653020164417658) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.s("VerbatimTtsAnnotation(verbatim=", this.a, ")");
    }
}
