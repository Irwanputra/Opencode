package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A6522995672858297071 extends dev.epro.r0.G11493083415162978130 {
    public final int a;

    public A6522995672858297071(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dev.epro.r0.A6522995672858297071) && this.a == ((dev.epro.r0.A6522995672858297071) obj).a;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
