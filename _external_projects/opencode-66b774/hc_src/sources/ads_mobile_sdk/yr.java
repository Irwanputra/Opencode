package ads_mobile_sdk;

import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U14040477310430335452;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yr extends cu0 {
    private static final yr DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    private R17185427375111049466 triggerVariationId_;
    private R17185427375111049466 variationId_;

    static {
        yr yrVar = new yr();
        DEFAULT_INSTANCE = yrVar;
        cu0.a(yr.class, yrVar);
    }

    public yr() {
        jb1 jb1Var = jb1.e;
        this.variationId_ = jb1Var;
        this.triggerVariationId_ = jb1Var;
    }

    public static U14040477310430335452 o() {
        return (U14040477310430335452) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"variationId_", "triggerVariationId_"});
        }
        if (e == 3) {
            return new yr();
        }
        if (e != 4) {
            return null;
        }
        return new U14040477310430335452(DEFAULT_INSTANCE);
    }

    public static yr a(byte[] bArr) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0.a());
        cu0.a(a);
        return (yr) a;
    }
}
