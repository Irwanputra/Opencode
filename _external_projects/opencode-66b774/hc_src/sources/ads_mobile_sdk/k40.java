package ads_mobile_sdk;

import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class k40 extends cu0 {
    private static final k40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private sq uri_;
    private sq verb_;
    private sq version_;

    static {
        k40 k40Var = new k40();
        DEFAULT_INSTANCE = k40Var;
        cu0.a(k40.class, k40Var);
    }

    public k40() {
        qq qqVar = sq.b;
        this.verb_ = qqVar;
        this.uri_ = qqVar;
        this.version_ = qqVar;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "verb_", "uri_", "version_"});
        }
        if (e2 == 3) {
            return new k40();
        }
        if (e2 != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
