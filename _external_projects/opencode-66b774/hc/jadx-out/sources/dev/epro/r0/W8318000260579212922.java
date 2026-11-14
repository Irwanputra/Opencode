package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class W8318000260579212922 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ H617089765907910851 b;

    public /* synthetic */ W8318000260579212922(H617089765907910851 h617089765907910851, byte b) {
        this.a = b;
        this.b = h617089765907910851;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        H617089765907910851 h617089765907910851 = this.b;
        switch (b) {
            case 0:
                if (S16343116836002986007.u(h617089765907910851)) {
                    h617089765907910851.a(h617089765907910851.e() - 12);
                }
                return o9245300239821758723;
            case 1:
                if (!S16343116836002986007.u(h617089765907910851)) {
                    h617089765907910851.a(h617089765907910851.e() + 12);
                }
                return o9245300239821758723;
            case 2:
                return V4416135141588678913.t(new F13241018602672925865(F17068667133831649611.a(S16343116836002986007.s(h617089765907910851), null, 14), 6, 0L));
            default:
                return V4416135141588678913.t(new F13241018602672925865(F17068667133831649611.a(h617089765907910851.f(), null, 14), 6, 0L));
        }
    }
}
