package com.google.android.gms.internal;

import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzsf extends zzki {
    private /* synthetic */ zzse zzbzd;

    public zzsf(zzse zzseVar) {
        this.zzbzd = zzseVar;
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdClicked() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsm(this));
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdClosed() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsg(this));
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdFailedToLoad(int i) {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsh(this, i));
        zzagf.v("Pooled interstitial failed to load.");
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdImpression() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsl(this));
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdLeftApplication() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsi(this));
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdLoaded() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsj(this));
        zzagf.v("Pooled interstitial loaded.");
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdOpened() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsk(this));
    }
}
