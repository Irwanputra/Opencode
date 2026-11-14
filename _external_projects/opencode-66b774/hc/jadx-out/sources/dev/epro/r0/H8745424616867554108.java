package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H8745424616867554108 extends G5298154673482189769 {
    public static final K2042933864045806308 r = new K2042933864045806308(0);
    public final Q9435736031653407531 d;
    public final float e;
    public final float f;
    public final P4785861829097979576 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final Q12717119941057887287 k;
    public final D8340673431449205037 l;
    public final F12101231409752321762 m;
    public final Q12717119941057887287 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D8340673431449205037 f278o;
    public final F12101231409752321762 p;
    public final boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H8745424616867554108(java.lang.String r36, float[] r37, dev.epro.r0.Q9435736031653407531 r38, float[] r39, dev.epro.r0.Q12717119941057887287 r40, dev.epro.r0.Q12717119941057887287 r41, float r42, float r43, dev.epro.r0.P4785861829097979576 r44, int r45) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H8745424616867554108.<init>(java.lang.String, float[], dev.epro.r0.Q9435736031653407531, float[], dev.epro.r0.Q12717119941057887287, dev.epro.r0.Q12717119941057887287, float, float, dev.epro.r0.P4785861829097979576, int):void");
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final float a(int i) {
        return this.f;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final float b(int i) {
        return this.e;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final boolean c() {
        return this.q;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final long d(float f, float f2, float f3) {
        double d = f;
        F12101231409752321762 f12101231409752321762 = this.p;
        float fG = (float) f12101231409752321762.g(d);
        float fG2 = (float) f12101231409752321762.g(f2);
        float fG3 = (float) f12101231409752321762.g(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fG3) + ((fArr[3] * fG2) + (fArr[0] * fG)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fG3) + (fArr[4] * fG2) + (fArr[1] * fG))));
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final float e(float f, float f2, float f3) {
        double d = f;
        F12101231409752321762 f12101231409752321762 = this.p;
        float fG = (float) f12101231409752321762.g(d);
        float fG2 = (float) f12101231409752321762.g(f2);
        float fG3 = (float) f12101231409752321762.g(f3);
        float[] fArr = this.i;
        return (fArr[8] * fG3) + (fArr[5] * fG2) + (fArr[2] * fG);
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H8745424616867554108.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        H8745424616867554108 h8745424616867554108 = (H8745424616867554108) obj;
        if (Float.compare(h8745424616867554108.e, this.e) != 0 || Float.compare(h8745424616867554108.f, this.f) != 0 || !S10823041268949770285.t(this.d, h8745424616867554108.d) || !Arrays.equals(this.h, h8745424616867554108.h)) {
            return false;
        }
        P4785861829097979576 p4785861829097979576 = h8745424616867554108.g;
        P4785861829097979576 p47858618290979795762 = this.g;
        if (p47858618290979795762 != null) {
            return S10823041268949770285.t(p47858618290979795762, p4785861829097979576);
        }
        if (p4785861829097979576 == null) {
            return true;
        }
        if (S10823041268949770285.t(this.k, h8745424616867554108.k)) {
            return S10823041268949770285.t(this.n, h8745424616867554108.n);
        }
        return false;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final long f(float f, float f2, float f3, float f4, G5298154673482189769 g5298154673482189769) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        F12101231409752321762 f12101231409752321762 = this.m;
        return J8045362843799184672.d((float) f12101231409752321762.g(f5), (float) f12101231409752321762.g(f6), (float) f12101231409752321762.g(f7), f4, g5298154673482189769);
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        P4785861829097979576 p4785861829097979576 = this.g;
        int iHashCode2 = iFloatToIntBits2 + (p4785861829097979576 != null ? p4785861829097979576.hashCode() : 0);
        if (p4785861829097979576 != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public H8745424616867554108(String str, float[] fArr, Q9435736031653407531 q9435736031653407531, final P4785861829097979576 p4785861829097979576, int i) {
        double d;
        Q12717119941057887287 q12717119941057887287;
        Q12717119941057887287 q127171199410578872872;
        double d2 = p4785861829097979576.a;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = d2 == -3.0d;
        double d3 = p4785861829097979576.g;
        double d4 = p4785861829097979576.f;
        if (z) {
            d = -3.0d;
            final byte b3 = 4;
            q12717119941057887287 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d5) {
                    byte b4 = b3;
                    P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                    switch (b4) {
                        case 0:
                            float[] fArr2 = E4238948680093459570.a;
                            return E4238948680093459570.a(p47858618290979795762, d5);
                        case 1:
                            float[] fArr3 = E4238948680093459570.a;
                            return E4238948680093459570.c(p47858618290979795762, d5);
                        case 2:
                            double d6 = p47858618290979795762.b;
                            return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                        case 3:
                            double d7 = p47858618290979795762.b;
                            double d8 = p47858618290979795762.c;
                            double d9 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                        case 4:
                            float[] fArr4 = E4238948680093459570.a;
                            return E4238948680093459570.b(p47858618290979795762, d5);
                        case 5:
                            float[] fArr5 = E4238948680093459570.a;
                            return E4238948680093459570.d(p47858618290979795762, d5);
                        case 6:
                            double d10 = p47858618290979795762.b;
                            double d11 = p47858618290979795762.c;
                            double d12 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = p47858618290979795762.b;
                            double d14 = p47858618290979795762.c;
                            double d15 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final byte b4 = 5;
                q12717119941057887287 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                    @Override // dev.epro.r0.Q12717119941057887287
                    public final double g(double d5) {
                        byte b42 = b4;
                        P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                        switch (b42) {
                            case 0:
                                float[] fArr2 = E4238948680093459570.a;
                                return E4238948680093459570.a(p47858618290979795762, d5);
                            case 1:
                                float[] fArr3 = E4238948680093459570.a;
                                return E4238948680093459570.c(p47858618290979795762, d5);
                            case 2:
                                double d6 = p47858618290979795762.b;
                                return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                            case 3:
                                double d7 = p47858618290979795762.b;
                                double d8 = p47858618290979795762.c;
                                double d9 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                            case 4:
                                float[] fArr4 = E4238948680093459570.a;
                                return E4238948680093459570.b(p47858618290979795762, d5);
                            case 5:
                                float[] fArr5 = E4238948680093459570.a;
                                return E4238948680093459570.d(p47858618290979795762, d5);
                            case 6:
                                double d10 = p47858618290979795762.b;
                                double d11 = p47858618290979795762.c;
                                double d12 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = p47858618290979795762.b;
                                double d14 = p47858618290979795762.c;
                                double d15 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final byte b5 = 6;
                q12717119941057887287 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                    @Override // dev.epro.r0.Q12717119941057887287
                    public final double g(double d5) {
                        byte b42 = b5;
                        P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                        switch (b42) {
                            case 0:
                                float[] fArr2 = E4238948680093459570.a;
                                return E4238948680093459570.a(p47858618290979795762, d5);
                            case 1:
                                float[] fArr3 = E4238948680093459570.a;
                                return E4238948680093459570.c(p47858618290979795762, d5);
                            case 2:
                                double d6 = p47858618290979795762.b;
                                return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                            case 3:
                                double d7 = p47858618290979795762.b;
                                double d8 = p47858618290979795762.c;
                                double d9 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                            case 4:
                                float[] fArr4 = E4238948680093459570.a;
                                return E4238948680093459570.b(p47858618290979795762, d5);
                            case 5:
                                float[] fArr5 = E4238948680093459570.a;
                                return E4238948680093459570.d(p47858618290979795762, d5);
                            case 6:
                                double d10 = p47858618290979795762.b;
                                double d11 = p47858618290979795762.c;
                                double d12 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = p47858618290979795762.b;
                                double d14 = p47858618290979795762.c;
                                double d15 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                        }
                    }
                };
            } else {
                final byte b6 = 7;
                q12717119941057887287 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                    @Override // dev.epro.r0.Q12717119941057887287
                    public final double g(double d5) {
                        byte b42 = b6;
                        P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                        switch (b42) {
                            case 0:
                                float[] fArr2 = E4238948680093459570.a;
                                return E4238948680093459570.a(p47858618290979795762, d5);
                            case 1:
                                float[] fArr3 = E4238948680093459570.a;
                                return E4238948680093459570.c(p47858618290979795762, d5);
                            case 2:
                                double d6 = p47858618290979795762.b;
                                return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                            case 3:
                                double d7 = p47858618290979795762.b;
                                double d8 = p47858618290979795762.c;
                                double d9 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                            case 4:
                                float[] fArr4 = E4238948680093459570.a;
                                return E4238948680093459570.b(p47858618290979795762, d5);
                            case 5:
                                float[] fArr5 = E4238948680093459570.a;
                                return E4238948680093459570.d(p47858618290979795762, d5);
                            case 6:
                                double d10 = p47858618290979795762.b;
                                double d11 = p47858618290979795762.c;
                                double d12 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = p47858618290979795762.b;
                                double d14 = p47858618290979795762.c;
                                double d15 = p47858618290979795762.d;
                                return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            q127171199410578872872 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d5) {
                    byte b42 = b;
                    P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = E4238948680093459570.a;
                            return E4238948680093459570.a(p47858618290979795762, d5);
                        case 1:
                            float[] fArr3 = E4238948680093459570.a;
                            return E4238948680093459570.c(p47858618290979795762, d5);
                        case 2:
                            double d6 = p47858618290979795762.b;
                            return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                        case 3:
                            double d7 = p47858618290979795762.b;
                            double d8 = p47858618290979795762.c;
                            double d9 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                        case 4:
                            float[] fArr4 = E4238948680093459570.a;
                            return E4238948680093459570.b(p47858618290979795762, d5);
                        case 5:
                            float[] fArr5 = E4238948680093459570.a;
                            return E4238948680093459570.d(p47858618290979795762, d5);
                        case 6:
                            double d10 = p47858618290979795762.b;
                            double d11 = p47858618290979795762.c;
                            double d12 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = p47858618290979795762.b;
                            double d14 = p47858618290979795762.c;
                            double d15 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            q127171199410578872872 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d5) {
                    byte b42 = b2;
                    P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = E4238948680093459570.a;
                            return E4238948680093459570.a(p47858618290979795762, d5);
                        case 1:
                            float[] fArr3 = E4238948680093459570.a;
                            return E4238948680093459570.c(p47858618290979795762, d5);
                        case 2:
                            double d6 = p47858618290979795762.b;
                            return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                        case 3:
                            double d7 = p47858618290979795762.b;
                            double d8 = p47858618290979795762.c;
                            double d9 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                        case 4:
                            float[] fArr4 = E4238948680093459570.a;
                            return E4238948680093459570.b(p47858618290979795762, d5);
                        case 5:
                            float[] fArr5 = E4238948680093459570.a;
                            return E4238948680093459570.d(p47858618290979795762, d5);
                        case 6:
                            double d10 = p47858618290979795762.b;
                            double d11 = p47858618290979795762.c;
                            double d12 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = p47858618290979795762.b;
                            double d14 = p47858618290979795762.c;
                            double d15 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final byte b7 = 2;
            q127171199410578872872 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d5) {
                    byte b42 = b7;
                    P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = E4238948680093459570.a;
                            return E4238948680093459570.a(p47858618290979795762, d5);
                        case 1:
                            float[] fArr3 = E4238948680093459570.a;
                            return E4238948680093459570.c(p47858618290979795762, d5);
                        case 2:
                            double d6 = p47858618290979795762.b;
                            return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                        case 3:
                            double d7 = p47858618290979795762.b;
                            double d8 = p47858618290979795762.c;
                            double d9 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                        case 4:
                            float[] fArr4 = E4238948680093459570.a;
                            return E4238948680093459570.b(p47858618290979795762, d5);
                        case 5:
                            float[] fArr5 = E4238948680093459570.a;
                            return E4238948680093459570.d(p47858618290979795762, d5);
                        case 6:
                            double d10 = p47858618290979795762.b;
                            double d11 = p47858618290979795762.c;
                            double d12 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = p47858618290979795762.b;
                            double d14 = p47858618290979795762.c;
                            double d15 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                    }
                }
            };
        } else {
            final byte b8 = 3;
            q127171199410578872872 = new Q12717119941057887287() { // from class: dev.epro.r0.E2786872315728851449
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d5) {
                    byte b42 = b8;
                    P4785861829097979576 p47858618290979795762 = p4785861829097979576;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = E4238948680093459570.a;
                            return E4238948680093459570.a(p47858618290979795762, d5);
                        case 1:
                            float[] fArr3 = E4238948680093459570.a;
                            return E4238948680093459570.c(p47858618290979795762, d5);
                        case 2:
                            double d6 = p47858618290979795762.b;
                            return d5 >= p47858618290979795762.e ? Math.pow((d6 * d5) + p47858618290979795762.c, p47858618290979795762.a) : p47858618290979795762.d * d5;
                        case 3:
                            double d7 = p47858618290979795762.b;
                            double d8 = p47858618290979795762.c;
                            double d9 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e ? Math.pow((d7 * d5) + d8, p47858618290979795762.a) + p47858618290979795762.f : (d9 * d5) + p47858618290979795762.g;
                        case 4:
                            float[] fArr4 = E4238948680093459570.a;
                            return E4238948680093459570.b(p47858618290979795762, d5);
                        case 5:
                            float[] fArr5 = E4238948680093459570.a;
                            return E4238948680093459570.d(p47858618290979795762, d5);
                        case 6:
                            double d10 = p47858618290979795762.b;
                            double d11 = p47858618290979795762.c;
                            double d12 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d12 ? (Math.pow(d5, 1.0d / p47858618290979795762.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = p47858618290979795762.b;
                            double d14 = p47858618290979795762.c;
                            double d15 = p47858618290979795762.d;
                            return d5 >= p47858618290979795762.e * d15 ? (Math.pow(d5 - p47858618290979795762.f, 1.0d / p47858618290979795762.a) - d14) / d13 : (d5 - p47858618290979795762.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, q9435736031653407531, null, q12717119941057887287, q127171199410578872872, 0.0f, 1.0f, p4785861829097979576, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public H8745424616867554108(String str, float[] fArr, Q9435736031653407531 q9435736031653407531, final double d, float f, float f2, int i) {
        Q12717119941057887287 q12717119941057887287;
        Q12717119941057887287 q127171199410578872872 = r;
        if (d == 1.0d) {
            q12717119941057887287 = q127171199410578872872;
        } else {
            final byte b = 0;
            q12717119941057887287 = new Q12717119941057887287() { // from class: dev.epro.r0.T4148991409988489332
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d2) {
                    switch (b) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final byte b2 = 1;
            q127171199410578872872 = new Q12717119941057887287() { // from class: dev.epro.r0.T4148991409988489332
                @Override // dev.epro.r0.Q12717119941057887287
                public final double g(double d2) {
                    switch (b2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        Q12717119941057887287 q127171199410578872873 = q127171199410578872872;
        this(str, fArr, q9435736031653407531, null, q12717119941057887287, q127171199410578872873, f, f2, new P4785861829097979576(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
