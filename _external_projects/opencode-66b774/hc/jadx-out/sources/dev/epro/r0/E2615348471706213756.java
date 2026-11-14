package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E2615348471706213756 extends M458157582077333589 {
    public final float c;
    public final float d;

    public E2615348471706213756(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E2615348471706213756)) {
            return false;
        }
        E2615348471706213756 e2615348471706213756 = (E2615348471706213756) obj;
        return Float.compare(this.c, e2615348471706213756.c) == 0 && Float.compare(this.d, e2615348471706213756.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
