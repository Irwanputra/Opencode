package ads_mobile_sdk;

import dev.epro.r0.J8751048437584784681;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class i42 extends cu0 {
    private static final i42 DEFAULT_INSTANCE;
    public static final int c = 1;
    private boolean deviceOnline_;

    static {
        i42 i42Var = new i42();
        DEFAULT_INSTANCE = i42Var;
        cu0.a(i42.class, i42Var);
    }

    public static J8751048437584784681 o() {
        return (J8751048437584784681) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"deviceOnline_"});
        }
        if (iE == 3) {
            return new i42();
        }
        if (iE != 4) {
            return null;
        }
        return new J8751048437584784681(DEFAULT_INSTANCE);
    }
}
