package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z17567843015568193876 extends M458157582077333589 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public Z17567843015568193876(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z17567843015568193876)) {
            return false;
        }
        Z17567843015568193876 z17567843015568193876 = (Z17567843015568193876) obj;
        return Float.compare(this.c, z17567843015568193876.c) == 0 && Float.compare(this.d, z17567843015568193876.d) == 0 && Float.compare(this.e, z17567843015568193876.e) == 0 && Float.compare(this.f, z17567843015568193876.f) == 0 && Float.compare(this.g, z17567843015568193876.g) == 0 && Float.compare(this.h, z17567843015568193876.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + E12098517352909843120.e(this.g, E12098517352909843120.e(this.f, E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = G11450220448113054352.k("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        k.append(this.e);
        k.append(", y2=");
        k.append(this.f);
        k.append(", x3=");
        k.append(this.g);
        k.append(", y3=");
        k.append(this.h);
        k.append(")");
        return k.toString();
    }
}
