package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W16949330580406226836 implements Y8238840264228398567 {
    public final O15869581661108952313 a;
    public final O15869581661108952313 b;
    public final int c;

    public W16949330580406226836(O15869581661108952313 o15869581661108952313, O15869581661108952313 o158695816611089523132, int i) {
        this.a = o15869581661108952313;
        this.b = o158695816611089523132;
        this.c = i;
    }

    @Override // dev.epro.r0.Y8238840264228398567
    public final int a(I11366018238968599357 i11366018238968599357, long j, int i) {
        int a = this.b.a(0, i11366018238968599357.b());
        return i11366018238968599357.b + a + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W16949330580406226836)) {
            return false;
        }
        W16949330580406226836 w16949330580406226836 = (W16949330580406226836) obj;
        return this.a.equals(w16949330580406226836.a) && this.b.equals(w16949330580406226836.b) && this.c == w16949330580406226836.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + E12098517352909843120.e(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
