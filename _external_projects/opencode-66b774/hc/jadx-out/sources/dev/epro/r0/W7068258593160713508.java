package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W7068258593160713508 extends M458157582077333589 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public W7068258593160713508(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W7068258593160713508)) {
            return false;
        }
        W7068258593160713508 w7068258593160713508 = (W7068258593160713508) obj;
        return Float.compare(this.c, w7068258593160713508.c) == 0 && Float.compare(this.d, w7068258593160713508.d) == 0 && Float.compare(this.e, w7068258593160713508.e) == 0 && Float.compare(this.f, w7068258593160713508.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = G11450220448113054352.k("RelativeQuadTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbK.append(this.e);
        sbK.append(", dy2=");
        sbK.append(this.f);
        sbK.append(")");
        return sbK.toString();
    }
}
