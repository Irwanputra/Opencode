package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class r82 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public r82(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.u0 = this.a;
        p3477296814990354048.v0 = this.b;
        p3477296814990354048.w0 = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.r82)) {
            return false;
        }
        ads_mobile_sdk.r82 r82Var = (ads_mobile_sdk.r82) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, r82Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, r82Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, r82Var.c);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.u(dev.epro.r0.G6547577305291411977.y("OmidSignal(omidVersion=", this.a, ", clientOmidVersion=", this.b, ", omidPartnerName="), this.c, ")");
    }
}
