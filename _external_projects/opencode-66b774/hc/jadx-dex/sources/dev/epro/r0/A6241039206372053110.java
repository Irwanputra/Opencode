package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A6241039206372053110 extends dev.epro.r0.R15896830329318850690 implements dev.epro.r0.D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f162o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // dev.epro.r0.D10205225622993155321
    public final dev.epro.r0.H11646813293457574213 h(dev.epro.r0.I5164649337253478959 i5164649337253478959, dev.epro.r0.G17613326942144185441 g17613326942144185441, long j) {
        int iG0 = i5164649337253478959.g0(this.q) + i5164649337253478959.g0(this.f162o);
        int iG02 = i5164649337253478959.g0(this.r) + i5164649337253478959.g0(this.p);
        dev.epro.r0.Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(dev.epro.r0.O15160157444238005800.i(-iG0, j, -iG02));
        return i5164649337253478959.m(dev.epro.r0.O15160157444238005800.g(z17471428274427141949D.a + iG0, j), dev.epro.r0.O15160157444238005800.f(z17471428274427141949D.b + iG02, j), dev.epro.r0.X9852054718446117252.a, new dev.epro.r0.U9113694475402304022(this, z17471428274427141949D, (byte) 16));
    }
}
