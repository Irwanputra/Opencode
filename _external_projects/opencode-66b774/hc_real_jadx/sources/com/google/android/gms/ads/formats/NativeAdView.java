package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzpu;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NativeAdView extends FrameLayout {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final FrameLayout f2559;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzpu f2560;

    public NativeAdView(Context context) {
        super(context);
        this.f2559 = m1196(context);
        this.f2560 = m1197();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2559 = m1196(context);
        this.f2560 = m1197();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2559 = m1196(context);
        this.f2560 = m1197();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2559 = m1196(context);
        this.f2560 = m1197();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f2559);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f2559;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        try {
            this.f2560.destroy();
        } catch (RemoteException e) {
            zzakb.zzb("Unable to destroy native ad view", e);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View m1199 = m1199(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (m1199 instanceof AdChoicesView) {
            return (AdChoicesView) m1199;
        }
        return null;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzpu zzpuVar = this.f2560;
        if (zzpuVar != null) {
            try {
                zzpuVar.zzb(new BinderC2454(view), i);
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f2559);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f2559 == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        m1198(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.f2560.zza((InterfaceC2455) nativeAd.zzbl());
        } catch (RemoteException e) {
            zzakb.zzb("Unable to call setNativeAd on delegate", e);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final FrameLayout m1196(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzpu m1197() {
        C1687.m3726(this.f2559, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzkb.zzib().zza(this.f2559.getContext(), this, this.f2559);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1198(String str, View view) {
        try {
            this.f2560.zzb(str, new BinderC2454(view));
        } catch (RemoteException e) {
            zzakb.zzb("Unable to call setAssetView on delegate", e);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final View m1199(String str) {
        try {
            InterfaceC2455 zzal = this.f2560.zzal(str);
            if (zzal != null) {
                return (View) BinderC2454.m4502(zzal);
            }
            return null;
        } catch (RemoteException e) {
            zzakb.zzb("Unable to call getAssetView on delegate", e);
            return null;
        }
    }
}
