package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U12378827310912896889;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class rd extends cu0 {
    private static final rd DEFAULT_INSTANCE;
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
    public static final int f101o = 13;
    public static final int p = 14;
    private td automationVerdict_;
    private int bitField0_;
    private long deviceTrustworthinessDecisionLabel_;
    private long deviceTrustworthinessLevel_;
    private long humannessLevel_;
    private boolean isBattlestarEmulator_;
    private boolean isInvalidDeviceExperiment_;
    private boolean isInvalidDevice_;
    private long pairId_;
    private int responseType_;
    private boolean suspicious_;
    private long timestampMs_;
    private R17185427375111049466 reasons_ = jb1.e;
    private O6641393078261985068 crowdValidationOutcomes_ = in2.e;
    private U12378827310912896889 malwareClassifications_ = wm1.e;

    static {
        rd rdVar = new rd();
        DEFAULT_INSTANCE = rdVar;
        cu0.a(rd.class, rdVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014\rဇ\t\u000eဇ\n", new Object[]{"bitField0_", "timestampMs_", "responseType_", "suspicious_", "reasons_", "pairId_", "isBattlestarEmulator_", "crowdValidationOutcomes_", xd.class, "deviceTrustworthinessLevel_", "deviceTrustworthinessDecisionLabel_", "humannessLevel_", "automationVerdict_", "malwareClassifications_", "isInvalidDevice_", "isInvalidDeviceExperiment_"});
        }
        if (iE == 3) {
            return new rd();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
