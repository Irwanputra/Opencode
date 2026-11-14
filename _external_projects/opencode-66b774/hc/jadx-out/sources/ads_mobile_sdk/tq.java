package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tq {
    public final bm1 a;
    public final se2 b;

    public tq(bm1 bm1Var, se2 se2Var) {
        this.a = bm1Var;
        this.b = se2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) obj;
        return S10823041268949770285.t(this.a, tqVar.a) && this.b == tqVar.b;
    }

    public final int hashCode() {
        bm1 bm1Var = this.a;
        int iHashCode = (bm1Var == null ? 0 : bm1Var.hashCode()) * 31;
        se2 se2Var = this.b;
        return iHashCode + (se2Var != null ? se2Var.hashCode() : 0);
    }

    public final String toString() {
        return "CacheLoadResult(loadedAd=" + this.a + ", missReason=" + this.b + ")";
    }
}
