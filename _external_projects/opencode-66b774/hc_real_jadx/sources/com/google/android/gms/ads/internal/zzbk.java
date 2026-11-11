package com.google.android.gms.ads.internal;

import android.os.Handler;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbk {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Handler f2729;

    public zzbk(Handler handler) {
        this.f2729 = handler;
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.f2729.postDelayed(runnable, j);
    }

    public final void removeCallbacks(Runnable runnable) {
        this.f2729.removeCallbacks(runnable);
    }
}
