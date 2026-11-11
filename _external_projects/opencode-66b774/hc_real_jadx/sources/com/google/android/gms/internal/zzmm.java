package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmm implements Runnable {
    private /* synthetic */ zzml zzbgv;

    public zzmm(zzml zzmlVar) {
        this.zzbgv = zzmlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzadp zzadpVar;
        zzadp zzadpVar2;
        zzadpVar = this.zzbgv.zzbgu;
        if (zzadpVar != null) {
            try {
                zzadpVar2 = this.zzbgv.zzbgu;
                zzadpVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzakb.zzc("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
