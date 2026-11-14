package dev.epro.r0;

import android.graphics.Insets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z1975157152518754667 {
    public static final Z1975157152518754667 e = new Z1975157152518754667(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public Z1975157152518754667(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static Z1975157152518754667 a(Z1975157152518754667 z1975157152518754667, Z1975157152518754667 z19751571525187546672) {
        return b(Math.max(z1975157152518754667.a, z19751571525187546672.a), Math.max(z1975157152518754667.b, z19751571525187546672.b), Math.max(z1975157152518754667.c, z19751571525187546672.c), Math.max(z1975157152518754667.d, z19751571525187546672.d));
    }

    public static Z1975157152518754667 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new Z1975157152518754667(i, i2, i3, i4);
    }

    public static Z1975157152518754667 c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return N13459929895848246258.k(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z1975157152518754667.class != obj.getClass()) {
            return false;
        }
        Z1975157152518754667 z1975157152518754667 = (Z1975157152518754667) obj;
        return this.d == z1975157152518754667.d && this.a == z1975157152518754667.a && this.c == z1975157152518754667.c && this.b == z1975157152518754667.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
