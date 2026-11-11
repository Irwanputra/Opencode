package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdc implements zzdi {
    private /* synthetic */ Activity val$activity;

    public zzdc(zzda zzdaVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.zzdi
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.val$activity);
    }
}
