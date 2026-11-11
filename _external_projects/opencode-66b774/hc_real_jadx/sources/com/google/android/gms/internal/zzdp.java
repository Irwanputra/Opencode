package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdp implements Runnable {
    private /* synthetic */ zzdm zzaji;

    public zzdp(zzdm zzdmVar) {
        this.zzaji = zzdmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznh.initialize(this.zzaji.zzair);
    }
}
