package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vr0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.vr0 DEFAULT_INSTANCE;
    public static final int c = 1;
    private ads_mobile_sdk.gn1 adResponseLists_ = ads_mobile_sdk.gn1.b;

    static {
        ads_mobile_sdk.vr0 vr0Var = new ads_mobile_sdk.vr0();
        DEFAULT_INSTANCE = vr0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.vr0.class, vr0Var);
    }

    public static ads_mobile_sdk.vr0 p() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.C7584963549263810245 r() {
        return (dev.epro.r0.C7584963549263810245) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"adResponseLists_", new ads_mobile_sdk.dn1(ads_mobile_sdk.ft3.d, ads_mobile_sdk.ft3.f, ads_mobile_sdk.g6.o())});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.vr0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.C7584963549263810245(DEFAULT_INSTANCE);
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.adResponseLists_);
    }

    public final ads_mobile_sdk.gn1 q() {
        ads_mobile_sdk.gn1 gn1Var = this.adResponseLists_;
        if (gn1Var.a) {
            return gn1Var;
        }
        ads_mobile_sdk.gn1 gn1VarB = gn1Var.b();
        this.adResponseLists_ = gn1VarB;
        return gn1VarB;
    }
}
