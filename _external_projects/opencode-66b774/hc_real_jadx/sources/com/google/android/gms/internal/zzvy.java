package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvy implements Runnable {
    private /* synthetic */ zzvx zzcfx;

    public zzvy(zzvx zzvxVar) {
        this.zzcfx = zzvxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzvd zzvdVar;
        try {
            zzvdVar = this.zzcfx.zzcfp;
            zzvdVar.onAdClicked();
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdClicked.", e);
        }
    }
}
