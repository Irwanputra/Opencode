package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzha implements zzhc {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ Bundle zzail;

    public zzha(zzgu zzguVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzail = bundle;
    }

    @Override // com.google.android.gms.internal.zzhc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzail);
    }
}
