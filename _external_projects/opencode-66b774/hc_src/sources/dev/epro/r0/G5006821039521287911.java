package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G5006821039521287911 implements K6937929821947263863 {
    public final float a;
    public final P11880139108790912507 b;

    public G5006821039521287911(float f, float f2, float f3) {
        this.a = f3;
        P11880139108790912507 p11880139108790912507 = new P11880139108790912507();
        p11880139108790912507.a = 1.0f;
        p11880139108790912507.b = Math.sqrt(50.0d);
        p11880139108790912507.c = 1.0f;
        if (f < 0.0f) {
            H18335142247802896069.a("Damping ratio must be non-negative");
        }
        p11880139108790912507.c = f;
        double d = p11880139108790912507.b;
        if (((float) (d * d)) <= 0.0f) {
            H18335142247802896069.a("Spring stiffness constant must be positive.");
        }
        p11880139108790912507.b = Math.sqrt(f2);
        this.b = p11880139108790912507;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    @Override // dev.epro.r0.K6937929821947263863
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G5006821039521287911.b(float, float, float):long");
    }

    @Override // dev.epro.r0.K6937929821947263863
    public final float c(float f, float f2, float f3, long j) {
        P11880139108790912507 p11880139108790912507 = this.b;
        p11880139108790912507.a = f2;
        return Float.intBitsToFloat((int) (p11880139108790912507.a(f, f3, j / 1000000) >> 32));
    }

    @Override // dev.epro.r0.K6937929821947263863
    public final float d(float f, float f2, float f3, long j) {
        P11880139108790912507 p11880139108790912507 = this.b;
        p11880139108790912507.a = f2;
        return Float.intBitsToFloat((int) (p11880139108790912507.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // dev.epro.r0.K6937929821947263863
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }

    public /* synthetic */ G5006821039521287911(float f, float f2) {
        this(f, f2, 0.01f);
    }
}
