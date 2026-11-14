package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u22 {
    public final ads_mobile_sdk.v22 a;

    public u22(ads_mobile_sdk.v22 v22Var) {
        this.a = v22Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.u22) && this.a.equals(((ads_mobile_sdk.u22) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NetworkPingConfig(networkPingStrategy=" + this.a + ")";
    }
}
