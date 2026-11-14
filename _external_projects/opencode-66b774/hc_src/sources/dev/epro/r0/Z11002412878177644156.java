package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z11002412878177644156 {

    @O7462376509978667369("pvid")
    public String a;

    @O7462376509978667369("pvid_s")
    public Integer b;

    @O7462376509978667369("paidv1_id_android")
    public String c;

    @O7462376509978667369("paidv1_creation_time_android")
    public Long d;

    @O7462376509978667369("paidv1_creation_time_android_seconds")
    public Long e;

    @O7462376509978667369("paidv2_id_android")
    public String f;

    @O7462376509978667369("paidv2_creation_time_android")
    public Long g;

    @O7462376509978667369("paidv2_user_option_android")
    public Boolean h;

    @O7462376509978667369("paidv2_pub_option_android")
    public Boolean i;

    @O7462376509978667369("rdid")
    public String j;

    @O7462376509978667369("is_lat")
    public Boolean k;

    @O7462376509978667369("idtype")
    public String l;

    @O7462376509978667369("adsid")
    public String m;

    @O7462376509978667369("afai")
    public String n;

    /* renamed from: o, reason: collision with root package name */
    @O7462376509978667369("is_afai_lat")
    public Boolean f597o;

    public Z11002412878177644156(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.f597o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z11002412878177644156)) {
            return false;
        }
        Z11002412878177644156 z11002412878177644156 = (Z11002412878177644156) obj;
        return S10823041268949770285.t(this.a, z11002412878177644156.a) && S10823041268949770285.t(this.b, z11002412878177644156.b) && S10823041268949770285.t(this.c, z11002412878177644156.c) && S10823041268949770285.t(this.d, z11002412878177644156.d) && S10823041268949770285.t(this.e, z11002412878177644156.e) && S10823041268949770285.t(this.f, z11002412878177644156.f) && S10823041268949770285.t(this.g, z11002412878177644156.g) && S10823041268949770285.t(this.h, z11002412878177644156.h) && S10823041268949770285.t(this.i, z11002412878177644156.i) && S10823041268949770285.t(this.j, z11002412878177644156.j) && S10823041268949770285.t(this.k, z11002412878177644156.k) && S10823041268949770285.t(this.l, z11002412878177644156.l) && S10823041268949770285.t(this.m, z11002412878177644156.m) && S10823041268949770285.t(this.n, z11002412878177644156.n) && S10823041268949770285.t(this.f597o, z11002412878177644156.f597o);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.g;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.l;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool4 = this.f597o;
        return hashCode14 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        Integer num = this.b;
        String str2 = this.c;
        Long l = this.d;
        Long l2 = this.e;
        String str3 = this.f;
        Long l3 = this.g;
        Boolean bool = this.h;
        Boolean bool2 = this.i;
        String str4 = this.j;
        Boolean bool3 = this.k;
        String str5 = this.l;
        String str6 = this.m;
        String str7 = this.n;
        Boolean bool4 = this.f597o;
        StringBuilder sb = new StringBuilder("PersonallyIdentifiableInformation(appSetId=");
        sb.append(str);
        sb.append(", appSetIdScope=");
        sb.append(num);
        sb.append(", perAppIdV1=");
        sb.append(str2);
        sb.append(", paidV1CreationTimeMilliseconds=");
        sb.append(l);
        sb.append(", paidV1CreationTimeSeconds=");
        sb.append(l2);
        sb.append(", perAppIdV2=");
        sb.append(str3);
        sb.append(", paidV2CreationTimeMilliseconds=");
        sb.append(l3);
        sb.append(", paidV2UserOption=");
        sb.append(bool);
        sb.append(", paidV2PubOption=");
        sb.append(bool2);
        sb.append(", adId=");
        sb.append(str4);
        sb.append(", isLimitedAdTracking=");
        sb.append(bool3);
        sb.append(", idTypeParameter=");
        sb.append(str5);
        sb.append(", adsId=");
        G6547577305291411977.B(sb, str6, ", amazonFireAdId=", str7, ", isAmazonFireAdIdLimitAdTracking=");
        sb.append(bool4);
        sb.append(")");
        return sb.toString();
    }

    public Z11002412878177644156() {
        this(0);
    }
}
