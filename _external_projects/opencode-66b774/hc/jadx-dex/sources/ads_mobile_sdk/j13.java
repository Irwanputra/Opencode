package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j13 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.j13 DEFAULT_INSTANCE;
    public static final int c = 1;
    private dev.epro.r0.O6641393078261985068 evictions_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.j13 j13Var = new ads_mobile_sdk.j13();
        DEFAULT_INSTANCE = j13Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.j13.class, j13Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"evictions_", ads_mobile_sdk.h13.class});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.j13();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
