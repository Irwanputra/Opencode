package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xn3 extends cu0 {
    private static final xn3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int protocolNumber_;
    private int variant_;

    static {
        xn3 xn3Var = new xn3();
        DEFAULT_INSTANCE = xn3Var;
        cu0.a(xn3.class, xn3Var);
    }

    public static xn3 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "protocolNumber_", "variant_"});
        }
        if (iE == 3) {
            return new xn3();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final int p() {
        return this.protocolNumber_;
    }

    public final int q() {
        return this.variant_;
    }
}
