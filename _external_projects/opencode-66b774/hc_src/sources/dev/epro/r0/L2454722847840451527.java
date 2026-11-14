package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L2454722847840451527 implements L12639328004344855510 {
    public final /* synthetic */ I1722681268793429505 a;
    public final /* synthetic */ D7996823394324996916 b;
    public final /* synthetic */ W1972671267364756056 c;
    public final /* synthetic */ G17854281415623469737 d;
    public final /* synthetic */ I5573661370475160895 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ T15443218846549482730 h;

    public L2454722847840451527(I1722681268793429505 i1722681268793429505, D7996823394324996916 d7996823394324996916, W1972671267364756056 w1972671267364756056, G17854281415623469737 g17854281415623469737, I5573661370475160895 i5573661370475160895, long j, float f, T15443218846549482730 t15443218846549482730) {
        this.a = i1722681268793429505;
        this.b = d7996823394324996916;
        this.c = w1972671267364756056;
        this.d = g17854281415623469737;
        this.e = i5573661370475160895;
        this.f = j;
        this.g = f;
        this.h = t15443218846549482730;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int intValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
            D15445857918358799638.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, m3727281027331139839, 384);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
