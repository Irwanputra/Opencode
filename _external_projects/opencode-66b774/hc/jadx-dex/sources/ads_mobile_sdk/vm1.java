package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vm1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.vm1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private dev.epro.r0.O6641393078261985068 andNodes_;
    private int bitField0_;
    private ads_mobile_sdk.mn1 matchNode_;
    private ads_mobile_sdk.vm1 notNode_;
    private dev.epro.r0.O6641393078261985068 orNodes_;

    static {
        ads_mobile_sdk.vm1 vm1Var = new ads_mobile_sdk.vm1();
        DEFAULT_INSTANCE = vm1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.vm1.class, vm1Var);
    }

    public vm1() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.andNodes_ = in2Var;
        this.orNodes_ = in2Var;
    }

    public static ads_mobile_sdk.vm1 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new java.lang.Object[]{"bitField0_", "andNodes_", ads_mobile_sdk.vm1.class, "orNodes_", ads_mobile_sdk.vm1.class, "notNode_", "matchNode_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.vm1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final dev.epro.r0.O6641393078261985068 o$1() {
        return this.andNodes_;
    }

    public final ads_mobile_sdk.mn1 q() {
        ads_mobile_sdk.mn1 mn1Var = this.matchNode_;
        return mn1Var == null ? ads_mobile_sdk.mn1.q() : mn1Var;
    }

    public final ads_mobile_sdk.vm1 r() {
        ads_mobile_sdk.vm1 vm1Var = this.notNode_;
        return vm1Var == null ? DEFAULT_INSTANCE : vm1Var;
    }

    public final dev.epro.r0.O6641393078261985068 s() {
        return this.orNodes_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
