package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p40 extends cu0 {
    private static final p40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private sq body_;
    private sq bodydigest_;
    private int bodylength_;
    private o40 firstline_;
    private sq remoteIp_;
    private byte memoizedIsInitialized = 2;
    private O6641393078261985068 headers_ = in2.e;

    static {
        p40 p40Var = new p40();
        DEFAULT_INSTANCE = p40Var;
        cu0.a(p40.class, p40Var);
    }

    public p40() {
        qq qqVar = sq.b;
        this.body_ = qqVar;
        this.bodydigest_ = qqVar;
        this.remoteIp_ = qqVar;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 0) {
            return Byte.valueOf(this.memoizedIsInitialized);
        }
        if (iE == 1) {
            this.memoizedIsInitialized = (byte) (cu0Var == null ? 0 : 1);
            return null;
        }
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"bitField0_", "firstline_", "headers_", h40.class, "body_", "bodydigest_", "bodylength_", "remoteIp_"});
        }
        if (iE == 3) {
            return new p40();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
