package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum xv0 implements dev.epro.r0.O10710380540062020186 {
    FORMAT_UNKNOWN(0),
    FORMAT_BANNER(1),
    FORMAT_INTERSTITIAL(2),
    FORMAT_REWARDED(3),
    FORMAT_REWARDED_INTERSTITIAL(4),
    FORMAT_APP_OPEN(5),
    FORMAT_NATIVE(6),
    FORMAT_ICON(7),
    FORMAT_SWIPEABLE_INTERSTITIAL(8),
    UNRECOGNIZED(-1);

    public final int a;

    xv0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        byte[] bArr = ads_mobile_sdk.rb1.a;
        dev.epro.r0.S10973172697741180971.j("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
        sb.append(ads_mobile_sdk.xv0.class.getName());
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(getNumber());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
