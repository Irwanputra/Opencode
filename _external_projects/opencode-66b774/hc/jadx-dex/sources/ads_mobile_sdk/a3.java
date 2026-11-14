package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a3 implements dev.epro.r0.R16693852608535438299 {
    public final dev.epro.r0.F6124250193528699243 a;

    public a3(dev.epro.r0.F6124250193528699243 f6124250193528699243) {
        this.a = f6124250193528699243;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        dev.epro.r0.F6124250193528699243 f6124250193528699243 = this.a;
        if (f6124250193528699243 != null) {
            dev.epro.r0.Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.j = f6124250193528699243.a;
            z11002412878177644156.k = java.lang.Boolean.valueOf(f6124250193528699243.b);
            z11002412878177644156.l = "adid";
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.a3) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.a3) obj).a);
    }

    public final int hashCode() {
        dev.epro.r0.F6124250193528699243 f6124250193528699243 = this.a;
        if (f6124250193528699243 == null) {
            return 0;
        }
        return f6124250193528699243.hashCode();
    }

    public final java.lang.String toString() {
        return "AdIdInfoSignal(adIdInfo=" + this.a + ")";
    }
}
