package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class il0 extends cu0 {
    private static final il0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 4;
    public static final int e = 2;
    public static final int f = 3;
    private int bitField0_;
    private boolean usersMatch_;
    private sq clearBlob_ = sq.b;
    private String clearBlobJs_ = "";
    private O6641393078261985068 encryptedBlob_ = in2.e;

    static {
        il0 il0Var = new il0();
        DEFAULT_INSTANCE = il0Var;
        cu0.a(il0.class, il0Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"bitField0_", "clearBlob_", "encryptedBlob_", "usersMatch_", "clearBlobJs_"});
        }
        if (iE == 3) {
            return new il0();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
