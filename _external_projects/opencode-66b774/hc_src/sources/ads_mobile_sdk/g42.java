package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class g42 {
    public final long a;
    public final String b;
    public final String c;

    public g42(String str, String str2, long j) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g42)) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return this.a == g42Var.a && S10823041268949770285.t(this.b, g42Var.b) && this.c.equals(g42Var.c);
    }

    public final int hashCode() {
        return L11610354117192841236.A(2) + E12098517352909843120.h(H4776669175763245653.c(Long.hashCode(this.a) * 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineBufferedPingRecord(timestamp=");
        sb.append(this.a);
        sb.append(", gwsQueryId=");
        sb.append(this.b);
        return G6547577305291411977.v(sb, ", url=", this.c, ", eventState=READY_TO_PING)");
    }
}
