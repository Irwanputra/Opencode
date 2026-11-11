package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zze implements Runnable {
    private /* synthetic */ zzr zzn;
    private /* synthetic */ zzd zzo;

    public zze(zzd zzdVar, zzr zzrVar) {
        this.zzo = zzdVar;
        this.zzn = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzo.zzi.put(this.zzn);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
