package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F5967275151281184700 implements M15405369037958785483 {
    public final int a;

    public F5967275151281184700(int i) {
        this.a = i;
        if (1 > i || i >= 65536) {
            S10973172697741180971.j("Port SOCKS5 tidak valid");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F5967275151281184700) && this.a == ((F5967275151281184700) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return G6547577305291411977.o(this.a, "Socks5(port=", ")");
    }
}
