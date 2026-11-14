package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J11590886181213258237 extends R15896830329318850690 implements D10205225622993155321 {

    /* renamed from: o, reason: collision with root package name */
    public T1241271073913685060 f302o;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        float d = this.f302o.d(i5164649337253478959.getLayoutDirection());
        float b = this.f302o.b();
        float c = this.f302o.c(i5164649337253478959.getLayoutDirection());
        float a = this.f302o.a();
        if (!((A891803927997771281.a(d, 0.0f) >= 0) & (A891803927997771281.a(b, 0.0f) >= 0) & (A891803927997771281.a(c, 0.0f) >= 0) & (A891803927997771281.a(a, 0.0f) >= 0))) {
            O9477331075629462156.a("Padding must be non-negative");
        }
        int g0 = i5164649337253478959.g0(d);
        int g02 = i5164649337253478959.g0(c) + g0;
        int g03 = i5164649337253478959.g0(b);
        int g04 = i5164649337253478959.g0(a) + g03;
        Z17471428274427141949 d2 = g17613326942144185441.d(O15160157444238005800.i(-g02, j, -g04));
        return i5164649337253478959.m(O15160157444238005800.g(d2.a + g02, j), O15160157444238005800.f(d2.b + g04, j), X9852054718446117252.a, new F18344946001205778110(d2, g0, g03, (byte) 2));
    }
}
