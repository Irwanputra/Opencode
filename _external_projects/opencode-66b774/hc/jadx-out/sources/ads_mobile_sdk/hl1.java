package ads_mobile_sdk;

import dev.epro.r0.G12293736735718106169;
import dev.epro.r0.T1335862270807194835;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hl1 extends cu0 {
    private static final hl1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private sq hmacKey_;
    private int hmacSignatureLength_;
    private byte memoizedIsInitialized = 2;
    private sq symmetricKey_;
    private int type_;

    static {
        hl1 hl1Var = new hl1();
        DEFAULT_INSTANCE = hl1Var;
        cu0.a(hl1.class, hl1Var);
    }

    public hl1() {
        qq qqVar = sq.b;
        this.symmetricKey_ = qqVar;
        this.hmacKey_ = qqVar;
    }

    public static G12293736735718106169 o() {
        return (G12293736735718106169) DEFAULT_INSTANCE.e();
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
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔊ\u0002\u0004င\u0003", new Object[]{"bitField0_", "type_", ad.a$11, "symmetricKey_", "hmacKey_", "hmacSignatureLength_"});
        }
        if (iE == 3) {
            return new hl1();
        }
        if (iE != 4) {
            return null;
        }
        return new G12293736735718106169(DEFAULT_INSTANCE);
    }

    public final void b(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.bitField0_ |= 2;
        this.symmetricKey_ = qqVar;
    }

    public final void a(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.bitField0_ |= 4;
        this.hmacKey_ = qqVar;
    }
}
