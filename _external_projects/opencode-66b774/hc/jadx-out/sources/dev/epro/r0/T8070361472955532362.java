package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T8070361472955532362 extends M458157582077333589 {
    public final float c;
    public final float d;

    public T8070361472955532362(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T8070361472955532362)) {
            return false;
        }
        T8070361472955532362 t8070361472955532362 = (T8070361472955532362) obj;
        return Float.compare(this.c, t8070361472955532362.c) == 0 && Float.compare(this.d, t8070361472955532362.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
