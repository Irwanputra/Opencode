package ads_mobile_sdk;

import dev.epro.r0.F1849192145084126292;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gv0 extends cu0 {
    private static final gv0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int count_;
    private int format_;

    static {
        gv0 gv0Var = new gv0();
        DEFAULT_INSTANCE = gv0Var;
        cu0.a(gv0.class, gv0Var);
    }

    public static F1849192145084126292 o() {
        return (F1849192145084126292) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"format_", "count_"});
        }
        if (e == 3) {
            return new gv0();
        }
        if (e != 4) {
            return null;
        }
        return new F1849192145084126292(DEFAULT_INSTANCE);
    }
}
