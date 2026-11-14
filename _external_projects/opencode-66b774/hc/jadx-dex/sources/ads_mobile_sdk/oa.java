package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class oa extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.oa DEFAULT_INSTANCE;
    public static final int c = 1;
    private dev.epro.r0.O6641393078261985068 initializationData_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.oa oaVar = new ads_mobile_sdk.oa();
        DEFAULT_INSTANCE = oaVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.oa.class, oaVar);
    }

    public static ads_mobile_sdk.oa o() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.E11743167429115753335 q() {
        return (dev.epro.r0.E11743167429115753335) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"initializationData_", ads_mobile_sdk.qa.class});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.oa();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.E11743167429115753335(DEFAULT_INSTANCE);
    }

    public final dev.epro.r0.O6641393078261985068 p$1() {
        return this.initializationData_;
    }
}
