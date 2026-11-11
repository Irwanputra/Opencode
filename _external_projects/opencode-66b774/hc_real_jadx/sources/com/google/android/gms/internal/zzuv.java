package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzuv implements Runnable {
    private /* synthetic */ zzuo zzcfj;

    public zzuv(zzuu zzuuVar, zzuo zzuoVar) {
        this.zzcfj = zzuoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzcfj.zzcet.destroy();
        } catch (RemoteException e) {
            zzakb.zzc("Could not destroy mediation adapter.", e);
        }
    }
}
