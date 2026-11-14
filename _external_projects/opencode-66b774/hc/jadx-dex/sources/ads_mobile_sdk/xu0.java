package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xu0 implements dev.epro.r0.M16184408391440927034 {
    public final java.lang.Object b;

    public xu0(java.lang.Object obj) {
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.xu0) && dev.epro.r0.S10823041268949770285.t(this.b, ((ads_mobile_sdk.xu0) obj).b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(result=" + this.b + ")";
    }
}
