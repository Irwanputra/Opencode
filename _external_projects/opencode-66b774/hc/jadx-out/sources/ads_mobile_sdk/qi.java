package ads_mobile_sdk;

import dev.epro.r0.D13094341114488948592;
import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.O6632708731651458164;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U12378827310912896889;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qi extends cu0 {
    private static final qi DEFAULT_INSTANCE;
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
    private gn1 adManagerSignalAdapterConfigs_;
    private gn1 adUnitAndFormatToMediationConfigs_;
    private gn1 adUnitAndFormatToRequestSignals_;
    private gn1 adUnitPatterns_;
    private gn1 adapterInitializationConfigs_;
    private gn1 admobSignalAdapterConfigs_;
    private String appSettingsJson_;
    private int appSettingsVersion_;
    private int bitField0_;
    private String commonSettingsJson_;
    private long lastUpdateTimeMs_;
    private int loggingOnlyExperimentIdsMemoizedSerializedSize = -1;
    private U12378827310912896889 loggingOnlyExperimentIds_;
    private long serverCacheTtlSecs_;
    private gn1 signalAdapterConfigs_;

    static {
        qi qiVar = new qi();
        DEFAULT_INSTANCE = qiVar;
        cu0.a(qi.class, qiVar);
    }

    public qi() {
        gn1 gn1Var = gn1.b;
        this.adUnitAndFormatToMediationConfigs_ = gn1Var;
        this.adUnitAndFormatToRequestSignals_ = gn1Var;
        this.adapterInitializationConfigs_ = gn1Var;
        this.adUnitPatterns_ = gn1Var;
        this.signalAdapterConfigs_ = gn1Var;
        this.admobSignalAdapterConfigs_ = gn1Var;
        this.adManagerSignalAdapterConfigs_ = gn1Var;
        this.appSettingsJson_ = "";
        this.loggingOnlyExperimentIds_ = wm1.e;
        this.commonSettingsJson_ = "";
    }

    public static O6632708731651458164 A() {
        return (O6632708731651458164) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            D13094341114488948592 d13094341114488948592 = ft3.f;
            return new ps2(DEFAULT_INSTANCE, "\u0004\r\u0000\u0001\u0001\r\r\u0007\u0001\u0000\u0001ለ\u0001\u0002ဂ\u0002\u0003ဂ\u0003\u0004%\u00052\u0006ለ\u0004\u00072\b2\t2\n2\u000b2\f2\rင\u0000", new Object[]{"bitField0_", "appSettingsJson_", "lastUpdateTimeMs_", "serverCacheTtlSecs_", "loggingOnlyExperimentIds_", "adUnitAndFormatToMediationConfigs_", new dn1(e2581631045160024594, d13094341114488948592, dp1.p()), "commonSettingsJson_", "adUnitAndFormatToRequestSignals_", new dn1(e2581631045160024594, e2581631045160024594, ""), "adapterInitializationConfigs_", new dn1(e2581631045160024594, d13094341114488948592, oa.o()), "adUnitPatterns_", new dn1(e2581631045160024594, d13094341114488948592, d9.p()), "signalAdapterConfigs_", new dn1(e2581631045160024594, d13094341114488948592, ap.o()), "admobSignalAdapterConfigs_", new dn1(e2581631045160024594, d13094341114488948592, ap.o()), "adManagerSignalAdapterConfigs_", new dn1(e2581631045160024594, d13094341114488948592, ap.o()), "appSettingsVersion_"});
        }
        if (iE == 3) {
            return new qi();
        }
        if (iE != 4) {
            return null;
        }
        return new O6632708731651458164(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 2;
        this.appSettingsJson_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 16;
        this.commonSettingsJson_ = str;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.adManagerSignalAdapterConfigs_);
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToMediationConfigs_);
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToRequestSignals_);
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.adUnitPatterns_);
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.adapterInitializationConfigs_);
    }

    public final Map t() {
        return Collections.unmodifiableMap(this.admobSignalAdapterConfigs_);
    }

    public static qi x() {
        return DEFAULT_INSTANCE;
    }

    public final String u() {
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

    public final String w() {
        return this.commonSettingsJson_;
    }

    public static qi a(FileInputStream fileInputStream) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(cu0VarA);
        return (qi) cu0VarA;
    }
}
