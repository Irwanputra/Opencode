package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tb2 implements dev.epro.r0.R16693852608535438299 {
    public final ads_mobile_sdk.wy0 a;

    public tb2(ads_mobile_sdk.wy0 wy0Var) {
        this.a = wy0Var;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        java.lang.String str;
        p3477296814990354048.getClass();
        ads_mobile_sdk.wy0 wy0Var = this.a;
        if (wy0Var == null || (str = wy0Var.a) == null) {
            return;
        }
        long j = wy0Var.b;
        if (j > 0) {
            long j2 = (j - 978307200000L) / 1000;
            dev.epro.r0.Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.c = str;
            z11002412878177644156.d = java.lang.Long.valueOf(j);
            z11002412878177644156.e = j2 < 0 ? 0L : java.lang.Long.valueOf(j2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.tb2) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.tb2) obj).a);
    }

    public final int hashCode() {
        ads_mobile_sdk.wy0 wy0Var = this.a;
        if (wy0Var == null) {
            return 0;
        }
        return wy0Var.hashCode();
    }

    public final java.lang.String toString() {
        return "PerAppIdV1Signal(paidV1Info=" + this.a + ")";
    }
}
