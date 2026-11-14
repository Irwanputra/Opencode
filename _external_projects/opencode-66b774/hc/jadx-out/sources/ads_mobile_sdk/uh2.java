package ads_mobile_sdk;

import dev.epro.r0.A2833667236973130790;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class uh2 extends cu0 {
    private static final uh2 DEFAULT_INSTANCE;
    public static final int c = 1;
    private O6641393078261985068 rules_ = in2.e;

    static {
        uh2 uh2Var = new uh2();
        DEFAULT_INSTANCE = uh2Var;
        cu0.a(uh2.class, uh2Var);
    }

    public static uh2 o() {
        return DEFAULT_INSTANCE;
    }

    public static A2833667236973130790 r() {
        return (A2833667236973130790) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", sh2.class});
        }
        if (iE == 3) {
            return new uh2();
        }
        if (iE != 4) {
            return null;
        }
        return new A2833667236973130790(DEFAULT_INSTANCE);
    }

    public final int p() {
        return this.rules_.size();
    }

    public final O6641393078261985068 q() {
        return this.rules_;
    }

    public static uh2 a(byte[] bArr) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0.a());
        cu0.a(cu0VarA);
        return (uh2) cu0VarA;
    }
}
