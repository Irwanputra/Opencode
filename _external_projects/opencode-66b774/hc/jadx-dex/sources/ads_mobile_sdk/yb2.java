package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yb2 implements dev.epro.r0.R16693852608535438299 {
    public final ads_mobile_sdk.xb2 a;

    public yb2(ads_mobile_sdk.xb2 xb2Var) {
        this.a = xb2Var;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        ads_mobile_sdk.wy0 wy0Var;
        java.lang.String str;
        p3477296814990354048.getClass();
        ads_mobile_sdk.xb2 xb2Var = this.a;
        if (xb2Var == null || (str = (wy0Var = xb2Var.a).a) == null) {
            return;
        }
        long j = wy0Var.b;
        if (j > 0) {
            dev.epro.r0.Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.f = str;
            z11002412878177644156.g = java.lang.Long.valueOf(j);
            z11002412878177644156.i = java.lang.Boolean.valueOf(xb2Var.b);
            z11002412878177644156.h = java.lang.Boolean.valueOf(xb2Var.c);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.yb2) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.yb2) obj).a);
    }

    public final int hashCode() {
        ads_mobile_sdk.xb2 xb2Var = this.a;
        if (xb2Var == null) {
            return 0;
        }
        return xb2Var.hashCode();
    }

    public final java.lang.String toString() {
        return "PerAppIdV2Signal(paidV2=" + this.a + ")";
    }
}
