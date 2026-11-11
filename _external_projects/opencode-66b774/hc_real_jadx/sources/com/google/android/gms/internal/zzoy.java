package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoy {
    private final WeakReference<zzanh> zzbuy;
    private String zzbuz;

    public zzoy(zzanh zzanhVar) {
        this.zzbuy = new WeakReference<>(zzanhVar);
    }

    public final void zza(zzzb zzzbVar) {
        zzzbVar.zza("/loadHtml", new zzoz(this, zzzbVar));
        zzzbVar.zza("/showOverlay", new zzpb(this, zzzbVar));
        zzzbVar.zza("/hideOverlay", new zzpc(this, zzzbVar));
        zzanh zzanhVar = this.zzbuy.get();
        if (zzanhVar != null) {
            zzanhVar.zzsz().zza("/sendMessageToSdk", new zzpd(this, zzzbVar));
        }
    }
}
