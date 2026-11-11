package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzakk implements zzaki {
    private /* synthetic */ String zzden;

    public zzakk(String str) {
        this.zzden = str;
    }

    @Override // com.google.android.gms.internal.zzaki
    public final void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.internal.zzaki
    public final void zzb(Throwable th) {
        zzbs.zzem().zza(th, this.zzden);
    }
}
