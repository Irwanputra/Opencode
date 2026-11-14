package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class v22 {
    public final int a;
    public final int b;
    public final boolean c;
    public final double d;

    public v22(int i, int i2, boolean z, double d) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.v22)) {
            return false;
        }
        ads_mobile_sdk.v22 v22Var = (ads_mobile_sdk.v22) obj;
        return this.a == v22Var.a && this.b == v22Var.b && this.c == v22Var.c && java.lang.Double.compare(this.d, v22Var.d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iH = dev.epro.r0.U1554499319261669842.h(this.b, java.lang.Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return java.lang.Double.hashCode(this.d) + ((iH + r1) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(this.a, this.b, "NetworkPingStrategy(maxAttempts=", ", initialBackoffMs=", ", bufferAfterMaxAttempts=");
        sbP.append(this.c);
        sbP.append(", backoffMultiplier=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
