package ads_mobile_sdk;

import dev.epro.r0.C7584963549263810245;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"adResponseLists_", new dn1(ft3.d, ft3.f, g6.o())});
        }
        if (iE == 3) {
            return new vr0();
        }
        if (iE != 4) {
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
        gn1 gn1VarB = gn1Var.b();
        this.adResponseLists_ = gn1VarB;
        return gn1VarB;
    }
}
