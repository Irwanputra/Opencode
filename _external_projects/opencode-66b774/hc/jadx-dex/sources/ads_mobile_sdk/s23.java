package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum s23 implements dev.epro.r0.O10710380540062020186 {
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_AUTO_PLAY_START_TIME_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_AUTO_PLAY_START_TIME_ONE_PIXEL(1),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_AUTO_PLAY_START_TIME_AD_SETTLED(2),
    UNRECOGNIZED(-1);

    public final int a;

    s23(int i) {
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
        sb.append(ads_mobile_sdk.s23.class.getName());
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
