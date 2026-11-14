package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z9903412080743350895 {
    public final int a;
    public final int b;

    public Z9903412080743350895(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z9903412080743350895)) {
            return false;
        }
        Z9903412080743350895 z9903412080743350895 = (Z9903412080743350895) obj;
        return this.a == z9903412080743350895.a && this.b == z9903412080743350895.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "CollectionInfo(rowCount=", ", columnCount=", ")");
    }
}
