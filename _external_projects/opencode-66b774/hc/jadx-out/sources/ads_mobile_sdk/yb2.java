package ads_mobile_sdk;

import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.Z11002412878177644156;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 implements R16693852608535438299 {
    public final xb2 a;

    public yb2(xb2 xb2Var) {
        this.a = xb2Var;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        wy0 wy0Var;
        String str;
        p3477296814990354048.getClass();
        xb2 xb2Var = this.a;
        if (xb2Var == null || (str = (wy0Var = xb2Var.a).a) == null) {
            return;
        }
        long j = wy0Var.b;
        if (j > 0) {
            Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.f = str;
            z11002412878177644156.g = Long.valueOf(j);
            z11002412878177644156.i = Boolean.valueOf(xb2Var.b);
            z11002412878177644156.h = Boolean.valueOf(xb2Var.c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb2) && S10823041268949770285.t(this.a, ((yb2) obj).a);
    }

    public final int hashCode() {
        xb2 xb2Var = this.a;
        if (xb2Var == null) {
            return 0;
        }
        return xb2Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV2Signal(paidV2=" + this.a + ")";
    }
}
