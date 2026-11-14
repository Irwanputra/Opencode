package ads_mobile_sdk;

import dev.epro.r0.G1018228972762884510;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 extends cu0 {
    private static final pb2 DEFAULT_INSTANCE;
    public static final int c = 1;
    private O6641393078261985068 rules_ = in2.e;

    static {
        pb2 pb2Var = new pb2();
        DEFAULT_INSTANCE = pb2Var;
        cu0.a(pb2.class, pb2Var);
    }

    public static pb2 o() {
        return DEFAULT_INSTANCE;
    }

    public static G1018228972762884510 r() {
        return (G1018228972762884510) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", nb2.class});
        }
        if (iE == 3) {
            return new pb2();
        }
        if (iE != 4) {
            return null;
        }
        return new G1018228972762884510(DEFAULT_INSTANCE);
    }

    public final int p() {
        return this.rules_.size();
    }

    public final O6641393078261985068 q() {
        return this.rules_;
    }

    public static pb2 a(byte[] bArr) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0.a());
        cu0.a(cu0VarA);
        return (pb2) cu0VarA;
    }
}
