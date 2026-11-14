package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B1517373391234519490 implements dev.epro.r0.J13386303774951932313 {
    public final dev.epro.r0.G16768067413993841943 a;
    public final dev.epro.r0.F10342546226345611902 b;

    public B1517373391234519490(dev.epro.r0.G16768067413993841943 g16768067413993841943, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        this.a = g16768067413993841943;
        this.b = f10342546226345611902;
    }

    public final long G0(int i, long j) {
        dev.epro.r0.G16768067413993841943 g16768067413993841943 = this.a;
        dev.epro.r0.N3336634644320470588 n3336634644320470588 = ((dev.epro.r0.X16625187937554653603) g16768067413993841943).d;
        if (i != 1 || java.lang.Math.abs(((dev.epro.r0.O15319392248629494012) n3336634644320470588.d).g()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        dev.epro.r0.Z10384052377193817149 z10384052377193817149K = g16768067413993841943.k();
        float fG = ((dev.epro.r0.O15319392248629494012) n3336634644320470588.d).g() * g16768067413993841943.m();
        float f = ((z10384052377193817149K.b + z10384052377193817149K.c) * (-java.lang.Math.signum(((dev.epro.r0.O15319392248629494012) n3336634644320470588.d).g()))) + fG;
        if (((dev.epro.r0.O15319392248629494012) n3336634644320470588.d).g() > 0.0f) {
            fG = f;
            f = fG;
        }
        float fP = dev.epro.r0.W7808703833045379622.p(java.lang.Float.intBitsToFloat(i2), fG, f);
        boolean z = this.b == dev.epro.r0.F10342546226345611902.b;
        dev.epro.r0.V16232943500580701817 v16232943500580701817 = ((dev.epro.r0.X16625187937554653603) g16768067413993841943).k;
        return (((long) java.lang.Float.floatToRawIntBits(z ? v16232943500580701817.d(fP) : -v16232943500580701817.d(-fP))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }

    public final java.lang.Object I0(long j, long j2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return new dev.epro.r0.L9139634373441254073(dev.epro.r0.L9139634373441254073.a(j2, 0.0f, 0.0f, 1));
    }

    public final long c0(int i, long j, long j2) {
        if (i != 2 || java.lang.Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new java.util.concurrent.CancellationException("Scroll cancelled");
    }
}
