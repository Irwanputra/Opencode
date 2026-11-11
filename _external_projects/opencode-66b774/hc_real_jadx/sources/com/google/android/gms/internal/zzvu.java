package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import java.util.ArrayList;
import java.util.List;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvu extends zzvn {
    private final NativeContentAdMapper zzcft;

    public zzvu(NativeContentAdMapper nativeContentAdMapper) {
        this.zzcft = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.zzvm
    public final String getAdvertiser() {
        return this.zzcft.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final String getBody() {
        return this.zzcft.getBody();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final String getCallToAction() {
        return this.zzcft.getCallToAction();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final Bundle getExtras() {
        return this.zzcft.getExtras();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final String getHeadline() {
        return this.zzcft.getHeadline();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final List getImages() {
        List<NativeAd.Image> images = this.zzcft.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzoi(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.zzvm
    public final boolean getOverrideClickHandling() {
        return this.zzcft.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final boolean getOverrideImpressionRecording() {
        return this.zzcft.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final zzll getVideoController() {
        if (this.zzcft.getVideoController() != null) {
            return this.zzcft.getVideoController().zzbj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzvm
    public final void recordImpression() {
        this.zzcft.recordImpression();
    }

    @Override // com.google.android.gms.internal.zzvm
    public final void zzh(InterfaceC2455 interfaceC2455) {
        this.zzcft.handleClick((View) BinderC2454.m4502(interfaceC2455));
    }

    @Override // com.google.android.gms.internal.zzvm
    public final void zzi(InterfaceC2455 interfaceC2455) {
        this.zzcft.trackView((View) BinderC2454.m4502(interfaceC2455));
    }

    @Override // com.google.android.gms.internal.zzvm
    public final void zzj(InterfaceC2455 interfaceC2455) {
        this.zzcft.untrackView((View) BinderC2454.m4502(interfaceC2455));
    }

    @Override // com.google.android.gms.internal.zzvm
    public final InterfaceC2455 zzjx() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzvm
    public final zzpm zzjy() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzvm
    public final zzpq zzjz() {
        NativeAd.Image logo = this.zzcft.getLogo();
        if (logo != null) {
            return new zzoi(logo.getDrawable(), logo.getUri(), logo.getScale());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzvm
    public final InterfaceC2455 zzmk() {
        View adChoicesContent = this.zzcft.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new BinderC2454(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.zzvm
    public final InterfaceC2455 zzml() {
        View zzul = this.zzcft.zzul();
        if (zzul == null) {
            return null;
        }
        return new BinderC2454(zzul);
    }
}
