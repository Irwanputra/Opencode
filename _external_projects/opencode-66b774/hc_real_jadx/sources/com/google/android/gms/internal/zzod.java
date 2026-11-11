package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzod extends zzob {
    private final OnCustomRenderedAdLoadedListener zzbgh;

    public zzod(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzbgh = onCustomRenderedAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.zzoa
    public final void zza(zznx zznxVar) {
        this.zzbgh.onCustomRenderedAdLoaded(new zznw(zznxVar));
    }
}
