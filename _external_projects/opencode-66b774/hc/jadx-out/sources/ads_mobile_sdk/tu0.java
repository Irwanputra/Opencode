package ads_mobile_sdk;

import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.X2485016533998461232;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 extends pu0 {
    public final String c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(String str, int i) {
        super(i);
        if (i == 0) {
            throw null;
        }
        this.c = str;
        this.d = i;
    }

    @Override // ads_mobile_sdk.pu0
    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu0)) {
            return false;
        }
        tu0 tu0Var = (tu0) obj;
        return S10823041268949770285.t(this.c, tu0Var.c) && this.d == tu0Var.d;
    }

    public final int hashCode() {
        return L11610354117192841236.A(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbG = X2485016533998461232.g("MessageError(message=", this.c, ", internalErrorCode=");
        sbG.append(X2485016533998461232.m(this.d));
        sbG.append(")");
        return sbG.toString();
    }
}
