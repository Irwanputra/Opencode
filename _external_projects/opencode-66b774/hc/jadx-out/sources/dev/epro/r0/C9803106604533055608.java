package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C9803106604533055608 implements J13386303774951932313 {
    public final /* synthetic */ L7100317404093621994 a;
    public final /* synthetic */ F4096073349764486348 b;

    public C9803106604533055608(L7100317404093621994 l7100317404093621994, F4096073349764486348 f4096073349764486348) {
        this.a = l7100317404093621994;
        this.b = f4096073349764486348;
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final Object D(long j, R4833348786910499294 r4833348786910499294) {
        float fC = L9139634373441254073.c(j);
        L7100317404093621994 l7100317404093621994 = this.a;
        float fI = l7100317404093621994.d.i();
        float fC2 = l7100317404093621994.d.e().c();
        if (fC >= 0.0f || fI <= fC2) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new L9139634373441254073(j);
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final long G0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        F9886074403848142923 f9886074403848142923 = this.a.d;
        float fH = f9886074403848142923.h(fIntBitsToFloat);
        O15319392248629494012 o15319392248629494012 = f9886074403848142923.f;
        float fG = Float.isNaN(o15319392248629494012.g()) ? 0.0f : o15319392248629494012.g();
        o15319392248629494012.h(fH);
        return a(fH - fG);
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final Object I0(long j, long j2, R4833348786910499294 r4833348786910499294) {
        this.b.invoke(new Float(L9139634373441254073.c(j2)));
        return new L9139634373441254073(j2);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // dev.epro.r0.J13386303774951932313
    public final long c0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        F9886074403848142923 f9886074403848142923 = this.a.d;
        float fH = f9886074403848142923.h(Float.intBitsToFloat((int) (4294967295L & j2)));
        O15319392248629494012 o15319392248629494012 = f9886074403848142923.f;
        float fG = Float.isNaN(o15319392248629494012.g()) ? 0.0f : o15319392248629494012.g();
        o15319392248629494012.h(fH);
        return a(fH - fG);
    }
}
