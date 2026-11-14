package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.O7462376509978667369;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tz2 {

    @O7462376509978667369("name")
    public final String a;

    @O7462376509978667369("adapter_version")
    public final String b;

    @O7462376509978667369("sdk_version")
    public final String c;

    @O7462376509978667369("signals")
    public String d;

    @O7462376509978667369("signal_error")
    public String e;

    @O7462376509978667369("signal_error_code")
    public Integer f;

    @O7462376509978667369("latency")
    public Long g;

    public tz2(String str, int i, String str2, Integer num) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz2)) {
            return false;
        }
        tz2 tz2Var = (tz2) obj;
        return S10823041268949770285.t(this.a, tz2Var.a) && S10823041268949770285.t(this.b, tz2Var.b) && S10823041268949770285.t(this.c, tz2Var.c) && S10823041268949770285.t(this.d, tz2Var.d) && S10823041268949770285.t(this.e, tz2Var.e) && S10823041268949770285.t(this.f, tz2Var.f) && S10823041268949770285.t(this.g, tz2Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.g;
        return iHashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        Integer num = this.f;
        Long l = this.g;
        StringBuilder sbY = G6547577305291411977.y("RtbAdapterData(adapterClassName=", str, ", adapterVersion=", str2, ", sdkVersion=");
        G6547577305291411977.B(sbY, str3, ", signals=", str4, ", signalErrorMessage=");
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
