package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R1911624190916196378 {
    public static final G1892398518770611911 a = new G1892398518770611911(0);

    public static final G1892398518770611911 a(int... iArr) {
        G1892398518770611911 g1892398518770611911 = new G1892398518770611911(iArr.length);
        int i = g1892398518770611911.b;
        if (i < 0) {
            W4415201450379021245.a("");
            return null;
        }
        if (iArr.length == 0) {
            return g1892398518770611911;
        }
        g1892398518770611911.b(iArr.length + i);
        int[] iArr2 = g1892398518770611911.a;
        int i2 = g1892398518770611911.b;
        if (i != i2) {
            O5378677881740157249.m0(iArr.length + i, i, i2, iArr2, iArr2);
        }
        O5378677881740157249.r0(i, 0, 12, iArr, iArr2);
        g1892398518770611911.b += iArr.length;
        return g1892398518770611911;
    }
}
