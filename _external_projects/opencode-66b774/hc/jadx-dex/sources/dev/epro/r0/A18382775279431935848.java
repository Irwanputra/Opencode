package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A18382775279431935848 extends dev.epro.r0.M458157582077333589 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public A18382775279431935848(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.A18382775279431935848)) {
            return false;
        }
        dev.epro.r0.A18382775279431935848 a18382775279431935848 = (dev.epro.r0.A18382775279431935848) obj;
        return java.lang.Float.compare(this.c, a18382775279431935848.c) == 0 && java.lang.Float.compare(this.d, a18382775279431935848.d) == 0 && java.lang.Float.compare(this.e, a18382775279431935848.e) == 0 && java.lang.Float.compare(this.f, a18382775279431935848.f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f) + dev.epro.r0.E12098517352909843120.e(this.e, dev.epro.r0.E12098517352909843120.e(this.d, java.lang.Float.hashCode(this.c) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbK = dev.epro.r0.G11450220448113054352.k("RelativeReflectiveCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbK.append(this.e);
        sbK.append(", dy2=");
        sbK.append(this.f);
        sbK.append(")");
        return sbK.toString();
    }
}
