package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J5593409210068682756 {
    public static final E6417708602094478350[] b = {new E6417708602094478350(0), new E6417708602094478350(4294967296L), new E6417708602094478350(8589934592L)};
    public static final long c = V3311072669930093336.n(Float.NaN, 0);
    public final long a;

    public /* synthetic */ J5593409210068682756(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (E6417708602094478350.a(jB, 0L)) {
            return "Unspecified";
        }
        if (E6417708602094478350.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!E6417708602094478350.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J5593409210068682756) {
            return this.a == ((J5593409210068682756) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
