package ads_mobile_sdk;

import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.X7577837190169583211;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 extends cu0 {
    private static final rm2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int architecture_;
    private int bitField0_;
    private Object metadata_;
    private int metadataCase_ = 0;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private R17185427375111049466 activeExperimentIds_ = jb1.e;

    static {
        rm2 rm2Var = new rm2();
        DEFAULT_INSTANCE = rm2Var;
        cu0.a(rm2.class, rm2Var);
    }

    public static rm2 q() {
        return DEFAULT_INSTANCE;
    }

    public static X7577837190169583211 t() {
        return (X7577837190169583211) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"metadata_", "metadataCase_", "bitField0_", sm2.class, r92.class, "architecture_", ad.a$10, "activeExperimentIds_"});
        }
        if (iE == 3) {
            return new rm2();
        }
        if (iE != 4) {
            return null;
        }
        return new X7577837190169583211(DEFAULT_INSTANCE);
    }

    public final R17185427375111049466 o() {
        return this.activeExperimentIds_;
    }

    public final fk p() {
        fk fkVarA = fk.a(this.architecture_);
        return fkVarA == null ? fk.UNSUPPORTED : fkVarA;
    }

    public final sm2 r() {
        return this.metadataCase_ == 1 ? (sm2) this.metadata_ : sm2.p();
    }

    public final r92 s() {
        return this.metadataCase_ == 2 ? (r92) this.metadata_ : r92.o();
    }

    public static rm2 a(qq qqVar) throws yi1 {
        rm2 rm2Var = DEFAULT_INSTANCE;
        nl0 nl0VarA = nl0.a();
        byte[] bArr = qqVar.d;
        int length = bArr.length;
        ru ruVar = new ru(bArr, length);
        try {
            ruVar.d(length);
            cu0 cu0VarA = cu0.a(rm2Var, ruVar, nl0VarA);
            ruVar.a(0);
            cu0.a(cu0VarA);
            cu0.a(cu0VarA);
            return (rm2) cu0VarA;
        } catch (yi1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void a(sm2 sm2Var) {
        Objects.requireNonNull(sm2Var);
        this.metadata_ = sm2Var;
        this.metadataCase_ = 1;
    }

    public final void a(r92 r92Var) {
        Objects.requireNonNull(r92Var);
        this.metadata_ = r92Var;
        this.metadataCase_ = 2;
    }

    public static rm2 a(byte[] bArr, nl0 nl0Var) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        cu0.a(cu0VarA);
        return (rm2) cu0VarA;
    }
}
