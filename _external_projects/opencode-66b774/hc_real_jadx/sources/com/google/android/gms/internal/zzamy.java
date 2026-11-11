package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamy implements Runnable {
    private /* synthetic */ zzamx zzdjy;

    public zzamy(zzamx zzamxVar) {
        this.zzdjy = zzamxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbs.zzfb().zzb(this.zzdjy);
    }
}
