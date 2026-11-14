package ads_mobile_sdk;

import dev.epro.r0.L16390669445741171034;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class le extends cu0 {
    private static final le DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private O6641393078261985068 encryptedBlobs_ = in2.e;
    private sq hash_ = sq.b;
    private int protoName_ = 1;
    private int encryptionMethod_ = 1;

    static {
        le leVar = new le();
        DEFAULT_INSTANCE = leVar;
        cu0.a(le.class, leVar);
    }

    public static L16390669445741171034 o() {
        return (L16390669445741171034) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"bitField0_", "encryptedBlobs_", "hash_", "protoName_", ad.a$9, "encryptionMethod_", tt.a$10});
        }
        if (iE == 3) {
            return new le();
        }
        if (iE != 4) {
            return null;
        }
        return new L16390669445741171034(DEFAULT_INSTANCE);
    }

    public final void b(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.bitField0_ |= 1;
        this.hash_ = qqVar;
    }

    public final void a(qq qqVar) {
        Objects.requireNonNull(qqVar);
        O6641393078261985068 o6641393078261985068B = this.encryptedBlobs_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.encryptedBlobs_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(qqVar);
    }
}
