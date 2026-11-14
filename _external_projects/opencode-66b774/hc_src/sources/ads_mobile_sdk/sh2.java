package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class sh2 extends cu0 {
    private static final sh2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private gn1 includeSignals_ = gn1.b;
    private vm1 pattern_;

    static {
        sh2 sh2Var = new sh2();
        DEFAULT_INSTANCE = sh2Var;
        cu0.a(sh2.class, sh2Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pattern_", "includeSignals_", new dn1(ft3.d, ft3.f, d53.p())});
        }
        if (e == 3) {
            return new sh2();
        }
        if (e != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.includeSignals_);
    }

    public final vm1 p() {
        vm1 vm1Var = this.pattern_;
        return vm1Var == null ? vm1.p() : vm1Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }
}
