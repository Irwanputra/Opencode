package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.R2891888705946997889;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a41 extends cu0 {
    private static final a41 DEFAULT_INSTANCE;
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

    /* renamed from: o, reason: collision with root package name */
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
    private O6641393078261985068 path_ = in2.e;
    private String urlKey_ = "";
    private String arraySeparator_ = ",";
    private String keyValueSeparator_ = "=";
    private String itemSeparator_ = "&";
    private String captureGroup_ = "";

    static {
        a41 a41Var = new a41();
        DEFAULT_INSTANCE = a41Var;
        cu0.a(a41.class, a41Var);
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

    public final String C() {
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
    public final Object a(int i2, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i2);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဌ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\b\bለ\t\tለ\u000b\nለ\f\u000bለ\r\fဋ\u0006\rဋ\u0002\u000eဋ\n\u000fက\u0007", new Object[]{"bitField0_", "path_", "urlKey_", "type_", "excludeTrue_", "excludeFalse_", "round_", "maxSize_", "arraySeparator_", "keyValueSeparator_", "itemSeparator_", "captureGroup_", "bucketSize_", "maxLength_", "elementMaxLength_", "multiplyingFactor_"});
        }
        if (e2 == 3) {
            return new a41();
        }
        if (e2 != 4) {
            return null;
        }
        return new R2891888705946997889(DEFAULT_INSTANCE);
    }

    public final String o() {
        return this.arraySeparator_;
    }

    public final int p() {
        return this.bucketSize_;
    }

    public final String q() {
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

    public final String u() {
        return this.itemSeparator_;
    }

    public final String v() {
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

    public final O6641393078261985068 z() {
        return this.path_;
    }
}
