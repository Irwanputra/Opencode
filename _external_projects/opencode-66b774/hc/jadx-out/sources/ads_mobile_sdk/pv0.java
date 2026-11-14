package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T14972362143719499691;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 extends cu0 {
    private static final pv0 DEFAULT_INSTANCE;
    public static final int c = 14;
    private int bitField0_;
    private kv0 gmaSdkExceptionMessage_;

    static {
        pv0 pv0Var = new pv0();
        DEFAULT_INSTANCE = pv0Var;
        cu0.a(pv0.class, pv0Var);
    }

    public static T14972362143719499691 o() {
        return (T14972362143719499691) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\u0000", new Object[]{"bitField0_", "gmaSdkExceptionMessage_"});
        }
        if (iE == 3) {
            return new pv0();
        }
        if (iE != 4) {
            return null;
        }
        return new T14972362143719499691(DEFAULT_INSTANCE);
    }

    public final void a(kv0 kv0Var) {
        Objects.requireNonNull(kv0Var);
        this.gmaSdkExceptionMessage_ = kv0Var;
        this.bitField0_ |= 1;
    }
}
