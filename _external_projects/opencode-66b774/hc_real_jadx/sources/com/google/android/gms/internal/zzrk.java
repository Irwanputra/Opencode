package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzrk extends zzqr {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzbwn;

    public zzrk(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzbwn = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.zzqq
    public final void zza(zzqe zzqeVar) {
        this.zzbwn.onAppInstallAdLoaded(new zzqh(zzqeVar));
    }
}
