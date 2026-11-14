package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.Z10352821448393905481;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y7 extends cu0 {
    private static final y7 DEFAULT_INSTANCE;
    public static final int c = 18;
    private s7 adshieldMonitoringMessage_;
    private int bitField0_;

    static {
        y7 y7Var = new y7();
        DEFAULT_INSTANCE = y7Var;
        cu0.a(y7.class, y7Var);
    }

    public static Z10352821448393905481 o() {
        return (Z10352821448393905481) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"bitField0_", "adshieldMonitoringMessage_"});
        }
        if (iE == 3) {
            return new y7();
        }
        if (iE != 4) {
            return null;
        }
        return new Z10352821448393905481(DEFAULT_INSTANCE);
    }

    public final void a(s7 s7Var) {
        this.adshieldMonitoringMessage_ = s7Var;
        this.bitField0_ |= 1;
    }
}
