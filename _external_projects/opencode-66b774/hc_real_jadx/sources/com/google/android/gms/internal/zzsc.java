package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import p131.p161.p162.p193.p205.p208.InterfaceC2496;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzsc implements InterfaceC2496 {
    private /* synthetic */ zzrx zzbyu;
    private /* synthetic */ zzalf zzbyv;

    public zzsc(zzrx zzrxVar, zzalf zzalfVar) {
        this.zzbyu = zzrxVar;
        this.zzbyv = zzalfVar;
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2496
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzbyu.mLock;
        synchronized (obj) {
            this.zzbyv.setException(new RuntimeException("Connection failed."));
        }
    }
}
