package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class w7 extends cu0 {
    private static final w7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private R17185427375111049466 activeExperimentIds_ = jb1.e;
    private int bitField0_;
    private p92 program_;

    static {
        w7 w7Var = new w7();
        DEFAULT_INSTANCE = w7Var;
        cu0.a(w7.class, w7Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"bitField0_", "program_", "activeExperimentIds_"});
        }
        if (iE == 3) {
            return new w7();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final R17185427375111049466 o() {
        return this.activeExperimentIds_;
    }

    public final p92 p() {
        p92 p92Var = this.program_;
        return p92Var == null ? p92.o() : p92Var;
    }

    public static w7 a(byte[] bArr, nl0 nl0Var) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        cu0.a(cu0VarA);
        return (w7) cu0VarA;
    }
}
