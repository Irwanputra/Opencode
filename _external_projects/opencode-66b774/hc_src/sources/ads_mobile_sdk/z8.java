package ads_mobile_sdk;

import dev.epro.r0.O14932123057360168587;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class z8 extends cu0 {
    private static final z8 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private String effectiveAdUnitId_;
    private O6641393078261985068 excludingRegexes_;
    private O6641393078261985068 includingRegexes_;

    static {
        z8 z8Var = new z8();
        DEFAULT_INSTANCE = z8Var;
        cu0.a(z8.class, z8Var);
    }

    public z8() {
        in2 in2Var = in2.e;
        this.includingRegexes_ = in2Var;
        this.excludingRegexes_ = in2Var;
        this.effectiveAdUnitId_ = "";
    }

    public static O14932123057360168587 r() {
        return (O14932123057360168587) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ለ\u0000", new Object[]{"bitField0_", "includingRegexes_", "excludingRegexes_", "effectiveAdUnitId_"});
        }
        if (e2 == 3) {
            return new z8();
        }
        if (e2 != 4) {
            return null;
        }
        return new O14932123057360168587(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 1;
        this.effectiveAdUnitId_ = str;
    }

    public final String o() {
        return this.effectiveAdUnitId_;
    }

    public final O6641393078261985068 p$1() {
        return this.excludingRegexes_;
    }

    public final List q() {
        return this.includingRegexes_;
    }
}
