package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 {
    public final wy0 a;
    public final boolean b;
    public final boolean c;

    public xb2(wy0 wy0Var, boolean z, boolean z2) {
        this.a = wy0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xb2) {
            xb2 xb2Var = (xb2) obj;
            if (this.a == xb2Var.a && this.b == xb2Var.b && this.c == xb2Var.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.c;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerAppIdV2(paidV2Info=");
        sb.append(this.a);
        sb.append(", pubOption=");
        sb.append(this.b);
        sb.append(", userOption=");
        return E12098517352909843120.o(sb, this.c, ")");
    }
}
