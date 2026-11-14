package dev.epro.r0;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long m = S12227320117525376577.m(j);
            intBitsToFloat = Float.intBitsToFloat((int) (m >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (m & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float f = this.e;
        if (f == Float.POSITIVE_INFINITY) {
            f = W8572396779607072172.b(j) / 2.0f;
        }
        float f2 = f;
        List list = this.c;
        C9869900372345142877.c0(list, null);
        if (Build.VERSION.SDK_INT >= 29) {
            return T18206787068242505585.a.b(floatToRawIntBits, f2, C9869900372345142877.Z(list), null, 0);
        }
        int t = C9869900372345142877.t(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, C9869900372345142877.M(t, list), C9869900372345142877.N(null, list, t), B11964701839924937722.H(0));
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
        String s = (9223372034707292159L & j) != 9205357640488583168L ? G6547577305291411977.s("center=", L2216691091636065972.h(j), ", ") : "";
        float f = this.e;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=null, " + s + str + "tileMode=Clamp)";
    }
}
