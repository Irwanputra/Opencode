package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W3619328035049839885 {
    public static final W3619328035049839885 k;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        double[] dArr = S2941385686793915703.h;
        double g0 = (S2941385686793915703.g0(50.0d) * 63.66197723675813d) / 100.0d;
        double max = Math.max(0.1d, 50.0d);
        double[][] dArr2 = U15853425786981391261.e;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double L = V12319504402545346730.L(0.59d, 0.69d, 0.9999999999999998d);
        double exp = (1.0d - (Math.exp(((-g0) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (exp < 0.0d) {
            exp = 0.0d;
        } else if (exp > 1.0d) {
            exp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d6) * exp) + 1.0d) - exp, (((100.0d / d7) * exp) + 1.0d) - exp, (((100.0d / d8) * exp) + 1.0d) - exp};
        double d9 = 5.0d * g0;
        double d10 = 1.0d / (d9 + 1.0d);
        double d11 = d10 * d10 * d10 * d10;
        double d12 = 1.0d - d11;
        double cbrt = (Math.cbrt(d9) * 0.1d * d12 * d12) + (d11 * g0);
        double g02 = S2941385686793915703.g0(max) / dArr[1];
        double sqrt = Math.sqrt(g02) + 1.48d;
        double pow = 0.725d / Math.pow(g02, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d8) / 100.0d, 0.42d)};
        double d13 = dArr7[0];
        double d14 = (d13 * 400.0d) / (d13 + 27.13d);
        double d15 = dArr7[1];
        double d16 = (d15 * 400.0d) / (d15 + 27.13d);
        double d17 = dArr7[2];
        double[] dArr8 = {d14, d16, (400.0d * d17) / (d17 + 27.13d)};
        k = new W3619328035049839885(g02, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * pow, pow, pow, L, 1.0d, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public W3619328035049839885(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f = d;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.g = dArr;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }
}
