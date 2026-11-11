package com.google.android.gms.internal;

import android.content.Context;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlz implements Runnable {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzly zzbgq;

    public zzlz(zzly zzlyVar, Context context) {
        this.zzbgq = zzlyVar;
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbgq.getRewardedVideoAdInstance(this.val$context);
    }
}
