package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.R122968600551594484;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class uq {
    public final R122968600551594484 a;
    public final long b;

    public uq(R122968600551594484 r122968600551594484, long j) {
        this.a = r122968600551594484;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return S10823041268949770285.t(this.a, uqVar.a) && E17093345031926825464.d(this.b, uqVar.b);
    }

    public final int hashCode() {
        R122968600551594484 r122968600551594484 = this.a;
        int iHashCode = r122968600551594484 == null ? 0 : r122968600551594484.hashCode();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return Long.hashCode(this.b) + (iHashCode * 31);
    }

    public final String toString() {
        return "CachedAppSetIdInfo(appSetIdInfo=" + this.a + ", timestamp=" + E17093345031926825464.l(this.b) + ")";
    }
}
