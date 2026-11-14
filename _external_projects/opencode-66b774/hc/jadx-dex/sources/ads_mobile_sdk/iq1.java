package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class iq1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.iq1 DEFAULT_INSTANCE;
    public static final int c = 1;
    private java.lang.String action_ = "";

    static {
        ads_mobile_sdk.iq1 iq1Var = new ads_mobile_sdk.iq1();
        DEFAULT_INSTANCE = iq1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.iq1.class, iq1Var);
    }

    public static dev.epro.r0.O7898789285361930225 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"action_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.iq1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.O7898789285361930225(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.action_ = str;
    }
}
