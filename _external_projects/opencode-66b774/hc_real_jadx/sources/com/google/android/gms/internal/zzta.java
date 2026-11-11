package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzta implements zztc {
    private /* synthetic */ int zzbze;

    public zzta(zzst zzstVar, int i) {
        this.zzbze = i;
    }

    @Override // com.google.android.gms.internal.zztc
    public final void zzb(zztd zztdVar) {
        zzadp zzadpVar = zztdVar.zzbzn;
        if (zzadpVar != null) {
            zzadpVar.onRewardedVideoAdFailedToLoad(this.zzbze);
        }
    }
}
