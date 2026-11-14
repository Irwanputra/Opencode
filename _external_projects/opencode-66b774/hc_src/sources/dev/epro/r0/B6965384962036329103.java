package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B6965384962036329103 extends R15896830329318850690 implements D10205225622993155321 {

    /* renamed from: o, reason: collision with root package name */
    public float f178o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // dev.epro.r0.D10205225622993155321
    public final int W(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        long h1 = h1(i11965759855724288421);
        if (I16980768508151520658.g(h1)) {
            return I16980768508151520658.i(h1);
        }
        if (!this.s) {
            i = O15160157444238005800.f(i, h1);
        }
        return O15160157444238005800.g(g17613326942144185441.a0(i), h1);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        int k;
        int i;
        int j2;
        int h;
        long a;
        long h1 = h1(i5164649337253478959);
        if (this.s) {
            a = O15160157444238005800.e(j, h1);
        } else {
            if (Float.isNaN(this.f178o)) {
                k = I16980768508151520658.k(j);
                int i2 = I16980768508151520658.i(h1);
                if (k > i2) {
                    k = i2;
                }
            } else {
                k = I16980768508151520658.k(h1);
            }
            if (Float.isNaN(this.q)) {
                i = I16980768508151520658.i(j);
                int k2 = I16980768508151520658.k(h1);
                if (i < k2) {
                    i = k2;
                }
            } else {
                i = I16980768508151520658.i(h1);
            }
            if (Float.isNaN(this.p)) {
                j2 = I16980768508151520658.j(j);
                int h2 = I16980768508151520658.h(h1);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = I16980768508151520658.j(h1);
            }
            if (Float.isNaN(this.r)) {
                h = I16980768508151520658.h(j);
                int j3 = I16980768508151520658.j(h1);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = I16980768508151520658.h(h1);
            }
            a = O15160157444238005800.a(k, i, j2, h);
        }
        Z17471428274427141949 d = g17613326942144185441.d(a);
        return i5164649337253478959.m(d.a, d.b, X9852054718446117252.a, new Y17164194448930251553(d, (byte) 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h1(dev.epro.r0.I5164649337253478959 r7) {
        /*
            r6 = this;
            float r0 = r6.q
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.q
            int r0 = r7.g0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.r
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.r
            int r3 = r7.g0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f178o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f178o
            int r4 = r7.g0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.p
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.p
            int r6 = r7.g0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = dev.epro.r0.O15160157444238005800.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B6965384962036329103.h1(dev.epro.r0.I5164649337253478959):long");
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int l0(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        long h1 = h1(i11965759855724288421);
        if (I16980768508151520658.f(h1)) {
            return I16980768508151520658.h(h1);
        }
        if (!this.s) {
            i = O15160157444238005800.g(i, h1);
        }
        return O15160157444238005800.f(g17613326942144185441.f(i), h1);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int r(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        long h1 = h1(i11965759855724288421);
        if (I16980768508151520658.f(h1)) {
            return I16980768508151520658.h(h1);
        }
        if (!this.s) {
            i = O15160157444238005800.g(i, h1);
        }
        return O15160157444238005800.f(g17613326942144185441.b0(i), h1);
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final int z(I11965759855724288421 i11965759855724288421, G17613326942144185441 g17613326942144185441, int i) {
        long h1 = h1(i11965759855724288421);
        if (I16980768508151520658.g(h1)) {
            return I16980768508151520658.i(h1);
        }
        if (!this.s) {
            i = O15160157444238005800.f(i, h1);
        }
        return O15160157444238005800.g(g17613326942144185441.V(i), h1);
    }
}
