package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T9938119293851550496 extends R15896830329318850690 implements D10205225622993155321, V6844203142031704410 {

    /* renamed from: o, reason: collision with root package name */
    public L1256556220631237103 f515o;
    public boolean p;
    public G15527156457921655762 q;
    public C1267176524613794288 r;
    public float s;
    public R3103059035698929241 t;

    public static boolean i1(long j) {
        return !W8572396779607072172.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean j1(long j) {
        return !W8572396779607072172.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
        long d = this.f515o.d();
        long floatToRawIntBits = (Float.floatToRawIntBits(j1(d) ? Float.intBitsToFloat((int) (d >> 32)) : Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32))) << 32) | (Float.floatToRawIntBits(i1(d) ? Float.intBitsToFloat((int) (d & 4294967295L)) : Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L))) & 4294967295L);
        long l = (Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L)) == 0.0f) ? 0L : E17665849472693074628.l(floatToRawIntBits, this.r.d(floatToRawIntBits, n16536369055082677148.e()));
        long a = this.q.a((Math.round(Float.intBitsToFloat((int) (l >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (l & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L))) & 4294967295L), n17396598995248644478.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((H12843822278061842084) n16536369055082677148.b.b).I(f, f2);
        try {
            this.f515o.c(n17396598995248644478, l, this.s, this.t);
            ((H12843822278061842084) n16536369055082677148.b.b).I(-f, -f2);
            n17396598995248644478.a();
        } catch (Throwable th) {
            ((H12843822278061842084) n16536369055082677148.b.b).I(-f, -f2);
            throw th;
        }
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int W(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (!h1()) {
            return g17613326942144185441.a0(i);
        }
        long k1 = k1(O15160157444238005800.b(0, 0, 0, i, 7));
        return Math.max(I16980768508151520658.k(k1), g17613326942144185441.a0(i));
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        Z17471428274427141949 d = g17613326942144185441.d(k1(j));
        return i5164649337253478959.m(d.a, d.b, X9852054718446117252.a, new Y17164194448930251553(d, (byte) 10));
    }

    public final boolean h1() {
        return this.p && this.f515o.d() != 9205357640488583168L;
    }

    public final long k1(long j) {
        boolean z = false;
        boolean z2 = I16980768508151520658.e(j) && I16980768508151520658.d(j);
        if (I16980768508151520658.g(j) && I16980768508151520658.f(j)) {
            z = true;
        }
        if ((!h1() && z2) || z) {
            return I16980768508151520658.b(j, I16980768508151520658.i(j), 0, I16980768508151520658.h(j), 0, 10);
        }
        long d = this.f515o.d();
        int round = j1(d) ? Math.round(Float.intBitsToFloat((int) (d >> 32))) : I16980768508151520658.k(j);
        int round2 = i1(d) ? Math.round(Float.intBitsToFloat((int) (d & 4294967295L))) : I16980768508151520658.j(j);
        int g = O15160157444238005800.g(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(O15160157444238005800.f(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (h1()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!j1(this.f515o.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f515o.d() >> 32))) << 32) | (Float.floatToRawIntBits(!i1(this.f515o.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f515o.d() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : E17665849472693074628.l(floatToRawIntBits2, this.r.d(floatToRawIntBits2, floatToRawIntBits));
        }
        return I16980768508151520658.b(j, O15160157444238005800.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, O15160157444238005800.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (!h1()) {
            return g17613326942144185441.f(i);
        }
        long k1 = k1(O15160157444238005800.b(0, i, 0, 0, 13));
        return Math.max(I16980768508151520658.j(k1), g17613326942144185441.f(i));
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (!h1()) {
            return g17613326942144185441.b0(i);
        }
        long k1 = k1(O15160157444238005800.b(0, i, 0, 0, 13));
        return Math.max(I16980768508151520658.j(k1), g17613326942144185441.b0(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f515o + ", sizeToIntrinsics=" + this.p + ", alignment=" + this.q + ", alpha=" + this.s + ", colorFilter=" + this.t + ")";
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        if (!h1()) {
            return g17613326942144185441.V(i);
        }
        long k1 = k1(O15160157444238005800.b(0, 0, 0, i, 7));
        return Math.max(I16980768508151520658.k(k1), g17613326942144185441.V(i));
    }
}
