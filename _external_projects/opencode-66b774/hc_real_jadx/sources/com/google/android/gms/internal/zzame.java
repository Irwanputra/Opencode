package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzame implements Runnable {
    private /* synthetic */ zzamd zzdhh;

    public zzame(zzamd zzamdVar) {
        this.zzdhh = zzamdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdhh.zza("surfaceCreated", new String[0]);
    }
}
