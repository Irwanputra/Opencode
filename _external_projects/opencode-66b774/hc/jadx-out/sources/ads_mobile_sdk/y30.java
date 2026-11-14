package ads_mobile_sdk;

import dev.epro.r0.R2891888705946997889;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y30 extends cu0 {
    private static final y30 DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private sq sha256_ = sq.b;

    static {
        y30 y30Var = new y30();
        DEFAULT_INSTANCE = y30Var;
        cu0.a(y30.class, y30Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "sha256_"});
        }
        if (iE == 3) {
            return new y30();
        }
        if (iE != 4) {
            return null;
        }
        return new R2891888705946997889(DEFAULT_INSTANCE);
    }
}
