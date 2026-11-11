package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzok implements Runnable {
    private /* synthetic */ zzoj zzbug;

    public zzok(zzoj zzojVar) {
        this.zzbug = zzojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzos zzosVar;
        zzos zzosVar2;
        zzos zzosVar3;
        zzosVar = this.zzbug.zzbuf;
        if (zzosVar != null) {
            zzosVar2 = this.zzbug.zzbuf;
            zzosVar2.zzki();
            zzosVar3 = this.zzbug.zzbuf;
            zzosVar3.zzkh();
        }
        zzoj.zza(this.zzbug, null);
    }
}
