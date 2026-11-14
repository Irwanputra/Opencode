package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T9619163566559319688 {
    public static final T9619163566559319688 d = new T9619163566559319688(T9539397981579136790.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public T9619163566559319688(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9619163566559319688)) {
            return false;
        }
        T9619163566559319688 t9619163566559319688 = (T9619163566559319688) obj;
        float f = t9619163566559319688.a;
        float f2 = T9539397981579136790.b;
        return Float.compare(this.a, f) == 0 && this.b == t9619163566559319688.b && this.c == t9619163566559319688.c;
    }

    public final int hashCode() {
        float f = T9539397981579136790.b;
        return Integer.hashCode(this.c) + X2485016533998461232.f(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strB = T9539397981579136790.b(this.a);
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        return G6547577305291411977.u(G6547577305291411977.y("LineHeightStyle(alignment=", strB, ", trim=", str2, ",mode="), str, ")");
    }
}
