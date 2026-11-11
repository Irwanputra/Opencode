package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaob implements Runnable {
    private /* synthetic */ Map zzanb;
    private /* synthetic */ zzaoa zzdng;

    public zzaob(zzaoa zzaoaVar, Map map) {
        this.zzdng = zzaoaVar;
        this.zzanb = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamp zzampVar;
        zzampVar = this.zzdng.zzdhj;
        zzampVar.zza("pubVideoCmd", this.zzanb);
    }
}
