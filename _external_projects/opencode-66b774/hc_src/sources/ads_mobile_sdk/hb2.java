package ads_mobile_sdk;

import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hb2 implements R16693852608535438299 {
    public final ts2 a;

    public hb2(ts2 ts2Var) {
        ts2Var.getClass();
        this.a = ts2Var;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        ts2 ts2Var = this.a;
        p3477296814990354048.S1 = ts2Var.a;
        p3477296814990354048.W1 = ts2Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb2) && S10823041268949770285.t(this.a, ((hb2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ParentAdConfigSignal(recursiveAdData=" + this.a + ")";
    }
}
