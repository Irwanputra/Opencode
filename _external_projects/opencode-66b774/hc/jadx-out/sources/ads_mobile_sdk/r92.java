package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class r92 extends cu0 {
    private static final r92 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long expirationTimestampMs_;
    private long generationTimestampMs_;
    private sq signature_ = sq.b;
    private xn3 vmId_;

    static {
        r92 r92Var = new r92();
        DEFAULT_INSTANCE = r92Var;
        cu0.a(r92.class, r92Var);
    }

    public static r92 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "vmId_", "signature_", "generationTimestampMs_", "expirationTimestampMs_"});
        }
        if (iE == 3) {
            return new r92();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final long p() {
        return this.expirationTimestampMs_;
    }

    public final sq q() {
        return this.signature_;
    }

    public final xn3 r() {
        xn3 xn3Var = this.vmId_;
        return xn3Var == null ? xn3.o() : xn3Var;
    }
}
