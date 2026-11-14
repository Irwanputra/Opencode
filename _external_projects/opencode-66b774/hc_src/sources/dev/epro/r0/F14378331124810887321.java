package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F14378331124810887321 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public F14378331124810887321(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        T12055643479535528558.a("Reversed range is not supported");
    }

    public static F14378331124810887321 a(F14378331124810887321 f14378331124810887321, H1203938712873468075 h1203938712873468075, int i, int i2, int i3) {
        Object obj = h1203938712873468075;
        if ((i3 & 1) != 0) {
            obj = f14378331124810887321.a;
        }
        if ((i3 & 2) != 0) {
            i = f14378331124810887321.b;
        }
        if ((i3 & 4) != 0) {
            i2 = f14378331124810887321.c;
        }
        return new F14378331124810887321(obj, i, i2, f14378331124810887321.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F14378331124810887321)) {
            return false;
        }
        F14378331124810887321 f14378331124810887321 = (F14378331124810887321) obj;
        return S10823041268949770285.t(this.a, f14378331124810887321.a) && this.b == f14378331124810887321.b && this.c == f14378331124810887321.c && S10823041268949770285.t(this.d, f14378331124810887321.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public F14378331124810887321(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
