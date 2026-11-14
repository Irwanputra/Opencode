package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class s8 {
    public java.lang.String b = "";
    public java.lang.String c = "";

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.s8)) {
            return false;
        }
        ads_mobile_sdk.s8 s8Var = (ads_mobile_sdk.s8) obj;
        return dev.epro.r0.S10823041268949770285.t(this.b, s8Var.b) && this.c.equals(s8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dev.epro.r0.H4776669175763245653.c(0, this.b);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.E12098517352909843120.m("AdTraceMeta(impressionEarned=false, adTraceId=", this.b, ", backendQueryId=", this.c, ")");
    }
}
