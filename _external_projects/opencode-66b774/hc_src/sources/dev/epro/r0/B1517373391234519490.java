package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B1517373391234519490 implements J13386303774951932313 {
    public final G16768067413993841943 a;
    public final F10342546226345611902 b;

    public B1517373391234519490(G16768067413993841943 g16768067413993841943, F10342546226345611902 f10342546226345611902) {
        this.a = g16768067413993841943;
        this.b = f10342546226345611902;
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final long G0(int i, long j) {
        G16768067413993841943 g16768067413993841943 = this.a;
        N3336634644320470588 n3336634644320470588 = g16768067413993841943.d;
        if (i != 1 || Math.abs(((O15319392248629494012) n3336634644320470588.d).g()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        Z10384052377193817149 k = g16768067413993841943.k();
        float g = ((O15319392248629494012) n3336634644320470588.d).g() * g16768067413993841943.m();
        float f = ((k.b + k.c) * (-Math.signum(((O15319392248629494012) n3336634644320470588.d).g()))) + g;
        if (((O15319392248629494012) n3336634644320470588.d).g() > 0.0f) {
            g = f;
            f = g;
        }
        float p = W7808703833045379622.p(Float.intBitsToFloat(i2), g, f);
        boolean z = this.b == F10342546226345611902.b;
        V16232943500580701817 v16232943500580701817 = g16768067413993841943.k;
        return (Float.floatToRawIntBits(z ? v16232943500580701817.d(p) : -v16232943500580701817.d(-p)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final Object I0(long j, long j2, R4833348786910499294 r4833348786910499294) {
        return new L9139634373441254073(L9139634373441254073.a(j2, 0.0f, 0.0f, 1));
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final long c0(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
