package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B7853650354552420046 extends M458157582077333589 {
    public final float c;

    public B7853650354552420046(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B7853650354552420046) && Float.compare(this.c, ((B7853650354552420046) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.c + ")";
    }
}
