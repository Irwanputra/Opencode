package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzgu implements Application.ActivityLifecycleCallbacks {
    private final Application zzaxg;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzaxy;
    private boolean zzaxz = false;

    public zzgu(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzaxy = new WeakReference<>(activityLifecycleCallbacks);
        this.zzaxg = application;
    }

    private final void zza(zzhc zzhcVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzaxy.get();
            if (activityLifecycleCallbacks != null) {
                zzhcVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzaxz) {
                    return;
                }
                this.zzaxg.unregisterActivityLifecycleCallbacks(this);
                this.zzaxz = true;
            }
        } catch (Exception e) {
            zzakb.zzb("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzgv(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzhb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzgy(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzgx(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzha(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzgw(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzgz(this, activity));
    }
}
