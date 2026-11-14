package dev.epro.r0;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T18206787068242505585 {
    public static final T18206787068242505585 a = new T18206787068242505585();

    public final LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return A13780509468012278052.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, B11964701839924937722.H(i));
    }

    public final RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return A13780509468012278052.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, B11964701839924937722.H(i));
    }

    public final SweepGradient c(long j, long[] jArr, float[] fArr) {
        return A13780509468012278052.e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}
