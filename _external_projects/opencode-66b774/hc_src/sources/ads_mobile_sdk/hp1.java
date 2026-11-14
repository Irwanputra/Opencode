package ads_mobile_sdk;

import dev.epro.r0.A15026739540715784716;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hp1 implements R16693852608535438299 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;

    public hp1(long j, long j2, int i, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        A15026739540715784716 a15026739540715784716 = p3477296814990354048.g0.c;
        a15026739540715784716.a = Long.valueOf(this.a);
        a15026739540715784716.b = Long.valueOf(this.b);
        a15026739540715784716.c = Long.valueOf(this.c);
        a15026739540715784716.d = Integer.valueOf(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp1)) {
            return false;
        }
        hp1 hp1Var = (hp1) obj;
        return this.a == hp1Var.a && this.b == hp1Var.b && this.c == hp1Var.c && this.d == hp1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder r = E12098517352909843120.r("MemorySignal(runtimeFreeMemory=", ", runtimeMaxMemory=", this.a);
        r.append(this.b);
        r.append(", runtimeTotalMemory=");
        r.append(this.c);
        r.append(", webviewCount=");
        return E12098517352909843120.n(r, this.d, ")");
    }
}
