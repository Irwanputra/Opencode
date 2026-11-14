package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vu0 extends ads_mobile_sdk.pu0 {
    public final java.lang.String c;
    public final java.lang.Throwable d;

    public vu0(java.lang.String str, java.lang.Throwable th) {
        super(5);
        this.c = str;
        this.d = th;
    }

    @Override // ads_mobile_sdk.pu0
    public final java.lang.Throwable b() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.vu0)) {
            return false;
        }
        ads_mobile_sdk.vu0 vu0Var = (ads_mobile_sdk.vu0) obj;
        return this.c.equals(vu0Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, vu0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        java.lang.Throwable th = this.d;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final java.lang.String toString() {
        return "NonRetryableNetworkError(message=" + this.c + ", exception=" + this.d + ")";
    }
}
