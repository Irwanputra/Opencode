package com.google.android.gms.internal;

import com.google.android.gms.ads.VideoController;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlw extends zzkd {
    private /* synthetic */ zzlv zzbgk;

    public zzlw(zzlv zzlvVar) {
        this.zzbgk = zzlvVar;
    }

    @Override // com.google.android.gms.internal.zzkd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i) {
        VideoController videoController;
        videoController = this.zzbgk.zzbgd;
        videoController.zza(this.zzbgk.zzbj());
        super.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.zzkd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zzbgk.zzbgd;
        videoController.zza(this.zzbgk.zzbj());
        super.onAdLoaded();
    }
}
