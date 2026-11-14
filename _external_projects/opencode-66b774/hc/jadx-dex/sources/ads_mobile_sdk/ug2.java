package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ug2 {
    public final boolean a;
    public final java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final java.lang.String e;
    public final int f;
    public final java.lang.String g;
    public final java.util.Map h;

    public ug2(boolean z, java.lang.String str, boolean z2, boolean z3, java.lang.String str2, int i, java.lang.String str3, java.util.Map map) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ug2)) {
            return false;
        }
        ads_mobile_sdk.ug2 ug2Var = (ads_mobile_sdk.ug2) obj;
        return this.a == ug2Var.a && this.b.equals(ug2Var.b) && this.c == ug2Var.c && this.d == ug2Var.d && this.e.equals(ug2Var.e) && this.f == ug2Var.f && this.g.equals(ug2Var.g) && this.h.equals(ug2Var.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iH = dev.epro.r0.E12098517352909843120.h(r1 * 31, 31, this.b);
        boolean z2 = this.c;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i = (iH + r3) * 31;
        boolean z3 = this.d;
        return this.h.hashCode() + dev.epro.r0.E12098517352909843120.h(dev.epro.r0.U1554499319261669842.h(this.f, dev.epro.r0.E12098517352909843120.h((i + (z3 ? 1 : z3)) * 31, 31, this.e)), 31, this.g);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlayPrewarmOptions(enablePrewarming=");
        sb.append(this.a);
        sb.append(", prefetchUrl=");
        sb.append(this.b);
        sb.append(", skipOfflineNotificationFlow=");
        dev.epro.r0.E12098517352909843120.u(sb, this.c, ", enableHsdpService=", this.d, ", hsdpServiceTargetAppPackageName=");
        dev.epro.r0.X2485016533998461232.k(sb, this.e, ", hsdpInvocationCallbackBitmask=", this.f, ", hsdpServiceReferrer=");
        sb.append(this.g);
        sb.append(", hsdpServiceExtraQueryParams=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
