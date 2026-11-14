package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B17386621432431629513 extends P9893650590651797888 implements L12639328004344855510 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ I1722681268793429505 j;
    public final /* synthetic */ Z5580852631924387145 k;
    public final /* synthetic */ J2232875916072654838 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ J12078565427869724451 n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f173o;
    public final /* synthetic */ byte p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B17386621432431629513(boolean z, I1722681268793429505 i1722681268793429505, Z5580852631924387145 z5580852631924387145, J2232875916072654838 j2232875916072654838, String str, J12078565427869724451 j12078565427869724451, int i, int i2) {
        super(2);
        this.i = z;
        this.j = i1722681268793429505;
        this.k = z5580852631924387145;
        this.l = j2232875916072654838;
        this.m = str;
        this.n = j12078565427869724451;
        this.f173o = i;
        this.p = i2;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C9869900372345142877.d(this.i, this.j, this.k, this.l, this.m, this.n, (M3727281027331139839) obj, V16504496955554646429.p(this.f173o | 1), this.p);
        return O9245300239821758723.a;
    }
}
