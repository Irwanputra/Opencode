package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.U1554499319261669842;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v22 {
    public final int a;
    public final int b;
    public final boolean c;
    public final double d;

    public v22(int i, int i2, boolean z, double d) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v22)) {
            return false;
        }
        v22 v22Var = (v22) obj;
        return this.a == v22Var.a && this.b == v22Var.b && this.c == v22Var.c && Double.compare(this.d, v22Var.d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iH = U1554499319261669842.h(this.b, Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return Double.hashCode(this.d) + ((iH + r1) * 31);
    }

    public final String toString() {
        StringBuilder sbP = E12098517352909843120.p(this.a, this.b, "NetworkPingStrategy(maxAttempts=", ", initialBackoffMs=", ", bufferAfterMaxAttempts=");
        sbP.append(this.c);
        sbP.append(", backoffMultiplier=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
