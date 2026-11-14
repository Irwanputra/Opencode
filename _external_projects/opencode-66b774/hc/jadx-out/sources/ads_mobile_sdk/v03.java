package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.S10823041268949770285;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v03 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public v03(String str, String str2, boolean z, boolean z2, List list) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v03)) {
            return false;
        }
        v03 v03Var = (v03) obj;
        return S10823041268949770285.t(this.a, v03Var.a) && S10823041268949770285.t(this.b, v03Var.b) && this.c == v03Var.c && this.d == v03Var.d && S10823041268949770285.t(this.e, v03Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iC = H4776669175763245653.c(this.a.hashCode() * 31, this.b);
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iC + r2) * 31;
        boolean z2 = this.d;
        return this.e.hashCode() + ((i + (z2 ? 1 : z2)) * 31);
    }

    public final String toString() {
        StringBuilder sbY = G6547577305291411977.y("SafeBrowsingConfig(clickString=", this.a, ", reportUrl=", this.b, ", nonMaliciousReportingEnabled=");
        E12098517352909843120.u(sbY, this.c, ", autoClickProtectionEnabled=", this.d, ", allowedHeaders=");
        sbY.append(this.e);
        sbY.append(")");
        return sbY.toString();
    }

    public /* synthetic */ v03() {
        this("", "", false, false, O2161699089510411363.a);
    }
}
