package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class m8 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;

    public m8(java.lang.String str) {
        this.a = str;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.O = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.m8) && this.a.equals(((ads_mobile_sdk.m8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.s("AdSpamSignal(querySignal=", this.a, ")");
    }
}
