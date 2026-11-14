package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V13715822862871681502 extends M458157582077333589 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public V13715822862871681502(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V13715822862871681502)) {
            return false;
        }
        V13715822862871681502 v13715822862871681502 = (V13715822862871681502) obj;
        return Float.compare(this.c, v13715822862871681502.c) == 0 && Float.compare(this.d, v13715822862871681502.d) == 0 && Float.compare(this.e, v13715822862871681502.e) == 0 && this.f == v13715822862871681502.f && this.g == v13715822862871681502.g && Float.compare(this.h, v13715822862871681502.h) == 0 && Float.compare(this.i, v13715822862871681502.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + E12098517352909843120.e(this.h, G6547577305291411977.i(G6547577305291411977.i(E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbK = G11450220448113054352.k("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbK.append(this.e);
        sbK.append(", isMoreThanHalf=");
        sbK.append(this.f);
        sbK.append(", isPositiveArc=");
        sbK.append(this.g);
        sbK.append(", arcStartX=");
        sbK.append(this.h);
        sbK.append(", arcStartY=");
        sbK.append(this.i);
        sbK.append(")");
        return sbK.toString();
    }
}
