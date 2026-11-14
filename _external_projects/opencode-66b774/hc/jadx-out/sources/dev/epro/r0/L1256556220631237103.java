package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L1256556220631237103 {
    public O3228356295430981133 a;
    public R3103059035698929241 b;
    public float c = 1.0f;
    public F10342546226345611902 d = F10342546226345611902.a;

    public abstract void a(float f);

    public abstract void b(R3103059035698929241 r3103059035698929241);

    public final void c(L17598299826319227431 l17598299826319227431, long j, float f, R3103059035698929241 r3103059035698929241) {
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!S10823041268949770285.t(this.b, r3103059035698929241)) {
            b(r3103059035698929241);
            this.b = r3103059035698929241;
        }
        F10342546226345611902 layoutDirection = l17598299826319227431.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (l17598299826319227431.e() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (l17598299826319227431.e() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((H12843822278061842084) l17598299826319227431.R().b).E(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(l17598299826319227431);
                }
            } finally {
                ((H12843822278061842084) l17598299826319227431.R().b).E(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(L17598299826319227431 l17598299826319227431);
}
