package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ht extends cu0 {
    private static final ht DEFAULT_INSTANCE;
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
    private mt deviceProperties_;
    private O6641393078261985068 downloadedBlob_;
    private R17185427375111049466 experimentId_;
    private il0 externalClientExperimentIds_;
    private String overrideZwiebackNid_;
    private O6641393078261985068 serverToken_;
    private R17185427375111049466 triggerExperimentId_;
    private kt versionInfo_;
    private int experimentIdMemoizedSerializedSize = -1;
    private int triggerExperimentIdMemoizedSerializedSize = -1;
    private sq gzipCompressed_ = sq.b;

    static {
        ht htVar = new ht();
        DEFAULT_INSTANCE = htVar;
        cu0.a(ht.class, htVar);
    }

    public ht() {
        jb1 jb1Var = jb1.e;
        this.experimentId_ = jb1Var;
        this.triggerExperimentId_ = jb1Var;
        in2 in2Var = in2.e;
        this.serverToken_ = in2Var;
        this.overrideZwiebackNid_ = "";
        this.downloadedBlob_ = in2Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"bitField0_", "experimentId_", "configTimeUsec_", "triggerExperimentId_", "downloadedBlob_", ts.class, "versionInfo_", "overrideZwiebackNid_", "deviceProperties_", "serverToken_", "gzipCompressed_", "externalClientExperimentIds_"});
        }
        if (iE == 3) {
            return new ht();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }

    public static ht a(byte[] bArr, nl0 nl0Var) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        cu0.a(cu0VarA);
        return (ht) cu0VarA;
    }
}
