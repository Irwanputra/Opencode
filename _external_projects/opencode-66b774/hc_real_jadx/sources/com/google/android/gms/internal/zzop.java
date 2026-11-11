package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzop implements Runnable {
    private /* synthetic */ zzon zzbun;

    public zzop(zzon zzonVar) {
        this.zzbun = zzonVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzos zzosVar;
        zzos zzosVar2;
        zzos zzosVar3;
        zzosVar = this.zzbun.zzbuf;
        if (zzosVar != null) {
            zzosVar2 = this.zzbun.zzbuf;
            zzosVar2.zzki();
            zzosVar3 = this.zzbun.zzbuf;
            zzosVar3.zzkh();
        }
        zzon.zza(this.zzbun, null);
    }
}
