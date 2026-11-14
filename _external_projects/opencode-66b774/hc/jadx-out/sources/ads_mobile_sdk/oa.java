package ads_mobile_sdk;

import dev.epro.r0.E11743167429115753335;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends cu0 {
    private static final oa DEFAULT_INSTANCE;
    public static final int c = 1;
    private O6641393078261985068 initializationData_ = in2.e;

    static {
        oa oaVar = new oa();
        DEFAULT_INSTANCE = oaVar;
        cu0.a(oa.class, oaVar);
    }

    public static oa o() {
        return DEFAULT_INSTANCE;
    }

    public static E11743167429115753335 q() {
        return (E11743167429115753335) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"initializationData_", qa.class});
        }
        if (iE == 3) {
            return new oa();
        }
        if (iE != 4) {
            return null;
        }
        return new E11743167429115753335(DEFAULT_INSTANCE);
    }

    public final O6641393078261985068 p$1() {
        return this.initializationData_;
    }
}
