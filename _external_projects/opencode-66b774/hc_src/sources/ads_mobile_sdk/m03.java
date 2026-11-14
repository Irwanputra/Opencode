package ads_mobile_sdk;

import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class m03 implements R16693852608535438299 {
    public final List a;

    public m03(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        F14240031463097426304 f14240031463097426304 = new F14240031463097426304();
        List list = this.a;
        p3477296814990354048.D0 = f14240031463097426304.g(list);
        p3477296814990354048.E0 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m03) && S10823041268949770285.t(this.a, ((m03) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RtbSignal(rtbAdapterDataList=" + this.a + ")";
    }
}
