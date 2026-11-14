package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A4728339295748512463 {
    public final String a;
    public final int b;

    public A4728339295748512463(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A4728339295748512463)) {
            return false;
        }
        A4728339295748512463 a4728339295748512463 = (A4728339295748512463) obj;
        return S10823041268949770285.t(this.a, a4728339295748512463.a) && this.b == a4728339295748512463.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return G6547577305291411977.p(this.b, "LiteVpnDnsServer(address=", this.a, ", port=", ")");
    }
}
