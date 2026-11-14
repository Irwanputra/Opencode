package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.W6853231930366344609;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class md1 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final W6853231930366344609 g;
    public final boolean h;

    public md1(String str, List list, int i, int i2, int i3, long j, W6853231930366344609 w6853231930366344609, boolean z) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j;
        this.g = w6853231930366344609;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md1)) {
            return false;
        }
        md1 md1Var = (md1) obj;
        return this.a.equals(md1Var.a) && this.b.equals(md1Var.b) && this.c == md1Var.c && this.d == md1Var.d && this.e == md1Var.e && E17093345031926825464.d(this.f, md1Var.f) && this.g == md1Var.g && this.h == md1Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iH = U1554499319261669842.h(this.e, U1554499319261669842.h(this.d, U1554499319261669842.h(this.c, G6547577305291411977.h(this.a.hashCode() * 31, 31, this.b))));
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        int iHashCode = (this.g.hashCode() + G6547577305291411977.j(iH, this.f, 31)) * 31;
        boolean z = this.h;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iHashCode + r4;
    }

    public final String toString() {
        String strL = E17093345031926825464.l(this.f);
        StringBuilder sb = new StringBuilder("InternalAttributionInfo(text=");
        sb.append(this.a);
        sb.append(", icons=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        G6547577305291411977.A(sb, this.c, ", textColor=", this.d, ", textSize=");
        sb.append(this.e);
        sb.append(", animationInterval=");
        sb.append(strL);
        sb.append(", attributionInfoPlacement=");
        sb.append(this.g);
        sb.append(", allowPubRendering=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
