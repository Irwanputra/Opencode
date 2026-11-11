package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzsh implements zztc {
    private /* synthetic */ int zzbze;

    public zzsh(zzsf zzsfVar, int i) {
        this.zzbze = i;
    }

    @Override // com.google.android.gms.internal.zztc
    public final void zzb(zztd zztdVar) {
        zzkh zzkhVar = zztdVar.zzape;
        if (zzkhVar != null) {
            zzkhVar.onAdFailedToLoad(this.zzbze);
        }
    }
}
