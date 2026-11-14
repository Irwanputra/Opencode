package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tz2 {

    @dev.epro.r0.O7462376509978667369("name")
    public final java.lang.String a;

    @dev.epro.r0.O7462376509978667369("adapter_version")
    public final java.lang.String b;

    @dev.epro.r0.O7462376509978667369("sdk_version")
    public final java.lang.String c;

    @dev.epro.r0.O7462376509978667369("signals")
    public java.lang.String d;

    @dev.epro.r0.O7462376509978667369("signal_error")
    public java.lang.String e;

    @dev.epro.r0.O7462376509978667369("signal_error_code")
    public java.lang.Integer f;

    @dev.epro.r0.O7462376509978667369("latency")
    public java.lang.Long g;

    public tz2(java.lang.String str, int i, java.lang.String str2, java.lang.Integer num) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        num = (i & 32) != 0 ? null : num;
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = str2;
        this.f = num;
        this.g = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.tz2)) {
            return false;
        }
        ads_mobile_sdk.tz2 tz2Var = (ads_mobile_sdk.tz2) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, tz2Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, tz2Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, tz2Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, tz2Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, tz2Var.e) && dev.epro.r0.S10823041268949770285.t(this.f, tz2Var.f) && dev.epro.r0.S10823041268949770285.t(this.g, tz2Var.g);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Long l = this.g;
        return iHashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        java.lang.String str4 = this.d;
        java.lang.String str5 = this.e;
        java.lang.Integer num = this.f;
        java.lang.Long l = this.g;
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("RtbAdapterData(adapterClassName=", str, ", adapterVersion=", str2, ", sdkVersion=");
        dev.epro.r0.G6547577305291411977.B(sbY, str3, ", signals=", str4, ", signalErrorMessage=");
        sbY.append(str5);
        sbY.append(", signalErrorCode=");
        sbY.append(num);
        sbY.append(", latency=");
        sbY.append(l);
        sbY.append(")");
        return sbY.toString();
    }

    public tz2() {
        this(null, 127, null, null);
    }
}
