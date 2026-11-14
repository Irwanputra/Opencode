package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A6241039206372053110 extends R15896830329318850690 implements D10205225622993155321 {

    /* renamed from: o, reason: collision with root package name */
    public float f162o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        int g0 = i5164649337253478959.g0(this.q) + i5164649337253478959.g0(this.f162o);
        int g02 = i5164649337253478959.g0(this.r) + i5164649337253478959.g0(this.p);
        Z17471428274427141949 d = g17613326942144185441.d(O15160157444238005800.i(-g0, j, -g02));
        return i5164649337253478959.m(O15160157444238005800.g(d.a + g0, j), O15160157444238005800.f(d.b + g02, j), X9852054718446117252.a, new U9113694475402304022(this, d, (byte) 16));
    }
}
