package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g42 {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;

    public g42(java.lang.String str, java.lang.String str2, long j) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.g42)) {
            return false;
        }
        ads_mobile_sdk.g42 g42Var = (ads_mobile_sdk.g42) obj;
        return this.a == g42Var.a && dev.epro.r0.S10823041268949770285.t(this.b, g42Var.b) && this.c.equals(g42Var.c);
    }

    public final int hashCode() {
        return dev.epro.r0.L11610354117192841236.A(2) + dev.epro.r0.E12098517352909843120.h(dev.epro.r0.H4776669175763245653.c(java.lang.Long.hashCode(this.a) * 31, this.b), 31, this.c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflineBufferedPingRecord(timestamp=");
        sb.append(this.a);
        sb.append(", gwsQueryId=");
        sb.append(this.b);
        return dev.epro.r0.G6547577305291411977.v(sb, ", url=", this.c, ", eventState=READY_TO_PING)");
    }
}
