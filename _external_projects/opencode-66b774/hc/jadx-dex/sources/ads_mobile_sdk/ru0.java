package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ru0 extends ads_mobile_sdk.pu0 {
    public final int c;
    public final java.lang.String d;

    public ru0(java.lang.String str, int i) {
        super(5);
        this.c = i;
        this.d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ru0)) {
            return false;
        }
        ads_mobile_sdk.ru0 ru0Var = (ads_mobile_sdk.ru0) obj;
        return this.c == ru0Var.c && dev.epro.r0.S10823041268949770285.t(this.d, ru0Var.d);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.c) * 31;
        java.lang.String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "HttpError(responseCode=" + this.c + ", responseMessage=" + this.d + ")";
    }
}
