package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N18340289048873574260 {
    public static final N18340289048873574260 f = new N18340289048873574260(false, 9205357640488583168L, 0.0f, O16392062884302746898.a, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final O16392062884302746898 d;
    public final boolean e;

    public N18340289048873574260(boolean z, long j, float f2, O16392062884302746898 o16392062884302746898, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = o16392062884302746898;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N18340289048873574260)) {
            return false;
        }
        N18340289048873574260 n18340289048873574260 = (N18340289048873574260) obj;
        return this.a == n18340289048873574260.a && L2216691091636065972.b(this.b, n18340289048873574260.b) && Float.compare(this.c, n18340289048873574260.c) == 0 && this.d == n18340289048873574260.d && this.e == n18340289048873574260.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + E12098517352909843120.e(this.c, G6547577305291411977.j(Boolean.hashCode(this.a) * 31, this.b, 31), 31)) * 31);
    }

    public final String toString() {
        String h = L2216691091636065972.h(this.b);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(h);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return E12098517352909843120.o(sb, this.e, ")");
    }
}
