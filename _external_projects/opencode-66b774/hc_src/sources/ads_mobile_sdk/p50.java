package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class p50 extends cu0 {
    private static final p50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private O6641393078261985068 importScriptUrls_;
    private O6641393078261985068 requestedUrls_;
    private String scopeUrl_ = "";
    private String scriptUrl_;

    static {
        p50 p50Var = new p50();
        DEFAULT_INSTANCE = p50Var;
        cu0.a(p50.class, p50Var);
    }

    public p50() {
        in2 in2Var = in2.e;
        this.requestedUrls_ = in2Var;
        this.importScriptUrls_ = in2Var;
        this.scriptUrl_ = "";
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"bitField0_", "scopeUrl_", "requestedUrls_", "importScriptUrls_", "scriptUrl_"});
        }
        if (e2 == 3) {
            return new p50();
        }
        if (e2 != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
