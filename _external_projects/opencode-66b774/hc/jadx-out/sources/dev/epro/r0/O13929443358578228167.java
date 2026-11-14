package dev.epro.r0;

import ads_mobile_sdk.ao;
import ads_mobile_sdk.ew1;
import ads_mobile_sdk.jp0;
import ads_mobile_sdk.jr0;
import ads_mobile_sdk.wf0;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O13929443358578228167 extends FrameLayout {
    public final ew1 a;
    public final FrameLayout b;

    public O13929443358578228167(AdActivity adActivity) {
        super(adActivity);
        FrameLayout frameLayout = new FrameLayout(adActivity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.b = frameLayout;
        this.a = new ew1(this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.b;
        if (S10823041268949770285.t(frameLayout, view)) {
            return;
        }
        super.bringChildToFront(frameLayout);
    }

    public final N9207821741758307716 getAdChoicesView() {
        View viewB = this.a.b(NativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (viewB instanceof N9207821741758307716) {
            return (N9207821741758307716) viewB;
        }
        return null;
    }

    public final View getCallToActionView() {
        return this.a.b(NativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return this.a.b(NativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getIconView() {
        return this.a.b(NativeAdAssetNames.ASSET_ICON);
    }

    public final ew1 getNativeAdViewContainer() {
        return this.a;
    }

    public final View getStarRatingView() {
        return this.a.b(NativeAdAssetNames.ASSET_STAR_RATING);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jp0 jp0Var;
        wf0 wf0Var;
        motionEvent.getClass();
        ew1 ew1Var = this.a;
        ew1Var.getClass();
        synchronized (ew1Var) {
            try {
                if (ew1Var.d.get()) {
                    return false;
                }
                InternalNativeAd internalNativeAd = ew1Var.i;
                if (internalNativeAd != null && (jp0Var = internalNativeAd.e) != null) {
                    jr0 jr0Var = internalNativeAd.r;
                    jr0Var.getClass();
                    Boolean bool = Boolean.FALSE;
                    ao aoVar = ao.a$11;
                    if (((Boolean) jr0Var.a("gads:report_touch_event_on_intercept_touch:enabled", bool, aoVar)).booleanValue()) {
                        jp0Var.a(ew1Var.b, motionEvent);
                    }
                    InternalNativeAd internalNativeAd2 = ew1Var.i;
                    if (internalNativeAd2 != null) {
                        jr0 jr0Var2 = internalNativeAd2.r;
                        jr0Var2.getClass();
                        if (((Boolean) jr0Var2.a("gads:native_ad_view:on_intercept_touch_event:enabled", Boolean.TRUE, aoVar)).booleanValue()) {
                            InternalNativeAd internalNativeAd3 = ew1Var.i;
                            if (internalNativeAd3 != null && (wf0Var = internalNativeAd3.s) != null) {
                                wf0Var.a(motionEvent);
                            }
                            if (jp0Var.e() != 0) {
                                jp0Var.f = new WeakReference(this);
                                GestureDetector gestureDetector = ew1Var.g;
                                if (gestureDetector != null) {
                                    gestureDetector.onTouchEvent(motionEvent);
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (S10823041268949770285.t(this.b, view)) {
            return;
        }
        super.removeView(view);
    }

    public final void setAdChoicesView(N9207821741758307716 n9207821741758307716) {
        this.a.a(n9207821741758307716, NativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
    }

    public final void setCallToActionView(View view) {
        this.a.a(view, NativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final void setHeadlineView(View view) {
        this.a.a(view, NativeAdAssetNames.ASSET_HEADLINE);
    }

    public final void setIconView(View view) {
        this.a.a(view, NativeAdAssetNames.ASSET_ICON);
    }

    public final void setStarRatingView(View view) {
        this.a.a(view, NativeAdAssetNames.ASSET_STAR_RATING);
    }
}
