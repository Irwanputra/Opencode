package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mn1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.mn1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 4;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int bitField0_;
    private java.lang.Object comparisonOperator_;
    private boolean equalsTo_;
    private java.lang.Object matchValue_;
    private int matchValueCase_ = 0;
    private int comparisonOperatorCase_ = 0;
    private dev.epro.r0.O6641393078261985068 path_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.mn1 mn1Var = new ads_mobile_sdk.mn1();
        DEFAULT_INSTANCE = mn1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.mn1.class, mn1Var);
    }

    public static ads_mobile_sdk.mn1 q() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.matchValueCase_ == 5;
    }

    public final boolean B() {
        return this.matchValueCase_ == 2;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\t\u0002\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ț\u0002Ȼ\u0000\u0003:\u0000\u0004<\u0000\u00053\u0000\u0006:\u0001\u0007:\u0001\b:\u0001\tဇ\u0000", new java.lang.Object[]{"matchValue_", "matchValueCase_", "comparisonOperator_", "comparisonOperatorCase_", "bitField0_", "path_", ads_mobile_sdk.mn1.class, "equalsTo_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.mn1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }

    public final ads_mobile_sdk.mn1 o() {
        return this.matchValueCase_ == 4 ? (ads_mobile_sdk.mn1) this.matchValue_ : DEFAULT_INSTANCE;
    }

    public final boolean p() {
        if (this.matchValueCase_ == 3) {
            return ((java.lang.Boolean) this.matchValue_).booleanValue();
        }
        return false;
    }

    public final boolean r() {
        return this.equalsTo_;
    }

    public final double s() {
        if (this.matchValueCase_ == 5) {
            return ((java.lang.Double) this.matchValue_).doubleValue();
        }
        return 0.0d;
    }

    public final dev.epro.r0.O6641393078261985068 t() {
        return this.path_;
    }

    public final java.lang.String u() {
        return this.matchValueCase_ == 2 ? (java.lang.String) this.matchValue_ : "";
    }

    public final boolean v() {
        return this.matchValueCase_ == 4;
    }

    public final boolean w() {
        return this.comparisonOperatorCase_ == 8;
    }

    public final boolean x() {
        return this.matchValueCase_ == 3;
    }

    public final boolean y() {
        return this.comparisonOperatorCase_ == 6;
    }

    public final boolean z() {
        return this.comparisonOperatorCase_ == 7;
    }
}
