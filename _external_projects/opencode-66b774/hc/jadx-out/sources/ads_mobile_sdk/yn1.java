package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.S6059772632253557467;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 extends cu0 {
    private static final yn1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 2;
    private O6641393078261985068 adapters_;
    private gn1 data_ = gn1.b;
    private O6641393078261985068 waterfallAdapters_;

    static {
        yn1 yn1Var = new yn1();
        DEFAULT_INSTANCE = yn1Var;
        cu0.a(yn1.class, yn1Var);
    }

    public yn1() {
        in2 in2Var = in2.e;
        this.adapters_ = in2Var;
        this.waterfallAdapters_ = in2Var;
    }

    public static S6059772632253557467 r() {
        return (S6059772632253557467) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0002\u0000\u0001Ț\u00022\u0003Ț", new Object[]{"adapters_", "data_", new dn1(e2581631045160024594, e2581631045160024594, ""), "waterfallAdapters_"});
        }
        if (iE == 3) {
            return new yn1();
        }
        if (iE != 4) {
            return null;
        }
        return new S6059772632253557467(DEFAULT_INSTANCE);
    }

    public final O6641393078261985068 o() {
        return this.adapters_;
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.data_);
    }
}
