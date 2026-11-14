package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R4743829846443809013 extends R15896830329318850690 implements D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F11522267504195649243 f468o;
    public float p;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!I16980768508151520658.e(j) || this.f468o == F11522267504195649243.a) {
            iK = I16980768508151520658.k(j);
            i = I16980768508151520658.i(j);
        } else {
            int iRound = Math.round(I16980768508151520658.i(j) * this.p);
            int iK2 = I16980768508151520658.k(j);
            iK = I16980768508151520658.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!I16980768508151520658.d(j) || this.f468o == F11522267504195649243.b) {
            int iJ = I16980768508151520658.j(j);
            int iH2 = I16980768508151520658.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(I16980768508151520658.h(j) * this.p);
            int iJ2 = I16980768508151520658.j(j);
            iH = I16980768508151520658.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(O15160157444238005800.a(iK, i, iH, i2));
        return i5164649337253478959.m(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, new Y17164194448930251553(z17471428274427141949D, (byte) 6));
    }
}
