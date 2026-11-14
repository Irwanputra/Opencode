package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ia1 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ia1(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        java.lang.String str = this.a;
        if (str != null) {
            p3477296814990354048.s0 = str;
        }
        boolean z = this.b;
        p3477296814990354048.q0 = z ? 1 : 0;
        boolean z2 = this.c;
        p3477296814990354048.r0 = z2 ? 1 : 0;
        if (z || z2) {
            p3477296814990354048.t0 = java.lang.Integer.valueOf(this.d ? 0 : 1);
            p3477296814990354048.p0 = java.lang.Boolean.valueOf(this.e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ia1)) {
            return false;
        }
        ads_mobile_sdk.ia1 ia1Var = (ads_mobile_sdk.ia1) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, ia1Var.a) && this.b == ia1Var.b && this.c == ia1Var.c && this.d == ia1Var.d && this.e == ia1Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.c;
        ?? r22 = z2;
        if (z2) {
            r22 = 1;
        }
        int i2 = (i + r22) * 31;
        boolean z3 = this.d;
        ?? r23 = z3;
        if (z3) {
            r23 = 1;
        }
        int i3 = (i2 + r23) * 31;
        boolean z4 = this.e;
        return i3 + (z4 ? 1 : z4);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InspectorSignal(requestExtras=");
        sb.append(this.a);
        sb.append(", isTestMode=");
        sb.append(this.b);
        sb.append(", isLinkedDevice=");
        dev.epro.r0.E12098517352909843120.u(sb, this.c, ", hasServerData=", this.d, ", shouldCollectAdResponseLogs=");
        return dev.epro.r0.E12098517352909843120.o(sb, this.e, ")");
    }
}
