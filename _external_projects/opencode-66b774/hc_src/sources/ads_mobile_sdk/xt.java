package ads_mobile_sdk;

import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U9713920948222429651;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xt extends cu0 {
    private static final xt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int binaryName_;
    private int selectedExperimentIdsMemoizedSerializedSize = -1;
    private String versionNumber_ = "";
    private R17185427375111049466 selectedExperimentIds_ = jb1.e;

    static {
        xt xtVar = new xt();
        DEFAULT_INSTANCE = xtVar;
        cu0.a(xt.class, xtVar);
    }

    public static U9713920948222429651 o() {
        return (U9713920948222429651) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"binaryName_", "versionNumber_", "selectedExperimentIds_"});
        }
        if (e2 == 3) {
            return new xt();
        }
        if (e2 != 4) {
            return null;
        }
        return new U9713920948222429651(DEFAULT_INSTANCE);
    }
}
