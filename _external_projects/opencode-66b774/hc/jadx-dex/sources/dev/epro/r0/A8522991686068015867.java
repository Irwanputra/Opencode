package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8522991686068015867 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ dev.epro.r0.I5164649337253478959 l;
    public final /* synthetic */ dev.epro.r0.Z17471428274427141949 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A8522991686068015867(dev.epro.r0.K11590009740670147136 k11590009740670147136, long j, int i, int i2, dev.epro.r0.I5164649337253478959 i5164649337253478959, dev.epro.r0.Z17471428274427141949 z17471428274427141949) {
        super(1);
        this.i = j;
        this.j = i;
        this.k = i2;
        this.l = i5164649337253478959;
        this.m = z17471428274427141949;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        dev.epro.r0.Y2066038017114788875 y2066038017114788875 = (dev.epro.r0.Y2066038017114788875) obj;
        long j = (((long) this.j) << 32) | (((long) this.k) & 4294967295L);
        dev.epro.r0.F10342546226345611902 layoutDirection = this.l.getLayoutDirection();
        long j2 = this.i;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == dev.epro.r0.F10342546226345611902.a ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int iRound = java.lang.Math.round((f3 + 1.0f) * f);
        dev.epro.r0.Y2066038017114788875.i(y2066038017114788875, this.m, (((long) java.lang.Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
        return dev.epro.r0.O9245300239821758723.a;
    }
}
