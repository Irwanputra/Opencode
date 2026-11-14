package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K3306943059087435289 extends R15896830329318850690 implements D10205225622993155321 {

    /* renamed from: o, reason: collision with root package name */
    public float f330o;
    public float p;

    @Override // dev.epro.r0.D10205225622993155321
    public final int W(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int a0 = g17613326942144185441.a0(i);
        int g0 = !Float.isNaN(this.f330o) ? i11965759855724288421.g0(this.f330o) : 0;
        return a0 < g0 ? g0 : a0;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        int k;
        int j2;
        if (Float.isNaN(this.f330o) || I16980768508151520658.k(j) != 0) {
            k = I16980768508151520658.k(j);
        } else {
            int g0 = i5164649337253478959.g0(this.f330o);
            k = I16980768508151520658.i(j);
            if (g0 < 0) {
                g0 = 0;
            }
            if (g0 <= k) {
                k = g0;
            }
        }
        int i = I16980768508151520658.i(j);
        if (Float.isNaN(this.p) || I16980768508151520658.j(j) != 0) {
            j2 = I16980768508151520658.j(j);
        } else {
            int g02 = i5164649337253478959.g0(this.p);
            j2 = I16980768508151520658.h(j);
            int i2 = g02 >= 0 ? g02 : 0;
            if (i2 <= j2) {
                j2 = i2;
            }
        }
        Z17471428274427141949 d = g17613326942144185441.d(O15160157444238005800.a(k, i, j2, I16980768508151520658.h(j)));
        return i5164649337253478959.m(d.a, d.b, X9852054718446117252.a, new Y17164194448930251553(d, (byte) 19));
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int f = g17613326942144185441.f(i);
        int g0 = !Float.isNaN(this.p) ? i11965759855724288421.g0(this.p) : 0;
        return f < g0 ? g0 : f;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int b0 = g17613326942144185441.b0(i);
        int g0 = !Float.isNaN(this.p) ? i11965759855724288421.g0(this.p) : 0;
        return b0 < g0 ? g0 : b0;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int V = g17613326942144185441.V(i);
        int g0 = !Float.isNaN(this.f330o) ? i11965759855724288421.g0(this.f330o) : 0;
        return V < g0 ? g0 : V;
    }
}
