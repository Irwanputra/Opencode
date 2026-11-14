package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qi extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.qi DEFAULT_INSTANCE;
    public static final int c = 13;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 11;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f96o = 12;
    private ads_mobile_sdk.gn1 adManagerSignalAdapterConfigs_;
    private ads_mobile_sdk.gn1 adUnitAndFormatToMediationConfigs_;
    private ads_mobile_sdk.gn1 adUnitAndFormatToRequestSignals_;
    private ads_mobile_sdk.gn1 adUnitPatterns_;
    private ads_mobile_sdk.gn1 adapterInitializationConfigs_;
    private ads_mobile_sdk.gn1 admobSignalAdapterConfigs_;
    private java.lang.String appSettingsJson_;
    private int appSettingsVersion_;
    private int bitField0_;
    private java.lang.String commonSettingsJson_;
    private long lastUpdateTimeMs_;
    private int loggingOnlyExperimentIdsMemoizedSerializedSize = -1;
    private dev.epro.r0.U12378827310912896889 loggingOnlyExperimentIds_;
    private long serverCacheTtlSecs_;
    private ads_mobile_sdk.gn1 signalAdapterConfigs_;

    static {
        ads_mobile_sdk.qi qiVar = new ads_mobile_sdk.qi();
        DEFAULT_INSTANCE = qiVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.qi.class, qiVar);
    }

    public qi() {
        ads_mobile_sdk.gn1 gn1Var = ads_mobile_sdk.gn1.b;
        this.adUnitAndFormatToMediationConfigs_ = gn1Var;
        this.adUnitAndFormatToRequestSignals_ = gn1Var;
        this.adapterInitializationConfigs_ = gn1Var;
        this.adUnitPatterns_ = gn1Var;
        this.signalAdapterConfigs_ = gn1Var;
        this.admobSignalAdapterConfigs_ = gn1Var;
        this.adManagerSignalAdapterConfigs_ = gn1Var;
        this.appSettingsJson_ = "";
        this.loggingOnlyExperimentIds_ = ads_mobile_sdk.wm1.e;
        this.commonSettingsJson_ = "";
    }

    public static dev.epro.r0.O6632708731651458164 A() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            dev.epro.r0.D13094341114488948592 d13094341114488948592 = ads_mobile_sdk.ft3.f;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\r\u0000\u0001\u0001\r\r\u0007\u0001\u0000\u0001ለ\u0001\u0002ဂ\u0002\u0003ဂ\u0003\u0004%\u00052\u0006ለ\u0004\u00072\b2\t2\n2\u000b2\f2\rင\u0000", new java.lang.Object[]{"bitField0_", "appSettingsJson_", "lastUpdateTimeMs_", "serverCacheTtlSecs_", "loggingOnlyExperimentIds_", "adUnitAndFormatToMediationConfigs_", new ads_mobile_sdk.dn1(e2581631045160024594, d13094341114488948592, ads_mobile_sdk.dp1.p()), "commonSettingsJson_", "adUnitAndFormatToRequestSignals_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, ""), "adapterInitializationConfigs_", new ads_mobile_sdk.dn1(e2581631045160024594, d13094341114488948592, ads_mobile_sdk.oa.o()), "adUnitPatterns_", new ads_mobile_sdk.dn1(e2581631045160024594, d13094341114488948592, ads_mobile_sdk.d9.p()), "signalAdapterConfigs_", new ads_mobile_sdk.dn1(e2581631045160024594, d13094341114488948592, ads_mobile_sdk.ap.o()), "admobSignalAdapterConfigs_", new ads_mobile_sdk.dn1(e2581631045160024594, d13094341114488948592, ads_mobile_sdk.ap.o()), "adManagerSignalAdapterConfigs_", new ads_mobile_sdk.dn1(e2581631045160024594, d13094341114488948592, ads_mobile_sdk.ap.o()), "appSettingsVersion_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.qi();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.O6632708731651458164(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 2;
        this.appSettingsJson_ = str;
    }

    public final void c(java.lang.String str) {
        this.bitField0_ |= 16;
        this.commonSettingsJson_ = str;
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.adManagerSignalAdapterConfigs_);
    }

    public final java.util.Map p() {
        return java.util.Collections.unmodifiableMap(this.adUnitAndFormatToMediationConfigs_);
    }

    public final java.util.Map q() {
        return java.util.Collections.unmodifiableMap(this.adUnitAndFormatToRequestSignals_);
    }

    public final java.util.Map r() {
        return java.util.Collections.unmodifiableMap(this.adUnitPatterns_);
    }

    public final java.util.Map s() {
        return java.util.Collections.unmodifiableMap(this.adapterInitializationConfigs_);
    }

    public final java.util.Map t() {
        return java.util.Collections.unmodifiableMap(this.admobSignalAdapterConfigs_);
    }

    public static ads_mobile_sdk.qi x() {
        return DEFAULT_INSTANCE;
    }

    public final java.lang.String u() {
        return this.appSettingsJson_;
    }

    public final int v() {
        return this.appSettingsVersion_;
    }

    public final long y() {
        return this.lastUpdateTimeMs_;
    }

    public final long z() {
        return this.serverCacheTtlSecs_;
    }

    public final java.lang.String w() {
        return this.commonSettingsJson_;
    }

    public static ads_mobile_sdk.qi a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.qi) cu0VarA;
    }
}
