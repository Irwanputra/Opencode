package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class j70 implements R16693852608535438299 {
    public final I16631908410500040363 a;

    public j70(I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        this.a = i16631908410500040363;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.D = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j70) && S10823041268949770285.t(this.a, ((j70) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "CsrbEcoDataSignal(consentStateJson=" + this.a + ")";
    }
}
