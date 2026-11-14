package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bm1 {
    public final java.lang.String a;
    public final ads_mobile_sdk.ue2 b;
    public final boolean c;
    public final long d;

    public bm1(java.lang.String str, ads_mobile_sdk.ue2 ue2Var, boolean z, long j) {
        str.getClass();
        ue2Var.getClass();
        this.a = str;
        this.b = ue2Var;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.bm1)) {
            return false;
        }
        ads_mobile_sdk.bm1 bm1Var = (ads_mobile_sdk.bm1) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, bm1Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, bm1Var.b) && this.c == bm1Var.c && this.d == bm1Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return java.lang.Long.hashCode(this.d) + ((iHashCode + r0) * 31);
    }

    public final java.lang.String toString() {
        return "LoadedAd(ad=" + this.a + ", token=" + this.b + ", isFromPreviousSession=" + this.c + ", timeInCacheMs=" + this.d + ")";
    }
}
