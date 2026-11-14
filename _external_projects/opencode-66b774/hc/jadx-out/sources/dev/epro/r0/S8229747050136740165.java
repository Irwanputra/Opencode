package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S8229747050136740165 {
    public final int a;
    public final long b;
    public final String c;

    public S8229747050136740165(String str, int i, long j) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S8229747050136740165)) {
            return false;
        }
        S8229747050136740165 s8229747050136740165 = (S8229747050136740165) obj;
        return this.a == s8229747050136740165.a && this.b == s8229747050136740165.b && this.c.equals(s8229747050136740165.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + G6547577305291411977.j(L11610354117192841236.A(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdValue(precisionType=");
        sb.append(G11450220448113054352.y(this.a));
        sb.append(", valueMicros=");
        sb.append(this.b);
        return G6547577305291411977.v(sb, ", currencyCode=", this.c, ")");
    }
}
