package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vm1 extends cu0 {
    private static final vm1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private O6641393078261985068 andNodes_;
    private int bitField0_;
    private mn1 matchNode_;
    private vm1 notNode_;
    private O6641393078261985068 orNodes_;

    static {
        vm1 vm1Var = new vm1();
        DEFAULT_INSTANCE = vm1Var;
        cu0.a(vm1.class, vm1Var);
    }

    public vm1() {
        in2 in2Var = in2.e;
        this.andNodes_ = in2Var;
        this.orNodes_ = in2Var;
    }

    public static vm1 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "andNodes_", vm1.class, "orNodes_", vm1.class, "notNode_", "matchNode_"});
        }
        if (e2 == 3) {
            return new vm1();
        }
        if (e2 != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final O6641393078261985068 o$1() {
        return this.andNodes_;
    }

    public final mn1 q() {
        mn1 mn1Var = this.matchNode_;
        return mn1Var == null ? mn1.q() : mn1Var;
    }

    public final vm1 r() {
        vm1 vm1Var = this.notNode_;
        return vm1Var == null ? DEFAULT_INSTANCE : vm1Var;
    }

    public final O6641393078261985068 s() {
        return this.orNodes_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
