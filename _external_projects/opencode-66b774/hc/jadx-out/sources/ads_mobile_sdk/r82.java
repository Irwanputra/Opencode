package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class r82 implements R16693852608535438299 {
    public final String a;
    public final String b;
    public final String c;

    public r82(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.u0 = this.a;
        p3477296814990354048.v0 = this.b;
        p3477296814990354048.w0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r82)) {
            return false;
        }
        r82 r82Var = (r82) obj;
        return S10823041268949770285.t(this.a, r82Var.a) && S10823041268949770285.t(this.b, r82Var.b) && S10823041268949770285.t(this.c, r82Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return G6547577305291411977.u(G6547577305291411977.y("OmidSignal(omidVersion=", this.a, ", clientOmidVersion=", this.b, ", omidPartnerName="), this.c, ")");
    }
}
