package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ce3 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public ce3(java.lang.String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.g1 = this.a;
        p3477296814990354048.h1 = java.lang.Integer.valueOf(this.b);
        p3477296814990354048.i1 = java.lang.Integer.valueOf(this.c);
        p3477296814990354048.j1 = java.lang.Integer.valueOf(this.d);
        dev.epro.r0.G11312307416001574639 g11312307416001574639 = p3477296814990354048.g0;
        g11312307416001574639.e.b = java.lang.Boolean.valueOf(this.e);
        g11312307416001574639.e.a = java.lang.Integer.valueOf(this.f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ce3)) {
            return false;
        }
        ads_mobile_sdk.ce3 ce3Var = (ads_mobile_sdk.ce3) obj;
        return this.a.equals(ce3Var.a) && this.b == ce3Var.b && this.c == ce3Var.c && this.d == ce3Var.d && this.e == ce3Var.e && this.f == ce3Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iH = dev.epro.r0.U1554499319261669842.h(this.d, dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.U1554499319261669842.h(this.b, this.a.hashCode() * 31)));
        boolean z = this.e;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return java.lang.Integer.hashCode(this.f) + ((iH + r1) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbX = dev.epro.r0.G6547577305291411977.x(this.b, "TelephonySignal(carrierCode=", this.a, ", networkTypeCoarse=", ", networkTypeFine=");
        dev.epro.r0.G6547577305291411977.A(sbX, this.c, ", phoneType=", this.d, ", isActiveNetworkMetered=");
        sbX.append(this.e);
        sbX.append(", activeNetworkState=");
        sbX.append(this.f);
        sbX.append(")");
        return sbX.toString();
    }
}
