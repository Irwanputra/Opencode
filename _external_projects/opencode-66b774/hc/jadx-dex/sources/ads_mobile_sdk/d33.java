package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d33 {
    public final ads_mobile_sdk.v23 a;
    public final ads_mobile_sdk.z23 b;
    public final boolean c;
    public final ads_mobile_sdk.ue2 d;

    public d33(ads_mobile_sdk.v23 v23Var, ads_mobile_sdk.z23 z23Var, boolean z, ads_mobile_sdk.ue2 ue2Var) {
        z23Var.getClass();
        this.a = v23Var;
        this.b = z23Var;
        this.c = z;
        this.d = ue2Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.d33)) {
            return false;
        }
        ads_mobile_sdk.d33 d33Var = (ads_mobile_sdk.d33) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, d33Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, d33Var.b) && this.c == d33Var.c && dev.epro.r0.S10823041268949770285.t(this.d, d33Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        ads_mobile_sdk.ue2 ue2Var = this.d;
        return i + (ue2Var == null ? 0 : ue2Var.hashCode());
    }

    public final java.lang.String toString() {
        return "ServerTransaction(serverRequest=" + this.a + ", serverResponse=" + this.b + ", isFromPersistentCache=" + this.c + ", persistentCacheToken=" + this.d + ")";
    }
}
