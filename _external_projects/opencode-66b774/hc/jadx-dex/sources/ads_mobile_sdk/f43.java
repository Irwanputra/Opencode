package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f43 implements dev.epro.r0.R16693852608535438299 {
    public final android.os.Bundle a;

    public f43(android.os.Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.m0 = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.f43) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.f43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SharedPreferenceSignal(sharedPreferences=" + this.a + ")";
    }
}
