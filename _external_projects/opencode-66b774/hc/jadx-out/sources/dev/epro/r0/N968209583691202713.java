package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N968209583691202713 {
    public final String a;
    public final int b;

    public N968209583691202713(String str, int i) {
        str.getClass();
        String strB = A4349945402702183291.b(str);
        if (strB == null) {
            S10973172697741180971.j("unexpected hostname: ".concat(str));
            throw null;
        }
        this.a = strB;
        if (i == -1) {
            i = 443;
        } else if (1 > i || i >= 65536) {
            S10973172697741180971.j(G6547577305291411977.n(i, "unexpected port: "));
            throw null;
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N968209583691202713)) {
            return false;
        }
        N968209583691202713 n968209583691202713 = (N968209583691202713) obj;
        return S10823041268949770285.t(n968209583691202713.a, this.a) && n968209583691202713.b == this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        int i = this.b;
        String str = this.a;
        if (i == 443) {
            return str;
        }
        return str + ':' + i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N968209583691202713(String str) {
        this(str, 0, 2, null);
        str.getClass();
    }

    public /* synthetic */ N968209583691202713(String str, int i, int i2, O18369580107802500074 o18369580107802500074) {
        this(str, (i2 & 2) != 0 ? -1 : i);
    }
}
