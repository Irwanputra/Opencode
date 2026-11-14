package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ch2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ch2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private dev.epro.r0.O6641393078261985068 androidLifecycleEvents_ = ads_mobile_sdk.in2.e;
    private long clickTimestampMs_;

    static {
        ads_mobile_sdk.ch2 ch2Var = new ads_mobile_sdk.ch2();
        DEFAULT_INSTANCE = ch2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ch2.class, ch2Var);
    }

    public static dev.epro.r0.X1306963851013033444 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new java.lang.Object[]{"androidLifecycleEvents_", ads_mobile_sdk.ue.class, "clickTimestampMs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ch2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.X1306963851013033444(DEFAULT_INSTANCE);
    }

    public final void a(ads_mobile_sdk.ue ueVar) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.androidLifecycleEvents_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.androidLifecycleEvents_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(ueVar);
    }
}
