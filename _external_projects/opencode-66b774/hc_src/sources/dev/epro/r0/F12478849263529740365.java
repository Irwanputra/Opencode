package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F12478849263529740365 {
    public static final long b = T1335862270807194835.d(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ F12478849263529740365(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return (g(j) <= g(j2)) & (f(j2) <= f(j));
    }

    public static boolean b(long j, Object obj) {
        return (obj instanceof F12478849263529740365) && j == ((F12478849263529740365) obj).a;
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final boolean d(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int e(long j) {
        return f(j) - g(j);
    }

    public static final int f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean h(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String i(long j) {
        return G11450220448113054352.h((int) (j >> 32), (int) (j & 4294967295L), "TextRange(", ", ", ")");
    }

    public final boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
