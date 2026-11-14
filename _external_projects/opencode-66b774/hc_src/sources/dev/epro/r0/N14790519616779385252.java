package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N14790519616779385252 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public N14790519616779385252(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N14790519616779385252)) {
            return false;
        }
        N14790519616779385252 n14790519616779385252 = (N14790519616779385252) obj;
        return this.a == n14790519616779385252.a && this.b == n14790519616779385252.b && this.c == n14790519616779385252.c && this.d == n14790519616779385252.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder p = E12098517352909843120.p(this.a, this.b, "InsetsValues(left=", ", top=", ", right=");
        p.append(this.c);
        p.append(", bottom=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
