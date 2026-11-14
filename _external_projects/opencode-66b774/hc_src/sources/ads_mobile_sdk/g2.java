package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class g2 {
    public final int a;
    public final int b;
    public final boolean c;

    public g2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.a == g2Var.a && this.b == g2Var.b && this.c == g2Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int h = U1554499319261669842.h(this.b, Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return h + i;
    }

    public final String toString() {
        return E12098517352909843120.o(E12098517352909843120.p(this.a, this.b, "AdDimensions(width=", ", height=", ", isFluidHeight="), this.c, ")");
    }
}
