package ads_mobile_sdk;

import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R122968600551594484;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.Z11002412878177644156;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class li implements R16693852608535438299 {
    public final R122968600551594484 a;

    public li(R122968600551594484 r122968600551594484) {
        this.a = r122968600551594484;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        R122968600551594484 r122968600551594484 = this.a;
        if (r122968600551594484 != null) {
            Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.a = r122968600551594484.a;
            z11002412878177644156.b = Integer.valueOf(r122968600551594484.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li) && S10823041268949770285.t(this.a, ((li) obj).a);
    }

    public final int hashCode() {
        R122968600551594484 r122968600551594484 = this.a;
        if (r122968600551594484 == null) {
            return 0;
        }
        return r122968600551594484.hashCode();
    }

    public final String toString() {
        return "AppSetIdInfoSignal(appSetIdInfo=" + this.a + ")";
    }
}
