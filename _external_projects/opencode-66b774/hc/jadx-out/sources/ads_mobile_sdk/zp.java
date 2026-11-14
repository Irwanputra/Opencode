package ads_mobile_sdk;

import dev.epro.r0.L16262725475410787495;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zp extends cu0 {
    private static final zp DEFAULT_INSTANCE;
    public static final int c = 4;
    public static final int d = 5;
    private int bitField0_;
    private String errorDescription_ = "";
    private int errorType_;

    static {
        zp zpVar = new zp();
        DEFAULT_INSTANCE = zpVar;
        cu0.a(zp.class, zpVar);
    }

    public static L16262725475410787495 o() {
        return (L16262725475410787495) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004᠌\u0000\u0005ဈ\u0001", new Object[]{"bitField0_", "errorType_", ad.a$28, "errorDescription_"});
        }
        if (iE == 3) {
            return new zp();
        }
        if (iE != 4) {
            return null;
        }
        return new L16262725475410787495(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 2;
        this.errorDescription_ = str;
    }
}
