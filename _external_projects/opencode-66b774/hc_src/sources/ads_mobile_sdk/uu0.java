package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class uu0 extends pu0 {
    public final String c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(String str, boolean z) {
        super(3);
        str.getClass();
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) obj;
        return S10823041268949770285.t(this.c, uu0Var.c) && this.d == uu0Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NoFillError(message=" + this.c + ", isThrottled=" + this.d + ")";
    }

    public uu0(String str, int i) {
        this((i & 1) != 0 ? "No fill." : str, false);
    }
}
