package ads_mobile_sdk;

import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class d50 extends cu0 {
    private static final d50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private sq imageDigest_;
    private sq image_;
    private String mimeType_ = "";
    private int type_;

    static {
        d50 d50Var = new d50();
        DEFAULT_INSTANCE = d50Var;
        cu0.a(d50.class, d50Var);
    }

    public d50() {
        qq qqVar = sq.b;
        this.image_ = qqVar;
        this.imageDigest_ = qqVar;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "type_", ad.a$3, "mimeType_", "image_", "imageDigest_"});
        }
        if (iE == 3) {
            return new d50();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
