package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U12378827310912896889;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class td extends cu0 {
    private static final td DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private U12378827310912896889 labels_;
    private U12378827310912896889 reasons_;
    private int labelsMemoizedSerializedSize = -1;
    private int reasonsMemoizedSerializedSize = -1;

    static {
        td tdVar = new td();
        DEFAULT_INSTANCE = tdVar;
        cu0.a(td.class, tdVar);
    }

    public td() {
        wm1 wm1Var = wm1.e;
        this.labels_ = wm1Var;
        this.reasons_ = wm1Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"labels_", "reasons_"});
        }
        if (e == 3) {
            return new td();
        }
        if (e != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
