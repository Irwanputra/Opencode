package com.google.android.gms.internal;

import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzgi implements zzalk<com.google.android.gms.ads.internal.js.zzaj> {
    private /* synthetic */ JSONObject zzaxe;

    public zzgi(zzgf zzgfVar, JSONObject jSONObject) {
        this.zzaxe = jSONObject;
    }

    @Override // com.google.android.gms.internal.zzalk
    public final /* synthetic */ void zzf(com.google.android.gms.ads.internal.js.zzaj zzajVar) {
        zzajVar.zzb("AFMA_updateActiveView", this.zzaxe);
    }
}
