package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class uq {
    public final dev.epro.r0.R122968600551594484 a;
    public final long b;

    public uq(dev.epro.r0.R122968600551594484 r122968600551594484, long j) {
        this.a = r122968600551594484;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.uq)) {
            return false;
        }
        ads_mobile_sdk.uq uqVar = (ads_mobile_sdk.uq) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, uqVar.a) && dev.epro.r0.E17093345031926825464.d(this.b, uqVar.b);
    }

    public final int hashCode() {
        dev.epro.r0.R122968600551594484 r122968600551594484 = this.a;
        int iHashCode = r122968600551594484 == null ? 0 : r122968600551594484.hashCode();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return java.lang.Long.hashCode(this.b) + (iHashCode * 31);
    }

    public final java.lang.String toString() {
        return "CachedAppSetIdInfo(appSetIdInfo=" + this.a + ", timestamp=" + dev.epro.r0.E17093345031926825464.l(this.b) + ")";
    }
}
