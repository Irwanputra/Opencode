package ads_mobile_sdk;

import dev.epro.r0.G17382531225519199574;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bq extends cu0 {
    private static final bq DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long major_;
    private long micro_;
    private long minor_;

    static {
        bq bqVar = new bq();
        DEFAULT_INSTANCE = bqVar;
        cu0.a(bq.class, bqVar);
    }

    public static G17382531225519199574 o() {
        return (G17382531225519199574) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "major_", "minor_", "micro_"});
        }
        if (e2 == 3) {
            return new bq();
        }
        if (e2 != 4) {
            return null;
        }
        return new G17382531225519199574(DEFAULT_INSTANCE);
    }
}
