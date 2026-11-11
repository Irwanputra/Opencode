package com.google.android.gms.internal;

import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabq implements Runnable {
    private /* synthetic */ zzabo zzcqn;
    public final /* synthetic */ JSONObject zzcqo;
    public final /* synthetic */ String zzcqp;

    public zzabq(zzabo zzaboVar, JSONObject jSONObject, String str) {
        this.zzcqn = zzaboVar;
        this.zzcqo = jSONObject;
        this.zzcqp = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.js.zzn zznVar;
        com.google.android.gms.ads.internal.js.zzaa zzaaVar;
        zzabo zzaboVar = this.zzcqn;
        zznVar = zzabo.zzclt;
        zzaboVar.zzcqm = zznVar.zzb(null);
        zzaaVar = this.zzcqn.zzcqm;
        zzaaVar.zza(new zzabr(this), new zzabs(this));
    }
}
