package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmh implements Runnable {
    private /* synthetic */ zzmg zzbgt;

    public zzmh(zzmg zzmgVar) {
        this.zzbgt = zzmgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkh zzkhVar;
        zzkh zzkhVar2;
        zzkhVar = this.zzbgt.zzape;
        if (zzkhVar != null) {
            try {
                zzkhVar2 = this.zzbgt.zzape;
                zzkhVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzakb.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
