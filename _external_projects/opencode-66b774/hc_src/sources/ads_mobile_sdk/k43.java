package ads_mobile_sdk;

import dev.epro.r0.J8109720887967463919;
import dev.epro.r0.T1335862270807194835;
import java.io.FileInputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class k43 extends cu0 {
    private static final k43 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private boolean isInstallReferrerReported_;
    private int totalInflightAdLimit_;

    static {
        k43 k43Var = new k43();
        DEFAULT_INSTANCE = k43Var;
        cu0.a(k43.class, k43Var);
    }

    public static k43 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"bitField0_", "isInstallReferrerReported_", "totalInflightAdLimit_"});
        }
        if (e == 3) {
            return new k43();
        }
        if (e != 4) {
            return null;
        }
        return new J8109720887967463919(DEFAULT_INSTANCE);
    }

    public final boolean p() {
        return this.isInstallReferrerReported_;
    }

    public final int q() {
        return this.totalInflightAdLimit_;
    }

    public static k43 a(FileInputStream fileInputStream) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(a);
        return (k43) a;
    }
}
