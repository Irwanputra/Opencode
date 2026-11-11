package com.google.android.gms.internal;

import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzst extends zzadq {
    private /* synthetic */ zzse zzbzd;

    public zzst(zzse zzseVar) {
        this.zzbzd = zzseVar;
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdClosed() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsx(this));
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdFailedToLoad(int i) {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzta(this, i));
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdLeftApplication() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsz(this));
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdLoaded() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsu(this));
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdOpened() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsv(this));
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoStarted() {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsw(this));
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void zza(zzadh zzadhVar) {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzsy(this, zzadhVar));
    }
}
