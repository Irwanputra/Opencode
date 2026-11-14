package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ib1 implements dev.epro.r0.K4548097313143615345 {
    public static final ads_mobile_sdk.ib1 b = new ads_mobile_sdk.ib1();
    public android.content.Context a;

    public ib1(android.content.Context context, byte b2) {
        switch (b2) {
            case 2:
                context.getClass();
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }

    public ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.DISPLAY_COUNT;
    }

    public java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.a.getSystemService(android.hardware.display.DisplayManager.class);
        return displayManager != null ? new ads_mobile_sdk.xu0(new ads_mobile_sdk.zi0(displayManager.getDisplays().length)) : new ads_mobile_sdk.tu0("Unable to get display service", 1);
    }
}
