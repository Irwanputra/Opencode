package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q4452198510918047973 implements Y8238840264228398567 {
    public final O15869581661108952313 a;
    public final int b;

    public Q4452198510918047973(O15869581661108952313 o15869581661108952313, int i) {
        this.a = o15869581661108952313;
        this.b = i;
    }

    @Override // dev.epro.r0.Y8238840264228398567
    public final int a(I11366018238968599357 i11366018238968599357, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : W7808703833045379622.q(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q4452198510918047973)) {
            return false;
        }
        Q4452198510918047973 q4452198510918047973 = (Q4452198510918047973) obj;
        return this.a.equals(q4452198510918047973.a) && this.b == q4452198510918047973.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Vertical(alignment=" + this.a + ", margin=" + this.b + ')';
    }
}
