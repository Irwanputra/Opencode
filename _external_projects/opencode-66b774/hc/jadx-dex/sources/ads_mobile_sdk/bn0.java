package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bn0 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public bn0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.bn0)) {
            return false;
        }
        ads_mobile_sdk.bn0 bn0Var = (ads_mobile_sdk.bn0) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, bn0Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, bn0Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, bn0Var.c);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.u(dev.epro.r0.G6547577305291411977.y("FirebaseAnalyticsIds(firebaseAppId=", this.a, ", firebaseAppInstanceId=", this.b, ", firebaseAdEventId="), this.c, ")");
    }
}
