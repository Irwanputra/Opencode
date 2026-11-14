package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u73 {
    public final ads_mobile_sdk.cw0 a;
    public final ads_mobile_sdk.uv0 b;
    public final ads_mobile_sdk.u53 c;

    public /* synthetic */ u73(ads_mobile_sdk.cw0 cw0Var, int i) {
        this(cw0Var, (i & 2) != 0 ? null : ads_mobile_sdk.uv0.CACHED, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.u73)) {
            return false;
        }
        ads_mobile_sdk.u73 u73Var = (ads_mobile_sdk.u73) obj;
        return this.a == u73Var.a && this.b == u73Var.b && dev.epro.r0.S10823041268949770285.t(this.c, u73Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ads_mobile_sdk.uv0 uv0Var = this.b;
        int iHashCode2 = (iHashCode + (uv0Var == null ? 0 : uv0Var.hashCode())) * 31;
        ads_mobile_sdk.u53 u53Var = this.c;
        return iHashCode2 + (u53Var != null ? u53Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "SignalMeta(signalId=" + this.a + ", cacheState=" + this.b + ", signalData=" + this.c + ")";
    }

    public u73(ads_mobile_sdk.cw0 cw0Var, ads_mobile_sdk.uv0 uv0Var, ads_mobile_sdk.u53 u53Var) {
        cw0Var.getClass();
        this.a = cw0Var;
        this.b = uv0Var;
        this.c = u53Var;
    }
}
