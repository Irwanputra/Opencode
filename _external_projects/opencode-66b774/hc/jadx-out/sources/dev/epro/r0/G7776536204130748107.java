package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G7776536204130748107 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G7776536204130748107)) {
            return false;
        }
        G7776536204130748107 g7776536204130748107 = (G7776536204130748107) obj;
        return this.a == g7776536204130748107.a && Float.compare(this.b, g7776536204130748107.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ")";
    }
}
