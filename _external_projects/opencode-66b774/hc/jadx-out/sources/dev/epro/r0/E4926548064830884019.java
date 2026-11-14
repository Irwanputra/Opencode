package dev.epro.r0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E4926548064830884019 extends R15896830329318850690 implements F16971278462881137815, D10205225622993155321 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f224o;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        float f = ((A891803927997771281) B11964701839924937722.o(this, E11606037000563084849.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(j);
        boolean z = this.n && !Float.isNaN(f) && A891803927997771281.a(f, 0.0f) > 0;
        int iG0 = !Float.isNaN(f) ? i5164649337253478959.g0(f) : 0;
        int iMax = z17471428274427141949D.a;
        if (z) {
            iMax = Math.max(iMax, iG0);
        }
        int iMax2 = z17471428274427141949D.b;
        if (z) {
            iMax2 = Math.max(iMax2, iG0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f224o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f224o = linkedHashMap;
            }
            F5308936833291684381 f5308936833291684381 = E11606037000563084849.b;
            int iRound = Math.round((iG0 - z17471428274427141949D.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(f5308936833291684381, Integer.valueOf(iRound));
            F7206147944927503893 f7206147944927503893 = E11606037000563084849.a;
            int iRound2 = Math.round((iG0 - z17471428274427141949D.b) / 2.0f);
            linkedHashMap.put(f7206147944927503893, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f224o;
        if (map == null) {
            map = X9852054718446117252.a;
        }
        return i5164649337253478959.m(iMax, iMax2, map, new F18344946001205778110(iMax, z17471428274427141949D, iMax2));
    }
}
