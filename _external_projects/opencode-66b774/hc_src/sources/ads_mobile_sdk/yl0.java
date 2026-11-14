package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.Z13283891527057128406;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yl0 extends cu0 {
    private static final yl0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private sq bytecode_;
    private rm2 metadata_;
    private int status_;
    private sq vm_;

    static {
        yl0 yl0Var = new yl0();
        DEFAULT_INSTANCE = yl0Var;
        cu0.a(yl0.class, yl0Var);
    }

    public yl0() {
        qq qqVar = sq.b;
        this.bytecode_ = qqVar;
        this.vm_ = qqVar;
    }

    public static Z13283891527057128406 s() {
        return (Z13283891527057128406) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "metadata_", "bytecode_", "vm_", "status_", ad.a$13});
        }
        if (e2 == 3) {
            return new yl0();
        }
        if (e2 != 4) {
            return null;
        }
        return new Z13283891527057128406(DEFAULT_INSTANCE);
    }

    public final void b(sq sqVar) {
        Objects.requireNonNull(sqVar);
        this.bitField0_ |= 4;
        this.vm_ = sqVar;
    }

    public final sq o() {
        return this.bytecode_;
    }

    public final rm2 p() {
        rm2 rm2Var = this.metadata_;
        return rm2Var == null ? rm2.q() : rm2Var;
    }

    public final int q$1() {
        int _a = E12098517352909843120._a(this.status_);
        if (_a == 0) {
            return 1;
        }
        return _a;
    }

    public final sq r() {
        return this.vm_;
    }

    public final void a(sq sqVar) {
        Objects.requireNonNull(sqVar);
        this.bitField0_ |= 2;
        this.bytecode_ = sqVar;
    }

    public final void a(rm2 rm2Var) {
        this.metadata_ = rm2Var;
        this.bitField0_ |= 1;
    }
}
