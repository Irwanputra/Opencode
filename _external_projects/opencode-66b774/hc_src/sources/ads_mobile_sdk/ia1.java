package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ia1 implements R16693852608535438299 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ia1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        String str = this.a;
        if (str != null) {
            p3477296814990354048.s0 = str;
        }
        boolean z = this.b;
        p3477296814990354048.q0 = z ? 1 : 0;
        boolean z2 = this.c;
        p3477296814990354048.r0 = z2 ? 1 : 0;
        if (z || z2) {
            p3477296814990354048.t0 = Integer.valueOf(this.d ? 0 : 1);
            p3477296814990354048.p0 = Boolean.valueOf(this.e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia1)) {
            return false;
        }
        ia1 ia1Var = (ia1) obj;
        return S10823041268949770285.t(this.a, ia1Var.a) && this.b == ia1Var.b && this.c == ia1Var.c && this.d == ia1Var.d && this.e == ia1Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.d;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.e;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InspectorSignal(requestExtras=");
        sb.append(this.a);
        sb.append(", isTestMode=");
        sb.append(this.b);
        sb.append(", isLinkedDevice=");
        E12098517352909843120.u(sb, this.c, ", hasServerData=", this.d, ", shouldCollectAdResponseLogs=");
        return E12098517352909843120.o(sb, this.e, ")");
    }
}
