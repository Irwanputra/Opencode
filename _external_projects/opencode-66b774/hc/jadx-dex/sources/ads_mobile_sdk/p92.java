package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p92 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.p92 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private ads_mobile_sdk.sq encryptedProgram_ = ads_mobile_sdk.sq.b;
    private ads_mobile_sdk.r92 metadata_;

    static {
        ads_mobile_sdk.p92 p92Var = new ads_mobile_sdk.p92();
        DEFAULT_INSTANCE = p92Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.p92.class, p92Var);
    }

    public static ads_mobile_sdk.p92 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new java.lang.Object[]{"bitField0_", "metadata_", "encryptedProgram_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.p92();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final ads_mobile_sdk.sq p() {
        return this.encryptedProgram_;
    }

    public final ads_mobile_sdk.r92 q() {
        ads_mobile_sdk.r92 r92Var = this.metadata_;
        return r92Var == null ? ads_mobile_sdk.r92.o() : r92Var;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }
}
