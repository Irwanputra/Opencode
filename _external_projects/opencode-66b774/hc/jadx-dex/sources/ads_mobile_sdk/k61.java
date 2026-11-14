package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k61 {
    public final java.lang.String a;
    public final dev.epro.r0.X11644140690951955496 b;
    public final java.lang.String c;
    public final dev.epro.r0.I16631908410500040363 d;
    public final java.lang.String e;
    public final boolean f;

    public k61(java.lang.String str, dev.epro.r0.X11644140690951955496 x11644140690951955496, java.lang.String str2, dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str3, boolean z) {
        this.a = str;
        this.b = x11644140690951955496;
        this.c = str2;
        this.d = i16631908410500040363;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.k61)) {
            return false;
        }
        ads_mobile_sdk.k61 k61Var = (ads_mobile_sdk.k61) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, k61Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, k61Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, k61Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, k61Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, k61Var.e) && this.f == k61Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dev.epro.r0.X11644140690951955496 x11644140690951955496 = this.b;
        int iHashCode2 = (iHashCode + (x11644140690951955496 == null ? 0 : x11644140690951955496.hashCode())) * 31;
        java.lang.String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.d;
        int iHashCode4 = (iHashCode3 + (i16631908410500040363 == null ? 0 : i16631908410500040363.a.hashCode())) * 31;
        java.lang.String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode5 + r3;
    }

    public final java.lang.String toString() {
        return "InlineAd(html=" + this.a + ", bodyDeferred=" + this.b + ", baseUrl=" + this.c + ", adJson=" + this.d + ", adConfigKey=" + this.e + ", hasMultiAdConfigKey=" + this.f + ")";
    }
}
