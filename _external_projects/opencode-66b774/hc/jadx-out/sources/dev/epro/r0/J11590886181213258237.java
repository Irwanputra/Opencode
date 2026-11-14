package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J11590886181213258237 extends R15896830329318850690 implements D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public T1241271073913685060 f302o;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        float fD = this.f302o.d(i5164649337253478959.getLayoutDirection());
        float fB = this.f302o.b();
        float fC = this.f302o.c(i5164649337253478959.getLayoutDirection());
        float fA = this.f302o.a();
        if (!((A891803927997771281.a(fD, 0.0f) >= 0) & (A891803927997771281.a(fB, 0.0f) >= 0) & (A891803927997771281.a(fC, 0.0f) >= 0) & (A891803927997771281.a(fA, 0.0f) >= 0))) {
            O9477331075629462156.a("Padding must be non-negative");
        }
        int iG0 = i5164649337253478959.g0(fD);
        int iG02 = i5164649337253478959.g0(fC) + iG0;
        int iG03 = i5164649337253478959.g0(fB);
        int iG04 = i5164649337253478959.g0(fA) + iG03;
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(O15160157444238005800.i(-iG02, j, -iG04));
        return i5164649337253478959.m(O15160157444238005800.g(z17471428274427141949D.a + iG02, j), O15160157444238005800.f(z17471428274427141949D.b + iG04, j), X9852054718446117252.a, new F18344946001205778110(z17471428274427141949D, iG0, iG03, (byte) 2));
    }
}
