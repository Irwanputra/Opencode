package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sm2 extends cu0 {
    private static final sm2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private long downloadTimestampSecs_;
    private long expiredTimestampSecs_;
    private long expiryPeriodSecs_;
    private String vmChecksum_ = "";
    private String bytecodeChecksum_ = "";

    static {
        sm2 sm2Var = new sm2();
        DEFAULT_INSTANCE = sm2Var;
        cu0.a(sm2.class, sm2Var);
    }

    public static sm2 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"bitField0_", "vmChecksum_", "bytecodeChecksum_", "expiredTimestampSecs_", "downloadTimestampSecs_", "expiryPeriodSecs_"});
        }
        if (iE == 3) {
            return new sm2();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final String o() {
        return this.bytecodeChecksum_;
    }

    public final long q() {
        return this.expiredTimestampSecs_;
    }

    public final String r() {
        return this.vmChecksum_;
    }
}
