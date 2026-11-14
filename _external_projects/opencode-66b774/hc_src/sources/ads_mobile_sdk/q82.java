package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.X2485016533998461232;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class q82 {
    public final int a;
    public final ha2 b;
    public final boolean c;
    public final String d;
    public final String e;

    public q82(int i, ha2 ha2Var, boolean z, String str, String str2) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = ha2Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q82)) {
            return false;
        }
        q82 q82Var = (q82) obj;
        return this.a == q82Var.a && this.b == q82Var.b && this.c == q82Var.c && this.d.equals(q82Var.d) && this.e.equals(q82Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (L11610354117192841236.A(this.a) * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.e.hashCode() + E12098517352909843120.h((hashCode + i) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OmidSettings(mediaType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "DISPLAY" : "VIDEO");
        sb.append(", videoEventsOwner=");
        sb.append(this.b);
        sb.append(", javascriptSessionServiceEnabled=");
        X2485016533998461232.j(", omidPartnerName=", this.d, ", omidHtml=", sb, this.c);
        return G6547577305291411977.u(sb, this.e, ")");
    }
}
