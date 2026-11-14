package ads_mobile_sdk;

import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yu0 extends pu0 {
    public final String c;
    public final Throwable d;

    public yu0(P2480554073835519965 p2480554073835519965, int i) {
        this("Operation timed out.", (i & 2) != 0 ? null : p2480554073835519965);
    }

    @Override // ads_mobile_sdk.pu0
    public final Throwable b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0)) {
            return false;
        }
        yu0 yu0Var = (yu0) obj;
        return S10823041268949770285.t(this.c, yu0Var.c) && S10823041268949770285.t(this.d, yu0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Throwable th = this.d;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "TimeoutError(message=" + this.c + ", exception=" + this.d + ")";
    }

    public yu0(String str, Throwable th) {
        super(16);
        this.c = str;
        this.d = th;
    }
}
