package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P8563912062511171325 {
    public final byte a;
    public final long b;

    /* JADX WARN: Multi-variable type inference failed */
    public P8563912062511171325(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P8563912062511171325)) {
            return false;
        }
        P8563912062511171325 p8563912062511171325 = (P8563912062511171325) obj;
        return this.a == p8563912062511171325.a && this.b == p8563912062511171325.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append((int) this.a);
        sb.append(", eventTimestamp=");
        return L11610354117192841236.p(this.b, "}", sb);
    }
}
