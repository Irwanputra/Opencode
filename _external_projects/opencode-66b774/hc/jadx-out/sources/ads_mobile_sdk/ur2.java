package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ur2 {
    public String a;
    public String b;
    public qw2 c;
    public boolean f;
    public String g;

    public ur2() {
        qw2 qw2Var = qw2.d;
        this.a = "";
        this.b = "";
        this.c = qw2Var;
        this.f = false;
        this.g = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur2)) {
            return false;
        }
        ur2 ur2Var = (ur2) obj;
        return S10823041268949770285.t(this.a, ur2Var.a) && this.b.equals(ur2Var.b) && this.c == ur2Var.c && this.f == ur2Var.f && this.g.equals(ur2Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b)) * 29791;
        boolean z = this.f;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.g.hashCode() + ((iHashCode + r0) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        qw2 qw2Var = this.c;
        boolean z = this.f;
        String str3 = this.g;
        StringBuilder sbY = G6547577305291411977.y("PublisherRequestTraceMeta(publisherRequestId=", str, ", adUnitId=", str2, ", publisherRequestType=");
        sbY.append(qw2Var);
        sbY.append(", signalGenerationRequestId=, preloadId=, skipUninitializedAdapters=");
        sbY.append(z);
        sbY.append(", requestAgent=");
        return G6547577305291411977.u(sbY, str3, ")");
    }
}
