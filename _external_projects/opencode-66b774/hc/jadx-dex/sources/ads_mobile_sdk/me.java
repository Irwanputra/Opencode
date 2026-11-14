package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class me implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final java.lang.Boolean b;

    public me(java.lang.String str, java.lang.Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        java.lang.String str = this.a;
        if (str != null) {
            dev.epro.r0.Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.n = str;
            z11002412878177644156.o = this.b;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.me)) {
            return false;
        }
        ads_mobile_sdk.me meVar = (ads_mobile_sdk.me) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, meVar.a) && dev.epro.r0.S10823041268949770285.t(this.b, meVar.b);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AmazonFireAdIdSignal(advertisingId=" + this.a + ", limitAdTracking=" + this.b + ")";
    }
}
