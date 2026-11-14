package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z6884774333691094167 {
    public final O16392062884302746898 a;
    public final int b;
    public final long c;

    public Z6884774333691094167(O16392062884302746898 o16392062884302746898, int i, long j) {
        this.a = o16392062884302746898;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z6884774333691094167)) {
            return false;
        }
        Z6884774333691094167 z6884774333691094167 = (Z6884774333691094167) obj;
        return this.a == z6884774333691094167.a && this.b == z6884774333691094167.b && this.c == z6884774333691094167.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return L11610354117192841236.p(this.c, ")", sb);
    }
}
