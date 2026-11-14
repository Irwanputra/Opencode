package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xs extends cu0 {
    private static final xs DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private String baseId_ = "";
    private int bitField0_;
    private int type_;

    static {
        xs xsVar = new xs();
        DEFAULT_INSTANCE = xsVar;
        cu0.a(xs.class, xsVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "baseId_", "type_", ad.a$25});
        }
        if (e == 3) {
            return new xs();
        }
        if (e != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
