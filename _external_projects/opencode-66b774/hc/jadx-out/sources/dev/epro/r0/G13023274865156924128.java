package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G13023274865156924128 {
    public static final P5124777957357031757 a;

    static {
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
        a = J3301701597851028733.u("xn--");
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        D11988991656201568495.h(i, "unexpected digit: ");
        return 0;
    }
}
