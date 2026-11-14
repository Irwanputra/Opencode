package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.W2017849558429717064;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cl1 extends cu0 {
    private static final cl1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private String functionName_ = "";
    private int numIsolates_;

    static {
        cl1 cl1Var = new cl1();
        DEFAULT_INSTANCE = cl1Var;
        cu0.a(cl1.class, cl1Var);
    }

    public static W2017849558429717064 o() {
        return (W2017849558429717064) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"functionName_", "numIsolates_"});
        }
        if (iE == 3) {
            return new cl1();
        }
        if (iE != 4) {
            return null;
        }
        return new W2017849558429717064(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.functionName_ = str;
    }
}
