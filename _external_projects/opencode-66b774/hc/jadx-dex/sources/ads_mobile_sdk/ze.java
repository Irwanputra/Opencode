package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ze extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ze DEFAULT_INSTANCE;
    public static final int c = 1;
    private ads_mobile_sdk.gn1 logs_ = ads_mobile_sdk.gn1.b;

    static {
        ads_mobile_sdk.ze zeVar = new ads_mobile_sdk.ze();
        DEFAULT_INSTANCE = zeVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ze.class, zeVar);
    }

    public static ads_mobile_sdk.ze o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"logs_", new ads_mobile_sdk.dn1(ads_mobile_sdk.ft3.d, ads_mobile_sdk.ft3.f, ads_mobile_sdk.kv0.o())});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ze();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.W12857842498428870907(DEFAULT_INSTANCE);
    }

    public final java.util.Map p() {
        return java.util.Collections.unmodifiableMap(this.logs_);
    }

    public static ads_mobile_sdk.ze a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.ze) cu0VarA;
    }
}
