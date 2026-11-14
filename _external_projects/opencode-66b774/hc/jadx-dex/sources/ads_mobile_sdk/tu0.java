package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tu0 extends ads_mobile_sdk.pu0 {
    public final java.lang.String c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(java.lang.String str, int i) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.tu0)) {
            return false;
        }
        ads_mobile_sdk.tu0 tu0Var = (ads_mobile_sdk.tu0) obj;
        return dev.epro.r0.S10823041268949770285.t(this.c, tu0Var.c) && this.d == tu0Var.d;
    }

    public final int hashCode() {
        return dev.epro.r0.L11610354117192841236.A(this.d) + (this.c.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("MessageError(message=", this.c, ", internalErrorCode=");
        sbG.append(dev.epro.r0.X2485016533998461232.m(this.d));
        sbG.append(")");
        return sbG.toString();
    }
}
