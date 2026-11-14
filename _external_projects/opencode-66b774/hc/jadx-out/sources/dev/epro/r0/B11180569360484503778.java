package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B11180569360484503778 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ N10096588860211157351 i;
    public final /* synthetic */ L13148442655056575112 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Z17471428274427141949 m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V12449458134076131003 f166o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B11180569360484503778(N10096588860211157351 n10096588860211157351, C1787322630442623407 c1787322630442623407, long j, long j2, long j3, Z17471428274427141949 z17471428274427141949, long j4, V12449458134076131003 v12449458134076131003) {
        super(1);
        this.i = n10096588860211157351;
        this.j = c1787322630442623407;
        this.k = j2;
        this.l = j3;
        this.m = z17471428274427141949;
        this.n = j4;
        this.f166o = v12449458134076131003;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
        N10096588860211157351 n10096588860211157351 = this.i;
        V15405126878164315789 v15405126878164315789 = n10096588860211157351.u;
        L13148442655056575112 l13148442655056575112 = this.j;
        long j = l13148442655056575112 != null ? ((Q2551293802323679034) l13148442655056575112.getValue()).a : 0L;
        v15405126878164315789.b();
        v15405126878164315789.b();
        long jD = Q2551293802323679034.d(j, 0L);
        if (v15405126878164315789.b()) {
            v15405126878164315789.i = jD;
        }
        G15527156457921655762 g15527156457921655762 = n10096588860211157351.y;
        long jD2 = Q2551293802323679034.d(g15527156457921655762 != null ? g15527156457921655762.a(this.k, this.l, F10342546226345611902.a) : 0L, jD);
        long j2 = this.n;
        Z17471428274427141949 z17471428274427141949 = this.m;
        y2066038017114788875.f(z17471428274427141949);
        z17471428274427141949.n0(Q2551293802323679034.d((((long) (((int) (jD2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jD2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), z17471428274427141949.e), 0.0f, this.f166o);
        return O9245300239821758723.a;
    }
}
