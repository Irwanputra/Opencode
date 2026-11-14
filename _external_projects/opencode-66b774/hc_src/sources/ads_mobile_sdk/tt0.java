package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class tt0 extends cu0 {
    private static final tt0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private sq bytecode_;
    private sm2 metadata_;
    private sq vm_;

    static {
        tt0 tt0Var = new tt0();
        DEFAULT_INSTANCE = tt0Var;
        cu0.a(tt0.class, tt0Var);
    }

    public tt0() {
        qq qqVar = sq.b;
        this.vm_ = qqVar;
        this.bytecode_ = qqVar;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "metadata_", "vm_", "bytecode_"});
        }
        if (e2 == 3) {
            return new tt0();
        }
        if (e2 != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final sq o() {
        return this.bytecode_;
    }

    public final sm2 p() {
        sm2 sm2Var = this.metadata_;
        return sm2Var == null ? sm2.p() : sm2Var;
    }

    public final sq q() {
        return this.vm_;
    }

    public static tt0 a(byte[] bArr, nl0 nl0Var) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        cu0.a(a);
        return (tt0) a;
    }
}
