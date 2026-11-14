package ads_mobile_sdk;

import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.Z8828090230903725619;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class m7 extends cu0 {
    private static final m7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int binaryName_;
    private int bitField0_;
    private int selectedExperimentIdsMemoizedSerializedSize = -1;
    private String versionNumber_ = "";
    private R17185427375111049466 selectedExperimentIds_ = jb1.e;

    static {
        m7 m7Var = new m7();
        DEFAULT_INSTANCE = m7Var;
        cu0.a(m7.class, m7Var);
    }

    public static Z8828090230903725619 o() {
        return (Z8828090230903725619) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"bitField0_", "binaryName_", "versionNumber_", "selectedExperimentIds_"});
        }
        if (iE == 3) {
            return new m7();
        }
        if (iE != 4) {
            return null;
        }
        return new Z8828090230903725619(DEFAULT_INSTANCE);
    }
}
