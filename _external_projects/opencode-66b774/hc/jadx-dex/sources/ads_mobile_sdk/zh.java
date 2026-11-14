package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zh implements dev.epro.r0.R16693852608535438299 {
    public final boolean a;

    public zh(boolean z) {
        this.a = z;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.R = java.lang.Boolean.valueOf(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.zh) && this.a == ((ads_mobile_sdk.zh) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final java.lang.String toString() {
        return "AppOpenSignal(hasBeenForegrounded=" + this.a + ")";
    }
}
