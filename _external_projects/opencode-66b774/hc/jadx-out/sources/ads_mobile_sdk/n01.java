package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.W17652710899820817444;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class n01 extends cu0 {
    private static final n01 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int action_;
    private String message_ = "";

    static {
        n01 n01Var = new n01();
        DEFAULT_INSTANCE = n01Var;
        cu0.a(n01.class, n01Var);
    }

    public static W17652710899820817444 o() {
        return (W17652710899820817444) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "message_"});
        }
        if (iE == 3) {
            return new n01();
        }
        if (iE != 4) {
            return null;
        }
        return new W17652710899820817444(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.message_ = str;
    }
}
