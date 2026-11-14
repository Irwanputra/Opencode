package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vu0 extends pu0 {
    public final String c;
    public final Throwable d;

    public vu0(String str, Throwable th) {
        super(5);
        this.c = str;
        this.d = th;
    }

    @Override // ads_mobile_sdk.pu0
    public final Throwable b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0)) {
            return false;
        }
        vu0 vu0Var = (vu0) obj;
        return this.c.equals(vu0Var.c) && S10823041268949770285.t(this.d, vu0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Throwable th = this.d;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "NonRetryableNetworkError(message=" + this.c + ", exception=" + this.d + ")";
    }
}
