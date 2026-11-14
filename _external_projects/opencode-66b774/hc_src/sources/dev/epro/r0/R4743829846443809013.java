package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R4743829846443809013 extends R15896830329318850690 implements D10205225622993155321 {

    /* renamed from: o, reason: collision with root package name */
    public F11522267504195649243 f468o;
    public float p;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        int k;
        int i;
        int i2;
        int i3;
        if (!I16980768508151520658.e(j) || this.f468o == F11522267504195649243.a) {
            k = I16980768508151520658.k(j);
            i = I16980768508151520658.i(j);
        } else {
            int round = Math.round(I16980768508151520658.i(j) * this.p);
            int k2 = I16980768508151520658.k(j);
            k = I16980768508151520658.i(j);
            if (round < k2) {
                round = k2;
            }
            if (round <= k) {
                k = round;
            }
            i = k;
        }
        if (!I16980768508151520658.d(j) || this.f468o == F11522267504195649243.b) {
            int j2 = I16980768508151520658.j(j);
            int h = I16980768508151520658.h(j);
            i2 = j2;
            i3 = h;
        } else {
            int round2 = Math.round(I16980768508151520658.h(j) * this.p);
            int j3 = I16980768508151520658.j(j);
            i2 = I16980768508151520658.h(j);
            if (round2 < j3) {
                round2 = j3;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            i3 = i2;
        }
        Z17471428274427141949 d = g17613326942144185441.d(O15160157444238005800.a(k, i, i2, i3));
        return i5164649337253478959.m(d.a, d.b, X9852054718446117252.a, new Y17164194448930251553(d, (byte) 6));
    }
}
