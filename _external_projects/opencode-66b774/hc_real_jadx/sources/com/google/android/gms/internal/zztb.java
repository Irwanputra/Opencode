package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zztb implements Runnable {
    private /* synthetic */ zztc zzbzi;
    private /* synthetic */ zztd zzbzj;

    public zztb(zzse zzseVar, zztc zztcVar, zztd zztdVar) {
        this.zzbzi = zztcVar;
        this.zzbzj = zztdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbzi.zzb(this.zzbzj);
        } catch (RemoteException e) {
            zzakb.zzc("Could not propagate interstitial ad event.", e);
        }
    }
}
