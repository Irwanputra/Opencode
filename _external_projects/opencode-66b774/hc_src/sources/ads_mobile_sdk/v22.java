package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
    public final int hashCode() {
        int h = U1554499319261669842.h(this.b, Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Double.hashCode(this.d) + ((h + i) * 31);
    }

    public final String toString() {
        StringBuilder p = E12098517352909843120.p(this.a, this.b, "NetworkPingStrategy(maxAttempts=", ", initialBackoffMs=", ", bufferAfterMaxAttempts=");
        p.append(this.c);
        p.append(", backoffMultiplier=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
