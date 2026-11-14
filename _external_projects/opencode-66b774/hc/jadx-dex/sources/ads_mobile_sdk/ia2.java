package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ia2 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.Integer c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;

    public ia2(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.x0 = this.a;
        p3477296814990354048.A0 = this.b;
        p3477296814990354048.y0 = this.c;
        p3477296814990354048.B0 = this.d;
        p3477296814990354048.I1 = this.e;
        p3477296814990354048.J1 = this.f;
        p3477296814990354048.z0 = this.g;
        p3477296814990354048.J0 = this.h;
        p3477296814990354048.K0 = this.i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ia2)) {
            return false;
        }
        ads_mobile_sdk.ia2 ia2Var = (ads_mobile_sdk.ia2) obj;
        return this.a.equals(ia2Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, ia2Var.b) && this.c.equals(ia2Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, ia2Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, ia2Var.e) && dev.epro.r0.S10823041268949770285.t(this.f, ia2Var.f) && this.g.equals(ia2Var.g) && dev.epro.r0.S10823041268949770285.t(this.h, ia2Var.h) && dev.epro.r0.S10823041268949770285.t(this.i, ia2Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        java.lang.String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f;
        int iH = dev.epro.r0.E12098517352909843120.h((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        java.lang.String str5 = this.h;
        int iHashCode5 = (iH + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.i;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("PackageInfoSignal(packageName=", this.a, ", versionName=", this.b, ", versionCode=");
        sbY.append(this.c);
        sbY.append(", displayLabel=");
        sbY.append(this.d);
        sbY.append(", installerPackage=");
        dev.epro.r0.G6547577305291411977.B(sbY, this.e, ", initiatorPackage=", this.f, ", appName=");
        dev.epro.r0.G6547577305291411977.B(sbY, this.g, ", appWebPropertyCode=", this.h, ", applicationCode=");
        return dev.epro.r0.G6547577305291411977.u(sbY, this.i, ")");
    }
}
