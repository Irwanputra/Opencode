package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fq {
    public static final dev.epro.r0.W15082408677311432558 h = new dev.epro.r0.W15082408677311432558();
    public final java.util.List a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final java.lang.String e;
    public java.lang.String f;
    public final java.util.List g;

    public fq(java.util.List list, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.util.List list2) {
        str3.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.fq)) {
            return false;
        }
        ads_mobile_sdk.fq fqVar = (ads_mobile_sdk.fq) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, fqVar.a) && dev.epro.r0.S10823041268949770285.t(this.b, fqVar.b) && dev.epro.r0.S10823041268949770285.t(this.c, fqVar.c) && this.d == fqVar.d && dev.epro.r0.S10823041268949770285.t(this.e, fqVar.e) && dev.epro.r0.S10823041268949770285.t(this.f, fqVar.f) && dev.epro.r0.S10823041268949770285.t(this.g, fqVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    public final int hashCode() {
        java.util.List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iC = dev.epro.r0.H4776669175763245653.c((iHashCode3 + r2) * 31, this.e);
        java.lang.String str3 = this.f;
        int iHashCode4 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.util.List list2 = this.g;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildAdUrlResult(errors=");
        sb.append(this.a);
        sb.append(", baseUri=");
        sb.append(this.b);
        sb.append(", postParameters=");
        dev.epro.r0.E12098517352909843120.s(this.c, ", includeCookies=", ", url=", sb, this.d);
        dev.epro.r0.G6547577305291411977.B(sb, this.e, ", queryWithFlattenedBlobParams=", str, ", csrbErrors=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
