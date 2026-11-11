package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzgw implements zzhc {
    private /* synthetic */ Activity val$activity;

    public zzgw(zzgu zzguVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.zzhc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.val$activity);
    }
}
