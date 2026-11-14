package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K3306943059087435289 extends R15896830329318850690 implements D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f330o;
    public float p;

    @Override // dev.epro.r0.D10205225622993155321
    public final int W(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int iA0 = g17613326942144185441.a0(i);
        int iG0 = !Float.isNaN(this.f330o) ? i11965759855724288421.g0(this.f330o) : 0;
        return iA0 < iG0 ? iG0 : iA0;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.f330o) || I16980768508151520658.k(j) != 0) {
            iK = I16980768508151520658.k(j);
        } else {
            int iG0 = i5164649337253478959.g0(this.f330o);
            iK = I16980768508151520658.i(j);
            if (iG0 < 0) {
                iG0 = 0;
            }
            if (iG0 <= iK) {
                iK = iG0;
            }
        }
        int i = I16980768508151520658.i(j);
        if (Float.isNaN(this.p) || I16980768508151520658.j(j) != 0) {
            iJ = I16980768508151520658.j(j);
        } else {
            int iG02 = i5164649337253478959.g0(this.p);
            iJ = I16980768508151520658.h(j);
            int i2 = iG02 >= 0 ? iG02 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(O15160157444238005800.a(iK, i, iJ, I16980768508151520658.h(j)));
        return i5164649337253478959.m(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, new Y17164194448930251553(z17471428274427141949D, (byte) 19));
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int iF = g17613326942144185441.f(i);
        int iG0 = !Float.isNaN(this.p) ? i11965759855724288421.g0(this.p) : 0;
        return iF < iG0 ? iG0 : iF;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int iB0 = g17613326942144185441.b0(i);
        int iG0 = !Float.isNaN(this.p) ? i11965759855724288421.g0(this.p) : 0;
        return iB0 < iG0 ? iG0 : iB0;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        int iV = g17613326942144185441.V(i);
        int iG0 = !Float.isNaN(this.f330o) ? i11965759855724288421.g0(this.f330o) : 0;
        return iV < iG0 ? iG0 : iV;
    }
}
