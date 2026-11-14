package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W1857259450685235819 extends R15896830329318850690 implements D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D5961215468735357278 f560o;
    public boolean p;
    public M7102034154292440921 q;
    public boolean r;
    public U16834965109098959004 s;
    public U16834965109098959004 t;
    public float u;
    public float v;

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        R7033599853981556291.E(V0(), null, null, new G16212247282630895364(this, null, (byte) 20), 3);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        float f = M18113111391818111737.J;
        byte b = 0;
        byte b2 = 1;
        float fK = i5164649337253478959.K(this.r ? M18113111391818111737.C : ((g17613326942144185441.f(I16980768508151520658.i(j)) != 0 && g17613326942144185441.a0(I16980768508151520658.h(j)) != 0) || this.p) ? M17943801045207241871.a : M17943801045207241871.b);
        U16834965109098959004 u16834965109098959004 = this.t;
        int iFloatValue = (int) (u16834965109098959004 != null ? ((Number) u16834965109098959004.d()).floatValue() : fK);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            N17315172036749737048.a("width and height must be >= 0");
        }
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(O15160157444238005800.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fK2 = i5164649337253478959.K((M17943801045207241871.d - i5164649337253478959.P0(fK)) / 2.0f);
        float fK3 = i5164649337253478959.K((M17943801045207241871.c - M17943801045207241871.a) - M17943801045207241871.e);
        boolean z = this.r;
        if (z && this.p) {
            fK2 = fK3 - i5164649337253478959.K(f);
        } else if (z && !this.p) {
            fK2 = i5164649337253478959.K(f);
        } else if (this.p) {
            fK2 = fK3;
        }
        U16834965109098959004 u168349651090989590042 = this.t;
        R4833348786910499294 r4833348786910499294 = null;
        Float f2 = u168349651090989590042 != null ? (Float) u168349651090989590042.e.getValue() : null;
        byte b3 = 3;
        if (f2 == null || f2.floatValue() != fK) {
            R7033599853981556291.E(V0(), null, null, new H1657953055264103140(this, fK, r4833348786910499294, b), 3);
        }
        U16834965109098959004 u168349651090989590043 = this.s;
        Float f3 = u168349651090989590043 != null ? (Float) u168349651090989590043.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fK2) {
            R7033599853981556291.E(V0(), null, null, new H1657953055264103140(this, fK2, r4833348786910499294, b2), 3);
        }
        if (Float.isNaN(this.v) && Float.isNaN(this.u)) {
            this.v = fK;
            this.u = fK2;
        }
        return i5164649337253478959.m(iFloatValue, iFloatValue, X9852054718446117252.a, new H9530584680358255093(z17471428274427141949D, this, fK2, b3));
    }
}
