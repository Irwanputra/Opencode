package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbs;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzacd implements Runnable {
    private /* synthetic */ zzaat zzcro;
    private /* synthetic */ zzabe zzcrp;
    private /* synthetic */ zzacb zzcrq;

    public zzacd(zzacb zzacbVar, zzaat zzaatVar, zzabe zzabeVar) {
        this.zzcrq = zzacbVar;
        this.zzcro = zzaatVar;
        this.zzcrp = zzabeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaax zzaaxVar;
        try {
            zzaaxVar = this.zzcrq.zzb(this.zzcro);
        } catch (Exception e) {
            zzbs.zzem().zza(e, "AdRequestServiceImpl.loadAdAsync");
            zzakb.zzc("Could not fetch ad response due to an Exception.", e);
            zzaaxVar = null;
        }
        if (zzaaxVar == null) {
            zzaaxVar = new zzaax(0);
        }
        try {
            this.zzcrp.zza(zzaaxVar);
        } catch (RemoteException e2) {
            zzakb.zzc("Fail to forward ad response.", e2);
        }
    }
}
