package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P2629705021614852310 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public P2629705021614852310(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final F14378331124810887321 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            T12055643479535528558.b("Item.end should be set first");
        }
        return new F14378331124810887321(this.a, this.b, i, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2629705021614852310)) {
            return false;
        }
        P2629705021614852310 p2629705021614852310 = (P2629705021614852310) obj;
        return S10823041268949770285.t(this.a, p2629705021614852310.a) && this.b == p2629705021614852310.b && this.c == p2629705021614852310.c && S10823041268949770285.t(this.d, p2629705021614852310.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public /* synthetic */ P2629705021614852310(W1742516786250891319 w1742516786250891319, int i, int i2, int i3) {
        this(w1742516786250891319, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, "");
    }
}
