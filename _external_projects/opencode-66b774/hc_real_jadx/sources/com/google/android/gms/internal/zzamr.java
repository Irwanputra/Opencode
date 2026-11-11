package com.google.android.gms.internal;

import android.os.Handler;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamr implements Runnable {
    private boolean zzayv = false;
    private zzamd zzdjq;

    public zzamr(zzamd zzamdVar) {
        this.zzdjq = zzamdVar;
    }

    private final void zzsp() {
        Handler handler = zzahn.zzdaw;
        handler.removeCallbacks(this);
        handler.postDelayed(this, 250L);
    }

    public final void pause() {
        this.zzayv = true;
    }

    public final void resume() {
        this.zzayv = false;
        zzsp();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzayv) {
            return;
        }
        this.zzdjq.zzrx();
        zzsp();
    }
}
