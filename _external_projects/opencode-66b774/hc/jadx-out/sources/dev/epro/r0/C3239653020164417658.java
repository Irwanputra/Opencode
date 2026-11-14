package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C3239653020164417658 implements H1203938712873468075 {
    public final String a;

    public C3239653020164417658(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3239653020164417658) {
            return this.a.equals(((C3239653020164417658) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("VerbatimTtsAnnotation(verbatim=", this.a, ")");
    }
}
