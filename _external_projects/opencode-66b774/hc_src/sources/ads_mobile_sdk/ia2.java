package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ia2 implements R16693852608535438299 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ia2(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8) {
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

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia2)) {
            return false;
        }
        ia2 ia2Var = (ia2) obj;
        return this.a.equals(ia2Var.a) && S10823041268949770285.t(this.b, ia2Var.b) && this.c.equals(ia2Var.c) && S10823041268949770285.t(this.d, ia2Var.d) && S10823041268949770285.t(this.e, ia2Var.e) && S10823041268949770285.t(this.f, ia2Var.f) && this.g.equals(ia2Var.g) && S10823041268949770285.t(this.h, ia2Var.h) && S10823041268949770285.t(this.i, ia2Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int h = E12098517352909843120.h((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        String str5 = this.h;
        int hashCode5 = (h + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder y = G6547577305291411977.y("PackageInfoSignal(packageName=", this.a, ", versionName=", this.b, ", versionCode=");
        y.append(this.c);
        y.append(", displayLabel=");
        y.append(this.d);
        y.append(", installerPackage=");
        G6547577305291411977.B(y, this.e, ", initiatorPackage=", this.f, ", appName=");
        G6547577305291411977.B(y, this.g, ", appWebPropertyCode=", this.h, ", applicationCode=");
        return G6547577305291411977.u(y, this.i, ")");
    }
}
