package ads_mobile_sdk;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;
import dev.epro.r0.C439001677970731857;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.Q9622116641457785369;
import dev.epro.r0.S13562717617822485216;
import dev.epro.r0.U11418547743224346941;
import dev.epro.r0.U7463707071975914439;
import dev.epro.r0.W1307410158614224409;
import dev.epro.r0.Z115818233709597990;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ba2 extends S13562717617822485216 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ca2 b;
    public final /* synthetic */ InternalNativeAd c;
    public final /* synthetic */ ImageView.ScaleType d;

    public ba2(Context context, ca2 ca2Var, InternalNativeAd internalNativeAd, ImageView.ScaleType scaleType) {
        this.a = context;
        this.b = ca2Var;
        this.c = internalNativeAd;
        this.d = scaleType;
    }

    @Override // dev.epro.r0.S13562717617822485216
    public final void a(AdActivity adActivity, LinearLayout linearLayout) {
        U7463707071975914439 u7463707071975914439 = new U7463707071975914439(adActivity);
        u7463707071975914439.setTag("ad_view_tag");
        u7463707071975914439.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(u7463707071975914439);
        LinearLayout linearLayout2 = new LinearLayout(adActivity);
        linearLayout2.setTag("layout_tag");
        byte b = 1;
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        u7463707071975914439.addView(linearLayout2);
        Resources resources = this.a.getResources();
        if (resources == null) {
            return;
        }
        String string = resources.getString(R.string.native_headline);
        string.getClass();
        linearLayout2.addView(ca2.a(this.b, adActivity, string, "headline_header_tag"));
        String str = (String) this.c.a.d.get("headline");
        if (str == null) {
            str = "";
        }
        View b2 = ca2.b(this.b, adActivity, str, "headline_tag");
        u7463707071975914439.setHeadlineView(b2);
        linearLayout2.addView(b2);
        String string2 = resources.getString(R.string.native_body);
        string2.getClass();
        linearLayout2.addView(ca2.a(this.b, adActivity, string2, "body_header_tag"));
        String str2 = (String) this.c.a.d.get("body");
        if (str2 == null) {
            str2 = "";
        }
        View b3 = ca2.b(this.b, adActivity, str2, "body_tag");
        u7463707071975914439.setBodyView(b3);
        linearLayout2.addView(b3);
        String string3 = resources.getString(R.string.native_media_view);
        string3.getClass();
        linearLayout2.addView(ca2.a(this.b, adActivity, string3, "media_view_header_tag"));
        U11418547743224346941 u11418547743224346941 = new U11418547743224346941(adActivity);
        u11418547743224346941.setTag("media_view_tag");
        u11418547743224346941.setImageScaleType(this.d);
        linearLayout2.addView(u11418547743224346941);
        InternalNativeAd internalNativeAd = this.c;
        new bu1(internalNativeAd);
        it1 it1Var = internalNativeAd.a;
        LinkedHashMap linkedHashMap = it1Var.d;
        md1 md1Var = it1Var.h;
        if (md1Var != null) {
            List list = md1Var.b;
            ArrayList arrayList = new ArrayList(Z115818233709597990.k0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((wf1) it.next()).getClass();
                arrayList.add(new E17149812035295265804((byte) 14));
            }
        }
        internalNativeAd.e.k();
        u7463707071975914439.getNativeAdViewContainer().a(u11418547743224346941, NativeAdAssetNames.ASSET_MEDIA_CONTENT);
        c7 c7Var = new c7(u7463707071975914439, b);
        synchronized (u11418547743224346941) {
            u11418547743224346941.b = c7Var;
        }
        ImageView.ScaleType scaleType = u11418547743224346941.a;
        if (scaleType != null) {
            c7Var.a(scaleType);
        }
        ew1 nativeAdViewContainer = u7463707071975914439.getNativeAdViewContainer();
        nativeAdViewContainer.getClass();
        synchronized (nativeAdViewContainer) {
            try {
                if (nativeAdViewContainer.d.get()) {
                    return;
                }
                InternalNativeAd internalNativeAd2 = nativeAdViewContainer.i;
                if (internalNativeAd2 != null) {
                    nativeAdViewContainer.c(internalNativeAd2);
                }
                W1307410158614224409.Xo.getClass();
                Handler handler = cw1.b;
                handler.post(new C439001677970731857(nativeAdViewContainer, (byte) 0));
                nativeAdViewContainer.b(internalNativeAd);
                String str3 = internalNativeAd.a.v;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        handler.post(new Q9622116641457785369(nativeAdViewContainer, str3, (byte) 20));
                    }
                }
                Context context = nativeAdViewContainer.b.getContext();
                if (context != null) {
                    nativeAdViewContainer.g = internalNativeAd.e.e() != 0 ? new GestureDetector(context, new wx1(internalNativeAd.e, new WeakReference(nativeAdViewContainer.b))) : null;
                }
                nativeAdViewContainer.i = internalNativeAd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void onDestroy() {
        this.c.destroy();
    }
}
