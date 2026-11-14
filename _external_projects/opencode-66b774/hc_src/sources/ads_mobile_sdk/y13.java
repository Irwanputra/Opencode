package ads_mobile_sdk;

import dev.epro.r0.I4512433669318320344;
import dev.epro.r0.T1335862270807194835;
import java.io.FileInputStream;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class y13 extends cu0 {
    private static final y13 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String cachedSdkCore_ = "";
    private long lastUpdateTimeMs_;

    static {
        y13 y13Var = new y13();
        DEFAULT_INSTANCE = y13Var;
        cu0.a(y13.class, y13Var);
    }

    public static y13 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "cachedSdkCore_", "lastUpdateTimeMs_"});
        }
        if (e == 3) {
            return new y13();
        }
        if (e != 4) {
            return null;
        }
        return new I4512433669318320344(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.cachedSdkCore_ = str;
    }

    public final String o() {
        return this.cachedSdkCore_;
    }

    public final long q() {
        return this.lastUpdateTimeMs_;
    }

    public static y13 a(FileInputStream fileInputStream) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(a);
        return (y13) a;
    }
}
