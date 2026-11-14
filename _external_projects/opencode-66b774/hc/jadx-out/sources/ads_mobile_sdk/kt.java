package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kt extends cu0 {
    private static final kt DEFAULT_INSTANCE;
    public static final int c = 5;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 10;
    public static final int j = 9;
    private int bitField0_;
    private O6641393078261985068 blobSet_;
    private O6641393078261985068 blob_;
    private bo3 compatInfo_;
    private String debugOnlyVersion_;
    private O6641393078261985068 pluginSets_;
    private int velourSdkInt_;
    private String appName_ = "";
    private String version_ = "";

    static {
        kt ktVar = new kt();
        DEFAULT_INSTANCE = ktVar;
        cu0.a(kt.class, ktVar);
    }

    public kt() {
        in2 in2Var = in2.e;
        this.blob_ = in2Var;
        this.blobSet_ = in2Var;
        this.pluginSets_ = in2Var;
        this.velourSdkInt_ = -1;
        this.debugOnlyVersion_ = "";
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"bitField0_", "version_", "blob_", ts.class, "blobSet_", bt.class, "velourSdkInt_", "appName_", "pluginSets_", st.class, "debugOnlyVersion_", "compatInfo_"});
        }
        if (iE == 3) {
            return new kt();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
