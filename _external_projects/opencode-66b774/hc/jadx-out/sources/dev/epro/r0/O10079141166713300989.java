package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O10079141166713300989 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ H617089765907910851 b;
    public final /* synthetic */ L6149251032718914612 c;
    public final /* synthetic */ int d;

    public /* synthetic */ O10079141166713300989(H617089765907910851 h617089765907910851, L6149251032718914612 l6149251032718914612, int i, byte b) {
        this.a = b;
        this.b = h617089765907910851;
        this.c = l6149251032718914612;
        this.d = i;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        int i = this.d;
        L6149251032718914612 l6149251032718914612 = this.c;
        H617089765907910851 h617089765907910851 = this.b;
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                S16343116836002986007.p(h617089765907910851, l6149251032718914612, m3727281027331139839, V16504496955554646429.p(i | 1));
                break;
            case 1:
                S16343116836002986007.f(h617089765907910851, l6149251032718914612, m3727281027331139839, V16504496955554646429.p(i | 1));
                break;
            default:
                S16343116836002986007.b(h617089765907910851, l6149251032718914612, m3727281027331139839, V16504496955554646429.p(i | 1));
                break;
        }
        return o9245300239821758723;
    }
}
