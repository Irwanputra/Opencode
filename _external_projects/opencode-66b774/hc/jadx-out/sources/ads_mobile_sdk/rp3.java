package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T5192260350625585663;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class rp3 extends cu0 {
    private static final rp3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private O6641393078261985068 blockedStartupLocations_;
    private long maxTimePerTaskInUiThreadMs_;
    private O6641393078261985068 nonUiThreadBlockingStartupLocations_;
    private long totalTimeInUiThreadMs_;
    private O6641393078261985068 uiThreadBlockingStartupLocations_;

    static {
        rp3 rp3Var = new rp3();
        DEFAULT_INSTANCE = rp3Var;
        cu0.a(rp3.class, rp3Var);
    }

    public rp3() {
        in2 in2Var = in2.e;
        this.blockedStartupLocations_ = in2Var;
        this.nonUiThreadBlockingStartupLocations_ = in2Var;
        this.uiThreadBlockingStartupLocations_ = in2Var;
    }

    public static T5192260350625585663 o() {
        return (T5192260350625585663) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"totalTimeInUiThreadMs_", "maxTimePerTaskInUiThreadMs_", "blockedStartupLocations_", "nonUiThreadBlockingStartupLocations_", "uiThreadBlockingStartupLocations_"});
        }
        if (iE == 3) {
            return new rp3();
        }
        if (iE != 4) {
            return null;
        }
        return new T5192260350625585663(DEFAULT_INSTANCE);
    }
}
