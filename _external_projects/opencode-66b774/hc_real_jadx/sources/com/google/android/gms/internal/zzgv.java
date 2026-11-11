package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzgv implements zzhc {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ Bundle zzail;

    public zzgv(zzgu zzguVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzail = bundle;
    }

    @Override // com.google.android.gms.internal.zzhc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzail);
    }
}
