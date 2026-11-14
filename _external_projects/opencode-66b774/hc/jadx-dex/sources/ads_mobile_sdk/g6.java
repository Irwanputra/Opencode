package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g6 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.g6 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long lastAccessTimeMs_;
    private dev.epro.r0.O6641393078261985068 responses_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.g6 g6Var = new ads_mobile_sdk.g6();
        DEFAULT_INSTANCE = g6Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.g6.class, g6Var);
    }

    public static ads_mobile_sdk.g6 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new java.lang.Object[]{"bitField0_", "responses_", ads_mobile_sdk.b6.class, "lastAccessTimeMs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.g6();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Y12531765857967015337(DEFAULT_INSTANCE);
    }

    public final long p() {
        return this.lastAccessTimeMs_;
    }

    public final int q() {
        return this.responses_.size();
    }

    public final dev.epro.r0.O6641393078261985068 r() {
        return this.responses_;
    }

    public final void a(ads_mobile_sdk.b6 b6Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.responses_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.responses_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(b6Var);
    }

    public final void a(int i, ads_mobile_sdk.b6 b6Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.responses_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.responses_ = o6641393078261985068B;
        }
        o6641393078261985068B.set(i, b6Var);
    }
}
