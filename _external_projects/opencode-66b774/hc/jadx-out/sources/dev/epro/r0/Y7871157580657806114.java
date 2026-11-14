package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y7871157580657806114 implements T12552481909083146428 {
    public final G2555456398299437723 a;
    public final float b;

    public Y7871157580657806114(G2555456398299437723 g2555456398299437723, float f) {
        this.a = g2555456398299437723;
        this.b = f;
    }

    @Override // dev.epro.r0.T12552481909083146428
    public final float a() {
        return this.b;
    }

    @Override // dev.epro.r0.T12552481909083146428
    public final long b() {
        int i = U10174709222559481877.i;
        return U10174709222559481877.h;
    }

    @Override // dev.epro.r0.T12552481909083146428
    public final D14208870094104617988 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y7871157580657806114)) {
            return false;
        }
        Y7871157580657806114 y7871157580657806114 = (Y7871157580657806114) obj;
        return this.a.equals(y7871157580657806114.a) && Float.compare(this.b, y7871157580657806114.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
