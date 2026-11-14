package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U4907063343750015025 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public U4907063343750015025(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U4907063343750015025)) {
            return false;
        }
        U4907063343750015025 u4907063343750015025 = (U4907063343750015025) obj;
        return this.a == u4907063343750015025.a && this.b == u4907063343750015025.b && this.c == u4907063343750015025.c && this.d == u4907063343750015025.d && this.e == u4907063343750015025.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ", isBlocked=" + this.e + ')';
    }
}
