package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.L11610354117192841236;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class e42 {
    public final int a;
    public final int b;
    public final boolean c;

    public e42(int i, int i2, boolean z) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e42)) {
            return false;
        }
        e42 e42Var = (e42) obj;
        return this.a == e42Var.a && this.b == e42Var.b && this.c == e42Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iA = (L11610354117192841236.A(this.b) + (L11610354117192841236.A(this.a) * 31)) * 31;
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iA + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineAdConfig(impressionPrerequisite=");
        sb.append(E12098517352909843120.v(this.a));
        sb.append(", clickPrerequisite=");
        sb.append(E12098517352909843120.v(this.b));
        sb.append(", notificationFlowEnabled=");
        return E12098517352909843120.o(sb, this.c, ")");
    }
}
