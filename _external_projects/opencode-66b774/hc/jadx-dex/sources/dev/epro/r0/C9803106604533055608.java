package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9803106604533055608 implements dev.epro.r0.J13386303774951932313 {
    public final /* synthetic */ dev.epro.r0.L7100317404093621994 a;
    public final /* synthetic */ dev.epro.r0.F4096073349764486348 b;

    public C9803106604533055608(dev.epro.r0.L7100317404093621994 l7100317404093621994, dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        this.a = l7100317404093621994;
        this.b = f4096073349764486348;
    }

    public final java.lang.Object D(long j, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        float fC = dev.epro.r0.L9139634373441254073.c(j);
        dev.epro.r0.L7100317404093621994 l7100317404093621994 = this.a;
        float fI = l7100317404093621994.d.i();
        float fC2 = l7100317404093621994.d.e().c();
        if (fC >= 0.0f || fI <= fC2) {
            j = 0;
        } else {
            this.b.invoke(new java.lang.Float(fC));
        }
        return new dev.epro.r0.L9139634373441254073(j);
    }

    public final long G0(int i, long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        dev.epro.r0.F9886074403848142923 f9886074403848142923 = this.a.d;
        float fH = f9886074403848142923.h(fIntBitsToFloat);
        dev.epro.r0.O15319392248629494012 o15319392248629494012 = f9886074403848142923.f;
        float fG = java.lang.Float.isNaN(o15319392248629494012.g()) ? 0.0f : o15319392248629494012.g();
        o15319392248629494012.h(fH);
        return a(fH - fG);
    }

    public final java.lang.Object I0(long j, long j2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        this.b.invoke(new java.lang.Float(dev.epro.r0.L9139634373441254073.c(j2)));
        return new dev.epro.r0.L9139634373441254073(j2);
    }

    public final long a(float f) {
        return (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32);
    }

    public final long c0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        dev.epro.r0.F9886074403848142923 f9886074403848142923 = this.a.d;
        float fH = f9886074403848142923.h(java.lang.Float.intBitsToFloat((int) (4294967295L & j2)));
        dev.epro.r0.O15319392248629494012 o15319392248629494012 = f9886074403848142923.f;
        float fG = java.lang.Float.isNaN(o15319392248629494012.g()) ? 0.0f : o15319392248629494012.g();
        o15319392248629494012.h(fH);
        return a(fH - fG);
    }
}
