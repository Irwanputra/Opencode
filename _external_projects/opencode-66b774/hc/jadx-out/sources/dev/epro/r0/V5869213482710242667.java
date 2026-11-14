package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V5869213482710242667 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof V5869213482710242667) {
            return this.a == ((V5869213482710242667) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ")";
    }
}
