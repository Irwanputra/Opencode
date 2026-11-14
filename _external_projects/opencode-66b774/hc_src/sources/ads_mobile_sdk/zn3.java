package ads_mobile_sdk;

import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.R2891888705946997889;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zn3 extends cu0 {
    private static final zn3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String apiName_ = "";
    private R17185427375111049466 compatibleSdks_ = jb1.e;

    static {
        zn3 zn3Var = new zn3();
        DEFAULT_INSTANCE = zn3Var;
        cu0.a(zn3.class, zn3Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"bitField0_", "apiName_", "compatibleSdks_"});
        }
        if (e == 3) {
            return new zn3();
        }
        if (e != 4) {
            return null;
        }
        return new R2891888705946997889(DEFAULT_INSTANCE);
    }
}
