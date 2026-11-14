package ads_mobile_sdk;

import dev.epro.r0.K18029266284685972839;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dq extends cu0 {
    private static final dq DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private O6641393078261985068 thirdPartyJavascript_;
    private O6641393078261985068 thirdPartySdk_;

    static {
        dq dqVar = new dq();
        DEFAULT_INSTANCE = dqVar;
        cu0.a(dq.class, dqVar);
    }

    public dq() {
        in2 in2Var = in2.e;
        this.thirdPartySdk_ = in2Var;
        this.thirdPartyJavascript_ = in2Var;
    }

    public static K18029266284685972839 p() {
        return (K18029266284685972839) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"thirdPartySdk_", cq.class, "thirdPartyJavascript_", tp.class});
        }
        if (iE == 3) {
            return new dq();
        }
        if (iE != 4) {
            return null;
        }
        return new K18029266284685972839(DEFAULT_INSTANCE);
    }

    public final O6641393078261985068 o() {
        return this.thirdPartySdk_;
    }

    public final void a(cq cqVar) {
        O6641393078261985068 o6641393078261985068B = this.thirdPartySdk_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.thirdPartySdk_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(cqVar);
    }
}
