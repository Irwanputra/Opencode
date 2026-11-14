package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bo3 extends cu0 {
    private static final bo3 DEFAULT_INSTANCE;
    public static final int c = 1;
    private O6641393078261985068 apiCompats_ = in2.e;

    static {
        bo3 bo3Var = new bo3();
        DEFAULT_INSTANCE = bo3Var;
        cu0.a(bo3.class, bo3Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"apiCompats_", zn3.class});
        }
        if (e == 3) {
            return new bo3();
        }
        if (e != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
