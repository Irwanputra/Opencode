package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A15589771493980083692 {
    public final java.lang.String a;
    public final int b;
    public final int c;

    public A15589771493980083692(java.lang.String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.A15589771493980083692)) {
            return false;
        }
        dev.epro.r0.A15589771493980083692 a15589771493980083692 = (dev.epro.r0.A15589771493980083692) obj;
        return this.a.equals(a15589771493980083692.a) && this.b == a15589771493980083692.b && this.c == a15589771493980083692.c;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.b);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(this.c);
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        return java.util.Objects.hash(this.a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(java.lang.Integer.valueOf(this.a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return dev.epro.r0.E12098517352909843120.n(sb, this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
