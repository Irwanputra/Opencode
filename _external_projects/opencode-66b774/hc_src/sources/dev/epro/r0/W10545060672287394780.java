package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W10545060672287394780 {
    public final double a;
    public final double b;
    public final double c;
    public final int d;

    public W10545060672287394780(int i) {
        this.d = i;
        W3619328035049839885 w3619328035049839885 = W3619328035049839885.k;
        int i2 = i & 255;
        double O = S2941385686793915703.O((16711680 & i) >> 16);
        double O2 = S2941385686793915703.O((65280 & i) >> 8);
        double O3 = S2941385686793915703.O(i2);
        double d = (0.18051042d * O3) + (0.35762064d * O2) + (0.41233895d * O);
        double d2 = (0.0722d * O3) + (0.7152d * O2) + (0.2126d * O);
        double d3 = (O3 * 0.95034478d) + (O2 * 0.11916382d) + (O * 0.01932141d);
        double[][] dArr = U15853425786981391261.e;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d6 = (d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]);
        double[] dArr5 = w3619328035049839885.g;
        double d7 = w3619328035049839885.i;
        double d8 = w3619328035049839885.d;
        double d9 = w3619328035049839885.a;
        double d10 = dArr5[0] * d4;
        double d11 = dArr5[1] * d5;
        double d12 = dArr5[2] * d6;
        double d13 = w3619328035049839885.h;
        double pow = Math.pow((Math.abs(d10) * d13) / 100.0d, 0.42d);
        double pow2 = Math.pow((Math.abs(d11) * d13) / 100.0d, 0.42d);
        double pow3 = Math.pow((Math.abs(d12) * d13) / 100.0d, 0.42d);
        double signum = ((Math.signum(d10) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d11) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d12) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d14 = ((((-12.0d) * signum2) + (signum * 11.0d)) + signum3) / 11.0d;
        double d15 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d16 = signum2 * 20.0d;
        double d17 = ((21.0d * signum3) + ((signum * 20.0d) + d16)) / 20.0d;
        double d18 = (((signum * 40.0d) + d16) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d15, d14));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double radians = Math.toRadians(degrees);
        double pow4 = (Math.pow((d18 * w3619328035049839885.b) / d9, w3619328035049839885.j * d8) * 100.0d) / 100.0d;
        Math.sqrt(pow4);
        double d19 = d9 + 4.0d;
        double pow5 = Math.pow((Math.hypot(d14, d15) * (((((Math.cos(Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * w3619328035049839885.e) * w3619328035049839885.c)) / (d17 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, w3619328035049839885.f), 0.73d);
        double sqrt = Math.sqrt(pow4) * pow5;
        Math.sqrt((pow5 * d8) / d19);
        Math.log1p(sqrt * d7 * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        this.a = degrees;
        this.b = sqrt;
        this.c = (S2941385686793915703.N(V12319504402545346730.O(new double[]{S2941385686793915703.O((i >> 16) & 255), S2941385686793915703.O((i >> 8) & 255), S2941385686793915703.O(i2)}, S2941385686793915703.g)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ba, code lost:
    
        if (r0[1] > 100.01d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c0, code lost:
    
        if (r0[2] <= 100.01d) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c3, code lost:
    
        r0 = (dev.epro.r0.S2941385686793915703.B(r0[2]) & 255) | ((((dev.epro.r0.S2941385686793915703.B(r1) & 255) << 16) | r29) | ((dev.epro.r0.S2941385686793915703.B(r0[1]) & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ab, code lost:
    
        r1 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b4, code lost:
    
        if (r1 > 100.01d) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.W10545060672287394780 a(double r45, double r47, double r49) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W10545060672287394780.a(double, double, double):dev.epro.r0.W10545060672287394780");
    }
}
