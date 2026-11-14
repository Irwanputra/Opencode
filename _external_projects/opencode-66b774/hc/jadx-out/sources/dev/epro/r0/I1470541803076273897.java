package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I1470541803076273897 extends Q15653065705375360223 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public I1470541803076273897(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1470541803076273897)) {
            return false;
        }
        I1470541803076273897 i1470541803076273897 = (I1470541803076273897) obj;
        return this.a == i1470541803076273897.a && this.b == i1470541803076273897.b && this.c == i1470541803076273897.c && this.d == i1470541803076273897.d;
    }

    public final int hashCode() {
        return X2485016533998461232.f(this.d, X2485016533998461232.f(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = "Unknown";
        int i = this.c;
        String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        return G6547577305291411977.w(G11450220448113054352.k("Stroke(width=", this.a, ", miter=", this.b, ", cap="), str2, ", join=", str, ", pathEffect=null)");
    }
}
