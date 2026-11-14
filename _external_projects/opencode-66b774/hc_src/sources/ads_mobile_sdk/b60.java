package ads_mobile_sdk;

import dev.epro.r0.R2891888705946997889;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class b60 extends cu0 {
    private static final b60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String postData_ = "";
    private int warningType_;

    static {
        b60 b60Var = new b60();
        DEFAULT_INSTANCE = b60Var;
        cu0.a(b60.class, b60Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "warningType_", tt.a$11, "postData_"});
        }
        if (e == 3) {
            return new b60();
        }
        if (e != 4) {
            return null;
        }
        return new R2891888705946997889(DEFAULT_INSTANCE);
    }
}
