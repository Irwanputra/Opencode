package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X5076676067399127345 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ F18142507606280211225 b;
    public final /* synthetic */ A81664135048468380 c;

    public /* synthetic */ X5076676067399127345(F18142507606280211225 f18142507606280211225, A81664135048468380 a81664135048468380, byte b) {
        this.a = b;
        this.b = f18142507606280211225;
        this.c = a81664135048468380;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        A81664135048468380 a81664135048468380 = this.c;
        F18142507606280211225 f18142507606280211225 = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                f18142507606280211225.a(fFloatValue, fFloatValue2);
                a81664135048468380.a = fFloatValue;
                break;
            default:
                f18142507606280211225.a(fFloatValue, fFloatValue2);
                a81664135048468380.a = fFloatValue;
                break;
        }
        return o9245300239821758723;
    }
}
