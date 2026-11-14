package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B9015851108731615764 {

    @dev.epro.r0.O7462376509978667369("app_id")
    public final java.lang.String a;

    @dev.epro.r0.O7462376509978667369("ad_unit_id")
    public final java.lang.String b;

    @dev.epro.r0.O7462376509978667369("is_init")
    public final boolean c;

    @dev.epro.r0.O7462376509978667369("pn")
    public final java.lang.String d;

    @dev.epro.r0.O7462376509978667369("version")
    public final java.lang.Integer e;

    @dev.epro.r0.O7462376509978667369("js")
    public final java.lang.String f;

    @dev.epro.r0.O7462376509978667369("experiment_ids")
    public final java.lang.String g;

    public B9015851108731615764(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.String str5) {
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B9015851108731615764)) {
            return false;
        }
        dev.epro.r0.B9015851108731615764 b9015851108731615764 = (dev.epro.r0.B9015851108731615764) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, b9015851108731615764.a) && dev.epro.r0.S10823041268949770285.t(this.b, b9015851108731615764.b) && this.c == b9015851108731615764.c && dev.epro.r0.S10823041268949770285.t(this.d, b9015851108731615764.d) && dev.epro.r0.S10823041268949770285.t(this.e, b9015851108731615764.e) && dev.epro.r0.S10823041268949770285.t(this.f, b9015851108731615764.f) && dev.epro.r0.S10823041268949770285.t(this.g, b9015851108731615764.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iC = dev.epro.r0.H4776669175763245653.c((iHashCode2 + r1) * 31, this.d);
        java.lang.Integer num = this.e;
        return this.g.hashCode() + dev.epro.r0.H4776669175763245653.c((iC + (num != null ? num.hashCode() : 0)) * 31, this.f);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        boolean z = this.c;
        java.lang.String str3 = this.d;
        java.lang.Integer num = this.e;
        java.lang.String str4 = this.f;
        java.lang.String str5 = this.g;
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("ConfigLoaderRequest(appId=", str, ", adUnitId=", str2, ", isCalledFromInit=");
        dev.epro.r0.X2485016533998461232.j(", packageName=", str3, ", versionCode=", sbY, z);
        sbY.append(num);
        sbY.append(", afmaVersion=");
        sbY.append(str4);
        sbY.append(", experimentIds=");
        return dev.epro.r0.G6547577305291411977.u(sbY, str5, ")");
    }
}
