package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B5288020592368727841 {
    public final long a;

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.B5288020592368727841) {
            return this.a == ((dev.epro.r0.B5288020592368727841) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.a);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
