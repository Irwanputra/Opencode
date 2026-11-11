package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzaan implements zzaal, zzaif<Void> {
    private final Object mLock = new Object();
    private final zzalh<zzaat> zzcmw;
    private final zzaal zzcmx;

    public zzaan(zzalh<zzaat> zzalhVar, zzaal zzaalVar) {
        this.zzcmw = zzalhVar;
        this.zzcmx = zzaalVar;
    }

    @Override // com.google.android.gms.internal.zzaif
    public final void cancel() {
        zznk();
    }

    @Override // com.google.android.gms.internal.zzaal
    public final void zza(zzaax zzaaxVar) {
        synchronized (this.mLock) {
            this.zzcmx.zza(zzaaxVar);
            zznk();
        }
    }

    public final boolean zza(zzabb zzabbVar, zzaat zzaatVar) {
        try {
            zzabbVar.zza(zzaatVar, new zzaaw(this));
            return true;
        } catch (Throwable th) {
            zzakb.zzc("Could not fetch ad response from ad request service due to an Exception.", th);
            zzbs.zzem().zza(th, "AdRequestClientTask.getAdResponseFromService");
            this.zzcmx.zza(new zzaax(0));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.zzaif
    public final /* synthetic */ Void zznd() {
        zzabb zznl = zznl();
        if (zznl != null) {
            this.zzcmw.zza(new zzaao(this, zznl), new zzaap(this));
            return null;
        }
        this.zzcmx.zza(new zzaax(0));
        zznk();
        return null;
    }

    public abstract void zznk();

    public abstract zzabb zznl();
}
