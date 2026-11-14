package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E4926548064830884019 extends dev.epro.r0.R15896830329318850690 implements dev.epro.r0.F16971278462881137815, dev.epro.r0.D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.LinkedHashMap f224o;

    @Override // dev.epro.r0.D10205225622993155321
    public final dev.epro.r0.H11646813293457574213 h(dev.epro.r0.I5164649337253478959 i5164649337253478959, dev.epro.r0.G17613326942144185441 g17613326942144185441, long j) {
        float f = ((dev.epro.r0.A891803927997771281) dev.epro.r0.B11964701839924937722.o(this, dev.epro.r0.E11606037000563084849.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        dev.epro.r0.Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(j);
        boolean z = ((dev.epro.r0.R15896830329318850690) this).n && !java.lang.Float.isNaN(f) && dev.epro.r0.A891803927997771281.a(f, 0.0f) > 0;
        int iG0 = !java.lang.Float.isNaN(f) ? i5164649337253478959.g0(f) : 0;
        int iMax = z17471428274427141949D.a;
        if (z) {
            iMax = java.lang.Math.max(iMax, iG0);
        }
        int iMax2 = z17471428274427141949D.b;
        if (z) {
            iMax2 = java.lang.Math.max(iMax2, iG0);
        }
        if (z) {
            java.util.LinkedHashMap linkedHashMap = this.f224o;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
                this.f224o = linkedHashMap;
            }
            dev.epro.r0.F5308936833291684381 f5308936833291684381 = dev.epro.r0.E11606037000563084849.b;
            int iRound = java.lang.Math.round((iG0 - z17471428274427141949D.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(f5308936833291684381, java.lang.Integer.valueOf(iRound));
            dev.epro.r0.F7206147944927503893 f7206147944927503893 = dev.epro.r0.E11606037000563084849.a;
            int iRound2 = java.lang.Math.round((iG0 - z17471428274427141949D.b) / 2.0f);
            linkedHashMap.put(f7206147944927503893, java.lang.Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        dev.epro.r0.X9852054718446117252 x9852054718446117252 = this.f224o;
        if (x9852054718446117252 == null) {
            x9852054718446117252 = dev.epro.r0.X9852054718446117252.a;
        }
        return i5164649337253478959.m(iMax, iMax2, x9852054718446117252, new dev.epro.r0.F18344946001205778110(iMax, z17471428274427141949D, iMax2));
    }
}
