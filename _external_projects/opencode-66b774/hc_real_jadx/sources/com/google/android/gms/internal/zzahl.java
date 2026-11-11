package com.google.android.gms.internal;

import java.util.concurrent.Future;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzahl implements Runnable {
    private /* synthetic */ zzalf zzbyv;
    private /* synthetic */ Future zzdau;

    public zzahl(zzalf zzalfVar, Future future) {
        this.zzbyv = zzalfVar;
        this.zzdau = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbyv.isCancelled()) {
            this.zzdau.cancel(true);
        }
    }
}
