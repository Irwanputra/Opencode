package dev.epro.r0;

import android.graphics.Rect;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B10711566638970406496 {
    public final G9179344335501959518 a;
    public final float b;

    public B10711566638970406496(Rect rect, float f) {
        this.a = new G9179344335501959518(rect);
        this.b = f;
    }

    public final Rect a() {
        G9179344335501959518 g9179344335501959518 = this.a;
        g9179344335501959518.getClass();
        return new Rect(g9179344335501959518.a, g9179344335501959518.b, g9179344335501959518.c, g9179344335501959518.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!B10711566638970406496.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        B10711566638970406496 b10711566638970406496 = (B10711566638970406496) obj;
        return S10823041268949770285.t(this.a, b10711566638970406496.a) && this.b == b10711566638970406496.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public B10711566638970406496(G9179344335501959518 g9179344335501959518, float f) {
        this.a = g9179344335501959518;
        this.b = f;
    }
}
