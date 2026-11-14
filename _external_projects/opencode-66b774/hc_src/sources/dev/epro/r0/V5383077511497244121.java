package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V5383077511497244121 {
    public final String a;
    public final int b;
    public final String c;

    public V5383077511497244121(String str, int i, String str2) {
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V5383077511497244121)) {
            return false;
        }
        V5383077511497244121 v5383077511497244121 = (V5383077511497244121) obj;
        return this.a.equals(v5383077511497244121.a) && this.b == v5383077511497244121.b && S10823041268949770285.t(this.c, v5383077511497244121.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return G6547577305291411977.u(G6547577305291411977.x(this.b, "LiteVpnAddress(address=", this.a, ", prefixLength=", ", gateway="), this.c, ")");
    }
}
