package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N18337357316239809325 extends M458157582077333589 {
    public final float c;
    public final float d;

    public N18337357316239809325(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N18337357316239809325)) {
            return false;
        }
        N18337357316239809325 n18337357316239809325 = (N18337357316239809325) obj;
        return Float.compare(this.c, n18337357316239809325.c) == 0 && Float.compare(this.d, n18337357316239809325.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
