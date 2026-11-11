package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamf implements Runnable {
    private /* synthetic */ zzamd zzdhh;

    public zzamf(zzamd zzamdVar) {
        this.zzdhh = zzamdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdhh.zza("surfaceDestroyed", new String[0]);
    }
}
