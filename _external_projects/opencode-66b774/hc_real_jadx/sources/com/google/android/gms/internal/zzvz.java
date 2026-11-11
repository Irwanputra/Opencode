package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvz implements Runnable {
    private /* synthetic */ zzvx zzcfx;

    public zzvz(zzvx zzvxVar) {
        this.zzcfx = zzvxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzvd zzvdVar;
        try {
            zzvdVar = this.zzcfx.zzcfp;
            zzvdVar.onAdOpened();
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAdOpened.", e);
        }
    }
}
