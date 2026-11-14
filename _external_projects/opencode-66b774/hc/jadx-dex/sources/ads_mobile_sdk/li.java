package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class li implements dev.epro.r0.R16693852608535438299 {
    public final dev.epro.r0.R122968600551594484 a;

    public li(dev.epro.r0.R122968600551594484 r122968600551594484) {
        this.a = r122968600551594484;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        dev.epro.r0.R122968600551594484 r122968600551594484 = this.a;
        if (r122968600551594484 != null) {
            dev.epro.r0.Z11002412878177644156 z11002412878177644156 = p3477296814990354048.T;
            z11002412878177644156.a = r122968600551594484.a;
            z11002412878177644156.b = java.lang.Integer.valueOf(r122968600551594484.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.li) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.li) obj).a);
    }

    public final int hashCode() {
        dev.epro.r0.R122968600551594484 r122968600551594484 = this.a;
        if (r122968600551594484 == null) {
            return 0;
        }
        return r122968600551594484.hashCode();
    }

    public final java.lang.String toString() {
        return "AppSetIdInfoSignal(appSetIdInfo=" + this.a + ")";
    }
}
