package ads_mobile_sdk;

import dev.epro.r0.B6062915069895823126;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class dp1 extends cu0 {
    private static final dp1 DEFAULT_INSTANCE;
    public static final int c = 1;
    private O6641393078261985068 adNetworkInfo_ = in2.e;

    static {
        dp1 dp1Var = new dp1();
        DEFAULT_INSTANCE = dp1Var;
        cu0.a(dp1.class, dp1Var);
    }

    public static dp1 p() {
        return DEFAULT_INSTANCE;
    }

    public static B6062915069895823126 q() {
        return (B6062915069895823126) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"adNetworkInfo_", yn1.class});
        }
        if (e == 3) {
            return new dp1();
        }
        if (e != 4) {
            return null;
        }
        return new B6062915069895823126(DEFAULT_INSTANCE);
    }

    public final O6641393078261985068 o() {
        return this.adNetworkInfo_;
    }
}
