package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T17307533667608403708 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T17307533667608403708) {
            return this.a == ((T17307533667608403708) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return j != 9205357640488583168L ? G6547577305291411977.s(A891803927997771281.c(b(j)), " x ", A891803927997771281.c(a(j))) : "DpSize.Unspecified";
    }
}
