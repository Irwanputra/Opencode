package ads_mobile_sdk;

import dev.epro.r0.F6124250193528699243;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.Z11002412878177644156;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a3 implements R16693852608535438299 {
    public final F6124250193528699243 a;

    public a3(F6124250193528699243 f6124250193528699243) {
        this.a = f6124250193528699243;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        F6124250193528699243 f6124250193528699243 = this.a;
        if (f6124250193528699243 != null) {
            Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.j = f6124250193528699243.a;
            z11002412878177644156.k = Boolean.valueOf(f6124250193528699243.b);
            z11002412878177644156.l = "adid";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3) && S10823041268949770285.t(this.a, ((a3) obj).a);
    }

    public final int hashCode() {
        F6124250193528699243 f6124250193528699243 = this.a;
        if (f6124250193528699243 == null) {
            return 0;
        }
        return f6124250193528699243.hashCode();
    }

    public final String toString() {
        return "AdIdInfoSignal(adIdInfo=" + this.a + ")";
    }
}
