package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G8961598259406769987 {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public G8961598259406769987(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8961598259406769987)) {
            return false;
        }
        G8961598259406769987 g8961598259406769987 = (G8961598259406769987) obj;
        return this.a == g8961598259406769987.a && this.b == g8961598259406769987.b && this.c == g8961598259406769987.c && this.d == g8961598259406769987.d && this.e == g8961598259406769987.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + X2485016533998461232.f(this.d, X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        boolean z = this.e;
        StringBuilder sbP = E12098517352909843120.p(i, i2, "Change(preStart=", ", preEnd=", ", originalStart=");
        G6547577305291411977.A(sbP, i3, ", originalEnd=", i4, ", isFromHardwareSource=");
        return E12098517352909843120.o(sbP, z, ")");
    }
}
