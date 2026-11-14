package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d53 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.d53 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    static {
        ads_mobile_sdk.d53 d53Var = new ads_mobile_sdk.d53();
        DEFAULT_INSTANCE = d53Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.d53.class, d53Var);
    }

    public static ads_mobile_sdk.d53 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000", new java.lang.Object[]{"value_", "valueCase_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.d53();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }

    public final boolean o() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double q() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final long r() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }

    public final java.lang.String s() {
        return this.valueCase_ == 1 ? (java.lang.String) this.value_ : "";
    }

    public final boolean t() {
        return this.valueCase_ == 2;
    }

    public final boolean u() {
        return this.valueCase_ == 4;
    }

    public final boolean v() {
        return this.valueCase_ == 3;
    }

    public final boolean w() {
        return this.valueCase_ == 1;
    }
}
