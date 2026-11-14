package dev.epro.r0;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y11834541914804214684 {
    public final int a;
    public final int b;
    public final Point c;

    public Y11834541914804214684(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.a = i;
        this.b = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y11834541914804214684)) {
            return false;
        }
        Y11834541914804214684 y11834541914804214684 = (Y11834541914804214684) obj;
        return this.a == y11834541914804214684.a && this.b == y11834541914804214684.b && this.c.equals(y11834541914804214684.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.b);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
