package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T16764273809881983379;
import dev.epro.r0.T8598786036980488824;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class l40 extends cu0 {
    private static final l40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private sq body_;
    private sq bodydigest_;
    private int bodylength_;
    private k40 firstline_;
    private byte memoizedIsInitialized = 2;
    private O6641393078261985068 headers_ = in2.e;

    static {
        l40 l40Var = new l40();
        DEFAULT_INSTANCE = l40Var;
        cu0.a(l40.class, l40Var);
    }

    public l40() {
        qq qqVar = sq.b;
        this.body_ = qqVar;
        this.bodydigest_ = qqVar;
    }

    public static T16764273809881983379 o() {
        return (T16764273809881983379) DEFAULT_INSTANCE.e();
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
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"bitField0_", "firstline_", "headers_", h40.class, "body_", "bodydigest_", "bodylength_"});
        }
        if (iE == 3) {
            return new l40();
        }
        if (iE != 4) {
            return null;
        }
        return new T16764273809881983379(DEFAULT_INSTANCE);
    }

    public final void a(h40 h40Var) {
        O6641393078261985068 o6641393078261985068B = this.headers_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.headers_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(h40Var);
    }
}
