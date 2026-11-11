package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import p131.p161.p162.p193.p205.p208.InterfaceC2496;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzih implements InterfaceC2496 {
    private /* synthetic */ zzid zzbaw;

    public zzih(zzid zzidVar) {
        this.zzbaw = zzidVar;
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2496
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzik zzikVar;
        Object obj2;
        obj = this.zzbaw.mLock;
        synchronized (obj) {
            this.zzbaw.zzbav = null;
            zzikVar = this.zzbaw.zzbau;
            if (zzikVar != null) {
                zzid.zza(this.zzbaw, (zzik) null);
            }
            obj2 = this.zzbaw.mLock;
            obj2.notifyAll();
        }
    }
}
