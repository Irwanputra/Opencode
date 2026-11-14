package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qu0 extends ads_mobile_sdk.pu0 {
    public final java.lang.Throwable c;
    public final int d;
    public final java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(int i, java.lang.String str, java.lang.Throwable th) {
        super(i);
        th.getClass();
        if (i == 0) {
            throw null;
        }
        this.c = th;
        this.d = i;
        this.e = str;
    }

    @Override // ads_mobile_sdk.pu0
    public final int a() {
        return this.d;
    }

    @Override // ads_mobile_sdk.pu0
    public final java.lang.Throwable b() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.qu0)) {
            return false;
        }
        ads_mobile_sdk.qu0 qu0Var = (ads_mobile_sdk.qu0) obj;
        return dev.epro.r0.S10823041268949770285.t(this.c, qu0Var.c) && this.d == qu0Var.d && dev.epro.r0.S10823041268949770285.t(this.e, qu0Var.e);
    }

    public final int hashCode() {
        int iA = (dev.epro.r0.L11610354117192841236.A(this.d) + (this.c.hashCode() * 31)) * 31;
        java.lang.String str = this.e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "ExceptionError(exception=" + this.c + ", internalErrorCode=" + dev.epro.r0.X2485016533998461232.m(this.d) + ", message=" + this.e + ")";
    }

    public /* synthetic */ qu0(java.lang.Throwable th, int i, java.lang.String str, int i2) {
        this((i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? null : str, th);
    }
}
