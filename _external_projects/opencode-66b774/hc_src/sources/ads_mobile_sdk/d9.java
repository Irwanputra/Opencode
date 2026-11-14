package ads_mobile_sdk;

import dev.epro.r0.D3699235533239707501;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class d9 extends cu0 {
    private static final d9 DEFAULT_INSTANCE;
    public static final int c = 1;
    private O6641393078261985068 adUnitPatterns_ = in2.e;

    static {
        d9 d9Var = new d9();
        DEFAULT_INSTANCE = d9Var;
        cu0.a(d9.class, d9Var);
    }

    public static d9 p() {
        return DEFAULT_INSTANCE;
    }

    public static D3699235533239707501 q() {
        return (D3699235533239707501) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"adUnitPatterns_", z8.class});
        }
        if (e == 3) {
            return new d9();
        }
        if (e != 4) {
            return null;
        }
        return new D3699235533239707501(DEFAULT_INSTANCE);
    }

    public final O6641393078261985068 o() {
        return this.adUnitPatterns_;
    }
}
