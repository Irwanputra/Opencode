package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L15252154029558218999 {
    public final long a;
    public final long b;

    public L15252154029558218999(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L15252154029558218999) {
            L15252154029558218999 l15252154029558218999 = (L15252154029558218999) obj;
            return Q13254524308163418711.a(this.a, l15252154029558218999.a) && this.b == l15252154029558218999.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
