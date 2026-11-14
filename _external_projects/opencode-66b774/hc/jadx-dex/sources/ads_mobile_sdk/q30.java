package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class q30 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.q30 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f91o = 13;
    public static final int p = 14;
    public static final int q = 15;
    public static final int r = 16;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    private long aesbLastUpdateTimeWindowsEpochMicros_;
    private int bitField0_;
    private java.lang.String finchActiveGroup_ = "";
    private dev.epro.r0.O6641393078261985068 finchActiveGroups_;
    private boolean isAesbEnabled_;
    private boolean isHighRiskUser_;
    private boolean isHistorySyncEnabled_;
    private boolean isIncognito_;
    private boolean isMbbEnabled_;
    private boolean isSignedIn_;
    private boolean isUnderAdvancedProtection_;
    private int numberOfLoadedProfiles_;
    private int numberOfOpenProfiles_;
    private int numberOfProfiles_;
    private dev.epro.r0.O6641393078261985068 pageLoadTokens_;
    private int polarbearPopulationMemoizedSerializedSize;
    private dev.epro.r0.R17185427375111049466 polarbearPopulation_;
    private int profileManagementStatus_;
    private int serverExperimentGroupsMemoizedSerializedSize;
    private dev.epro.r0.R17185427375111049466 serverExperimentGroups_;
    private java.lang.String userAgent_;
    private int userPopulation_;
    private static final dev.epro.r0.B4259731004323267459 polarbearPopulation_converter_ = new dev.epro.r0.Y2677586711477821327((byte) 8);
    private static final dev.epro.r0.B4259731004323267459 serverExperimentGroups_converter_ = new dev.epro.r0.P5733283974459951585((byte) 8);

    static {
        ads_mobile_sdk.q30 q30Var = new ads_mobile_sdk.q30();
        DEFAULT_INSTANCE = q30Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.q30.class, q30Var);
    }

    public q30() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.finchActiveGroups_ = in2Var;
        this.userAgent_ = "";
        this.pageLoadTokens_ = in2Var;
        ads_mobile_sdk.jb1 jb1Var = ads_mobile_sdk.jb1.e;
        this.polarbearPopulation_ = jb1Var;
        this.serverExperimentGroups_ = jb1Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new java.lang.Object[]{"bitField0_", "userPopulation_", ads_mobile_sdk.ad.a$26, "isHistorySyncEnabled_", "finchActiveGroup_", "finchActiveGroups_", "profileManagementStatus_", ads_mobile_sdk.ad.a$19, "isUnderAdvancedProtection_", "isIncognito_", "isMbbEnabled_", "userAgent_", "numberOfProfiles_", "numberOfLoadedProfiles_", "numberOfOpenProfiles_", "isHighRiskUser_", "pageLoadTokens_", ads_mobile_sdk.j30.class, "isAesbEnabled_", "aesbLastUpdateTimeWindowsEpochMicros_", "polarbearPopulation_", ads_mobile_sdk.tt.a$6, "isSignedIn_", "serverExperimentGroups_", ads_mobile_sdk.ad.a$21});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.q30();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
