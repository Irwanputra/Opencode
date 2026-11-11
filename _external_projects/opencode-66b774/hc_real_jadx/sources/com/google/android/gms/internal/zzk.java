package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzk implements Runnable {
    private final zzr zzx;
    private final zzw zzy;
    private final Runnable zzz;

    public zzk(zzi zziVar, zzr zzrVar, zzw zzwVar, Runnable runnable) {
        this.zzx = zzrVar;
        this.zzy = zzwVar;
        this.zzz = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar = this.zzy;
        zzad zzadVar = zzwVar.zzbi;
        if (zzadVar == null) {
            this.zzx.zza((zzr) zzwVar.result);
        } else {
            this.zzx.zzb(zzadVar);
        }
        if (this.zzy.zzbj) {
            this.zzx.zzb("intermediate-response");
        } else {
            this.zzx.zzc("done");
        }
        Runnable runnable = this.zzz;
        if (runnable != null) {
            runnable.run();
        }
    }
}
