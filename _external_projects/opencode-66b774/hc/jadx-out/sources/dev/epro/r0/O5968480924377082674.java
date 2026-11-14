package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O5968480924377082674 extends R15896830329318850690 implements D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f412o;
    public L13148442655056575112 p;
    public L13148442655056575112 q;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        L13148442655056575112 l13148442655056575112 = this.p;
        int iRound = (l13148442655056575112 == null || ((Number) l13148442655056575112.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) l13148442655056575112.getValue()).floatValue() * this.f412o);
        L13148442655056575112 l131484426550565751122 = this.q;
        int iRound2 = (l131484426550565751122 == null || ((Number) l131484426550565751122.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) l131484426550565751122.getValue()).floatValue() * this.f412o);
        int iK = iRound != Integer.MAX_VALUE ? iRound : I16980768508151520658.k(j);
        int iJ = iRound2 != Integer.MAX_VALUE ? iRound2 : I16980768508151520658.j(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = I16980768508151520658.i(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = I16980768508151520658.h(j);
        }
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(O15160157444238005800.a(iK, iRound, iJ, iRound2));
        return i5164649337253478959.m(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, new Y17164194448930251553(z17471428274427141949D, (byte) 11));
    }
}
