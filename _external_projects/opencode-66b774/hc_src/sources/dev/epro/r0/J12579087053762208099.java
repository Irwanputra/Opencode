package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J12579087053762208099 extends B5998207562248239613 {
    public final O15869581661108952313 y;

    public J12579087053762208099(O15869581661108952313 o15869581661108952313) {
        this.y = o15869581661108952313;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J12579087053762208099) && S10823041268949770285.t(this.y, ((J12579087053762208099) obj).y);
    }

    @Override // dev.epro.r0.B5998207562248239613
    public final int h(int i, int i2, F10342546226345611902 f10342546226345611902, Z17471428274427141949 z17471428274427141949, int i3) {
        return this.y.a(i2, i);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.y + ")";
    }
}
