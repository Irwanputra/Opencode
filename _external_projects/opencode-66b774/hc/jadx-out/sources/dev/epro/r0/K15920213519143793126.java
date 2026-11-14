package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K15920213519143793126 {
    public final long a;
    public final D6962450040782876658 b;

    public K15920213519143793126() {
        long jF = J8045362843799184672.f(4284900966L);
        D6962450040782876658 d6962450040782876658S = Q13169198992966610970.s(3, 0.0f);
        this.a = jF;
        this.b = d6962450040782876658S;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!K15920213519143793126.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        K15920213519143793126 k15920213519143793126 = (K15920213519143793126) obj;
        long j = k15920213519143793126.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && this.b.equals(k15920213519143793126.b);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + U10174709222559481877.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
