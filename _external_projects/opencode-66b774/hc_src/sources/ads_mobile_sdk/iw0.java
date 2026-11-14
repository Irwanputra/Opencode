package ads_mobile_sdk;

import dev.epro.r0.G13712527649795967703;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class iw0 extends cu0 {
    private static final iw0 DEFAULT_INSTANCE;
    public static final int c = 6;
    private int bitField0_;
    private ew0 gmaSdkMonitoringMessage_;

    static {
        iw0 iw0Var = new iw0();
        DEFAULT_INSTANCE = iw0Var;
        cu0.a(iw0.class, iw0Var);
    }

    public static G13712527649795967703 o() {
        return (G13712527649795967703) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"bitField0_", "gmaSdkMonitoringMessage_"});
        }
        if (e == 3) {
            return new iw0();
        }
        if (e != 4) {
            return null;
        }
        return new G13712527649795967703(DEFAULT_INSTANCE);
    }

    public final void a(ew0 ew0Var) {
        this.gmaSdkMonitoringMessage_ = ew0Var;
        this.bitField0_ |= 1;
    }
}
