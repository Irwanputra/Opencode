package com.google.android.gms.internal;

import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzn implements zzaki<zzanh> {
    private /* synthetic */ String val$message;
    private /* synthetic */ JSONObject zzcmd;

    public zzzn(zzzf zzzfVar, String str, JSONObject jSONObject) {
        this.val$message = str;
        this.zzcmd = jSONObject;
    }

    @Override // com.google.android.gms.internal.zzaki
    public final /* synthetic */ void onSuccess(zzanh zzanhVar) {
        zzanhVar.zza(this.val$message, this.zzcmd);
    }

    @Override // com.google.android.gms.internal.zzaki
    public final void zzb(Throwable th) {
    }
}
