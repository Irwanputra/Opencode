package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpb implements com.google.android.gms.ads.internal.gmsg.zzt<Object> {
    private /* synthetic */ zzzb zzbva;
    private /* synthetic */ zzoy zzbvb;

    public zzpb(zzoy zzoyVar, zzzb zzzbVar) {
        this.zzbvb = zzoyVar;
        this.zzbva = zzzbVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        WeakReference weakReference;
        weakReference = this.zzbvb.zzbuy;
        Object obj2 = (zzanh) weakReference.get();
        if (obj2 == null) {
            this.zzbva.zzb("/showOverlay", this);
        } else {
            ((View) obj2).setVisibility(0);
        }
    }
}
