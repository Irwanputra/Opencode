package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N12971976141354546695 {
    public final float a;
    public final A10693687560045094360 b;

    public N12971976141354546695(float f, A10693687560045094360 a10693687560045094360) {
        this.a = f;
        this.b = a10693687560045094360;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N12971976141354546695)) {
            return false;
        }
        N12971976141354546695 n12971976141354546695 = (N12971976141354546695) obj;
        return Float.compare(this.a, n12971976141354546695.a) == 0 && S10823041268949770285.t(this.b, n12971976141354546695.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
