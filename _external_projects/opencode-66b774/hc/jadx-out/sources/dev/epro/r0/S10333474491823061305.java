package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S10333474491823061305 implements L12639328004344855510 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ S10333474491823061305(long j, S16571168858015125610 s16571168858015125610, L12639328004344855510 l12639328004344855510, int i) {
        this.b = j;
        this.d = s16571168858015125610;
        this.e = l12639328004344855510;
        this.c = i;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = V16504496955554646429.p(3121);
                ((W507352207674377208) obj4).b(this.c, (I1722681268793429505) obj3, this.b, (M3727281027331139839) obj, iP);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP2 = V16504496955554646429.p(this.c | 1);
                D1286559660607336098.l(this.b, (S16571168858015125610) obj4, (L12639328004344855510) obj3, (M3727281027331139839) obj, iP2);
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ S10333474491823061305(W507352207674377208 w507352207674377208, int i, I1722681268793429505 i1722681268793429505, long j, int i2) {
        this.d = w507352207674377208;
        this.c = i;
        this.e = i1722681268793429505;
        this.b = j;
    }
}
