package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class T3343477844316858848 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ W2648179124386498421 b;

    public /* synthetic */ T3343477844316858848(W2648179124386498421 w2648179124386498421, byte b) {
        this.a = b;
        this.b = w2648179124386498421;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W2648179124386498421 w2648179124386498421 = this.b;
        switch (b) {
            case 0:
                w2648179124386498421.d = true;
                w2648179124386498421.f.invoke();
                return o9245300239821758723;
            default:
                L17598299826319227431 l17598299826319227431 = (L17598299826319227431) obj;
                S13992522259207468407 s13992522259207468407 = w2648179124386498421.b;
                float f = w2648179124386498421.k;
                float f2 = w2648179124386498421.l;
                Q7316561721656982910 R = l17598299826319227431.R();
                long F = R.F();
                R.A().l();
                try {
                    ((H12843822278061842084) R.b).H(f, f2, 0L);
                    s13992522259207468407.a(l17598299826319227431);
                    return o9245300239821758723;
                } finally {
                    L11610354117192841236.w(R, F);
                }
        }
    }
}
