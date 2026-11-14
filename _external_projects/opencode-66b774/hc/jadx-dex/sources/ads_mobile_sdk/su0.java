package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class su0 extends ads_mobile_sdk.pu0 {
    public final dev.epro.r0.S12306309242770307923 c;

    public su0(dev.epro.r0.S12306309242770307923 s12306309242770307923) {
        super(13);
        this.c = s12306309242770307923;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.su0) && this.c.equals(((ads_mobile_sdk.su0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "InternalMediationAdError(mediationAdError=" + this.c + ")";
    }
}
