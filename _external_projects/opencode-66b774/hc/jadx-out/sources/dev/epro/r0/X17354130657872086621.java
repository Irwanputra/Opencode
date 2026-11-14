package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X17354130657872086621 {

    @O7462376509978667369("signals")
    public P3477296814990354048 a;

    @O7462376509978667369("url")
    public String b;

    @O7462376509978667369("post_body")
    public String c;

    @O7462376509978667369("error")
    public String d;

    @O7462376509978667369("cookies_include")
    public Boolean e;

    @O7462376509978667369("request_id")
    public String f;

    @O7462376509978667369("params")
    public String g;

    @O7462376509978667369("c_params")
    public String h;

    public X17354130657872086621(String str, String str2, String str3, Boolean bool, String str4, String str5, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        bool = (i & 16) != 0 ? null : bool;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 128) != 0 ? null : str5;
        this.a = null;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bool;
        this.f = str4;
        this.g = null;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X17354130657872086621)) {
            return false;
        }
        X17354130657872086621 x17354130657872086621 = (X17354130657872086621) obj;
        return S10823041268949770285.t(this.a, x17354130657872086621.a) && S10823041268949770285.t(this.b, x17354130657872086621.b) && S10823041268949770285.t(this.c, x17354130657872086621.c) && S10823041268949770285.t(this.d, x17354130657872086621.d) && S10823041268949770285.t(this.e, x17354130657872086621.e) && S10823041268949770285.t(this.f, x17354130657872086621.f) && S10823041268949770285.t(this.g, x17354130657872086621.g) && S10823041268949770285.t(this.h, x17354130657872086621.h);
    }

    public final int hashCode() {
        P3477296814990354048 p3477296814990354048 = this.a;
        int iHashCode = (p3477296814990354048 == null ? 0 : p3477296814990354048.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        P3477296814990354048 p3477296814990354048 = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        Boolean bool = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        StringBuilder sb = new StringBuilder("ClientRequestBuildingData(signals=");
        sb.append(p3477296814990354048);
        sb.append(", url=");
        sb.append(str);
        sb.append(", postBody=");
        G6547577305291411977.B(sb, str2, ", error=", str3, ", cookiesInclude=");
        sb.append(bool);
        sb.append(", requestId=");
        sb.append(str4);
        sb.append(", params=");
        return G6547577305291411977.w(sb, str5, ", cParams=", str6, ")");
    }

    public X17354130657872086621() {
        this(null, null, null, null, null, null, 255);
    }
}
