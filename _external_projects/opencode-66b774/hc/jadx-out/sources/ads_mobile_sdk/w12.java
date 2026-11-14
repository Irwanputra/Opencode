package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class w12 {
    public boolean a;
    public long d;
    public qo3 f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w12)) {
            return false;
        }
        w12 w12Var = (w12) obj;
        return this.a == w12Var.a && this.d == w12Var.d && S10823041268949770285.t(this.f, w12Var.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iJ = G6547577305291411977.j(r0 * 29791, this.d, 961);
        qo3 qo3Var = this.f;
        return iJ + (qo3Var == null ? 0 : qo3Var.hashCode());
    }

    public final String toString() {
        return "NativeVideoViewabilityState(isVisible=" + this.a + ", isPaused=false, isStopped=false, timestamp=" + this.d + ", doneReason=null, viewabilityEvent=" + this.f + ")";
    }
}
