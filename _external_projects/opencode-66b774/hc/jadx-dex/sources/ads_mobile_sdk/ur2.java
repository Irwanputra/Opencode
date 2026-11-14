package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ur2 {
    public java.lang.String a;
    public java.lang.String b;
    public ads_mobile_sdk.qw2 c;
    public boolean f;
    public java.lang.String g;

    public ur2() {
        ads_mobile_sdk.qw2 qw2Var = ads_mobile_sdk.qw2.d;
        this.a = "";
        this.b = "";
        this.c = qw2Var;
        this.f = false;
        this.g = "";
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ur2)) {
            return false;
        }
        ads_mobile_sdk.ur2 ur2Var = (ads_mobile_sdk.ur2) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, ur2Var.a) && this.b.equals(ur2Var.b) && this.c == ur2Var.c && this.f == ur2Var.f && this.g.equals(ur2Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + dev.epro.r0.E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b)) * 29791;
        boolean z = this.f;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.g.hashCode() + ((iHashCode + r0) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        ads_mobile_sdk.qw2 qw2Var = this.c;
        boolean z = this.f;
        java.lang.String str3 = this.g;
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("PublisherRequestTraceMeta(publisherRequestId=", str, ", adUnitId=", str2, ", publisherRequestType=");
        sbY.append(qw2Var);
        sbY.append(", signalGenerationRequestId=, preloadId=, skipUninitializedAdapters=");
        sbY.append(z);
        sbY.append(", requestAgent=");
        return dev.epro.r0.G6547577305291411977.u(sbY, str3, ")");
    }
}
