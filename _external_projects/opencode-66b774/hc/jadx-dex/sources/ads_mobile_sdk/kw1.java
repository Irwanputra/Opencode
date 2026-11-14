package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kw1 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.jp0 a;

    public kw1(ads_mobile_sdk.jp0 jp0Var) {
        jp0Var.getClass();
        this.a = jp0Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363;
        ads_mobile_sdk.jp0 jp0Var;
        dev.epro.r0.W1307410158614224409 w1307410158614224409 = (dev.epro.r0.W1307410158614224409) this.a.c.get();
        if (w1307410158614224409 != null) {
            ads_mobile_sdk.ew1 ew1Var = (ads_mobile_sdk.ew1) w1307410158614224409;
            synchronized (ew1Var) {
                if (ew1Var.d.get()) {
                    i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
                } else {
                    com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd = ew1Var.i;
                    if (internalNativeAd == null || (jp0Var = internalNativeAd.e) == null) {
                        i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
                    } else {
                        dev.epro.r0.O13929443358578228167 o13929443358578228167 = ew1Var.b;
                        java.util.LinkedHashMap linkedHashMap = ew1Var.h;
                        android.widget.ImageView.ScaleType scaleType = ew1Var.f;
                        if (scaleType == null) {
                            scaleType = ads_mobile_sdk.iw1.i;
                        }
                        i16631908410500040363 = jp0Var.a(o13929443358578228167, scaleType, linkedHashMap);
                    }
                }
            }
        } else {
            i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        }
        java.lang.Object objA = tx0Var.a(i16631908410500040363, "nativeAdViewSignalsReady", r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 37;
    }
}
