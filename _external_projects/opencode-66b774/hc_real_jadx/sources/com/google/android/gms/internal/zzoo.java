package com.google.android.gms.internal;

import android.view.MotionEvent;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoo implements zzoq {
    private /* synthetic */ zzon zzbun;

    public zzoo(zzon zzonVar) {
        this.zzbun = zzonVar;
    }

    @Override // com.google.android.gms.internal.zzoq
    public final void zzc(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.zzoq
    public final void zzkb() {
        this.zzbun.performClick(NativeCustomTemplateAd.ASSET_NAME_VIDEO);
    }
}
