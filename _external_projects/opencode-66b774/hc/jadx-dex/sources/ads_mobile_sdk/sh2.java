package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class sh2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.sh2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private ads_mobile_sdk.gn1 includeSignals_ = ads_mobile_sdk.gn1.b;
    private ads_mobile_sdk.vm1 pattern_;

    static {
        ads_mobile_sdk.sh2 sh2Var = new ads_mobile_sdk.sh2();
        DEFAULT_INSTANCE = sh2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.sh2.class, sh2Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new java.lang.Object[]{"bitField0_", "pattern_", "includeSignals_", new ads_mobile_sdk.dn1(ads_mobile_sdk.ft3.d, ads_mobile_sdk.ft3.f, ads_mobile_sdk.d53.p())});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.sh2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.includeSignals_);
    }

    public final ads_mobile_sdk.vm1 p() {
        ads_mobile_sdk.vm1 vm1Var = this.pattern_;
        return vm1Var == null ? ads_mobile_sdk.vm1.p() : vm1Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }
}
