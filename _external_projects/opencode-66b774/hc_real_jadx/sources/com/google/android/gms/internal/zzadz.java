package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzadz implements Runnable {
    private /* synthetic */ zzjj zzapt;
    private /* synthetic */ zzva zzcvm;
    private /* synthetic */ zzady zzcvn;

    public zzadz(zzady zzadyVar, zzjj zzjjVar, zzva zzvaVar) {
        this.zzcvn = zzadyVar;
        this.zzapt = zzjjVar;
        this.zzcvm = zzvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcvn.zza(this.zzapt, this.zzcvm);
    }
}
