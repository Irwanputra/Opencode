package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.W12857842498428870907;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ze extends cu0 {
    private static final ze DEFAULT_INSTANCE;
    public static final int c = 1;
    private gn1 logs_ = gn1.b;

    static {
        ze zeVar = new ze();
        DEFAULT_INSTANCE = zeVar;
        cu0.a(ze.class, zeVar);
    }

    public static ze o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"logs_", new dn1(ft3.d, ft3.f, kv0.o())});
        }
        if (e == 3) {
            return new ze();
        }
        if (e != 4) {
            return null;
        }
        return new W12857842498428870907(DEFAULT_INSTANCE);
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.logs_);
    }

    public static ze a(FileInputStream fileInputStream) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(a);
        return (ze) a;
    }
}
