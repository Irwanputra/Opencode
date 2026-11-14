package ads_mobile_sdk;

import dev.epro.r0.G11312307416001574639;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ce3 implements R16693852608535438299 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public ce3(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.g1 = this.a;
        p3477296814990354048.h1 = Integer.valueOf(this.b);
        p3477296814990354048.i1 = Integer.valueOf(this.c);
        p3477296814990354048.j1 = Integer.valueOf(this.d);
        G11312307416001574639 g11312307416001574639 = p3477296814990354048.g0;
        g11312307416001574639.e.b = Boolean.valueOf(this.e);
        g11312307416001574639.e.a = Integer.valueOf(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce3)) {
            return false;
        }
        ce3 ce3Var = (ce3) obj;
        return this.a.equals(ce3Var.a) && this.b == ce3Var.b && this.c == ce3Var.c && this.d == ce3Var.d && this.e == ce3Var.e && this.f == ce3Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int h = U1554499319261669842.h(this.d, U1554499319261669842.h(this.c, U1554499319261669842.h(this.b, this.a.hashCode() * 31)));
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f) + ((h + i) * 31);
    }

    public final String toString() {
        StringBuilder x = G6547577305291411977.x(this.b, "TelephonySignal(carrierCode=", this.a, ", networkTypeCoarse=", ", networkTypeFine=");
        G6547577305291411977.A(x, this.c, ", phoneType=", this.d, ", isActiveNetworkMetered=");
        x.append(this.e);
        x.append(", activeNetworkState=");
        x.append(this.f);
        x.append(")");
        return x.toString();
    }
}
