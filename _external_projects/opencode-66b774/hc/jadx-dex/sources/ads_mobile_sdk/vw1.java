package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vw1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.vw1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int bitField0_;
    private boolean disableImageLoading_;
    private boolean isBannerAllowed_;
    private boolean isNativeAllowed_;
    private boolean multipleImages_;
    private java.lang.String nativeMediaOrientation_ = "";
    private int preferredAdChoicesPosition_;
    private ads_mobile_sdk.xw1 sdkCustomClickGesture_;
    private boolean useCustomMute_;
    private ads_mobile_sdk.zw1 videoOptions_;

    static {
        ads_mobile_sdk.vw1 vw1Var = new ads_mobile_sdk.vw1();
        DEFAULT_INSTANCE = vw1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.vw1.class, vw1Var);
    }

    public static dev.epro.r0.J4392715417291352250 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဉ\b", new java.lang.Object[]{"bitField0_", "videoOptions_", "multipleImages_", "useCustomMute_", "preferredAdChoicesPosition_", "disableImageLoading_", "nativeMediaOrientation_", "isBannerAllowed_", "isNativeAllowed_", "sdkCustomClickGesture_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.vw1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.J4392715417291352250(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 32;
        this.nativeMediaOrientation_ = str;
    }

    public final void a(ads_mobile_sdk.zw1 zw1Var) {
        this.videoOptions_ = zw1Var;
        this.bitField0_ |= 1;
    }
}
