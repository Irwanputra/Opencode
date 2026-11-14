package dev.epro.r0;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O9197885956465164423 extends G2555456398299437723 {
    public final List c;
    public final long d;
    public final float e;

    public O9197885956465164423(List list, long j, float f) {
        this.c = list;
        this.d = j;
        this.e = f;
    }

    @Override // dev.epro.r0.G2555456398299437723
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jM = S12227320117525376577.m(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fB = this.e;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = W8572396779607072172.b(j) / 2.0f;
        }
        float f = fB;
        List list = this.c;
        C9869900372345142877.c0(list, null);
        if (Build.VERSION.SDK_INT >= 29) {
            return T18206787068242505585.a.b(jFloatToRawIntBits, f, C9869900372345142877.Z(list), null, 0);
        }
        int iT = C9869900372345142877.t(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, C9869900372345142877.M(iT, list), C9869900372345142877.N(null, list, iT), B11964701839924937722.H(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O9197885956465164423)) {
            return false;
        }
        O9197885956465164423 o9197885956465164423 = (O9197885956465164423) obj;
        return this.c.equals(o9197885956465164423.c) && L2216691091636065972.b(this.d, o9197885956465164423.d) && this.e == o9197885956465164423.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + E12098517352909843120.e(this.e, G6547577305291411977.j(this.c.hashCode() * 961, this.d, 31), 31);
    }

    public final String toString() {
        long j = this.d;
        String str = "";
        String strS = (9223372034707292159L & j) != 9205357640488583168L ? G6547577305291411977.s("center=", L2216691091636065972.h(j), ", ") : "";
        float f = this.e;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=null, " + strS + str + "tileMode=Clamp)";
    }
}
