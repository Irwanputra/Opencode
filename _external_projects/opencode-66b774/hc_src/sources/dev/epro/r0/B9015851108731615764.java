package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B9015851108731615764 {

    @O7462376509978667369("app_id")
    public final String a;

    @O7462376509978667369("ad_unit_id")
    public final String b;

    @O7462376509978667369("is_init")
    public final boolean c;

    @O7462376509978667369("pn")
    public final String d;

    @O7462376509978667369("version")
    public final Integer e;

    @O7462376509978667369("js")
    public final String f;

    @O7462376509978667369("experiment_ids")
    public final String g;

    public B9015851108731615764(String str, String str2, boolean z, String str3, Integer num, String str4, String str5) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B9015851108731615764)) {
            return false;
        }
        B9015851108731615764 b9015851108731615764 = (B9015851108731615764) obj;
        return S10823041268949770285.t(this.a, b9015851108731615764.a) && S10823041268949770285.t(this.b, b9015851108731615764.b) && this.c == b9015851108731615764.c && S10823041268949770285.t(this.d, b9015851108731615764.d) && S10823041268949770285.t(this.e, b9015851108731615764.e) && S10823041268949770285.t(this.f, b9015851108731615764.f) && S10823041268949770285.t(this.g, b9015851108731615764.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int c = H4776669175763245653.c((hashCode2 + i) * 31, this.d);
        Integer num = this.e;
        return this.g.hashCode() + H4776669175763245653.c((c + (num != null ? num.hashCode() : 0)) * 31, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        String str3 = this.d;
        Integer num = this.e;
        String str4 = this.f;
        String str5 = this.g;
        StringBuilder y = G6547577305291411977.y("ConfigLoaderRequest(appId=", str, ", adUnitId=", str2, ", isCalledFromInit=");
        X2485016533998461232.j(", packageName=", str3, ", versionCode=", y, z);
        y.append(num);
        y.append(", afmaVersion=");
        y.append(str4);
        y.append(", experimentIds=");
        return G6547577305291411977.u(y, str5, ")");
    }
}
