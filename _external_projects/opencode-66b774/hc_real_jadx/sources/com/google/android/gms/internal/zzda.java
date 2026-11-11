package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzda implements Application.ActivityLifecycleCallbacks {
    private final Application zzaii;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzaij;
    private boolean zzaik = false;

    public zzda(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzaij = new WeakReference<>(activityLifecycleCallbacks);
        this.zzaii = application;
    }

    private final void zza(zzdi zzdiVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzaij.get();
            if (activityLifecycleCallbacks != null) {
                zzdiVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzaik) {
                    return;
                }
                this.zzaii.unregisterActivityLifecycleCallbacks(this);
                this.zzaik = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzdb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzdh(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzde(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzdd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzdg(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzdc(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzdf(this, activity));
    }
}
