package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B12317633641199469521 implements L12639328004344855510 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ B12317633641199469521(W507352207674377208 w507352207674377208, Long l, int i, O13417198602908953591 o13417198602908953591, I1722681268793429505 i1722681268793429505, long j, int i2) {
        this.d = w507352207674377208;
        this.e = l;
        this.c = i;
        this.f = o13417198602908953591;
        this.g = i1722681268793429505;
        this.b = j;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = V16504496955554646429.p(199681);
                ((W507352207674377208) obj6).a((Long) obj5, this.c, (O13417198602908953591) obj4, (I1722681268793429505) obj3, this.b, (M3727281027331139839) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = V16504496955554646429.p(this.c | 1);
                E686369837194379706.j((B13729205492206812220) obj6, this.b, (R14415661131438974095) obj5, (U16834965109098959004) obj4, (T15443218846549482730) obj3, (M3727281027331139839) obj, iP2);
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ B12317633641199469521(B13729205492206812220 b13729205492206812220, long j, R14415661131438974095 r14415661131438974095, U16834965109098959004 u16834965109098959004, T15443218846549482730 t15443218846549482730, int i) {
        this.d = b13729205492206812220;
        this.b = j;
        this.e = r14415661131438974095;
        this.f = u16834965109098959004;
        this.g = t15443218846549482730;
        this.c = i;
    }
}
