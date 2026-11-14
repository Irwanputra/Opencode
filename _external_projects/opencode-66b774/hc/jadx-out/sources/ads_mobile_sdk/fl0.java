package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fl0 {
    public final Throwable a;
    public final String b;
    public final mi3 c;
    public final boolean d;
    public final long e;
    public final int f;
    public final boolean g;

    public fl0(Throwable th, String str, mi3 mi3Var, boolean z, long j, int i, boolean z2) {
        th.getClass();
        str.getClass();
        this.a = th;
        this.b = str;
        this.c = mi3Var;
        this.d = z;
        this.e = j;
        this.f = i;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl0)) {
            return false;
        }
        fl0 fl0Var = (fl0) obj;
        return S10823041268949770285.t(this.a, fl0Var.a) && S10823041268949770285.t(this.b, fl0Var.b) && S10823041268949770285.t(this.c, fl0Var.c) && this.d == fl0Var.d && this.e == fl0Var.e && this.f == fl0Var.f && this.g == fl0Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        int iC = H4776669175763245653.c(this.a.hashCode() * 31, this.b);
        mi3 mi3Var = this.c;
        int iHashCode = (iC + (mi3Var == null ? 0 : mi3Var.hashCode())) * 31;
        boolean z = this.d;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int iH = U1554499319261669842.h(this.f, G6547577305291411977.j((iHashCode + r3) * 31, this.e, 31));
        boolean z2 = this.g;
        return iH + (z2 ? 1 : z2);
    }

    public final String toString() {
        return "ExceptionSnapshot(exception=" + this.a + ", label=" + this.b + ", activeTraceMeta=" + this.c + ", trapped=" + this.d + ", timeMilliseconds=" + this.e + ", liveWebViewCount=" + this.f + ", unsampled=" + this.g + ")";
    }
}
