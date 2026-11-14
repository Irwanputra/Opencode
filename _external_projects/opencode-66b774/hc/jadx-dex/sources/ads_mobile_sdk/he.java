package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class he extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.he DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 4;
    private int bitField0_;
    private long timestampMs_;
    private java.lang.String keyIdentifier_ = "";
    private ads_mobile_sdk.sq encryptedAdAttestationStatemement_ = ads_mobile_sdk.sq.b;

    static {
        ads_mobile_sdk.he heVar = new ads_mobile_sdk.he();
        DEFAULT_INSTANCE = heVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.he.class, heVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new java.lang.Object[]{"bitField0_", "timestampMs_", "keyIdentifier_", "encryptedAdAttestationStatemement_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.he();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }

    public final ads_mobile_sdk.sq o() {
        return this.encryptedAdAttestationStatemement_;
    }

    public final java.lang.String p() {
        return this.keyIdentifier_;
    }

    public final long q() {
        return this.timestampMs_;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }
}
