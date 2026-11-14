package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w7 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.w7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private dev.epro.r0.R17185427375111049466 activeExperimentIds_ = ads_mobile_sdk.jb1.e;
    private int bitField0_;
    private ads_mobile_sdk.p92 program_;

    static {
        ads_mobile_sdk.w7 w7Var = new ads_mobile_sdk.w7();
        DEFAULT_INSTANCE = w7Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.w7.class, w7Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new java.lang.Object[]{"bitField0_", "program_", "activeExperimentIds_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.w7();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final dev.epro.r0.R17185427375111049466 o() {
        return this.activeExperimentIds_;
    }

    public final ads_mobile_sdk.p92 p() {
        ads_mobile_sdk.p92 p92Var = this.program_;
        return p92Var == null ? ads_mobile_sdk.p92.o() : p92Var;
    }

    public static ads_mobile_sdk.w7 a(byte[] bArr, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.w7) cu0VarA;
    }
}
