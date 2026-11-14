package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yu0 extends ads_mobile_sdk.pu0 {
    public final java.lang.String c;
    public final java.lang.Throwable d;

    public yu0(dev.epro.r0.P2480554073835519965 p2480554073835519965, int i) {
        this("Operation timed out.", (java.lang.Throwable) ((i & 2) != 0 ? null : p2480554073835519965));
    }

    @Override // ads_mobile_sdk.pu0
    public final java.lang.Throwable b() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.yu0)) {
            return false;
        }
        ads_mobile_sdk.yu0 yu0Var = (ads_mobile_sdk.yu0) obj;
        return dev.epro.r0.S10823041268949770285.t(this.c, yu0Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, yu0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        java.lang.Throwable th = this.d;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final java.lang.String toString() {
        return "TimeoutError(message=" + this.c + ", exception=" + this.d + ")";
    }

    public yu0(java.lang.String str, java.lang.Throwable th) {
        super(16);
        this.c = str;
        this.d = th;
    }
}
