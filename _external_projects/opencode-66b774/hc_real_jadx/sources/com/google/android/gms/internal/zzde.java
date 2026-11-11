package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzde implements zzdi {
    private /* synthetic */ Activity val$activity;

    public zzde(zzda zzdaVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.zzdi
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.val$activity);
    }
}
