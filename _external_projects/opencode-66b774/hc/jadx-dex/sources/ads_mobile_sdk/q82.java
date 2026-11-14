package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class q82 {
    public final int a;
    public final ads_mobile_sdk.ha2 b;
    public final boolean c;
    public final java.lang.String d;
    public final java.lang.String e;

    public q82(int i, ads_mobile_sdk.ha2 ha2Var, boolean z, java.lang.String str, java.lang.String str2) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = ha2Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.q82)) {
            return false;
        }
        ads_mobile_sdk.q82 q82Var = (ads_mobile_sdk.q82) obj;
        return this.a == q82Var.a && this.b == q82Var.b && this.c == q82Var.c && this.d.equals(q82Var.d) && this.e.equals(q82Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (dev.epro.r0.L11610354117192841236.A(this.a) * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.e.hashCode() + dev.epro.r0.E12098517352909843120.h((iHashCode + r0) * 31, 31, this.d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OmidSettings(mediaType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "DISPLAY" : "VIDEO");
        sb.append(", videoEventsOwner=");
        sb.append(this.b);
        sb.append(", javascriptSessionServiceEnabled=");
        dev.epro.r0.X2485016533998461232.j(", omidPartnerName=", this.d, ", omidHtml=", sb, this.c);
        return dev.epro.r0.G6547577305291411977.u(sb, this.e, ")");
    }
}
