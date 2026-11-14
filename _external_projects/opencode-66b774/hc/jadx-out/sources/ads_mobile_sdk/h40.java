package ads_mobile_sdk;

import dev.epro.r0.P9981443908238719923;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class h40 extends cu0 {
    private static final h40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private sq name_;
    private sq value_;

    static {
        h40 h40Var = new h40();
        DEFAULT_INSTANCE = h40Var;
        cu0.a(h40.class, h40Var);
    }

    public h40() {
        qq qqVar = sq.b;
        this.name_ = qqVar;
        this.value_ = qqVar;
    }

    public static P9981443908238719923 o() {
        return (P9981443908238719923) DEFAULT_INSTANCE.e();
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
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "name_", "value_"});
        }
        if (iE == 3) {
            return new h40();
        }
        if (iE != 4) {
            return null;
        }
        return new P9981443908238719923(DEFAULT_INSTANCE);
    }

    public final void b(qq qqVar) {
        this.bitField0_ |= 2;
        this.value_ = qqVar;
    }

    public final void a(qq qqVar) {
        this.bitField0_ |= 1;
        this.name_ = qqVar;
    }
}
