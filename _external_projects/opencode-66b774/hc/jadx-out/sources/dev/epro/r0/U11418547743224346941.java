package dev.epro.r0;

import ads_mobile_sdk.c7;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U11418547743224346941 extends FrameLayout {
    public ImageView.ScaleType a;
    public c7 b;

    public final ImageView.ScaleType getImageScaleType() {
        return this.a;
    }

    public final M11748729075121094137 getMediaContent() {
        return null;
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        c7 c7Var;
        this.a = scaleType;
        if (scaleType != null) {
            synchronized (this) {
                c7Var = this.b;
            }
            if (c7Var != null) {
                c7Var.a(scaleType);
            }
        }
    }

    public final void setMediaContent(M11748729075121094137 m11748729075121094137) {
        InternalNativeAd internalNativeAdA;
        if (m11748729075121094137 == null || (internalNativeAdA = m11748729075121094137.a()) == null || internalNativeAdA.a.b != 2 || internalNativeAdA.l.a(this)) {
            return;
        }
        removeAllViews();
    }
}
