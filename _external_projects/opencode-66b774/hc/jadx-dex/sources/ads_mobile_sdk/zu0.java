package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zu0 extends ads_mobile_sdk.pu0 {
    public final int c;
    public final java.lang.String d;
    public final java.lang.String e;

    public zu0(int i, java.lang.String str, java.lang.String str2) {
        super(5);
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.zu0)) {
            return false;
        }
        ads_mobile_sdk.zu0 zu0Var = (ads_mobile_sdk.zu0) obj;
        return this.c == zu0Var.c && dev.epro.r0.S10823041268949770285.t(this.d, zu0Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, zu0Var.e);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.c) * 31;
        java.lang.String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebError(errorCode=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", failingUrl=");
        return dev.epro.r0.G6547577305291411977.u(sb, this.e, ")");
    }
}
