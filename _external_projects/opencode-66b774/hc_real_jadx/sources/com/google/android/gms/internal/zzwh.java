package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzwh implements Runnable {
    private /* synthetic */ zzvx zzcfx;
    private /* synthetic */ AdRequest.ErrorCode zzcfy;

    public zzwh(zzvx zzvxVar, AdRequest.ErrorCode errorCode) {
        this.zzcfx = zzvxVar;
        this.zzcfy = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzvd zzvdVar;
        try {
            zzvdVar = this.zzcfx.zzcfp;
            zzvdVar.onAdFailedToLoad(zzwj.zza(this.zzcfy));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdFailedToLoad.", e);
        }
    }
}
