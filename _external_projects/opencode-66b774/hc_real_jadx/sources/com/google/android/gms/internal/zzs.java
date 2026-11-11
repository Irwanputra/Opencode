package com.google.android.gms.internal;

import com.google.android.gms.internal.zzae;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzs implements Runnable {
    private /* synthetic */ String zzat;
    private /* synthetic */ long zzau;
    private /* synthetic */ zzr zzav;

    public zzs(zzr zzrVar, String str, long j) {
        this.zzav = zzrVar;
        this.zzat = str;
        this.zzau = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzae.zza zzaVar;
        zzae.zza zzaVar2;
        zzaVar = this.zzav.zzaf;
        zzaVar.zza(this.zzat, this.zzau);
        zzaVar2 = this.zzav.zzaf;
        zzaVar2.zzc(toString());
    }
}
