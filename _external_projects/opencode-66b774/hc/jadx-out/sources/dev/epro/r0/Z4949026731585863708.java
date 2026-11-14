package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z4949026731585863708 {
    public final C8185053590072587931 a;
    public final B3798966058357121240 b;

    public Z4949026731585863708(C8185053590072587931 c8185053590072587931, B3798966058357121240 b3798966058357121240) {
        this.a = c8185053590072587931;
        this.b = b3798966058357121240;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z4949026731585863708) {
            Z4949026731585863708 z4949026731585863708 = (Z4949026731585863708) obj;
            return this.a.equals(z4949026731585863708.a) && this.b == z4949026731585863708.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
