package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhh implements Application.ActivityLifecycleCallbacks {
    private Activity mActivity;
    private Context mContext;
    private Runnable zzayy;
    private long zzayz;
    private final Object mLock = new Object();
    private boolean zzayu = true;
    private boolean zzayv = false;
    private final List<zzhj> zzayw = new ArrayList();
    private final List<zzhw> zzayx = new ArrayList();
    private boolean zzare = false;

    private final void setActivity(Activity activity) {
        synchronized (this.mLock) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.mActivity = activity;
            }
        }
    }

    public static /* synthetic */ boolean zza(zzhh zzhhVar, boolean z) {
        zzhhVar.zzayu = false;
        return false;
    }

    public final Activity getActivity() {
        return this.mActivity;
    }

    public final Context getContext() {
        return this.mContext;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.mLock) {
            Activity activity2 = this.mActivity;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.mActivity = null;
            }
            Iterator<zzhw> it = this.zzayx.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().zza(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    zzbs.zzem().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzakb.zzb("onActivityStateChangedListener threw exception.", e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.mLock) {
            Iterator<zzhw> it = this.zzayx.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.zzayv = true;
        Runnable runnable = this.zzayy;
        if (runnable != null) {
            zzahn.zzdaw.removeCallbacks(runnable);
        }
        Handler handler = zzahn.zzdaw;
        zzhi zzhiVar = new zzhi(this);
        this.zzayy = zzhiVar;
        handler.postDelayed(zzhiVar, this.zzayz);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzayv = false;
        boolean z = !this.zzayu;
        this.zzayu = true;
        Runnable runnable = this.zzayy;
        if (runnable != null) {
            zzahn.zzdaw.removeCallbacks(runnable);
        }
        synchronized (this.mLock) {
            Iterator<zzhw> it = this.zzayx.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                Iterator<zzhj> it2 = this.zzayw.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().zzg(true);
                    } catch (Exception e) {
                        zzakb.zzb("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                zzakb.zzbx("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzare) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            setActivity((Activity) context);
        }
        this.mContext = application;
        this.zzayz = ((Long) zzkb.zzif().zzd(zznh.zzblf)).longValue();
        this.zzare = true;
    }

    public final void zza(zzhj zzhjVar) {
        synchronized (this.mLock) {
            this.zzayw.add(zzhjVar);
        }
    }
}
