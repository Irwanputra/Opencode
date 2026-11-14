package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ba2 extends dev.epro.r0.S13562717617822485216 {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ ads_mobile_sdk.ca2 b;
    public final /* synthetic */ com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd c;
    public final /* synthetic */ android.widget.ImageView.ScaleType d;

    public ba2(android.content.Context context, ads_mobile_sdk.ca2 ca2Var, com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd, android.widget.ImageView.ScaleType scaleType) {
        this.a = context;
        this.b = ca2Var;
        this.c = internalNativeAd;
        this.d = scaleType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.google.android.libraries.ads.mobile.sdk.common.AdActivity adActivity, android.widget.LinearLayout linearLayout) {
        dev.epro.r0.U7463707071975914439 u7463707071975914439 = new dev.epro.r0.U7463707071975914439(adActivity);
        u7463707071975914439.setTag("ad_view_tag");
        u7463707071975914439.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(u7463707071975914439);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(adActivity);
        linearLayout2.setTag("layout_tag");
        byte b = 1;
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        u7463707071975914439.addView(linearLayout2);
        android.content.res.Resources resources = this.a.getResources();
        if (resources == null) {
            return;
        }
        java.lang.String string = resources.getString(2131821553);
        string.getClass();
        linearLayout2.addView(ads_mobile_sdk.ca2.a(this.b, adActivity, string, "headline_header_tag"));
        java.lang.String str = (java.lang.String) this.c.a.d.get("headline");
        if (str == null) {
            str = "";
        }
        android.widget.TextView textViewB = ads_mobile_sdk.ca2.b(this.b, adActivity, str, "headline_tag");
        u7463707071975914439.setHeadlineView(textViewB);
        linearLayout2.addView(textViewB);
        java.lang.String string2 = resources.getString(2131821552);
        string2.getClass();
        linearLayout2.addView(ads_mobile_sdk.ca2.a(this.b, adActivity, string2, "body_header_tag"));
        java.lang.String str2 = (java.lang.String) this.c.a.d.get("body");
        if (str2 == null) {
            str2 = "";
        }
        android.widget.TextView textViewB2 = ads_mobile_sdk.ca2.b(this.b, adActivity, str2, "body_tag");
        u7463707071975914439.setBodyView(textViewB2);
        linearLayout2.addView(textViewB2);
        java.lang.String string3 = resources.getString(2131821554);
        string3.getClass();
        linearLayout2.addView(ads_mobile_sdk.ca2.a(this.b, adActivity, string3, "media_view_header_tag"));
        android.view.View u11418547743224346941 = new dev.epro.r0.U11418547743224346941(adActivity);
        u11418547743224346941.setTag("media_view_tag");
        u11418547743224346941.setImageScaleType(this.d);
        linearLayout2.addView(u11418547743224346941);
        com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd = this.c;
        new ads_mobile_sdk.bu1(internalNativeAd);
        ads_mobile_sdk.it1 it1Var = internalNativeAd.a;
        java.util.LinkedHashMap linkedHashMap = it1Var.d;
        ads_mobile_sdk.md1 md1Var = it1Var.h;
        if (md1Var != null) {
            java.util.List list = md1Var.b;
            java.util.ArrayList arrayList = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ads_mobile_sdk.wf1) it.next()).getClass();
                arrayList.add(new dev.epro.r0.E17149812035295265804((byte) 14));
            }
        }
        internalNativeAd.e.k();
        u7463707071975914439.getNativeAdViewContainer().a(u11418547743224346941, com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames.ASSET_MEDIA_CONTENT);
        ads_mobile_sdk.c7 c7Var = new ads_mobile_sdk.c7(u7463707071975914439, b);
        synchronized (u11418547743224346941) {
            ((dev.epro.r0.U11418547743224346941) u11418547743224346941).b = c7Var;
        }
        android.widget.ImageView.ScaleType scaleType = ((dev.epro.r0.U11418547743224346941) u11418547743224346941).a;
        if (scaleType != null) {
            c7Var.a(scaleType);
        }
        ads_mobile_sdk.ew1 nativeAdViewContainer = u7463707071975914439.getNativeAdViewContainer();
        nativeAdViewContainer.getClass();
        synchronized (nativeAdViewContainer) {
            try {
                if (nativeAdViewContainer.d.get()) {
                    return;
                }
                com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd2 = nativeAdViewContainer.i;
                if (internalNativeAd2 != null) {
                    nativeAdViewContainer.c(internalNativeAd2);
                }
                dev.epro.r0.W1307410158614224409.Xo.getClass();
                android.os.Handler handler = ads_mobile_sdk.cw1.b;
                handler.post(new dev.epro.r0.C439001677970731857(nativeAdViewContainer, (byte) 0));
                nativeAdViewContainer.b(internalNativeAd);
                java.lang.String str3 = internalNativeAd.a.v;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        handler.post(new dev.epro.r0.Q9622116641457785369(nativeAdViewContainer, str3, (byte) 20));
                    }
                }
                android.content.Context context = nativeAdViewContainer.b.getContext();
                if (context != null) {
                    nativeAdViewContainer.g = internalNativeAd.e.e() != 0 ? new android.view.GestureDetector(context, new ads_mobile_sdk.wx1(internalNativeAd.e, new java.lang.ref.WeakReference(nativeAdViewContainer.b))) : null;
                }
                nativeAdViewContainer.i = internalNativeAd;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void onDestroy() {
        this.c.destroy();
    }
}
