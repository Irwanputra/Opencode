package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class r12 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.jp0 a;
    public final ads_mobile_sdk.it1 b;

    public r12(ads_mobile_sdk.jp0 jp0Var, ads_mobile_sdk.it1 it1Var) {
        jp0Var.getClass();
        it1Var.getClass();
        this.a = jp0Var;
        this.b = it1Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.ew1 ew1Var;
        android.view.View viewB;
        int i = this.b.b;
        int i2 = i == 0 ? -1 : dev.epro.r0.S9083891764085457300.a[dev.epro.r0.L11610354117192841236.A(i)];
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (i2 != -1) {
            ads_mobile_sdk.jp0 jp0Var = this.a;
            if (i2 == 1) {
                dev.epro.r0.W1307410158614224409 w1307410158614224409 = (dev.epro.r0.W1307410158614224409) jp0Var.c.get();
                if (w1307410158614224409 != null && (viewB = (ew1Var = (ads_mobile_sdk.ew1) w1307410158614224409).b(com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames.ASSET_MEDIA_CONTENT)) != null) {
                    ew1Var.onClick(viewB);
                }
            } else if (i2 == 2) {
                jp0Var.getClass();
                ads_mobile_sdk.jp0.a(jp0Var, null, null, "_videoMediaView", null, 48);
                return o9245300239821758723;
            }
        }
        return o9245300239821758723;
    }

    public final int b() {
        return 39;
    }
}
