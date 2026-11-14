package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L4997663793588871338 extends M458157582077333589 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public L4997663793588871338(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof L4997663793588871338)) {
            return false;
        }
        L4997663793588871338 l4997663793588871338 = (L4997663793588871338) obj;
        return Float.compare(this.c, l4997663793588871338.c) == 0 && Float.compare(this.d, l4997663793588871338.d) == 0 && Float.compare(this.e, l4997663793588871338.e) == 0 && Float.compare(this.f, l4997663793588871338.f) == 0 && Float.compare(this.g, l4997663793588871338.g) == 0 && Float.compare(this.h, l4997663793588871338.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + E12098517352909843120.e(this.g, E12098517352909843120.e(this.f, E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = G11450220448113054352.k("RelativeCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        k.append(this.e);
        k.append(", dy2=");
        k.append(this.f);
        k.append(", dx3=");
        k.append(this.g);
        k.append(", dy3=");
        k.append(this.h);
        k.append(")");
        return k.toString();
    }
}
