package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum ph0 implements dev.epro.r0.O10710380540062020186 {
    TIER_UNKNOWN(0),
    TIER_INVALID_DATA_SOURCE(1),
    TIER_EXTREME_LOW(2),
    TIER_VERY_LOW(3),
    TIER_LOW(4),
    TIER_MID(5),
    TIER_MID_PLUS(6),
    TIER_HIGH(7),
    TIER_VERY_HIGH(8),
    TIER_EXTREME_HIGH(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIER_UNPARSABLE(255),
    UNRECOGNIZED(-1);

    public final int a;

    ph0(int i) {
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
        sb.append(ads_mobile_sdk.ph0.class.getName());
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
