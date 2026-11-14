package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D17019851967677288206 extends dev.epro.r0.M458157582077333589 {
    public final float c;

    public D17019851967677288206(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dev.epro.r0.D17019851967677288206) && java.lang.Float.compare(this.c, ((dev.epro.r0.D17019851967677288206) obj).c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.c);
    }

    public final java.lang.String toString() {
        return "HorizontalTo(x=" + this.c + ")";
    }
}
