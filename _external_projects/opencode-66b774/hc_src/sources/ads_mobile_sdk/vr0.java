package ads_mobile_sdk;

import dev.epro.r0.C7584963549263810245;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vr0 extends cu0 {
    private static final vr0 DEFAULT_INSTANCE;
    public static final int c = 1;
    private gn1 adResponseLists_ = gn1.b;

    static {
        vr0 vr0Var = new vr0();
        DEFAULT_INSTANCE = vr0Var;
        cu0.a(vr0.class, vr0Var);
    }

    public static vr0 p() {
        return DEFAULT_INSTANCE;
    }

    public static C7584963549263810245 r() {
        return (C7584963549263810245) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"adResponseLists_", new dn1(ft3.d, ft3.f, g6.o())});
        }
        if (e == 3) {
            return new vr0();
        }
        if (e != 4) {
            return null;
        }
        return new C7584963549263810245(DEFAULT_INSTANCE);
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.adResponseLists_);
    }

    public final gn1 q() {
        gn1 gn1Var = this.adResponseLists_;
        if (gn1Var.a) {
            return gn1Var;
        }
        gn1 b = gn1Var.b();
        this.adResponseLists_ = b;
        return b;
    }
}
