package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.X2485016533998461232;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ug2 {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final String g;
    public final Map h;

    public ug2(boolean z, String str, boolean z2, boolean z3, String str2, int i, String str3, Map map) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug2)) {
            return false;
        }
        ug2 ug2Var = (ug2) obj;
        return this.a == ug2Var.a && this.b.equals(ug2Var.b) && this.c == ug2Var.c && this.d == ug2Var.d && this.e.equals(ug2Var.e) && this.f == ug2Var.f && this.g.equals(ug2Var.g) && this.h.equals(ug2Var.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int h = E12098517352909843120.h(r1 * 31, 31, this.b);
        ?? r3 = this.c;
        int i = r3;
        if (r3 != 0) {
            i = 1;
        }
        int i2 = (h + i) * 31;
        boolean z2 = this.d;
        return this.h.hashCode() + E12098517352909843120.h(U1554499319261669842.h(this.f, E12098517352909843120.h((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31, this.e)), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayPrewarmOptions(enablePrewarming=");
        sb.append(this.a);
        sb.append(", prefetchUrl=");
        sb.append(this.b);
        sb.append(", skipOfflineNotificationFlow=");
        E12098517352909843120.u(sb, this.c, ", enableHsdpService=", this.d, ", hsdpServiceTargetAppPackageName=");
        X2485016533998461232.k(sb, this.e, ", hsdpInvocationCallbackBitmask=", this.f, ", hsdpServiceReferrer=");
        sb.append(this.g);
        sb.append(", hsdpServiceExtraQueryParams=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
