package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U6655663618873729831 extends B5998207562248239613 {
    public final K1823399244298350623 y;

    public U6655663618873729831(A4300800680137755387 a4300800680137755387) {
        this.y = a4300800680137755387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U6655663618873729831) && S10823041268949770285.t(this.y, ((U6655663618873729831) obj).y);
    }

    @Override // dev.epro.r0.B5998207562248239613
    public final int h(int i, int i2, F10342546226345611902 f10342546226345611902, Z17471428274427141949 z17471428274427141949, int i3) {
        return this.y.a(i2, i, f10342546226345611902);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.y + ")";
    }
}
