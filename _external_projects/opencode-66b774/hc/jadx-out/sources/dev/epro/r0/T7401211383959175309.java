package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T7401211383959175309 {
    public static final T7401211383959175309 c = new T7401211383959175309(V3311072669930093336.l(0), V3311072669930093336.l(0));
    public final long a;
    public final long b;

    public T7401211383959175309(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T7401211383959175309)) {
            return false;
        }
        T7401211383959175309 t7401211383959175309 = (T7401211383959175309) obj;
        return J5593409210068682756.a(this.a, t7401211383959175309.a) && J5593409210068682756.a(this.b, t7401211383959175309.b);
    }

    public final int hashCode() {
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return E12098517352909843120.m("TextIndent(firstLine=", J5593409210068682756.d(this.a), ", restLine=", J5593409210068682756.d(this.b), ")");
    }
}
