package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzie implements Runnable {
    private /* synthetic */ zzid zzbaw;

    public zzie(zzid zzidVar) {
        this.zzbaw = zzidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbaw.disconnect();
    }
}
