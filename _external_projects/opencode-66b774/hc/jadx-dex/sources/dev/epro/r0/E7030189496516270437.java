package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E7030189496516270437 {
    public static int a(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double dPow = d4 > 0.0031308d ? (java.lang.Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double dPow2 = d5 > 0.0031308d ? (java.lang.Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double dPow3 = d6 > 0.0031308d ? (java.lang.Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int iRound = (int) java.lang.Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : java.lang.Math.min(iRound, 255);
        int iRound2 = (int) java.lang.Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : java.lang.Math.min(iRound2, 255);
        int iRound3 = (int) java.lang.Math.round(dPow3 * 255.0d);
        return android.graphics.Color.rgb(iMin, iMin2, iRound3 >= 0 ? java.lang.Math.min(iRound3, 255) : 0);
    }

    public static int b(int i, int i2) {
        int iAlpha = android.graphics.Color.alpha(i2);
        int iAlpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return android.graphics.Color.argb(i3, c(android.graphics.Color.red(i), iAlpha2, android.graphics.Color.red(i2), iAlpha, i3), c(android.graphics.Color.green(i), iAlpha2, android.graphics.Color.green(i2), iAlpha, i3), c(android.graphics.Color.blue(i), iAlpha2, android.graphics.Color.blue(i2), iAlpha, i3));
    }

    public static int c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int d(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        dev.epro.r0.S10973172697741180971.j("alpha must be between 0 and 255.");
        return 0;
    }
}
