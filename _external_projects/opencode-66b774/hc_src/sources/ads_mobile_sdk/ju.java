package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ju {
    public final int a;
    public final int b;
    public final int c;

    public ju(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return this.a == juVar.a && this.b == juVar.b && this.c == juVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(50) + U1554499319261669842.h(this.c, U1554499319261669842.h(0, U1554499319261669842.h(this.b, Integer.hashCode(this.a) * 31)));
    }

    public final String toString() {
        return E12098517352909843120.n(E12098517352909843120.p(this.a, this.b, "CloseButtonConfig(paddingLeft=", ", paddingRight=", ", paddingTop=0, paddingBottom="), this.c, ", size=50)");
    }
}
