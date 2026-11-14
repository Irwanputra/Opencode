package ads_mobile_sdk;

import dev.epro.r0.F11088587460429668114;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vc extends cu0 {
    private static final vc DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long source_ = -1;
    private int isPhysicalInput_ = 1000;
    private int verified_ = 1000;

    static {
        vc vcVar = new vc();
        DEFAULT_INSTANCE = vcVar;
        cu0.a(vc.class, vcVar);
    }

    public static F11088587460429668114 o() {
        return (F11088587460429668114) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            ad adVar = ad.a$2;
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "source_", "isPhysicalInput_", adVar, "verified_", adVar});
        }
        if (iE == 3) {
            return new vc();
        }
        if (iE != 4) {
            return null;
        }
        return new F11088587460429668114(DEFAULT_INSTANCE);
    }
}
