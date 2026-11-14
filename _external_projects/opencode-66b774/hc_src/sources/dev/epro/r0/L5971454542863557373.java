package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L5971454542863557373 extends M458157582077333589 {
    public final float c;
    public final float d;

    public L5971454542863557373(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5971454542863557373)) {
            return false;
        }
        L5971454542863557373 l5971454542863557373 = (L5971454542863557373) obj;
        return Float.compare(this.c, l5971454542863557373.c) == 0 && Float.compare(this.d, l5971454542863557373.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
