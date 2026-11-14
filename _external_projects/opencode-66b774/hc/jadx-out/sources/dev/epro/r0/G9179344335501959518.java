package dev.epro.r0;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G9179344335501959518 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new G9179344335501959518(0, 0, 0, 0);
    }

    public G9179344335501959518(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            S10973172697741180971.i(E12098517352909843120.l("Left must be less than or equal to right, left: ", i, i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        S10973172697741180971.i(E12098517352909843120.l("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G9179344335501959518.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        G9179344335501959518 g9179344335501959518 = (G9179344335501959518) obj;
        return this.a == g9179344335501959518.a && this.b == g9179344335501959518.b && this.c == g9179344335501959518.c && this.d == g9179344335501959518.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(G9179344335501959518.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return E12098517352909843120.n(sb, this.d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G9179344335501959518(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
