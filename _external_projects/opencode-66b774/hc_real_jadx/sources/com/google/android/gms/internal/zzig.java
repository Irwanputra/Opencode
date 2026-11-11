package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import p131.p161.p162.p193.p205.p208.InterfaceC2491;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzig implements InterfaceC2491 {
    private /* synthetic */ zzid zzbaw;

    public zzig(zzid zzidVar) {
        this.zzbaw = zzidVar;
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzik zzikVar;
        zzik zzikVar2;
        obj = this.zzbaw.mLock;
        synchronized (obj) {
            try {
                zzikVar = this.zzbaw.zzbau;
                if (zzikVar != null) {
                    zzid zzidVar = this.zzbaw;
                    zzikVar2 = zzidVar.zzbau;
                    zzidVar.zzbav = zzikVar2.zzhk();
                }
            } catch (DeadObjectException e) {
                zzakb.zzb("Unable to obtain a cache service instance.", e);
                this.zzbaw.disconnect();
            }
            obj2 = this.zzbaw.mLock;
            obj2.notifyAll();
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zzbaw.mLock;
        synchronized (obj) {
            this.zzbaw.zzbav = null;
            obj2 = this.zzbaw.mLock;
            obj2.notifyAll();
        }
    }
}
