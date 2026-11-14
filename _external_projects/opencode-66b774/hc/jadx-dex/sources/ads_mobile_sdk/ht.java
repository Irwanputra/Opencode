package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ht extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ht DEFAULT_INSTANCE;
    public static final int c = 13;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 10;
    public static final int h = 7;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 9;
    public static final int l = 15;
    private int bitField0_;
    private long configTimeUsec_;
    private ads_mobile_sdk.mt deviceProperties_;
    private dev.epro.r0.O6641393078261985068 downloadedBlob_;
    private dev.epro.r0.R17185427375111049466 experimentId_;
    private ads_mobile_sdk.il0 externalClientExperimentIds_;
    private java.lang.String overrideZwiebackNid_;
    private dev.epro.r0.O6641393078261985068 serverToken_;
    private dev.epro.r0.R17185427375111049466 triggerExperimentId_;
    private ads_mobile_sdk.kt versionInfo_;
    private int experimentIdMemoizedSerializedSize = -1;
    private int triggerExperimentIdMemoizedSerializedSize = -1;
    private ads_mobile_sdk.sq gzipCompressed_ = ads_mobile_sdk.sq.b;

    static {
        ads_mobile_sdk.ht htVar = new ads_mobile_sdk.ht();
        DEFAULT_INSTANCE = htVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ht.class, htVar);
    }

    public ht() {
        ads_mobile_sdk.jb1 jb1Var = ads_mobile_sdk.jb1.e;
        this.experimentId_ = jb1Var;
        this.triggerExperimentId_ = jb1Var;
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.serverToken_ = in2Var;
        this.overrideZwiebackNid_ = "";
        this.downloadedBlob_ = in2Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new java.lang.Object[]{"bitField0_", "experimentId_", "configTimeUsec_", "triggerExperimentId_", "downloadedBlob_", ads_mobile_sdk.ts.class, "versionInfo_", "overrideZwiebackNid_", "deviceProperties_", "serverToken_", "gzipCompressed_", "externalClientExperimentIds_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ht();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }

    public static ads_mobile_sdk.ht a(byte[] bArr, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.ht) cu0VarA;
    }
}
