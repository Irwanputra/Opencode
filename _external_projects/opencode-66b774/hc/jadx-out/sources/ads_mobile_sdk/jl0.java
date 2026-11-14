package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class jl0 implements R16693852608535438299 {
    public final String a;

    public jl0(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        String str = this.a;
        if (M8927913404651150384.Y(str)) {
            return;
        }
        p3477296814990354048.k1 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl0) && S10823041268949770285.t(this.a, ((jl0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("ExperimentIdsSignal(experimentIds=", this.a, ")");
    }
}
