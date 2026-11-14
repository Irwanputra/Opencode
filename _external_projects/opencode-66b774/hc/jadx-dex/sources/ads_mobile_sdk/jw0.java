package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jw0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.jw0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private ads_mobile_sdk.xt clientPingMetadata_;
    private dev.epro.r0.O6641393078261985068 payloads_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.jw0 jw0Var = new ads_mobile_sdk.jw0();
        DEFAULT_INSTANCE = jw0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.jw0.class, jw0Var);
    }

    public static dev.epro.r0.I9118511705381956114 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "payloads_", ads_mobile_sdk.iw0.class, "clientPingMetadata_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.jw0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.I9118511705381956114(DEFAULT_INSTANCE);
    }

    public final void a(ads_mobile_sdk.iw0 iw0Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.payloads_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.payloads_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(iw0Var);
    }

    public final void a(ads_mobile_sdk.xt xtVar) {
        this.clientPingMetadata_ = xtVar;
        this.bitField0_ |= 1;
    }
}
