package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u73 {
    public final cw0 a;
    public final uv0 b;
    public final u53 c;

    public /* synthetic */ u73(cw0 cw0Var, int i) {
        this(cw0Var, (i & 2) != 0 ? null : uv0.CACHED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u73)) {
            return false;
        }
        u73 u73Var = (u73) obj;
        return this.a == u73Var.a && this.b == u73Var.b && S10823041268949770285.t(this.c, u73Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uv0 uv0Var = this.b;
        int iHashCode2 = (iHashCode + (uv0Var == null ? 0 : uv0Var.hashCode())) * 31;
        u53 u53Var = this.c;
        return iHashCode2 + (u53Var != null ? u53Var.hashCode() : 0);
    }

    public final String toString() {
        return "SignalMeta(signalId=" + this.a + ", cacheState=" + this.b + ", signalData=" + this.c + ")";
    }

    public u73(cw0 cw0Var, uv0 uv0Var, u53 u53Var) {
        cw0Var.getClass();
        this.a = cw0Var;
        this.b = uv0Var;
        this.c = u53Var;
    }
}
