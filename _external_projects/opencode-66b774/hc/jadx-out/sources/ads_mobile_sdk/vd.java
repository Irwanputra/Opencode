package ads_mobile_sdk;

import dev.epro.r0.D5956791176084851114;
import dev.epro.r0.T1335862270807194835;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vd extends cu0 {
    private static final vd DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private sq data_;
    private sq hash_;
    private sq osVersion_;
    private sq timestamp_;

    static {
        vd vdVar = new vd();
        DEFAULT_INSTANCE = vdVar;
        cu0.a(vd.class, vdVar);
    }

    public vd() {
        qq qqVar = sq.b;
        this.data_ = qqVar;
        this.hash_ = qqVar;
        this.timestamp_ = qqVar;
        this.osVersion_ = qqVar;
    }

    public static D5956791176084851114 s() {
        return (D5956791176084851114) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "data_", "hash_", "timestamp_", "osVersion_"});
        }
        if (iE == 3) {
            return new vd();
        }
        if (iE != 4) {
            return null;
        }
        return new D5956791176084851114(DEFAULT_INSTANCE);
    }

    public final void b(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.bitField0_ |= 4;
        this.timestamp_ = qqVar;
    }

    public final sq o() {
        return this.data_;
    }

    public final sq p() {
        return this.hash_;
    }

    public final sq q() {
        return this.osVersion_;
    }

    public final sq r() {
        return this.timestamp_;
    }

    public final void a(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.bitField0_ |= 8;
        this.osVersion_ = qqVar;
    }

    public static vd a(byte[] bArr, nl0 nl0Var) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        cu0.a(cu0VarA);
        return (vd) cu0VarA;
    }
}
