package ads_mobile_sdk;

import dev.epro.r0.R2891888705946997889;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zs extends cu0 {
    private static final zs DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private xs increment_;

    static {
        zs zsVar = new zs();
        DEFAULT_INSTANCE = zsVar;
        cu0.a(zs.class, zsVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "increment_"});
        }
        if (e == 3) {
            return new zs();
        }
        if (e != 4) {
            return null;
        }
        return new R2891888705946997889(DEFAULT_INSTANCE);
    }
}
