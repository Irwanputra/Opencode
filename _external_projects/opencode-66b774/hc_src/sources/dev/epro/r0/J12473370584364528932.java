package dev.epro.r0;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J12473370584364528932 extends G2555456398299437723 {
    public final List c;

    public J12473370584364528932(List list) {
        this.c = list;
    }

    @Override // dev.epro.r0.G2555456398299437723
    public final Shader b(long j) {
        long m = S12227320117525376577.m(j);
        List list = this.c;
        C9869900372345142877.c0(list, null);
        if (Build.VERSION.SDK_INT >= 29) {
            return T18206787068242505585.a.c(m, C9869900372345142877.Z(list), null);
        }
        int t = C9869900372345142877.t(list);
        return new SweepGradient(Float.intBitsToFloat((int) (m >> 32)), Float.intBitsToFloat((int) (m & 4294967295L)), C9869900372345142877.M(t, list), C9869900372345142877.N(null, list, t));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J12473370584364528932) {
            return L2216691091636065972.b(9205357640488583168L, 9205357640488583168L) && this.c.equals(((J12473370584364528932) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return G6547577305291411977.h(Long.hashCode(9205357640488583168L) * 31, 31, this.c);
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.c + ", stops=null)";
    }
}
