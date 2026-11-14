package dev.epro.r0;

import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N15736424885242183871 {
    public final double a;
    public final double b;

    public N15736424885242183871(double d, double d2) {
        new HashMap();
        this.a = d;
        this.b = d2;
    }

    public static N15736424885242183871 a(double d, double d2) {
        D17066879453943832644 d17066879453943832644 = new D17066879453943832644(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                W10545060672287394780.a(d17066879453943832644.a, d17066879453943832644.b, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = d17066879453943832644.a(i3) < d17066879453943832644.a(i4);
            if (d17066879453943832644.a(i3) >= d17066879453943832644.b - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        W10545060672287394780.a(d17066879453943832644.a, d17066879453943832644.b, i2);
                        break;
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        return new N15736424885242183871(d, d2);
    }
}
