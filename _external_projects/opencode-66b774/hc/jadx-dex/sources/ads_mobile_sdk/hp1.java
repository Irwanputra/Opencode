package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hp1 implements dev.epro.r0.R16693852608535438299 {
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

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        dev.epro.r0.A15026739540715784716 a15026739540715784716 = p3477296814990354048.g0.c;
        a15026739540715784716.a = java.lang.Long.valueOf(this.a);
        a15026739540715784716.b = java.lang.Long.valueOf(this.b);
        a15026739540715784716.c = java.lang.Long.valueOf(this.c);
        a15026739540715784716.d = java.lang.Integer.valueOf(this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.hp1)) {
            return false;
        }
        ads_mobile_sdk.hp1 hp1Var = (ads_mobile_sdk.hp1) obj;
        return this.a == hp1Var.a && this.b == hp1Var.b && this.c == hp1Var.c && this.d == hp1Var.d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.d) + dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(java.lang.Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbR = dev.epro.r0.E12098517352909843120.r("MemorySignal(runtimeFreeMemory=", ", runtimeMaxMemory=", this.a);
        sbR.append(this.b);
        sbR.append(", runtimeTotalMemory=");
        sbR.append(this.c);
        sbR.append(", webviewCount=");
        return dev.epro.r0.E12098517352909843120.n(sbR, this.d, ")");
    }
}
