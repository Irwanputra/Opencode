package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class dq extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.dq DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private dev.epro.r0.O6641393078261985068 thirdPartyJavascript_;
    private dev.epro.r0.O6641393078261985068 thirdPartySdk_;

    static {
        ads_mobile_sdk.dq dqVar = new ads_mobile_sdk.dq();
        DEFAULT_INSTANCE = dqVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.dq.class, dqVar);
    }

    public dq() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.thirdPartySdk_ = in2Var;
        this.thirdPartyJavascript_ = in2Var;
    }

    public static dev.epro.r0.K18029266284685972839 p() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"thirdPartySdk_", ads_mobile_sdk.cq.class, "thirdPartyJavascript_", ads_mobile_sdk.tp.class});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.dq();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.K18029266284685972839(DEFAULT_INSTANCE);
    }

    public final dev.epro.r0.O6641393078261985068 o() {
        return this.thirdPartySdk_;
    }

    public final void a(ads_mobile_sdk.cq cqVar) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.thirdPartySdk_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.thirdPartySdk_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(cqVar);
    }
}
