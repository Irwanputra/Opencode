package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B10711566638970406496 {
    public final dev.epro.r0.G9179344335501959518 a;
    public final float b;

    public B10711566638970406496(android.graphics.Rect rect, float f) {
        this.a = new dev.epro.r0.G9179344335501959518(rect);
        this.b = f;
    }

    public final android.graphics.Rect a() {
        dev.epro.r0.G9179344335501959518 g9179344335501959518 = this.a;
        g9179344335501959518.getClass();
        return new android.graphics.Rect(g9179344335501959518.a, g9179344335501959518.b, g9179344335501959518.c, g9179344335501959518.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dev.epro.r0.B10711566638970406496.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dev.epro.r0.B10711566638970406496 b10711566638970406496 = (dev.epro.r0.B10711566638970406496) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, b10711566638970406496.a) && this.b == b10711566638970406496.b;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public B10711566638970406496(dev.epro.r0.G9179344335501959518 g9179344335501959518, float f) {
        this.a = g9179344335501959518;
        this.b = f;
    }
}
