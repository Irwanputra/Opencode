package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmf implements Runnable {
    private /* synthetic */ zzme zzbgs;

    public zzmf(zzme zzmeVar) {
        this.zzbgs = zzmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkh zzkhVar;
        zzkh zzkhVar2;
        zzkhVar = this.zzbgs.zzbgr.zzape;
        if (zzkhVar != null) {
            try {
                zzkhVar2 = this.zzbgs.zzbgr.zzape;
                zzkhVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzakb.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
