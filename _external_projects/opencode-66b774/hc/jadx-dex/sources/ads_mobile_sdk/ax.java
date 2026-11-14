package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ax extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ax DEFAULT_INSTANCE;
    private static final dev.epro.r0.B4259731004323267459 allowedApis_converter_ = new dev.epro.r0.Y2677586711477821327((byte) 15);
    public static final int c = 1;
    private int allowedApisMemoizedSerializedSize;
    private dev.epro.r0.R17185427375111049466 allowedApis_ = ads_mobile_sdk.jb1.e;

    static {
        ads_mobile_sdk.ax axVar = new ads_mobile_sdk.ax();
        DEFAULT_INSTANCE = axVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ax.class, axVar);
    }

    public static ads_mobile_sdk.ax r() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.N5829968851568792302 s() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new java.lang.Object[]{"allowedApis_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ax();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.N5829968851568792302(DEFAULT_INSTANCE);
    }

    public final int o() {
        return ((ads_mobile_sdk.jb1) this.allowedApis_).c;
    }

    public final ads_mobile_sdk.ob1 p() {
        return new ads_mobile_sdk.ob1(this.allowedApis_, allowedApis_converter_);
    }

    public final dev.epro.r0.R17185427375111049466 q() {
        return this.allowedApis_;
    }

    public final void a(ads_mobile_sdk.yw ywVar) {
        ads_mobile_sdk.j jVarA = this.allowedApis_;
        if (!jVarA.a) {
            ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) jVarA;
            jVarA = jb1Var.a(jb1Var.c * 2);
            this.allowedApis_ = jVarA;
        }
        ((ads_mobile_sdk.jb1) jVarA).b(ywVar.getNumber());
    }

    public static ads_mobile_sdk.ax a(byte[] bArr) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.ax) cu0VarA;
    }
}
