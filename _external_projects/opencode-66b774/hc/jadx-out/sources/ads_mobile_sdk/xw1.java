package ads_mobile_sdk;

import dev.epro.r0.R2891888705946997889;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends cu0 {
    private static final xw1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int sccgDir_;
    private boolean sccgTap_;

    static {
        xw1 xw1Var = new xw1();
        DEFAULT_INSTANCE = xw1Var;
        cu0.a(xw1.class, xw1Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "sccgDir_", "sccgTap_"});
        }
        if (iE == 3) {
            return new xw1();
        }
        if (iE != 4) {
            return null;
        }
        return new R2891888705946997889(DEFAULT_INSTANCE);
    }
}
