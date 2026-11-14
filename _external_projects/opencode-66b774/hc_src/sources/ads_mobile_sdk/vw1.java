package ads_mobile_sdk;

import dev.epro.r0.J4392715417291352250;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vw1 extends cu0 {
    private static final vw1 DEFAULT_INSTANCE;
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
    private String nativeMediaOrientation_ = "";
    private int preferredAdChoicesPosition_;
    private xw1 sdkCustomClickGesture_;
    private boolean useCustomMute_;
    private zw1 videoOptions_;

    static {
        vw1 vw1Var = new vw1();
        DEFAULT_INSTANCE = vw1Var;
        cu0.a(vw1.class, vw1Var);
    }

    public static J4392715417291352250 o() {
        return (J4392715417291352250) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i2);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဉ\b", new Object[]{"bitField0_", "videoOptions_", "multipleImages_", "useCustomMute_", "preferredAdChoicesPosition_", "disableImageLoading_", "nativeMediaOrientation_", "isBannerAllowed_", "isNativeAllowed_", "sdkCustomClickGesture_"});
        }
        if (e2 == 3) {
            return new vw1();
        }
        if (e2 != 4) {
            return null;
        }
        return new J4392715417291352250(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 32;
        this.nativeMediaOrientation_ = str;
    }

    public final void a(zw1 zw1Var) {
        this.videoOptions_ = zw1Var;
        this.bitField0_ |= 1;
    }
}
