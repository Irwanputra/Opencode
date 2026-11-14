package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a41 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.a41 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 13;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 12;
    public static final int k = 15;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 14;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5o = 9;
    public static final int p = 10;
    public static final int q = 11;
    private int bitField0_;
    private int bucketSize_;
    private int elementMaxLength_;
    private boolean excludeFalse_;
    private boolean excludeTrue_;
    private int maxLength_;
    private int maxSize_;
    private double multiplyingFactor_;
    private int round_;
    private int type_;
    private dev.epro.r0.O6641393078261985068 path_ = ads_mobile_sdk.in2.e;
    private java.lang.String urlKey_ = "";
    private java.lang.String arraySeparator_ = ",";
    private java.lang.String keyValueSeparator_ = "=";
    private java.lang.String itemSeparator_ = "&";
    private java.lang.String captureGroup_ = "";

    static {
        ads_mobile_sdk.a41 a41Var = new ads_mobile_sdk.a41();
        DEFAULT_INSTANCE = a41Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.a41.class, a41Var);
    }

    public final int A() {
        return this.round_;
    }

    public final int B() {
        int i2 = this.type_;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 0 : 4;
                }
            } else {
                i3 = 2;
            }
        }
        if (i3 == 0) {
            return 5;
        }
        return i3;
    }

    public final java.lang.String C() {
        return this.urlKey_;
    }

    public final boolean D() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဌ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\b\bለ\t\tለ\u000b\nለ\f\u000bለ\r\fဋ\u0006\rဋ\u0002\u000eဋ\n\u000fက\u0007", new java.lang.Object[]{"bitField0_", "path_", "urlKey_", "type_", "excludeTrue_", "excludeFalse_", "round_", "maxSize_", "arraySeparator_", "keyValueSeparator_", "itemSeparator_", "captureGroup_", "bucketSize_", "maxLength_", "elementMaxLength_", "multiplyingFactor_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.a41();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.R2891888705946997889(DEFAULT_INSTANCE);
    }

    public final java.lang.String o() {
        return this.arraySeparator_;
    }

    public final int p() {
        return this.bucketSize_;
    }

    public final java.lang.String q() {
        return this.captureGroup_;
    }

    public final int r() {
        return this.elementMaxLength_;
    }

    public final boolean s() {
        return this.excludeFalse_;
    }

    public final boolean t() {
        return this.excludeTrue_;
    }

    public final java.lang.String u() {
        return this.itemSeparator_;
    }

    public final java.lang.String v() {
        return this.keyValueSeparator_;
    }

    public final int w() {
        return this.maxLength_;
    }

    public final int x() {
        return this.maxSize_;
    }

    public final double y() {
        return this.multiplyingFactor_;
    }

    public final dev.epro.r0.O6641393078261985068 z() {
        return this.path_;
    }
}
