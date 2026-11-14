package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M6239439583175380381 extends P9893650590651797888 implements L12639328004344855510 {
    public final /* synthetic */ Object i;
    public final /* synthetic */ I1722681268793429505 j;
    public final /* synthetic */ F4096073349764486348 k;
    public final /* synthetic */ G15527156457921655762 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ F4096073349764486348 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T15443218846549482730 f373o;
    public final /* synthetic */ int p;
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M6239439583175380381(Object obj, I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348, G15527156457921655762 g15527156457921655762, String str, F4096073349764486348 f40960733497644863482, T15443218846549482730 t15443218846549482730, int i, int i2) {
        super(2);
        this.i = obj;
        this.j = i1722681268793429505;
        this.k = f4096073349764486348;
        this.l = g15527156457921655762;
        this.m = str;
        this.n = f40960733497644863482;
        this.f373o = t15443218846549482730;
        this.p = i;
        this.q = i2;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        T18016951143603335921.b(this.i, this.j, this.k, this.l, this.m, this.n, this.f373o, (M3727281027331139839) obj, V16504496955554646429.p(this.p | 1), this.q);
        return O9245300239821758723.a;
    }
}
