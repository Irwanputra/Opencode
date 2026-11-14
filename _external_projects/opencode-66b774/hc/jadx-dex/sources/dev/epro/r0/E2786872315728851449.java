package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class E2786872315728851449 implements dev.epro.r0.Q12717119941057887287 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.P4785861829097979576 b;

    public /* synthetic */ E2786872315728851449(dev.epro.r0.P4785861829097979576 p4785861829097979576, byte b) {
        this.a = b;
        this.b = p4785861829097979576;
    }

    public final double g(double d) {
        byte b = this.a;
        dev.epro.r0.P4785861829097979576 p4785861829097979576 = this.b;
        switch (b) {
            case 0:
                float[] fArr = dev.epro.r0.E4238948680093459570.a;
                return dev.epro.r0.E4238948680093459570.a(p4785861829097979576, d);
            case 1:
                float[] fArr2 = dev.epro.r0.E4238948680093459570.a;
                return dev.epro.r0.E4238948680093459570.c(p4785861829097979576, d);
            case 2:
                double d2 = p4785861829097979576.b;
                return d >= p4785861829097979576.e ? java.lang.Math.pow((d2 * d) + p4785861829097979576.c, p4785861829097979576.a) : p4785861829097979576.d * d;
            case 3:
                double d3 = p4785861829097979576.b;
                double d4 = p4785861829097979576.c;
                double d5 = p4785861829097979576.d;
                return d >= p4785861829097979576.e ? java.lang.Math.pow((d3 * d) + d4, p4785861829097979576.a) + p4785861829097979576.f : (d5 * d) + p4785861829097979576.g;
            case 4:
                float[] fArr3 = dev.epro.r0.E4238948680093459570.a;
                return dev.epro.r0.E4238948680093459570.b(p4785861829097979576, d);
            case 5:
                float[] fArr4 = dev.epro.r0.E4238948680093459570.a;
                return dev.epro.r0.E4238948680093459570.d(p4785861829097979576, d);
            case 6:
                double d6 = p4785861829097979576.b;
                double d7 = p4785861829097979576.c;
                double d8 = p4785861829097979576.d;
                return d >= p4785861829097979576.e * d8 ? (java.lang.Math.pow(d, 1.0d / p4785861829097979576.a) - d7) / d6 : d / d8;
            default:
                double d9 = p4785861829097979576.b;
                double d10 = p4785861829097979576.c;
                double d11 = p4785861829097979576.d;
                return d >= p4785861829097979576.e * d11 ? (java.lang.Math.pow(d - p4785861829097979576.f, 1.0d / p4785861829097979576.a) - d10) / d9 : (d - p4785861829097979576.g) / d11;
        }
    }
}
