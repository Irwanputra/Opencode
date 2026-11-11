package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzom implements Runnable {
    private /* synthetic */ zzol zzbuj;

    public zzom(zzol zzolVar) {
        this.zzbuj = zzolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzos zzosVar;
        zzos zzosVar2;
        zzos zzosVar3;
        zzosVar = this.zzbuj.zzbuf;
        if (zzosVar != null) {
            zzosVar2 = this.zzbuj.zzbuf;
            zzosVar2.zzki();
            zzosVar3 = this.zzbuj.zzbuf;
            zzosVar3.zzkh();
        }
        zzol.zza(this.zzbuj, null);
    }
}
