package dev.epro.r0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I10693660321785877375 extends G2555456398299437723 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public I10693660321785877375(List list, ArrayList arrayList, long j, long j2) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
    }

    @Override // dev.epro.r0.G2555456398299437723
    public final Shader b(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        C9869900372345142877.c0(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            return T18206787068242505585.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, C9869900372345142877.Z(list), list2 != null ? R9411874267597469228.b1(list2) : null, 0);
        }
        int iT = C9869900372345142877.t(list);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), C9869900372345142877.M(iT, list), C9869900372345142877.N(list2, list, iT), B11964701839924937722.H(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I10693660321785877375)) {
            return false;
        }
        I10693660321785877375 i10693660321785877375 = (I10693660321785877375) obj;
        return this.c.equals(i10693660321785877375.c) && S10823041268949770285.t(this.d, i10693660321785877375.d) && L2216691091636065972.b(this.e, i10693660321785877375.e) && L2216691091636065972.b(this.f, i10693660321785877375.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(0) + G6547577305291411977.j(G6547577305291411977.j((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        long j = this.e;
        String strS = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? G6547577305291411977.s("start=", L2216691091636065972.h(j), ", ") : "";
        long j2 = this.f;
        String strS2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? G6547577305291411977.s("end=", L2216691091636065972.h(j2), ", ") : "";
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        return G6547577305291411977.v(sb, strS, strS2, "tileMode=Clamp)");
    }
}
