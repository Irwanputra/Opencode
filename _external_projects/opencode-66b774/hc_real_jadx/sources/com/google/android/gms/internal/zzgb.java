package com.google.android.gms.internal;

import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzgb implements zzgo {
    private final zzft zzawt;
    private final zzanh zzawu;
    private final com.google.android.gms.ads.internal.gmsg.zzt<zzanh> zzawv;
    private final com.google.android.gms.ads.internal.gmsg.zzt<zzanh> zzaww;
    private final com.google.android.gms.ads.internal.gmsg.zzt<zzanh> zzawx;

    public zzgb(zzft zzftVar, zzanh zzanhVar) {
        zzgc zzgcVar = new zzgc(this);
        this.zzawv = zzgcVar;
        zzgd zzgdVar = new zzgd(this);
        this.zzaww = zzgdVar;
        zzge zzgeVar = new zzge(this);
        this.zzawx = zzgeVar;
        this.zzawt = zzftVar;
        this.zzawu = zzanhVar;
        zzanhVar.zza("/updateActiveView", zzgcVar);
        zzanhVar.zza("/untrackActiveViewUnit", zzgdVar);
        zzanhVar.zza("/visibilityChanged", zzgeVar);
        String valueOf = String.valueOf(zzftVar.zzavw.zzfu());
        zzakb.zzbx(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.zzgo
    public final void zzb(JSONObject jSONObject, boolean z) {
        if (z) {
            this.zzawt.zzb(this);
        } else {
            this.zzawu.zzb("AFMA_updateActiveView", jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.zzgo
    public final boolean zzgg() {
        return true;
    }

    @Override // com.google.android.gms.internal.zzgo
    public final void zzgh() {
        zzanh zzanhVar = this.zzawu;
        zzanhVar.zzb("/visibilityChanged", this.zzawx);
        zzanhVar.zzb("/untrackActiveViewUnit", this.zzaww);
        zzanhVar.zzb("/updateActiveView", this.zzawv);
    }
}
